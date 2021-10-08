package com.example.graphicpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context){
        super(context);
        setBackgroundColor(Color.YELLOW);
    }
    //XML 에서 뷰를 참조하려면 생성자 구현해야 함
    public CustomView(Context context, AttributeSet attrs){
        super(context);
        setBackgroundColor(Color.YELLOW);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        // initial color
        paint.setColor(Color.YELLOW);
        //background color
        canvas.drawColor(Color.BLUE);
        // yellow rec
        canvas.drawRoundRect(new RectF(30,50,330,550), 15, 15, paint);
        // yellow cir
        canvas.drawOval(new RectF(450,50,750,550), paint);
        // red cir
        paint.setColor(Color.RED);
        canvas.drawArc(new RectF(30,600,330,1100), 360, 1000,
                true, paint);
        //line
        paint.setColor(Color.YELLOW);
        float[] pts={ 30, 1250,
                300, 1350,
                300, 1350,
                60, 1450,
                60, 1450,
                360, 1500};
        paint.setStrokeWidth(10);
        canvas.drawLines(pts, paint);
    }

}
