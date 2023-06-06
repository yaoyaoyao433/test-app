package com.meituan.android.common.aidata.feature.utils;

import android.support.annotation.Nullable;
import java.lang.Exception;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ITaskListener<R, E extends Exception> {
    void onFailed(@Nullable E e);

    void onSuccess(@Nullable R r);
}
