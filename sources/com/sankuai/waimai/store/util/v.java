package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class v {
    public static ChangeQuickRedirect a;
    public static final boolean b = com.sankuai.waimai.store.config.k.c();
    public static final boolean c = com.sankuai.waimai.store.config.k.d();
    public static final boolean d = com.sankuai.waimai.store.config.k.e();

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        T a();

        T b();

        T c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b<T> {
        T a();

        T b();

        T c();

        T d();
    }

    public static <T> T a(a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb59d6bcd73dc3fd37f6724843316ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb59d6bcd73dc3fd37f6724843316ec5");
        }
        if (com.sankuai.shangou.stone.util.p.a(aVar)) {
            return null;
        }
        if (b) {
            return aVar.b();
        }
        if (c) {
            return aVar.c();
        }
        if (d) {
            return aVar.a();
        }
        return null;
    }

    public static <T> T a(b<T> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2104f46035ee20601c921ab83caa976c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2104f46035ee20601c921ab83caa976c");
        }
        if (com.sankuai.shangou.stone.util.p.a(bVar)) {
            return null;
        }
        if (b) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.appinfo.a.a;
            if ("sg_android".equals(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5279730dc6d5111bd6e346073cff4d5e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5279730dc6d5111bd6e346073cff4d5e") : com.sankuai.waimai.foundation.core.common.a.a().g())) {
                return bVar.b();
            }
            return bVar.c();
        } else if (c) {
            return bVar.d();
        } else {
            if (d) {
                return bVar.a();
            }
            return null;
        }
    }
}
