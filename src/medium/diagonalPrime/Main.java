package medium.diagonalPrime;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] nums= {
                {740,493,326,111,693,464,378,599,714,260,683,499,832,795,235,945,163,576,565,848,917,80,800,877,521,943,908},
                {173,27,848,659,870,171,900,530,419,623,677,214,449,726,701,415,271,22,602,138,942,398,176,907,452,579,55},
                {939,385,952,822,89,660,603,415,343,239,519,895,467,41,492,635,105,276,854,520,503,565,661,404,485,272,186},
                {236,554,374,164,310,873,624,852,939,148,468,71,986,71,490,403,580,976,420,570,95,272,494,236,835,114,304},
                {145,369,832,97,142,675,885,59,843,682,141,601,573,204,8,34,883,415,572,717,774,617,503,732,707,110,954},
                {485,573,356,896,799,352,894,100,703,6,248,233,510,859,319,282,231,10,508,364,970,978,522,949,350,94,80},
                {313,588,433,232,757,377,987,391,882,777,149,238,295,959,205,761,795,493,676,902,801,368,290,394,628,133,852},
                {798,123,411,364,513,890,483,235,672,727,383,648,938,368,443,285,368,997,411,786,785,732,290,888,108,492,926},
                {299,124,457,158,353,956,250,762,192,952,979,347,512,235,113,698,394,999,399,476,526,473,959,580,849,633,226},
                {692,409,515,319,499,239,323,531,701,2,95,484,325,404,913,973,233,841,991,442,50,590,790,42,417,96,270},
                {206,743,335,183,116,186,817,716,373,29,240,976,45,9,392,548,5,133,120,842,620,621,958,935,205,84,759},
                {478,203,869,2,533,919,637,867,426,69,550,182,949,240,233,951,426,392,487,827,1,447,216,391,1000,784,43},
                {631,978,276,30,597,356,721,377,847,346,694,465,657,138,611,530,95,258,968,106,732,106,280,25,709,146,636},
                {791,675,140,389,213,587,1000,676,328,207,432,521,513,124,574,109,710,933,487,128,522,915,459,482,183,466,561},
                {348,132,427,261,387,81,579,518,344,840,842,884,240,465,255,360,493,794,958,421,25,458,741,910,7,566,415},
                {982,783,794,457,230,440,247,260,489,487,145,234,452,291,369,669,498,614,955,952,153,993,852,535,701,90,193},
                {308,956,531,647,690,126,969,61,159,352,38,343,891,637,825,165,785,922,480,400,695,193,422,509,197,172,401},
                {49,806,971,822,791,985,348,909,779,699,850,534,193,742,336,188,532,946,556,730,872,609,597,445,156,649,706},
                {633,506,921,680,585,952,219,613,452,34,249,500,927,619,864,326,570,749,202,1,45,64,138,249,454,896,691},
                {625,230,677,701,112,883,989,776,529,436,947,662,650,294,907,700,347,506,702,197,168,382,571,864,366,735,449},
                {401,450,680,326,867,480,69,151,226,773,117,770,160,977,959,404,974,476,725,554,216,914,377,722,48,22,416},
                {213,90,875,423,600,584,895,810,422,554,216,649,5,984,685,140,544,659,929,502,317,390,557,551,68,81,620},
                {994,749,505,771,16,209,430,632,776,369,320,86,763,24,786,828,245,629,992,887,29,603,885,982,525,377,158},
                {477,265,113,608,458,286,900,859,225,392,394,764,519,950,348,234,844,605,271,959,92,46,159,324,642,599,578},
                {497,65,979,540,491,446,328,395,747,894,25,120,445,622,681,959,986,137,780,146,907,32,122,723,441,254,33},
                {645,279,271,394,119,353,299,383,631,823,653,195,763,845,555,555,62,347,528,566,15,166,930,508,840,23,653},
                {884,265,340,141,353,102,629,575,428,979,810,777,70,258,585,107,534,77,882,601,132,497,36,533,861,801,229}
        };
        System.out.println(solution.diagonalPrime(nums));
    }
}
