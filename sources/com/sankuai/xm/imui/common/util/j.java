package com.sankuai.xm.imui.common.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.integration.secondpage.ISecondPage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static ISecondPage a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eedc2bbf967cd8e849469cb25b277040", 6917529027641081856L) ? (ISecondPage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eedc2bbf967cd8e849469cb25b277040") : (ISecondPage) m.a(ISecondPage.class);
    }

    public static void a(Context context, String str, boolean z, String str2, long j, String str3, String str4) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, new Long(j), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "673ba56eefb2ce7e575e03f407e0d93e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "673ba56eefb2ce7e575e03f407e0d93e");
            return;
        }
        try {
            if (com.sankuai.xm.imui.localconfig.a.c().f()) {
                if (a() == null) {
                }
            }
        } catch (Exception e) {
            d.a(e, "SecondPageUtils::getWebViewPage", new Object[0]);
        }
    }
}
