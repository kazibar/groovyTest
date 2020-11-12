List nums = [0,2,1,45,12,3]
List results = []

nums.each {
    results << it * 2
}                     // podejsice proceduralne 
println results

// podejscie funkcjonalne 
println nums.collect {it * 2} //map
println nums.findAll {it % 3 == 0 } //filter
println nums.sum()                  //reduce

//first letter of words
List zdanie = 'to jest zdanie'.split()
println zdanie.collect { it[0] }
println zdanie.collect { it.size()}

//skrot do powyzszego - uzycie metody na kazdym elemencie z uzyciem * (spread)
println zdanie*.size()

//przeksztalcenie mapy w liste a nastepnie w string
def mapa = [k1:'v1', k2:'v2', k3:'v3']
println mapa.collect {k,v -> "$k=$v"}

println mapa.collect {k,v -> "$k=$v"}.join('&') //join method on the list returns string
// w efekcie dostaje query to web REST service