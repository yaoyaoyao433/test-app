package com.huawei.hms.common.internal;

import com.huawei.hms.common.HuaweiApi;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HandlerMessageWrapper {
    final HuaweiApi<?> mApi;
    final BaseContentWrapper mContentWrapper;

    public HandlerMessageWrapper(BaseContentWrapper baseContentWrapper, int i, HuaweiApi<?> huaweiApi) {
        this.mContentWrapper = baseContentWrapper;
        this.mApi = huaweiApi;
    }
}
