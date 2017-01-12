n = input()
line = raw_input().split()
num1 = []
num2 = []
num3 = []

for i in line:
	if int(i) == 1:
		num1.append(i)
	elif int(i) == 2:
		num2.append(i)
	else:
		num3.append(i)

