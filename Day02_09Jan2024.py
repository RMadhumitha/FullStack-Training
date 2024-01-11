
#DAY 2 ASSIGNEMNT

#1) Print First 10 natural numbers using while loop 
'''
n=10
i=1
while(i<=n):
    print(i)
    i+=1
'''

#2) Calculate the sum of all numbers from 1 to a given number
'''
n=int(input("Enter the number: "))
sum=0
for i in range(0,n+1):
    sum+=i
print(sum)
'''

#3)Display numbers from a list using loop
'''
lst=[]
n=int(input("Enter the number of elements: "))
for i in range(0,n):
    x=int(input())
    lst.append(x)
print(lst)

updatedlst=[]
for i in range(n):
    if int(lst[i]<500):

        if int(lst[i])%5==0 and int(lst[i])<150:
            updatedlst.append(int(lst[i]))
            # print(updatedlst)
        else:
            continue
    else:
        break
        
print(updatedlst)
'''

#4) Count the total number of digits in a number
'''
n=int(input("Enter the number: "))
count=0
while(n>0):
    temp=n%10
    n=n//10
    count+=1

print(count)
'''

#5) Use a loop to display elements from a given list present at odd index positions
'''
lst=[]
n=int(input("Enter the number of elements: "))
for i in range(0,n):
    x=int(input())
    lst.append(x)
print(lst)

for i in range(n):
    print(lst[i])
    i+=2
'''

