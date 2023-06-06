package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.dfingerprint.DFPIdCallBack;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.network.IResponseParser;
import com.meituan.android.common.dfingerprint.store.BioSharedPref;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class j implements Runnable {
    protected static final int c = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context d;
    protected DFPManager e;
    protected DFPIdCallBack f;
    protected long g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected JSONObject k;
    protected String l;
    protected String m;
    protected String n;
    protected String o;
    protected BioSharedPref p;

    /* loaded from: classes2.dex */
    public class a implements IResponseParser {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
        }

        @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
        public boolean onError(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd8abb959d99dd048905c5c9e85e8ed", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd8abb959d99dd048905c5c9e85e8ed")).booleanValue();
            }
            MTGuardLog.setLogan("bio onError code:" + i + ", msg:" + str);
            j.this.f.onFailed(i, str);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:15:0x007c, B:20:0x009f, B:23:0x00a4, B:25:0x00ce, B:36:0x0113, B:38:0x0130, B:33:0x010c, B:40:0x0136, B:28:0x0100), top: B:46:0x007a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0130 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:15:0x007c, B:20:0x009f, B:23:0x00a4, B:25:0x00ce, B:36:0x0113, B:38:0x0130, B:33:0x010c, B:40:0x0136, B:28:0x0100), top: B:46:0x007a, inners: #0 }] */
        @Override // com.meituan.android.common.dfingerprint.network.IResponseParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onResponse(int r25, byte[] r26, long r27, int r29) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.collect.j.a.onResponse(int, byte[], long, int):boolean");
        }
    }

    public j(@NonNull e eVar, final String str, String str2, String str3, String str4) {
        Object[] objArr = {eVar, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46df4dd56e528a90f7da6bc858b5325e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46df4dd56e528a90f7da6bc858b5325e");
            return;
        }
        this.g = 0L;
        this.d = eVar.b;
        this.e = eVar.c;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.f = new DFPIdCallBack() { // from class: com.meituan.android.common.mtguard.collect.j.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.dfingerprint.DFPIdCallBack
            public final void onFailed(int i, String str5) {
                Object[] objArr2 = {Integer.valueOf(i), str5};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "780de4312039ee16c31f97cdbf568568", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "780de4312039ee16c31f97cdbf568568");
                } else {
                    j.this.a(i);
                }
            }

            @Override // com.meituan.android.common.dfingerprint.DFPIdCallBack
            public final void onSuccess(String str5, long j, String str6) {
                Object[] objArr2 = {str5, new Long(j), str6};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7f1ce75c7b1a523c40a978c3b278ff73", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7f1ce75c7b1a523c40a978c3b278ff73");
                    return;
                }
                MTGuardLog.setLogan(str + " callback success, id:" + str5 + ", expire time:" + j + ", msg:" + str6);
                j.this.g = 0L;
            }
        };
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51494c74ea4fc5e514ed300e46d1cfed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51494c74ea4fc5e514ed300e46d1cfed");
        } else if (-3004 == i) {
            MTGuardLog.setLogan("post " + this.l + " in shark");
            a(0L, true);
        } else {
            MTGuardLog.setLogan(this.l + " callback failed. retry count:" + this.g);
            if (this.g == Long.MAX_VALUE) {
                this.g = 0L;
            }
            this.g++;
            long j = this.g % 4;
            if (j != 0) {
                a(j * 5, false);
                return;
            }
            this.j = true;
            if (ProcessUtils.isMainProcess(this.d)) {
                MTGlibInterface.raptorAPI(this.o, 9400, 0, 0, 0L);
            }
        }
    }

    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74e6188d29a654ef1202e87d0baf14b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74e6188d29a654ef1202e87d0baf14b4");
            return;
        }
        try {
            this.i = z;
            DFPTask.sMtgScheduleThreadPool.schedule(this, j, TimeUnit.SECONDS);
        } catch (Throwable th) {
            this.f.onFailed(-3001, "request error");
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
