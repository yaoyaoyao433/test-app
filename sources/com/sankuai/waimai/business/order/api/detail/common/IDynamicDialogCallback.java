package com.sankuai.waimai.business.order.api.detail.common;

import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public interface IDynamicDialogCallback {
    @Keep
    <T> void failedWithParam(T t, T t2);

    @Keep
    <T> void onDismiss(T t);

    @Keep
    <T> void successWithParam(T t, T t2);
}
