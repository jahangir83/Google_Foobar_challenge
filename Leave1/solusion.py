def solution(data, n):
    # Your code here

    return [x for x in data if data.count(x) <= n]


arr = [1, 2, 2, 3, 3, 3, 4, 5, 5]
print(solution(arr, 3 ))

