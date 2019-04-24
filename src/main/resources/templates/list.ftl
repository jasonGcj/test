<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"  type="text/css" href="css/css.css">
    <script type="text/javascript"  src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body>
   <table>
       <tr>
           <td><input type="button" value="全选" onclick="qx()"></td>
           <td>007</td>
           <td>郑翼佳</td>
           <td>24</td>
           <td>日期</td>
           <td>旅游路线</td>
           <td>操作</td>
       </tr>
       <#list list as u>
            <tr>
                <td><input type="checkbox" nmae="ids" value="${u.uid}"></td>
                <td>${u.uid}</td>
                <td>${u.uname}</td>
                <td>${u.age}</td>
                <td>${u.date}</td>
                <td>${u.uname}</td>
                <td><input type="button" value="修改" onclick="location='xg?id=${u.uid}"></td>
            </tr>
       </#list>
       <tr>
           <td colspan="11">
               ${page.page}
               ${page.cpage}/${page.pagecount}
           </td>
       </tr>
   </table>
</body>
</html>