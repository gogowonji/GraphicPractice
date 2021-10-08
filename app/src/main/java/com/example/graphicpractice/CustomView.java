package com.example.graphicpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    //TODO : Add Constants
    private Paint mPaints, mFramePaint;
    private RectF mBigOval;
    private float mStart, mSweep;
    private static final float SWEEP_INC = 2;
    private static final float START_INC = 15;

    public CustomView(Context context){
        //TODO : Create src
        super(context);
        mPaints = new Paint();
        mPaints.setAntiAlias(true);
        mPaints.setStyle(Paint.Style.FILL);
        mPaints.setColor(0x88FF0000);
        mFramePaint = new Paint();
        mFramePaint.setAntiAlias(true);
        mFramePaint.setStyle(Paint.Style.STROKE);
        mFramePaint.setStrokeWidth(3);
        mFramePaint.setColor(0x8800FF00);
        mBigOval = new RectF(100, 40, 900, 1000);
    }

    /** XML 에서 뷰를 참조하려면 생성자 구현해야 함 **/
    public CustomView(Context context, AttributeSet attrs){
        //TODO : Create src
        super(context);
        mPaints = new Paint();
        mPaints.setAntiAlias(true);
        mPaints.setStyle(Paint.Style.FILL);
        mPaints.setColor(0x88FF0000);
        mFramePaint = new Paint();
        mFramePaint.setAntiAlias(true);
        mFramePaint.setStyle(Paint.Style.STROKE);
        mFramePaint.setStrokeWidth(3);
        mFramePaint.setColor(0x8800FF00);
        mBigOval = new RectF(100, 40, 900, 1000);


    }
    @Override
    protected void onDraw(Canvas canvas) {
        //TODO : Add source New on Draw
        canvas.drawColor(Color.YELLOW);
        canvas.drawRect(mBigOval, mFramePaint);
        canvas.drawArc(mBigOval, mStart, mSweep, false, mPaints);
        mSweep += SWEEP_INC;
        if (mSweep > 360) {
            mSweep -= 360;
            mStart += START_INC;
            if (mStart >= 360)
                mStart -= 360;
        }
        //다시 onDraw() 호출 호출안하면 안 그려짐
        invalidate();


//        Paint paint = new Paint();
//        // initial color
//        paint.setColor(Color.YELLOW);
//        //background color
//        canvas.drawColor(Color.BLUE);
//        // yellow rec
//        canvas.drawRoundRect(new RectF(30,50,330,550), 15, 15, paint);
//        // yellow cir
//        canvas.drawOval(new RectF(450,50,750,550), paint);
//        // red cir
//        paint.setColor(Color.RED);
//        canvas.drawArc(new RectF(30,600,330,1100), 360, 1000,
//                true, paint);
//        //line
//        paint.setColor(Color.YELLOW);
//        float[] pts={ 30, 1250,
//                300, 1350,
//                300, 1350,
//                60, 1450,
//                60, 1450,
//                360, 1500};
//        paint.setStrokeWidth(10);
//        canvas.drawLines(pts, paint);


    }

}
