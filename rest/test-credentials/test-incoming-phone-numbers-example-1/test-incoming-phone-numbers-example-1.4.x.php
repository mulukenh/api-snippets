<?php
// Get the PHP helper library from https://twilio.com/docs/libraries/php
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; 
$token = "your_auth_token"; 
$client = new Services_Twilio($sid, $token);

$number = $client->account->incoming_phone_numbers->create(array(
        "VoiceUrl" => "http://demo.twilio.com/docs/voice.xml",
    "PhoneNumber" => "+15005550006"
    ));
echo $number->sid;
