README – Implicit & Explicit Intents Android Application
Aim

Create an Android application which demonstrates both Implicit Intent and Explicit Intent.

📌 Features Implemented
✔ Explicit Intents

Open another specific activity inside the app

Navigate from Login → Home Activity

Passing data between activities

✔ Implicit Intents

Dial a specific number

Open a specific URL in browser

Open Call Log

Open Gallery

Set Alarm

Open Camera

📚 Topics Studied

Intent

Types of Intent

Implicit Intent

Explicit Intent

Intent Constructors

Intent Filters

startActivity()

startActivityForResult()

Bundle

Context

getApplicationContext()

setClass()

putExtra()

getStringExtra()

setType()

🧪 Code Used in the Project
Implicit Intent Examples
// Dial a number
val intent = Intent(Intent.ACTION_DIAL)
intent.data = Uri.parse("tel:7999999999")
startActivity(intent)

// Open URL
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)

// Open Call Log
val intent = Intent(Intent.ACTION_VIEW)
intent.type = CallLog.Calls.CONTENT_TYPE
startActivity(intent)

// Open Gallery
val intent = Intent(Intent.ACTION_PICK)
intent.type = "image/*"
startActivity(intent)

// Open Camera
val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
startActivity(intent)

Explicit Intent Example
val intent = Intent(this, SecondActivity::class.java)
intent.putExtra("email", emailInput.text.toString())
startActivity(intent)

📁 Added Resources

Drawable buttons

Gradient backgrounds

App logo

Custom editText shapes

📱 Activities in the Project

MainActivity – Shows all Implicit Intent buttons

LoginActivity – UI with Email & Password fields

HomeActivity – Opens after Login using Explicit Intent

📷 Output Screens

(Include screenshots exactly like in the final PDF)

Implicit Intents Screen

Login Screen

Home Screen
output:<img width="1288" height="610" alt="image" src="https://github.com/user-attachments/assets/8fd1098e-87a2-4d94-8d02-64b80e3e807f" />
<img width="886" height="561" alt="image" src="https://github.com/user-attachments/assets/ffe4ce00-3d1d-4bdc-a8c5-47c19042b552" />

