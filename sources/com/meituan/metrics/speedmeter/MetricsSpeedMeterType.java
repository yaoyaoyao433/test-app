package com.meituan.metrics.speedmeter;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsSpeedMeterType {
    public static final int CUSTOM = 3;
    public static final int LAUNCH = 1;
    public static final String LAUNCH_COLD = "cold";
    public static final String LAUNCH_HOT = "hot";
    public static final int PAGE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LaunchType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MetricsSpeedMeter {
    }
}
