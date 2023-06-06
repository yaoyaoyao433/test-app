package com.meituan.android.common.aidata.ai.bundle.download.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BundleInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bundleName;
    private String bundleVersion;
    private boolean hasSetTimeout;
    private String md5;
    private String name;
    private String tags;
    private String url;
    private String version;

    public BundleInfo() {
    }

    public BundleInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d66dd421efe64bd977da2d45f5a39f25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d66dd421efe64bd977da2d45f5a39f25");
            return;
        }
        this.bundleName = str;
        this.bundleVersion = str2;
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

    public void setDDBundleName(String str) {
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

    public String getDDBundleName() {
        return this.bundleName;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public String getJsId() {
        return this.bundleName;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfcd9e24ac601845d1b8bf1823db2588", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfcd9e24ac601845d1b8bf1823db2588")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundleInfo bundleInfo = (BundleInfo) obj;
        return Objects.equals(getBundleVersion(), bundleInfo.getBundleVersion()) && Objects.equals(this.bundleName, bundleInfo.bundleName);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7efceed207050a24c46cf6dbc29c370c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7efceed207050a24c46cf6dbc29c370c")).intValue() : Objects.hash(getBundleVersion(), this.bundleName);
    }
}
