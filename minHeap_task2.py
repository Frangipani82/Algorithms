class Heap:
    def __init__(self):
        self._X = []

    def isEmpty(self):
        return self._X == []

    def size(self):
        return len(self._X)

    def _parent(self, i):
        return((i-1)//2)

    def insert(self, newElement):
        #Append at the end
        self._X.append(newElement)
        i = self.size()-1
        #Bubble up
        while(i > 0):
            top = self._parent(i)
            if(self._X[top] > self._X[i]):
                self._X[top],self._X[i] \
                    = self._X[i],self._X[top]
            else:
                break
            i = top

    def _minChild(self, i):
        if 2*i + 2 >= self.size():
            minChild = 2*i+1
        elif self._X[2*i+1] < self._X[2*i+2]:
            minChild = 2*i+1
        else:
            minChild = 2*i+2
        return(minChild)


    def extractMin(self):
        #Remove the minimum element from heap and return
        minElement=self._X.pop(0)
        if(self.size() != 0):
            #Bring last element to front
            lastElement=self._X.pop()
            self._X.insert(0, lastElement)
            #Trickle down
            i = 0
            while(2*i < self.size()-1):
                m = self._minChild(i)
                if(self._X[m] < self._X[i]):
                    self._X[i],self._X[m] \
                        = self._X[m],self._X[i]
                else:
                    break
                i =m
        return minElement

    def reportMin(self):
        return(self._X[0])

    def printHeap(self):
            print(self._X)
       
    def recursiveSmaller(self, target):
          #If for getting the minimum element using the extractMin() function
          #the heap will be destroyed, so copy it, and return the elements from the
          #copy. For this create an other heap and a list.
          C = Heap()
          list = []
          #Remove the elements from the original heap and append them to
          #the list
          for i in range(self.size()):
              list.append(self.extractMin())
          #Copy the list
          list2 = list[:]
          #From the first list insert the elements to the copy heap
          for l in list:
               C.insert(l)
          #From the second list insert the elements to the original heap
          for l2 in list2:
              self.insert(l2)
          #Base case: when there is at least one element in the minHeap and
          #the top element in the heap (the smallest) is smaller or equal to
          #the target, use copy heap
          if C.size() >= 1 and C.reportMin() <= target:
             #Remove the smallest element and print it
             print(C.extractMin())
             #Continue with the procedure until base case found
             return C.recursiveSmaller(target)
        
    def nonRecursiveSmaller(self,target):
        # If for getting the minimum element using the extractMin() function
        # the heap will be destroyed, so copy it, and return the elements from the
        # copy. For this create an other heap and a list.
        C = Heap()
        list = []
        #Remove the elements from the original heap and append them to
        #the list
        for i in range(self.size()):
            list.append(self.extractMin())
        #Copy the list
        list2 = list[:]
        #From the first list insert the elements to the copy heap
        for l in list:
              C.insert(l)
        #From the second list insert the elements to the original heap
        for l2 in list2:
            self.insert(l2)
        #Go through the range of the heap size
        for i in range(C.size()):
          #Check the smallest element in minHeap if it is smaller of equal
          #to the targer
          if C.reportMin() <= target:
            #Remove the smallest element
            print(C.extractMin())
          else:
              break
            
    # def nonRecursiveSmaller(self,target):
    #     #If for getting the minimum element using the extractMin() function
    #     #the heap will be destroyed, so copy it, and return the elements from the
    #     #copy. For this create an other heap and a list.
    #     C = Heap()
    #     list = []
    #     #Remove the elements from the original heap and append them to
    #     #the list
    #     for i in range(self.size()):
    #         list.append(self.extractMin())
    #     #Copy the list
    #     list2 = list[:]
    #     #From the first list insert the elements to the copy heap
    #     for l in list:
    #           C.insert(l)
    #     #From the second list insert the elements to the original heap
    #     for l2 in list2:
    #         self.insert(l2)
    #     #While there is any element in the heap
    #     while C.size():
    #       #Check if the smallest element is smaller or equal to target
    #       if C.reportMin() <= target:
    #         #Remove the smallest element and print it
    #         print(C.extractMin())
            
    




H=Heap()
H.insert(12)
H.insert(34)
H.insert(2)
H.insert(8)
H.insert(3)
H.insert(23)
H.insert(11)
H.insert(15)
H.insert(43)
H.insert(25)
H.insert(55)
# H.insert(12)
# H.insert(9)
# H.insert(7)
# H.insert(1)
# H.insert(8)
# H.insert(13)
H.printHeap()
# print(H.extractMin())
# print(H.extractMin())
# print(H.extractMin())
# print(H.extractMin())
# H.extractMin()
# H.extractMin()
# H.extractMin()
# H.extractMin()
# H.extractMin()
# H.extractMin()
# H.extractMin()
# H.extractMin()
# H.extractMin()
#print(H.size())
#H.printHeap()
#H.copyRecursiveSmaller(35)
#H.recursiveSmaller(45)
#H.printHeap()
H.nonRecursiveSmaller(45)

H.printHeap()

