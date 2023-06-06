package com.sankuai.waimai.business.restaurant.goodsdetail.constants;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e75da2599e45ce3cac3016535bee6693", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e75da2599e45ce3cac3016535bee6693") : new GsonBuilder().serializeSpecialFloatingPointValues().create();
    }
}
