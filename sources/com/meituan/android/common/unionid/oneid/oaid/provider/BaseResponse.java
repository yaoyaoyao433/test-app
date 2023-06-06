package com.meituan.android.common.unionid.oneid.oaid.provider;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cause;
    public boolean isLimitAdTrackingEnabled;
    public String oaid;
    public boolean status;

    public BaseResponse() {
    }

    public BaseResponse(boolean z, String str, boolean z2, String str2) {
        this.status = z;
        this.oaid = str;
        this.isLimitAdTrackingEnabled = z2;
        this.cause = str2;
    }
}
