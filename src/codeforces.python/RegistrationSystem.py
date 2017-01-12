n = input()
name = []
result = []
for i in range(n):
	new = raw_input()
	if new in name:
		total = 0
		for j in name:			
			if j == new:
				total+=1
		newone = new+str(total)
		result.append(newone)
		name.append(new)
	else:
		result.append("OK")
		name.append(new)

for names in result:
	print names
	
