// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'
import HelloWorld from './components/HelloWorld'
import Home from './components/Home'

// import Users from './components/Users'

Vue.config.productionTip = false
Vue.use(VueRouter)

//配置路由
const router = new VueRouter({
  routers:[
    {path:'/',component:Home},
    {path:"/helloWorld",component:HelloWorld}
  ],
  mode:'history'
})

/* eslint-disable no-new */

// Vue.component("users",Users)

new Vue({
  router,
  el: '#app',
  template: '<App/>',
  components: { App }
})


// index.html -> main.js -> App.vue
