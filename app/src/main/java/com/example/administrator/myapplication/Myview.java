package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
/**
 * Created by Administrator on 2015/7/14 0014.
 */
public class Myview extends View {
    //构建一个Myview构造函数
    public Myview( Context context )
    {
        super(context);
    }
    //当Android系统绘制一个view对象时，就会调用该对象的onDraw(回调函数)
     @Override
protected void onDraw(Canvas canvas){
         Paint paint=new Paint();
         paint.setColor(Color.BLUE);
         canvas.drawLine(0,0,200,200,paint);
       super.onDraw(canvas);
   }
    }
