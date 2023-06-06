package com.hhmedic.android.sdk.uikit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCircleTickView extends View {
    private int line1_x;
    private int line1_y;
    private int line2_x;
    private int line2_y;
    private boolean startDraw;

    public HHCircleTickView(Context context) {
        super(context);
        this.line1_x = 0;
        this.line1_y = 0;
        this.line2_x = 0;
        this.line2_y = 0;
        this.startDraw = false;
    }

    public HHCircleTickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.line1_x = 0;
        this.line1_y = 0;
        this.line2_x = 0;
        this.line2_y = 0;
        this.startDraw = false;
    }

    public HHCircleTickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.line1_x = 0;
        this.line1_y = 0;
        this.line2_x = 0;
        this.line2_y = 0;
        this.startDraw = false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.startDraw) {
            Paint paint = new Paint();
            paint.setColor(getResources().getColor(R.color.hh_sdk_blue));
            paint.setStrokeWidth(5.0f);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            paint2.setColor(-1);
            paint2.setStrokeWidth(5.0f);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            int width = getWidth() / 2;
            int width2 = width - (getWidth() / 5);
            int width3 = (getWidth() / 2) - 5;
            float f = (width - width3) - 1;
            float f2 = width + width3 + 1;
            canvas.drawArc(new RectF(f, f, f2, f2), 0.0f, 360.0f, true, paint);
            for (int i = 0; i < 3; i++) {
                if (this.line1_x < width3 / 3) {
                    this.line1_x++;
                    this.line1_y++;
                }
            }
            canvas.drawLine(width2, width, this.line1_x + width2, this.line1_y + width, paint2);
            int i2 = width3 / 3;
            if (this.line1_x == i2) {
                this.line2_x = this.line1_x;
                this.line2_y = this.line1_y;
                this.line1_x++;
                this.line1_y++;
            }
            for (int i3 = 0; i3 < 3; i3++) {
                if (this.line1_x >= i2 && this.line2_x <= width3) {
                    this.line2_x++;
                    this.line2_y--;
                }
            }
            canvas.drawLine((width2 + this.line1_x) - 1, this.line1_y + width, width2 + this.line2_x, width + this.line2_y, paint2);
            postInvalidateDelayed(0L);
        }
    }

    public void startDraw() {
        new Handler().postDelayed(new Runnable() { // from class: com.hhmedic.android.sdk.uikit.widget.HHCircleTickView.1
            @Override // java.lang.Runnable
            public void run() {
                HHCircleTickView.this.startDraw = true;
                HHCircleTickView.this.postInvalidate();
            }
        }, 10L);
    }
}
