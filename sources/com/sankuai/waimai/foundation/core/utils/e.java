package com.sankuai.waimai.foundation.core.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(Intent intent) {
        boolean z = false;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e036921e8374ea0c59e9dc7008485c9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e036921e8374ea0c59e9dc7008485c9a");
        }
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                if (com.sankuai.waimai.foundation.core.utils.constant.a.a.contains(data.getPath())) {
                    z = true;
                } else {
                    str = data.getQueryParameter("linkIdentifierInfo");
                }
            }
            return (!TextUtils.isEmpty(str) || z) ? str : com.sankuai.waimai.platform.utils.f.a(intent, "linkIdentifierInfo");
        }
        return null;
    }

    public static void a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b652f0c1ad26d3adc2fdec77a6538fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b652f0c1ad26d3adc2fdec77a6538fd7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Uri data = intent.getData();
            if (data != null) {
                if (TextUtils.isEmpty(data.getQueryParameter("linkIdentifierInfo"))) {
                    Uri.Builder buildUpon = data.buildUpon();
                    buildUpon.appendQueryParameter("linkIdentifierInfo", str);
                    intent.setData(buildUpon.build());
                }
            } else if (intent.hasExtra("linkIdentifierInfo")) {
            } else {
                intent.putExtra("linkIdentifierInfo", str);
            }
        }
    }
}
