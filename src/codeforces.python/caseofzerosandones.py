n = input()
onezeros = raw_input()

one = 0
zero = 0

for i in onezeros:
	if i == "0":
		zero+=1
	elif i == "1":
		one+=1

print one+zero-(2 * min(one,zero,key=int))