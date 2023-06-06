package com.meituan.android.privacy.interfaces;

import android.content.Context;
import android.hardware.Camera;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface h {
    j a(String str, int i, int i2, int i3, int i4, int i5);

    k a();

    o a(Context context);

    p a(String str);

    p a(String str, int i);

    p a(String str, Camera camera);

    r a(Context context, String str, b bVar);

    s a(Context context, b bVar);

    @Nullable
    u a(Context context, String str);

    @Nullable
    MtTelephonyManager b(Context context, String str);

    m b();

    s b(Context context);

    v b(String str);

    @Nullable
    MtBluetoothAdapter c(String str);

    @Nullable
    MtWifiManager c(Context context, String str);

    @Nullable
    l d(String str);

    @Nullable
    w d(Context context, String str);

    @Nullable
    x e(Context context, String str);

    r f(Context context, String str);

    @Nullable
    n g(Context context, String str);

    @Nullable
    t h(Context context, String str);

    MtSensorManager i(Context context, String str);

    q j(Context context, String str);

    MtPackageManager k(Context context, String str);

    i l(Context context, String str);
}
