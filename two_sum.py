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


def two_sum_pointer(l: list, target_sum: int):
    l.sort()
    left = 0
    right = len(l) - 1
    print(left,right)
    while left < right:
        temp = l[left] + l[right]
        if temp == target_sum:
            return [[l[left]], [l[right]]]
        elif temp < target_sum:
            left += 1
        else:
            right -= 1
    return f"ans doesn't exist in the array : {l}"


print(two_sum_pointer([3, 5, -4, 8, 11, 1, -1, 6], 13))
