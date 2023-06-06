package com.meituan.android.privacy.interfaces;

import android.location.Criteria;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface u {
    @RequiresPermission("Locate.once")
    GpsStatus a(@Nullable GpsStatus gpsStatus);

    @RequiresPermission("Locate.once")
    @Nullable
    Location a(String str);

    String a(@NonNull Criteria criteria, boolean z);

    List<String> a();

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 24)
    void a(@NonNull GnssStatus.Callback callback);

    @RequiresPermission("Locate.once")
    void a(LocationListener locationListener);

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 24)
    void a(@NonNull OnNmeaMessageListener onNmeaMessageListener);

    @RequiresPermission("Locate.once")
    void a(@NonNull String str, long j, float f, @NonNull LocationListener locationListener);

    @RequiresPermission("Locate.once")
    void a(@NonNull String str, long j, float f, @NonNull LocationListener locationListener, Looper looper);

    @RequiresPermission("Locate.once")
    boolean a(GpsStatus.Listener listener);

    boolean a(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @RequiresApi(api = 24)
    void b(@NonNull GnssStatus.Callback callback);

    void b(GpsStatus.Listener listener);

    @RequiresApi(api = 24)
    void b(@NonNull OnNmeaMessageListener onNmeaMessageListener);

    void b(String str);

    @RequiresApi(api = 28)
    boolean b();

    boolean c(@NonNull String str);
}
