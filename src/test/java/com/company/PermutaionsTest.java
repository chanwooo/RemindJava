package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
    class PermutationsTest {
        public List<List<Integer>> permute(int[] nums) {
            Queue<List<Integer>> queue = new LinkedList<>();
            queue.add(new ArrayList<>());

            while (queue.peek().size() != nums.length) {
                System.out.println("queue = " + queue);
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    List<Integer> temp = queue.remove();
                    System.out.println("temp = " + temp);
                    for (int num : nums) {
                        if (!temp.contains(num)) {
                            List<Integer> part = new ArrayList<>(temp);
                            part.add(num);
                            queue.add(part);
                        }
                    }
                }
            }
            System.out.println("queue = " + queue);

            return (List) queue;
        }

        @Test
        void test() {
            PermutationsTest test = new PermutationsTest();
            List<List<Integer>> ans = test.permute(new int[]{1, 2, 3});
            Assertions.assertEquals(6, ans.size());
        }


        static class Solution {
            public List<List<Integer>> permute(int[] nums) {
                // 반환 변수 선언
                List<List<Integer>> result = new ArrayList<>();
                // Queue 선언
                Queue<List<Integer>> queue = new LinkedList<>();
                queue.add(new ArrayList<>());

                while(queue.size() != 0){
                    List<Integer> permute = queue.remove();
                    System.out.println("permute = " + permute);
                    int idx = permute.size();

                    if(idx == nums.length){
                        result.add(permute);
                    }else {
                        int val = nums[idx];
                        for(int i = 0; i <= idx; i++){
                            List<Integer> newPermute = new ArrayList<>(permute);
                            newPermute.add(i,val);
                            queue.add(newPermute);
                            System.out.println("newPermute = " + newPermute);
                        }
                    }
                }
                System.out.println("result = " + result);
                return result;
            }
        }
        @Test
        void test2() {
            Solution solution = new Solution();
            List<List<Integer>> ans = solution.permute(new int[]{1, 2, 3});
            Assertions.assertEquals(6, ans.size());
        }

    }


