<!DOCTYPE html>
<html>
<head>
    <title>Bags-4-You</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <style>
        .row {
            height: 64px;
        }

        .row-striped:nth-of-type(odd){
            background-color: #efefef;
        }

        .row-striped:nth-of-type(even){
            background-color: #ffffff;
        }
    </style>

</head>
<body>

<div class="jumbotron">
    <div class="container text-center">
        <h1>Bags-4-You Admin</h1>
    </div>
</div>

<form method="get" action="/admin/new-product" target="_self">
    <div class="row">
        <button type="submit">New Product</button>
    </div>
</form>
<br>
<form method="get" action="/storefront" target="_self">
    <div class="row">
        <button type="submit">View Store</button>
    </div>
</form>

<div class="container-fluid">

    <div class="row align-items-center" style="background-color:gray;">
        <div class="col-sm-1">UPC</div>
        <div class="col-sm-1">Type</div>
        <div class="col-sm-2">Name</div>
        <div class="col-sm-4">Description</div>
        <div class="col-sm-4">Thumbnail</div>
    </div>


    <#list products as product>
        <div class="row row-striped align-items-center">
            <div class="col-sm-1">${product.upc?long?c}</div>
            <div class="col-sm-1">${product.type}</div>
            <div class="col-sm-2">${product.name}</div>
            <div class="col-sm-4">${product.description}</div>
            <div class="col-sm-4">${product.thumbnail}</div>
        </div>
    </#list>
</div>

</body>
</html>