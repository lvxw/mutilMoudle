<template>
  <footer>
    <h4>{{copyright}}{{title}}</h4>
  </footer>
</template>

<script>
  export default {
    name: 'Footer',
    props:{
      title:{
        type:String,
        required:true
      }
    },
    data () {
      return {
        copyright:'Copyright 2018 Vue demo'
      }
    }
  }
</script>

<style>
  footer{
    background: #222;
    padding: 2px;
  }
  h4{
    color: lightgreen;
    text-align: center;
  }
</style>
