//przyklad jednoargumentowego clouser
List nums =  [1,8,4,9,3,2,10]
nums.each {println it}   //it jest domyslne jezeli nie uzyje sie zmiennej


nums.each {n ->   //strzaleczka odziela dummy argument n od body clousure 
println n}        // it zamienione na n


//przyklad dwuargumentowego clouser nie ma dummy trzeba oba zdefiniowac
nums.eachWithIndex {n, idx -> //n value, idx index
println "nums[$idx] = $n"
}

Map m = [a:1, b:2, c:2, 'New York':'city']
m.each {e ->                                 //jednoargumentowy sposob      
    println "m[${e.key}] = ${e.value}"
}

m.each {k,v ->
    println "m[$k] = $v"
}

10.downto(7, {println it}) //clouser jest ostatnim argumentem metody  

10.downto(7) {println it}

 