package com.sankuai.waimai.mmp;

import com.meituan.mmp.main.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.City;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements k {
    public static ChangeQuickRedirect a;
    private static com.sankuai.meituan.city.a b = com.meituan.android.singleton.a.a();

    @Override // com.meituan.mmp.main.k
    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3243590ee243a844758eb0df9f1d9e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3243590ee243a844758eb0df9f1d9e")).longValue() : b.b();
    }

    @Override // com.meituan.mmp.main.k
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3b2f61ccd3be108e81b4f0a7ece120", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3b2f61ccd3be108e81b4f0a7ece120")).longValue() : b.c();
    }

    @Override // com.meituan.mmp.main.k
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "890e768f1500339ea39b66c3956a9925", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "890e768f1500339ea39b66c3956a9925");
        }
        com.sankuai.meituan.city.a aVar = b;
        City a2 = aVar.a(aVar.c());
        return a2 != null ? a2.name : "";
    }

    @Override // com.meituan.mmp.main.k
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14152232045d195d8466e8a5c52cb1db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14152232045d195d8466e8a5c52cb1db") : b.a();
    }
}
