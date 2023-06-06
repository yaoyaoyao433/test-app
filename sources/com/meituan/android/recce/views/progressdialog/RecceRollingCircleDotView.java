package com.meituan.android.recce.views.progressdialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.android.recce.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceRollingCircleDotView extends View {
    private static final int COLOR_BRIGHT = Color.parseColor("#EEEEEE");
    private static final int COLOR_DIM = Color.parseColor("#888888");
    public static ChangeQuickRedirect changeQuickRedirect;
    private int currDot;
    private boolean flag;
    private Handler handler;
    private int intervalDistance;
    private Paint mPaint;
    private int mRingRadius;
    private int speed;

    public RecceRollingCircleDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3620368c9b334f378969dc87045c61b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3620368c9b334f378969dc87045c61b9");
            return;
        }
        this.mRingRadius = 3;
        this.intervalDistance = 8;
        this.speed = 200;
        this.flag = true;
        this.currDot = 1;
        this.mRingRadius = d.a(context, 3.5f);
        this.intervalDistance = d.a(context, 15.0f);
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.handler = new Handler();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "419c78fb6c93dfe2eb258cd7eb87f33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "419c78fb6c93dfe2eb258cd7eb87f33f");
            return;
        }
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        switch (this.currDot) {
            case 1:
                int i = COLOR_BRIGHT;
                int i2 = COLOR_DIM;
                drawDots(canvas, width, height, i, i2, i2);
                return;
            case 2:
                drawDots(canvas, width, height, COLOR_DIM, COLOR_BRIGHT, COLOR_DIM);
                return;
            case 3:
                int i3 = COLOR_DIM;
                drawDots(canvas, width, height, i3, i3, COLOR_BRIGHT);
                return;
            default:
                return;
        }
    }

    private void drawDots(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {canvas, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f8bd661bc593536e5a117f88b9e476c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f8bd661bc593536e5a117f88b9e476c");
            return;
        }
        this.mPaint.setColor(i3);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        canvas.drawCircle(f - this.intervalDistance, f2, this.mRingRadius, this.mPaint);
        this.mPaint.setColor(i4);
        canvas.drawCircle(f, f2, this.mRingRadius, this.mPaint);
        this.mPaint.setColor(i5);
        canvas.drawCircle(f + this.intervalDistance, f2, this.mRingRadius, this.mPaint);
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fcaf1698ab49803050313afcd10ccea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fcaf1698ab49803050313afcd10ccea");
            return;
        }
        this.handler.post(new Runnable() { // from class: com.meituan.android.recce.views.progressdialog.RecceRollingCircleDotView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2eb4e076e4d7a02aca56c9258fc942cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2eb4e076e4d7a02aca56c9258fc942cc");
                    return;
                }
                RecceRollingCircleDotView.this.updateUI();
                if (RecceRollingCircleDotView.this.flag) {
                    RecceRollingCircleDotView.this.handler.postDelayed(this, RecceRollingCircleDotView.this.speed);
                }
            }
        });
    }

    public void updateUI() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7f5da2d95651e5086af420d99f8b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7f5da2d95651e5086af420d99f8b17");
            return;
        }
        this.currDot++;
        if (this.currDot > 3) {
            this.currDot = 1;
        }
        postInvalidate();
    }

    public void stop() {
        this.flag = false;
    }

    public void setFlag(boolean z) {
        this.flag = z;
    }
}
