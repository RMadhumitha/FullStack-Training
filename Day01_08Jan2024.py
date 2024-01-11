
#DAY 1 ASSIGNEMENT

#1) #Check if the first and last number of a list is the same
'''
listdata=[10, 20, 30, 40, 10]
n=len(listdata)
if listdata[0]==listdata[n-1]:
    print("The the first and last number of the list is the same")
else:
    print("The the first and last number of the list is different")
'''

#1) Check if the first and last number of a list is the same (Getting input from user)
'''
lst=[]
i=0
n=int(input("Enter the number of elements: "))
for i in range(0,n):
    x=int(input())
    lst.append(x)

print(lst)

if lst[0]==lst[n-1]:
    print("The the first and last number of the list is the same")
else:
    print("The the first and last number of the list is different")
'''
#2) Display numbers divisible by 5 from a list
'''
a = input("Enter the number of list")
a=int(a)
li=[]
re=[]
k=0
while (k<a):
    val=input("Enter the value")
    li.append(val)
    k=k+1
#print(li)
x=len(li)

for ii in range(len(li)):
    if (int(li[ii])%5==0):
        re.append(li[ii])
print(re)
'''

#4) Palindrome
'''
a = input("Enter the number of list")
if (a == a[::-1]):
    print("palindrome")
else:
    print("Not a palindrome")
'''

#5) Write a Program to extract each digit from an integer in the reverse order.
'''
a = input("Enter the number of list")

t=int(a)
res=[]
while(t>0):
    rem=t%10
    res.append(rem)
    t=t//10
print(int("".join(map(str,res))))
'''

#3) Return the count of a given substring from a string
'''
import re
string=input("Enter the string")
sub=input("Enter the string to search")
matches=len(re.findall("%s" %sub,string))
print(matches)
'''
