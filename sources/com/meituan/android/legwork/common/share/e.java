package com.meituan.android.legwork.common.share;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str, PtShareBean ptShareBean, PtBaseShare.OnShareListener onShareListener) {
        Object[] objArr = {activity, str, ptShareBean, onShareListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac83f0cf7ffb407a48aa75c95ec6927f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac83f0cf7ffb407a48aa75c95ec6927f");
        } else if (ptShareBean == null) {
        } else {
            new c().a(activity, ptShareBean.channel, ptShareBean, onShareListener, str);
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c378e959d390b5eaef1f9d4b2d9bd17", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c378e959d390b5eaef1f9d4b2d9bd17")).booleanValue() : a(context, "com.tencent.mm");
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8e168fa1775c2f79cf39239bb6649ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8e168fa1775c2f79cf39239bb6649ef")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            x.e("PtShareUtil.isAppInstall()", "exception msg:", e);
            return false;
        }
    }
}
