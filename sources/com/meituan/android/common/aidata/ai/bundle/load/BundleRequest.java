package com.meituan.android.common.aidata.ai.bundle.load;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BundleRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String business;
    private String jsId;
    private String presetJSId;
    private long timeout;

    public BundleRequest(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30f207253af77ff9fdc6249bca5ff484", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30f207253af77ff9fdc6249bca5ff484");
            return;
        }
        this.jsId = builder.jsId;
        this.presetJSId = builder.presetTemplateId;
        this.business = builder.business;
        this.timeout = builder.timeout;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public boolean hasSetTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61218ef5e4f32d53546643cab9accad1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61218ef5e4f32d53546643cab9accad1")).booleanValue() : this.timeout > 0;
    }

    @NonNull
    public String getJsId() {
        return this.jsId;
    }

    @Nullable
    public String getPresetJSId() {
        return this.presetJSId;
    }

    @NonNull
    public String getBusiness() {
        return this.business;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String business;
        public String jsId;
        public String presetTemplateId;
        public long timeout;

        public Builder setJsId(String str) {
            this.jsId = str;
            return this;
        }

        public Builder setPresetTemplateId(String str) {
            this.presetTemplateId = str;
            return this;
        }

        public Builder setBusiness(String str) {
            this.business = str;
            return this;
        }

        public Builder setTimeout(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a47a406a58d661ac66d22217dced34", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a47a406a58d661ac66d22217dced34");
            }
            this.timeout = j;
            return this;
        }

        public BundleRequest build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6ce314403f562b46d4a6632c1c0a863", RobustBitConfig.DEFAULT_VALUE)) {
                return (BundleRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6ce314403f562b46d4a6632c1c0a863");
            }
            if (TextUtils.isEmpty(this.jsId)) {
                throw new IllegalArgumentException("setJsId is required.");
            }
            if (TextUtils.isEmpty(this.business)) {
                throw new IllegalArgumentException("business is required.");
            }
            return new BundleRequest(this);
        }
    }
}
