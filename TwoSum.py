def twoSum(nums, target):
    num_map = {}
    for i in range(len(nums)):
        rem = target - nums[i]
        if rem in num_map:
            return [num_map[rem], i]
        num_map[nums[i]] = i
    return None

print(twoSum([2,7,11,15], 9))

'''
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
'''

