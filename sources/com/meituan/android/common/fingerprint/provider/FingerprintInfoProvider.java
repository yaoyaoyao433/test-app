package com.meituan.android.common.fingerprint.provider;

import com.meituan.android.common.fingerprint.info.AccelerometerInfo;
import com.meituan.android.common.fingerprint.info.LocationInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface FingerprintInfoProvider {
    String business();

    String dpid();

    List<AccelerometerInfo> getAccelerometerInfoList();

    LocationInfo getCachedLocation();

    String getChannel();

    String getMagicNumber();

    String getPushToken();

    String getUUID();

    String key();

    long serverCurrentTimeMillions();

    String source();
}
