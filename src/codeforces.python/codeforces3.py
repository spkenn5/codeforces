k = input()
months = raw_input().split()
num = 0

months = sorted(months, key=int,reverse=True)

if k > 0:
	if k < int(months[0]):
		num+=1
		print num
		exit()
	else:
		for i in months:			
			k-=int(i)
			num+=1			
			if k <= 0:
				print num
				exit()	
		if k <= 0:
			print num
		else:
			print -1
else:
	print 0

