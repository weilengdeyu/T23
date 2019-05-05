<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/day12ssm/dist/jquery-1.11.1.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/echarts-2.2.7/build/dist/echarts.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/echarts-2.2.7/build/dist/dark.js"></script>
    <script type="text/javascript">

        require.config({
            paths: {
                 echarts: '${pageContext.request.contextPath}/echarts-2.2.7/build/dist'
            }
        });
        ec();

        function ec() {
            var url = '${pageContext.request.contextPath}/findAllAjax';
            EconfigAPI(url);
        }
        var namelist;
        var pricelist;
        function EconfigAPI(url){
            $.ajaxSettings.async = false;  //同步才能获取数据
            $.post(url,function(data) {
                namelist=data.namelist;
                pricelist=data.pricelist;
            },"json");
            require(
                [
                    'echarts',
                    'echarts/chart/line',   // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
                    'echarts/chart/bar',
                ],
                //mine系统给的值
                function (mine) {
                    var myChart = mine.init(document.getElementById("priceEcharts"),'macarons');
                    //--- 折柱 ---
                    var option ={
                        title : {
                            text: '图书价格'
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
                        legend: {
                            data:['图书价格']
                        },
                        toolbox: {
                            show : true,
                            feature : {
                                mark : {show: true},
                                dataView : {show: true, readOnly: false},
                                magicType : {show: true, type: ['line', 'bar']},
                                restore : {show: true},
                                saveAsImage : {show: true}
                            }
                        },
                        calculable : true,
                        xAxis : [
                            {
                                show : true,
                                type : 'category',
                                data:namelist,  //8周日期集合
                                axisLabel: {
                                    interval: 0,
                                    formatter:function(value)
                                    {
                                        return value.split("").join("\n");
                                    },
                                   /* rotate:45, //刻度旋转45度角*/
                                    textStyle:{
                                        color:"red", //刻度颜色
                                        fontSize:16  //刻度大小
                                    }
                                }
                            }
                        ],

                        yAxis : [
                            {
                                type : 'value',
                                splitArea : {show : true}
                            }
                        ],
                        series : [
                            {
                                name:'图书价格',
                                type:'bar',
                                data:pricelist //集合：所有8周价格集合
                            }
                        ]
                    }
                    myChart.setOption(option);
                });
        }
    </script>
    <style type="text/css">
        table{
            border-collapse: collapse;
        }
    </style>
</head>
<body>
 <h2>Echarts</h2>
 <div id="priceEcharts" style="/*position: relative; overflow: hidden;*/ width: 800px;
  height: 500px; ">

 </div>
</body>
</html>
