package com.meituan.android.common.mtguard;

import android.hardware.Sensor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.collection.utils.AccessibilityUtils;
import com.meituan.android.common.dfingerprint.collection.workers.AppInfoWorker;
import com.meituan.android.common.dfingerprint.collection.workers.EnvInfoWorker;
import com.meituan.android.common.dfingerprint.dfpid.oaid.helpers.DevicesIDsHelper;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.collect.d;
import com.meituan.android.common.mtguard.collect.f;
import com.meituan.android.common.mtguard.collect.h;
import com.meituan.android.common.mtguard.collect.k;
import com.meituan.android.common.mtguard.collect.m;
import com.meituan.android.common.mtguard.collect.n;
import com.meituan.android.common.mtguard.collect.o;
import com.meituan.android.common.mtguard.collect.p;
import com.meituan.android.common.mtguard.utils.b;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3NetworkInterceptor;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.Map;
/* loaded from: classes2.dex */
public class NBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ClassLoader getClassLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0309f3af7a27e8918a9ed9a0e134eca", 6917529027641081856L) ? (ClassLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0309f3af7a27e8918a9ed9a0e134eca") : NBridge.class.getClassLoader();
    }

    public static int getPermissionState(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fedfa63448eab1543643e8431e0229ef", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fedfa63448eab1543643e8431e0229ef")).intValue() : getPermissionState(str, null, null);
    }

    public static int getPermissionState(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fec714481b067fe068480214681eeb2a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fec714481b067fe068480214681eeb2a")).intValue() : getPermissionState(null, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (com.sankuai.meituan.takeoutnew.util.aop.f.a(r4, r19) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (android.support.v4.content.PermissionChecker.checkSelfPermission(r4, r19) == 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getPermissionState(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r12 = 0
            r11[r12] = r0
            r13 = 1
            r11[r13] = r1
            r14 = 2
            r11[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.android.common.mtguard.NBridge.changeQuickRedirect
            java.lang.String r9 = "dfa7710dcb91342215cc26535b88a4e0"
            r5 = 0
            r7 = 1
            r16 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r4 = r11
            r6 = r15
            r8 = r9
            r12 = r9
            r9 = r16
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L32
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r0, r15, r13, r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L32:
            com.meituan.android.common.mtguard.b r4 = com.meituan.android.common.mtguard.MTGuard.getAdapter()     // Catch: java.lang.Throwable -> Lcf
            android.content.Context r4 = r4.a     // Catch: java.lang.Throwable -> Lcf
            if (r4 != 0) goto L3b
            return r14
        L3b:
            boolean r5 = com.meituan.android.common.mtguard.LifecycleManager.isInForeground()     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto L42
            return r3
        L42:
            com.meituan.android.privacy.interfaces.e r3 = com.meituan.android.privacy.interfaces.Privacy.createPermissionGuard()     // Catch: java.lang.Throwable -> Lcf
            boolean r3 = r3.a(r4)     // Catch: java.lang.Throwable -> Lcf
            if (r3 == 0) goto L4e
            r0 = 5
            return r0
        L4e:
            boolean r3 = android.text.TextUtils.isEmpty(r19)     // Catch: java.lang.Throwable -> Lcf
            if (r3 == 0) goto L9f
            boolean r0 = android.text.TextUtils.isEmpty(r20)     // Catch: java.lang.Throwable -> Lcf
            r3 = 4
            if (r0 != 0) goto L9e
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto L62
            goto L9e
        L62:
            com.meituan.android.privacy.interfaces.e r0 = com.meituan.android.privacy.interfaces.Privacy.createPermissionGuard()     // Catch: java.lang.Throwable -> Lcf
            int r0 = r0.a(r4, r2, r1)     // Catch: java.lang.Throwable -> Lcf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r5 = "permission id: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lcf
            r4.append(r2)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = ", bid: "
            r4.append(r2)     // Catch: java.lang.Throwable -> Lcf
            r4.append(r1)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r1 = ", ret: "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lcf
            r4.append(r0)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lcf
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r1)     // Catch: java.lang.Throwable -> Lcf
            if (r0 <= 0) goto L8f
            return r13
        L8f:
            r1 = -4
            if (r0 == r1) goto L9d
            r1 = -7
            if (r0 == r1) goto L9d
            r1 = -10
            if (r0 == r1) goto L9d
            if (r0 != 0) goto L9c
            goto L9d
        L9c:
            return r3
        L9d:
            return r14
        L9e:
            return r3
        L9f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lcf
            r2 = 23
            if (r1 < r2) goto Lc4
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Lcf
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> Lcf
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> Lcf
            if (r1 < r2) goto Lbd
            int r0 = com.sankuai.meituan.takeoutnew.util.aop.f.a(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lba
        Lb7:
            r18 = 1
            goto Lcb
        Lba:
            r18 = 0
            goto Lcb
        Lbd:
            int r0 = android.support.v4.content.PermissionChecker.checkSelfPermission(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lba
            goto Lb7
        Lc4:
            int r0 = android.support.v4.content.PermissionChecker.checkSelfPermission(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lba
            goto Lb7
        Lcb:
            if (r18 == 0) goto Lce
            return r13
        Lce:
            return r14
        Lcf:
            r0 = move-exception
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.NBridge.getPermissionState(java.lang.String, java.lang.String, java.lang.String):int");
    }

    public static boolean isPermissionGranted(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f23570e589a619f3b3468abde0ac581", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f23570e589a619f3b3468abde0ac581")).booleanValue() : getPermissionState(str) == 1;
    }

    public static void isPermissionGranted1(String str) {
    }

    private static void isPermissionGranted2(String str) {
    }

    private void isPermissionGranted4(String str) {
    }

    private static native Object[] main(int i, Object[] objArr);

    public static String main1(int i, Object[] objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "baaae4aeeb6bb4e055f31454690e1c03", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "baaae4aeeb6bb4e055f31454690e1c03");
        }
        try {
            Object[] main = main(i, objArr);
            return (main == null || !(main[0] instanceof String)) ? "" : (String) main[0];
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    public static Object main2(int i, Object[] objArr) {
        Sensor defaultSensor;
        Sensor defaultSensor2;
        Sensor defaultSensor3;
        Sensor defaultSensor4;
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7a11e3bf64a0288cc78005722abdf3bb", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7a11e3bf64a0288cc78005722abdf3bb");
        }
        try {
            switch (i) {
                case 1:
                    return MTGuard.sPackageName;
                case 2:
                    return MTGuard.sSystemContext;
                case 3:
                    if (MTGuard.getAdapter() != null) {
                        return MTGuard.getAdapter().a;
                    }
                    return null;
                case 4:
                    return MTGuard.sPic;
                case 5:
                    return MTGuard.sSec;
                case 6:
                    return "5.17.4";
                case 7:
                    return a.i;
                case 8:
                    return "";
                case 9:
                    return com.meituan.android.common.mtguard.collect.a.a;
                case 10:
                    return com.meituan.android.common.mtguard.collect.a.b;
                case 11:
                    return AccessibilityUtils.isAccessibilityEnable(MTGuard.getAdapter().a) ? "1" : "0";
                case 12:
                    return AccessibilityUtils.getAccessibilityInfos(MTGuard.getAdapter().a);
                case 13:
                    o c = o.c();
                    if (TextUtils.isEmpty(c.h) && c.a != null && (defaultSensor = c.a.getDefaultSensor(9)) != null) {
                        c.g = defaultSensor.getName();
                        c.h = defaultSensor.getVendor();
                    }
                    return c.h;
                case 14:
                    return AppInfoWorker.getInstance(MTGuard.getAdapter().b.getDefaultDfpManager()).localizers();
                case 15:
                    return o.c().f();
                case 17:
                    o c2 = o.c();
                    if (TextUtils.isEmpty(c2.f) && c2.a != null && (defaultSensor2 = c2.a.getDefaultSensor(1)) != null) {
                        c2.e = defaultSensor2.getName();
                        c2.f = defaultSensor2.getVendor();
                    }
                    return c2.f;
                case 18:
                    o c3 = o.c();
                    if (TextUtils.isEmpty(c3.g) && c3.a != null && (defaultSensor3 = c3.a.getDefaultSensor(9)) != null) {
                        c3.g = defaultSensor3.getName();
                        c3.h = defaultSensor3.getVendor();
                    }
                    return c3.g;
                case 19:
                    o c4 = o.c();
                    if (TextUtils.isEmpty(c4.e) && c4.a != null && (defaultSensor4 = c4.a.getDefaultSensor(1)) != null) {
                        c4.e = defaultSensor4.getName();
                        c4.f = defaultSensor4.getVendor();
                    }
                    return c4.e;
                case 20:
                    return MTGuard.getAdapter().a().optional();
                case 21:
                    return MTGuard.getAdapter().a().getChannel();
                case 22:
                    return MTGuard.getAdapter().a().getMagicNumber();
                case 23:
                    return MTGuard.getAdapter().a().getPushToken();
                case 24:
                    return MTGuard.getAdapter().a().business();
                case 25:
                    return f.a(MTGuard.getAdapter().a).a();
                case 26:
                    return com.meituan.android.common.mtguard.collect.a.c;
                case 27:
                    return MTGuard.getAdapter().a().source();
                case 28:
                    return AppInfoWorker.getFirstLaunchTime(MTGuard.getAdapter().a);
                case 29:
                    return p.a(MTGuard.getAdapter().a).a();
                case 30:
                    return h.a();
                case 31:
                    return DFPConfigs.SETUP_EMPTY;
                case 32:
                    return com.meituan.android.common.mtguard.collect.a.d;
                case 33:
                    return DevicesIDsHelper.getOAID(MTGuard.getAdapter().a);
                case 34:
                    return n.a(MTGuard.getAdapter().a).a;
                case 35:
                    return n.a(MTGuard.getAdapter().a).b;
                case 36:
                    return DFPConfigs.SETUP_EMPTY;
                case 37:
                    return Ok3NetworkInterceptor.MITM_INFO;
                case 38:
                    return EnvInfoWorker.getUserId(MTGuard.getAdapter().a);
                case 39:
                    return MTGuard.getAdapter().b.getDefaultDfpManager().getIdStore();
                case 40:
                    return SyncStoreManager.sXid == null ? "" : SyncStoreManager.sXid.id;
                case 41:
                    MTGlibInterface.raptorFakeAPI((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                    return null;
                case 42:
                    return String.valueOf(AppInfoWorker.getInstance(MTGuard.getAdapter().b.getDefaultDfpManager()).androidAppCnt());
                case 43:
                    return AppInfoWorker.getInstance(MTGuard.getAdapter().b.getDefaultDfpManager()).nonSysteAppInfos(10);
                case 44:
                    return AppInfoWorker.getInstance(MTGuard.getAdapter().b.getDefaultDfpManager()).systeAppInfos(10);
                case 45:
                    return AppInfoWorker.getInstance(MTGuard.getAdapter().b.getDefaultDfpManager()).pkls();
                case 46:
                    return k.a(MTGuard.getAdapter().a).b();
                case 49:
                    k a = k.a(MTGuard.getAdapter().a);
                    a.a();
                    return a.a;
                case 50:
                    return String.valueOf(DFPConfigs.updateReportWithBio());
                case 51:
                    StringBuilder sb = new StringBuilder();
                    sb.append(LifecycleManager.getAppState());
                    return sb.toString();
                case 52:
                    MTGuardLog.setLogan(String.valueOf(objArr[0]));
                    return null;
                case 53:
                    return m.a("com.meituan.android.common.mtguard.ReferrerLifecycleManager");
                case 54:
                    return com.meituan.android.common.mtguard.utils.c.a() ? "64" : "32";
                case 55:
                    return m.b("com.meituan.android.common.mtguard.ReferrerLifecycleManager");
                case 58:
                    return MTGuard.getAdapter().b();
                case 59:
                    return Privacy.createPermissionGuard().a(MTGuard.getAdapter().a) ? "1" : "0";
                case 60:
                    return MTGuard.sPrivacyModeChanged ? "1" : "0";
                case 61:
                    MTGlibInterface.raptorAPI((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue());
                    return null;
                case 62:
                    return k.a(MTGuard.getAdapter().a).b;
                case 63:
                    return d.a(MTGuard.getAdapter().a).d.toString();
                case 64:
                    new Handler(Looper.getMainLooper()).post(new b.AnonymousClass1());
                    return null;
                case 65:
                    main3(60, new Object[0]);
                    return null;
                case 66:
                    k a2 = k.a(MTGuard.getAdapter().a);
                    a2.a();
                    MTGuardLog.setLogan("getIsMock:" + a2.c);
                    return a2.c ? "1" : "0";
                case 67:
                    d a3 = d.a(MTGuard.getAdapter().a);
                    MTGuardLog.setLogan("get click info in bio thread:".concat(String.valueOf(com.meituan.android.common.mtguard.collect.b.a())));
                    return a3.b.toString();
                case 68:
                    o c5 = o.c();
                    MTGuardLog.setLogan("get bio info in bio thread:".concat(String.valueOf(com.meituan.android.common.mtguard.collect.b.a())));
                    return "{\"acc\":" + c5.b.toString() + ",\"mag\":" + c5.d.toString() + ",\"gyr\":" + c5.c.toString() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
                case 69:
                    return Privacy.createActivityManager(MTGuard.getAdapter().a, AppInfoWorker.getBid()).a();
                case 70:
                    return com.meituan.android.common.mtguard.utils.b.a();
                case 71:
                    return c.a ? "1" : "0";
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
        return null;
    }

    public static Object[] main3(int i, Object[] objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "61b611011b602229e4cf6e3a99741bf5", 6917529027641081856L)) {
            return (Object[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "61b611011b602229e4cf6e3a99741bf5");
        }
        try {
            return main(i, objArr);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return null;
        }
    }

    public static String requestSignatureForBabel(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d80a52b6abfc229261155ef5743baf1", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d80a52b6abfc229261155ef5743baf1") : MTGuard.requestSignatureForBabel(str, str2, str3, str4, str5, bArr);
    }

    public static Map<String, String> requestSignatureForBabelV4(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80f0c2bebcfd06e67cb45a726f8032ae", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80f0c2bebcfd06e67cb45a726f8032ae") : MTGuard.requestSignatureForBabelV4(str, str2, str3, str4, str5, bArr);
    }

    public static String requestSignatureForWebView(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "241e92e74c9dfa46ba555e1336d8e703", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "241e92e74c9dfa46ba555e1336d8e703") : MTGuard.requestSignatureForWebView(str, str2, str3, str4, str5, bArr);
    }

    public static Map<String, String> requestSignatureForWebViewV4(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c41f3832612000b8fa4fac3ef371aba8", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c41f3832612000b8fa4fac3ef371aba8") : MTGuard.requestSignatureForWebViewV4(str, str2, str3, str4, str5, bArr);
    }

    public void isPermissionGranted3(String str) {
    }
}
