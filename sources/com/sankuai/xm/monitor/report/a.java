package com.sankuai.xm.monitor.report;

import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.monitor.report.db.ReportBean;
import java.security.SecureRandom;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    private SecureRandom b;

    public final ReportBean a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "597bc0df1fd1bb8168ff2e5914b6e161", 6917529027641081856L)) {
            return (ReportBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "597bc0df1fd1bb8168ff2e5914b6e161");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null && map.containsKey("ts_preset")) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.remove("ts_preset"));
            Long b = ac.b(sb.toString());
            if (b != null && b.longValue() > 0) {
                currentTimeMillis = b.longValue();
            }
        }
        String str2 = currentTimeMillis + CommonConstant.Symbol.UNDERLINE + a().nextInt(BlankConfig.MAX_SAMPLE);
        JSONObject a2 = a(str2, str, map, currentTimeMillis);
        if (a2 != null) {
            ReportBean reportBean = new ReportBean();
            reportBean.name = str;
            reportBean.value = a2.toString();
            reportBean.time = currentTimeMillis;
            reportBean.type = ReportBean.TYPE_ELE;
            reportBean.value1 = str2;
            return reportBean;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0130 A[Catch: Exception -> 0x01ad, TryCatch #0 {Exception -> 0x01ad, blocks: (B:7:0x003a, B:9:0x0043, B:13:0x0051, B:15:0x0059, B:18:0x0065, B:20:0x006d, B:22:0x0077, B:31:0x00e1, B:33:0x00ec, B:35:0x00f2, B:37:0x00fd, B:38:0x0103, B:40:0x010b, B:43:0x0114, B:45:0x011c, B:47:0x0130, B:48:0x0138, B:50:0x013e, B:54:0x0163, B:57:0x016a, B:60:0x017a, B:61:0x017f, B:63:0x01a7, B:23:0x007e, B:29:0x00b6, B:28:0x008c, B:30:0x00cc, B:25:0x0082), top: B:68:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7 A[Catch: Exception -> 0x01ad, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ad, blocks: (B:7:0x003a, B:9:0x0043, B:13:0x0051, B:15:0x0059, B:18:0x0065, B:20:0x006d, B:22:0x0077, B:31:0x00e1, B:33:0x00ec, B:35:0x00f2, B:37:0x00fd, B:38:0x0103, B:40:0x010b, B:43:0x0114, B:45:0x011c, B:47:0x0130, B:48:0x0138, B:50:0x013e, B:54:0x0163, B:57:0x016a, B:60:0x017a, B:61:0x017f, B:63:0x01a7, B:23:0x007e, B:29:0x00b6, B:28:0x008c, B:30:0x00cc, B:25:0x0082), top: B:68:0x003a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject a(java.lang.String r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.Object> r20, long r21) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.monitor.report.a.a(java.lang.String, java.lang.String, java.util.Map, long):org.json.JSONObject");
    }

    private SecureRandom a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a091c001c6ff051933d085ecdb214f94", 6917529027641081856L)) {
            return (SecureRandom) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a091c001c6ff051933d085ecdb214f94");
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new SecureRandom(Long.toString(System.currentTimeMillis()).getBytes());
                }
            }
        }
        return this.b;
    }
}
