package com.sankuai.android.share.service;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareExtraInfo;
import com.sankuai.android.share.common.util.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(@NonNull ShareExtraInfo shareExtraInfo, Context context) {
        Object[] objArr = {shareExtraInfo, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a204c0967ab98f382b14ee40ec2eb9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a204c0967ab98f382b14ee40ec2eb9f")).booleanValue();
        }
        if (c.c(context)) {
            return a(shareExtraInfo, context, "com.tencent.mm");
        }
        return false;
    }

    public static boolean b(@NonNull ShareExtraInfo shareExtraInfo, Context context) {
        Object[] objArr = {shareExtraInfo, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f2b768904ab66dfa0e8ca29db9939f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f2b768904ab66dfa0e8ca29db9939f9")).booleanValue();
        }
        if (c.d(context)) {
            return a(shareExtraInfo, context, "com.tencent.mobileqq");
        }
        return false;
    }

    private static boolean a(@NonNull ShareExtraInfo shareExtraInfo, Context context, String str) {
        Object[] objArr = {shareExtraInfo, context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "174751a8c63f9c769dee642b43322272", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "174751a8c63f9c769dee642b43322272")).booleanValue();
        }
        LyingkitZone lyingkitZone = new LyingkitZone("share", "5.15.2", null, "1");
        lyingkitZone.a(shareExtraInfo);
        Object a2 = com.meituan.android.nom.lyingkit.b.a(lyingkitZone, LyingkitKernel_share.SHARE_UTILSERVICE_ISAPPINSTALL, context, str);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }
}
