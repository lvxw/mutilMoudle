<template>
  <div class="users">
    <ul>
      <li v-for="user in users" v-on:click="user.show=!user.show">
        <h2>{{user.name}}</h2>
        <h3 v-show="user.show">{{user.position}}</h3>
      </li>
    </ul>

    <button v-on:click="deleteUser">删除</button>
  </div>
</template>

<script>
  export default {
    name:'Users',
//    props:["users"],
    props:{
      users:{
        type:Array,
        required:true
      }
    },
    data(){
      return {

      }
    },
    methods:{
      deleteUser:function () {
        this.users.pop()
      }
    }
  }
</script>

<style>
  .users{
    width: 100%;
    max-width: 1200px;
    margin: 40px auto;
    padding: 0 20px;
    box-sizing: border-box;
  }

  ul{
    display: flex;
    flex-wrap: wrap;
    list-style-type:none ;
    padding: 0;
  }
  li{
    color: rgb(50%,50%,50%);
    flex-grow: 1;
    flex-basis: 200px;
    text-align: center;
    padding: 30px;
    border: 1px solid #222;
    margin: 10px;
  }
</style>
