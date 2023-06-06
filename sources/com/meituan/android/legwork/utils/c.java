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
public final class c {
    public static ChangeQuickRedirect a;

    public static Intent a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b32364d22846b071c639ed707e0626f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b32364d22846b071c639ed707e0626f3");
        }
        if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return null;
        }
        Uri data = activity.getIntent().getData();
        String queryParameter = data.getQueryParameter("paotui_pagecnt");
        String a2 = com.meituan.android.legwork.ui.base.c.a(data);
        String string = com.meituan.android.legwork.a.a().getString(R.string.legwork_scheme_path_homepage);
        String string2 = com.meituan.android.legwork.a.a().getString(R.string.legwork_scheme_path_homepage_two);
        if (TextUtils.equals(queryParameter, "b")) {
            if (TextUtils.equals(a2, string) || TextUtils.equals(a2, string2)) {
                HashMap hashMap = new HashMap();
                for (String str : data.getQueryParameterNames()) {
                    hashMap.put(str, data.getQueryParameter(str));
                }
                return com.meituan.android.legwork.mrn.b.a().b(activity, "legwork-buy-home", "legwork-buy-home", hashMap);
            }
            return null;
        }
        return null;
    }
}
