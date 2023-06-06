package com.meituan.android.common.mtguard;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.dfingerprint.DFPDataCallBack;
import com.meituan.android.common.dfingerprint.DFPIdCallBack;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.bean.Xid;
import com.meituan.android.common.dfingerprint.collection.utils.AccessibilityUtils;
import com.meituan.android.common.mtguard.b;
import com.meituan.android.common.mtguard.collect.e;
import com.meituan.android.common.mtguard.wtscore.plugin.collection.siua.SIUACallBack;
import com.meituan.android.common.mtguard.wtscore.plugin.encryption.a;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.takeoutnew.util.aop.MTGuardLazyInit;
import com.tencent.open.apireq.BaseResp;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.Map;
/* loaded from: classes2.dex */
public class MTGuard {
    public static String DfpId = "";
    private static final int STATE_DEFAULT = 0;
    private static final int STATE_MINI_FAMA = 2;
    private static final int STATE_PRIVACY_FAMA = 1;
    public static volatile boolean appInitSuccess = false;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static volatile boolean loadInitSuccess = false;
    private static volatile b mAdapter = null;
    public static volatile String sAppKey = "";
    public static volatile String sPackageName = null;
    public static volatile String sPic = "";
    public static volatile String sSec = "";
    public static volatile Context sSystemContext;
    public static final long sFirstLaunchTime = System.currentTimeMillis();
    public static boolean sPrivacyModeChanged = false;
    private static int sInitState = 0;

    static {
        init();
        MTGuardLazyInit.initMTGuardBeforeCheck();
    }

