package com.meituan.android.httpdns.business;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.httpdns.IConfigInit;
import com.meituan.android.httpdns.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConfigInitImpl implements IConfigInit {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.httpdns.IConfigInit
    public final void a(Context context, String str, final IConfigInit.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d20b03f96dd20fc374b2a3a4d6c3a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d20b03f96dd20fc374b2a3a4d6c3a6");
            return;
        }
        new StringBuilder("horn fetchConfig ing cityId:").append(str);
        Horn.init(context);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("ci", str);
        }
        Horn.register("httpdns_sdk", new HornCallback() { // from class: com.meituan.android.httpdns.business.ConfigInitImpl.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f517d9ab210bd772455ce6431833f47", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f517d9ab210bd772455ce6431833f47");
                    return;
                }
                h.a aVar2 = null;
                if (z && !TextUtils.isEmpty(str2)) {
                    aVar2 = ConfigInitImpl.b(str2);
                    if (aVar != null) {
                        aVar.a(aVar2);
                    }
                }
                try {
                    a.a(aVar2, z, str2);
                } catch (Throwable th) {
                    DefaultDnsListener.d = Log.getStackTraceString(th);
                }
            }
        }, hashMap);
        String accessCache = Horn.accessCache("httpdns_sdk");
        h.a aVar2 = null;
        if (!TextUtils.isEmpty(accessCache)) {
            aVar2 = b(accessCache);
            aVar.a(aVar2);
        }
        try {
            a.a(aVar2, accessCache);
        } catch (Throwable th) {
            DefaultDnsListener.d = Log.getStackTraceString(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d1c65ea8fb70a172e31f2fb32b9ffb1", 6917529027641081856L)) {
            return (h.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d1c65ea8fb70a172e31f2fb32b9ffb1");
        }
        try {
            return (h.a) new Gson().fromJson(str, (Class<Object>) h.a.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
