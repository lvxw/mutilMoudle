<!--1、模板：html结构-->
<template>
  <div id="app2">
    <app-header v-on:titleChanged="updateTitle($event)" v-bind:title="title"></app-header>
    <users v-bind:users="users"></users>
    <users v-bind:users="users"></users>
    <app-footer v-bind:title="title"></app-footer>
  </div>
</template>

<!--2、行为：处理逻辑-->
<script>
  import Header from "./components/Header";
  import Users from "./components/Users"
  import Footer from "./components/Footer";
  export default {
    components: {
      'app-header':Header,
      'users':Users,
      'app-footer':Footer
    },
    name:'app2',
    data(){
      return {
        users:[
          {name:'zhangsan',position:'web 开发',show:false},
          {name:'lisi',position:'android 开发',show:false},
          {name:'wangwu',position:'IOS 开发',show:false},
          {name:'zhaoli',position:'C++ 开发',show:false},
          {name:'suqi',position:'C# 开发',show:false},
          {name:'wuba',position:'python 开发',show:false},
          {name:'zhujiu',position:'scala 开发',show:false},
          {name:'songshi',position:'C 开发',show:false}
        ],
        title:"【传递的是一个值，string number】"
      }
    },
    methods:{
      updateTitle:function (title) {
        this.title=title
      }
    }
  }
</script>

<!--3、样式：解决样式-->
<style>

</style>
