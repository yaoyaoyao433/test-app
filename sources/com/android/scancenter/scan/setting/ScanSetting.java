package com.android.scancenter.scan.setting;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ScanSetting {
    private final int a;
    private final com.android.scancenter.scan.setting.a b;
    private final String c;
    private final a d;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DeviceConnectMode {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ScanMode {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScanSetting scanSetting = (ScanSetting) obj;
        return this.a == scanSetting.a && this.b.equals(scanSetting.b) && this.c.equals(scanSetting.c) && this.d.equals(scanSetting.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }
}
