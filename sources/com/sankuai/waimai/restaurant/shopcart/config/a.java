package com.sankuai.waimai.restaurant.shopcart.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final a b = new a(0, 0);
    public int c;
    public int d;
    public boolean e;

    private a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910c4363d7b7eb605177d07ea68573f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910c4363d7b7eb605177d07ea68573f8");
            return;
        }
        this.c = 0;
        this.c = i;
        this.d = i2;
    }

    public static a a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85be9e77e918137b3074d105ea51792a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85be9e77e918137b3074d105ea51792a") : new a(i, i2);
    }

    public final boolean a() {
        return this.c == 1;
    }

    public final boolean b() {
        return this.c == 2;
    }

    public final boolean c() {
        return this.c == 5;
    }

    public final boolean d() {
        return this.c == 3;
    }

    public final boolean e() {
        return this.c == 4;
    }
}
