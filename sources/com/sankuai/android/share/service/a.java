package com.sankuai.android.share.service;

import android.app.Activity;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareChannelData;
import com.sankuai.android.share.interfaces.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, ShareChannelData shareChannelData, c cVar) {
        Object[] objArr = {activity, shareChannelData, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acc07c04544fddf9e5fa6e580b0662ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acc07c04544fddf9e5fa6e580b0662ee");
        } else if (shareChannelData.shareBaseBean == null || shareChannelData.shareExtraInfo == null) {
        } else {
            LyingkitZone lyingkitZone = new LyingkitZone("share", "5.15.2", null, "1");
            lyingkitZone.a(shareChannelData.shareExtraInfo);
            com.meituan.android.nom.lyingkit.b.a(lyingkitZone, LyingkitKernel_share.SHARE_SINGLECHANNELSERVICE_SINGLE, activity, shareChannelData.shareType, shareChannelData.shareBaseBean, null);
        }
    }
}
