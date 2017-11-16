<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Starter</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/adminlte/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/adminlte/bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/adminlte/bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/adminlte/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect. -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/adminlte/dist/css/skins/skin-blue.min.css">

  <!-- Google Font -->
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/adminlte/dist/css/googleFonts.css">
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

  <!-- Main Header -->
  <jsp:include page="common/header.jsp"/>
  <!-- Left side column. contains the logo and sidebar -->
  <jsp:include page="common/sidebar.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">


    <!-- Main content -->
    <section class="content container-fluid">
                 <div class="col-md-3 col-sm-6 col-xs-12">
                                 <div class="info-box">
                                   <span class="info-box-icon bg-aqua"><i class="ion ion-ios-gear-outline"></i></span>
                                   <div class="info-box-content">
                                     <span class="info-box-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">在案企业</font></font></span>
                                     <span class="info-box-number"><font style="vertical-align: inherit;"><font id="zaianqiye" style="vertical-align: inherit;">39067</font></font></span>
                                 </div>
                         </div>
                 </div>
                 <div class="col-md-3 col-sm-6 col-xs-12">
                            <div class="info-box">
                            <span class="info-box-icon bg-red"><i class="fa fa-google-plus"></i></span>
                             <div class="info-box-content">
                             <span class="info-box-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">报检企业</font></font></span>
                             <span class="info-box-number"><font style="vertical-align: inherit;"><font id="baojianqiye" style="vertical-align: inherit;">3443</font></font></span>
                          </div>
                      </div>
                 </div>
                 <div class="col-md-3 col-sm-6 col-xs-12">
                           <div class="info-box">
                               <span class="info-box-icon bg-green"><i class="ion ion-ios-cart-outline"></i></span>
                               <div class="info-box-content">
                                <span class="info-box-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">进口收获企业</font></font></span>
                                <span class="info-box-number"><font style="vertical-align: inherit;"><font id="jinkoushouhuo" style="vertical-align: inherit;">22057</font></font></span>
                          </div>
                        </div>
                 </div>
                 <div class="info-box">
                               <span class="info-box-icon bg-yellow"><i class="ion ion-ios-people-outline"></i></span>
                                <div class="info-box-content">
                               <span class="info-box-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">出口发货企业</font></font></span>
                               <span class="info-box-number"><font style="vertical-align: inherit;"><font id="chukoufahuo" style="vertical-align: inherit;">10652</font></font></span>
                        </div>
                 </div>
                  <div class="col-md-3 col-sm-6 col-xs-12">
                                 <div class="info-box">
                                   <span class="info-box-icon bg-aqua"><i class="ion ion-ios-gear-outline"></i></span>
                                   <div class="info-box-content">
                                     <span class="info-box-text"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">出口生产企业</font></font></span>
                                     <span class="info-box-number"><font style="vertical-align: inherit;"><font id="chukoushengchan" style="vertical-align: inherit;">6506</font></font></span>
                                   </div>
                           </div>
                  </div>
                  <div class="row">
                       <div class="col-md-12" >
                         <div class="panel panel-default" >
                           <div class="panel-body" >
                             <div id="creditBatchMap" style="height:650px;"></div>
                           </div>
                         </div>
                       </div>
                 </div>



    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">
      Anything you want
    </div>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane active" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:;">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:;">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="pull-right-container">
                    <span class="label label-danger pull-right">70%</span>
                  </span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->
      <!-- Stats tab content -->
      <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">General Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Report panel usage
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Some information about this general settings option
            </p>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
  immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
