class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lowerBound = 1;
        int upperbound = 0;
        // find upperBound
        for(int i : piles) {
            upperbound = Math.max(upperbound, i);
        }
        int mid = (lowerBound + upperbound) / 2;
        while(lowerBound < upperbound) {
            mid = (lowerBound + upperbound) / 2;
            int result = binaryS(mid, piles, h);   
            if(result < 0) {
                // too slow
                lowerBound = mid + 1;
            } else {
                // too fast or seems fine
                upperbound = mid;
            }
        }
        return upperbound;
    }

    private int binaryS(int speed, int[] piles, int h) {
        while(true) {
            long usedHours = 0;
            for(int i = 0 ; i < piles.length ; i++) {
                usedHours += piles[i] / speed;
                if(piles[i] % speed != 0) usedHours++;
                // too slow
                if(usedHours > h) return -1;
            }
            // too fast
            if(usedHours < h) return 1;
            // ok
            if(usedHours == h) return 0;
            speed++;
        }
    }
}
