import groovy.transform.CompileStatic

@CompileStatic
class Person {
    String  name
    String  lastname

    void setLastname(String lastname) {
        println 'pozdrowienia z srodka settera setLastname'
        this.lastname = lastname
    }

    String toString() {"$name $lastname"} //overiding nadpisanie metody
}

Person p = new Person()
p.name = "Bart"    // to nie jest naruszenie, przypisanie odbywa sie niejanie przez setter method
p.setLastname("Kazimi") //po set pisana jest z duzej litery wlasciowscimport groovy.transform.CompileStatic

println p.getName() //po get pisana jest z duzej litery wlasciwosc

println p.getLastname()
println "${p.getName()} odstep   ${p.getLastname()}"


Person p2 = new Person(name: 'Stas', lastname: 'Kolodziej') //map-based constructor tak tez dziala i uzywa zdefiniowanego settera

println "${p2.getName()} odstep   ${p2.getLastname()}"

println p2.toString() //pokaz adres w pamieci obiktu p2 (zanim nadpisano metode)