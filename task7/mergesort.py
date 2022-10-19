def mergeSort(a):
    if(len(a)<=1):
        return
    i=j=k=0
    mid=len(a)//2
    a1=a[:mid]
    a2=a[mid:]
    mergeSort(a1)
    mergeSort(a2)
    while(i<len(a1) and j<len(a2)):
        if a1[i]<a2[j]:
            a[k]=a1[i]
            i+=1
        else:
            a[k]=a2[j]
            j+=1
        k+=1
    while i<len(a1):
        a[k]=a1[i]
        i+=1
        k+=1
    while j<len(a2):
        a[k]=a2[j]
        j+=1
        k+=1

a=[]
# n=int(input("Enter the Size of the array : "))
# for i in range(n):
#     a.append(int(input()))
a=[int(x) for x in input().split()]
print("List before sorting:")
print(a)
mergeSort(a)
print("List after sorting:")
print(a)