<%-- 
 /**
 * Copyright(C) 2021, DINH PHUONG THAO
 * J3.L.P0017
 * Photographer
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-07-11      1.0                 THAODP           First Implement
 * 2021-07-11      2.0                 THAODP           Second Implement
 */
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
        <title>My Front Page</title>
    </head>
    <body>
        <%!int numberOfcount = 1;%>
        <%!int count = 0;%>
        <div class="container">
            <jsp:include page="common/Header.jsp"/>
            <div class="main">
                <div class="left">
                    <div class="about">
                        <h3>${galery.name}</h3>
                    </div>
                    <c:if test="${error != null}">
                        <h3 style="margin-bottom: 600px"> ${error}</h3>
                    </c:if>
                    <c:if test="${error == null}">
                        <div class="main-img">
                            <div class="imageGaler">
                                <img src="image/${mainImage}" id="imgC" alt="First">
                            </div>
                            <img id="play" class="play" src="image/play.png" alt="ccc"/> 
                        </div>

                        <div class="contentGalery">
                            <ul>

                                <c:if test="${index <= maxPage}">

                                    <c:forEach items="${listImage}" var="o">
                                        <li class="span4">
                                            <a href="GalleryController?index=1&galeryID=${galeryID}&imageChoice=${o.imageUrl}" var="${o.imageUrl}"><img src="image/${o.imageUrl}"></a>
                                                <%count++;%>
                                                <c:if test="${mainImage eq o.imageUrl}">
                                                    <%numberOfcount = count;%>
                                                </c:if>
                                        </li>
                                    </c:forEach>
                                </c:if>
                            </ul>

                            <div class="paging">
                                <c:forEach begin="1" end="${maxPage}" var="i">
                                    <a class="${i==index?"active":""}" href="GalleryController?index=${i}&galeryID=${galeryID}">${i}</a>
                                </c:forEach>
                            </div>
                        </div>
                    </c:if>
                </div>
                <div class="right">
                    <jsp:include page="common/Right.jsp"/>
                </div>
            </div>
        </div>
        <jsp:include page="common/Footer.jsp"/>

        <script>
//            var index=<%= numberOfcount%> ;
            var index=1 ;
            var timeNext;
            var checkChoice = 0;
            changeImage = function () {
                var imgs = [];
            <c:forEach items="${listImage}" var="o">
                imgs.push("${o.imageUrl}");
            </c:forEach>
                document.getElementById('imgC').src = "image/" + imgs[index];
                index++;
                checkChoice = false;
                if (index === imgs.length) {
                    index = 0;
                }
                console.log("image/" + imgs[index]);
            };
            var playing = false;
            var getButton = document.getElementById('play');
            function pause() {
                getButton.src = "image/play.png";
                playing = false;
                clearInterval(timeNext);
            }
            function play() {
                getButton.src = "image/pause.png";
                playing = true;
                timeNext = setInterval(changeImage, 1000);
            }
            getButton.onclick = function () {
                if (playing === true) {
                    pause();
                } else {
                    play();
                }
            };
        </script>
    </body>
</html>
