package com.sankuai.titans.protocol.bean.report;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansReportInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
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
        public TitansReportInfo titansReportInfo;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d23c8a4d6912a7b588271d7d6ec5281", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d23c8a4d6912a7b588271d7d6ec5281");
            } else {
                this.titansReportInfo = new TitansReportInfo();
            }
        }

        public Builder setH5EnvPrepareTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f648cbc5a33a5a5e32c418de9d6512a8", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f648cbc5a33a5a5e32c418de9d6512a8");
            }
            getH5EnvTiming().h5EnvPrepare = j;
            return this;
        }

        public Builder h5EnvWebViewStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f05d0e27ea9a20edbe8e74503a2a74b6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f05d0e27ea9a20edbe8e74503a2a74b6");
            }
            getH5EnvTiming().webViewSetupTime = System.currentTimeMillis();
            return this;
        }

        public Builder h5EnvWebViewEnd() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f869bf2e79b9faa043a5779529f02e03", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f869bf2e79b9faa043a5779529f02e03");
            }
            if (getH5EnvTiming().webViewSetupTime != 0) {
                getH5EnvTiming().pagePreprocess = System.currentTimeMillis() - getH5EnvTiming().webViewSetupTime;
            }
            return this;
        }

        public Builder setH5EnvNativeLayoutTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5175b29f7ee715c9a111aedfdb6c495", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5175b29f7ee715c9a111aedfdb6c495");
            }
            getH5EnvTiming().nativeLayout = j;
            return this;
        }

        public Builder setH5EnvWebViewPrepareTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60dbde5b6d828c363e414ccef6145d34", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60dbde5b6d828c363e414ccef6145d34");
            }
            getH5EnvTiming().webviewPrepare = j;
            return this;
        }

        public Builder setH5EnvInitTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70bf2ebdc45a92c5b806c418b0bfe9fb", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70bf2ebdc45a92c5b806c418b0bfe9fb");
            }
            getH5EnvTimestamp().h5EnvInit = j;
            return this;
        }

        public long getH5EnvInitTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bfa661da2971fe7690321b435599c47", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bfa661da2971fe7690321b435599c47")).longValue() : getH5EnvTimestamp().h5EnvInit;
        }

        public Builder setH5EnvIsWebViewInitialed(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74e30772ca276487b5f923ba992c6140", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74e30772ca276487b5f923ba992c6140");
            }
            getH5EnvTag().isWebViewInitialed = z;
            return this;
        }

        public Builder setUrlPreProcessTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50bf1f20286e31eafcdbaa7de603a012", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50bf1f20286e31eafcdbaa7de603a012");
            }
            getUrlPreProcessTiming().urlPreprocess = j;
            return this;
        }

        public Builder setUrlPreProcessIsInterJump(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ce7e56c3508728d1134890d12b39d09", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ce7e56c3508728d1134890d12b39d09");
            }
            getUrlTag().isInterJump = z;
            return this;
        }

        public Builder setTitansVersion(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ffdeff7582680aaa069e4cdf5184a77", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ffdeff7582680aaa069e4cdf5184a77");
            }
            if (this.titansReportInfo.commonTag == null) {
                this.titansReportInfo.commonTag = new CommonTag();
            }
            this.titansReportInfo.commonTag.titansCoreVersion = str;
            return this;
        }

        public Builder removeH5Env() {
            this.titansReportInfo.h5Env = null;
            return this;
        }

        public TitansReportInfo create() {
            return this.titansReportInfo;
        }

        private synchronized H5EnvTimestamp getH5EnvTimestamp() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3208142afb4e88da1f0b18f677e3d0f7", RobustBitConfig.DEFAULT_VALUE)) {
                return (H5EnvTimestamp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3208142afb4e88da1f0b18f677e3d0f7");
            }
            if (this.titansReportInfo.h5Env == null) {
                this.titansReportInfo.h5Env = new H5Env();
            }
            if (this.titansReportInfo.h5Env.timestamp == null) {
                this.titansReportInfo.h5Env.timestamp = new H5EnvTimestamp();
            }
            return this.titansReportInfo.h5Env.timestamp;
        }

        private synchronized UrlTiming getUrlPreProcessTiming() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf010474356d1510eb393c5b1e451f7a", RobustBitConfig.DEFAULT_VALUE)) {
                return (UrlTiming) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf010474356d1510eb393c5b1e451f7a");
            }
            if (this.titansReportInfo.urlPreprocess == null) {
                this.titansReportInfo.urlPreprocess = new UrlPreprocess();
            }
            if (this.titansReportInfo.urlPreprocess.timing == null) {
                this.titansReportInfo.urlPreprocess.timing = new UrlTiming();
            }
            return this.titansReportInfo.urlPreprocess.timing;
        }

        private synchronized H5EnvTag getH5EnvTag() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d06f9da280eb925835e64a6f31b4a073", RobustBitConfig.DEFAULT_VALUE)) {
                return (H5EnvTag) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d06f9da280eb925835e64a6f31b4a073");
            }
            if (this.titansReportInfo.h5Env == null) {
                this.titansReportInfo.h5Env = new H5Env();
            }
            if (this.titansReportInfo.h5Env.tag == null) {
                this.titansReportInfo.h5Env.tag = new H5EnvTag();
            }
            return this.titansReportInfo.h5Env.tag;
        }

        private synchronized UrlTag getUrlTag() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "167bde6b860ffecf0f3c654cb4e6e47a", RobustBitConfig.DEFAULT_VALUE)) {
                return (UrlTag) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "167bde6b860ffecf0f3c654cb4e6e47a");
            }
            if (this.titansReportInfo.urlPreprocess == null) {
                this.titansReportInfo.urlPreprocess = new UrlPreprocess();
            }
            if (this.titansReportInfo.urlPreprocess.tag == null) {
                this.titansReportInfo.urlPreprocess.tag = new UrlTag();
            }
            return this.titansReportInfo.urlPreprocess.tag;
        }

        private synchronized H5EnvTiming getH5EnvTiming() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d1bba1acdda8e5bcd953ed67ad8bdf3", RobustBitConfig.DEFAULT_VALUE)) {
                return (H5EnvTiming) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d1bba1acdda8e5bcd953ed67ad8bdf3");
            }
            if (this.titansReportInfo.h5Env == null) {
                this.titansReportInfo.h5Env = new H5Env();
            }
            if (this.titansReportInfo.h5Env.timing == null) {
                this.titansReportInfo.h5Env.timing = new H5EnvTiming();
            }
            return this.titansReportInfo.h5Env.timing;
        }
    }

    public TitansReportInfo() {
    }
}
