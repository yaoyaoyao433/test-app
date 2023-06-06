package com.sankuai.waimai.business.address.widget.stickyheaderlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends ViewGroup {
    public static ChangeQuickRedirect a;
    public View b;
    public Drawable c;
    public int d;
    public View e;
    public int f;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db3cb42f256db4d89cc4bf8b52e41ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db3cb42f256db4d89cc4bf8b52e41ff");
        }
    }

    public final boolean a() {
        return this.e != null;
    }

    public final View getItem() {
        return this.b;
    }

    public final View getHeader() {
        return this.e;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b93d9698a1d404346a23e94518cdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b93d9698a1d404346a23e94518cdc5");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        if (this.e != null) {
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            if (layoutParams != null && layoutParams.height > 0) {
                this.e.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
            } else {
                this.e.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            i3 = this.e.getMeasuredHeight() + 0;
        } else {
            i3 = (this.c == null || this.b.getVisibility() == 8) ? 0 : this.d + 0;
        }
        ViewGroup.LayoutParams layoutParams2 = this.b.getLayoutParams();
        if (this.b.getVisibility() == 8) {
            this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else if (layoutParams2 != null && layoutParams2.height >= 0) {
            this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824));
            i3 += this.b.getMeasuredHeight();
        } else {
            this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            i3 += this.b.getMeasuredHeight();
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf7b07f24e0979dc6ea7f246a744253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf7b07f24e0979dc6ea7f246a744253");
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (this.e != null) {
            int measuredHeight = this.e.getMeasuredHeight();
            this.e.layout(0, 0, width, measuredHeight);
            this.f = measuredHeight;
            this.b.layout(0, measuredHeight, width, height);
        } else if (this.c != null) {
            this.c.setBounds(0, 0, width, this.d);
            this.f = this.d;
            this.b.layout(0, this.d, width, height);
        } else {
            this.f = 0;
            this.b.layout(0, 0, width, height);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"ObsoleteSdkInt"})
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bbf95bdc2d2defe49163f1fbb622341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bbf95bdc2d2defe49163f1fbb622341");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.e != null || this.c == null || this.b.getVisibility() == 8) {
            return;
        }
        if (Build.VERSION.SDK_INT < 11) {
            canvas.clipRect(0, 0, getWidth(), this.d);
        }
        this.c.draw(canvas);
    }
}
