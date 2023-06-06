package com.meituan.android.privacy.interfaces;

import android.support.annotation.NonNull;
/* compiled from: ProGuard */
@RequiresPermission(PermissionGuard.PERMISSION_MICROPHONE)
/* loaded from: classes3.dex */
public interface j {
    int a(byte[] bArr, int i, int i2);

    int a(@NonNull short[] sArr, int i, int i2);

    void a() throws IllegalStateException;

    void b() throws IllegalStateException;

    void c();

    int d();

    int e();

    int f();
}
