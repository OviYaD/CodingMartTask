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

def binary_search(a,search):
    print(a)
    if(len(a)<=1 and not a[0]==search):
        return False
    if a[0]==search:
        return True
    mid=len(a)//2
    if a[mid]==search:
        return True
    if a[mid]>search:
        return binary_search(a[:mid],search)
    else:
        return binary_search(a[mid+1:],search)


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
search=int(input("enter the search element : "))
if binary_search(a,search):
    print("found")
else:
    print("Not found")
