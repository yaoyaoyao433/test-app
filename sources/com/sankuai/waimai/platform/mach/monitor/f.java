package com.sankuai.waimai.platform.mach.monitor;

import android.support.annotation.NonNull;
import com.dianping.monitor.impl.m;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.utils.h;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f implements com.sankuai.waimai.mach.e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.e
    public final void a(int i, @NonNull String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5dff3f48af8de3db5e9a321729c8d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5dff3f48af8de3db5e9a321729c8d52");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("WMMachMonitorReport", "onCatReport::code=" + i + ",cmd=" + str + ",duration=" + i2, new Object[0]);
        com.sankuai.waimai.platform.capacity.log.c.a().a(i, i2, str);
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0a0a400f5267c15ebb9e93307ab582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0a0a400f5267c15ebb9e93307ab582");
            return;
        }
        m mVar = new m(i.a().f(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c());
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de413ba62d283c84d0464bcd81a1db0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de413ba62d283c84d0464bcd81a1db0e");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("WMMachMonitorReport", "onSnifferNormal::module=" + str + ",type=" + str2 + ",description=" + str3 + ",extra=" + com.sankuai.waimai.mach.utils.b.a().toJson(map), new Object[0]);
        try {
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a(str).d(new JSONObject(map).toString()).b(str2).c(str3).b());
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(String str, com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11d56f9b9f363619b2d4857bca140a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11d56f9b9f363619b2d4857bca140a5");
        } else if (aVar != null) {
            synchronized (f.class) {
                aVar.a(str);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee61f696c2908de61dc74f9ebc4bc99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee61f696c2908de61dc74f9ebc4bc99");
        } else if (i == com.sankuai.waimai.mach.log.a.a) {
            com.sankuai.waimai.platform.mach.statistics.a.a(str, str2);
        } else if (i == com.sankuai.waimai.mach.log.a.b) {
            com.sankuai.waimai.platform.mach.statistics.a.b(str, str2);
        }
    }

    @Override // com.sankuai.waimai.mach.e
    public final void a(com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157f2c57fd476678b6bebe85778b72dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157f2c57fd476678b6bebe85778b72dd");
        } else if (aVar != null) {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(aVar.b);
            long a2 = h.a();
            if (aVar.c != null) {
                synchronized (f.class) {
                    for (Map.Entry<String, Long> entry : aVar.c.entrySet()) {
                        createCustomSpeedMeterTask.recordStepUseDefined(entry.getKey(), entry.getValue().longValue() + a2);
                    }
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                }
            }
        }
    }
}
