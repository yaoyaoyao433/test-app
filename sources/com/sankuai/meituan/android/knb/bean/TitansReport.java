package com.sankuai.meituan.android.knb.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansReport {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static AtomicBoolean isWebViewInited = new AtomicBoolean(false);
    @SerializedName("commonTag")
    @Expose
    public CommonTag commonTag;
    @SerializedName("h5Env")
    @Expose
    public H5Env h5Env;
    @SerializedName("urlPreprocess")
    @Expose
    public UrlPreprocess urlPreprocess;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CommonTag {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("titansCoreVersion")
        @Expose
        public String titansCoreVersion;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class H5Env {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tag")
        @Expose
        public H5EnvTag tag;
        @SerializedName(DeviceInfo.TM)
        @Expose
        public H5EnvTimestamp timestamp;
        @SerializedName("timing")
        @Expose
        public H5EnvTiming timing;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class H5EnvTag {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("isWebViewInitialed")
        @Expose
        public boolean isWebViewInitialed;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class H5EnvTimestamp {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("h5EnvInit")
        @Expose
        public long h5EnvInit;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class H5EnvTiming {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("h5EnvPrepare")
        @Expose
        public long h5EnvPrepare;
        @SerializedName("nativeLayout")
        @Expose
        public long nativeLayout;
        @SerializedName("pagePreprocess")
        @Expose
        public long pagePreprocess;
        public long webViewSetupTime;
        @SerializedName("webviewPrepare")
        @Expose
        public long webviewPrepare;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class UrlPreprocess {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tag")
        @Expose
        public UrlTag tag;
        @SerializedName("timing")
        @Expose
        public UrlTiming timing;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class UrlTag {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("isInterJump")
        @Expose
        public boolean isInterJump;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class UrlTiming {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("urlPreprocess")
        @Expose
        public long urlPreprocess;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TitansReport titansReport;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b314596d969ec8bca73718c5a58f8b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b314596d969ec8bca73718c5a58f8b");
            } else {
                this.titansReport = new TitansReport();
            }
        }

        public Builder setH5EnvPrepareTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "422663559a01e8a4dfaf7b6beb2f4e72", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "422663559a01e8a4dfaf7b6beb2f4e72");
            }
            getH5EnvTiming().h5EnvPrepare = j;
            return this;
        }

        public Builder h5EnvWebViewStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7781004ac4df8d0b9bb1a293ba6ed9c", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7781004ac4df8d0b9bb1a293ba6ed9c");
            }
            getH5EnvTiming().webViewSetupTime = System.currentTimeMillis();
            return this;
        }

        public Builder h5EnvWebViewEnd() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a45865dad8ccb0f0c816186ba5aed90", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a45865dad8ccb0f0c816186ba5aed90");
            }
            if (getH5EnvTiming().webViewSetupTime != 0) {
                getH5EnvTiming().pagePreprocess = System.currentTimeMillis() - getH5EnvTiming().webViewSetupTime;
            }
            return this;
        }

        public Builder setH5EnvNativeLayoutTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7b0dcb37fc0926bff8eadc1dce3f434", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7b0dcb37fc0926bff8eadc1dce3f434");
            }
            getH5EnvTiming().nativeLayout = j;
            return this;
        }

        public Builder setH5EnvWebViewPrepareTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90ffe9cd0a64a3761b08aec9b486bbdd", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90ffe9cd0a64a3761b08aec9b486bbdd");
            }
            getH5EnvTiming().webviewPrepare = j;
            return this;
        }

        public Builder setH5EnvInitTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "857f55e64856bc84fadc72fed306fa02", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "857f55e64856bc84fadc72fed306fa02");
            }
            getH5EnvTimestamp().h5EnvInit = j;
            return this;
        }

        public long getH5EnvInitTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eb9d271a1f08fbf1436bf16a3aeb102", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eb9d271a1f08fbf1436bf16a3aeb102")).longValue() : getH5EnvTimestamp().h5EnvInit;
        }

        public Builder setH5EnvIsWebViewInitialed(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61b6145711519ce86a341826e1a0c923", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61b6145711519ce86a341826e1a0c923");
            }
            getH5EnvTag().isWebViewInitialed = z;
            return this;
        }

        public Builder setUrlPreProcessTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "626e2d89499c1a608e5fe150c999f792", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "626e2d89499c1a608e5fe150c999f792");
            }
            getUrlPreProcessTiming().urlPreprocess = j;
            return this;
        }

        public Builder setUrlPreProcessIsInterJump(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6e8e60a686f6ae5b83fa2082cdec201", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6e8e60a686f6ae5b83fa2082cdec201");
            }
            getUrlTag().isInterJump = z;
            return this;
        }

        public Builder setTitansVersion(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d4311a399144e6824442ea761d786bb", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d4311a399144e6824442ea761d786bb");
            }
            if (this.titansReport.commonTag == null) {
                this.titansReport.commonTag = new CommonTag();
            }
            this.titansReport.commonTag.titansCoreVersion = str;
            return this;
        }

        public Builder removeH5Env() {
            this.titansReport.h5Env = null;
            return this;
        }

        public TitansReport create() {
            return this.titansReport;
        }

        private synchronized H5EnvTimestamp getH5EnvTimestamp() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d769224b8faa2c634c57ba710c98769", RobustBitConfig.DEFAULT_VALUE)) {
                return (H5EnvTimestamp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d769224b8faa2c634c57ba710c98769");
            }
            if (this.titansReport.h5Env == null) {
                this.titansReport.h5Env = new H5Env();
            }
            if (this.titansReport.h5Env.timestamp == null) {
                this.titansReport.h5Env.timestamp = new H5EnvTimestamp();
            }
            return this.titansReport.h5Env.timestamp;
        }

        private synchronized UrlTiming getUrlPreProcessTiming() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8640bc8b1656c414cfd3a5e425d23bba", RobustBitConfig.DEFAULT_VALUE)) {
                return (UrlTiming) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8640bc8b1656c414cfd3a5e425d23bba");
            }
            if (this.titansReport.urlPreprocess == null) {
                this.titansReport.urlPreprocess = new UrlPreprocess();
            }
            if (this.titansReport.urlPreprocess.timing == null) {
                this.titansReport.urlPreprocess.timing = new UrlTiming();
            }
            return this.titansReport.urlPreprocess.timing;
        }

        private synchronized H5EnvTag getH5EnvTag() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ccb959f47f6686be8b57d2cfe509752", RobustBitConfig.DEFAULT_VALUE)) {
                return (H5EnvTag) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ccb959f47f6686be8b57d2cfe509752");
            }
            if (this.titansReport.h5Env == null) {
                this.titansReport.h5Env = new H5Env();
            }
            if (this.titansReport.h5Env.tag == null) {
                this.titansReport.h5Env.tag = new H5EnvTag();
            }
            return this.titansReport.h5Env.tag;
        }

        private synchronized UrlTag getUrlTag() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95a903117c9c1f351da7dfe78d57ff51", RobustBitConfig.DEFAULT_VALUE)) {
                return (UrlTag) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95a903117c9c1f351da7dfe78d57ff51");
            }
            if (this.titansReport.urlPreprocess == null) {
                this.titansReport.urlPreprocess = new UrlPreprocess();
            }
            if (this.titansReport.urlPreprocess.tag == null) {
                this.titansReport.urlPreprocess.tag = new UrlTag();
            }
            return this.titansReport.urlPreprocess.tag;
        }

        private synchronized H5EnvTiming getH5EnvTiming() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4f7cfbfe5ce02d2b6ce6d87559ed9c", RobustBitConfig.DEFAULT_VALUE)) {
                return (H5EnvTiming) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4f7cfbfe5ce02d2b6ce6d87559ed9c");
            }
            if (this.titansReport.h5Env == null) {
                this.titansReport.h5Env = new H5Env();
            }
            if (this.titansReport.h5Env.timing == null) {
                this.titansReport.h5Env.timing = new H5EnvTiming();
            }
            return this.titansReport.h5Env.timing;
        }
    }

    public TitansReport() {
    }
}
