import { createRouter, createWebHistory } from 'vue-router'
import about from '../views/AboutView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: about,
      hidden: true
    }
  ]
})

export default router
