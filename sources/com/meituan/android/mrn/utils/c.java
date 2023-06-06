package com.meituan.android.mrn.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    @Deprecated
    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b2cde4ea9b47c462b3397fdd3d77175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b2cde4ea9b47c462b3397fdd3d77175");
        } else {
            a(str, (Map<String, String>) null, th);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21204b252a2f8bf89a91c57301c013b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21204b252a2f8bf89a91c57301c013b3");
            return;
        }
        p.a(str, str2);
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("MrnTag", str);
            Babel.logRT("MRNLog", str2, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Map<String, String> map, Throwable th) {
        Object[] objArr = {str, map, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8513e6cf399d8c59ab7bcb430be8e999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8513e6cf399d8c59ab7bcb430be8e999");
            return;
        }
        p.a(str, th, new Object[0]);
        try {
            Babel.logRT("MRNThrowable", Log.getStackTraceString(th), a(str, map));
        } catch (Throwable unused) {
        }
    }

    public static void a(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b24804379bfd0a3cf2aa1fa9dea5aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b24804379bfd0a3cf2aa1fa9dea5aac");
        } else {
            Babel.logRT(new Log.Builder(LogUtils.a((String) null, str2, th)).optional(a(str, (Map<String, String>) null)).generalChannelStatus(true).tag("MRNThrowable").build());
        }
    }

    public static void b(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbe4b8b6a2407dd6c322caf2aa129f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbe4b8b6a2407dd6c322caf2aa129f5e");
        } else {
            Babel.logRT(new Log.Builder(LogUtils.a((String) null, str2, th)).optional(a(str, (Map<String, String>) null)).generalChannelStatus(true).tag("MRNLog").build());
        }
    }

    private static Map<String, Object> a(@Nullable String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0a0d191c5d17926955010fd612176fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0a0d191c5d17926955010fd612176fe");
        }
        HashMap hashMap = new HashMap(1);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("MrnTag", str);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return hashMap;
    }
}
