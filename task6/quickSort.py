def partition(a,low,high):
    start_point=low
    end_point=high-1
    pivot=a[high]
    while (start_point<end_point):
        while (a[start_point]<pivot):
            start_point=start_point+1
        while (a[end_point]>pivot):
            end_point=end_point-1
        if (start_point>=end_point):
            break
        a[start_point],a[end_point]=a[end_point],a[start_point]
    if a[start_point]>pivot:
        a[start_point],a[high]=a[high],a[start_point]
    # print(a,start_point)
    return start_point

def quick_sort(a,low,high):
    if(low>=high):
        return 0
    else:
        part=partition(a,low,high)
        quick_sort(a,low,part-1)
        quick_sort(a,part+1,high)
n=int(input("enter the size :"))
a=list(map(int,input().split()))
print("elements before sorting:",a)
quick_sort(a,0,n-1)
print("elements after sorting:",a)