package com.meituan.android.paymentchannel.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.paybase.moduleinterface.payment.OnGotUPPayResult;
import com.meituan.android.paybase.moduleinterface.payment.UPPayAPI;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    public static UPPayAPI a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf64549e6adeca75919d8d064f777b99", RobustBitConfig.DEFAULT_VALUE)) {
            return (UPPayAPI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf64549e6adeca75919d8d064f777b99");
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = com.sankuai.meituan.serviceloader.b.a(UPPayAPI.class, "UPPayHandle");
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "UPPayUtil_getUPPayAPI", (Map<String, Object>) null);
        }
        if (CollectionUtils.isEmpty(arrayList)) {
            return null;
        }
        return (UPPayAPI) arrayList.get(0);
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fa9674817cfe81d4482f77be3770089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fa9674817cfe81d4482f77be3770089");
        } else if (a() != null) {
            com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
            if (cVar != null ? cVar.f : false) {
                new com.meituan.android.paybase.asynctask.a<String, String, String>() { // from class: com.meituan.android.paymentchannel.utils.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paybase.asynctask.b
                    public final /* synthetic */ Object a(Object[] objArr2) {
                        Object[] objArr3 = {(String[]) objArr2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "90586e6ad4b5073f7b3b82bd9ff78d41", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "90586e6ad4b5073f7b3b82bd9ff78d41");
                        }
                        Looper.prepare();
                        b.a().b(context);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() { // from class: com.meituan.android.paymentchannel.utils.b.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "9f858d6a4bdeb151550e174da4013d65", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "9f858d6a4bdeb151550e174da4013d65");
                                } else if (handler.getLooper() != null) {
                                    if (Build.VERSION.SDK_INT >= 18) {
                                        handler.getLooper().quitSafely();
                                    } else {
                                        handler.getLooper().quit();
                                    }
                                }
                            }
                        }, 15000L);
                        Looper.loop();
                        return null;
                    }
                }.b(new String[0]);
            } else {
                a().b(context);
            }
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5092576b76b7fec44a88ac83e674ee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5092576b76b7fec44a88ac83e674ee6");
        } else if (a() != null) {
            a().e();
        }
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b7b41d1263342cc7f2d35ed1885cc2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b7b41d1263342cc7f2d35ed1885cc2b")).booleanValue();
        }
        if (a() != null) {
            return a().f();
        }
        return true;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "212fb1e4546422dc2387f1aff1a12ab0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "212fb1e4546422dc2387f1aff1a12ab0")).booleanValue();
        }
        if (a() != null) {
            return a().h();
        }
        return true;
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc7b025dd4daa19d5ff3441f2cf1d9a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc7b025dd4daa19d5ff3441f2cf1d9a8");
        }
        if (a() != null) {
            return a().a(context);
        }
        return null;
    }

    public static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b118c47086d22a716f86eaf2f25726", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b118c47086d22a716f86eaf2f25726");
        }
        if (a() != null) {
            return a().g();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    public static void a(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96df93f287ecdd6c74d5763fdfa9a6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96df93f287ecdd6c74d5763fdfa9a6a9");
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = com.sankuai.meituan.serviceloader.b.a(OnGotUPPayResult.class, "uppayMgeUtils");
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "UPPayUtil_dealUPPayResult", (Map<String, Object>) null);
        }
        if (CollectionUtils.isEmpty(arrayList)) {
            return;
        }
        ((OnGotUPPayResult) arrayList.get(0)).a(i, intent);
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f471e84459427cabca5788d88ceb794", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f471e84459427cabca5788d88ceb794")).booleanValue();
        }
        if (a() != null) {
            return com.meituan.android.paybase.utils.a.a(context, "com.unionpay");
        }
        return false;
    }
}
