package com.sankuai.waimai.platform.widget.tag.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(i iVar, Map<String, String> map) {
        Object[] objArr = {iVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb0a94755bea8da1cda1be812ff4c18c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb0a94755bea8da1cda1be812ff4c18c");
        } else if (iVar == null) {
        } else {
            iVar.a("key_view_expose_info", map);
        }
    }

    public static void b(i iVar, Map<String, String> map) {
        Object[] objArr = {iVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24af177efc4d4b1ecf3d027219a1940f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24af177efc4d4b1ecf3d027219a1940f");
        } else if (iVar == null) {
        } else {
            iVar.a("key_click_expose_info", map);
        }
    }
}
