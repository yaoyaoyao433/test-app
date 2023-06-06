package com.meituan.msi.api;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class DebugApiResponse<T> extends ApiResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("debug_model")
    private final DebugModel debugModel;

    public DebugApiResponse(ApiRequest<?> apiRequest) {
        super(apiRequest);
        this.debugModel = new DebugModel();
        this.debugModel.newApi = this.isNewApi;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class DebugModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("new_api")
        private boolean newApi;
    }
}
