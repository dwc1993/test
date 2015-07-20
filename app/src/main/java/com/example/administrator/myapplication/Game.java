package com.example.administrator.myapplication;


/**
 * Created by Administrator on 2015/7/14 0014.
 */
public class Game {

    //数组初始化
    private final String str = "360000000004230800000004200" +
                               "070460003820000014500013020" +
                               "001900000007048300000000045";
    private int sudoku [] = new int[9 * 9];

    public  Game(){
    sudoku =fromPuzzieString(str);
     }
    //获取该数在数组中的位置的数字
private int getTile(int x,int y){
    return sudoku[y*9+x];
}
    public String getTileString(int x,int y){
        int v=getTile(x,y);
        if(v == 0){
            return " ";
           }
        else
            return String.valueOf(v);


    }
    //根据一个字符串，生成一个整形数组，作为数组游戏的初始化数组
    protected int[] fromPuzzieString(String src) {
        int[] sudo = new int[src.length()];
        for (int i = 0; i < sudo.length; i++) {

     sudo[i]=src.charAt( i)-'0';//从数组中取出数字
        }
   return  sudo;
    }




}
