<template>
  <header v-on:click="changeTitle">
    <h1>{{title1}}{{title}}</h1>
  </header>
</template>

<script>
  export default {
    name: 'Header',
    props:{
      title:{
        type:String,
        required:true
      }
    },
    data () {
      return {
        title1:'this is header'
      }
    },
    methods:{
      changeTitle:function () {
//        this.title=" 【title had change】"
        this.$emit("titleChanged","【 子组件向父组件传值——事件传值】")
      }
    }
    /*beforeCreate:function () {
      alert("组件实例化之前执行的函数")
    },
    created:function () {
      alert("组件实例化完毕，但页面还未显示")
    },
    beforeMount:function () {
      alert("组件挂在前页面仍未展示，但虚拟dom已经配置完")
    },
    mounted:function () {
      alert("此方法执行后，页面显示")
    },
    beforeUpdate:function () {
      alert("组件更新前，页面仍未跟新，但虚拟dom已经配置")
    },
    updated:function () {
      alert("此方法执行后，页面显示")
    }*/
  }
</script>

<style>
  header{
    background: lightgreen;
    padding: 10px;
  }
  h1{
    color: #222;
    text-align: center;
  }
</style>
