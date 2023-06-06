package com.sankuai.model;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ExceptionObserver {
    void onHttpsFailedException(Exception exc);

    void onHttpsRetryException(Exception exc);
}
