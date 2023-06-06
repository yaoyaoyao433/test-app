package com.dianping.eunomia;

import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0006J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/dianping/eunomia/ModuleMonitor;", "", "()V", "cvError", "", "key", "", "timeConsume", "", "cvSuccess", "logError", "clazz", "Ljava/lang/Class;", "message", "sendMetricsData", "id", "value", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static final h b = new h();

    public final void a(@NotNull Class<?> cls, @NotNull String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb7c15dcbe44371fa2980099ba30186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb7c15dcbe44371fa2980099ba30186");
            return;
        }
        kotlin.jvm.internal.h.b(cls, "clazz");
        kotlin.jvm.internal.h.b(str, "message");
        ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(cls, str, "Eunomia");
    }

    public final void a(@Nullable String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0dbedebc0aa4594d704db0c1b9c409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0dbedebc0aa4594d704db0c1b9c409");
        } else {
            a("HMConfigView", str, j);
        }
    }

    public final void b(@Nullable String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b7b47c558e093ca8dcf434acb8820a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b7b47c558e093ca8dcf434acb8820a");
        } else {
            a("HMConfigMiss", str, j);
        }
    }

    private final void a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36292cb857a64c0a9dbb920a33975b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36292cb857a64c0a9dbb920a33975b25");
        } else {
            ShieldMetricsData.Companion.obtain().addValues(str, kotlin.collections.h.c(Float.valueOf((float) j))).addTag(ShieldMonitorKey.TAG_BUSINESS, str2).send();
        }
    }
}
