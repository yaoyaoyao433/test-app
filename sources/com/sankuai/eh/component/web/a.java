package com.sankuai.eh.component.web;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static String b;

    public static JsonElement a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10e6cd204a5ef218ddca37ae9d3be40b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10e6cd204a5ef218ddca37ae9d3be40b");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return com.sankuai.ehcore.tools.a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4f56687873469d2f6bcabecf5b91d036", RobustBitConfig.DEFAULT_VALUE) ? (JsonArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4f56687873469d2f6bcabecf5b91d036") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(b), Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)), "url", str);
    }
}
