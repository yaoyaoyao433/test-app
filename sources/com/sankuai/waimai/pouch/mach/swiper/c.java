package com.sankuai.waimai.pouch.mach.swiper;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends OverScroller {
    public static ChangeQuickRedirect a = null;
    public static int b = 2000;
    int c;

    public c(Context context, Interpolator interpolator) {
        super(context, interpolator);
        Object[] objArr = {context, interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "916ceea8bc71c721faad8253c5e57691", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "916ceea8bc71c721faad8253c5e57691");
        } else {
            this.c = -1;
        }
    }

    @Override // android.widget.OverScroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55acca5f5dfe8dc1257d6c6ed53e80af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55acca5f5dfe8dc1257d6c6ed53e80af");
        } else if (this.c > 0) {
            super.startScroll(i, i2, i3, i4, this.c);
        } else {
            super.startScroll(i, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.OverScroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2563938d645f22169dbfa3893ef498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2563938d645f22169dbfa3893ef498");
        } else if (this.c > 0) {
            super.startScroll(i, i2, i3, i4, this.c);
        } else {
            super.startScroll(i, i2, i3, i4);
        }
    }

    public static int a() {
        return b;
    }
}
