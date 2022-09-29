<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bags-4-You</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<h1>Add New Product</h1>
<#if product?? >
    Created Product:<br>
    UPC: ${product.upc}<br>
    Name: ${product.name}<br>

    <form method="get" action="/admin" target="_self">
        <div class="row">
            <button type="submit">Return to Admin</button>
        </div>
    </form>
    <br>
    <form method="get" action="/storefront" target="_self">
        <div class="row">
            <button type="submit">View Store</button>
        </div>
    </form>

<#else>
    <form action="/admin/new-product" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />

        <div>Upc:</div>
        <input type="number" name="upc"/>
        <br/><br/>

        <div>Name:</div>
        <input type="text" name="name"/>
        <br/><br/>

        <div>Product Type:</div>
        <input type="radio" id="backpack" name="type" value="Backpack">
        <label for="backpack">Backpack</label><br>

        <input type="radio" id="suitcase" name="type" value="Suitcase">
        <label for="suitcase">Suitcase</label><br>

        <input type="radio" id="dufflebag" name="type" value="Dufflebag">
        <label for="dufflebag">Dufflebag</label><br>

        <input type="radio" id="carry-on" name="type" value="Carry-on">
        <label for="carry-on">Carry-on</label><br>
        <br/><br/>

        <div>Message:</div>
        <textarea rows="2" name="description"></textarea>
        <br/><br/>

        <div>Thumbnail:</div>
        <input type="radio" id="carryon1" name="thumbnail" value="images/Carry-on-1.png">
        <label for="carryon1">Carry-on 1</label><br>

        <input type="radio" id="carryon2" name="thumbnail" value="images/Carry-on-2.png">
        <label for="carryon2">Carry-on 2</label><br>

        <input type="radio" id="carryon3" name="thumbnail" value="images/Carry-on-3.png">
        <label for="carryon3">Carry-on 3</label><br>

        <input type="radio" id="dufflebag1" name="thumbnail" value="images/Dufflebag-1.png">
        <label for="dufflebag1">Dufflebag 1</label><br>

        <input type="radio" id="dufflebag2" name="thumbnail" value="images/Dufflebag-2.png">
        <label for="dufflebag2">Dufflebag 2</label><br>

        <input type="radio" id="suitcase1" name="thumbnail" value="images/Suitcase-1.png">
        <label for="suitcase1">Suitcase 1</label><br>

        <input type="radio" id="suitcase2" name="thumbnail" value="images/Suitcase-2.png">
        <label for="suitcase2">Suitcase 2</label><br>

        <input type="radio" id="suitcase3" name="thumbnail" value="images/Suitcase-3.png">
        <label for="suitcase3">Suitcase 3</label><br>

        <input type="radio" id="travel-backpack" name="thumbnail" value="images/Travel-backpack.png">
        <label for="travel-backpack">Travel Backpack</label><br>

        <br/><br/>

        <input type="submit" value="Submit"/>
        <input type="reset" value="Reset"/>
    </form>
</#if>
<script src="/js/main.js"></script>
</body>
</html>