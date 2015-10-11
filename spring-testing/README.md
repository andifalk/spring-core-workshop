# Spring Testing
Workshop Lab zur beispielhaften Verwendung der Test-Unterstützung in Spring

Der komplette Code für den Workshop ist auf [on Github](http://github.com/andifalk/spring-core-workshop/spring-testing) zu finden.

## Lernziele
Ziel dieses Labs ist es, mit einem Unit- und einem Integrationstest einen 'PersonService' mit seinen Methoden zu testen.

### Schritte:
1. Den [Spring Initializr](http://start.spring.io) aufrufen oder den Wizard in der IDE verwenden und dort die neueste Spring Boot Version auswählen and anschliessend H2 und JPA auswählen und dann fortfahren.
2. Falls nicht der IDE Wizard verwendet wurde muss das generierte Projekt in die IDE importiert werden.
3. Nach dem Maven Build kann direkt die im untersten Package generierte Klasse ausgeführt werden. Damit haben wir bereits eine fertige Spring-Anwendung mit JPA-Unterstützung auf Basis von Spring Boot.
4. Nun eine neue JPA Entity Klasse `class Person extends AbstractPersistable<Long>` erstellen mit Attributen 'firstName' und 'lastName' (Typ String).
5. Nun ein CRUD-Repository für die JPA Entity erstellen: `interface PersonRepository extends CrudRepository<Person, Long>`
4. Nun noch eine Service-Beans 'PersonService' mit Interfaces und Implementierung erstellen. Diese mit `@Service` annotieren. In der Implemntierung einfach Delegate-Methoden aus dem Repository verwenden und ins Interface aufnehmen..
5. Nun jeweils einen Unit-Test bzw. Integrationstest erstellen, der die Service-Methode `findOne(Long)` verifiziert;.
Weitere Details zur Umsetzung sind in der [Spring Test-Referenz](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#testing) zu finden. Für den Unit-Test sind Mockito (Mocking) und auch die Klasse 'ReflectionTestUtils' von Spring-Testing erforderlich.  

### Ergebnis
Die beiden Unit- und Integrationstests sollten fehlerfrei ablaufen.
