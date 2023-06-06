package com.sankuai.waimai.store.mrn.shopcartbridge.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class k {
    public static ChangeQuickRedirect e;
    public final String f;
    public final String g;

    public k(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0cade2c1e57f71390cc703bd24b9d48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0cade2c1e57f71390cc703bd24b9d48");
            return;
        }
        this.f = str;
        this.g = str2;
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01238f49f44c824288e404b205735846", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01238f49f44c824288e404b205735846")).booleanValue() : a(r.a(str, 0L), str2);
    }

    public final boolean a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8326eae452a19d93ee87ecf93235306", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8326eae452a19d93ee87ecf93235306")).booleanValue() : com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, this.g, j, r.a(this.f, 0L));
    }
}
