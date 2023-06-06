package com.meituan.android.quickpass.uptsm.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class TsmUpdateInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TsmUpdateData data;
    private TsmErrorInfo error;
    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public TsmUpdateData getData() {
        return this.data;
    }

    public void setData(TsmUpdateData tsmUpdateData) {
        this.data = tsmUpdateData;
    }

    public TsmErrorInfo getError() {
        return this.error;
    }

    public void setError(TsmErrorInfo tsmErrorInfo) {
        this.error = tsmErrorInfo;
    }
}
