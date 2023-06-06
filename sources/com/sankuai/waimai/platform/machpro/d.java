package com.sankuai.waimai.platform.machpro;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.utils.h;
import com.sankuai.waimai.machpro.f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements com.sankuai.waimai.machpro.monitor.a {
    public static ChangeQuickRedirect a = null;
    private static String b = "MachLogan";
    private static String c = "waimai";

    @Override // com.sankuai.waimai.machpro.monitor.a
    public final void a(Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e80850d18cab76dd5cc173a3df135ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e80850d18cab76dd5cc173a3df135ac0");
            return;
        }
        int f = i.a().f();
        Context context = com.meituan.android.singleton.b.a;
        m mVar = new m(f, context, GetUUID.getInstance().getSyncUUID(context, null));
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

    @Override // com.sankuai.waimai.machpro.monitor.a
    public final void a(String str, List<Float> list, Map<String, String> map) {
        Object[] objArr = {str, list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b0542b52ea0421c6acea8dd7f4f29e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b0542b52ea0421c6acea8dd7f4f29e");
            return;
        }
        int f = i.a().f();
        Context context = com.meituan.android.singleton.b.a;
        m mVar = new m(f, context, GetUUID.getInstance().getSyncUUID(context, null));
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            mVar.a(str, list);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mVar.a(entry.getKey(), entry.getValue());
            }
        }
        mVar.a();
    }

    @Override // com.sankuai.waimai.machpro.monitor.a
    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e874743c130ed8b38afc4de21c7407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e874743c130ed8b38afc4de21c7407");
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
            if (str2 != null) {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, str + CommonConstant.Symbol.COMMA + str2);
            } else {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, b);
            }
            com.dianping.networklog.c.a(jSONObject.toString(), 3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.machpro.monitor.a
    public final void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61620f20d1d6a7a36627eb0fe7b4046d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61620f20d1d6a7a36627eb0fe7b4046d");
        } else {
            com.dianping.codelog.b.b(cls, str, str2);
        }
    }

    @Override // com.sankuai.waimai.machpro.monitor.a
    public final void a(FFPReportListener.IReportEvent iReportEvent, Map<String, Object> map) {
        Object[] objArr = {iReportEvent, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083fbcdca02188dc54ce48ae888490ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083fbcdca02188dc54ce48ae888490ea");
            return;
        }
        if (f.a().i.i) {
            Babel.log(new Log.Builder("").tag("MPFFPTime_Test").generalChannelStatus(true).optional(map).value(iReportEvent.ffpInMs()).build());
            Babel.log(new Log.Builder("").tag("MPFFP_Test").generalChannelStatus(true).optional(map).value(iReportEvent.ffpInMs() <= 1000 ? 1L : 0L).build());
            return;
        }
        Babel.log(new Log.Builder("").tag("MPFFPTime").generalChannelStatus(true).optional(map).value(iReportEvent.ffpInMs()).build());
        Babel.log(new Log.Builder("").tag("MPFFP").generalChannelStatus(true).optional(map).value(iReportEvent.ffpInMs() <= 1000 ? 1L : 0L).build());
    }

    @Override // com.sankuai.waimai.machpro.monitor.a
    public final void a(com.sankuai.waimai.machpro.monitor.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "912be6e22820b4fff665be3815672239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "912be6e22820b4fff665be3815672239");
        } else if (bVar != null) {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(bVar.b);
            long a2 = h.a();
            if (bVar.c != null) {
                synchronized (d.class) {
                    for (Map.Entry<String, Long> entry : bVar.c.entrySet()) {
                        createCustomSpeedMeterTask.recordStepUseDefined(entry.getKey(), entry.getValue().longValue() + a2);
                    }
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                    bVar.c.clear();
                }
            }
        }
    }
}
