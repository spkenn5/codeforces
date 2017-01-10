# shit = sys.stdin.readline().split()
# n = int(shit[0])
# k = int(shit[1])
        
# max = 240;
# problems = 0;
# total = 0;
# max-=k;
# i = 1;

# while i <= n:
#     total+=(i*5);           
#     if total <= max :
#         problems+=1
#     i+=1;

# print(problems);
    

# n = input()

# line = raw_input().split()
# steps = 0;
# x = -1;
# overlap = False;

# for i in range(0, len(line)):
# 	if(int(line[i]) == 0 and x == 0):
# 		overlap = True;
# 	if(int(line[i]) != 0 or int(line[i]) != x):
# 		if(i != len(line)-1 or int(line[i]) != 0):
# 			steps+=1;
# 	x = int(line[i]);

# if(overlap):
# 	print(steps-1)
# else:
# 	print(steps);

t = input();
result = []
for i in range(0,t):
	n = input();
	usernames = raw_input().split()
	m = input();		
	line = [];
	impossible = False
	for j in range(0,m):
		msg  = raw_input()
		for names in usernames:
			if names in msg and "?:" not in msg :											
				usernames.remove(names)				
		line.append(msg)				

	if len(usernames) > 0:
		for i in range(0,len(line)):		
			if "?:" in line[i]:				
				for names in usernames:
					if names not in line[i]:						
						line[i] = line[i].replace("?:",names + ':')
						result.append(line[i])
						usernames.remove(names)						
					else:
						if len(usernames) > 2:							
							usernames.remove(names)				
			else:
				if line[i] not in line:
					line.append(line[i])
		if len(usernames) > 0:		
			result.append('Impossible')
	else:
		result.append('Impossible')
		# print 'Impossible'

for ans in line:
	print ans

# w, h = 4, 4
# Matrix = [[0 for x in range(w)] for y in range(h)] 
# diag = [];
# horiz = [];
# cross = [];

# for s in range(0,4):
# 	line = raw_input()
# 	Matrix[s] = list(line);

# for i in range(w):
# 	if Matrix[i][0] == 'x':
# 		horiz.append(Matrix[i][0]);
# 	elif(len(horiz) > 1 and Matrix[i][0] == '.'):
# 		print 'YES';
# 		exit();
# 	diag = [];			
# 	for j in range(h):
# 		if Matrix[i][j] == 'x':
# 			diag.append(Matrix[i][j]);
# 		elif(len(diag) > 1 and Matrix[i][j] == '.'):
# 			print 'YES';
# 			exit();	
# print'NO';