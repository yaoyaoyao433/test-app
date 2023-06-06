package com.meituan.android.common.aidata.ai.bundle.cache;

import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LoadBundleResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AiBundle mAiBundle;
    private int netErrorCode;

    public AiBundle getBundle() {
        return this.mAiBundle;
    }

    public void setBundle(AiBundle aiBundle) {
        this.mAiBundle = aiBundle;
    }

    public int getNetErrorCode() {
        return this.netErrorCode;
    }

    public void setNetErrorCode(int i) {
        this.netErrorCode = i;
    }

    public int getErrorCode() {
        return this.netErrorCode;
    }
}
