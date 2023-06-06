package com.meituan.mmp.lib.api.utm;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsUtmModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsGetUTMFromKNB extends ApiFunction<Empty, GetUTMFromKNBResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class GetUTMFromKNBResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String utm_campaign;
        public String utm_content;
        public String utm_medium;
        public String utm_source;
        public int utm_term;
    }
}
