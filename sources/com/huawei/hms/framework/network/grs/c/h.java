package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    public static void a(ArrayList<f> arrayList, long j, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new g(j, context, arrayList, jSONArray));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(f fVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d = fVar.d();
        if (d != null) {
            linkedHashMapPack.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, ExceptionCode.getErrorCodeFromException(d));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, d.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(d.getMessage()));
        } else {
            linkedHashMapPack.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, fVar.b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, fVar.c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(fVar.k()).getHost());
        } catch (MalformedURLException e) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e);
        }
        linkedHashMapPack.put("req_start_time", fVar.g());
        linkedHashMapPack.put("req_end_time", fVar.f());
        linkedHashMapPack.put("req_total_time", fVar.h());
        return linkedHashMapPack.getAll();
    }
}
