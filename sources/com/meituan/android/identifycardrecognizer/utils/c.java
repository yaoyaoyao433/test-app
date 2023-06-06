package com.meituan.android.identifycardrecognizer.utils;

import android.text.TextUtils;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str, Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dce099ebb166f131070a2f04458a3248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dce099ebb166f131070a2f04458a3248");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, exc instanceof PayException ? ((PayException) exc).getCode() : -9753);
        }
    }

    public static HashMap<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc1a862dd1c2520c7aac2216b173c5e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc1a862dd1c2520c7aac2216b173c5e6");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("bizId", b.a());
        if (!TextUtils.isEmpty(b.e)) {
            hashMap.put("customerId", b.e);
        }
        return hashMap;
    }
}
