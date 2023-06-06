package com.meituan.msc.modules.page.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCCoverViewWrapper extends FrameLayout {
    private static final Gson a = new Gson();
    public static ChangeQuickRedirect b;
    protected View c;
    protected float d;
    protected float e;
    protected int f;
    protected int g;
    protected boolean h;
    protected Paint i;

    public MSCCoverViewWrapper(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ae6b42f91bebea3a3a3e8d1f81e440", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ae6b42f91bebea3a3a3e8d1f81e440");
            return;
        }
        this.h = false;
        this.i = new Paint();
        b();
    }

    public MSCCoverViewWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f72d36ae33b9da82589529086bd443f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f72d36ae33b9da82589529086bd443f");
            return;
        }
        this.h = false;
        this.i = new Paint();
    }

    public MSCCoverViewWrapper(Context context, View view) {
        super(context);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cbbe63132965ead9fc9b1804c5f614a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cbbe63132965ead9fc9b1804c5f614a");
            return;
        }
        this.h = false;
        this.i = new Paint();
        this.c = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a2b5e23d1597e52b03ee1644a4d781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a2b5e23d1597e52b03ee1644a4d781");
            return;
        }
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setAntiAlias(true);
        setWillNotDraw(false);
    }

    public View getContent() {
        return this.c;
    }

    @Override // android.view.View
    public void setWillNotDraw(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a3490cb95fcadc77714a968a623d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a3490cb95fcadc77714a968a623d38");
        } else {
            super.setWillNotDraw(z);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6964419793427514afcff95e86e577f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6964419793427514afcff95e86e577f8");
            return;
        }
        float f = 0.0f;
        boolean z2 = this.e > 0.0f;
        if (z2) {
            canvas.save();
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.e, this.e, Path.Direction.CW);
            canvas.clipPath(path);
        }
        if (this.g != 0) {
            canvas.drawColor(this.g);
        }
        if (this.d > 0.0f) {
            float f2 = this.d / 2.0f;
            canvas.drawRoundRect(new RectF(f2, f2, getWidth() - f2, getHeight() - f2), this.e, this.e, this.i);
            if (z2) {
                canvas.restore();
            }
            canvas.save();
            Path path2 = new Path();
            if (this.e > 0.0f && this.e - this.d > 0.0f) {
                f = this.e - this.d;
            }
            path2.addRoundRect(new RectF(this.d, this.d, getWidth() - this.d, getHeight() - this.d), f, f, Path.Direction.CW);
            canvas.clipPath(path2);
        } else {
            z = z2;
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public final void setBorderRadius(float f) {
        this.e = f;
    }

    public final void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035cdb6f273c4064ce60430d839e5fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035cdb6f273c4064ce60430d839e5fac");
            return;
        }
        this.f = i;
        this.i.setColor(i);
    }

    public final void setBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6cb70f67d36c155faa90c4d9c4453be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6cb70f67d36c155faa90c4d9c4453be");
            return;
        }
        this.d = f;
        this.i.setStrokeWidth(f);
    }

    public final void setBgColor(int i) {
        this.g = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "967366f4f58c3bdb153ef6f68d9ef590", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "967366f4f58c3bdb153ef6f68d9ef590")).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.e > 0.0f) {
                double pow = Math.pow(this.e, 2.0d);
                float width = getWidth();
                float height = getHeight();
                if (x >= this.e) {
                }
            }
            z = true;
            if (!z) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.gson.JsonObject r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.page.view.MSCCoverViewWrapper.a(com.google.gson.JsonObject):void");
    }

    public final boolean a() {
        return this.h;
    }

    public void setFixed(boolean z) {
        this.h = z;
    }
}
