package com.tencent.liteav;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class n {
    private int E;
    private int G;
    private String H;
    private String I;
    private Context c;
    private int q;
    private int y;
    private final String a = "TXCVodPlayCollection";
    private final String b = "1";
    private String d = null;
    private long e = 0;
    private long f = 0;
    private long g = 0;
    private boolean h = false;
    private boolean i = true;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private long m = 0;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private boolean s = false;
    private boolean t = false;
    private int u = 0;
    private int v = 0;
    private String w = "0";
    private String x = "";
    private String z = "";
    private int A = -1;
    private int B = 0;
    private int C = 0;
    private int D = 0;
    private float F = 1.0f;
    private String K = "";
    private String r = TXCCommonUtil.getAppVersion();
    private String J = com.tencent.liteav.basic.util.g.e();

    public n(Context context) {
        this.c = context;
    }

    public void a(String str) {
        TXCLog.i("TXCVodPlayCollection", "setUrl: " + str);
        this.d = str;
    }

    public String a() {
        Context context = this.c;
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
    }

    private void m() {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.d;
        TXCDRApi.InitEvent(this.c, this.J, com.tencent.liteav.basic.datareport.a.ad, com.tencent.liteav.basic.datareport.a.at, tXCDRExtInfo);
        String c = com.tencent.liteav.basic.util.g.c();
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_device_type", c);
        int e = com.tencent.liteav.basic.util.g.e(this.c);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_network_type", e);
        String f = com.tencent.liteav.basic.util.g.f(this.c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "dev_uuid", f);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_app_version", this.r);
        String a = a();
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_app_name", a);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, com.tencent.liteav.basic.datareport.a.l, String.valueOf(Build.VERSION.SDK_INT));
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_stream_url", this.d);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "token", this.J);
        String userId = TXCCommonUtil.getUserId();
        if (userId == null || userId.isEmpty()) {
            userId = CommonConstant.Symbol.UNDERLINE + f;
        }
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_user_id", userId);
        String c2 = com.tencent.liteav.basic.util.g.c(this.c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_package_name", c2);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_app_id", this.K);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_timeuse", this.l);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_videotime", this.j);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_avg_load", this.o == 0 ? 0L : this.p / this.o);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_load_cnt", this.o);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_max_load", this.q);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_avg_block_time", this.p);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_player_type", this.v);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_dns_time", this.C > 0 ? this.C : -1L);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_tcp_did_connect", this.B > 0 ? this.B : -1L);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_first_video_packet", this.D > 0 ? this.D : -1L);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_first_i_frame", this.n > 0 ? this.n : -1L);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_server_ip", this.H);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_drm_type", this.I);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_fileid", this.x);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_playmode", this.w);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u64_err_code", this.y);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "str_err_info", this.z);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_video_decode_type", this.A);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_speed", (int) (this.F * 100.0f));
        TXCDRApi.nativeReportEvent(this.J, com.tencent.liteav.basic.datareport.a.ad);
        StringBuilder sb = new StringBuilder("report evt 40301: token=");
        sb.append(this.J);
        sb.append(" ,str_device_type");
        sb.append("=");
        sb.append(c);
        sb.append(" ,u32_network_type");
        sb.append("=");
        sb.append(e);
        sb.append(" ,dev_uuid");
        sb.append("=");
        sb.append(com.tencent.liteav.basic.util.g.f(this.c));
        sb.append(" ,str_app_version");
        sb.append("=");
        sb.append(this.r);
        sb.append(" ,str_app_name");
        sb.append("=");
        sb.append(a);
        sb.append(" ,");
        sb.append(com.tencent.liteav.basic.datareport.a.l);
        sb.append("=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(" ,str_stream_url");
        sb.append("=");
        sb.append(this.d);
        sb.append(" ,str_user_id");
        sb.append("=");
        sb.append(userId);
        sb.append(" ,str_package_name");
        sb.append("=");
        sb.append(c2);
        sb.append(" ,u32_timeuse");
        sb.append("=");
        sb.append(this.l);
        sb.append(" ,u32_videotime");
        sb.append("=");
        sb.append(this.j);
        sb.append(" ,u32_avg_load");
        sb.append("=");
        sb.append(this.o != 0 ? this.p / this.o : 0);
        sb.append(" ,u32_load_cnt");
        sb.append("=");
        sb.append(this.o);
        sb.append(" ,u32_max_load");
        sb.append("=");
        sb.append(this.q);
        sb.append(" ,u32_avg_block_time");
        sb.append("=");
        sb.append(this.p);
        sb.append(" ,u32_player_type");
        sb.append("=");
        sb.append(this.v);
        sb.append(" ,u32_dns_time");
        sb.append("=");
        sb.append(this.C);
        sb.append(" ,u32_tcp_did_connect");
        sb.append("=");
        sb.append(this.B > 0 ? this.B : -1);
        sb.append(" ,u32_first_video_packet");
        sb.append("=");
        sb.append(this.D > 0 ? this.D : -1);
        sb.append(" ,u32_first_i_frame");
        sb.append("=");
        sb.append(this.n);
        sb.append(" ,u32_server_ip");
        sb.append("=");
        sb.append(this.H);
        sb.append(" ,u32_drm_type");
        sb.append("=");
        sb.append(this.I);
        sb.append(" ,str_fileid");
        sb.append("=");
        sb.append(this.x);
        sb.append(" ,u32_playmode");
        sb.append("=");
        sb.append(this.w);
        sb.append(" ,u64_err_code");
        sb.append("=");
        sb.append(this.y);
        sb.append(" ,str_err_info");
        sb.append("=");
        sb.append(this.z);
        sb.append(" ,u32_speed");
        sb.append("=");
        sb.append(this.F * 100.0f);
        sb.append(" ,u32_app_id");
        sb.append("=");
        sb.append(TXCCommonUtil.getAppID());
        sb.append(" ,u32_video_decode_type");
        sb.append("=");
        sb.append(this.A);
        TXCLog.i("TXCVodPlayCollection", sb.toString());
    }

    public void a(int i, int i2) {
        this.j = i;
        int a = i2 / o.a(this.c).a(this.K);
        if (a != this.k) {
            this.k = a;
            n();
        }
    }

    private void n() {
        if (0 == this.f) {
            TXCLog.i("TXCVodPlayCollection", "calculateSegmentPlayTime mBeginPlayTS == 0");
            return;
        }
        TXCLog.i("TXCVodPlayCollection", "calculateSegmentPlayTime mCurIndexPlayTime= " + this.m + ", mBeginPlayTS=" + this.f);
        this.m = this.m + ((long) ((int) (System.currentTimeMillis() - this.f)));
        this.f = System.currentTimeMillis();
        if (this.w.equals("1")) {
            boolean b = o.a(this.c).b(this.K);
            if (!b) {
                o.a(this.c).c(this.K);
            }
            if (this.h && b) {
                o();
            }
            this.l = (int) (this.l + (this.m / 1000));
            this.m %= 1000;
        }
    }

    private void o() {
        TXCLog.i("TXCVodPlayCollection", "onSegmentReport");
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.d;
        TXCDRApi.InitEvent(this.c, this.J, com.tencent.liteav.basic.datareport.a.ae, com.tencent.liteav.basic.datareport.a.at, tXCDRExtInfo);
        String c = com.tencent.liteav.basic.util.g.c();
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_device_type", c);
        int e = com.tencent.liteav.basic.util.g.e(this.c);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_network_type", e);
        String f = com.tencent.liteav.basic.util.g.f(this.c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "dev_uuid", f);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_app_version", this.r);
        String a = a();
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_app_name", a);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, com.tencent.liteav.basic.datareport.a.l, String.valueOf(Build.VERSION.SDK_INT));
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_stream_url", this.d);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "token", this.J);
        String userId = TXCCommonUtil.getUserId();
        if (userId == null || userId.isEmpty()) {
            userId = CommonConstant.Symbol.UNDERLINE + f;
        }
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_user_id", userId);
        String c2 = com.tencent.liteav.basic.util.g.c(this.c);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_package_name", c2);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ad, "u32_app_id", this.K);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_videotime", this.j);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_player_type", this.v);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_server_ip", this.H);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_drm_type", this.I);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "str_fileid", this.x);
        TXCDRApi.txSetEventValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_playmode", this.w);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_videoindex", this.k);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_realplaytime", this.m / 1000);
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u64_timestamp", System.currentTimeMillis());
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_speed", (int) (this.F * 100.0f));
        TXCDRApi.txSetEventIntValue(this.J, com.tencent.liteav.basic.datareport.a.ae, "u32_segment_duration", o.a(this.c).a(this.K));
        TXCDRApi.nativeReportEvent(this.J, com.tencent.liteav.basic.datareport.a.ae);
        TXCLog.i("TXCVodPlayCollection", "report evt 40302: token=" + this.J + " ,str_device_type=" + c + " ,u32_network_type=" + e + " ,dev_uuid=" + com.tencent.liteav.basic.util.g.f(this.c) + " ,str_app_version=" + this.r + " ,str_app_name=" + a + " ," + com.tencent.liteav.basic.datareport.a.l + "=" + Build.VERSION.SDK_INT + " ,str_stream_url=" + this.d + " ,str_user_id=" + userId + " ,str_package_name=" + c2 + " ,u32_videotime=" + this.j + " ,u32_player_type=" + this.v + " ,u32_server_ip=" + this.H + " ,u32_drm_type=" + this.I + " ,str_fileid=" + this.x + " ,u32_playmode=" + this.w + " ,u32_videoindex=" + this.k + " ,u32_realplaytime=" + (this.m / 1000) + " ,u32_speed=" + (this.F * 100.0f) + " ,u32_app_id=" + TXCCommonUtil.getAppID() + " ,u64_timestamp=" + System.currentTimeMillis());
    }

    public void a(boolean z) {
        this.h = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.f = currentTimeMillis;
        this.e = currentTimeMillis;
        this.l = 0;
        this.m = 0L;
        this.k = 0;
        this.g = 0L;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (z) {
            this.i = false;
        }
        TXCLog.i("TXCVodPlayCollection", "start " + this.f + ", mIsPaused = " + this.i);
    }

    public void b() {
        TXCLog.i("TXCVodPlayCollection", "stop " + this.m);
        if (this.i) {
            this.f = System.currentTimeMillis();
        }
        if (this.h) {
            n();
            this.l = (int) (this.l + (this.m / 1000));
            this.m = 0L;
            m();
            this.h = false;
        }
        this.s = false;
        this.t = false;
        this.i = false;
    }

    public void c() {
        TXCLog.i("TXCVodPlayCollection", "pause " + this.m);
        if (!this.i) {
            this.m += System.currentTimeMillis() - this.f;
        }
        this.i = true;
        this.f = System.currentTimeMillis();
    }

    public void d() {
        this.f = System.currentTimeMillis();
        TXCLog.i("TXCVodPlayCollection", "resume " + this.f);
        this.i = false;
    }

    public void e() {
        TXCLog.i("TXCVodPlayCollection", "setLoadEnd mFirstFrame=" + this.n + " , mIsLoading = " + this.t + ",mBeginLoadTS = " + this.g);
        if (this.n != 0 && this.t) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
            this.p += currentTimeMillis;
            this.o++;
            if (this.q < currentTimeMillis) {
                this.q = currentTimeMillis;
            }
            this.t = false;
        }
        if (this.s) {
            this.s = false;
        }
    }

    public void f() {
        TXCLog.i("TXCVodPlayCollection", "renderStart");
        if (this.n == 0) {
            this.n = (int) (System.currentTimeMillis() - this.e);
        }
    }

    public void g() {
        if (this.B == 0) {
            this.B = (int) (System.currentTimeMillis() - this.e);
            TXCLog.i("TXCVodPlayCollection", "mTcpConnectTS = " + this.B + ", mOriginBeginPlayTS = " + this.e + ", " + System.currentTimeMillis());
        }
    }

    public void h() {
        if (this.C == 0) {
            this.C = (int) (System.currentTimeMillis() - this.e);
        }
    }

    public void i() {
        if (this.D == 0) {
            this.D = (int) (System.currentTimeMillis() - this.e);
        }
    }

    public void j() {
        this.g = System.currentTimeMillis();
        this.t = true;
        TXCLog.i("TXCVodPlayCollection", "setLoadBegin mBeginLoadTS= " + this.g);
    }

    public void k() {
        this.s = true;
        this.u++;
        TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bz);
        TXCLog.d("TXCVodPlayCollection", "mSeekCnt= " + this.u);
    }

    public void a(int i) {
        this.v = i;
    }

    public void b(String str) {
        this.w = str;
    }

    public void c(String str) {
        this.I = str;
    }

    public void d(String str) {
        this.x = str;
    }

    public void b(boolean z) {
        if (z) {
            this.E = 1;
            TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bB);
        } else {
            this.E = 0;
        }
        TXCLog.i("TXCVodPlayCollection", "mIsMirror= " + this.E);
    }

    public void l() {
        this.G++;
        TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bC);
        TXCLog.d("TXCVodPlayCollection", "mSetBitrateIndexCnt= " + this.G);
    }

    public void a(float f) {
        this.F = f;
        TXCDRApi.txReportDAU(this.c, com.tencent.liteav.basic.datareport.a.bA);
        TXCLog.i("TXCVodPlayCollection", "mSpeed = " + this.F);
    }

    public void e(String str) {
        this.H = str;
        if (this.H == null) {
            this.H = "";
        }
    }

    public void b(int i) {
        this.A = i;
    }

    public void a(int i, String str) {
        TXCLog.i("TXCVodPlayCollection", "errorCode= " + i + " ，errorInfo= " + str);
        if (this.n == 0) {
            this.y = i;
            this.z = str;
            if (this.z == null) {
                this.z = "";
            }
        }
    }

    public void f(String str) {
        this.K = str;
    }
}
