def mapa = [a:1, b:2, 1:'a', 'New York':10, 2:'San Francisco']
println mapa
println mapa.getClass().name //nie moze byc mapa.class bo potraktuje class jak klucz w mapie
mapa['x'] = 10
mapa.f = 8

mapa.a= 8
println mapa

'''
def numerki = [1,2,3,4,5,6,7,8,9]
println numerki
println numerki.class.name
'''
def numerki = [1,2,1,1,2,3,4,5,6,7,8,9] as LinkedList

//def numerki = [1,2,1,1,2,3,4,5,6,7,8,9] as Set //elemination duplicates

//def numerki = [1,2,1,1,2,3,4,5,6,7,8,9] as SortedSet //elemination duplicates
println numerki.class.name
println numerki

def zdanie = 'To jest zdanie'
List podzielone = zdanie.split() //uzycie typu List zmienia array of strings w array of list
println podzielone.class.name 
