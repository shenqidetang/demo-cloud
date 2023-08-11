<template>
 <!-- 为 ECharts 准备一个定义了宽高的 DOM -->
 <div id="main" style="width: 600px;height:400px;"></div>
</template>

<style>

</style>
<script setup>
import * as echarts from 'echarts';
import { onMounted } from 'vue'

onMounted(()=>{
    drawLine();
})

function drawLine (){
  var myChart = echarts.init(document.getElementById('main'));
// 基于准备好的dom，初始化echarts实例
// 绘制图表
myChart.setOption({
  title: {
    text: '男女比例',
    left: 'center'
  },
  tooltip: {
    trigger: 'item'
  },
  legend: {
    orient: 'vertical',
    left: 'left'
  },
  series: [
    {
      name: 'Access From',
      type: 'pie',
      radius: '50%',
      data: [
        { value: 484, name: '男' },
        { value: 300, name: '女' }
      ],
      emphasis: {
        itemStyle: {
          shadowBlur: 10,
          shadowOffsetX: 0,
          shadowColor: 'rgba(0, 0, 0, 0.5)'
        }
      }
    }
  ]
});
}
</script>