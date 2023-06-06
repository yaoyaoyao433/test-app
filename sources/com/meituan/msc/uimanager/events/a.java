package com.meituan.msc.uimanager.events;

import android.os.SystemClock;
import com.meituan.msc.uimanager.events.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<T extends a> {
    private static int a;
    public static ChangeQuickRedirect f;
    private int b;
    boolean g;
    public int h;
    public long i;

    public abstract String a();

    public abstract void a(RCTEventEmitter rCTEventEmitter);

    public short b() {
        return (short) 0;
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891fbd1b52cf83c7c29d86805b3fd0a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891fbd1b52cf83c7c29d86805b3fd0a3");
            return;
        }
        int i = a;
        a = i + 1;
        this.b = i;
    }

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a580bc57fef7f0a0af3c62c1c3c86d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a580bc57fef7f0a0af3c62c1c3c86d");
            return;
        }
        int i2 = a;
        a = i2 + 1;
        this.b = i2;
        b(i);
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430b4e3611016bdd17c33bbd86dc4c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430b4e3611016bdd17c33bbd86dc4c83");
            return;
        }
        this.h = i;
        this.i = SystemClock.uptimeMillis();
        this.g = true;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467e7b81bb2904140ecf41c172e6faa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467e7b81bb2904140ecf41c172e6faa3");
            return;
        }
        this.g = false;
        c();
    }
}
