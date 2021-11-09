public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int count= 0;
        while(count*count<=num){
            count++;
        }
        return (count-1)*(count-1);
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) =2*p(k-1)+6, k>0
        //Найти элемент последовательности с номером num
        int p0=1;
        int count =1;
        while(count<=num){
            int pk=2*p0+6;
            count++;
            p0=pk;
        }
        return p0;
    }


    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int b=base;
        while(b<num){
            b*=base;
        }
        return b==num;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int count=0;
        while(start>=end) {
            if (start % 2 == 0 && start / 2 >= end) {
                start /= 2;
                count++;
            }
            if (start % 2 == 1 && start > end) {
                start--;
                count++;
            }
            if (start / 2 < end && start > end) {
                start--;
                count++;
            }
            if(start==end) {
                break;
            }
        }
        return count;
    }
}
