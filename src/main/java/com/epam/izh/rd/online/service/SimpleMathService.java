package com.epam.izh.rd.online.service;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     *
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        if (value1==value2){
            System.out.println(0);
        } else if (value1 < value2) {
            System.out.println(-1);
        }   else  {
            System.out.println(1);
            }
        return -2;
    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     * @return
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1>value2) {
            System.out.println(value1);
        }
            else {
            System.out.println(value2);
            }

        return -1;

    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        double max=values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i] > max){
                max=values[i];
            }
        }
        return -1;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        double sum=0;
        for (int i = 0; i < values.length; i++) {
            sum=sum+values[i];
        }
        System.out.println(sum);
        return 0;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.println("Четное число: " + values[i]);
            }    else {
                System.out.println("Число нечетное" + values[i]);
                }

        }
            return new int[]{};
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int result=1;
        for (int i = 0; i < initialVal; i++) {
            if(initialVal==0){
                System.out.println(1);
            }
                result=result*i;
            System.out.println(result);
        }
        return 1;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        int a = 1;
        int b = 0;
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                System.out.println(0);
            }
            int fibb = a + b;
            a = b;
            b = fibb;
            System.out.println(fibb);
        }

        return -1L;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        return values;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        for ( int i=2; i < number; i++) {
            if ( number%i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[values.length-i-1]);
        }
        return new int[]{};
    }
}
