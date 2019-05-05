<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Echarts-01</title>
    <%--01.引入jquery库--%>
     <script type="text/javascript" src="${pageContext.request.contextPath}/day12ssm/dist/jquery-1.8.3.min.js"></script>
    <%--02.js库--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/day12ssm/dist/echarts.js"></script>
   <script type="text/javascript">
       require.config({
           paths: {
               echarts: '${pageContext.request.contextPath}/day12ssm/dist'
           }
       });
       //自定义函数
       ec();
       function ec() {
           var url = '${pageContext.request.contextPath}/findAllAjax';
           EconfigAPI(url);
       }
       //一个保存图书名称集合数据
       var namelist;
       //价格集合
       var pricelist;

       function EconfigAPI(url) {
           $.ajaxSettings.async = false;  //同步才能获取数据

            //function 就是$.ajax的success
           $.post(url,function(data) { //data 是从Server打到浏览器上的数据
               //还记得后台map集合吗
               namelist=data.namelist;
               pricelist=data.pricelist;
           },"json");//json对象
           require(
               [
                   'echarts',
                   'echarts/chart/line',   // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
                   'echarts/chart/bar',
               ],
               //mine系统给的值
               function (mine) {
                   //将来图像渲染到这个区域
                   var myChart = mine.init(document.getElementById("priceEcharts"),'macarons');
                   //--- 折柱 ---
                   var option ={
                       //控制标题
                       title : {
                           text: '图书价格',
                           subtext:'绝对真实'
                       },
                       grid:{
                           /*  x:40,
                            y:35,
                            x2:20,*/
                           y2:140
                       },
                       tooltip : {
                           trigger: 'axis'
                       },
                       legend: {  //正上方的显示
                           data:['图书价格']
                       },
                       toolbox: {
                           //工具箱是否显示
                           show : true,
                           //具体图标
                           feature : {
                               mark : {show: true},
                               dataView : {show: true, readOnly: false},
                               magicType : {show: true, type: ['line', 'bar','pie']},
                               restore : {show: true},
                               saveAsImage : {show: true}
                           }
                       },
                       calculable : true,
                       xAxis : [
                           {
                               show : true,
                               type : 'category', //固定的，必须写成category
                               data:namelist,  //横坐标数据
                               axisLabel: {
                                   interval: 0,
                                   formatter:function(value) //value指的是横坐标中一项 ：对象值
                                   {
                                       return value.split("").join("\n");
                                   },
                                   //没用的上课  刘老师的css3
                                    rotate:45, //刻度旋转45度角
                                   textStyle:{
                                       color:"blue", //刻度颜色
                                       fontSize:12  //刻度大小
                                   }
                               }
                           }
                       ],

                       yAxis : [
                           {
                               type : 'value',
                               /*splitArea : {show : true}*/
                           }
                       ],
                       series : [
                           {
                               name:'图书价格',
                               type:'bar',
                               data:pricelist //集合：Y轴的数据
                           }
                       ]
                   }
                   myChart.setOption(option);//配置
               });
       }



   </script>
</head>
<body>
<%--我就感觉，不应该--%>
<div id="priceEcharts" style=" width: 800px;height: 500px;"></div>
<fieldset>
    <legend>报表统计</legend>
    <h2>xxx</h2>
</fieldset>
</body>
</html>
