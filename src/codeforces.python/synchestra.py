def calculate_pay(daily_work_hours):
	day = 0	
	earnings = 0
	totalhours = 0
	for hours in daily_work_hours:
		temp = hours
		if hours <= 8:
			earnings+= temp * 10				
		elif hours > 8 and hours <= 10:			
			earnings+= (8 * 10) + (1.50 * (10 * (temp-8)))
		elif hours > 10:
			earnings += (8 * 10) + (1.50 * (10 * 2)) + ((2 * 10) * (temp-10))
		totalhours+=hours
		day+=1
		if day == 3:
			day = 0
			if totalhours >= 30:				
				totalhours = 0				
				earnings+=50
	
	return earnings

def calculate_peak(logged_in,logged_out):
	maxusr = 0
	temp = 0
	for i in range(len(logged_in)):
		temp+=logged_in[i]
		temp-=logged_out[i]
		if temp > maxusr:
			maxusr = temp
	return maxusr
def calculate_average(logged_in,logged_out):
	total = 0
	temp = 0
	for i in range(len(logged_in)):
		temp+=logged_in[i]
		temp-=logged_out[i]
		total+=temp		
	return total/(len(logged_in))
def login_sequence(logged_in,logged_out):
	sentence = []
	string = ""
	for i in range(len(logged_in)):
		for inputs in range(logged_in[i]):
			string+="I"
		if(logged_in[i] > 0):
			sentence.append(str(logged_in[i]) + " logins")
		for outputs in range(logged_out[i]):
			string+="O"
		if(logged_out[i] > 0):
			sentence.append(str(logged_out[i]) + " logouts")

	sentence = ",".join(sentence)
	return string + " (" + sentence + ")"	

logged_in  = [23,5,6,0]
logged_out = [0,2,15,3]
daily_work_hours = [8,9,4,9,12,10,7]

print calculate_peak(logged_in,logged_out)
print calculate_average(logged_in,logged_out)
print login_sequence(logged_in,logged_out)
print calculate_pay(daily_work_hours)


