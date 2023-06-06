package com.meituan.android.common.badge;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface BadgeProducer {
    String accountPhone();

    String appHash();

    String channel();

    String cityId();

    List<CustomizedProvider> customizedInfo();

    String dpId();

    String dxId();

    String oneId();

    String posSN();

    String pushToken();

    String unionId();

    String userId();

    String uuId();
}
