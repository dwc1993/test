package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2015/7/14 0014.
 */
public class ShuduView extends View {
    //定义单元格的宽度和高度
    private float width;
    private float height;
     private Game game=new Game( );
    public  ShuduView(Context context){
        super(context);
    }
    @Override
    protected  void onSizeChanged(int w,int h,int oldw,int oldh){
        //计算当前单元格的高度和宽度
        this.width=w/9f;
        this.height=h/9f;
        super.onSizeChanged(w,h,oldw,oldh);
    }
    @Override
    protected  void onDraw(Canvas canvas){
        Paint backgroundpaint=new Paint();//生成画笔
        backgroundpaint.setColor(getResources().getColor(R.color.shudu_background));//设置画笔颜色
        canvas.drawRect(0,0,getWidth(),getHeight(),backgroundpaint);//绘制背景颜色
        Paint darkpaint=new Paint();
        darkpaint.setColor(getResources().getColor(R.color.shudu_dark));
        Paint hilltepaint=new Paint();
        hilltepaint.setColor(getResources().getColor(R.color.shudu_hillte));
        Paint lightpaint=new Paint();
       lightpaint.setColor(getResources().getColor(R.color.shudu_light));
        //绘制9x9单元格线
        for(int i=0;i<9;i++){
            canvas.drawLine(0,i*height,getWidth(),i*height,lightpaint);
            canvas.drawLine(0,i*height+1,getWidth(),i*height+1,hilltepaint);
            canvas.drawLine(i*width,0,i*width,getHeight(),lightpaint);
            canvas.drawLine(i*width+1,0,i*width+1,getHeight(),hilltepaint);
        }
        //绘制中间四条黑线
        for(int i=0;i<9;i++){
            if(i%3!=0){
                continue;
            }
            canvas.drawLine(0,i*height,getWidth(),i*height,darkpaint);
            canvas.drawLine(0,i*height+1,getWidth(),i*height+1,hilltepaint);
            canvas.drawLine(i*width,0,i*width,getHeight(),darkpaint);
            canvas.drawLine(i*width+1,0,i*width+1,getHeight(),hilltepaint);
        }
        //添加数字
        Paint numberPaint=new Paint();
        numberPaint.setColor(Color.BLACK);
        numberPaint.setStyle(Paint.Style.STROKE);
        numberPaint.setTextSize(height * 0.75f);
        numberPaint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fm= numberPaint.getFontMetrics();
        float x=width/2;
        float y=height/2-(fm.ascent+fm.descent)/2;
        for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
                canvas.drawText(game.getTileString(i,j),i*width + x,j*height + y,numberPaint);
            }
        }

        super.onDraw(canvas);
    }
}
