package com.meituan.android.legwork.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t {
    public static ChangeQuickRedirect a;

    public static Intent a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b71b88d0520c029c80c37ac0b66c9c57", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b71b88d0520c029c80c37ac0b66c9c57");
        }
        if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return null;
        }
        Uri data = activity.getIntent().getData();
        if (TextUtils.equals(com.meituan.android.legwork.ui.base.c.a(data), com.meituan.android.legwork.a.a().getString(R.string.legwork_scheme_path_order_detail))) {
            HashMap hashMap = new HashMap();
            for (String str : data.getQueryParameterNames()) {
                hashMap.put(str, data.getQueryParameter(str));
            }
            return com.meituan.android.legwork.mrn.b.a().b(activity, "legwork-order-detail", "legwork-order-detail", hashMap);
        }
        return null;
    }
}
