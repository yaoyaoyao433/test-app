package com.meituan.msi.api.report;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SamplingParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ApiSampling[] apiSampling;
    public int generalRate = -1;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class ApiSampling {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;
        public int sampleRate;
        public String scope;
    }
}
