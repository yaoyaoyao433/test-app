package com.sankuai.waimai.drug.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aeb9e749ce3064434685bf6aa26dfd70", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aeb9e749ce3064434685bf6aa26dfd70");
        }
        String str = aVar.b == null ? "" : aVar.b.abExpInfo;
        String str2 = com.sankuai.waimai.store.order.a.e().k(aVar.d()).h;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + ";" + str2;
    }
}
