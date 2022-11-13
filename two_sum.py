def two_sum_finder(l: list, sum: int):
    dict = {}
    temp = sum
    for i in range(len(l)):
        temp = sum - l[i]
        if temp in dict.keys():
            return f"[{l[i]},{temp}]"
        else:
            dict[l[i]] = 1
    return "ans not found"


print(two_sum_finder([3, 5, -4, 8, 11, 1, -1, 6],10))
