import math

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        LB = 1
        UB = max(piles)

        res = UB
        while LB <= UB:
            mid = LB + (UB - LB) // 2
            count = 0
            for pile in piles:
                count += math.ceil(pile / mid)

            if count <= h:
                res = min(res, mid)
                UB = mid - 1
            else:
                LB = mid + 1
            
        return res

        