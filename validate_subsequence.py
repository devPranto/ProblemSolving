def validate(main_list: list, sub_list: list):
    pointer = 0
    ans = []
    for i in range(len(main_list)):
        if main_list[i] == sub_list[pointer]:
            pointer += 1
            ans.append(i)
            if pointer >= len(sub_list):
                return ans
        elif len(sub_list)-pointer >len(main_list)-i:
            return "no ans found"
    return "no ans found"


print(validate([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [3, 7, 9, 10]))
