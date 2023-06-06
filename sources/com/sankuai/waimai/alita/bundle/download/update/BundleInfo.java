package com.sankuai.waimai.alita.bundle.download.update;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BundleInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bundleName;
    private String bundleVersion;
    private boolean hasSetTimeout;
    private boolean isDebugBundle;
    private String md5;
    private String tags;
    private String url;
    private String version;

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

    public void setMd5(String str) {
        this.md5 = str;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public boolean hasTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be9f86f462eb6483301126e0f73a62fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be9f86f462eb6483301126e0f73a62fc")).booleanValue() : !TextUtils.isEmpty(this.tags);
    }

    public String getJsId() {
        return this.bundleName;
    }

    public boolean isDebugBundle() {
        return this.isDebugBundle;
    }

    public void setDebugBundle(boolean z) {
        this.isDebugBundle = z;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8fd3e267f173b113d0441a44e41d539", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8fd3e267f173b113d0441a44e41d539");
        }
        return "BundleInfo{bundleVersion='" + this.bundleVersion + "', bundleName='" + this.bundleName + "', version='" + this.version + "', url='" + this.url + "', md5='" + this.md5 + "', tags='" + this.tags + "', hasSetTimeout=" + this.hasSetTimeout + ", isDebugBundle=" + this.isDebugBundle + '}';
    }
}
