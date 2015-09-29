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
import android.widget.Toast;

public class GameView extends View {

    Paint paint = new Paint();
    //Rect rect = new Rect(0,0,100,100);
    int startx = 0;
    int starty = 0;
    int endy = 100;
    int endx = 100;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.GREEN);
        canvas.drawRect(startx, starty, endx, endy, paint);
        startx += 10;
        starty += 10;
        endx += 10;
        endy += 10;
        //Toast toast = Toast.makeText(getContext(), "drawing things", Toast.LENGTH_SHORT);
        //toast.show();
        invalidate();
    }
}
