package com.android.scancenter.scan.setting;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.scancenter.scan.data.BleDevice;
import java.util.Arrays;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private final UUID[] a;
    private final String[] b;
    private final String c;
    private final boolean d;
    private long e;
    private final boolean f;
    private final long g;
    @Nullable
    private com.android.scancenter.scan.fliter.a<BleDevice> h;
    private final long i;
    private final boolean j;

    @NonNull
    public final String toString() {
        return "BleScanRuleConfig{mServiceUUIDs=" + Arrays.toString(this.a) + ", mDeviceNames=" + Arrays.toString(this.b) + ", mDeviceMac='" + this.c + "', mFuzzy=" + this.d + ", mScanTimeOut=" + this.e + ", isPreScan=" + this.f + ", createTime=" + this.g + ", filter=" + this.h + ", batchDelayReport=" + this.i + ", batchLegacy=" + this.j + '}';
    }
}
