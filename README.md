# ActivityYasamDongusu
 Activity yaşam döngüsü yazım ile ilgili olan kodların bulunduğu repo.

•	Uygulama ilk açıldığında:
onCreate()→ onStart() →onResume()

 <img width="463" alt="image" src="https://github.com/ummuhan/ActivityYasamDongusu/assets/40892289/b857e977-0790-4193-b756-a96e43413fb3">


•	Sonraki activity’e geçildiğinde:
onPause()→ onCreate() →onStart()→onResume()→onStop()

 <img width="468" alt="image" src="https://github.com/ummuhan/ActivityYasamDongusu/assets/40892289/f21821bc-bfdc-4e06-b68c-cbf528566e9e">


•	Geri tuşu ile eski activity çağırıldığında:
onPause()→ onRestart () →onStart()→onResume()→onStop()→onDestroy()

 <img width="468" alt="image" src="https://github.com/ummuhan/ActivityYasamDongusu/assets/40892289/6e97a17e-9c81-4f33-808d-a7442e091a5d">
