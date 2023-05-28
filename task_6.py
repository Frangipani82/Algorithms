def arraySum(A): 
    n = len(A) 
    sum = 0 
    for i in range(n): 
      for j in range(i+1): 
            sum += A[j] 
      print(sum) 
      
array1 = [8, 3, 9, 5]
array2 = [9, 10, 21, 4]
arraySum(array2)


# def arraySum(A): 
#     n = len(A) 
#     #For keeping track of the total sum of the elements
#     sumTotal = 0 
#     #Holds the sum of the elements until i in the range
#     subSum = 0
#     for i in range(n): 
#       #Adds the actual value to the subSum, to track the sum of the 
#       #elements until i
#       subSum += A[i]
#       #Adds subSum to sumTotal to get the total of always values, that is 
#       #always adding all elements until i
#       sumTotal += subSum
#       print(sumTotal) 
      
# array1 = [8, 3, 9, 5]
# array2 = [9, 10, 21, 4]
# arraySum(array2)

