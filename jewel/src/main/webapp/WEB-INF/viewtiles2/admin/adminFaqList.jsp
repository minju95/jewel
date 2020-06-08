<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


</head>
<body>
    <h2>Faq 목록</h2>
    <table class="board_list">
       
        <thead>
            <tr>
                <th scope="col">FAQ번호</th>
                <th scope="col">FAQ제목</th>
                <th scope="col">FAQ카테고리</th>
                
            </tr>
        </thead>
        <tbody>
             <c:choose>
                <c:when test="${fn:length(list) > 0}">
                    <c:forEach items="${list}" var="row">
                        <tr>
                            <td>${row.FAQ_NUM}</td>                        
                            	
                          
                            
                        
                            <td><a href="adminFaqDetail?FAQ_NUM=${row.FAQ_NUM}">${row.FAQ_TITLE}</a></td>
                                <td> ${row.FAQ_CATE}</td>
                           
                    </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="4">조회된 결과가 없습니다.</td>
                    </tr>
                </c:otherwise>
            </c:choose> 
            
        </tbody>
    </table>
    <div align="center"class="container pt-5" id="categoryPaging" >
   ${AdminFaqListPaging.pagingHTML}
   
   </div>
    <br/>
<input type="button" onclick="location.href='<c:url value="/openAdminFaqWrite"/>'" value="FAQ등록">
     
   
    
</body>
</html>