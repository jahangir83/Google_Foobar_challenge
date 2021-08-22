
def bunney_location(x , y):
    distent = y - 1
    corner = x + distent
    value = corner * (corner + 1) //2
    value -= distent
    return str(value)



result = bunney_location(5, 10)
print(result)