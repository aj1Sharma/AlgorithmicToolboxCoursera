#Uses python3
n = int(input())
numbers = input().split()
maxi = 0
for i in range(n):
    for j in range(n):
        product = int(numbers[i])*int(numbers[j])
        if(i!=j):
            if(product > maxi) :
                maxi = product
print(maxi)
