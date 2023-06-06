package com.sankuai.waimai.store.manager.coupon;

import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public final List<InterfaceC1222a> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.manager.coupon.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1222a {
        void a(long j, String str, int i);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb2c636273c9a569ad47a0cd1fac9cc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb2c636273c9a569ad47a0cd1fac9cc0");
        } else {
            this.b = new ArrayList();
        }
    }

    @MainThread
    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e4ec5aaa1e694c7f436ea831f30cf23", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e4ec5aaa1e694c7f436ea831f30cf23");
        }
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public final void a(long j, String str, int i, String str2) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e541eca91bbdd2c6779f7b58fee42cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e541eca91bbdd2c6779f7b58fee42cba");
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).a(j, str, 1);
        }
    }

    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3520e4ca2ebb71c52251b16ab37ddb82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3520e4ca2ebb71c52251b16ab37ddb82");
            return;
        }
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).a(j, str, 0);
        }
    }
}
