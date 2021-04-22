package leetcode341;

import dependency.NestedInteger;

import java.util.ArrayList;
import java.util.List;

/**
 * 341 扁平化嵌套列表迭代器
 * @author zhuangpeng
 */
public class Solution {
    NestedInteger nestedInteger1 = new NestedInteger() {

        @Override
        public boolean isInteger() {
            return false;
        }

        @Override
        public Integer getInteger() {
            return 1;
        }

        @Override
        public List<NestedInteger> getList() {
            return null;
        }
    };

    NestedInteger nestedInteger = new NestedInteger() {

        @Override
        public boolean isInteger() {
            return true;
        }

        @Override
        public Integer getInteger() {
            return 2;
        }

        @Override
        public List<NestedInteger> getList() {
            return null;
        }
    };

    NestedInteger nestedInteger2 = new NestedInteger() {

        @Override
        public boolean isInteger() {
            return true;
        }

        @Override
        public Integer getInteger() {
            return null;
        }

        @Override
        public List<NestedInteger> getList() {
            List<NestedInteger> add = new ArrayList<>();
            add.add(nestedInteger);
            return add;
        }
    };

}
