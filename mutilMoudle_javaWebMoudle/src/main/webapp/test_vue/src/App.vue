<!--1、模板：html结构-->
<template>
  <div id="app">
    <ul>
      <li><router-link to="/">Home</router-link></li>
    </ul>
    <router-view></router-view>
  </div>
</template>

<!--2、行为：处理逻辑-->
<script>
  export default {
    name:'app2',
    data(){
      return {

      }
    },
    methods:{

    }
  }
</script>

<!--3、样式：解决样式-->
<style>

</style>
