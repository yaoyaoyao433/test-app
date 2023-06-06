package com.sankuai.waimai.imbase.listener.manager;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public SparseArray<com.sankuai.waimai.imbase.listener.a> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e0e4e809a67e3c86d12845ab6781b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e0e4e809a67e3c86d12845ab6781b1");
        } else {
            this.b = new SparseArray<>();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ede25408028c9ae871439b81437f41d0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ede25408028c9ae871439b81437f41d0") : C0961a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.listener.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0961a {
        private static final a a = new a();
    }

    public final com.sankuai.waimai.imbase.listener.a a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3f913d36f1d6d10dc02e51325888a6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.listener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3f913d36f1d6d10dc02e51325888a6") : this.b.get(s);
    }
}
