package com.meituan.msi.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StringRequestData {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String customData;
    private long nativeStartTime;
    private String requestData;

    public StringRequestData() {
    }

    public long getNativeStartTime() {
        return this.nativeStartTime;
    }

    public String getCustomData() {
        return this.customData;
    }

    public String getRequestData() {
        return this.requestData;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String customData;
        private long nativeStartTime;
        private String requestData;

        public final Builder nativeStartTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b7216d41db1e6000d0c30743ad46855", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b7216d41db1e6000d0c30743ad46855");
            }
            this.nativeStartTime = j;
            return this;
        }

        public final Builder customData(String str) {
            this.customData = str;
            return this;
        }

        public final Builder requestData(String str) {
            this.requestData = str;
            return this;
        }

        public final StringRequestData build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a05ce68b72b9e9046d1e3a11438db389", RobustBitConfig.DEFAULT_VALUE)) {
                return (StringRequestData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a05ce68b72b9e9046d1e3a11438db389");
            }
            StringRequestData stringRequestData = new StringRequestData();
            stringRequestData.nativeStartTime = this.nativeStartTime;
            stringRequestData.requestData = this.requestData;
            stringRequestData.customData = this.customData;
            return stringRequestData;
        }
    }
}
