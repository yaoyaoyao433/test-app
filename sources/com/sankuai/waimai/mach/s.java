package com.sankuai.waimai.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class s implements e {
    public static ChangeQuickRedirect a = null;
    private static String b = "MachLogan";
    private static String c = "waimai";

    @Override // com.sankuai.waimai.mach.e
    public final void a(int i, @NonNull String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ad852eb93aec15d120c1ac8aa3dc87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ad852eb93aec15d120c1ac8aa3dc87");
            return;
        }
        StringBuilder sb = new StringBuilder("onCatReport::code=");
        sb.append(i);
        sb.append(",cmd=");
        sb.append(str);
        sb.append(",duration=");
        sb.append(i2);
        a a2 = a.a();
        Object[] objArr2 = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f05d3377211fdeb3ed4a16258164d7fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f05d3377211fdeb3ed4a16258164d7fe");
        } else {
            a2.pv3(com.meituan.android.time.c.b(), str, 0, 0, i, 0, 0, i2, null);
        }
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc3af6875704cc31474b8994ddbac07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc3af6875704cc31474b8994ddbac07");
            return;
        }
        int f = com.sankuai.waimai.mach.common.i.a().f();
        Context context = com.meituan.android.singleton.b.a;
        com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(f, context, GetUUID.getInstance().getSyncUUID(context, null));
        if (map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7641ce9f5bc259887be2f129217edd8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7641ce9f5bc259887be2f129217edd8c");
            return;
        }
        StringBuilder sb = new StringBuilder("onSnifferNormal::module=");
        sb.append(str);
        sb.append(",type=");
        sb.append(str2);
        sb.append(",description=");
        sb.append(str3);
        sb.append(",extra=");
        sb.append(com.sankuai.waimai.mach.utils.b.a().toJson(map));
        int a2 = m.a();
        if (a2 == 0 || !com.sankuai.waimai.mach.utils.g.a(a2 / 100.0f)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("type", str2);
        map.put("description", str3);
        com.dianping.codelog.b.b(s.class, str, new JSONObject(map).toString());
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(String str, com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd0c18da1bdd8060b5dfba2791b5d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd0c18da1bdd8060b5dfba2791b5d83");
        } else if (aVar != null) {
            synchronized (s.class) {
                aVar.a(str);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de412b8d7a368efb6c325ef0a371f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de412b8d7a368efb6c325ef0a371f2c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = "";
            if (i == com.sankuai.waimai.mach.log.a.a) {
                str3 = "info";
            } else if (i == com.sankuai.waimai.mach.log.a.b) {
                str3 = "error";
            }
            jSONObject.put("level", str3);
            jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, c);
            jSONObject.put("category", b);
            if (str2 != null && str != null) {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, str + CommonConstant.Symbol.COMMA + str2);
            } else {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, b);
            }
            com.dianping.networklog.c.a(jSONObject.toString(), 3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807e9eb39a303811e9aa5235799034b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807e9eb39a303811e9aa5235799034b8");
        } else if (aVar != null) {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(aVar.b);
            long a2 = com.sankuai.waimai.mach.utils.h.a();
            if (aVar.c != null) {
                synchronized (s.class) {
                    for (Map.Entry<String, Long> entry : aVar.c.entrySet()) {
                        createCustomSpeedMeterTask.recordStepUseDefined(entry.getKey(), entry.getValue().longValue() + a2);
                    }
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                }
            }
        }
    }
}
