<template>
  {{ hh }}
  <div>
    <h1>shuishui</h1>
  </div>
</template>

<script>
import axios from 'axios'
import { ref } from 'vue';

export default {
  name: 'App',
  components: {
  },
  setup(){

    const hh = ref("s");
    
    console.log("fififififi");
    axios.get("http://localhost:8080/hh")
         .then(function(response){
          hh.value = response.data; 
          
          console.log(response.data)
         })
         console.log("edededed");

    return {
      hh
    }
  }
}
</script>

<style>

</style>
