package com.sankuai.waimai.alita.platform.monitor.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements IRuntimeMonitor {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements IRuntimeMonitor.IJSExceptionLogBuilder {
        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder bundleVersion(String str) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final void commit() {
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder content(String str) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder message(String str) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder taskType(String str) {
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements IRuntimeMonitor.IAvailabilityLogBuilder {
        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder addTags(@NonNull String str, @NonNull String str2) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder biz(@NonNull String str) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder bundleId(@NonNull String str) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final void commit() {
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder errorCode(@NonNull String str) {
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder tag(@NonNull String str) {
            return this;
        }
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final void availabilityLog(String str, String str2, Map<String, String> map) {
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final void exceptionLog(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final IRuntimeMonitor.IAvailabilityLogBuilder availabilityLogBuilder(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c5fbd0ab3bcd112d0630daa8e49a737", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c5fbd0ab3bcd112d0630daa8e49a737") : new c();
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final IRuntimeMonitor.PerformanceMonitorTask performanceLog(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c5c6ca4d76907a7120811b528d229a", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeMonitor.PerformanceMonitorTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c5c6ca4d76907a7120811b528d229a") : new C0721b();
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final IRuntimeMonitor.IJSExceptionLogBuilder jsExceptionLogBuilder(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102d6291f8af914b3d8782e4be77c343", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeMonitor.IJSExceptionLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102d6291f8af914b3d8782e4be77c343") : new a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.platform.monitor.impl.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0721b extends IRuntimeMonitor.PerformanceMonitorTask {
        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.PerformanceMonitorTask, com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IPerformanceMonitorTask
        public final void commit() {
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.PerformanceMonitorTask
        public final void step(@NonNull String str, Map<String, String> map) {
        }

        public C0721b() {
        }
    }
}
