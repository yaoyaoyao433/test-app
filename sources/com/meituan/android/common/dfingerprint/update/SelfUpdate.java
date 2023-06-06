package com.meituan.android.common.dfingerprint.update;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.collection.workers.EnvInfoWorker;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.interfaces.ICypher;
import com.meituan.android.common.dfingerprint.network.ContentType;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.collect.p;
import com.meituan.android.common.mtguard.utils.c;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class SelfUpdate {
    private static final String DEFAULT_ID = "0000000000000000";
    private static final int DOWNLOAD_UNKNOWN_ERR = -6;
    private static final int MAX_RETRY_NUM = 3;
    public static final String TAG = "SelfUpdate";
    private static final int UPDATE_DELETE_SO = 2;
    private static final int UPDATE_DOWNLOAD_FAIL = -1;
    private static final int UPDATE_DOWNLOAD_FAIL_3 = -8;
    private static final int UPDATE_EXCEPTION_ERR = -7;
    private static final int UPDATE_MD5_EXIST = -3;
    private static final int UPDATE_MD5_FAILED = -2;
    private static final int UPDATE_NO_CONFIG = 0;
    private static final int UPDATE_SERVER_ERR = -4;
    private static final int UPDATE_SUCCESS = 1;
    private static final int UPDATE_UNKNOWN_ERR = -5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mArch;
    private Context mContext;
    private ICypher mCypher;
    private DFPManager mDfpManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class UpBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String mArch;
        private Context mContext;
        private String mDFPID;

        public UpBean(Context context, String str, String str2) {
            Object[] objArr = {SelfUpdate.this, context, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "181b960a33188a8f2ff959a496cfa3c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "181b960a33188a8f2ff959a496cfa3c6");
                return;
            }
            this.mDFPID = "";
            this.mContext = context;
            this.mDFPID = str;
            this.mArch = str2;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "925c23859d135345df383009c4b9407e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "925c23859d135345df383009c4b9407e");
            }
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("version", Integer.valueOf(Build.VERSION.SDK_INT));
                jsonObject.addProperty("brand", Build.BRAND);
                jsonObject.addProperty("pkgname", this.mContext.getPackageName());
                jsonObject.addProperty("cpuABI", UpdateUtil.cpuABI());
                jsonObject.addProperty("md5", UpdateUtil.uMD5(this.mContext, this.mArch));
                jsonObject.addProperty("sov", NBridge.main1(49, new Object[0]));
                jsonObject.addProperty("dfpid", this.mDFPID);
                jsonObject.addProperty("localdfpid", SelfUpdate.this.getLocalDFPID());
                jsonObject.addProperty("userid", SelfUpdate.this.getUserID());
                jsonObject.addProperty("arch", this.mArch);
                jsonObject.addProperty("uuid", p.a(this.mContext).a());
                jsonObject.addProperty("apkVN", UpdateUtil.getApkVersionName(this.mContext));
                jsonObject.addProperty("apkVC", UpdateUtil.getApkVersionCode(this.mContext));
                return jsonObject.toString();
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
                return "";
            }
        }
    }

    public SelfUpdate(Context context, DFPManager dFPManager) {
        Object[] objArr = {context, dFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d38a9ea662d4eaaa0595566786b97565", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d38a9ea662d4eaaa0595566786b97565");
            return;
        }
        this.mContext = context;
        this.mDfpManager = dFPManager;
        this.mCypher = dFPManager.getCypher();
        this.mArch = c.a() ? "64" : "32";
    }

    public static void doUpdate(Context context, DFPManager dFPManager) {
        Object[] objArr = {context, dFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8e2d64d92198dd1633b7e28b9932c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8e2d64d92198dd1633b7e28b9932c23");
        } else {
            new SelfUpdate(context, dFPManager).doUpdate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadAndCheckSum(final String str, final String str2, String str3, int i) {
        int i2;
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9383a26dbd25620942e7657b1ffc318b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9383a26dbd25620942e7657b1ffc318b");
            return;
        }
        try {
            if (new DFPReporter.Builder().addInterceptor(this.mDfpManager.getInterceptor()).addResponseParser(new IResponseParser() { // from class: com.meituan.android.common.dfingerprint.update.SelfUpdate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                public boolean onError(int i3, String str4) {
                    return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r14v13 */
                /* JADX WARN: Type inference failed for: r14v14, types: [java.io.FileInputStream] */
                /* JADX WARN: Type inference failed for: r14v15, types: [java.io.FileInputStream] */
                /* JADX WARN: Type inference failed for: r14v16 */
                /* JADX WARN: Type inference failed for: r14v2 */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r14v4, types: [java.io.FileInputStream] */
                /* JADX WARN: Type inference failed for: r14v5, types: [java.io.FileInputStream] */
                @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onResponse(int r11, byte[] r12, long r13, int r15) {
                    /*
                        Method dump skipped, instructions count: 253
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.dfingerprint.update.SelfUpdate.AnonymousClass1.onResponse(int, byte[], long, int):boolean");
                }
            }).build().get(str3)) {
                return;
            }
            if (i == 0) {
                report(str, -1, 0);
                i2 = 3;
            } else {
                i2 = 3;
                if (i == 3) {
                    report(str, -8, 0);
                }
            }
            if (i < i2) {
                int i3 = 1 + i;
                Thread.sleep(i3 * 5 * 1000);
                downloadAndCheckSum(str, str2, str3, i3);
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            report(str, -6, 0);
        }
    }

    private String getDFPID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f62345dd11149fe246efab5f0fd1f31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f62345dd11149fe246efab5f0fd1f31");
        }
        try {
            return NBridge.main1(57, new Object[]{DFPConfigs.KEY_DFPID});
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getLocalDFPID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62d8a8f67f69e033e6fd7b31f38a85a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62d8a8f67f69e033e6fd7b31f38a85a9");
        }
        try {
            return NBridge.main1(47, new Object[0]);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUserID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07a93aca61e74b82de97bc3ca65e9988", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07a93aca61e74b82de97bc3ca65e9988");
        }
        try {
            return TextUtils.equals(EnvInfoWorker.getUserId(MTGuard.getAdapter().a), DFPConfigs.JAVA_EXCEPTION) ? "" : "";
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean post(java.lang.String r12, boolean r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r2 = 1
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.dfingerprint.update.SelfUpdate.changeQuickRedirect
            java.lang.String r10 = "00bf97e526ac14dc97852f8f79f06adc"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L29
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L29:
            com.meituan.android.common.dfingerprint.impl.DFPReporter$Builder r0 = new com.meituan.android.common.dfingerprint.impl.DFPReporter$Builder     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.dfingerprint.DFPManager r1 = r11.mDfpManager     // Catch: java.lang.Throwable -> L59
            okhttp3.Interceptor r1 = r1.getInterceptor()     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.dfingerprint.impl.DFPReporter$Builder r0 = r0.addInterceptor(r1)     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.dfingerprint.update.SelfUpdate$3 r1 = new com.meituan.android.common.dfingerprint.update.SelfUpdate$3     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.dfingerprint.impl.DFPReporter$Builder r0 = r0.addResponseParser(r1)     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.dfingerprint.impl.DFPReporter r0 = r0.build()     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r12)     // Catch: java.lang.Throwable -> L59
            com.meituan.android.common.dfingerprint.network.ContentType r1 = com.meituan.android.common.dfingerprint.network.ContentType.application_json     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.requestUpdate(r12, r1)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L64
            if (r13 == 0) goto L64
            boolean r12 = r11.post(r12, r8)     // Catch: java.lang.Throwable -> L57
            goto L65
        L57:
            r12 = move-exception
            goto L5b
        L59:
            r12 = move-exception
            r0 = 0
        L5b:
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r12)
            java.lang.String r12 = "0000000000000000"
            r1 = -7
            r11.report(r12, r1, r8)
        L64:
            r12 = r0
        L65:
            if (r12 != 0) goto L6f
            if (r13 == 0) goto L6f
            java.lang.String r13 = "0000000000000000"
            r0 = -5
            r11.report(r13, r0, r8)
        L6f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.dfingerprint.update.SelfUpdate.post(java.lang.String, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean report(String str, int i, int i2) {
        boolean z;
        String encrypt;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5460c1cacc2b17d6fc709531056b41d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5460c1cacc2b17d6fc709531056b41d")).booleanValue();
        }
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", str);
            jsonObject.addProperty("dfpid", getDFPID());
            jsonObject.addProperty("msg", Integer.valueOf(i));
            encrypt = UpdateUtil.encrypt(this.mCypher, jsonObject.toString());
        } catch (Throwable th) {
            th = th;
            z = true;
        }
        if (TextUtils.isEmpty(encrypt)) {
            return false;
        }
        z = new DFPReporter.Builder().addInterceptor(this.mDfpManager.getInterceptor()).addResponseParser(new IResponseParser() { // from class: com.meituan.android.common.dfingerprint.update.SelfUpdate.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
            public boolean onError(int i3, String str2) {
                return false;
            }

            @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
            public boolean onResponse(int i3, byte[] bArr, long j, int i4) {
                return true;
            }
        }).build().reportUpdate(encrypt, ContentType.plain_text);
        if (!z && i2 < 3) {
            int i3 = i2 + 1;
            try {
                Thread.sleep(i3 * 5 * 1000);
                report(str, i, i3);
            } catch (Throwable th2) {
                th = th2;
                MTGuardLog.setErrorLogan(th);
                return z;
            }
        }
        return z;
    }

    public void doUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5a175eee186a6f0c31bc841658c12b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5a175eee186a6f0c31bc841658c12b3");
            return;
        }
        try {
            if (this.mContext != null && this.mCypher != null && this.mDfpManager != null) {
                String upBean = new UpBean(this.mContext, getDFPID(), this.mArch).toString();
                MTGuardLog.setLogan(upBean);
                if (TextUtils.isEmpty(upBean)) {
                    return;
                }
                String encrypt = UpdateUtil.encrypt(this.mCypher, upBean);
                if (TextUtils.isEmpty(encrypt)) {
                    return;
                }
                UpdateRequestBody updateRequestBody = new UpdateRequestBody(encrypt);
                Gson create = new GsonBuilder().disableHtmlEscaping().create();
                if (create != null) {
                    String json = create.toJson(updateRequestBody);
                    MTGuardLog.setLogan(json);
                    post(json, true);
                }
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }
}
