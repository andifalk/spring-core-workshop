# Entity-Control-Entity-Pattern (ECB)
Workshop Lab zur beispielhaften Umsetzung des Entity-Control-Boundary Patterns

Der komplette Code für den Workshop ist auf [on Github](http://github.com/andifalk/spring-core-workshop/spring-boundary-control-entity) zu finden.

## Lernziele
Ziel dieses Labs ist es, das von u.a. Adam Bien propagierte [Entity-Control-Boundary Pattern](http://www.cs.sjsu.edu/~pearce/modules/patterns/enterprise/ecb/ecb.htm) mit Spring Components umzusetzen.

### Schritte:
1. Den [Spring Initializr](http://start.spring.io) aufrufen oder den Wizard in der IDE verwenden und dort die neueste Spring Boot Version auswählen and anschliessend H2, JPA und Web auswählen.
2. Falls nicht der IDE Wizard verwendet wurde muss das generierte Projekt in die IDE importiert werden.
3. Nach dem Maven Build kann direkt die im untersten Package generierte Klasse ausgeführt werden. Damit haben wir bereits eine fertige Spring-Web Anwendung mit JPA Datenlayer auf Basis von Spring Boot.
4. Entsprechende Boundary, Control, Repository Klassen für eine Person-Entity (Attribute 'firstName' und 'lastName'erstellen
5. Repository-Implementierung mit einer Map als Persistenzlösung und annotiert mit @Repository 