arr=[2,3,4,5,6,7,8,9]
n = len(arr)
odd = 0
even=0
for i in range(0,n):
    if (arr[i]%2) == 0 :
        even =  arr[i]
    else:
        odd = odd + arr[i]

print(even)
