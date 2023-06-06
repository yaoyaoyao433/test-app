package com.meituan.android.customerservice.callbase.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SharedPreferenceUtils {
    public static final String CS_CALLBASE_LOG = "cs_callbase_log";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static SharedPreferences getCallBaseSP(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24d7badb075497a1f97ba110f0ba2d24", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24d7badb075497a1f97ba110f0ba2d24") : context.getSharedPreferences(CS_CALLBASE_LOG, 0);
    }

    public static void putInt(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "382d2340769b9d3aaa580198cd436003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "382d2340769b9d3aaa580198cd436003");
        } else {
            getCallBaseSP(context).edit().putInt(str, i).apply();
        }
    }

    public static void putString(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df05bf9376a7e702176bc64980e0bcfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df05bf9376a7e702176bc64980e0bcfd");
        } else {
            getCallBaseSP(context).edit().putString(str, str2).apply();
        }
    }

    public static int getLoginStatus(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c2505a4179eda4f4177ea73e799c3b9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c2505a4179eda4f4177ea73e799c3b9")).intValue() : getCallBaseSP(context).getInt("loginstatus", -1);
    }

    public static int getCallStyle(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60bb7663a62a2d5655159ca97820304c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60bb7663a62a2d5655159ca97820304c")).intValue() : getCallBaseSP(context).getInt("callStyle", 1);
    }

    public static int getVCtype(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e65050c49483798e94671f0790e57a3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e65050c49483798e94671f0790e57a3")).intValue() : getCallBaseSP(context).getInt("vcType", 1);
    }
}
