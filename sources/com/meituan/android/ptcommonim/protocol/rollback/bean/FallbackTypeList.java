package com.meituan.android.ptcommonim.protocol.rollback.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class FallbackTypeList {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("fallback_card_types")
    public List<FallbackTypeConfig> configList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class FallbackTypeConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String channel;
        public List<Integer> fallbackTypes;
    }
}
