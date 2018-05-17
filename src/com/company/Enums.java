package com.company;

/**
 * Created by agangwar on 2/4/18.
 */
public class Enums {
    private enum TestEnum{
        LEFT(4){

            @Override
            int updatePosition(int pos){
                return pos-1;
            }

        }, RIGHT(0){
            @Override
            int updatePosition(int pos){
                return pos-1;
            }
        };

        int dir;

        TestEnum(int dir) {
            this.dir = dir;
        }

        private static  TestEnum getEnumValues(){
            return LEFT;
        }

       abstract int updatePosition(int pos);
    }
}
