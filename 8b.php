<?php 
$students = [ 
    ['Stu_Name' => 'Emily Clark', 'USN' => '1CG19CS005', 'Sem' => 5], 
    ['Stu_Name' => 'Andrew Smith', 'USN' => '1CG19CS001', 'Sem' => 3], 
    ['Stu_Name' => 'Sarah Doe', 'USN' => '1CG19CS008', 'Sem' => 7], 
    ['Stu_Name' => 'David Lee', 'USN' => '1CG19CS004', 'Sem' => 3], 
    ['Stu_Name' => 'Brian Jones', 'USN' => '1CG19CS002', 'Sem' => 5] 
]; 

function selectionSort(&$array) { 
    $n = count($array); 
    for ($i = 0; $i < $n - 1; $i++) { 
        $minIndex = $i; 
        for ($j = $i + 1; $j < $n; $j++) { 
            if ($array[$j]['Sem'] < $array[$minIndex]['Sem']) { 
                $minIndex = $j; 
            } 
        } 
        if ($minIndex != $i) { 
            $temp = $array[$i]; 
            $array[$i] = $array[$minIndex]; 
            $array[$minIndex] = $temp; 
        } 
    } 
} 

selectionSort($students); 
?> 

<!DOCTYPE html>
<html>
<head>
    <title>Sorted Student Records</title>
</head>
<body>

<h2>Student Records Sorted by Semester</h2>

<table border="1">
    <tr>
        <th>Name</th>
        <th>USN</th>
        <th>Semester</th>
    </tr>

    <?php foreach ($students as $stu): ?>
        <tr>
            <td><?= $stu['Stu_Name'] ?></td>
            <td><?= $stu['USN'] ?></td>
            <td><?= $stu['Sem'] ?></td>
        </tr>
    <?php endforeach; ?>

</table>

</body>
</html>
