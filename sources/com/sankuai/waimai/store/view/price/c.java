package com.sankuai.waimai.store.view.price;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    int e;
    public int f;
    public int g;

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb370cc9ba5a855fde5bb6a54fc4f0b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb370cc9ba5a855fde5bb6a54fc4f0b0")).intValue();
        }
        if (a() && i > 4) {
            return this.d;
        }
        return this.b;
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9954c0807b73af050a5dc1642d89ef6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9954c0807b73af050a5dc1642d89ef6c")).intValue();
        }
        if (a() && i > 4) {
            return this.e;
        }
        return this.c;
    }

    private boolean a() {
        return this.b == 36 || this.b == 28;
    }
}
