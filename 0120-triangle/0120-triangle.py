class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        l = triangle[-1]
        for s in range(len(triangle) - 2, -1, -1):
            for i in range(len(triangle[s])):
                l[i] = triangle[s][i] + min(l[i], l[i + 1])
        return l[0]