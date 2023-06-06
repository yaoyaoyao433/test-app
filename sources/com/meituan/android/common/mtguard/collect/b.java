package com.meituan.android.common.mtguard.collect;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPIdCallBack;
import com.meituan.android.common.dfingerprint.bean.BioRequestBody;
import com.meituan.android.common.dfingerprint.impl.DFPReporter;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.dfingerprint.store.BioSharedPref;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.mtguard.collect.j;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class b extends j implements Runnable {
    public static ThreadLocal<Boolean> a = new ThreadLocal<>();
    public static volatile int b = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String q = "bio";
    private static final String r = "1";
    private static final String s = "v5_fingerprint/v1/app/bio/info/report";
    private static final String t = "v5_req_bio_report_error";
    private static final String u = "v5_bio_fail3";
    private static final int v = 32;
    private static final int w = 65;
    private static final int x = 64;
    private static final int y = 3;
    private boolean z;

    /* loaded from: classes2.dex */
    public final class a extends j.a implements IResponseParser {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super();
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bcf69b95b3ef942d4247b2b1c0eceda", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bcf69b95b3ef942d4247b2b1c0eceda");
            }
        }

        @Override // com.meituan.android.common.mtguard.collect.j.a, com.meituan.android.common.dfingerprint.network.IResponseParser
        public final boolean onError(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e823e32b2fba5b9685102d733c3cd6aa", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e823e32b2fba5b9685102d733c3cd6aa")).booleanValue() : super.onError(i, str);
        }

        @Override // com.meituan.android.common.mtguard.collect.j.a, com.meituan.android.common.dfingerprint.network.IResponseParser
        public final boolean onResponse(int i, byte[] bArr, long j, int i2) {
            Object[] objArr = {Integer.valueOf(i), bArr, new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6acd70a130fbba5c3f891c3ce240dab7", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6acd70a130fbba5c3f891c3ce240dab7")).booleanValue();
            }
            if (super.onResponse(i, bArr, j, i2)) {
                b.this.f.onSuccess(null, 0L, "get bio from server");
                return true;
            }
            return false;
        }
    }

    public b(@NonNull e eVar) {
        super(eVar, q, s, t, u);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2964b93d9d0d955c8f919e5573336c53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2964b93d9d0d955c8f919e5573336c53");
            return;
        }
        this.z = false;
        this.p = BioSharedPref.getInstance(this.d);
        this.f = new DFPIdCallBack() { // from class: com.meituan.android.common.mtguard.collect.b.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.DFPIdCallBack
            public final void onFailed(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a9088b62ed65f0e407a5bd8ec7f6bd80", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a9088b62ed65f0e407a5bd8ec7f6bd80");
                    return;
                }
                b.this.a(i);
                if (b.this.j) {
                    b.a(b.this);
                }
            }

            @Override // com.meituan.android.common.dfingerprint.DFPIdCallBack
            public final void onSuccess(String str, long j, String str2) {
                Object[] objArr2 = {str, new Long(j), str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3f6017836d00dad73657f6a4fced50fe", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3f6017836d00dad73657f6a4fced50fe");
                    return;
                }
                MTGuardLog.setLogan("bio callback success, msg:".concat(String.valueOf(str2)));
                b.this.g = 0L;
                b.a(b.this);
            }
        };
    }

    private String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8d444f91822c123e83ce21802cae066", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8d444f91822c123e83ce21802cae066");
        }
        BioRequestBody bioRequestBody = new BioRequestBody();
        bioRequestBody.fingerPrintData = str;
        bioRequestBody.encryptVersion = str2;
        bioRequestBody.index = String.valueOf(this.p.readInt(BioSharedPref.BIO_COLLECT_INDEX));
        String json = new GsonBuilder().disableHtmlEscaping().create().toJson(bioRequestBody);
        MTGuardLog.setLogan("bio request body:".concat(String.valueOf(json)));
        return json;
    }

    public static /* synthetic */ void a(b bVar) {
        int readInt = bVar.p.readInt(BioSharedPref.BIO_COLLECT_INDEX) + 1;
        bVar.p.writeInt(BioSharedPref.BIO_COLLECT_INDEX, Integer.valueOf(readInt));
        if (readInt >= 3) {
            long currentTimeMillis = System.currentTimeMillis();
            bVar.p.writeLong(BioSharedPref.BIO_COLLECT_CURRENTTIMEMILLIS, Long.valueOf(currentTimeMillis));
            MTGuardLog.setLogan("bio finish next index: " + readInt + ", currentTimeMillis:" + currentTimeMillis);
            bVar.p.writeString(BioSharedPref.BIO_COLLECT_MTX_KEY, "");
        } else {
            MTGuardLog.setLogan("bio finish next index: ".concat(String.valueOf(readInt)));
        }
        if (bVar.h) {
            d a2 = d.a(bVar.d);
            try {
                o.c().e();
                if (a2.b.size() != 0) {
                    a2.b.clear();
                    MTGuardLog.setLogan("clear click info");
                    NBridge.main3(50, new Object[]{Integer.valueOf((int) TbsListener.ErrorCode.ERROR_TBSINSTALLER_ISTBSCORELEGAL_02)});
                }
            } catch (Throwable unused) {
            }
            d.a(bVar.d).g = true;
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba6cd26119acfac4bb3f8c3d66a26853", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba6cd26119acfac4bb3f8c3d66a26853")).booleanValue() : a.get() != null && a.get().booleanValue();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16c3385298e97a718f8b66d5ea2b6d7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16c3385298e97a718f8b66d5ea2b6d7e");
            return;
        }
        int readInt = this.p.readInt(BioSharedPref.BIO_COLLECT_INDEX) + 1;
        this.p.writeInt(BioSharedPref.BIO_COLLECT_INDEX, Integer.valueOf(readInt));
        if (readInt >= 3) {
            long currentTimeMillis = System.currentTimeMillis();
            this.p.writeLong(BioSharedPref.BIO_COLLECT_CURRENTTIMEMILLIS, Long.valueOf(currentTimeMillis));
            MTGuardLog.setLogan("bio finish next index: " + readInt + ", currentTimeMillis:" + currentTimeMillis);
            this.p.writeString(BioSharedPref.BIO_COLLECT_MTX_KEY, "");
        } else {
            MTGuardLog.setLogan("bio finish next index: ".concat(String.valueOf(readInt)));
        }
        if (this.h) {
            d a2 = d.a(this.d);
            try {
                o.c().e();
                if (a2.b.size() != 0) {
                    a2.b.clear();
                    MTGuardLog.setLogan("clear click info");
                    NBridge.main3(50, new Object[]{Integer.valueOf((int) TbsListener.ErrorCode.ERROR_TBSINSTALLER_ISTBSCORELEGAL_02)});
                }
            } catch (Throwable unused) {
            }
            d.a(this.d).g = true;
        }
    }

    public final void a(long j, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8024920555a2be2523d50d62d4009efa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8024920555a2be2523d50d62d4009efa");
            return;
        }
        this.h = z2;
        super.a(j, false);
    }

    @Override // com.meituan.android.common.mtguard.collect.j, java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe41e3a764f6911d59356ba2b2496b75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe41e3a764f6911d59356ba2b2496b75");
            return;
        }
        try {
            MTGuardLog.setLogan("start bio collector thread:" + Thread.currentThread().getName() + ", process:" + com.meituan.android.common.mtguard.utils.b.a() + ", is collect withBio:" + this.h + ", bio_index:" + this.p.readInt(BioSharedPref.BIO_COLLECT_INDEX));
            a.set(Boolean.TRUE);
            boolean isMainProcess = ProcessUtils.isMainProcess(this.d);
            if (this.h) {
                if (isMainProcess) {
                    b = 32;
                } else {
                    b = 64;
                }
                MTGuardLog.setLogan("stop collect bio");
                d a2 = d.a(this.d);
                o.c().d();
                MTGuardLog.setLogan("stop collect click:" + a2.b.size() + ", extral info:" + a2.d.size());
            } else {
                b = 65;
            }
            String main1 = NBridge.main1(63, new Object[]{String.valueOf(this.h)});
            MTGuardLog.setLogan("collect bio finish");
            DFPReporter build = new DFPReporter.Builder().addInterceptor(this.e.getInterceptor()).addResponseParser((IResponseParser) new a()).build();
            String bioPath = DFPConfigs.getBioPath();
            BioRequestBody bioRequestBody = new BioRequestBody();
            bioRequestBody.fingerPrintData = main1;
            bioRequestBody.encryptVersion = "1";
            bioRequestBody.index = String.valueOf(this.p.readInt(BioSharedPref.BIO_COLLECT_INDEX));
            String json = new GsonBuilder().disableHtmlEscaping().create().toJson(bioRequestBody);
            MTGuardLog.setLogan("bio request body:".concat(String.valueOf(json)));
            build.reportFingerprintBody(bioPath, json, this.z);
            long readLong = BioSharedPref.getInstance(this.d).readLong(BioSharedPref.FIRST_PROCESS_BOOT_TIME_KEY);
            if (readLong != -1) {
                MTGuardLog.setLogan("bio_probe duration:" + (SystemClock.elapsedRealtime() - readLong));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
