import groovy.transform.*

@Canonical
class Person {
    String  name
    String  lastname
   }

Person p1 = new Person(name: 'Stas', lastname: 'Kolodziej') //tak tez dziala i uzywa zdefiniowanego settera
Person p2 = new Person(name: 'Stas', lastname: 'Kolodziej') //tak tez dziala i uzywa zdefiniowanego settera
Person p3 = new Person(name: 'Bart', lastname: 'Kar') //tak tez dziala i uzywa zdefiniowanego settera
Person p4 = new Person('Bart', 'Kar') //tak tez dziala i uzywa zdefiniowanego settera
Set people = [p1,p2,p3]
println p2.toString() //pokaz adres w pamieci obiktu p2 (zanim nadpisano metode)
assert p1 == p2  //pozwala porównywać zawartość obietków 
assert p1 != p3
println people.size()
println p4