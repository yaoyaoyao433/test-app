package com.tencent.smtt.utils;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsLogReport;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class q {
    private static q a;
    private boolean c = false;
    private Map<String, Long> b = new HashMap();

    private q() {
    }

    public static q a() {
        if (a == null) {
            synchronized (TbsLogReport.class) {
                if (a == null) {
                    a = new q();
                }
            }
        }
        return a;
    }

    private boolean a(long j) {
        return j <= 100000 && j > 0;
    }

    private long b(String str) {
        Long l = this.b.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    private String b() {
        long b = b("init_tbs_end") - b("init_tbs_Start");
        long b2 = b("preinit_finish") - b("preinit_start");
        long b3 = b("create_webview_end") - b("create_webview_start");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (!a(b)) {
            b = -1;
        }
        sb.append(b);
        sb.append(CommonConstant.Symbol.COMMA);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (!a(b2)) {
            b2 = -1;
        }
        sb3.append(b2);
        sb3.append(CommonConstant.Symbol.COMMA);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        if (!a(b3)) {
            b3 = -1;
        }
        sb5.append(b3);
        return sb5.toString();
    }

    private String c() {
        long b = b("init_tbs_end") - b("init_tbs_Start");
        long b2 = b("preinit_finish") - b("preinit_start");
        long b3 = b("create_webview_end") - b("create_webview_start");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("initX5Environment: ");
        if (!a(b)) {
            b = -1;
        }
        sb.append(b);
        sb.append(CommonConstant.Symbol.COMMA);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("preInit: ");
        if (!a(b2)) {
            b2 = -1;
        }
        sb3.append(b2);
        sb3.append(CommonConstant.Symbol.COMMA);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("webview: ");
        if (!a(b3)) {
            b3 = -1;
        }
        sb5.append(b3);
        return sb5.toString();
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        TbsLog.i("TbsTimeRecorder", c());
        this.c = true;
        if (r.o(context)) {
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            TbsLogReport.TbsLogInfo tbsLogInfo = tbsLogReport.tbsLogInfo();
            tbsLogInfo.setErrorCode(TbsListener.ErrorCode.TBS_LOAD_TIME_REPORT);
            tbsLogInfo.setFailDetail(b());
            tbsLogReport.eventReport(TbsLogReport.EventType.TYPE_LOAD, tbsLogInfo);
        }
    }

    public void a(String str) {
        this.b.put(str, Long.valueOf(System.currentTimeMillis()));
    }
}
