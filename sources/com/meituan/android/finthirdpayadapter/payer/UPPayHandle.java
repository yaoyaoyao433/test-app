package com.meituan.android.finthirdpayadapter.payer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.payment.UPPayAPI;
import com.meituan.android.paybase.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.UPPayAssistEx;
import com.unionpay.UPQuerySEPayInfoCallback;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class UPPayHandle implements UPPayAPI {
    public static ChangeQuickRedirect a;
    private static String b;
    private static String c;
    private static String d;
    private static c e;
    private static b f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2, int i, Bundle bundle);

        void a(String str, String str2, String str3, String str4);
    }

    public static /* synthetic */ void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "888000cc6da7d4d3801bf2175e60aa2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "888000cc6da7d4d3801bf2175e60aa2a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ac.a(context).a("sepaytype", str, "sdk_data_set");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum c {
        SUCCESS,
        ERROR;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ac73741d55612426c548a05133a5ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ac73741d55612426c548a05133a5ab");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "595dd13108bca07effaa6825f73fa81b", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "595dd13108bca07effaa6825f73fa81b") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dff1a4eca583347324507e6976e91909", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dff1a4eca583347324507e6976e91909") : (c[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum b {
        UPSEPAY,
        UNIONPAY;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d7db42879d78ba0ec3549ba74e7b4f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d7db42879d78ba0ec3549ba74e7b4f");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a40c13fdbc5fcc63f278f884aa35924", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a40c13fdbc5fcc63f278f884aa35924") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e8cfef61c9c73861b73bd856d84bfff", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e8cfef61c9c73861b73bd856d84bfff") : (b[]) values().clone();
        }
    }

    public static b a() {
        return f;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4498f02c8f1d9c9e62eb834c811740ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4498f02c8f1d9c9e62eb834c811740ec");
        }
        if (e == null) {
            return "no result";
        }
        if (e == c.ERROR) {
            return d;
        }
        return null;
    }

    public static String c() {
        if (e == null) {
            return null;
        }
        return c;
    }

    public static String d() {
        if (e == null) {
            return null;
        }
        return b;
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a520f37091d8f2a6f10cdd0b8389539", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a520f37091d8f2a6f10cdd0b8389539") : ac.a(context).b("sepaytype", "", "sdk_data_set");
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        Object[] objArr = {context, null, null, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7011fc416bf62ea6c1c16cf96775ea15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7011fc416bf62ea6c1c16cf96775ea15");
        } else if (!j()) {
            com.meituan.android.paybase.common.analyse.a.a("b_M7GER", new a.c().a("upsepay", "startSEPay").a("throwable", "android_upsepay=b").b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", -9753);
        } else {
            try {
                f = b.UPSEPAY;
                UPPayAssistEx.startSEPay(context, null, null, str3, str4, c());
                com.meituan.android.paybase.common.analyse.a.a("b_Ow8yh", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", 200);
            } catch (Throwable th) {
                com.meituan.android.paybase.common.analyse.a.a("b_M7GER", new a.c().a("message", "UPPayHandle_startSEPay").b);
                com.meituan.android.paybase.common.analyse.a.a(th, "UPPayHandle_startSEPay", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", -9753);
            }
        }
    }

    public static void b(Context context, String str, String str2, String str3, String str4) {
        Object[] objArr = {context, null, null, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba3ca2b2a898764d68aa4304b78775bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba3ca2b2a898764d68aa4304b78775bb");
        } else if (!j()) {
            if (context instanceof Activity) {
                e.a((Activity) context, (Object) context.getString(R.string.fin_thirdpay_adapter__change_payment_after_pay_failed), true);
            }
            com.meituan.android.paybase.common.analyse.a.a("b_pay_u6xvaahg_mv", new a.c().a("message", "android_upsepay=b").b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_unionpay", -9753);
        } else {
            try {
                f = b.UNIONPAY;
                UPPayAssistEx.startPay(context, null, null, str3, str4);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_madlznmh_mv", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_unionpay", 200);
            } catch (Throwable th) {
                if (context instanceof Activity) {
                    e.a((Activity) context, (Object) context.getString(R.string.fin_thirdpay_adapter__change_payment_after_pay_failed), true);
                }
                com.meituan.android.paybase.common.analyse.a.a(th, "UPPayHandle_startPay", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_u6xvaahg_mv", new a.c().a("message", "云闪付未知错误").b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_unionpay", -9753);
            }
        }
    }

    private static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d017ad36c144d8fefadaaaf97c65657", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d017ad36c144d8fefadaaaf97c65657")).booleanValue() : !TextUtils.equals(com.meituan.android.paybase.downgrading.a.a().a("android_upsepay"), "b");
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b599b81e817e5dbd679b627b335d16b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b599b81e817e5dbd679b627b335d16b8");
            return;
        }
        String str = "no upsepay";
        if (f()) {
            str = "remove upsepay";
        } else if (c.SUCCESS == e) {
            str = "show upsepay";
        } else if (e == null) {
            str = "show upsepay status is null";
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_2dfol8h3_mv", new a.c().a("upsepay", "checkPayment").a("sepayName", d()).a("sepayType", c()).a("status", e).a("msg", str).b);
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8797db011e1a6fa938fcc2d2c0552cd8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8797db011e1a6fa938fcc2d2c0552cd8")).booleanValue() : c.ERROR == e;
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bbe0358d3fe4dcd7ac50ca1370a0d9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bbe0358d3fe4dcd7ac50ca1370a0d9") : c();
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687e424a74d93a4039bd5a373256bb30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687e424a74d93a4039bd5a373256bb30")).booleanValue() : e == null;
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b401ae6b54d1b8def967bc4b8b2964a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b401ae6b54d1b8def967bc4b8b2964a0")).booleanValue() : c.SUCCESS == e;
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.UPPayAPI
    public final void b(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205612521b3aed736fdb49e4dcd00175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205612521b3aed736fdb49e4dcd00175");
            return;
        }
        e = null;
        final long currentTimeMillis = System.currentTimeMillis();
        final a aVar = new a() { // from class: com.meituan.android.finthirdpayadapter.payer.UPPayHandle.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.finthirdpayadapter.payer.UPPayHandle.a
            public final void a(String str, String str2, int i, Bundle bundle) {
                Object[] objArr2 = {str, str2, Integer.valueOf(i), bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0efe881cc749a9004ad142f085bb49c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0efe881cc749a9004ad142f085bb49c");
                } else {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_ji0bl81a_mv", new a.c().a("startToGetSEPayInfo", "onResult").a("sepayName", str).a("sepayType", str2).a("cardCount", Integer.valueOf(i)).a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
                }
            }

            @Override // com.meituan.android.finthirdpayadapter.payer.UPPayHandle.a
            public final void a(String str, String str2, String str3, String str4) {
                Object[] objArr2 = {str, str2, str3, str4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "850e1e3e0de90832e9c436d6bef8db47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "850e1e3e0de90832e9c436d6bef8db47");
                } else {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_5w9382ld_mv", new a.c().a("startToGetSEPayInfo", "onError").a("sepayName", str).a("sepayType", str2).a("errorCode", str3).a("errorDesc", str4).a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
                }
            }
        };
        Object[] objArr2 = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "77eea336c60b1099af37ae9f1bc1678e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "77eea336c60b1099af37ae9f1bc1678e");
        } else if (j()) {
            try {
                UPPayAssistEx.getSEPayInfo(context, new UPQuerySEPayInfoCallback() { // from class: com.meituan.android.finthirdpayadapter.payer.UPPayHandle.1
                    public static ChangeQuickRedirect a;

                    @Override // com.unionpay.UPQuerySEPayInfoCallback
                    public final void onResult(String str, String str2, int i, Bundle bundle) {
                        Object[] objArr3 = {str, str2, Integer.valueOf(i), bundle};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "925fd29eb637a39dc54abf21ea44f36b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "925fd29eb637a39dc54abf21ea44f36b");
                            return;
                        }
                        String unused = UPPayHandle.b = str;
                        String unused2 = UPPayHandle.c = str2;
                        String unused3 = UPPayHandle.d = null;
                        c unused4 = UPPayHandle.e = c.SUCCESS;
                        a.this.a(str, str2, i, bundle);
                        UPPayHandle.a(context, str2);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", 200);
                    }

                    @Override // com.unionpay.UPQuerySEPayInfoCallback
                    public final void onError(String str, String str2, String str3, String str4) {
                        Object[] objArr3 = {str, str2, str3, str4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90cf238de983622d853185148abf1e17", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90cf238de983622d853185148abf1e17");
                            return;
                        }
                        String unused = UPPayHandle.b = str;
                        String unused2 = UPPayHandle.c = str2;
                        String unused3 = UPPayHandle.d = str3;
                        c unused4 = UPPayHandle.e = c.ERROR;
                        a.this.a(str, str2, str3, str4);
                        UPPayHandle.a(context, str2);
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", -9753);
                    }
                });
            } catch (Throwable th) {
                e = c.ERROR;
                com.meituan.android.paybase.common.analyse.a.a(th, "UPPayHandle_getSEPayInfo", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", -9753);
            }
        } else {
            aVar.a("", "", "", "android_upsepay=b");
            e = c.ERROR;
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_upmppay", -9753);
        }
    }
}
