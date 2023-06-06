package com.meituan.android.customerservice.callbase.csmonitor;

import android.content.Context;
import com.dianping.monitor.h;
import com.dianping.monitor.impl.m;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.customerservice.callbase.utils.SharedPreferenceUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b b;
    public m c;
    public String d;
    public Context e;
    public short f;

    public a() {
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99750f089eb9bd2ad505806ff18a18ee", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99750f089eb9bd2ad505806ff18a18ee") : C0237a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.callbase.csmonitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0237a {
        private static final a a = new a();
    }

    public final void a(int i, int i2, HashMap<String, Object> hashMap, String... strArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), hashMap, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e511db710d20c6407b75fd40fa1cec6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e511db710d20c6407b75fd40fa1cec6e");
        } else if (strArr.length > 0 && this.b != null) {
            HashMap<String, Object> hashMap2 = hashMap == null ? new HashMap<>() : hashMap;
            hashMap2.put("uid", this.d);
            hashMap2.put("unionid", this.b.getUnionid());
            hashMap2.put("loginstatus", Integer.valueOf(SharedPreferenceUtils.getLoginStatus(this.e)));
            hashMap2.put("callStyle", Integer.valueOf(SharedPreferenceUtils.getCallStyle(this.e)));
            hashMap2.put("vcType", Integer.valueOf(SharedPreferenceUtils.getVCtype(this.e)));
            hashMap2.put(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.f));
            String json = new Gson().toJson(hashMap2);
            for (String str : strArr) {
                this.b.pv4(0L, str, 0, 0, i + 10000, 0, 0, i2, null, json);
            }
        }
    }

    public final void a(String str, float f, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, Float.valueOf(f), hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c48189de940d99c2f3e6e9324b256c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c48189de940d99c2f3e6e9324b256c");
            return;
        }
        hashMap.put("sysVersion", h.b());
        try {
            this.c.a(str, Collections.singletonList(Float.valueOf(f)));
            new Gson();
            for (String str2 : hashMap.keySet()) {
                this.c.a(str2, String.valueOf(hashMap.get(str2)));
            }
            this.c.a();
        } catch (Exception unused) {
        }
    }
}
