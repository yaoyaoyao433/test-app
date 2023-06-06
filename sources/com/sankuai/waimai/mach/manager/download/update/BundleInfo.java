package com.sankuai.waimai.mach.manager.download.update;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BundleInfo implements Serializable {
    public static final String MACH_PRO_SUB_BUNDLE = "1";
    public static final String TAG_FORCE_UPDATE = "force-update";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bundleName;
    private String bundleType;
    private String bundleVersion;
    private boolean hasSetTimeout;
    @SerializedName("mach_id")
    private String machId;
    private boolean machProBundle;
    private String md5;
    private boolean retryDownloadEnd;
    private boolean retryDownloadStart;
    private String tags;
    private String url;
    private String version;

    public BundleInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50c68c8c068f3878cd95f302af045dd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50c68c8c068f3878cd95f302af045dd4");
            return;
        }
        this.bundleType = "-1";
        this.machProBundle = false;
    }

    public boolean isRetryDownloadStart() {
        return this.retryDownloadStart;
    }

    public void setRetryDownloadStart(boolean z) {
        this.retryDownloadStart = z;
    }

    public boolean isRetryDownloadEnd() {
        return this.retryDownloadEnd;
    }

    public void setRetryDownloadEnd(boolean z) {
        this.retryDownloadEnd = z;
    }

    public void setBundleType(String str) {
        this.bundleType = str;
    }

    public String getBundleType() {
        return this.bundleType;
    }

    public boolean hasSetTimeout() {
        return this.hasSetTimeout;
    }

    public void setTimeout(boolean z) {
        this.hasSetTimeout = z;
    }

    public String getBundleVersion() {
        return this.bundleVersion;
    }

    public void setBundleVersion(String str) {
        this.bundleVersion = str;
    }

    public void setBundleName(String str) {
        this.bundleName = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getUrl() {
        return this.url;
    }

    public String getName() {
        return this.bundleName;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getMachId() {
        return this.machId;
    }

    public void setMachId(String str) {
        this.machId = str;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public boolean isMachProBundle() {
        return this.machProBundle;
    }

    public void setMachProBundle(boolean z) {
        this.machProBundle = z;
    }
}
