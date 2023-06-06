package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QuickAlphabeticBar extends View {
    public static ChangeQuickRedirect a;
    private a b;
    private String[] c;
    private boolean d;
    private boolean e;
    private float f;
    private float g;
    private int h;
    private Paint i;
    private Paint j;
    private Path k;
    private PathEffect l;
    private int m;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public QuickAlphabeticBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175a105d56db5587992f6f16c064eea7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175a105d56db5587992f6f16c064eea7");
            return;
        }
        this.d = false;
        this.e = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 26;
        this.j = null;
        this.k = null;
        this.l = null;
        a();
    }

    public QuickAlphabeticBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f09d95553a0c207761f3424a84015f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f09d95553a0c207761f3424a84015f");
            return;
        }
        this.d = false;
        this.e = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 26;
        this.j = null;
        this.k = null;
        this.l = null;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90451ce51cc6b5faf75e3d7dc5caa64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90451ce51cc6b5faf75e3d7dc5caa64d");
            return;
        }
        this.i = new Paint();
        this.i.setColor(Color.rgb(119, 119, 119));
        this.i.setAntiAlias(true);
        this.j = new Paint();
        this.j.setAntiAlias(true);
        this.j.setColor(Color.parseColor("#40000000"));
        this.l = new CornerPathEffect(10.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbd886ed6daf6053faf640820c4173d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbd886ed6daf6053faf640820c4173d");
            return;
        }
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        int width = getWidth();
        if (this.d) {
            if (this.k == null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1176fbb50a10ebdebc4ef2dc6dedc63d", RobustBitConfig.DEFAULT_VALUE)) {
                    path = (Path) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1176fbb50a10ebdebc4ef2dc6dedc63d");
                } else {
                    int width2 = getWidth();
                    int height = getHeight();
                    Path path2 = new Path();
                    path2.moveTo(0.0f, 0.0f);
                    float f = width2;
                    path2.lineTo(f, 0.0f);
                    float f2 = height;
                    path2.lineTo(f, f2);
                    path2.lineTo(0.0f, f2);
                    path2.lineTo(0.0f, 0.0f);
                    path2.lineTo(f, 0.0f);
                    path = path2;
                }
                this.k = path;
            }
            this.j.setPathEffect(this.l);
            canvas.drawPath(this.k, this.j);
        }
        float length = this.c.length > 0 ? (this.m - (this.g * this.c.length)) / this.c.length : 0.0f;
        while (i < this.c.length) {
            int i2 = i + 1;
            canvas.drawText(this.c[i], (width / 2) - (this.i.measureText(this.c[i]) / 2.0f), ((this.g * i2) + (i * length)) - (this.g * 0.1f), this.i);
            i = i2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51acf24f10df47bce5d24404377d4d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51acf24f10df47bce5d24404377d4d12");
            return;
        }
        super.onMeasure(i, i2);
        if (this.c == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        this.m = getMeasuredHeight();
        if (this.g <= 0.0f) {
            this.g = this.m / this.h;
        }
        if (this.f <= 0.0f) {
            this.f = this.g * 0.8f;
        }
        this.i.setTextSize(this.f);
        for (int i3 = 0; i3 < this.c.length; i3++) {
            int measureText = (int) this.i.measureText(this.c[i3]);
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
        }
        setMeasuredDimension(measuredWidth, this.m);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62575350c349fabefca1c5e5c6c201fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62575350c349fabefca1c5e5c6c201fc")).booleanValue();
        }
        if (this.c == null) {
            return true;
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        a aVar = this.b;
        int height = (int) ((y / getHeight()) * this.c.length);
        switch (action) {
            case 0:
                this.d = true;
                if (aVar != null && this.e && height >= 0) {
                    int length = this.c.length;
                    break;
                }
                break;
            case 1:
                this.d = false;
                break;
            case 2:
                if (aVar != null && this.e && height >= 0) {
                    int length2 = this.c.length;
                    break;
                }
                break;
        }
        invalidate();
        return true;
    }

    public void setAlphas(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e37b9fb7fdc6ccb8c51df246ca1896b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e37b9fb7fdc6ccb8c51df246ca1896b");
            return;
        }
        this.c = strArr;
        invalidate();
        requestLayout();
    }

    public void setTouchable(boolean z) {
        this.e = z;
    }

    public void setOnTouchingLetterChangedListener(a aVar) {
        this.b = aVar;
    }
}
