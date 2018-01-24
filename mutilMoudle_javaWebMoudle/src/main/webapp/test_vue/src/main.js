// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
// import Users from './components/Users'

Vue.config.productionTip = false

/* eslint-disable no-new */

// Vue.component("users",Users)

new Vue({
  el: '#app',
  template: '<App/>',
  components: { App }
})


// index.html -> main.js -> App.vue
