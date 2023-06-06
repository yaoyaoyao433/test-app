package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    private static HashMap<String, a> B = new HashMap<>();
    private static String a = "TXCDataReport";
    private String A;
    private String c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private long o;
    private long x;
    private long q = 0;
    private long r = 0;
    private boolean s = false;
    private long t = 0;
    private long u = 0;
    private long v = 0;
    private long w = 0;
    private long y = 0;
    private int z = 0;
    private String C = "";
    private String D = "";
    private HashMap b = new HashMap(100);
    private String i = TXCCommonUtil.getAppVersion();
    private int p = 5000;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        PENDING,
        CONFIRM,
        NEGATIVE
    }

    public e(Context context) {
        this.x = 0L;
        this.h = context.getApplicationContext();
        this.x = 0L;
    }

    public void a() {
        p();
        this.k = -1L;
        this.m = -1L;
        this.l = 0L;
        this.t = System.currentTimeMillis();
    }

    public void b() {
        if (this.n) {
            n();
            return;
        }
        String str = a;
        TXCLog.e(str, "push " + this.c + " failed!");
        l();
    }

    public void c() {
        if (this.n) {
            if (this.s) {
                e(com.tencent.liteav.basic.datareport.a.Y);
            } else if (d() != a.NEGATIVE) {
                e(com.tencent.liteav.basic.datareport.a.V);
            }
            if (this.s) {
                d(com.tencent.liteav.basic.datareport.a.Z);
            } else {
                d(com.tencent.liteav.basic.datareport.a.W);
            }
        } else {
            String str = a;
            TXCLog.e(str, "play " + this.c + " failed");
            if (this.s) {
                c(com.tencent.liteav.basic.datareport.a.X);
            } else {
                c(com.tencent.liteav.basic.datareport.a.U);
            }
        }
        if (this.s) {
            k();
        }
        TXCStatus.a(this.C, 7107, (Object) 0L);
        TXCStatus.a(this.C, 2033, (Object) 0L);
        TXCStatus.a(this.C, 6001, (Object) 0L);
        TXCStatus.a(this.C, (int) AddressBean.OTHER_ERROR_ADDRESS, (Object) 0L);
        TXCStatus.a(this.C, 7108, (Object) 0L);
    }

    public void a(boolean z) {
        this.s = z;
    }

    public void a(String str) {
        this.c = str;
        b(str);
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        this.A = str;
    }

    protected a d() {
        Uri parse;
        try {
            parse = Uri.parse(this.A);
        } catch (Exception e) {
            TXCLog.e(a, "check stream failed.", e);
        }
        if (parse == null) {
            return a.PENDING;
        }
        final String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            return a.PENDING;
        }
        String scheme = parse.getScheme();
        if (scheme == null) {
            return a.PENDING;
        }
        if (!scheme.equals("rtmp") && !scheme.equals("http") && !scheme.equals("https")) {
            return a.PENDING;
        }
        if (c(host)) {
            return a.CONFIRM;
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && (queryParameterNames.contains("bizid") || queryParameterNames.contains("txTime") || queryParameterNames.contains("txSecret"))) {
            return a.CONFIRM;
        }
        if (B.containsKey(host)) {
            return B.get(host);
        }
        B.put(host, a.PENDING);
        new Thread(new Runnable() { // from class: com.tencent.liteav.e.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.liteav.network.a.e[] a2 = com.tencent.liteav.network.a.a.a.c().a(new com.tencent.liteav.network.a.b(host, true), null);
                    int length = a2.length;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        com.tencent.liteav.network.a.e eVar = a2[i];
                        if (eVar.a() && e.c(eVar.a)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    e.B.put(host, z ? a.CONFIRM : a.NEGATIVE);
                    String str = e.a;
                    TXCLog.d(str, host + " isTencent " + z);
                } catch (Exception e2) {
                    TXCLog.e(e.a, "check dns failed.", e2);
                }
            }
        }).start();
        return a.PENDING;
    }

    protected static boolean c(String str) {
        if (str == null || !str.contains("myqcloud")) {
            return com.tencent.liteav.basic.d.c.a().a(str);
        }
        return true;
    }

    public void d(String str) {
        this.C = str;
    }

    public void e(String str) {
        this.D = str;
    }

    public void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(int i) {
        this.g = i;
    }

    public void e() {
        if (!this.n && !TextUtils.isEmpty(TXCStatus.b(this.C, 7012))) {
            m();
            this.n = true;
        }
        if (this.o <= 0) {
            this.o = TXCTimeUtil.getTimeTick();
        }
        if (!this.n || TXCTimeUtil.getTimeTick() - this.o <= MetricsAnrManager.ANR_THRESHOLD) {
            return;
        }
        o();
        this.o = TXCTimeUtil.getTimeTick();
    }

    private void i() {
        a(6002, 6017, 6018);
        TXCStatus.a(this.C, (int) ConnectionResult.RESOLUTION_REQUIRED, Integer.valueOf(com.tencent.liteav.basic.util.g.a()[0]));
        a(ConnectionResult.RESOLUTION_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.RESTRICTED_PROFILE);
        TXCStatus.a(this.C, (int) ConnectionResult.SERVICE_UPDATING, Integer.valueOf(com.tencent.liteav.basic.util.g.b()));
        a(ConnectionResult.SERVICE_UPDATING, ConnectionResult.SIGN_IN_FAILED, 9006);
    }

    public void a(int i, int i2, int i3) {
        if (i == 6002) {
            double d = TXCStatus.d(this.C, i);
            if (d < 0.001d) {
                return;
            }
            double d2 = TXCStatus.d(this.C, i2);
            int c = TXCStatus.c(this.C, i3) + 1;
            TXCStatus.a(this.C, i2, Double.valueOf(d2 + ((d - d2) / c)));
            TXCStatus.a(this.C, i3, Integer.valueOf(c));
            return;
        }
        double c2 = TXCStatus.c(this.C, i);
        if (c2 < 0.001d) {
            return;
        }
        double d3 = TXCStatus.d(this.C, i2);
        int c3 = TXCStatus.c(this.C, i3) + 1;
        TXCStatus.a(this.C, i2, Double.valueOf(d3 + ((c2 - d3) / c3)));
        TXCStatus.a(this.C, i3, Integer.valueOf(c3));
    }

    public void f() {
        i();
        if (!this.n) {
            long a2 = TXCStatus.a(this.C, 6001);
            long a3 = TXCStatus.a(this.C, AddressBean.OTHER_ERROR_ADDRESS);
            long a4 = TXCStatus.a(this.C, 2033);
            long a5 = TXCStatus.a(this.C, 7108);
            if (a2 > 0 && a3 > 0 && a5 > 0 && a4 > 0) {
                c(this.s ? com.tencent.liteav.basic.datareport.a.X : com.tencent.liteav.basic.datareport.a.U);
                this.p = 5000;
                this.n = true;
            }
            String b = TXCStatus.b(this.C, 7119);
            if (b != null) {
                b(b);
            }
        }
        if (this.z >= 3 && !this.n) {
            c(this.s ? com.tencent.liteav.basic.datareport.a.X : com.tencent.liteav.basic.datareport.a.U);
            this.p = 5000;
            this.n = true;
        }
        this.z++;
        if (this.o <= 0) {
            this.o = TXCTimeUtil.getTimeTick();
        }
        if (TXCTimeUtil.getTimeTick() > this.o + this.p) {
            if (this.s) {
                e(com.tencent.liteav.basic.datareport.a.Y);
                this.p = 5000;
            } else if (d() == a.NEGATIVE) {
                return;
            } else {
                e(com.tencent.liteav.basic.datareport.a.V);
                this.p = TXCDRApi.getStatusReportInterval();
                if (this.p < 5000) {
                    this.p = 5000;
                }
                if (this.p > 300000) {
                    this.p = 300000;
                }
            }
            this.k = TXCStatus.a(this.C, 6004);
            this.m = TXCStatus.c(this.C, 2002);
            this.o = TXCTimeUtil.getTimeTick();
        }
    }

    private void c(int i) {
        long j;
        long j2;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, i, com.tencent.liteav.basic.datareport.a.an, tXCDRExtInfo);
        a(i, str);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", ((Long) this.b.get("u64_timestamp")).longValue());
        long a2 = TXCStatus.a(this.C, 7107);
        long a3 = TXCStatus.a(this.C, 7108);
        if (a3 != -1) {
            a3 -= a2;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_dns_time", a3 < 0 ? -1L : a3);
        long a4 = TXCStatus.a(this.C, 7109);
        if (a4 != -1) {
            a4 -= a2;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_connect_server_time", a4 < 0 ? -1L : a4);
        int c = TXCStatus.c(this.C, 5004);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_decode_type", c);
        this.j = TXCStatus.a(this.C, 6001) - a2;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_i_frame", this.j < 0 ? -1L : this.j);
        long a5 = TXCStatus.a(this.C, AddressBean.INVALID_CABINET_ADDRESS) - a2;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_frame_down", a5 < 0 ? -1L : a5);
        long a6 = TXCStatus.a(this.C, 5005) - a2;
        if (a6 < 0) {
            j = a6;
            a6 = -1;
        } else {
            j = a6;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_video_decode_time", a6);
        long a7 = TXCStatus.a(this.C, AddressBean.OTHER_ERROR_ADDRESS) - a2;
        if (a7 < 0) {
            j2 = a7;
            a7 = -1;
        } else {
            j2 = a7;
        }
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_audio_frame_down", a7);
        long a8 = TXCStatus.a(this.C, 2033) - a2;
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_audio_render_time", a8 < 0 ? -1L : a8);
        int c2 = TXCStatus.c(this.C, 7105);
        TXCDRApi.txSetEventIntValue(str, i, "u64_err_code", c2);
        int c3 = TXCStatus.c(this.C, 7106);
        TXCDRApi.txSetEventIntValue(str, i, "str_err_info", c3);
        int c4 = TXCStatus.c(this.C, 7112);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(c4));
        int c5 = TXCStatus.c(this.C, 7111);
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(c5));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.i);
        TXCDRApi.nativeReportEvent(str, i);
        String str2 = a;
        TXCLog.d(str2, "report evt " + i + ": token=" + str + "\nstr_user_id=" + this.b.get("str_user_id") + "\ndev_uuid=" + this.b.get("dev_uuid") + "\nstr_session_id=" + this.b.get("str_session_id") + "\nstr_device_type=" + this.b.get("str_device_type") + "\nstr_os_info=" + this.b.get("str_os_info") + "\nstr_package_name=" + this.b.get("str_package_name") + "\nu32_network_type=" + this.b.get("u32_network_type") + "\nu32_server_ip=" + this.b.get("u32_server_ip") + "\nstr_stream_url=" + this.b.get("str_stream_url") + "\nu64_timestamp=" + this.b.get("u64_timestamp") + "\nu32_dns_time=" + a3 + "\nu32_connect_server_time=" + a4 + "\nu32_video_decode_type=" + c + "\nu32_first_frame_down=" + a5 + "\nu32_first_video_decode_time=" + j + "\nu32_first_i_frame=" + this.j + "\nu32_first_audio_frame_down=" + j2 + "\nu32_first_audio_render_time=" + a8 + "\nu64_err_code=" + c2 + "\nstr_err_info=" + c3 + "\nu32_link_type=" + c4 + "\nu32_channel_type=" + c5 + "\nstr_app_version=" + this.i);
    }

    private void f(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("room://")) {
            return;
        }
        String[] split = str.split("/");
        split[split.length - 1].split(CommonConstant.Symbol.UNDERLINE);
        TXCStatus.a(this.C, 7112, (Object) 3L);
    }

    private int j() {
        int i;
        long timeTick = TXCTimeUtil.getTimeTick();
        long c = TXCStatus.c(this.C, 6019);
        if (this.q != 0) {
            i = (int) (((c - this.r) * 1000) / (timeTick - this.q));
        } else {
            i = (int) ((1000 * c) / (timeTick - this.y));
        }
        this.q = timeTick;
        this.r = c;
        return i;
    }

    private void d(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, i, com.tencent.liteav.basic.datareport.a.an, tXCDRExtInfo);
        a(i, str);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, i, "u64_end_timestamp", utcTimeTick);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", utcTimeTick);
        double d = TXCStatus.d(this.C, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_cpu_usage", String.valueOf(d));
        double d2 = TXCStatus.d(this.C, ConnectionResult.SIGN_IN_FAILED);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_memory", String.valueOf(d2));
        String valueOf = String.valueOf(this.x);
        TXCDRApi.txSetEventValue(str, i, "u64_begin_timestamp", valueOf);
        long timeTick = (TXCTimeUtil.getTimeTick() - TXCStatus.a(this.C, 7107)) / 1000;
        int i2 = (timeTick > 0L ? 1 : (timeTick == 0L ? 0 : -1));
        TXCDRApi.txSetEventIntValue(str, i, "u64_playtime", i2 < 0 ? -1L : timeTick);
        TXCDRApi.txSetEventIntValue(str, i, "u32_result", i2 < 0 ? -1L : timeTick);
        int c = TXCStatus.c(this.C, 7105);
        TXCDRApi.txSetEventIntValue(str, i, "u64_err_code", c);
        int c2 = TXCStatus.c(this.C, 2004);
        TXCDRApi.txSetEventIntValue(str, i, "u32_speed_cnt", c2);
        int c3 = TXCStatus.c(this.C, 2008);
        long j = c3;
        TXCDRApi.txSetEventIntValue(str, i, "u64_audio_cache_avg", j);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_cache_time", j);
        long c4 = TXCStatus.c(this.C, 2003);
        TXCDRApi.txSetEventValue(str, i, "u32_max_load", String.valueOf(c4));
        long c5 = TXCStatus.c(this.C, 2001);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_load", String.valueOf(c5));
        long c6 = TXCStatus.c(this.C, 2002);
        TXCDRApi.txSetEventValue(str, i, "u32_load_cnt", String.valueOf(c6));
        int c7 = TXCStatus.c(this.C, 2005);
        TXCDRApi.txSetEventIntValue(str, i, "u32_nodata_cnt", c7);
        long j2 = c5 * c6;
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_time", j2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_first_i_frame", this.j);
        int c8 = TXCStatus.c(this.C, 17021);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_width", c8);
        int c9 = TXCStatus.c(this.C, 17022);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_height", c9);
        double d3 = TXCStatus.d(this.C, 6017);
        TXCDRApi.txSetEventValue(str, i, "u32_video_avg_fps", String.valueOf(d3));
        long a2 = TXCStatus.a(this.C, 6003);
        long a3 = TXCStatus.a(this.C, 6005);
        long a4 = TXCStatus.a(this.C, 6006);
        long j3 = a2 > 0 ? a4 / a2 : 0L;
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_duration_avg", j3);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_block_time", j3);
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_count", a2);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_time", a4);
        TXCDRApi.txSetEventIntValue(str, i, "u64_block_duration_max", a3);
        long a5 = TXCStatus.a(this.C, MapConstant.LayerPropertyFlag_HeatmapCenterLatitude);
        TXCDRApi.txSetEventIntValue(str, i, "u64_jitter_cache_max", a5);
        long a6 = TXCStatus.a(this.C, MapConstant.LayerPropertyFlag_HeatmapGap);
        TXCDRApi.txSetEventIntValue(str, i, "u64_jitter_cache_avg", a6);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(TXCStatus.c(this.C, 7112)));
        int c10 = TXCStatus.c(this.C, 7111);
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(c10));
        int c11 = TXCStatus.c(this.C, 7113);
        TXCDRApi.txSetEventValue(str, i, "u32_ip_count_quic", String.valueOf(c11));
        int c12 = TXCStatus.c(this.C, 7114);
        TXCDRApi.txSetEventValue(str, i, "u32_connect_count_quic", String.valueOf(c12));
        int c13 = TXCStatus.c(this.C, 7115);
        TXCDRApi.txSetEventValue(str, i, "u32_connect_count_tcp", String.valueOf(c13));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.i);
        TXCDRApi.txSetEventIntValue(str, i, "u32_is_real_time", TXCStatus.a(this.C, 2009));
        TXCDRApi.nativeReportEvent(str, i);
        TXCLog.d(a, "report evt " + i + ": token=" + str + "\nstr_user_id=" + this.b.get("str_user_id") + "\ndev_uuid=" + this.b.get("dev_uuid") + "\nstr_session_id=" + this.b.get("str_session_id") + "\nstr_device_type=" + this.b.get("str_device_type") + "\nstr_os_info=" + this.b.get("str_os_info") + "\nstr_package_name=" + this.b.get("str_package_name") + "\nu32_network_type=" + this.b.get("u32_network_type") + "\nu32_server_ip=" + this.b.get("u32_server_ip") + "\nstr_stream_url=" + this.b.get("str_stream_url") + "\nu64_timestamp=" + this.b.get("u64_timestamp") + "\nu32_avg_cpu_usage=" + d + "\nu32_avg_memory=" + d2 + "\nu32_first_i_frame=" + this.j + "\nu32_video_width=" + c8 + "\nu32_video_height=" + c9 + "\nu32_video_avg_fps=" + d3 + "\nu32_speed_cnt=" + c2 + "\nu32_nodata_cnt=" + c7 + "\nu32_avg_cache_time=" + c3 + "\nu32_avg_block_time=" + j3 + "\nu32_avg_load=" + c5 + "\nu32_max_load=" + c4 + "\nu32_video_block_time=" + a4 + "\nu32_audio_block_time=" + j2 + "\nu32_load_cnt=" + c6 + "\nu32_result=" + timeTick + "\nu64_err_code=" + c + "\nu32_channel_type=" + c10 + "\nu32_ip_count_quic=" + c11 + "\nu32_connect_count_quic=" + c12 + "\nu32_connect_count_tcp=" + c13 + "\nu64_block_count=" + a2 + "\nu64_jitter_cache_max=" + a5 + "\nu64_jitter_cache_avg=" + a6 + "\nu64_begin_timestamp=" + valueOf + "\nu32_is_real_time=" + TXCStatus.a(this.C, 2009) + "\nstr_app_version=" + this.i);
    }

    private void a(int i, String str) {
        String b = TXCStatus.b(this.C, 7121);
        if (TextUtils.isEmpty(b)) {
            b = str;
        }
        this.b.put("str_session_id", b);
        this.b.put("u32_server_ip", TXCStatus.b(this.C, 7110));
        if (this.s) {
            this.b.put("str_stream_url", TXCStatus.b(this.C, 7116));
            f((String) this.b.get("str_stream_url"));
        } else {
            this.b.put("str_stream_url", this.c);
        }
        TXCDRApi.txSetEventValue(str, i, "str_user_id", (String) this.b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, i, "dev_uuid", (String) this.b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, i, "str_session_id", (String) this.b.get("str_session_id"));
        TXCDRApi.txSetEventValue(str, i, "str_device_type", (String) this.b.get("str_device_type"));
        TXCDRApi.txSetEventValue(str, i, "str_os_info", (String) this.b.get("str_os_info"));
        TXCDRApi.txSetEventValue(str, i, "str_package_name", (String) this.b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, i, "u32_network_type", g("u32_network_type"));
        TXCDRApi.txSetEventValue(str, i, "u32_server_ip", (String) this.b.get("u32_server_ip"));
        TXCDRApi.txSetEventValue(str, i, "str_stream_url", (String) this.b.get("str_stream_url"));
    }

    private void e(int i) {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.url = this.c;
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = true;
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, i, com.tencent.liteav.basic.datareport.a.an, tXCDRExtInfo);
        a(i, str);
        TXCDRApi.txSetEventIntValue(str, i, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
        int[] a2 = com.tencent.liteav.basic.util.g.a();
        TXCDRApi.txSetEventIntValue(str, i, "u32_cpu_usage", a2[1]);
        TXCDRApi.txSetEventIntValue(str, i, "u32_app_cpu_usage", a2[0]);
        TXCDRApi.txSetEventValue(str, i, "u32_avg_cpu_usage", String.valueOf(TXCStatus.d(this.C, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)));
        TXCDRApi.txSetEventValue(str, i, "u32_avg_memory", String.valueOf(TXCStatus.d(this.C, ConnectionResult.SIGN_IN_FAILED)));
        TXCDRApi.txSetEventIntValue(str, i, "u32_recv_av_diff_time", TXCStatus.a(this.C, 6014, 2));
        TXCDRApi.txSetEventIntValue(str, i, "u32_play_av_diff_time", TXCStatus.a(this.C, 6013, 2));
        TXCDRApi.txSetEventValue(str, i, "u64_playtime", String.valueOf((TXCTimeUtil.getUtcTimeTick() - this.x) / 1000));
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_decode_type", TXCStatus.c(this.C, 2015) != 0 ? 1 : 2);
        long a3 = TXCStatus.a(this.C, 2002);
        if (this.m == -1) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", 0L);
        } else if (a3 >= this.m) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", a3 - this.m);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_audio_block_count", -1L);
        }
        this.m = a3;
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_cache_time", TXCStatus.c(this.C, 2010));
        TXCDRApi.txSetEventIntValue(str, i, "u32_audio_drop", TXCStatus.c(this.C, 2014));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_decode_type", TXCStatus.c(this.C, 5004));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_recv_fps", j());
        TXCDRApi.txSetEventIntValue(str, i, "u32_fps", (int) TXCStatus.d(this.C, 6002));
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_cache_time", TXCStatus.c(this.C, MapConstant.LayerPropertyFlag_HeatmapSize));
        long a4 = TXCStatus.a(this.C, MapConstant.LayerPropertyFlag_HeatmapGap);
        TXCDRApi.txSetEventIntValue(str, i, "u32_video_cache_count", a4);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_cache_count", a4);
        long a5 = TXCStatus.a(this.C, 6004);
        if (this.k != -1 && a5 >= this.k) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_count", a5 - this.k);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_block_count", 0L);
        }
        this.k = a5;
        long c = TXCStatus.c(this.C, AddressBean.ABNORMAL_HOUSE_ADDRESS) + TXCStatus.c(this.C, AddressBean.POI_ERROR_ADDRESS);
        TXCDRApi.txSetEventIntValue(str, i, "u32_net_speed", c);
        TXCDRApi.txSetEventIntValue(str, i, "u32_avg_net_speed", c);
        TXCDRApi.txSetEventValue(str, i, "u32_link_type", String.valueOf(TXCStatus.c(this.C, 7112)));
        TXCDRApi.txSetEventValue(str, i, "u32_channel_type", String.valueOf(TXCStatus.c(this.C, 7111)));
        TXCDRApi.txSetEventValue(str, i, "str_app_version", this.i);
        long a6 = TXCStatus.a(this.C, 6021);
        if (a6 > this.l) {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_light_block_count", a6 - this.l);
        } else {
            TXCDRApi.txSetEventIntValue(str, i, "u32_video_light_block_count", 0L);
        }
        this.l = a6;
        TXCDRApi.nativeReportEvent(str, i);
        if (this.s) {
            this.w++;
            this.v += a4;
            if (a4 > this.u) {
                this.u = a4;
            }
        }
    }

    private void k() {
        HashMap hashMap = new HashMap();
        String b = TXCStatus.b(this.C, 7116);
        String b2 = TXCStatus.b(this.C, 7117);
        String b3 = TXCStatus.b(this.C, 7118);
        int c = TXCStatus.c(this.C, 7105);
        String b4 = TXCStatus.b(this.C, 7106);
        int c2 = TXCStatus.c(this.C, 7111);
        hashMap.put("stream_url", b);
        hashMap.put("stream_id", b2);
        hashMap.put("bizid", b3);
        hashMap.put("err_code", String.valueOf(c));
        hashMap.put("err_info", b4);
        hashMap.put("channel_type", String.valueOf(c2));
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.t;
        hashMap.put(Constants.GestureData.KEY_START_TIME, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.t)));
        hashMap.put(Constants.GestureData.KEY_END_TIME, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(currentTimeMillis)));
        hashMap.put("total_time", String.valueOf(j));
        long a2 = TXCStatus.a(this.C, 6003);
        long a3 = TXCStatus.a(this.C, 6006);
        long a4 = TXCStatus.a(this.C, 6005);
        long j2 = a2 != 0 ? a3 / a2 : 0L;
        hashMap.put("block_count", String.valueOf(a2));
        hashMap.put("block_duration_max", String.valueOf(a4));
        hashMap.put("block_duration_avg", String.valueOf(j2));
        long j3 = this.w != 0 ? this.v / this.w : 0L;
        hashMap.put("jitter_cache_max", String.valueOf(this.u));
        hashMap.put("jitter_cache_avg", String.valueOf(j3));
        String txCreateToken = TXCDRApi.txCreateToken();
        int i = com.tencent.liteav.basic.datareport.a.ag;
        int i2 = com.tencent.liteav.basic.datareport.a.am;
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.h, txCreateToken, i, i2, tXCDRExtInfo);
        String str = a;
        TXCLog.d(str, "report evt 40402: token=" + txCreateToken);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = a;
            TXCLog.e(str4, "RealTimePlayStatisticInfo: " + str2 + " = " + str3);
            if (str2 != null && str2.length() > 0 && str3 != null) {
                TXCDRApi.txSetEventValue(txCreateToken, i, str2, str3);
            }
        }
        TXCDRApi.nativeReportEvent(txCreateToken, i);
        this.s = false;
        this.t = 0L;
        this.w = 0L;
        this.v = 0L;
        this.u = 0L;
    }

    private void l() {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.c;
        long a2 = TXCStatus.a(this.C, 7013);
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, com.tencent.liteav.basic.datareport.a.P, com.tencent.liteav.basic.datareport.a.am, tXCDRExtInfo);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_device_type", (String) this.b.get("str_device_type"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_network_type", g("u32_network_type"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_dns_time", -1L);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_connect_server_time", -1L);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_server_ip", "");
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_video_resolution", (this.d << 16) | this.e);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_audio_samplerate", this.g);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_video_bitrate", this.f);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_user_id", (String) this.b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_package_name", (String) this.b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_channel_type", a2);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_app_version", this.i);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "dev_uuid", (String) this.b.get("dev_uuid"));
        TXCDRApi.nativeReportEvent(str, com.tencent.liteav.basic.datareport.a.P);
        String str2 = a;
        TXCLog.d(str2, "report evt 40001: token=" + str + " str_stream_url=" + this.c + " u64_timestamp=" + utcTimeTick + " str_device_type=" + this.b.get("str_device_type") + " u32_network_type=" + g("u32_network_type") + " u32_dns_time=-1 u32_connect_server_time=-1 u32_server_ip= u32_video_resolution=" + ((this.d << 16) | this.e) + " u32_audio_samplerate=" + this.g + " u32_video_bitrate=" + this.f + " str_user_id=" + this.b.get("str_user_id") + " str_package_name=" + this.b.get("str_package_name") + " u32_channel_type=" + a2 + " str_app_version=" + this.b.get("dev_uuid") + " dev_uuid=" + g("u32_max_load"));
    }

    private void m() {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.c;
        String b = TXCStatus.b(this.C, 7012);
        long a2 = TXCStatus.a(this.C, 7009);
        long a3 = TXCStatus.a(this.C, 7010);
        if (a3 != -1) {
            a3 -= a2;
        }
        long a4 = TXCStatus.a(this.C, 7011);
        if (a4 != -1) {
            a4 -= a2;
        }
        long a5 = TXCStatus.a(this.C, 7013);
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, com.tencent.liteav.basic.datareport.a.P, com.tencent.liteav.basic.datareport.a.am, tXCDRExtInfo);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u64_timestamp", utcTimeTick);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_device_type", (String) this.b.get("str_device_type"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_network_type", g("u32_network_type"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_dns_time", a3);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_connect_server_time", a4);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_server_ip", b);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_video_resolution", (this.d << 16) | this.e);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_audio_samplerate", this.g);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_video_bitrate", this.f);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_user_id", (String) this.b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_package_name", (String) this.b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.P, "u32_channel_type", a5);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_app_version", this.i);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "dev_uuid", (String) this.b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.P, "str_nearest_ip_list", TXCStatus.b(this.C, 7019));
        TXCDRApi.nativeReportEvent(str, com.tencent.liteav.basic.datareport.a.P);
        String str2 = a;
        TXCLog.d(str2, "report evt 40001: token=" + str + " str_stream_url=" + this.c + " u64_timestamp=" + utcTimeTick + " str_device_type=" + this.b.get("str_device_type") + " u32_network_type=" + g("u32_network_type") + " u32_dns_time=" + a3 + " u32_connect_server_time=" + a4 + " u32_server_ip=" + b + " u32_video_resolution=" + ((this.d << 16) | this.e) + " u32_audio_samplerate=" + this.g + " u32_video_bitrate=" + this.f + " str_user_id=" + this.b.get("str_user_id") + " str_package_name=" + this.b.get("str_package_name") + " u32_channel_type=" + a5 + " str_app_version=" + this.b.get("dev_uuid") + " dev_uuid=" + g("u32_max_load"));
    }

    private void n() {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.c;
        long a2 = TXCStatus.a(this.C, 7009);
        long a3 = TXCStatus.a(this.C, 7013);
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, com.tencent.liteav.basic.datareport.a.R, com.tencent.liteav.basic.datareport.a.am, tXCDRExtInfo);
        long utcTimeTick = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.R, "u64_timestamp", utcTimeTick);
        long timeTick = (TXCTimeUtil.getTimeTick() - a2) / 1000;
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.R, "u32_result", timeTick);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "str_user_id", (String) this.b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "str_package_name", (String) this.b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.R, "u32_channel_type", a3);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "str_app_version", this.i);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "dev_uuid", (String) this.b.get("dev_uuid"));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "u32_ip_count_quic", String.valueOf(TXCStatus.c(this.C, 7016)));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "u32_connect_count_quic", String.valueOf(TXCStatus.c(this.C, 7017)));
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.R, "u32_connect_count_tcp", String.valueOf(TXCStatus.c(this.C, 7018)));
        TXCDRApi.nativeReportEvent(str, com.tencent.liteav.basic.datareport.a.R);
        String str2 = a;
        TXCLog.d(str2, "report evt 40002: token=" + str + " str_stream_url=" + this.c + " u64_timestamp=" + utcTimeTick + " u32_result=" + timeTick + " str_user_id=" + this.b.get("str_user_id") + " str_package_name=" + this.b.get("str_package_name") + " u32_channel_type=" + a3 + " str_app_version=" + this.i + " dev_uuid=" + this.b.get("dev_uuid"));
    }

    private void o() {
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = true;
        tXCDRExtInfo.url = this.c;
        int[] a2 = com.tencent.liteav.basic.util.g.a();
        int i = a2[0];
        int i2 = a2[1];
        int b = com.tencent.liteav.basic.util.g.b();
        long a3 = TXCStatus.a(this.C, 7013);
        int c = TXCStatus.c(this.C, 7004);
        int c2 = TXCStatus.c(this.C, 7003);
        double d = TXCStatus.d(this.C, MapConstant.LayerPropertyFlag_MarkerSpacing);
        int c3 = TXCStatus.c(this.C, 7005);
        int c4 = TXCStatus.c(this.C, 7002);
        int c5 = TXCStatus.c(this.C, 7001);
        int c6 = TXCStatus.c(this.C, MapConstant.LayerPropertyFlag_TextPitchAlignment);
        String b2 = TXCStatus.b(this.C, 7012);
        String b3 = TXCStatus.b(this.C, 7014);
        String b4 = TXCStatus.b(this.C, 7015);
        String b5 = TXCStatus.b(this.C, 3001);
        long a4 = TXCStatus.a(this.C, 3002);
        double d2 = TXCStatus.d(this.C, 3003);
        int c7 = TXCStatus.c(this.C, 7020);
        String str = (String) this.b.get("token");
        TXCDRApi.InitEvent(this.h, str, com.tencent.liteav.basic.datareport.a.Q, com.tencent.liteav.basic.datareport.a.am, tXCDRExtInfo);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_avg_audio_bitrate", c4);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_avg_video_bitrate", c5);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_avg_net_speed", c2 + c);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_fps", (int) d);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_avg_cache_size", c3);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_cpu_usage", i2);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_app_cpu_usage", i);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_avg_memory", b);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_channel_type", a3);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.Q, "str_app_version", this.i);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.Q, "str_device_type", (String) this.b.get("str_device_type"));
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_hw_enc", c6);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.Q, "str_server_ip", b2);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.Q, "str_quic_connection_id", b3);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.Q, "str_quic_connection_stats", b4);
        TXCDRApi.txSetEventValue(str, com.tencent.liteav.basic.datareport.a.Q, "str_beauty_stats", b5);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_send_strategy", c7);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_preprocess_timecost", a4);
        TXCDRApi.txSetEventIntValue(str, com.tencent.liteav.basic.datareport.a.Q, "u32_preprocess_fps_out", (int) d2);
        TXCDRApi.nativeReportEvent(str, com.tencent.liteav.basic.datareport.a.Q);
    }

    private int g(String str) {
        Number number = (Number) this.b.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    private void p() {
        this.n = false;
        this.o = 0L;
        this.z = 0;
        String str = this.D;
        if (TextUtils.isEmpty(str)) {
            str = TXCCommonUtil.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = com.tencent.liteav.basic.util.g.b(this.h);
        }
        this.b.put("str_user_id", str);
        this.b.put("str_device_type", com.tencent.liteav.basic.util.g.c());
        this.b.put("str_device_type", com.tencent.liteav.basic.util.g.c());
        this.b.put("u32_network_type", Integer.valueOf(com.tencent.liteav.basic.util.g.e(this.h)));
        this.b.put("token", com.tencent.liteav.basic.util.g.e());
        this.b.put("str_package_name", com.tencent.liteav.basic.util.g.c(this.h));
        this.b.put("dev_uuid", com.tencent.liteav.basic.util.g.f(this.h));
        this.b.put("str_os_info", com.tencent.liteav.basic.util.g.d());
        this.x = TXCTimeUtil.getUtcTimeTick();
        this.b.put("u64_timestamp", Long.valueOf(this.x));
        this.y = TXCTimeUtil.getTimeTick();
    }
}
