package com.sankuai.waimai.alita.core.mlmodel.operator.util;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.operator.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(d dVar, List<Object> list) {
        Object[] objArr = {dVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a3e8c2c8407cb4cbe2b011229fde7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a3e8c2c8407cb4cbe2b011229fde7fd");
        } else if (dVar != null) {
            dVar.a(list);
        }
    }

    public static void a(d dVar, @Nullable Exception exc) {
        Object[] objArr = {dVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e513f654b9e90cd93da8901bdaaa51af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e513f654b9e90cd93da8901bdaaa51af");
        } else if (dVar != null) {
            dVar.a(exc);
        }
    }
}
