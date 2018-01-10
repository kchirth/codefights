def firstDuplicate(a):
    
    s = set()

    for i in range(0,len(a)) :
        if a[i] in s :
            return a[i]
        else :
            s.add(a[i])
            
    return -1
