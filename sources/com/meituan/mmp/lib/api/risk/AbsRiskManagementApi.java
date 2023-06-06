package com.meituan.mmp.lib.api.risk;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsRiskManagementApi {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetRiskControlFingerprint extends ApiFunction<Empty, GetRiskControlFingerprintResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class GetRiskControlFingerprintResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String fingerprint;
    }
}
