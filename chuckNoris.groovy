import groovy.json.*
//http://icndb.com

String base = 'http://api.icndb.com/jokes/random?'
def qs = [limitTo:'[nerdy]', firstName:'Bart' , 
    lastName:'Kaz'].collect {k,v -> "$k=$v"}.join('&')
println qs

println "$base$qs".toURL().text 
String jsonTxt = "$base$qs".toURL().text 
println jsonTxt
def json = new JsonSlurper().parseText(jsonTxt)
println json

println json.value.joke