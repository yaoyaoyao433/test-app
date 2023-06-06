package com.sankuai.xm.file.transfer;

import com.sankuai.xm.file.bean.TransferContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface d {
    void onError(TransferContext transferContext, int i, String str);

    void onProgress(TransferContext transferContext, double d, double d2);

    void onStateChanged(TransferContext transferContext, int i);
}