<script src="${pageContext.request.contextPath}/adminlte/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${pageContext.request.contextPath}/adminlte/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/adminlte/dist/js/adminlte.min.js"></script>
<!-- Slimscroll -->
<script src="${pageContext.request.contextPath}/adminlte/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${pageContext.request.contextPath}/adminlte/bower_components/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/echarts/echarts.min.js"></script>
</body>
<script type="application/javascript">
     $.post('${pageContext.request.contextPath}/dashboard/getTestData1.do',null,function (data) {});
     $.post('${pageContext.request.contextPath}/dashboard/getTestData2.do',null,function (data) {});


     $.post('${pageContext.request.contextPath}/dangqianxinyong/getBaojianqiye.do',null,function (data) {
           document.getElementById("baojianqiye").innerText=data;
     });
     $.post('${pageContext.request.contextPath}/dangqianxinyong/getZaianqiye.do',null,function (data) {
            document.getElementById("zaianqiye").innerText=data;
     });
     $.post('${pageContext.request.contextPath}/dangqianxinyong/getJinkoushouhuoqiye.do',null,function (data) {
             document.getElementById("jinkoushouhuo").innerText=data;
     });
     $.post('${pageContext.request.contextPath}/dangqianxinyong/getChukoufahuoqiye.do',null,function (data) {
             document.getElementById("chukoufahuo").innerText=data;
     });
     $.post('${pageContext.request.contextPath}/dangqianxinyong/getChukoushengchanqiye.do',null,function (data) {
             document.getElementById("chukoushengchan").innerText=data;
     });
      $.post('${pageContext.request.contextPath}/dangqianxinyong/getDangqianxinyong.do',null,
          function (data) {
                         if (data){
                             var creditBatchMapOption = {
                               	    title : {
                               	        text: '企业当前信用分值和报检不合格批次分布',
                               	    },
                               	    grid: {
                               	        left: '3%',
                               	        right: '7%',
                               	        bottom: '3%',
                               	        containLabel: true
                               	    },
                               	    tooltip : {
                               	        // trigger: 'axis',
                               	        showDelay : 0,
                               	        formatter : function (params) {
                               	            if (params.value.length > 1) {
                               	                return params.seriesName + '<br/>'
                               	              + '信用分值:'+ params.value[0] + '<br>'
                               	              + '报检不合格批次:'+ params.value[1]+ '<br>'
                               	              + '报检单位:' + params.name;
                               	            }
                               	            else {
                               	                return params.seriesName + ' :<br/>'
                               	                + params.name + ' : '
                               	                + params.value;
                               	            }
                               	        },
                               	        axisPointer:{
                               	            show: true,
                               	            type : 'cross',
                               	            lineStyle: {
                               	                type : 'dashed',
                               	                width : 1
                               	            }
                               	        }
                               	    },
                               	    toolbox: {
                               	        feature: {
                               	            dataZoom: {},
                               	            brush: {
                               	                type: ['rect', 'polygon', 'clear']
                               	            }
                               	        }
                               	    },
                               	    brush: {
                               	    },
                               	    legend: {
                               	        data: ['信用等级A','信用等级B','信用等级C','信用等级D','信用等级AA','汇总'],
                               	        left: 'center',
                               	        top: '3%'
                               	    },
                               	    xAxis : [
                               	        {
                               	            name : '信用分值',
                               	            type : 'value',
                               	            scale:true,
                               	            axisLabel : {
                               	                formatter: '{value}'
                               	            },
                               	            splitLine: {
                               	                show: false
                               	            }
                               	        }
                               	    ],
                               	    yAxis : [
                               	        {
                               	            name : '报检不合格批次',
                               	            type : 'value',
                               	            scale:true,
                               	            axisLabel : {
                               	                formatter: '{value}'
                               	            },
                               	            splitLine: {
                               	                show: false
                               	            }
                               	        }
                               	    ],
                               	    series : [
                               	                     {
                                                   	            name:'信用等级AA',
                                                   	            type:'scatter',
                                                   	            data: data.AA,
                                                   	            markArea: {
                                                   	                silent: true,
                                                   	                itemStyle: {
                                                   	                    normal: {
                                                   	                        color: 'transparent',
                                                   	                        borderWidth: 1,
                                                   	                        borderType: 'dashed'
                                                   	                    }
                                                   	                },
                                                   	                data: [[{
                                                   	                    name: '信用等级AA分布区间',
                                                   	                    xAxis: 'min',
                                                   	                    yAxis: 'min'
                                                   	                }, {
                                                   	                    xAxis: 'max',
                                                   	                    yAxis: 'max'
                                                   	                }]]
                                                   	            },
                                                   	            markPoint : {
                                                   	                data : [
                                                   	                    {type : 'max', name: '最大值'},
                                                   	                    {type : 'min', name: '最小值'}
                                                   	                ]
                                                   	            },
                                                   	            markLine : {
                                                   	                lineStyle: {
                                                   	                    normal: {
                                                   	                        type: 'solid'
                                                   	                    }
                                                   	                },
                                                   	                data : [
                                                   	                     {type : 'average', name: '平均值',valueIndex:0},
                                                                         {type : 'average', name: '平均值',valueIndex:1}
                                                   	                ]
                                                   	            }
                                                   	        },

                               	        {
                               	            name:'信用等级A',
                               	            type:'scatter',
                               	            data: data.A,
                               	            markArea: {
                               	                silent: true,
                               	                itemStyle: {
                               	                    normal: {
                               	                        color: 'transparent',
                               	                        borderWidth: 1,
                               	                        borderType: 'dashed'
                               	                    }
                               	                },
                               	                data: [[{
                               	                    name: '信用等级A分布区间',
                               	                    xAxis: 'min',
                               	                    yAxis: 'min'
                               	                }, {
                               	                    xAxis: 'max',
                               	                    yAxis: 'max'
                               	                }]]
                               	            },
                               	            markPoint : {
                               	                data : [
                               	                    {type : 'max', name: '最大值'},
                               	                    {type : 'min', name: '最小值'}
                               	                ]
                               	            },
                               	            markLine : {
                               	                lineStyle: {
                               	                    normal: {
                               	                        type: 'solid'
                               	                    }
                               	                },
                               	                data : [
                             	                     {type : 'average', name: '平均值',valueIndex:0},
                                                     {type : 'average', name: '平均值',valueIndex:1}
                               	                ]
                               	            }
                               	        },
                               	        {
                               	            name:'信用等级B',
                               	            type:'scatter',
                               	            data: data.B,
                               	            markArea: {
                               	                silent: true,
                               	                itemStyle: {
                               	                    normal: {
                               	                        color: 'transparent',
                               	                        borderWidth: 1,
                               	                        borderType: 'dashed'
                               	                    }
                               	                },
                               	                data: [[{
                               	                    name: '信用等级B分布区间',
                               	                    xAxis: 'min',
                               	                    yAxis: 'min'
                               	                }, {
                               	                    xAxis: 'max',
                               	                    yAxis: 'max'
                               	                }]]
                               	            },
                               	            markPoint : {
                               	                data : [
                               	                    {type : 'max', name: '最大值'},
                               	                    {type : 'min', name: '最小值'}
                               	                ]
                               	            },
                               	            markLine : {
                               	                lineStyle: {
                               	                    normal: {
                               	                        type: 'solid'
                               	                    }
                               	                },
                               	                data : [
                               	                    {type : 'average', name: '平均值',valueIndex:0},
                                                    {type : 'average', name: '平均值',valueIndex:1}
                               	                ]
                               	            }
                               	        },
                               	         {
                                           	            name:'汇总',
                                           	            type:'scatter',
                                           	            data: data.HZ,
                                           	            markArea: {
                                           	                silent: true,
                                           	                itemStyle: {
                                           	                    normal: {
                                           	                        color: 'transparent',
                                           	                        borderWidth: 1,
                                           	                        borderType: 'dashed'
                                           	                    }
                                           	                },
                                           	                data: [[{
                                           	                    name: '汇总分布区间',
                                           	                    xAxis: 'min',
                                           	                    yAxis: 'min'
                                           	                }, {
                                           	                    xAxis: 'max',
                                           	                    yAxis: 'max'
                                           	                }]]
                                           	            },
                                           	            markPoint : {
                                           	                data : [
                                           	                    {type : 'max', name: '最大值'},
                                           	                    {type : 'min', name: '最小值'}
                                           	                ]
                                           	            },
                                           	            markLine : {
                                           	                lineStyle: {
                                           	                    normal: {
                                           	                        type: 'solid'
                                           	                    }
                                           	                },
                                           	                data : [
                                           	                     {type : 'average', name: '平均值',valueIndex:0},
                                                                 {type : 'average', name: '平均值',valueIndex:1}
                                           	                ]
                                           	            }
                                           	        },
                               	         {
                               	            name:'信用等级C',
                               	            type:'scatter',
                               	            data: data.C,
                               	            markArea: {
                               	                silent: true,
                               	                itemStyle: {
                               	                    normal: {
                               	                        color: 'transparent',
                               	                        borderWidth: 1,
                               	                        borderType: 'dashed'
                               	                    }
                               	                },
                               	                data: [[{
                               	                    name: '信用等级C分布区间',
                               	                    xAxis: 'min',
                               	                    yAxis: 'min'
                               	                }, {
                               	                    xAxis: 'max',
                               	                    yAxis: 'max'
                               	                }]]
                               	            },
                               	            markPoint : {
                               	                data : [
                               	                    {type : 'max', name: '最大值'},
                               	                    {type : 'min', name: '最小值'}
                               	                ]
                               	            },
                               	            markLine : {
                               	                lineStyle: {
                               	                    normal: {
                               	                        type: 'solid'
                               	                    }
                               	                },
                               	                data : [
                            	                     {type : 'average', name: '平均值',valueIndex:0},
                                                     {type : 'average', name: '平均值',valueIndex:1}                               	                ]
                               	            }
                               	        },
                               	         {
                               	            name:'信用等级D',
                               	            type:'scatter',
                               	            data: data.D,
                               	            markArea: {
                               	                silent: true,
                               	                itemStyle: {
                               	                    normal: {
                               	                        color: 'transparent',
                               	                        borderWidth: 1,
                               	                        borderType: 'dashed'
                               	                    }
                               	                },
                               	                data: [[{
                               	                    name: '信用等级D分布区间',
                               	                    xAxis: 'min',
                               	                    yAxis: 'min'
                               	                }, {
                               	                    xAxis: 'max',
                               	                    yAxis: 'max'
                               	                }]]
                               	            },
                               	            markPoint : {
                               	                data : [
                               	                    {type : 'max', name: '最大值'},
                               	                    {type : 'min', name: '最小值'}
                               	                ]
                               	            },
                               	            markLine : {
                               	                lineStyle: {
                               	                    normal: {
                               	                        type: 'solid'
                               	                    }
                               	                },
                               	                data : [
                             	                     {type : 'average', name: '平均值',valueIndex:0},
                                                     {type : 'average', name: '平均值',valueIndex:1}
                               	                ]
                               	            }
                               	        }
                               	    ]
                               	};

                             }
                     var creditBatchMapChart = echarts.init(document.getElementById('creditBatchMap'));
                                     creditBatchMapChart.setOption(creditBatchMapOption);
                                     creditBatchMapChart.on('click', function (params) {
                                         openDetailMod(params.value[0],params.value[0]);
                                     });

         },'json');
</script>
</html>