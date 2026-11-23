class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) {
            return 0;
        }

        int[] mem = new int[amount + 1];
        for(int i = 1; i <= amount; i++) {
            mem[i] = amount + 1;
        }

        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(coin > i) {
                    continue;
                }

                mem[i] = Math.min(mem[i], 1 + mem[i - coin]);
            }
        }

        return mem[amount] > amount ? -1 : mem[amount];
    }
}
