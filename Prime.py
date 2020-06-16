n =int(input('enter a number'))
count=0
for i in range(3,n):
    for j  in range(2,i):
        isprime = True
        if(i%j==0):
            isprime = False
            break
    if(isprime):
        print(i)
        count=count+1
        if(count==5):
            exit()
     if(isprime):
        print(i)
        count=count+1
        if(count==5):
            exit()
    
