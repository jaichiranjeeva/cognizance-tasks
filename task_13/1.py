
#Finding sum of multiples of 3 and 5 below n for t cases

t=int(input(""))
sums=[]
for i in range (1,t+1):
    n=int(input(""))
    multiples=[]
    s=0
    for j in range (1,n):
        x=0
        if(j%3==0):
            x=j
        if(j%5==0):
            x=j
        if(x != 0):
            multiples.append(x)
    for j in multiples:
       s=s+j
    sums.append(s)
for i in sums:
    print(i)
        
