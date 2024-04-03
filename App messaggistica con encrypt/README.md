# AppMessaggistica

Dato il codice presente nel repository github: 
https://github.com/gphoenix14/simple_tcp_java_messaging_app.git

Migliorare la soluzione introducendo le seguenti funzionalità : 
1)Quando un utente si collega deve essere stampato in broadcast "l'utente{username} si è appena connesso dall'IP {IP Pubblico}"
2)Il Server deve memorizzare la chat in un file di testo riportandola fedelmente
3)Il sistema deve supportare la codifica UTF 8 permettendo l'invio di caratteri speciali come è à ò etc.
4)Implementare una barra di stato che permette di visualizzare quanti utenti attivi ci sono attualmente sul server , stamparla con messaggio di broadcast ogni volta che un nuovo utente si collega.

EXTRA (Se finisci prima)
5)Implementare un sistema di moderazione che legge da un file dictionary.json una lista denominata "forbiddenWords" e se un utente invia un messaggio che contiene una o più parole incluse nella forbidden words la parola in questione viene sostituita con <censored>

6)Implementare un sistema di rate-limiting che impedisce agli utenti di inviare più di 1 messaggio al secondo



Una volta terminato il tutto, implementare il nat esponendo il server sulla porta 8000
