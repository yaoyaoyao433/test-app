package com.sankuai.waimai.alita.core.jsexecutor.task;

import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(a aVar, String str, String str2, Value value) {
        String str3;
        Object[] objArr = {aVar, str, str2, value};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13245a43089418e7689b7cd400272134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13245a43089418e7689b7cd400272134");
            return;
        }
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ca88a00966ecee9f792d242c2b65ca46", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ca88a00966ecee9f792d242c2b65ca46");
        } else if (str2 == null || str2.isEmpty()) {
            str3 = str2;
        } else {
            str3 = "set" + str2.substring(0, 1).toUpperCase() + str2.substring(1);
        }
        aVar.a(String.format("this.%s.%s = function(v){this.%s = v;};", str, str3, str2));
        aVar.a(str3, new Value[]{value});
    }
}
