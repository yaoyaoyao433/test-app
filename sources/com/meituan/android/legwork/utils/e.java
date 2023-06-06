package com.meituan.android.legwork.utils;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "547f14bcfd63d54deb78f876a1eda3af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "547f14bcfd63d54deb78f876a1eda3af");
        } else if (TextUtils.isEmpty(str)) {
            x.e("CallUtil.callUp()", "Phone num is empty!");
        } else if (com.meituan.android.legwork.a.d == null || com.meituan.android.legwork.a.d.get() == null) {
        } else {
            try {
                ((FragmentActivity) com.meituan.android.legwork.a.d.get()).startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
            } catch (Exception e) {
                x.e("CallUtil.callUp()", "call failed, exception msg:", e);
            }
        }
    }
}
