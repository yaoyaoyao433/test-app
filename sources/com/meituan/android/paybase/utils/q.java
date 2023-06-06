package com.meituan.android.paybase.utils;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, Object> b = new HashMap<>();

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b994c3c2d8fb021e5f03e9e6383f1077", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b994c3c2d8fb021e5f03e9e6383f1077");
        }
        String valueOf = obj != null ? String.valueOf(obj.hashCode()) : "";
        if (TextUtils.isEmpty(valueOf) || b.containsKey(valueOf)) {
            valueOf = b();
        }
        if (b.containsKey(valueOf)) {
            ae.a("cashier_intentlargeobjecttransaction_uniquekey_repeat", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "IntentLargeObjectTransaction_setBigObjectWithUniqueKeyReturned");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        }
        b.put(valueOf, obj);
        return valueOf;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ec6ac32c3260f7ad8e94d48d8d3a552", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ec6ac32c3260f7ad8e94d48d8d3a552");
        }
        try {
            String a2 = s.a(UUID.randomUUID().toString());
            return a2.substring(a2.length() / 2);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "ActivityLargeObjectTransaction_getUniqueKey", (Map<String, Object>) null);
            return "";
        }
    }

    public static Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99e469956fc87c92f221acb24dc48b11", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99e469956fc87c92f221acb24dc48b11");
        }
        Object remove = b.remove(str);
        if (remove == null) {
            ae.a("cashier_intentlargeobjecttransaction_getbigobject_empty", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "IntentLargeObjectTransaction_getBigObject");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        }
        return remove;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64525629284bcd48bc9c3c3013da84b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64525629284bcd48bc9c3c3013da84b1");
            return;
        }
        if (b.size() != 0) {
            ae.a("cashier_intentlargeobjecttransaction_error", (Map<String, Object>) null, (List<Float>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "IntentLargeObjectTransaction_clear");
            ae.a(null, "b_pay_5l3pq2aw_sc", hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        }
        b.clear();
    }
}
