package com.meituan.msc.views.scroll;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    float b;
    float c;
    private int d;
    private int e;
    private long f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8233e2bb589b8c0b1a12309c14d0b97a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8233e2bb589b8c0b1a12309c14d0b97a");
            return;
        }
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.b = 0.0f;
        this.c = 0.0f;
        this.f = -11L;
    }

    public final boolean a(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f933f42f5a4d78df7464cf8e5dea166", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f933f42f5a4d78df7464cf8e5dea166")).booleanValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        z = (uptimeMillis - this.f <= 10 && this.d == i && this.e == i2) ? true : true;
        if (uptimeMillis - this.f != 0) {
            this.b = (i - this.d) / ((float) (uptimeMillis - this.f));
            this.c = (i2 - this.e) / ((float) (uptimeMillis - this.f));
        }
        this.f = uptimeMillis;
        this.d = i;
        this.e = i2;
        return z;
    }
}
