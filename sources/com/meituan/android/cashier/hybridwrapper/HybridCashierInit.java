package com.meituan.android.cashier.hybridwrapper;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.android.neohybrid.neo.tunnel.a;
import com.meituan.android.paybase.utils.ac;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.android.paymentchannel.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridCashierInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8cb6a794a0eea2c235fc0e0c97fa78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8cb6a794a0eea2c235fc0e0c97fa78");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "54ef0ef7e1c1d26ced92f0d69c2a58ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "54ef0ef7e1c1d26ced92f0d69c2a58ac");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("app_pay_sdk_version", "10.1.0");
            hashMap.put("device_upse_pay_type", b.b(context));
            a.a().a((Map<String, ?>) hashMap);
        }
        c(context);
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d985eafd655b0e4b6778832d95ab6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d985eafd655b0e4b6778832d95ab6e1");
            return;
        }
        c(context);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "593e164132c3294b2916a5fbc8126da1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "593e164132c3294b2916a5fbc8126da1");
        } else if (b.d()) {
            b.a(com.meituan.android.paybase.config.a.d().a());
        }
    }

    private static void c(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc7bd19c611809595a02b1c9aa235de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc7bd19c611809595a02b1c9aa235de6");
            return;
        }
        final q b = ac.b(context);
        int b2 = b.b("installed_apps", -1);
        String b3 = b.b("is_root", "-1");
        HashMap hashMap = new HashMap();
        hashMap.put("device_install_apps", Integer.valueOf(b2));
        hashMap.put("device_rooted", b3);
        hashMap.put("device_upse_pay_type", b.b(context));
        a.a().a((Map<String, ?>) hashMap);
        new com.meituan.android.paybase.asynctask.a<String, Integer, Integer>() { // from class: com.meituan.android.cashier.hybridwrapper.HybridCashierInit.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.asynctask.b
            public final /* synthetic */ Object a(Object[] objArr2) {
                Object[] objArr3 = {(String[]) objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "df7854d27415685660464d0fa60d36bc", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "df7854d27415685660464d0fa60d36bc");
                }
                q.this.a("is_root", ah.a() ? "1" : "0");
                int a2 = com.meituan.android.paymentchannel.utils.a.a(context);
                q.this.a("installed_apps", a2);
                return Integer.valueOf(a2);
            }
        }.b(new String[0]);
    }
}
