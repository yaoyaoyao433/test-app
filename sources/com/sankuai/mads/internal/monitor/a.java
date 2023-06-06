package com.sankuai.mads.internal.monitor;

import android.content.Context;
import com.dianping.monitor.impl.l;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/sankuai/mads/internal/monitor/CustomMetricMonitorService;", "Lcom/dianping/monitor/impl/MetricMonitorService;", "appId", "", "context", "Landroid/content/Context;", "(ILandroid/content/Context;)V", "getAppId", "()I", "addValues", "Lcom/dianping/monitor/impl/MetricMonitor;", "key", "", "value", "", "", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a extends m {
    public static ChangeQuickRedirect b;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, @NotNull Context context) {
        super(i, context);
        h.b(context, "context");
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b1a7387e4f3311c40fe17467e328b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b1a7387e4f3311c40fe17467e328b1");
        } else {
            this.c = i;
        }
    }

    @Override // com.dianping.monitor.impl.m, com.dianping.monitor.impl.l
    @NotNull
    public final l a(@Nullable String str, @Nullable List<Float> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc7b9b694ed5ed7535b8a8d1471767e", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc7b9b694ed5ed7535b8a8d1471767e");
        }
        StringBuilder sb = new StringBuilder();
        if (this.c != 404) {
            sb.append("Mads");
        }
        sb.append(str);
        l a = super.a(sb.toString(), list);
        h.a((Object) a, "super.addValues(realKey.toString(), value)");
        return a;
    }
}
