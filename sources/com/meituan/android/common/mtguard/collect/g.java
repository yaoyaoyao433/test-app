package com.meituan.android.common.mtguard.collect;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPDataCallBack;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.bean.ReqeustBody;
import com.meituan.android.common.dfingerprint.collection.utils.ApplistManager;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;
    public e a;
    public DFPDataCallBack b;
    public int c;
    public int d;

    public g(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31bbc3b66f794c91168dcf6e49c9349", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31bbc3b66f794c91168dcf6e49c9349");
            return;
        }
        this.c = 0;
        this.d = 6;
        this.a = eVar;
        this.b = new DFPDataCallBack() { // from class: com.meituan.android.common.mtguard.collect.g.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.DFPDataCallBack
            public final void onFailed(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d93bc711a06a8218df43c1ffcbb5da7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d93bc711a06a8218df43c1ffcbb5da7");
                } else if (-3004 == i) {
                    MTGuardLog.setLogan("post deviceinfo in shark");
                    com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.g.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c0ed5f0b26c1ddf5a87f61dd2b48068f", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c0ed5f0b26c1ddf5a87f61dd2b48068f");
                            } else {
                                g.this.a(true);
                            }
                        }
                    });
                } else {
                    MTGuardLog.setLogan("deviceInfoCollector callback failed. retry count:" + g.this.c);
                    if (g.this.c == Long.MAX_VALUE) {
                        g.this.c = 0;
                    }
                    g.this.c++;
                    final int i2 = g.this.c % g.this.d;
                    if (i2 != 0) {
                        com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.g.1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bce9d4c9e629af6e748f31b7835807c8", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bce9d4c9e629af6e748f31b7835807c8");
                                    return;
                                }
                                try {
                                    Thread.sleep(i2 * 5 * 1000);
                                    g.this.a(false);
                                } catch (InterruptedException e) {
                                    MTGuardLog.setErrorLogan(e);
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.meituan.android.common.dfingerprint.DFPDataCallBack
            public final void onSuccess(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e6af0a5fd968e50297acbdaf201916ad", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e6af0a5fd968e50297acbdaf201916ad");
                    return;
                }
                MTGuardLog.setLogan("deviceInfoCollector callback success");
                g.this.c = 0;
            }
        };
    }

    private static /* synthetic */ int a(g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d362dc0b6490870e6798a90457f45e8e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d362dc0b6490870e6798a90457f45e8e")).intValue();
        }
        gVar.c = 0;
        return 0;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d9246e6de21de69b2c55e90e0b5c8b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d9246e6de21de69b2c55e90e0b5c8b5");
            return;
        }
        try {
            MTGuardLog.setLogan("start deviceinfo");
            SyncStoreManager syncStoreManager = this.a.d;
            if (System.currentTimeMillis() >= syncStoreManager.getDeviceInfoLastReportTime() + (syncStoreManager.getDeviceInfoReportInterval() * DFPConfigs.ONE_HOUR) || com.meituan.android.common.mtguard.a.h.booleanValue()) {
                Thread.sleep(20000L);
                MTGuardLog.setLogan("start ApplistManager collect");
                ApplistManager.getInstance(this.a.c).start();
                a(false);
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e952b2ef5f931134e81bfe3f91c82b77", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e952b2ef5f931134e81bfe3f91c82b77")).booleanValue();
        }
        DFPReporter build = new DFPReporter.Builder().addInterceptor(this.a.c.getInterceptor()).addResponseParser(new IResponseParser() { // from class: com.meituan.android.common.mtguard.collect.g.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
            public final boolean onError(int i, String str2) {
                Object[] objArr2 = {Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2cef843e74a45144c82c7ea345d01473", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2cef843e74a45144c82c7ea345d01473")).booleanValue();
                }
                MTGuardLog.setLogan("/v5/device-info onError code:" + i + ", msg:" + str2);
                g.this.b.onFailed(i, str2);
                return false;
            }

            @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
            public final boolean onResponse(int i, byte[] bArr, long j, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), bArr, new Long(j), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7bd9193582326a5840b82d51fc53e6e", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7bd9193582326a5840b82d51fc53e6e")).booleanValue();
                }
                StringBuilder sb = new StringBuilder("deviceinfo onResponse response_code:");
                sb.append(i);
                sb.append(" response_body:");
                sb.append((bArr == null || bArr.length == 0) ? StringUtil.NULL : new String(bArr));
                MTGuardLog.setLogan(sb.toString());
                try {
                    if (i != 200) {
                        MTGlibInterface.raptorAPI(MTGlibInterface.API_report_deviceinfo, i, i2, 0, System.currentTimeMillis() - j);
                        g.this.b.onFailed(-3, "response code is not 200");
                        return false;
                    }
                    if (bArr != null && bArr.length != 0) {
                        String str2 = new String(bArr);
                        MTGlibInterface.raptorAPI(MTGlibInterface.API_report_deviceinfo, 200, i2, str2.length(), System.currentTimeMillis() - j);
                        JSONObject jSONObject = new JSONObject(str2);
                        int intValue = ((Integer) jSONObject.get("code")).intValue();
                        if (intValue != 0) {
                            MTGlibInterface.raptorAPI(MTGlibInterface.API_report_deviceinfo, 9402, i2, str2.length(), System.currentTimeMillis() - j);
                            MTGlibInterface.raptorAPI("v5_req_deviceinfo_error", intValue, i2, str2.length(), System.currentTimeMillis() - j);
                            g.this.b.onFailed(intValue, jSONObject.optString("message"));
                            return false;
                        }
                        g.this.a.d.saveDeviceInfoReportInterval(jSONObject.getJSONObject("data").getInt("interval"));
                        g.this.a.d.saveDeviceInfoLastReportTime(System.currentTimeMillis());
                        g.this.b.onSuccess(null);
                        return true;
                    }
                    MTGlibInterface.raptorAPI(MTGlibInterface.API_report_deviceinfo, 9401, i2, 0, System.currentTimeMillis() - j);
                    g.this.b.onFailed(-3, "request body is invalid");
                    return false;
                } catch (Exception unused) {
                    MTGlibInterface.raptorAPI(MTGlibInterface.API_report_deviceinfo, 9405, i2, 0, System.currentTimeMillis() - j);
                    return false;
                }
            }
        }).build();
        try {
            ReqeustBody reqeustBody = new ReqeustBody(str, "5.17.4");
            Gson create = new GsonBuilder().disableHtmlEscaping().create();
            if (create != null) {
                String json = create.toJson(reqeustBody);
                MTGuardLog.setLogan("postDeviceInfo body  > ".concat(String.valueOf(json)));
                return build.reportDeviceInfo(json, z);
            }
            return false;
        } catch (Exception e) {
            MTGuardLog.setLogan("post deviceinfo failed, because:" + e.getMessage());
            this.b.onFailed(-3, "request error");
            return false;
        }
    }

    private static /* synthetic */ int b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2a3fa0b6faf0355a6d98de3b03c838b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2a3fa0b6faf0355a6d98de3b03c838b")).intValue();
        }
        int i = gVar.c;
        gVar.c = i + 1;
        return i;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd52070d0812bc1840f80e9876c78758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd52070d0812bc1840f80e9876c78758");
            return;
        }
        MTGuardLog.setLogan("start deviceinfo collect");
        if (!i.a) {
            NBridge.main1(41, new Object[0]);
        }
        a(NBridge.main1(45, new Object[0]), z);
    }
}
