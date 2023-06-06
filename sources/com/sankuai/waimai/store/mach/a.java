package com.sankuai.waimai.store.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull com.sankuai.waimai.mach.node.a aVar, @NonNull List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21da44b91692acefc8e3cd89fa459eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21da44b91692acefc8e3cd89fa459eec");
            return;
        }
        if (a(aVar)) {
            list.add(aVar);
        }
        List<com.sankuai.waimai.mach.node.a> b = aVar.b();
        if (com.sankuai.shangou.stone.util.a.b(b)) {
            return;
        }
        for (int i = 0; i < b.size(); i++) {
            com.sankuai.waimai.mach.node.a aVar2 = b.get(i);
            if (aVar2 != null) {
                a(aVar2, list);
            }
        }
    }

    public static void b(@NonNull com.sankuai.waimai.mach.node.a aVar, @NonNull List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e1310b176bab523296f0cef3309695d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e1310b176bab523296f0cef3309695d");
            return;
        }
        if (e(aVar) && a(aVar)) {
            list.add(aVar);
        }
        List<com.sankuai.waimai.mach.node.a> b = aVar.b();
        if (!e(aVar) || com.sankuai.shangou.stone.util.a.b(b)) {
            return;
        }
        for (int i = 0; i < b.size(); i++) {
            com.sankuai.waimai.mach.node.a aVar2 = b.get(i);
            if (aVar2 != null && e(aVar2)) {
                b(aVar2, list);
            }
        }
    }

    private static boolean e(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4940961563ea5b117d4160511facba0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4940961563ea5b117d4160511facba0")).booleanValue() : (d(aVar) || c(aVar)) ? false : true;
    }

    public static boolean a(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a9ccf6f5433c1ba7d06a614b96f7095", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a9ccf6f5433c1ba7d06a614b96f7095")).booleanValue() : aVar.g() != null && (aVar.k() || aVar.l() || aVar.m() || aVar.n());
    }

    public static boolean b(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a08b9afff43892b5e6e6d3d63a3a1d5f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a08b9afff43892b5e6e6d3d63a3a1d5f")).booleanValue() : ConfigInfo.MODULE_KING_KONG.equals(aVar.j) || (aVar.h instanceof com.sankuai.waimai.store.mach.kingkongscroller.c);
    }

    public static boolean c(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "696cfab16525fb5c67d86268507a71d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "696cfab16525fb5c67d86268507a71d1")).booleanValue() : "swiper".equals(aVar.j) || (aVar.h instanceof com.sankuai.waimai.store.mach.swiper.a) || (aVar.h instanceof com.sankuai.waimai.mach.component.swiper.b);
    }

    public static boolean d(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5959ac0036a25eea4918c9d9da62a14f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5959ac0036a25eea4918c9d9da62a14f")).booleanValue() : "scroller".equals(aVar.j) || (aVar.h instanceof com.sankuai.waimai.mach.component.scroller.b);
    }
}
