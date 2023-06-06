package com.meituan.android.loader.impl.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.loader.impl.bean.DynLocalContainerBean;
import com.meituan.android.loader.impl.bean.DynLocalFileBean;
import com.meituan.android.loader.impl.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static String c;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af3c1fc38ad50a7dd9d2c33e3f9e996d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af3c1fc38ad50a7dd9d2c33e3f9e996d")).booleanValue() : TextUtils.equals("1.0", c);
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fa08eb8a1486f0ce51fecc741531120", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fa08eb8a1486f0ce51fecc741531120");
        }
        String a2 = com.meituan.android.soloader.utils.a.a();
        String str = Build.CPU_ABI;
        DynLocalContainerBean a3 = f.a(context);
        ArrayList arrayList = new ArrayList();
        if (a3 == null) {
            return null;
        }
        if (a3.getDynLocalFileBeanList() != null && !a3.getDynLocalFileBeanList().isEmpty()) {
            for (DynLocalFileBean dynLocalFileBean : a3.getDynLocalFileBeanList()) {
                if (a2.matches(dynLocalFileBean.abi) || str.matches(dynLocalFileBean.abi)) {
                    arrayList.add(dynLocalFileBean);
                }
            }
        }
        c = a3.getVersionName();
        b = a3.isEnableDevEnviroment();
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Gson().toJson(arrayList);
    }

    public static Set<String> b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ceeb8a4a8c3c40b799e8c0346d72bf5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ceeb8a4a8c3c40b799e8c0346d72bf5a");
        }
        HashSet hashSet = new HashSet();
        String a2 = com.meituan.android.soloader.utils.a.a();
        String str = Build.CPU_ABI;
        DynLocalContainerBean a3 = f.a(context);
        if (a3 == null) {
            return null;
        }
        if (a3.getDynLocalFileBeanList() != null && !a3.getDynLocalFileBeanList().isEmpty()) {
            for (DynLocalFileBean dynLocalFileBean : a3.getDynLocalFileBeanList()) {
                if (a2.matches(dynLocalFileBean.abi) || str.matches(dynLocalFileBean.abi)) {
                    hashSet.add(dynLocalFileBean.bundleName);
                }
            }
        }
        return hashSet;
    }
}
