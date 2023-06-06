package com.meituan.android.loader.impl;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DynFile implements Cloneable {
    public static final int SOURCE_NEWEST = 2;
    public static final int SOURCE_STATIC = 1;
    public static final int TYPE_ASSETS = 2;
    public static final int TYPE_SO = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String availableAppVersionCode;
    private String bundleName;
    private String bundleVersion;
    private long fileSize;
    private a hotFixFile;
    private boolean isInnerSo;
    private String localPath;
    private String localPathBundleVersion;
    private String name;
    private String originMd5;
    private int source;
    private String tempPath;
    private String tempPathBundleVersion;
    private int type;
    private transient boolean verified;

    public DynFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49b2611c5d5be869c7fe1b55254f8166", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49b2611c5d5be869c7fe1b55254f8166");
        } else {
            this.verified = false;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public void setBundleName(String str) {
        this.bundleName = str;
    }

    public String getBundleVersion() {
        return this.bundleVersion;
    }

    public void setBundleVersion(String str) {
        this.bundleVersion = str;
    }

    public String getLocalPathBundleVersion() {
        return this.localPathBundleVersion;
    }

    public void setLocalPathBundleVersion(String str) {
        this.localPathBundleVersion = str;
    }

    public String getTempZipPath() {
        return this.tempPath;
    }

    public void setTempZipPath(String str) {
        this.tempPath = str;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setTempZipBundleVersion(String str) {
        this.tempPathBundleVersion = str;
    }

    public String getTempZipBundleVersion() {
        return this.tempPathBundleVersion;
    }

    public String getOriginMd5() {
        return this.originMd5;
    }

    public void setOriginMd5(String str) {
        this.originMd5 = str;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9efa4f4b65aee8bd9d60018538317e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9efa4f4b65aee8bd9d60018538317e96");
        } else {
            this.fileSize = j;
        }
    }

    public int getSource() {
        return this.source;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public a getHotFixFile() {
        return this.hotFixFile;
    }

    public void setHotFixFile(a aVar) {
        this.hotFixFile = aVar;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean isInnerSo() {
        return this.isInnerSo;
    }

    public void setInnerSo(boolean z) {
        this.isInnerSo = z;
    }

    public String getAvailableAppVersionCode() {
        return this.availableAppVersionCode;
    }

    public void setAvailableAppVersionCode(String str) {
        this.availableAppVersionCode = str;
    }

    public boolean isVerified() {
        return this.verified;
    }

    public void setVerified(boolean z) {
        this.verified = z;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1a47dbde3a6571861fba31261d83b85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1a47dbde3a6571861fba31261d83b85");
        }
        return "DynFile{name='" + this.name + "', bundleName='" + this.bundleName + "', bundleVersion='" + this.bundleVersion + "', tempPath='" + this.tempPath + "', localPath='" + this.localPath + "', originMd5='" + this.originMd5 + "', fileSize=" + this.fileSize + ", source=" + this.source + ", hotFixFile=" + this.hotFixFile + ", type=" + this.type + ", isInnerSo=" + this.isInnerSo + '}';
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d5119033a781ad3f958efa1c7fc415e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d5119033a781ad3f958efa1c7fc415e")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.bundleName.equals(((DynFile) obj).bundleName);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af214db39da03fc077c4e567d74bbd3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af214db39da03fc077c4e567d74bbd3")).intValue() : this.bundleName.hashCode();
    }

    public String getCurOriginMd5() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65ff8a26ccda23aa5cac209ece316336", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65ff8a26ccda23aa5cac209ece316336");
        }
        if (this.source != 2 || this.hotFixFile == null) {
            return this.source == 1 ? this.originMd5 : "";
        }
        return this.hotFixFile.d;
    }

    public String getCurBundleVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c40d5bf11c75c394a02b6205426d8b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c40d5bf11c75c394a02b6205426d8b0e");
        }
        if (this.source != 2 || this.hotFixFile == null) {
            return this.source == 1 ? this.bundleVersion : "";
        }
        return this.hotFixFile.b;
    }

    @Deprecated
    public String getTempPath() {
        return this.tempPath;
    }

    @Deprecated
    public void setTempPath(String str) {
        this.tempPath = str;
    }

    @Deprecated
    public void setTempPathBundleVersion(String str) {
        this.tempPathBundleVersion = str;
    }

    @Deprecated
    public String getTempPathBundleVersion() {
        return this.tempPathBundleVersion;
    }

    public void updateHotFix(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bed1558f99464d8470e1d55d2e74560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bed1558f99464d8470e1d55d2e74560");
            return;
        }
        setSource(2);
        setTempZipPath(dDResource.getLocalPath());
        setTempZipBundleVersion(dDResource.getVersion());
        if (this.hotFixFile == null) {
            this.hotFixFile = new a();
        }
        this.hotFixFile.b = dDResource.getVersion();
        this.hotFixFile.c = dDResource.getMd5();
        this.hotFixFile.d = dDResource.getOriginMd5();
        f.d(">>>DynLoader updateHotFix " + this.hotFixFile.toString());
    }

    public void updateStaticFile(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ee6799c7ba110db5a8854121b3f7994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ee6799c7ba110db5a8854121b3f7994");
            return;
        }
        setSource(1);
        setTempZipPath(dDResource.getLocalPath());
        setTempZipBundleVersion(dDResource.getVersion());
        this.hotFixFile = null;
        f.d(">>>DynLoader updateStatic, tempPath: " + this.tempPath);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements Cloneable {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a93592f4edcd2cd9f3ef51cce1fd0f5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a93592f4edcd2cd9f3ef51cce1fd0f5");
            }
            return "HotFixFile{bundleVersion='" + this.b + "', md5='" + this.c + "', originMd5='" + this.d + "'}";
        }
    }
}
