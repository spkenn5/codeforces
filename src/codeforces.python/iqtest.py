n = input()
nums = raw_input().split()
tmp = 0
gap = 0

for i in range(0,len(nums)-1):
	if gap != abs(int(nums[i]) - int(nums[i+1])):
		gap = abs(int(nums[i]) - int(nums[i+1]))	
		print i
	
	