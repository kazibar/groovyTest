def s = "this is first, that is second"

println s[-1..-3]
println s.reverse()

def zip = "41-922"
def muli_lines = '''\
Hello,
how
are
you?
'''
println muli_lines.size()
println muli_lines.readLines().size()