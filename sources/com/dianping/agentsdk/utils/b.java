package com.dianping.agentsdk.utils;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static int a(String str, int i, Fragment fragment) {
        Object[] objArr = {str, 0, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "703329b2e6d595dc35c4842586a8914f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "703329b2e6d595dc35c4842586a8914f")).intValue();
        }
        if (fragment.getArguments() != null && fragment.getArguments().containsKey(str)) {
            return fragment.getArguments().getInt(str);
        }
        Intent intent = fragment.getActivity().getIntent();
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Integer.parseInt(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.a(intent, str, 0);
    }

    public static int a(String str, Fragment fragment) {
        Object[] objArr = {str, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38f3ae54a3cac7984182b695f7f772bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38f3ae54a3cac7984182b695f7f772bf")).intValue() : a(str, 0, fragment);
    }

    public static boolean a(String str, boolean z, Fragment fragment) {
        Object[] objArr = {str, (byte) 1, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c8bd0db099657e8a4784359a1953202", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c8bd0db099657e8a4784359a1953202")).booleanValue();
        }
        if (fragment.getArguments() != null && fragment.getArguments().containsKey(str)) {
            return fragment.getArguments().getBoolean(str);
        }
        Intent intent = fragment.getActivity().getIntent();
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Boolean.parseBoolean(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.a(intent, str, true);
    }
}
