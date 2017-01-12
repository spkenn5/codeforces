n = input()
line = raw_input().split()

total = 0.0

for i in line:
	if float(i) > 0.0:
		total+=(float(i) / 100)		

print '%.12f' % (float(total/len(line)) * 100)

