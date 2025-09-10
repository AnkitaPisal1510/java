m1=[[2,3,7],
        [8,9,2],
        [5,7,8]]
m2=[[1,7,9],
    [3,4,11],
    [12,13,88]]
sum=0;
avg=0;
c=[]
i=0
while i<len(m1):
    j=0
    while j<len(m1):
            sum+=m1[i][j]+m2[i][j]
            
            j+=1
    i+=1
avg=sum//9

print("\nit is the sum of matrix ",sum)

print("\nit is the average of matrix ",avg)
