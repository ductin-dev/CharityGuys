<?php 
$email_to = "demo@youremail.com"; //Your email will be placed here

if(!empty($_POST['name']) && !empty($_POST['email']) && !empty($_POST['message'])){   
    $name = $_POST['name'];
    $email = $_POST['email']; 
    $website = $_POST['website'];
    $message = $_POST['message'];

    $headers = "From: $email"; 
    $subject = "Message from your website"; 

    $msg = "Sender Name:\t$name\n"; 
    $msg .= "Sender E-Mail:\t$email\n"; 
    $msg .= "Sender Website:\t$website\n"; 
    $msg .= "Message:\t$message\n\n"; 

    $sent = mail($email_to, $subject, $msg, $headers) ; 

    if($sent) {
        header('Location: contact-success.html');
    } else {
        header('Location: contact-error.html');
    }
}else{
    header('Location: contact-error.html');
}