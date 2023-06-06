package com.hhmedic.android.sdk.base.utils.luban;

import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface OnCompressListener {
    void onError(Throwable th);

    void onStart();

    void onSuccess(File file);
}
