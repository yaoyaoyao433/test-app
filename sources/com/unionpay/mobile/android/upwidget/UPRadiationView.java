package com.unionpay.mobile.android.upwidget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public class UPRadiationView extends View {
    private List<a> a;
    private int b;
    private int c;
    private Context d;
    private Handler e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public final class a {
        Paint a;
        int b;
        float c;
        int d;

        private a() {
        }

        /* synthetic */ a(UPRadiationView uPRadiationView, byte b) {
            this();
        }
    }

    public UPRadiationView(Context context) {
        this(context, null);
    }

    public UPRadiationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context;
        this.a = Collections.synchronizedList(new ArrayList());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        ((Activity) this.d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
        int i2 = displayMetrics2.heightPixels;
        if (i <= 0 || i2 <= 0) {
            throw new RuntimeException("size illegal");
        }
        this.b = i / 2;
        this.c = (i2 / 2) - com.unionpay.mobile.android.global.b.n;
        this.e = new t(this);
        this.e.sendEmptyMessage(0);
    }

    private static Paint a(int i, float f) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(i);
        paint.setColor(-1);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(UPRadiationView uPRadiationView) {
        if (uPRadiationView.a != null) {
            if (uPRadiationView.a.size() == 0) {
                a aVar = new a(uPRadiationView, (byte) 0);
                aVar.b = 0;
                aVar.d = 255;
                aVar.c = aVar.b / 4;
                aVar.a = a(aVar.d, aVar.c);
                uPRadiationView.a.add(aVar);
                return;
            }
            for (int i = 0; i < uPRadiationView.a.size(); i++) {
                a aVar2 = uPRadiationView.a.get(i);
                if (aVar2.d == 0) {
                    uPRadiationView.a.remove(i);
                    aVar2.a = null;
                } else {
                    aVar2.b += 10;
                    aVar2.d -= 4;
                    if (aVar2.d < 0) {
                        aVar2.d = 0;
                    }
                    aVar2.c = aVar2.b / 4;
                    aVar2.a.setAlpha(aVar2.d);
                    aVar2.a.setStrokeWidth(aVar2.c);
                    if (aVar2.b == com.unionpay.mobile.android.utils.g.a(uPRadiationView.d, 60.0f)) {
                        a aVar3 = new a(uPRadiationView, (byte) 0);
                        aVar3.b = 0;
                        aVar3.d = 255;
                        aVar3.c = aVar3.b / 4;
                        aVar3.a = a(aVar3.d, aVar3.c);
                        uPRadiationView.a.add(aVar3);
                    }
                }
            }
        }
    }

    public final void a() {
        this.d = null;
        this.e.removeCallbacksAndMessages(null);
        this.e = null;
        if (this.a != null) {
            this.a.clear();
        }
        this.a = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = this.a.get(i);
            canvas.drawCircle(this.b, this.c, aVar.b, aVar.a);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
