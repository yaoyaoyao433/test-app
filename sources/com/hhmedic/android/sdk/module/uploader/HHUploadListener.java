package com.hhmedic.android.sdk.module.uploader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface HHUploadListener {
    void onFail(String str, String str2);

    void onProgress(int i, String str);

    void onSuccess(HHUploadResponse hHUploadResponse);
}
