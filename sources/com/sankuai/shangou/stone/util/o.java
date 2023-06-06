package com.sankuai.shangou.stone.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5311c0c2cb600a846b92657026521e67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5311c0c2cb600a846b92657026521e67")).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo == null || !activeNetworkInfo.isAvailable();
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        NetworkInfo networkInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c91cb45a82a3d24f909918489b94bc04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c91cb45a82a3d24f909918489b94bc04")).booleanValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a6280373168db2914d249f1d7a210530", RobustBitConfig.DEFAULT_VALUE)) {
            networkInfo = (NetworkInfo) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a6280373168db2914d249f1d7a210530");
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
        }
        return networkInfo != null && networkInfo.isAvailable();
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47f355ac3887f371a50adbb2a2e75c69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47f355ac3887f371a50adbb2a2e75c69")).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
    }
}
