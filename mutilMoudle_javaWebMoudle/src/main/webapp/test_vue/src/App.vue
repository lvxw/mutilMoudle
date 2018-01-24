<!--1、模板：html结构-->
<template>
  <div id="app">
    <app-header></app-header>
    <users></users>
    <app-footer></app-footer>
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
    name:'app',
    data(){
      return {

      }
    }
  }
</script>

<!--3、样式：解决样式-->
<style>

</style>
