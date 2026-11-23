<?php
$countFile = 'count.txt';
$count = file_exists($countFile) ? (int)file_get_contents($countFile) : 0;
file_put_contents($countFile, ++$count);
?>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visitor Counter</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 40px;
    }
    .count {
        color: #0077cc; /* Change color as you like */
        font-size: 28px;
        font-weight: bold;
    }
</style>
</head>
<body>

<h1>Welcome!</h1>
<p class="count">Total Visitors count: <?= $count ?></p>

</body>
</html>

