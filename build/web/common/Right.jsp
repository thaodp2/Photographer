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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/right.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="header-right">
            <h4>Share this page</h4>
        </div>
        <div class="social">
            <div>
                <ul>
                    <li><img src="image/${share.iconFace}"><a href="${share.faceUrl}"><span> Share on Facebook</span></a></li>
                    <li><img src="image/${share.iconTwitter}"><a href="${share.twitterUrl}"><span> Share on Twitter</span></a></li>
                    <li><img src="image/${share.iconGoogle}"><a href="${share.googleUrl}"><span> Share on Google</span></a></li>
                </ul>
            </div>

        </div>
    </body>
</html>
