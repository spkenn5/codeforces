home = []
away = []
total = 0
n = input();
for i in range(0,n):
	line = raw_input().split()
	home.append(int(line[0]))
	away.append(int(line[1]))

for i in home:
	for j in away:
		if i == j:
			total+=1

print total