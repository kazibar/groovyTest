Range r = 1..10
Range x = 1..<10
List numerki = [1,2,3,4,5,6,7,8]

List gniezdy = [1,2,[3,[4,5]],6,7,8]
println r

println x.size()
println r.from

println r.to

println numerki
println numerki.getClass().getName()
println numerki.class.name
println gniezdy.flatten()
println r[0..3]

println r[-1..3]
println r -10 //usunie wszystkie 10 z listy (method minus), to dziala jak dla string 
println r * 2 //wydrukuje razy liste r (uwaga na kolejnosc wpierw nazwa potem krotnosc)
println r + [30,40] //union tworzy nowa liste i dodaje 30,40
//println r << [30, 40] //left shit modyfikuje liste r - nie dziala operator <<
println r