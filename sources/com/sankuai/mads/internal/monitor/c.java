package com.sankuai.mads.internal.monitor;

import com.dianping.monitor.impl.l;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u000b"}, d2 = {"Lcom/sankuai/mads/internal/monitor/SuccessRateMonitor;", "", "()V", "report", "", "callback", "Lkotlin/Function1;", "Lcom/dianping/monitor/impl/MetricMonitor;", "Lkotlin/ParameterName;", "name", "metricMonitor", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final c b = new c();

    public final void a(@NotNull kotlin.jvm.functions.b<? super l, r> bVar) {
        Map<String, String> a2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8f9184955562f3dfc55d766c2c0698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8f9184955562f3dfc55d766c2c0698");
            return;
        }
        h.b(bVar, "callback");
        com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
        l a3 = new a(com.sankuai.mads.internal.c.b(), com.sankuai.mads.internal.c.l.a()).a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.mads.internal.c.l.f()).a("mads_version", "1.5.14");
        com.sankuai.mads.internal.c cVar2 = com.sankuai.mads.internal.c.l;
        com.sankuai.mads.internal.cache.b<String> d = com.sankuai.mads.internal.c.d();
        l a4 = a3.a(NetLogConstants.Tags.NETWORK_TYPE, d != null ? d.a() : null);
        com.sankuai.mads.internal.c cVar3 = com.sankuai.mads.internal.c.l;
        l a5 = a4.a("app", com.sankuai.mads.internal.c.g()).a("host", com.sankuai.mads.internal.c.l.i());
        try {
            com.sankuai.mads.internal.c cVar4 = com.sankuai.mads.internal.c.l;
            com.sankuai.mads.internal.cache.b<Map<String, String>> c = com.sankuai.mads.internal.c.c();
            if (c != null && (a2 = c.a()) != null) {
                for (Map.Entry<String, String> entry : a2.entrySet()) {
                    a5.a(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
        String a6 = com.sankuai.mads.internal.horn.a.a().b.a();
        if (a6 != null) {
            a5.a("group_key_c", a6);
        }
        h.a((Object) a5, "metricMonitorService");
        bVar.invoke(a5);
        a5.a();
    }
}
