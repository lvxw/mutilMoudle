<template>
  <header>
    <h1>{{title}}</h1>
  </header>
</template>

<script>
  export default {
    name: 'Header',
    data () {
      return {
        title:'this is header'
      }
    }
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
