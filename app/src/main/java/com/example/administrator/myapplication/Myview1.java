package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2015/7/14 0014.
 */
public class Myview1 extends View{
    public Myview1( Context context )
    {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){
         Paint paint=new Paint();
        paint.setARGB(150,0,100,200);
        paint.setStyle(Paint.Style.STROKE);//设置矩形空心
        paint.setStrokeWidth(10);//设置空心的边框宽度
        paint.setTextSize(100);
        canvas.drawText("apple",50,200,paint);
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher),100,300,paint);
        //canvas.drawRect(100,300,300,500,paint);//绘制矩形
        //canvas.drawCircle(400,400,100,paint);//绘制圆

        super.onDraw(canvas);


    }
}