n = input()
mis = 0
chris = 0

for i in range(n):
	line = raw_input().split()
	if int(line[0]) > int(line[1]):
		mis+=1
	elif int(line[0]) < int(line[1]):
		chris+=1

if mis > chris:
	print "Mishka"
elif mis < chris:
	print "Chris"
else:
	print "Friendship is magic!^^"