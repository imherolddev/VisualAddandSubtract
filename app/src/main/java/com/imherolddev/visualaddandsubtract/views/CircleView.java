package com.imherolddev.visualaddandsubtract.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * CircleCanvas - a custom canvas to draw circles for visualizing the equations
 *
 * @author Jason Hall - imherolddev
 * @since 1.0
 */
public class CircleView extends View {

    private int width, height;
    //grab circle color from preference
    private Paint paint;

    private ScheduledExecutorService executorService;
    private Runnable runnable;

    private final  int FRAME_RATE = 16;

    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public CircleView(Context context) {

        super(context);

        paint = new Paint();

        executorService = Executors.newSingleThreadScheduledExecutor();

        runnable = new Runnable() {
            @Override
            public void run() {
                //move the circles
            }
        };

    }

    @Override
    protected void onDraw(Canvas canvas) {
        //run executorService, paint, canvas.drawCircle(), invalidate()
    }

    @Override
    public void onSizeChanged(int w, int h, int oldw, int onldh) {

        super.onSizeChanged(w, h, oldw, onldh);

        this.width = w;
        this.height = h;

    }

    private int getXBound(int radius) {
        return width - radius;
    }

    private int getYBound(int radius) {
        return height - radius;
    }

}
