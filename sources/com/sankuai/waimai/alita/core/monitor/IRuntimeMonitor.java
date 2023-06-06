package com.sankuai.waimai.alita.core.monitor;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public interface IRuntimeMonitor {

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public interface IAvailabilityLogBuilder {
        IAvailabilityLogBuilder addTags(@NonNull String str, @NonNull String str2);

        IAvailabilityLogBuilder biz(@NonNull String str);

        IAvailabilityLogBuilder bundleId(@NonNull String str);

        void commit();

        IAvailabilityLogBuilder errorCode(@NonNull String str);

        IAvailabilityLogBuilder tag(@NonNull String str);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public interface IJSExceptionLogBuilder {
        IJSExceptionLogBuilder bundleVersion(String str);

        void commit();

        IJSExceptionLogBuilder content(String str);

        IJSExceptionLogBuilder message(String str);

        IJSExceptionLogBuilder taskType(String str);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public interface IPerformanceMonitorTask {
        void commit();

        void step(String str);
    }

    void availabilityLog(String str, String str2, Map<String, String> map);

    IAvailabilityLogBuilder availabilityLogBuilder(String str, int i, String str2);

    void exceptionLog(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4);

    IJSExceptionLogBuilder jsExceptionLogBuilder(String str, int i);

    PerformanceMonitorTask performanceLog(String str);

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static abstract class PerformanceMonitorTask implements IPerformanceMonitorTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IPerformanceMonitorTask
        public abstract void commit();

        public abstract void step(String str, Map<String, String> map);

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IPerformanceMonitorTask
        public void step(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46a8d883cdf63d8c67e62fe544d04b61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46a8d883cdf63d8c67e62fe544d04b61");
            } else {
                step(str, null);
            }
        }
    }
}
