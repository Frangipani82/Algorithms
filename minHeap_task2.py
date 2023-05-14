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
        #Base case: when there is at least one element in the minHeap and
        #the top element in the heap (the smallest) is smaller or equal to
        #the target
        if self.size() >= 1 and self.reportMin() <= target:
           #Remove the smallest element and print it
           print(self.extractMin())
           #Continue with the procedure until base case found
           return self.recursiveSmaller(target)
       
    def copyRecursiveSmaller(self, target):
          C = Heap()
          list = []
          for i in range(self.size()):
              list.append(self.extractMin())
          print(list)
          #for l in range(len(list)):
              
          #Base case: when there is at least one element in the minHeap and
          #the top element in the heap (the smallest) is smaller or equal to
          #the target
          if C.size() >= 1 and C.reportMin() <= target:
             #Remove the smallest element and print it
             print(C.extractMin())
             #Continue with the procedure until base case found
             return C.recursiveSmaller(target)
        
    # def nonRecursiveSmaller(self,target):
    #     #Go through the range of the heap size
    #     for i in range(self.size()):
    #       #Check the smallest element in minHeap if it is smaller of equal
    #       #to the targer
    #       if self.reportMin() <= target:
    #         #Remove the smallest element
    #         print(self.extractMin())
    #       else:
    #           break
            
    def nonRecursiveSmaller(self,target):
        #While there is any element in the heap
        while not self.isEmpty():
          #Check if the smallest element is smaller or equal to target
          if self.reportMin() <= target:
            print("reportmin")
            print(self.reportMin())
            #Remove the smallest element and print it
            print("extractmin")
            print(self.extractMin())
            self.printHeap()
            print("size")
            print(self.size())
            print("isempty")
            print(self.isEmpty())
           




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
# H.insert(5)
# H.insert(12)
# H.insert(9)
# H.insert(7)
# H.insert(1)
# H.insert(8)
# H.insert(13)
# H.printHeap()
# H.extractMin()
print(H.size())
H.printHeap()
#H.copyRecursiveSmaller(25)
H.recursiveSmaller(45)
#H.printHeap()
#H.nonRecursiveSmaller(45)

H.printHeap()

