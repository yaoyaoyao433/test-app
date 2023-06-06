package com.sankuai.meituan.takeoutnew.util.aop;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static String a(com.squareup.okhttp.internal.io.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "553fb861d8d001b728e2ed477afae1ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "553fb861d8d001b728e2ed477afae1ff");
        }
        try {
            String str = bVar.a.a.a.b;
            if (str.startsWith("p") || str.startsWith(SocialConstants.PARAM_IMG_URL)) {
                if (str.endsWith(".meituan.net")) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
