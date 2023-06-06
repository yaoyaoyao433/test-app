package com.meituan.android.pay.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.support.constraint.R;
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
    private Paint h;
    private Paint i;
    private Path j;
    private PathEffect k;
    private boolean l;
    private boolean m;
    private int n;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    public QuickAlphabeticBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15060d0fbada1c4e32fec102f4a20a15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15060d0fbada1c4e32fec102f4a20a15");
            return;
        }
        this.d = false;
        this.e = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        a();
    }

    public QuickAlphabeticBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb1ba815d9fa71693a0a590a0bdf179", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb1ba815d9fa71693a0a590a0bdf179");
            return;
        }
        this.d = false;
        this.e = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        a();
    }

    public QuickAlphabeticBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3debf67e79bacbf22258cc5ffe2cb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3debf67e79bacbf22258cc5ffe2cb4");
            return;
        }
        this.d = false;
        this.e = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b7510a261f74e104c1e4cb38eebec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b7510a261f74e104c1e4cb38eebec8");
            return;
        }
        this.f = getContext().getResources().getDimension(R.dimen.mpay__banklist_alphabar_text_size);
        this.g = (float) (this.f * 1.25d);
        this.h = new Paint();
        this.h.setColor(Color.rgb(119, 119, 119));
        this.h.setAntiAlias(true);
        this.i = new Paint();
        this.i.setAntiAlias(true);
        this.i.setColor(Color.parseColor("#40000000"));
        this.k = new CornerPathEffect(10.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ae3810863f8d59176296043309c559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ae3810863f8d59176296043309c559");
            return;
        }
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        if (this.n == 0 || this.l) {
            this.n = getHeight();
            this.l = false;
        }
        int width = getWidth();
        if (this.d) {
            if (this.j == null || this.m) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed6d6f412e00ad6cd51851f35a355d64", RobustBitConfig.DEFAULT_VALUE)) {
                    path = (Path) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed6d6f412e00ad6cd51851f35a355d64");
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
                this.j = path;
                this.m = false;
            }
            this.i.setPathEffect(this.k);
            canvas.drawPath(this.j, this.i);
        }
        this.h.setTextSize(this.f);
        this.h.setColor(getContext().getResources().getColor(R.color.mpay__banklist_alphabar_text_color));
        float length = this.c.length > 0 ? (this.n - (this.g * this.c.length)) / this.c.length : 0.0f;
        while (i < this.c.length) {
            int i2 = i + 1;
            canvas.drawText(this.c[i], (width / 2.0f) - (this.h.measureText(this.c[i]) / 2.0f), ((this.g * i2) + (i * length)) - (this.g * 0.1f), this.h);
            i = i2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42f83fce48031566339c7af77ee9b38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42f83fce48031566339c7af77ee9b38");
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension((int) getContext().getResources().getDimension(R.dimen.mpay__banklist_alphabar_width), ((int) this.g) * this.c.length);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403b6117ac74c31db0382c152e5c3396", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403b6117ac74c31db0382c152e5c3396")).booleanValue();
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
                if (aVar != null && this.e && height >= 0 && height < this.c.length) {
                    aVar.a(height);
                    break;
                }
                break;
            case 1:
                this.d = false;
                break;
            case 2:
                if (aVar != null && this.e && height >= 0 && height < this.c.length) {
                    aVar.a(height);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303e3b6867b7f07327c2eeff18492010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303e3b6867b7f07327c2eeff18492010");
            return;
        }
        this.c = (String[]) strArr.clone();
        invalidate();
    }

    public void setTouchable(boolean z) {
        this.e = z;
    }

    public void setOnTouchingLetterChangedListener(a aVar) {
        this.b = aVar;
    }

    public void setShouldMeasureHeight(boolean z) {
        this.l = z;
    }

    public void setShouldMakePath(boolean z) {
        this.m = z;
    }
}
