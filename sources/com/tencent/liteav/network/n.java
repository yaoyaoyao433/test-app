package com.tencent.liteav.network;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class n {
    private Context a;
    private String b;
    private String c;
    private String e;
    private long f;
    private long g;
    private String h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private boolean w = true;
    private String d = "Android";

    public n(Context context) {
        this.a = context.getApplicationContext();
        this.b = com.tencent.liteav.basic.util.g.b(this.a);
        m.a().a(this.a);
        a();
    }

    public void a() {
        this.c = "";
        this.f = 0L;
        this.g = -1L;
        this.h = "";
        this.i = -1L;
        this.j = -1L;
        this.k = -1L;
        this.l = -1L;
        this.e = "";
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = 0L;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.w = true;
    }

    private void e() {
        long j = this.p;
        long j2 = this.q;
        a();
        this.n = j;
        this.o = j2;
    }

    public void b() {
        this.f = System.currentTimeMillis();
        this.c = m.a().b();
    }

    public void c() {
        f();
        e();
    }

    public void a(boolean z) {
        this.l = z ? 2L : 1L;
        if (z) {
            this.w = false;
        }
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(boolean z, String str) {
        this.h = str;
        if (z) {
            this.g = 1L;
        } else if (str != null) {
            int indexOf = str.indexOf(CommonConstant.Symbol.COLON);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            if (str != null) {
                for (String str2 : str.split("[.]")) {
                    if (!c(str2)) {
                        this.g = 3L;
                        return;
                    }
                }
                this.g = 2L;
            }
        }
    }

    public void a(long j, long j2, long j3) {
        this.i = j;
        this.j = j2;
        this.k = j3;
    }

    public void d() {
        this.m++;
    }

    public void a(long j, long j2) {
        this.p = j;
        this.q = j2;
    }

    public void b(long j, long j2) {
        this.v++;
        this.r += j;
        this.s += j2;
        if (j > this.t) {
            this.t = j;
        }
        if (j2 > this.u) {
            this.u = j2;
        }
    }

    private void f() {
        long j;
        long j2;
        float f;
        float f2;
        if (this.f == 0 || b(this.b) || b(this.e)) {
            return;
        }
        String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(this.e);
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        long j3 = this.p > this.n ? this.p - this.n : 0L;
        long j4 = this.q > this.o ? this.q - this.o : 0L;
        if (this.v > 0) {
            j2 = this.r / this.v;
            j = this.s / this.v;
        } else {
            j = 0;
            j2 = 0;
        }
        String txCreateToken = TXCDRApi.txCreateToken();
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.e;
        TXCDRApi.InitEvent(this.a, txCreateToken, com.tencent.liteav.basic.datareport.a.T, com.tencent.liteav.basic.datareport.a.am, tXCDRExtInfo);
        TXCDRApi.txSetEventValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "str_user_id", this.b);
        TXCDRApi.txSetEventValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "str_stream_id", streamIDByStreamUrl);
        TXCDRApi.txSetEventValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "str_access_id", this.c);
        TXCDRApi.txSetEventValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "str_platform", this.d);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_server_type", this.g);
        TXCDRApi.txSetEventValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "str_server_addr", this.h);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_dns_timecost", this.i);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_connect_timecost", this.j);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_handshake_timecost", this.k);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_push_type", this.l);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_totaltime", currentTimeMillis);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_block_count", this.m);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_video_drop", j3);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_audio_drop", j4);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_video_que_avg", j2);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_audio_que_avg", j);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_video_que_max", this.t);
        TXCDRApi.txSetEventIntValue(txCreateToken, com.tencent.liteav.basic.datareport.a.T, "u32_audio_que_max", this.u);
        TXCDRApi.nativeReportEvent(txCreateToken, com.tencent.liteav.basic.datareport.a.T);
        float f3 = (currentTimeMillis <= 0 || this.m == 0) ? 0.0f : (((float) this.m) * 60000.0f) / ((float) currentTimeMillis);
        if (this.v > 0) {
            float f4 = this.r == 0 ? 0.0f : ((float) this.r) / ((float) this.v);
            if (this.s != 0) {
                f2 = ((float) this.s) / ((float) this.v);
                f = f4;
                if (this.w || b(this.c) || this.k == -1) {
                    return;
                }
                m.a().a(this.c, this.g, currentTimeMillis, this.k, f3, f, f2);
                return;
            }
            f = f4;
        } else {
            f = 0.0f;
        }
        f2 = 0.0f;
        if (this.w) {
        }
    }

    private boolean b(String str) {
        return str == null || str.length() == 0;
    }

    private boolean c(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }
}
