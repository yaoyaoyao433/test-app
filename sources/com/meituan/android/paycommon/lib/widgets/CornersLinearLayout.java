package com.meituan.android.paycommon.lib.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CornersLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private Path b;
    private RectF c;
    private float[] d;
    private float e;
    private float f;
    private float g;
    private float h;

    public CornersLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271116a4e7ddcbc3a24a754960a2ec82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271116a4e7ddcbc3a24a754960a2ec82");
            return;
        }
        this.b = new Path();
        this.c = new RectF();
        this.d = new float[8];
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        b();
    }

    public CornersLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7fecff9f1184bd1c552b466aa6137d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7fecff9f1184bd1c552b466aa6137d3");
            return;
        }
        this.b = new Path();
        this.c = new RectF();
        this.d = new float[8];
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        a(context, attributeSet);
    }

    public CornersLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c9f368ef30b9396d3a8aee97e174c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c9f368ef30b9396d3a8aee97e174c9");
            return;
        }
        this.b = new Path();
        this.c = new RectF();
        this.d = new float[8];
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        a(context, attributeSet);
    }

    private void a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9cd5a3631ddbe4bad84017a939d43f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9cd5a3631ddbe4bad84017a939d43f");
            return;
        }
        b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.paycommon_corner_left_top, R.attr.paycommon_corner_left_bottom, R.attr.paycommon_corner_right_top, R.attr.paycommon_corner_right_bottom});
        this.e = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f = obtainStyledAttributes.getDimension(1, 0.0f);
        this.g = obtainStyledAttributes.getDimension(2, 0.0f);
        this.h = obtainStyledAttributes.getDimension(3, 0.0f);
        obtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28160d0c51cb0d3875874be95244dbe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28160d0c51cb0d3875874be95244dbe3");
        } else {
            setCorners(this.e, this.g, this.h, this.f);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9d39e7be8c66255a1e2e1be6433d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9d39e7be8c66255a1e2e1be6433d8e");
            return;
        }
        if (getBackground() == null) {
            setBackgroundColor(0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            c();
        } else {
            setLayerType(1, null);
        }
    }

    public void setCorners(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9abf2da66ee116e006c82a079aaa4a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9abf2da66ee116e006c82a079aaa4a3d");
        } else {
            setCorners(f, f, f, f, f, f, f, f);
        }
    }

    public void setCorners(float... fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ddb60297fad92d1597349cb29a7c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ddb60297fad92d1597349cb29a7c72");
            return;
        }
        if (fArr != null && fArr.length == 8) {
            this.d = fArr;
            invalidate();
        }
        if (fArr == null || fArr.length != 4) {
            return;
        }
        this.d = new float[]{fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]};
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a60cb89edaeea959bc460d324dec8d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a60cb89edaeea959bc460d324dec8d7");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 21) {
            this.c.set(0.0f, 0.0f, getWidth(), getHeight());
            this.b.reset();
            this.b.addRoundRect(this.c, this.d, Path.Direction.CCW);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc3e764fd846f05a1329a1264b48377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc3e764fd846f05a1329a1264b48377");
        } else if (Build.VERSION.SDK_INT < 21) {
            canvas.save();
            canvas.clipPath(this.b);
            canvas.clipPath(this.b, Region.Op.REPLACE);
            super.draw(canvas);
            canvas.restore();
        } else {
            super.draw(canvas);
        }
    }

    @TargetApi(21)
    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee22cafcb55e4a3345013953a9c4498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee22cafcb55e4a3345013953a9c4498");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.meituan.android.paycommon.lib.widgets.CornersLinearLayout.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr2 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b0b7b215d89ee4e7fdc2a1a43301050", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b0b7b215d89ee4e7fdc2a1a43301050");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), CornersLinearLayout.this.d[0]);
                    }
                }
            });
            setClipToOutline(true);
        }
    }
}
