# spring-core-workshop
Workshop Labs für das Spring Core Framework

Der komplette Code für den Workshop ist auf [on Github](http://github.com/andifalk/spring-core-workshop) zu finden.

## Systemvoraussetzungen  

* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), [Maven](https://maven.apache.org/index.html), und eine IDE (Eclipse, [Spring Toolsuite 3.7.0 oder neuer](https://spring.io/tools/sts/all), [IntelliJ 14 oder neuer](https://www.jetbrains.com/idea/download/)) müssen installiert sein.
* Um ein neues Übungsprojekt zu starten den [Spring Initializr](http://start.spring.io) im Browser aufrufen und dort die neueste Version von Spring Boot auswählen. Anschliessend je nach Übung die dort angegebenen Spring-Module auswählen. Zum Erzeugen des Projektes dann auf 'Generate' drücken.
* Alternativ kann dies bei Benutzung einer aktuellen Spring Toolsuite IDE oder in IntelliJ (ab Version 14) auch direkt durch den jeweils integrierten Spring-Initialzr Wizard erledigt werden. 
* Bei Verwendung von Eclipse bzw. STS sollte noch der Annotation-Processing Maven-Connector installiert werden. Dies wird über den [Eclipse-Marketplace](http://marketplace.eclipse.org/content/m2e-apt) erledigt 

## 1. Bootcamp

### Lernziele
Ziel dieses Labs ist es, zunächst einmal das Aufsetzen eines neuen Spring-Boot basierten Projektes mit Hilfe des Spring Initialzr auszuprobieren.

### Schritte:
* Den [Spring Initializr](http://start.spring.io) aufrufen oder den Wizard in der IDE verwenden und dort die neueste Spring Boot Version auswählen and anschliessend H2, JPA und Web auswählen.
* Falls nicht der IDE Wizard verwendet wurde muss das generierte Projekt in die IDE importiert werden.
* Nach dem Maven Build kann direkt die im untersten Package generierte Klasse ausgeführt werden.
* Damit haben wir bereits eine fertige Spring-Web Anwendung auf Basis von Spring Boot.

## 2. Spring Configuration
### Lernziele 
In diesem Lab werden zwei Spring-Service Beans in den drei von Spring unterstützten Vorgehensweisen (XML, Java Config und Annotation-basiert) konfiguriert und mit einem Integrationstest überprüft.

## 3. Spring AOP
### Lernziele
Bei diesem Lab geht es darum um bestimmte Methodenaufrufe einen Logging-Aspekt zu implementieren.

## 4. Entity-Boundary-Control Pattern in Spring
### Lernziele
In diesem Lab wird das Entity-Boundary-Control Pattern beispielhaft in Spring umgesetzt. 

## 5. Spring Testing
### Lernziele
In diesem Lab wird die Testunterstützung in Spring durch Umsetzung eines Unit-Tests sowie eines Integration-Tests vorgestellt.
