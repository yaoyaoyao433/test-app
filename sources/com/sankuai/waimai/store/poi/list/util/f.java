package com.sankuai.waimai.store.poi.list.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.ab;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a(@NotNull PoiVerticalityDataResponse.SecondFloor secondFloor, Context context, com.sankuai.waimai.store.manager.sequence.c cVar) {
        Object[] objArr = {secondFloor, context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69d87d7c22757ebefb6b836aeb1eae91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69d87d7c22757ebefb6b836aeb1eae91")).booleanValue();
        }
        if ((cVar == null || !cVar.h) && secondFloor.timesForActivity > 0 && !t.a(secondFloor.keyForActivity) && ab.b().b(context, secondFloor.keyForActivity, 0) < secondFloor.timesForActivity) {
            ab b = ab.b();
            StringBuilder sb = new StringBuilder();
            sb.append(secondFloor.keyForActivity);
            sb.append(secondFloor.keyForDay);
            return b.b(context, sb.toString(), 0) < secondFloor.timesForDay;
        }
        return false;
    }
}
