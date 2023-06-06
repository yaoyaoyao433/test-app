package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.TextView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ml extends TextView {
    private int a;
    private float b;
    private boolean c;

    public ml(Context context) {
        super(context);
        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        getPaint().setFakeBoldText(true);
    }

    public final void setStrokeColor(int i) {
        this.a = i;
    }

    public final void setStrokeWidth(float f) {
        this.b = f;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b > 0.0f) {
            this.c = true;
            int currentTextColor = getCurrentTextColor();
            TextPaint paint = getPaint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.b);
            setTextColor(this.a);
            super.onDraw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(0.0f);
            setTextColor(currentTextColor);
            super.onDraw(canvas);
            setTextColor(currentTextColor);
            this.c = false;
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.c) {
            return;
        }
        super.invalidate();
    }
}
