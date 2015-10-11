# Spring Configuration
Workshop Lab zur beispielhaften Umsetzung der Bean-Konfigurationsmöglichkeiten in Spring

Der komplette Code für den Workshop ist auf [on Github](http://github.com/andifalk/spring-core-workshop/spring-java-configuration) zu finden.

## Lernziele
Ziel dieses Labs ist es, jeweils 2 Service-Beans mit den drei möglichen Konfigurationsarten (XML, Java-Config und Annotationsbasiert) umzusetzen.

### Schritte:
1. Den [Spring Initializr](http://start.spring.io) aufrufen oder den Wizard in der IDE verwenden und dort die neueste Spring Boot Version auswählen and anschliessend ohne weitere Auswahl fortfahren.
2. Falls nicht der IDE Wizard verwendet wurde muss das generierte Projekt in die IDE importiert werden.
3. Nach dem Maven Build kann direkt die im untersten Package generierte Klasse ausgeführt werden. Damit haben wir bereits eine fertige Spring-Anwendung mit AOP-Unterstützung auf Basis von Spring Boot.
4. 2 Service-Beans 'MyService1' und MyService2' (dabei soll MyService1 eine Methode enthalten, die eine Methode von MyService2 aufruft) mit Interfaces und Implementierung erstellen. Diese mit `@Service` annotieren. In der Implemntierung der Methoden einfach eine Info loggen. Die Service-Beans sollten für jede der drei Konfigurationsarten in verschiedenen Packages kopiert werden.
5. Die Service-Beans jeweils mittels XML-, Java-Configuration und Annotationen konfigurieren.
Weitere Details zur Umsetzung sind in der [Spring IoC-Container-Referenz](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#beans) zu finden. 
6. Zur Verifikation der korrekten Umsetzung jeweils pro Konfigurationsart einen Integration-Test dazu erstellen. Dieser sollte die Methode aus MyService1 aufrufen.

### Ergebnis
Die Tests sollten fehlerfrei für alle Konfigurationsarten die Beans korrekt finden und die Methoden wie erwartet ausführen.
