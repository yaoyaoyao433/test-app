package com.meituan.android.common.aidata.resources.downloader;

import com.meituan.met.mercury.load.core.DDResource;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface DDResRawResultCallback {
    void onFail(Exception exc);

    void onSuccess(DDResource dDResource);
}
