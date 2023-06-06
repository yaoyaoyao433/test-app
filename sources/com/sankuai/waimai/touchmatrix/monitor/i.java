package com.sankuai.waimai.touchmatrix.monitor;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i implements e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.touchmatrix.monitor.e
    public final void a(int i, @NonNull String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a141533c004f310b52318077e68f1828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a141533c004f310b52318077e68f1828");
            return;
        }
        StringBuilder sb = new StringBuilder("onCatReport::code=");
        sb.append(i);
        sb.append(",cmd=");
        sb.append(str);
        sb.append(",duration=0");
        c a2 = c.a();
        Object[] objArr2 = {Integer.valueOf(i), 0, str};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "79c2b5cbe7f95baa3f4296730b29a272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "79c2b5cbe7f95baa3f4296730b29a272");
        } else {
            a2.pv3(com.meituan.android.time.c.b(), str, 0, 0, i, 0, 0, 0, null);
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.monitor.e
    public final void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e451bf41602dee78046704298db351da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e451bf41602dee78046704298db351da");
            return;
        }
        StringBuilder sb = new StringBuilder("onSnifferNormal::module=");
        sb.append(str);
        sb.append(",type=");
        sb.append(str2);
        sb.append(",description=");
        sb.append(str3);
        sb.append(",extra=");
        sb.append(com.sankuai.waimai.touchmatrix.utils.b.a().toJson(map));
        try {
            k.d(new f().a(str).d(new JSONObject(map).toString()).b(str2).c(str3).b());
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.monitor.e
    public final void a(String str, h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1bb378cae37aeb1ab6a71597fe9adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1bb378cae37aeb1ab6a71597fe9adf");
        } else if (hVar != null) {
            synchronized (i.class) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = h.a;
                if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "2c430b4f128d739a115b5073466fdb7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "2c430b4f128d739a115b5073466fdb7e");
                } else {
                    hVar.d.put(str, Long.valueOf(SystemClock.elapsedRealtime() - hVar.c));
                }
            }
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.monitor.e
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a9aba003dbcbf31cbab5a7b3c82031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a9aba003dbcbf31cbab5a7b3c82031");
        } else if (hVar != null) {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(hVar.b == null ? "" : hVar.b);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (hVar.d != null) {
                synchronized (i.class) {
                    for (Map.Entry<String, Long> entry : hVar.d.entrySet()) {
                        createCustomSpeedMeterTask.recordStepUseDefined(entry.getKey(), entry.getValue().longValue() + elapsedRealtime);
                    }
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                }
            }
        }
    }
}
