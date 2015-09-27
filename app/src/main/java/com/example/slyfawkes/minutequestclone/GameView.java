package com.example.slyfawkes.minutequestclone;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {

    Paint paint = new Paint();
    Rect rect = new Rect(20, 56, 200, 112);

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.GREEN);
        canvas.drawRect(rect, paint);
    }
}
