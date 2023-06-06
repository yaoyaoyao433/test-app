package com.dianping.live.live.livefloat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static ChangeQuickRedirect y;
    protected boolean A;
    protected float B;
    protected float C;
    protected float D;
    protected float E;
    private Path a;
    private Paint b;
    private RectF c;
    protected GradientDrawable z;

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9350f3b4f2fa667c593c70dfdf6f3ce8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9350f3b4f2fa667c593c70dfdf6f3ce8");
            return;
        }
        this.A = false;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c5c962dc6668e5829a4c3d6b039e9ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c5c962dc6668e5829a4c3d6b039e9ea");
            return;
        }
        this.a = new Path();
        this.b = new Paint(1);
        this.c = new RectF();
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de98d258a826b08c24c2595b31ba7c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de98d258a826b08c24c2595b31ba7c9");
            return;
        }
        if (this.z == null) {
            this.z = new GradientDrawable();
        }
        this.B = f;
        this.C = f2;
        this.D = f3;
        this.E = f4;
        this.z.setCornerRadii(new float[]{j.a(getContext(), f), j.a(getContext(), f), j.a(getContext(), f2), j.a(getContext(), f2), j.a(getContext(), f3), j.a(getContext(), f3), j.a(getContext(), f4), j.a(getContext(), f4)});
        this.A = true;
        postInvalidate();
    }

    public void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6241683f69b4d834eac8d88aa14a885d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6241683f69b4d834eac8d88aa14a885d");
        } else {
            a(f, f, f, f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c3bacfa42fe40674f4ab7e7b45a52e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c3bacfa42fe40674f4ab7e7b45a52e");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.c.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2669bb1cc0c76868d07aad0d9a5c1440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2669bb1cc0c76868d07aad0d9a5c1440");
        } else if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad35fedd457ea6d0ecb572b603932be1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad35fedd457ea6d0ecb572b603932be1");
            } else if (this.A) {
                canvas.save();
                canvas.clipPath(a());
                super.draw(canvas);
                canvas.restore();
            } else {
                super.draw(canvas);
            }
        } else {
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = y;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1ee77a7b57c5e7ae44d6a32d7ed13289", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1ee77a7b57c5e7ae44d6a32d7ed13289");
            } else if (this.A) {
                canvas.saveLayer(this.c, null, 31);
                super.draw(canvas);
                canvas.drawPath(a(), this.b);
                canvas.restore();
            } else {
                super.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aadf9f0714955bd3eaae693bbaea8789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aadf9f0714955bd3eaae693bbaea8789");
        } else if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f2a643f05993f978ae40b43cc8a6ce9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f2a643f05993f978ae40b43cc8a6ce9");
                return;
            }
            canvas.save();
            canvas.clipPath(a());
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = y;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7358f976649950165f2c4146b47fab5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7358f976649950165f2c4146b47fab5");
                return;
            }
            canvas.saveLayer(this.c, null, 31);
            super.dispatchDraw(canvas);
            canvas.drawPath(a(), this.b);
            canvas.restore();
        }
    }

    private Path a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a838d6953e884f0d68c58ebc3c00f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Path) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a838d6953e884f0d68c58ebc3c00f7");
        }
        this.a.reset();
        this.a.addRoundRect(this.c, new float[]{j.a(getContext(), this.B), j.a(getContext(), this.B), j.a(getContext(), this.C), j.a(getContext(), this.C), j.a(getContext(), this.D), j.a(getContext(), this.D), j.a(getContext(), this.E), j.a(getContext(), this.E)}, Path.Direction.CW);
        return this.a;
    }
}
