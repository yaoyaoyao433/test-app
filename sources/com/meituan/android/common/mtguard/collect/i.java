package com.meituan.android.common.mtguard.collect;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPIdCallBack;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.bean.DFPID;
import com.meituan.android.common.dfingerprint.bean.DFPResponse;
import com.meituan.android.common.dfingerprint.bean.MiniFamaReqeustBody;
import com.meituan.android.common.dfingerprint.bean.MiniFamaResponse;
import com.meituan.android.common.dfingerprint.bean.ReqeustBody;
import com.meituan.android.common.dfingerprint.collection.utils.StringUtils;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class i {
    public static boolean a = false;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int d = 0;
    private static final int f = 6;
    private static final int g = 27;
    private static final String i = "A";
    private static final String j = "B";
    private static final String k = "v5_mini_fama";
    private static final String l = "v5_mini_fama_error";
    private static final String m = "v5_mini_fama_duration";
    private e b;
    private DFPIdCallBack c;
    private long e;
    private final boolean h;

    public i(@NonNull e eVar) {
        this(eVar, false);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "370c9288c3754eb68ae6f563eb0cbbfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "370c9288c3754eb68ae6f563eb0cbbfe");
        }
    }

    public i(@NonNull e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f29cb49ff738d1abdbfc3d81cfaf488", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f29cb49ff738d1abdbfc3d81cfaf488");
            return;
        }
        this.e = 0L;
        this.b = eVar;
        this.h = z;
        this.c = new DFPIdCallBack() { // from class: com.meituan.android.common.mtguard.collect.i.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.DFPIdCallBack
            public final void onFailed(int i2, String str) {
                Object[] objArr2 = {Integer.valueOf(i2), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ded94b33796c68f7f9cac4b3f6e26a1c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ded94b33796c68f7f9cac4b3f6e26a1c");
                } else if (-3004 == i2) {
                    MTGuardLog.setLogan("post fama in shark");
                    com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.i.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "692f5c2e50ffa13c65527fba4a95b9cd", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "692f5c2e50ffa13c65527fba4a95b9cd");
                            } else {
                                i.this.a(true, true);
                            }
                        }
                    });
                } else {
                    if (i.this.e == Long.MAX_VALUE) {
                        i.a(i.this, 0L);
                    }
                    i.b(i.this);
                    MTGuardLog.setLogan("dfpid failed, " + i2 + ", " + str + ", retry count:" + i.this.e);
                    final long j2 = i.this.e % 6;
                    if (j2 != 0) {
                        com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.i.1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2d3db21d2e0c225dab2d7f0b801e7721", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2d3db21d2e0c225dab2d7f0b801e7721");
                                    return;
                                }
                                try {
                                    Thread.sleep(j2 * 5 * 1000);
                                    MTGuardLog.setLogan("dfpid failed, do retry, rate:" + j2);
                                    i.this.a(true, false);
                                } catch (InterruptedException e) {
                                    MTGuardLog.setErrorLogan(e);
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.meituan.android.common.dfingerprint.DFPIdCallBack
            public final void onSuccess(String str, long j2, String str2) {
                Object[] objArr2 = {str, new Long(j2), str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aca8f4cf3f17bb2e8f11e1ac5d2588fd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aca8f4cf3f17bb2e8f11e1ac5d2588fd");
                    return;
                }
                MTGuardLog.setLogan("exp =" + j2 + ", dfpid = " + str);
                if (System.currentTimeMillis() <= j2) {
                    MTGuard.DfpId = str;
                }
                i.a(str, j2);
            }
        };
    }

    public static /* synthetic */ long a(i iVar, long j2) {
        iVar.e = 0L;
        return 0L;
    }

    public static void a(String str, long j2) {
        Object[] objArr = {str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe07a261deb9e00b44ea514aac49cb75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe07a261deb9e00b44ea514aac49cb75");
            return;
        }
        NBridge.main1(58, new Object[]{DFPConfigs.KEY_DFPID, str});
        NBridge.main1(58, new Object[]{DFPConfigs.KEY_DFPID_EXPIRE_TIME, String.valueOf(j2)});
        MTGuardLog.setLogan("dfpid changed");
        NBridge.main3(50, new Object[]{27});
    }

    private boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec2de838abeebd92e1f6a49392f53dc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec2de838abeebd92e1f6a49392f53dc")).booleanValue();
        }
        DFPReporter build = new DFPReporter.Builder().addInterceptor(this.b.c.getInterceptor()).addResponseParser(new IResponseParser() { // from class: com.meituan.android.common.mtguard.collect.i.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
            public final boolean onError(int i2, String str2) {
                Object[] objArr2 = {Integer.valueOf(i2), str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aed07627fc058694b64dcbdb01b2a5f0", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aed07627fc058694b64dcbdb01b2a5f0")).booleanValue();
                }
                MTGuardLog.setLogan("fama onError code:" + i2 + ", msg:" + str2);
                i.this.c.onFailed(i2, str2);
                return false;
            }

            @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
            public final boolean onResponse(int i2, byte[] bArr, long j2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), bArr, new Long(j2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0422b84a1beac8e695e3302ba987e76b", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0422b84a1beac8e695e3302ba987e76b")).booleanValue();
                }
                StringBuilder sb = new StringBuilder("fama onResponse, mini fama:");
                sb.append(i.this.h);
                sb.append(", response_code:");
                sb.append(i2);
                sb.append(" response_body:");
                sb.append((bArr == null || bArr.length == 0) ? StringUtil.NULL : new String(bArr));
                MTGuardLog.setLogan(sb.toString());
                try {
                    if (i2 != 200) {
                        i.this.c.onFailed(-3, "response code is not 200");
                        MTGlibInterface.raptorAPI(i.this.h ? i.k : MTGlibInterface.API_report_dfpidsync, i2, i3, 0, System.currentTimeMillis() - j2);
                        return false;
                    }
                    if (bArr != null && bArr.length != 0) {
                        String str2 = new String(bArr);
                        MTGlibInterface.raptorAPI(i.this.h ? i.k : MTGlibInterface.API_report_dfpidsync, i2, i3, str2.length(), System.currentTimeMillis() - j2);
                        if (i.this.h) {
                            MiniFamaResponse miniFamaResponse = (MiniFamaResponse) new Gson().fromJson(str2, (Class<Object>) MiniFamaResponse.class);
                            if (miniFamaResponse == null) {
                                i.this.c.onFailed(-4, "body prse failed");
                                return false;
                            } else if (i.i.equals(miniFamaResponse.abTestFlag)) {
                                if (miniFamaResponse.status == 0 && !TextUtils.isEmpty(miniFamaResponse.ntpInfo) && 0 != miniFamaResponse.ts) {
                                    String b = i.b(miniFamaResponse.ntpInfo, miniFamaResponse.ts);
                                    MTGuardLog.setLogan("get mini fama dfpid:".concat(String.valueOf(b)));
                                    if (!TextUtils.isEmpty(b)) {
                                        if (DFPConfigs.isMiniFamaFirst) {
                                            MTGlibInterface.raptorFakeAPI(i.m, 200, System.currentTimeMillis() - MTGuard.sFirstLaunchTime);
                                            DFPConfigs.isMiniFamaFirst = false;
                                        }
                                        i.this.c.onSuccess(b, (miniFamaResponse.interval * DFPConfigs.ONE_HOUR) + System.currentTimeMillis(), miniFamaResponse.message);
                                        return true;
                                    }
                                    MTGuardLog.setLogan("get mini fama decode failed");
                                }
                                MTGlibInterface.raptorAPI(i.k, 9402, i3, 0, System.currentTimeMillis() - j2);
                                MTGlibInterface.raptorAPI(i.l, miniFamaResponse.status, i3, 0, System.currentTimeMillis() - j2);
                                i.this.c.onFailed(miniFamaResponse.status, miniFamaResponse.message);
                                return false;
                            } else {
                                return true;
                            }
                        }
                        DFPResponse dFPResponse = (DFPResponse) new Gson().fromJson(str2, (Class<Object>) DFPResponse.class);
                        if (dFPResponse != null && dFPResponse.code != -128) {
                            if ("B".equals(dFPResponse.data.abTestFlag)) {
                                int i4 = dFPResponse.code;
                                if (i4 != 0) {
                                    i.this.c.onFailed(i4, dFPResponse.message);
                                    MTGlibInterface.raptorAPI(MTGlibInterface.API_report_dfpidsync, 9402, i3, 0, System.currentTimeMillis() - j2);
                                    MTGlibInterface.raptorAPI("v5_req_sign_error", i4, i3, 0, System.currentTimeMillis() - j2);
                                    return false;
                                }
                                String str3 = dFPResponse.data.dataDfp;
                                long j3 = dFPResponse.data.dataInterval;
                                String str4 = dFPResponse.message;
                                try {
                                    MTGuardLog.setLogan("/v5/sign response, dataDecrypt > ".concat(String.valueOf(dFPResponse.data.dataDecrypt)));
                                } catch (Exception unused) {
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    return false;
                                }
                                MTGuardLog.setLogan("/v5/sign 返回新的 local_dfp_id，需要保存它");
                                long currentTimeMillis = System.currentTimeMillis();
                                if (DFPConfigs.isDfpidFirst) {
                                    MTGlibInterface.raptorFakeAPI(MTGlibInterface.API_dfpid_duration, 200, System.currentTimeMillis() - MTGuard.sFirstLaunchTime);
                                    DFPConfigs.isDfpidFirst = false;
                                }
                                i.this.c.onSuccess(str3, (j3 * DFPConfigs.ONE_HOUR) + currentTimeMillis, str4);
                                return true;
                            }
                            return true;
                        }
                        i.this.c.onFailed(-4, "body parse failed");
                        return false;
                    }
                    i.this.c.onFailed(-3, "response body is null");
                    MTGlibInterface.raptorAPI(i.this.h ? i.k : MTGlibInterface.API_report_dfpidsync, 9401, i3, 0, System.currentTimeMillis() - j2);
                    return false;
                } catch (Exception unused2) {
                    MTGlibInterface.raptorAPI(i.this.h ? i.k : MTGlibInterface.API_report_dfpidsync, 9405, i3, 0, System.currentTimeMillis() - j2);
                    MTGuardLog.setLogan("fama exception");
                    i.this.c.onFailed(-3, LogMonitor.EXCEPTION_TAG);
                    return false;
                }
            }
        }).build();
        try {
            Object miniFamaReqeustBody = this.h ? new MiniFamaReqeustBody(str) : new ReqeustBody(str, "5.17.4");
            Gson create = new GsonBuilder().disableHtmlEscaping().create();
            if (create != null) {
                String json = create.toJson(miniFamaReqeustBody);
                MTGuardLog.setLogan("postDFPID, mini fama:" + this.h + ", body:" + json);
                return build.reportDFPIDSync(json, z, this.h);
            }
            return false;
        } catch (Exception e) {
            MTGuardLog.setLogan("post fama failed, because:" + e.getMessage());
            this.c.onFailed(-3, "request error");
            return false;
        }
    }

    private static byte[] a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c6a178a032965ea096847beb1bd0704", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c6a178a032965ea096847beb1bd0704");
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j2);
        return allocate.array();
    }

    private static byte[] a(byte[] bArr, long j2) {
        Object[] objArr = {bArr, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb5d3b9b468059d7dec002abaf9b4497", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb5d3b9b468059d7dec002abaf9b4497");
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j2);
        byte[] array = allocate.array();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ array[(array.length - 4) + (i2 % 4)]);
        }
        return bArr;
    }

    public static /* synthetic */ long b(i iVar) {
        long j2 = iVar.e;
        iVar.e = 1 + j2;
        return j2;
    }

    public static String b(String str, long j2) {
        Object[] objArr = {str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62cc7924ab874d303f06a93c71012d6b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62cc7924ab874d303f06a93c71012d6b");
        }
        byte[] decode = Base64.decode(str, 0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j2);
        byte[] array = allocate.array();
        for (int i2 = 0; i2 < decode.length; i2++) {
            decode[i2] = (byte) (decode[i2] ^ array[(array.length - 4) + (i2 % 4)]);
        }
        return StringUtils.bytesToHexString(decode).toLowerCase();
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb0c33f1ba2a7d8ff4b44d648ab2dc16", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb0c33f1ba2a7d8ff4b44d648ab2dc16")).booleanValue();
        }
        if (com.meituan.android.common.mtguard.a.h.booleanValue()) {
            return true;
        }
        MTGuardLog.setLogan("is outdate:" + d);
        if (d != 0) {
            return d == 1;
        }
        SyncStoreManager syncStoreManager = this.b.d;
        if (syncStoreManager == null) {
            d = 1;
            return true;
        }
        long dFPIDExpireTime = DFPID.getDFPIDExpireTime(syncStoreManager);
        MTGuardLog.setLogan("is mini fama:" + this.h + ", dfpid expireTime:" + dFPIDExpireTime + ", current:" + System.currentTimeMillis());
        if (System.currentTimeMillis() >= dFPIDExpireTime) {
            d = 1;
            return true;
        }
        d = -1;
        return false;
    }

    private String c() {
        long currentTimeMillis;
        String main1;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dcb71973ac24a618e4a6236bf0127ba", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dcb71973ac24a618e4a6236bf0127ba");
        }
        a = true;
        boolean a2 = Privacy.createPermissionGuard().a(MTGuard.getAdapter().a);
        MTGuardLog.setLogan("collect fama in privacy:" + a2 + ", is mini fama:" + this.h);
        if (a2) {
            currentTimeMillis = System.currentTimeMillis();
            main1 = NBridge.main1(54, new Object[0]);
            str = "v5_fama_in_privacy";
        } else if (!this.h) {
            return NBridge.main1(41, new Object[0]);
        } else {
            currentTimeMillis = System.currentTimeMillis();
            main1 = NBridge.main1(61, new Object[0]);
            str = "v5_fama_in_mini";
        }
        MTGlibInterface.raptorFakeAPI(str, 200, System.currentTimeMillis() - currentTimeMillis);
        return main1;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "578c256567b67f2fb5c95b34529b52e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "578c256567b67f2fb5c95b34529b52e3");
            return;
        }
        try {
            MTGuardLog.setLogan("start fama, is mini fama:" + this.h);
            a(false, false);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: Throwable -> 0x00d8, TryCatch #0 {Throwable -> 0x00d8, blocks: (B:6:0x002d, B:8:0x0031, B:27:0x00a1, B:29:0x00b8, B:30:0x00bc, B:11:0x003b, B:13:0x0053, B:17:0x005a, B:19:0x0060, B:20:0x0063, B:23:0x0098, B:31:0x00c0), top: B:36:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r13, boolean r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.mtguard.collect.i.changeQuickRedirect
            java.lang.String r11 = "64e00eb297c4b975861e1c626fd84009"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2d
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L2d:
            boolean r0 = com.meituan.android.common.mtguard.MTGuard.sPrivacyModeChanged     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto Lc0
            java.lang.Boolean r0 = com.meituan.android.common.mtguard.a.h     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L3b
        L39:
            r0 = 1
            goto L9c
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = "is outdate:"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld8
            int r1 = com.meituan.android.common.mtguard.collect.i.d     // Catch: java.lang.Throwable -> Ld8
            r0.append(r1)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld8
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r0)     // Catch: java.lang.Throwable -> Ld8
            int r0 = com.meituan.android.common.mtguard.collect.i.d     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L5a
            int r0 = com.meituan.android.common.mtguard.collect.i.d     // Catch: java.lang.Throwable -> Ld8
            if (r0 != r9) goto L58
            goto L39
        L58:
            r0 = 0
            goto L9c
        L5a:
            com.meituan.android.common.mtguard.collect.e r0 = r12.b     // Catch: java.lang.Throwable -> Ld8
            com.meituan.android.common.dfingerprint.store.SyncStoreManager r0 = r0.d     // Catch: java.lang.Throwable -> Ld8
            if (r0 != 0) goto L63
        L60:
            com.meituan.android.common.mtguard.collect.i.d = r9     // Catch: java.lang.Throwable -> Ld8
            goto L39
        L63:
            long r0 = com.meituan.android.common.dfingerprint.bean.DFPID.getDFPIDExpireTime(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = "is mini fama:"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld8
            boolean r3 = r12.h     // Catch: java.lang.Throwable -> Ld8
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = ", dfpid expireTime:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld8
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r3 = ", current:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld8
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld8
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld8
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r2)     // Catch: java.lang.Throwable -> Ld8
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld8
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L98
            goto L60
        L98:
            r0 = -1
            com.meituan.android.common.mtguard.collect.i.d = r0     // Catch: java.lang.Throwable -> Ld8
            goto L58
        L9c:
            if (r0 != 0) goto Lc0
            if (r13 == 0) goto La1
            goto Lc0
        La1:
            r13 = 57
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = "dfp_id"
            r0[r8] = r1     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r13 = com.meituan.android.common.mtguard.NBridge.main1(r13, r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "get dfpid"
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Ld8
            if (r13 == 0) goto Ldc
            java.lang.String r13 = r12.c()     // Catch: java.lang.Throwable -> Ld8
        Lbc:
            r12.a(r13, r14)     // Catch: java.lang.Throwable -> Ld8
            goto Ldc
        Lc0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "fetch dfpid, is mini fama:"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r12.h     // Catch: java.lang.Throwable -> Ld8
            r13.append(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Ld8
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setLogan(r13)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r13 = r12.c()     // Catch: java.lang.Throwable -> Ld8
            goto Lbc
        Ld8:
            r13 = move-exception
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r13)
        Ldc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.collect.i.a(boolean, boolean):boolean");
    }
}
