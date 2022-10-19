def linear_search(a,search):
    for i in a:
        if i==search:
            return True
    else:
        return False

a=[int(x) for x in input().split()]
search=int(input("Enter the search Element : "))
if linear_search(a,search):
    print("Found")
else:
    print("Not Found")