    public static byte[] decrypt(byte[] bArr, CryptoKeyIndex cryptoKeyIndex) {
        Object[] objArr = {bArr, cryptoKeyIndex};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e03d0815676fcbf8c34a4eae805df33c", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e03d0815676fcbf8c34a4eae805df33c") : loadInitSuccess ? b.a(bArr, cryptoKeyIndex.value, a.C0230a.b - 1) : bArr;
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, String str) {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e91de52be85273a091b85b89455df3f", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e91de52be85273a091b85b89455df3f") : decryptAES(bArr, bArr2, str);
    }

    public static byte[] decryptAES(Context context, byte[] bArr, byte[] bArr2, String str) {
        Object[] objArr = {context, bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "035bd249651d446ede969e01f1c89a33", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "035bd249651d446ede969e01f1c89a33");
        }
        if (bArr == null) {
            return null;
        }
        return decryptAES(bArr, bArr2, str);
    }

    public static byte[] decryptAES(byte[] bArr, byte[] bArr2, String str) {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92a8af5eafef56d563ffc1b9e6a4e24a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92a8af5eafef56d563ffc1b9e6a4e24a");
        }
        if (bArr == null || !loadInitSuccess) {
            return null;
        }
        return b.a(bArr, new String(bArr2), a.C0230a.b - 1);
    }

    public static String deviceFingerprintData(DFPInfoProvider dFPInfoProvider) {
        Object[] objArr = {dFPInfoProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afd7ae778a8670169689c3336cad66a2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afd7ae778a8670169689c3336cad66a2");
        }
        if (verify()) {
            mAdapter.c = dFPInfoProvider;
            return DFPManager.dfpData();
        }
        return "unknown";
    }

    public static void deviceFingerprintData(DFPInfoProvider dFPInfoProvider, DFPDataCallBack dFPDataCallBack) {
        Object[] objArr = {dFPInfoProvider, dFPDataCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6327f432b2b113d1cc78ab23156b1ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6327f432b2b113d1cc78ab23156b1ec");
        } else if (!verify()) {
            dFPDataCallBack.onFailed(BaseResp.CODE_NOT_LOGIN, "mtg no init");
        } else {
            mAdapter.c = dFPInfoProvider;
            DFPManager.dfpData(dFPDataCallBack);
        }
    }

    public static void deviceFingerprintID(DFPInfoProvider dFPInfoProvider, DFPIdCallBack dFPIdCallBack) {
        Object[] objArr = {dFPInfoProvider, dFPIdCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0199cbdd8414951047018957c109c97b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0199cbdd8414951047018957c109c97b");
        } else if (!verify()) {
            dFPIdCallBack.onFailed(BaseResp.CODE_NOT_LOGIN, "mtg no init");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            mAdapter.a(dFPIdCallBack);
            long currentTimeMillis2 = System.currentTimeMillis();
            MTGuardLog.setLogan("get dfpid cost:" + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static byte[] encLoad(String str, String str2) {
        Object[] main3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d2c226077dbb8328a1a8252eb3fb263", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d2c226077dbb8328a1a8252eb3fb263");
        }
        if (loadInitSuccess) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (main3 = NBridge.main3(33, new Object[]{str, str2})) == null) {
                return null;
            }
            if (main3[0] instanceof Integer) {
                MTGuardLog.setErrorLogan(new RuntimeException("enc load failed errno: " + main3[0]));
                return null;
            }
            return (byte[]) main3[0];
        }
        return "error".getBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean encStore(java.lang.String r18, byte[] r19, java.lang.String r20) {
        /*
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r12 = 0
            r11[r12] = r18
            r13 = 1
            r11[r13] = r19
            r14 = 2
            r11[r14] = r20
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.android.common.mtguard.MTGuard.changeQuickRedirect
            java.lang.String r9 = "eff74b01752daf56eaa0823ff4f39bb3"
            r5 = 0
            r7 = 1
            r16 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r4 = r11
            r6 = r15
            r8 = r9
            r14 = r9
            r9 = r16
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L2c
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r0, r15, r13, r14)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L2c:
            boolean r4 = com.meituan.android.common.mtguard.MTGuard.loadInitSuccess
            if (r4 == 0) goto L88
            boolean r4 = android.text.TextUtils.isEmpty(r18)
            if (r4 != 0) goto L7f
            boolean r4 = android.text.TextUtils.isEmpty(r20)
            if (r4 != 0) goto L7f
            if (r19 != 0) goto L3f
            goto L7f
        L3f:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r12] = r18
            r3[r13] = r20
            r0 = 2
            r3[r0] = r19
            r0 = 32
            java.lang.Object[] r0 = com.meituan.android.common.mtguard.NBridge.main3(r0, r3)
            if (r0 != 0) goto L5b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "enc store failed"
            r0.<init>(r1)
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r0)
            goto L7f
        L5b:
            r1 = r0[r12]
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L7a
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "enc save failed error: "
            r2.<init>(r3)
            r0 = r0[r12]
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r1)
            goto L7f
        L7a:
            r0 = r0[r12]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L81
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L81:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L88
            return r13
        L88:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.MTGuard.encStore(java.lang.String, byte[], java.lang.String):boolean");
    }

    public static byte[] encrypt(byte[] bArr, CryptoKeyIndex cryptoKeyIndex) {
        Object[] objArr = {bArr, cryptoKeyIndex};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9eaa2016985555b2d8e4d7f04b600c40", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9eaa2016985555b2d8e4d7f04b600c40") : loadInitSuccess ? b.a(bArr, cryptoKeyIndex.value, a.C0230a.a - 1) : bArr;
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, String str) {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88a13f2f0ac6c0902f037dd96f005b23", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88a13f2f0ac6c0902f037dd96f005b23") : encryptAES(bArr, bArr2, str);
    }

    public static byte[] encryptAES(Context context, byte[] bArr, byte[] bArr2, String str) {
        Object[] objArr = {context, bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5eb444f9a71f81a70257846b6991d90a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5eb444f9a71f81a70257846b6991d90a");
        }
        if (bArr == null) {
            return null;
        }
        return encrypt(bArr, bArr2, str);
    }

    public static byte[] encryptAES(byte[] bArr, byte[] bArr2, String str) {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1593bea2cf3859a3a141feaecd5851ab", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1593bea2cf3859a3a141feaecd5851ab") : (bArr == null || !loadInitSuccess) ? bArr : b.a(bArr, new String(bArr2), a.C0230a.a - 1);
    }

    public static String encryptAppMode(String str, String str2, String str3) throws GeneralSecurityException {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f97fa769d3528bd867b64a0bc9621791", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f97fa769d3528bd867b64a0bc9621791");
        }
        new com.meituan.android.common.mtguard.utils.a();
        return Base64.encodeToString(com.meituan.android.common.mtguard.utils.a.a(Base64.decode(str, 0), Base64.decode(str2, 0), Base64.decode(str3, 0)), 0);
    }

    @RequiresApi(api = 19)
    public static byte[] encryptAppMode(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        Object[] objArr = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a48c4811b140321fcd65307367fc62e", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a48c4811b140321fcd65307367fc62e");
        }
        new com.meituan.android.common.mtguard.utils.a();
        return com.meituan.android.common.mtguard.utils.a.a(bArr, bArr2, bArr3);
    }

    public static String getAccessibilityInfos() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "210318fa606cfc5852b7af27a4675d69", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "210318fa606cfc5852b7af27a4675d69");
        }
        if (verify()) {
            return AccessibilityUtils.getAccessibilityInfos(mAdapter.a);
        }
        return null;
    }

    public static b getAdapter() {
        return mAdapter;
    }

    public static String getEnvCheckDyn() {
        return "";
    }

    public static void getXid(@NonNull DFPInfoProvider dFPInfoProvider, @NonNull DFPIdCallBack dFPIdCallBack) {
        Object[] objArr = {dFPInfoProvider, dFPIdCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5d3c061eb4146821baabb1a5ead160f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5d3c061eb4146821baabb1a5ead160f");
        } else if (!verify()) {
            dFPIdCallBack.onFailed(BaseResp.CODE_NOT_LOGIN, "mtg no init");
        } else {
            try {
                Xid deserialization = Xid.deserialization(mAdapter.b.getDefaultDfpManager().getIdStore());
                if (deserialization == null || !deserialization.isValid()) {
                    dFPIdCallBack.onFailed(-3003, "build local id error");
                } else {
                    dFPIdCallBack.onSuccess(deserialization.id, deserialization.expiredTimeInMillisecond, "get xid from cache");
                }
            } catch (Throwable th) {
                dFPIdCallBack.onFailed(-1002, RaptorConstants.ERROR_UNKNOWN_VALUE);
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    public static boolean hasMalware() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec3dcc2bb007e58d136167c3995da57a", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec3dcc2bb007e58d136167c3995da57a");
        } else {
            Object[] main3 = NBridge.main3(17, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean inSandBox() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c28f3bb84b57a62705212af98c7fb946", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c28f3bb84b57a62705212af98c7fb946");
        } else {
            Object[] main3 = NBridge.main3(19, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    private static void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c11772a8b5d4350ad9d24428ea270fb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c11772a8b5d4350ad9d24428ea270fb8");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Context context = (Context) invoke.getClass().getMethod("getSystemContext", new Class[0]).invoke(invoke, new Object[0]);
            sSystemContext = context;
            String str = (String) invoke.getClass().getMethod("currentPackageName", new Class[0]).invoke(invoke, new Object[0]);
            sPackageName = str;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            String string = applicationInfo.metaData.getString("mtguard_appkey");
            String string2 = applicationInfo.metaData.getString("mtguard_pic");
            String string3 = applicationInfo.metaData.getString("mtguard_sec");
            MTGuardLog.setLogan("mtguard init appkey:" + string + ",pic:" + string2 + ",sec:" + string3 + ",packageName:" + str + ",sdkVersion:5.17.4");
            try {
                sAppKey = string;
                sPic = string2;
                sSec = string3;
                loadSo(applicationInfo.dataDir);
                MTGlibInterface.raptorFakeAPI(MTGlibInterface.API_KEY_init, 200, System.currentTimeMillis() - currentTimeMillis);
                if (a.h.booleanValue()) {
                    MTGlibInterface.raptorFakeAPI(MTGlibInterface.API_KEY_init, 5000, System.currentTimeMillis() - currentTimeMillis);
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        } catch (Throwable th2) {
            MTGuardLog.setErrorLogan(th2);
        }
    }

    public static void init(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb8e0f600070f21a0bc5ece3e705156b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb8e0f600070f21a0bc5ece3e705156b");
        } else {
            internalInit(context, 0);
        }
    }

    public static void init(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf9825f669d14ddd758d9534fc7a7064", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf9825f669d14ddd758d9534fc7a7064");
        } else {
            init(context);
        }
    }

    public static void initInT1(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22aadd45fc356a7b9be20a4c44f7db6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22aadd45fc356a7b9be20a4c44f7db6f");
        } else {
            internalInit(context, Privacy.createPermissionGuard().a(context) ? 1 : 2);
        }
    }

    private static void internalInit(@NonNull Context context, int i) {
        String str;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53a9dd07affd5ea42505596057bc83fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53a9dd07affd5ea42505596057bc83fa");
            return;
        }
        MTGuardLog.setLogan("mtg init processName :" + com.meituan.android.common.mtguard.utils.b.a() + ", init state:" + i);
        if (mAdapter != null) {
            synchronized (MTGuard.class) {
                if (!appInitSuccess && i == 0) {
                    switch (sInitState) {
                        case 1:
                            if (!Privacy.createPermissionGuard().a(context)) {
                                sPrivacyModeChanged = true;
                                mAdapter.a(true);
                                appInitSuccess = true;
                                str = "mtg init when privacy mode change";
                                MTGuardLog.setLogan(str);
                                break;
                            }
                            break;
                        case 2:
                            mAdapter.a(false);
                            appInitSuccess = true;
                            str = "mtg init when entry t2";
                            MTGuardLog.setLogan(str);
                            break;
                    }
                }
            }
            return;
        }
        synchronized (MTGuard.class) {
            if (mAdapter == null) {
                sInitState = i;
                b bVar = new b(context);
                mAdapter = bVar;
                if (loadInitSuccess) {
                    NBridge.main3(4, new Object[1]);
                    bVar.d = new e(bVar.b.getDefaultDfpManager());
                }
                switch (i) {
                    case 0:
                        mAdapter.a(true);
                        appInitSuccess = true;
                        break;
                    case 1:
                        long currentTimeMillis = System.currentTimeMillis();
                        b bVar2 = mAdapter;
                        if (loadInitSuccess && ProcessUtils.isMainProcess(bVar2.a)) {
                            com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new b.AnonymousClass3());
                        }
                        MTGlibInterface.raptorFakeAPI("v5_init_in_privacy", 200, System.currentTimeMillis() - currentTimeMillis);
                        break;
                    case 2:
                        long currentTimeMillis2 = System.currentTimeMillis();
                        b bVar3 = mAdapter;
                        if (loadInitSuccess && ProcessUtils.isMainProcess(bVar3.a)) {
                            com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new b.AnonymousClass4());
                        }
                        MTGlibInterface.raptorFakeAPI("v5_init_in_mini_fama", 200, System.currentTimeMillis() - currentTimeMillis2);
                        break;
                }
                MTGuardLog.setLogan("mtg init adapter, init state:" + i + ", appInitSuccess:" + appInitSuccess);
            }
        }
    }

    public static boolean isAccessibilityEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6eb2f15868fea363871655e88c971656", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6eb2f15868fea363871655e88c971656")).booleanValue() : verify() && AccessibilityUtils.isAccessibilityEnable(mAdapter.a);
    }

    public static boolean isCameraHack() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee8232d18547dcd73c3da73233eccb86", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee8232d18547dcd73c3da73233eccb86");
        } else {
            Object[] main3 = NBridge.main3(22, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isDarkSystem() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9641d26d660af29dbd4d75b74975d8bd", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9641d26d660af29dbd4d75b74975d8bd");
        } else {
            Object[] main3 = NBridge.main3(24, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isDebug() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "229b7084e91cb4f2594b2363e0975d2a", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "229b7084e91cb4f2594b2363e0975d2a");
        } else {
            Object[] main3 = NBridge.main3(21, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isEmu() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6794f7e7ad7b0aa395c6e2e4d4fd4963", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6794f7e7ad7b0aa395c6e2e4d4fd4963");
        } else {
            Object[] main3 = NBridge.main3(16, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isHook() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eeac10d9d0c0c5081d9dae59f7b625eb", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eeac10d9d0c0c5081d9dae59f7b625eb");
        } else {
            Object[] main3 = NBridge.main3(20, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isProxy() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63e390408b2d6078b0b593f7ad79d02c", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63e390408b2d6078b0b593f7ad79d02c");
        } else {
            Object[] main3 = NBridge.main3(18, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isRemoteCall() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f99b76131a4d13ed6cd3fb571ea8a4e", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f99b76131a4d13ed6cd3fb571ea8a4e");
        } else {
            Object[] main3 = NBridge.main3(19, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isRoot() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69bfc91f81c0989bd11c4084e61dafcb", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69bfc91f81c0989bd11c4084e61dafcb");
        } else {
            Object[] main3 = NBridge.main3(15, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isSigCheckOK() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "21fdd493333a29f5b3b7234a9df02cfa", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "21fdd493333a29f5b3b7234a9df02cfa");
        } else {
            Object[] main3 = NBridge.main3(10, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isVirtualLocation() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fbbb527e110504d981ad644a149916c1", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fbbb527e110504d981ad644a149916c1");
        } else {
            Object[] main3 = NBridge.main3(23, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isproxyDetect() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "218b3f049497e7fc3457d483b3ae6f68", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "218b3f049497e7fc3457d483b3ae6f68");
        } else {
            Object[] main3 = NBridge.main3(18, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean isrootDetect() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "31b5ce9da58332949df552bfc251511b", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "31b5ce9da58332949df552bfc251511b");
        } else {
            Object[] main3 = NBridge.main3(15, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean issimulatorDetect() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75576a5ae8a6e3fefa2a1fd04cf1dc94", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75576a5ae8a6e3fefa2a1fd04cf1dc94");
        } else {
            Object[] main3 = NBridge.main3(16, new Object[0]);
            if (main3 == null) {
                return false;
            }
            obj = main3[0];
        }
        return ((Boolean) obj).booleanValue();
    }

    public static int isunsafeMemoryDetect() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: Throwable -> 0x00a4, TryCatch #2 {Throwable -> 0x00a4, blocks: (B:25:0x0072, B:27:0x007e, B:29:0x0088, B:31:0x0091, B:21:0x005f, B:23:0x0067, B:24:0x006f), top: B:40:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void loadSo(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.mtguard.MTGuard.changeQuickRedirect
            java.lang.String r11 = "f05543b778b79a9afcba6448f8fdce80"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r12 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            return
        L1c:
            r1 = 0
            boolean r3 = com.meituan.android.common.mtguard.utils.c.a()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L27
            java.lang.String r3 = "64"
            goto L29
        L27:
            java.lang.String r3 = "32"
        L29:
            java.lang.String r12 = com.meituan.android.common.dfingerprint.update.UpdateUtil.getRealSoPath(r12, r3)     // Catch: java.lang.Throwable -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L40
            java.lang.String r12 = "mtguard"
            java.lang.System.loadLibrary(r12)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r12 = "load apk libmtguard.so"
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r12)     // Catch: java.lang.Throwable -> L5d
            goto L72
        L40:
            java.lang.System.load(r12)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "v5_load_so"
            r4 = 200(0xc8, float:2.8E-43)
            com.meituan.android.common.dfingerprint.MTGlibInterface.raptorFakeAPI(r3, r4, r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "load "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r12 = r3.concat(r12)     // Catch: java.lang.Throwable -> L5a
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r12)     // Catch: java.lang.Throwable -> L5a
            goto L72
        L5a:
            r12 = move-exception
            r3 = 1
            goto L5f
        L5d:
            r12 = move-exception
            r3 = 0
        L5f:
            java.lang.String r4 = "mtguard"
            java.lang.System.loadLibrary(r4)     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto L6f
            java.lang.String r3 = "v5_load_so"
            r4 = 9405(0x24bd, float:1.3179E-41)
            com.meituan.android.common.dfingerprint.MTGlibInterface.raptorFakeAPI(r3, r4, r1)     // Catch: java.lang.Throwable -> La4
        L6f:
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r12)     // Catch: java.lang.Throwable -> La4
        L72:
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = com.meituan.android.common.mtguard.MTGuard.sAppKey     // Catch: java.lang.Throwable -> La4
            r12[r9] = r1     // Catch: java.lang.Throwable -> La4
            java.lang.Object[] r12 = com.meituan.android.common.mtguard.NBridge.main3(r0, r12)     // Catch: java.lang.Throwable -> La4
            if (r12 == 0) goto La3
            r12 = r12[r9]     // Catch: java.lang.Throwable -> La4
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> La4
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> La4
            if (r12 != 0) goto L91
            com.meituan.android.common.mtguard.MTGuard.loadInitSuccess = r0     // Catch: java.lang.Throwable -> La4
            java.lang.String r12 = "mtg init native finished"
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r12)     // Catch: java.lang.Throwable -> La4
            return
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "MTGuard init native failed: errno "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> La4
            java.lang.String r12 = r1.concat(r12)     // Catch: java.lang.Throwable -> La4
            r0.<init>(r12)     // Catch: java.lang.Throwable -> La4
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r0)     // Catch: java.lang.Throwable -> La4
        La3:
            return
        La4:
            r12 = move-exception
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.MTGuard.loadSo(java.lang.String):void");
    }

    public static String requestSignatureForBabel(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        return str2 == null ? "" : str2;
    }

    public static Map<String, String> requestSignatureForBabelV4(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea566a2dd41d95cc173dde3dce59bbee", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea566a2dd41d95cc173dde3dce59bbee");
        }
        if (loadInitSuccess) {
            return b.a(str, URI.create(str2), str3, str4, str5, bArr);
        }
        return null;
    }

    public static String requestSignatureForWebView(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        return str2 == null ? "" : str2;
    }

    public static Map<String, String> requestSignatureForWebViewV4(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        Object[] objArr = {str, str2, str3, str4, str5, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "367fcbe2a0fcb791b0d5a831c28a55f0", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "367fcbe2a0fcb791b0d5a831c28a55f0");
        }
        if (loadInitSuccess) {
            return b.a(str, str2, str3, str4, str5, bArr);
        }
        return null;
    }

    public static void siua(SIUACallBack sIUACallBack) {
    }

    public static byte[] siua() {
        return null;
    }

    public static byte[] siuaCache() {
        return null;
    }

    public static void uiAutomatorCheck(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb19c05bd15c60db8d9ad8202feb1cae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb19c05bd15c60db8d9ad8202feb1cae");
        } else if (!verify() || activity == null) {
        } else {
            b.a(activity.getWindow().getDecorView());
        }
    }

    public static void uiAutomatorCheck(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7ddc30daee1fc22b06f6bb13012530f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7ddc30daee1fc22b06f6bb13012530f");
        } else if (!verify() || view == null) {
        } else {
            b.a(view);
        }
    }

    public static int uiAutomatorClickCount() {
        Object[] main3;
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e55945fa3fd311f57ffc508c34fa364", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e55945fa3fd311f57ffc508c34fa364");
        } else if (!verify() || (main3 = NBridge.main3(11, new Object[0])) == null) {
            return 0;
        } else {
            obj = main3[0];
        }
        return ((Integer) obj).intValue();
    }

    public static void uploadDeviceInfo(DFPInfoProvider dFPInfoProvider, DFPIdCallBack dFPIdCallBack, boolean z) {
        Object[] objArr = {dFPInfoProvider, dFPIdCallBack, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1284141fa1a164c63e171aee68a7e9f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1284141fa1a164c63e171aee68a7e9f0");
        } else if (verify()) {
            mAdapter.a(dFPIdCallBack);
        } else {
            dFPIdCallBack.onFailed(BaseResp.CODE_NOT_LOGIN, "mtg no init");
        }
    }

    public static byte[] userIdentification() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95442371f59284600c40c9790fb3f11b", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95442371f59284600c40c9790fb3f11b") : siua();
    }

    public static byte[] userIdentification(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e74efd37fe81b9182da5f36e99dcd20f", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e74efd37fe81b9182da5f36e99dcd20f") : siua();
    }

    public static boolean verify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "814113a70281f293c776e12c10a3e565", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "814113a70281f293c776e12c10a3e565")).booleanValue();
        }
        if (loadInitSuccess && appInitSuccess) {
            return true;
        }
        MTGuardLog.setLogan("Warning: don't call MTGuard.init()");
        return false;
    }
}
