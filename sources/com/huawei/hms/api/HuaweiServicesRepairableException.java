package com.huawei.hms.api;

import android.content.Intent;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HuaweiServicesRepairableException extends UserRecoverableException {
    private final int b;

    public HuaweiServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.b = i;
    }

    public int getConnectionStatusCode() {
        return this.b;
    }
}
