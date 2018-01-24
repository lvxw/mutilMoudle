<!--1、模板：html结构-->
<template>
  <div id="app">
    <h1>{{title}}</h1>
  </div>
</template>

<!--2、行为：处理逻辑-->
<script>
  export default {
    name:'app',
    data(){
      return {
        title:'这是我的第一个vue脚手架项目'
      }
    }
  }
</script>

<!--3、样式：解决样式-->
<style>

</style>
