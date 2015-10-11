# spring-core-workshop
Workshop Labs für das Spring Core Framework

Der komplette Code für den Workshop ist auf [on Github](http://github.com/andifalk/spring-core-workshop) zu finden.

## Systemvoraussetzungen  

- JDK 8, Maven, und eine IDE (Eclipse, STS, IntelliJ) müssen installiert sein.
- Um ein neues Übungsprojekt zu starten den [Spring Initializr](http://start.spring.io) im Browser aufrufen und dort die neueste Version von Spring Boot auswählen. Anschliessend je nach Übung die dort angegebenen Spring-Module auswählen. Zum Erzeugen des Projektes dann auf 'Generate' drücken.
- Alternativ kann dies bei Benutzung einer aktuellen Spring Toolsuite IDE oder in IntelliJ (ab Version 14) auch direkt durch den jeweils integrierten Spring-Initialzr Wizard erledigt werden. 

## 1. "Bootcamp"

### Lernziele
Ziel dieses Labs ist es, zunächst einmal das Aufsetzen eines neuen Spring-Boot basierten Projektes mit Hilfe des Spring Initialzr auszuprobieren.

### Schritte:
- Den [Spring Initializr](http://start.spring.io) aufrufen oder den Wizard in der IDE verwenden und dort die neueste Spring Boot Version auswählen and anschliessend H2, JPA und Web auswählen.
- Falls nicht der IDE Wizard verwendet wurde muss das generierte Projekt in die IDE importiert werden.
- Nach dem Maven Build kann direkt die im untersten Package generierte Klasse ausgeführt werden.
- Damit haben wir bereits eine fertige Spring-Web Anwendung auf Basis von Spring Boot.

