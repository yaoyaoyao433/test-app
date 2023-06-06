package com.meituan.android.common.mtguard.collect;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.bean.Xid;
import com.meituan.android.common.dfingerprint.bean.XidRequestBody;
import com.meituan.android.common.dfingerprint.collection.utils.ApplistManager;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.interfaces.ICypher;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.dfingerprint.update.MiniBat;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.collect.j;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.ProcessUtils;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class q extends j implements Runnable {
    private static volatile ScheduledFuture<?> a = null;
    private static final String b = "xid";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String q = "v5_req_report_error";
    private static final String r = "3";
    private static boolean v = false;
    private static boolean w = false;
    private ICypher s;
    private SyncStoreManager t;
    private e u;
    private final boolean x;

    /* loaded from: classes2.dex */
    public final class a extends j.a implements IResponseParser {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super();
            Object[] objArr = {q.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a62af8b1988361f6d433bb5fb0b393a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a62af8b1988361f6d433bb5fb0b393a");
            }
        }

        @Override // com.meituan.android.common.mtguard.collect.j.a, com.meituan.android.common.dfingerprint.network.IResponseParser
        public final boolean onError(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1d6a893ea718fd8b38546f0a0db30b8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1d6a893ea718fd8b38546f0a0db30b8")).booleanValue() : super.onError(i, str);
        }

        @Override // com.meituan.android.common.mtguard.collect.j.a, com.meituan.android.common.dfingerprint.network.IResponseParser
        public final boolean onResponse(int i, byte[] bArr, long j, int i2) {
            Object[] objArr = {Integer.valueOf(i), bArr, new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1df9dce057dc498e8b182d525b1723d1", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1df9dce057dc498e8b182d525b1723d1")).booleanValue();
            }
            if (super.onResponse(i, bArr, j, i2)) {
                try {
                    String string = q.this.k.getString("result");
                    int i3 = q.this.k.getInt("interval");
                    if (TextUtils.isEmpty(string) || string.equals(StringUtil.NULL) || i3 <= 0) {
                        q.this.f.onFailed(-3002, "response error");
                        MTGlibInterface.raptorAPI(q.this.m, 9404, i2, 0, System.currentTimeMillis() - j);
                        return false;
                    }
                    if (DFPConfigs.isXidFirst) {
                        MTGlibInterface.raptorFakeAPI(MTGlibInterface.API_xid_duration, 200, System.currentTimeMillis() - MTGuard.sFirstLaunchTime);
                        DFPConfigs.isXidFirst = false;
                    }
                    Xid xid = new Xid(string, System.currentTimeMillis() + (i3 * 1000 * 60));
                    NBridge.main1(58, new Object[]{DFPConfigs.KEY_XID_ID, string});
                    NBridge.main1(58, new Object[]{DFPConfigs.KEY_XID_EXPIRED_TIME, String.valueOf(xid.expiredTimeInMillisecond)});
                    if (i3 != Xid.getXidReportInterval(q.this.t)) {
                        NBridge.main1(58, new Object[]{DFPConfigs.KEY_XID_REPORT_INTERVAL, String.valueOf(i3)});
                        long j2 = i3 * 60;
                        q.this.a(j2, j2);
                    }
                    q.this.f.onSuccess(xid.id, xid.expiredTimeInMillisecond, "get xid from server");
                    return true;
                } catch (Throwable th) {
                    q.this.f.onFailed(-3002, "response error");
                    MTGlibInterface.raptorAPI(q.this.m, 9405, i2, 0, System.currentTimeMillis() - j);
                    MTGuardLog.setErrorLogan(th);
                    return false;
                }
            }
            return false;
        }
    }

    public q(@NonNull e eVar, boolean z) {
        super(eVar, b, MTGlibInterface.API_report_xidsync, q, MTGlibInterface.API_report_xid_fail3);
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4aab5ebbc78cf3772787a0a63c05ec4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4aab5ebbc78cf3772787a0a63c05ec4");
            return;
        }
        this.u = eVar;
        this.t = this.e.getIdStore();
        this.s = this.e.getCypher();
        this.x = z;
    }

    private static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0606d2a46973010ef3f0f7c7dafb87f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0606d2a46973010ef3f0f7c7dafb87f");
        }
        XidRequestBody xidRequestBody = new XidRequestBody();
        xidRequestBody.fingerPrintData = str;
        xidRequestBody.encryptVersion = str2;
        String json = new GsonBuilder().disableHtmlEscaping().create().toJson(xidRequestBody);
        MTGuardLog.setLogan("xid request body:".concat(String.valueOf(json)));
        return json;
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59d765f073d60f9e16c61c3f9135a156", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59d765f073d60f9e16c61c3f9135a156");
            return;
        }
        Xid deserialization = Xid.deserialization(this.t);
        long xidReportInterval = Xid.getXidReportInterval(this.t) * 60;
        if (deserialization != null && deserialization.isValid()) {
            j = Math.min(j, Math.min(Math.max(0L, deserialization.expiredTimeInMillisecond - System.currentTimeMillis()), xidReportInterval * 1000) / 1000);
        }
        a(j, xidReportInterval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3590c4ea31005d0ba36c78522a0a389", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3590c4ea31005d0ba36c78522a0a389");
            return;
        }
        if (a != null && !a.isCancelled()) {
            a.cancel(true);
        }
        MTGuardLog.setLogan("schedule xid thread. delay:" + j + ",interval:" + j2);
        try {
            this.i = false;
            a = DFPTask.sMtgScheduleThreadPool.scheduleWithFixedDelay(this, j, j2, TimeUnit.SECONDS);
        } catch (Throwable th) {
            this.f.onFailed(-3001, "request error");
            a(j2);
            MTGuardLog.setErrorLogan(th);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5704a364ede70b8baa7f78ce787310ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5704a364ede70b8baa7f78ce787310ed");
            return;
        }
        try {
            DFPConfigs.reportFlag = DFPConfigs.getReportFlag(this.e);
            a(0L);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.j, java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e804f68a24390b2dbfa7b69e369cd386", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e804f68a24390b2dbfa7b69e369cd386");
            return;
        }
        try {
            MTGuardLog.setLogan("start xid collector thread:" + Thread.currentThread().getName() + ", process:" + com.meituan.android.common.mtguard.utils.b.a());
            String main1 = NBridge.main1(42, new Object[0]);
            MTGuardLog.setLogan("collect xid finish");
            DFPManager.sDFPDataCache = DFPManager.encDfpDataForFingerPrint();
            if (!ProcessUtils.isMainProcess(this.d)) {
                Xid deserialization = Xid.deserialization(this.t);
                if (deserialization == null || !deserialization.isValid()) {
                    this.f.onFailed(-3001, "request error");
                    return;
                } else {
                    this.f.onSuccess(deserialization.id, deserialization.expiredTimeInMillisecond, "get xid from cache");
                    return;
                }
            }
            if (!v) {
                v = true;
                if (this.x) {
                    new i(this.u, true).a();
                }
                new i(this.u).a();
                MTGuardLog.setLogan("dfpid duration:" + (System.currentTimeMillis() - MTGuard.sFirstLaunchTime));
            }
            DFPReporter build = new DFPReporter.Builder().addInterceptor(this.e.getInterceptor()).addResponseParser((IResponseParser) new a()).build();
            String xidPath = DFPConfigs.getXidPath();
            XidRequestBody xidRequestBody = new XidRequestBody();
            xidRequestBody.fingerPrintData = main1;
            xidRequestBody.encryptVersion = "3";
            String json = new GsonBuilder().disableHtmlEscaping().create().toJson(xidRequestBody);
            MTGuardLog.setLogan("xid request body:".concat(String.valueOf(json)));
            build.reportFingerprintBody(xidPath, json, this.i);
            MTGuardLog.setLogan("xid duration:" + (System.currentTimeMillis() - MTGuard.sFirstLaunchTime));
            if (this.g % 4 == 0) {
                MiniBat.doMiniBat(this.d, this.s);
            }
            if (w) {
                return;
            }
            w = true;
            g gVar = new g(this.u);
            MTGuardLog.setLogan("start deviceinfo");
            SyncStoreManager syncStoreManager = gVar.a.d;
            if (System.currentTimeMillis() >= syncStoreManager.getDeviceInfoLastReportTime() + (syncStoreManager.getDeviceInfoReportInterval() * DFPConfigs.ONE_HOUR) || com.meituan.android.common.mtguard.a.h.booleanValue()) {
                Thread.sleep(20000L);
                MTGuardLog.setLogan("start ApplistManager collect");
                ApplistManager.getInstance(gVar.a.c).start();
                gVar.a(false);
            }
            MTGuardLog.setLogan("deviceinfo duration:" + (System.currentTimeMillis() - MTGuard.sFirstLaunchTime));
        } catch (Throwable th) {
            MTGuardLog.setLogan("post xid failed, because:" + th.getMessage());
            this.f.onFailed(-3001, "request error");
        }
    }
}
