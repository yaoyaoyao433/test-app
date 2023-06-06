package com.sankuai.waimai.foundation.utils;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class aa {
    public static ChangeQuickRedirect a;

    public static String a(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c874a80da7eb8bb3b2a19ce65a8f9cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c874a80da7eb8bb3b2a19ce65a8f9cb");
        }
        if (bundle == null) {
            return StringUtil.NULL;
        }
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = bundle.keySet();
        sb.append("[ ");
        for (String str : keySet) {
            Object obj = bundle.get(str);
            if (z) {
                z = false;
            } else {
                sb.append(" | ");
            }
            sb.append(str);
            sb.append(" : ");
            sb.append(obj);
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b278d26b08f5d1270bc001e9849c952e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b278d26b08f5d1270bc001e9849c952e")).booleanValue() : TextUtils.isEmpty(str) || StringUtil.NULL.equals(str);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c88d808dbc75584f46ffb916fde2a954", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c88d808dbc75584f46ffb916fde2a954");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(0, 3) + "****" + str.substring(7, str.length());
    }

    public static String a(@NonNull String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2eb32fb5c909a45c2c55db0e82ec6e53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2eb32fb5c909a45c2c55db0e82ec6e53");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(";");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
