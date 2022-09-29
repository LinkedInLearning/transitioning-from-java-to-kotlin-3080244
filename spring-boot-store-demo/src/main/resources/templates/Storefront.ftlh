<!DOCTYPE html>
<html>
<head>
    <title>Bags-4-You</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

<div class="jumbotron">
    <div class="container text-center">
        <h1>Bags-4-You</h1>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <#list products as product>
            <div class="col-md-4">
                <div class="panel panel-primary">
                    <div class="panel-heading"><h3>${product.name}</h3></div>
                    <div class="panel-body"><img src=${product.thumbnail} class="img-responsive" style="width:100%" alt="Image"></div>
                    <div class="panel-footer" style="max-height: 10;">
                        <div class="col px-md-5">
                            <div class="p border bg-light"><h4>${product.description}</h4></div>
                            <br>
                            <div class="p border bg-light">${product.displayDetails}</div>
                        </div>
                    </div>
                </div>
            </div>

        </#list>
    </div>
</div>

</body>
</html>