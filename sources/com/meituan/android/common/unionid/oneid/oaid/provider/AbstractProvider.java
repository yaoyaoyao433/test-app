package com.meituan.android.common.unionid.oneid.oaid.provider;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractProvider {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final String fail_cause_api_exception = "getAdvertisingIdInfo IOException";
    public static final String fail_cause_api_null = "oaid is null";
    public static final String fail_cause_invalid_param = "invalid input param";

    public abstract BaseResponse getOaid(Context context);

    public abstract boolean isOaidSupported(Context context);
}
