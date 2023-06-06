package com.sankuai.android.share.util;

import android.content.Context;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static com.sankuai.android.share.interfaces.b a(Context context, b.a aVar, ShareBaseBean shareBaseBean, com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7fcde21cb99f4d7b13620a64e45a12d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.android.share.interfaces.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7fcde21cb99f4d7b13620a64e45a12d");
        }
        if (aVar == b.a.SINA_WEIBO) {
            cVar.a(aVar, c.a.FAILED);
            return null;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "47f838c19aa20905820e67acff1f5b16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "47f838c19aa20905820e67acff1f5b16");
        } else {
            SDKInfoManager.a("share-sdk").a(context, "5.23.49", !b ? 1 : 0, new com.sankuai.android.share.common.a(context, b));
        }
        com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", null, "1"), LyingkitKernel_share.SHARE_SINGLECHANNELSERVICE_SINGLE, context, aVar, shareBaseBean, cVar);
        return null;
    }
}
