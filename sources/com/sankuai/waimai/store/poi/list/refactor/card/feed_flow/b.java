package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(List<CategoryInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cde573f2c13b571cd8654b4f03173bd6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cde573f2c13b571cd8654b4f03173bd6")).booleanValue() : com.sankuai.shangou.stone.util.a.a((List) list) > 1;
    }

    public static boolean a(@NonNull com.sankuai.waimai.store.param.a aVar, List<CategoryInfo> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "745a4bf4d63328a0341980faffb11fd2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "745a4bf4d63328a0341980faffb11fd2")).booleanValue() : (!aVar.l() || aVar.y) && !a(list);
    }

    public static boolean b(List<CategoryInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ef4d3aaf37948e6e0bb76f14b8e871e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ef4d3aaf37948e6e0bb76f14b8e871e")).booleanValue() : com.sankuai.shangou.stone.util.a.a((List) list) > 0;
    }
}
