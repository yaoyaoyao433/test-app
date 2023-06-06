package com.sankuai.meituan.android.knb.upload;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnUploadFileCompleted {
    Context getContext();

    String getSceneToken();

    void onError(String str, int i, String str2, int i2);

    void onSuccess(String str, String str2, String str3, int i);
}
