package com.meituan.met.mercury.load.core;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class DDResource implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String business;
    private int deleteState;
    private transient int existsIsNew;
    private long fileSize;
    private transient boolean hitMetaCache;
    private transient boolean isFromNet;
    private int isNewest;
    private long lastUseMillis;
    private String localPath;
    private String md5;
    private int mode;
    private String name;
    private int noVersion;
    private String originMd5;
    private int preload;
    private String preloadFileMd5;
    private String tags;
    private String url;
    private String version;

    public DDResource() {
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07cffe0eada7863f73b23d68dd53b39e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07cffe0eada7863f73b23d68dd53b39e")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DDResource) {
            DDResource dDResource = (DDResource) obj;
            return this.mode == dDResource.mode && this.isNewest == dDResource.isNewest && this.deleteState == dDResource.deleteState && this.business.equals(dDResource.business) && Objects.equals(this.name, dDResource.name) && Objects.equals(this.version, dDResource.version) && Objects.equals(this.md5, dDResource.md5) && Objects.equals(this.tags, dDResource.tags) && Objects.equals(this.url, dDResource.url) && Objects.equals(this.localPath, dDResource.localPath) && this.lastUseMillis == dDResource.lastUseMillis && Objects.equals(this.originMd5, dDResource.originMd5) && this.noVersion == dDResource.noVersion && this.fileSize == dDResource.fileSize && this.preload == dDResource.preload && TextUtils.equals(this.preloadFileMd5, dDResource.preloadFileMd5);
        }
        return false;
    }

    public String getBusiness() {
        return this.business;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getTags() {
        return this.tags;
    }

    public String getUrl() {
        return this.url;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public int getIsExistsIsNew() {
        return this.existsIsNew;
    }

    public void setIsExistsIsNew(int i) {
        this.existsIsNew = i;
    }

    public String getOriginMd5() {
        return this.originMd5;
    }

    public int getMode() {
        return this.mode;
    }

    public int getIsNewest() {
        return this.isNewest;
    }

    public int getDeleteState() {
        return this.deleteState;
    }

    public boolean isFromNet() {
        return this.isFromNet;
    }

    public void setFromNet(boolean z) {
        this.isFromNet = z;
    }

    public boolean isHitMetaCache() {
        return this.hitMetaCache;
    }

    public void setHitMetaCache(boolean z) {
        this.hitMetaCache = z;
    }

    public boolean isPreset() {
        return this.mode == 10 || this.mode == 11;
    }

    public boolean isDefaultPreset() {
        return this.mode == 10;
    }

    @Nullable
    public InputStream getInputStream() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d5191581336054339c6c3c8ab3ae64b", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d5191581336054339c6c3c8ab3ae64b");
        }
        if (TextUtils.isEmpty(this.localPath)) {
            return null;
        }
        try {
            if (isDefaultPreset()) {
                return getDefaultPresetStream();
            }
            return new FileInputStream(this.localPath);
        } catch (Exception e) {
            e.printStackTrace();
            com.meituan.met.mercury.load.report.d.a("DDResource", "getInputStream", e);
            return null;
        }
    }

    private InputStream getDefaultPresetStream() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9276e98dde1f0b1e53c2631ce5aca760", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9276e98dde1f0b1e53c2631ce5aca760");
        }
        if (isDefaultPreset()) {
            try {
                return e.b().getAssets().open(this.localPath);
            } catch (IOException e) {
                e.printStackTrace();
                com.meituan.met.mercury.load.report.d.a("DDResource", "getDefaultPresetStream", e);
                return null;
            }
        }
        return null;
    }

    public boolean isLocalCacheValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9a73f204a6b0c0504298f5dfd17ae64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9a73f204a6b0c0504298f5dfd17ae64")).booleanValue();
        }
        if (this.preload > 0) {
            return com.meituan.met.mercury.load.utils.e.a(getInputStream(), this.preloadFileMd5);
        }
        return com.meituan.met.mercury.load.utils.e.a(getInputStream(), this.md5);
    }

    public boolean localFileExists() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c5e92cce1fdb5b3b4c5f2485749fbba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c5e92cce1fdb5b3b4c5f2485749fbba")).booleanValue();
        }
        if (TextUtils.isEmpty(this.localPath)) {
            return false;
        }
        if (isDefaultPreset()) {
            return true;
        }
        return new File(this.localPath).exists();
    }

    public void markVisited() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1281c40ae70cdf88626eb3cdcccf1d70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1281c40ae70cdf88626eb3cdcccf1d70");
            return;
        }
        File file = new File(this.localPath);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public long getLastUseMillis() {
        return this.lastUseMillis;
    }

    public void refreshLastUseMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfd52ff6c588c0196c6ba714dc443123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfd52ff6c588c0196c6ba714dc443123");
        } else {
            this.lastUseMillis = System.currentTimeMillis();
        }
    }

    public boolean cacheIsInvalid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b6202dd2150c7b0bd8ebfec3a7c676f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b6202dd2150c7b0bd8ebfec3a7c676f")).booleanValue();
        }
        return this.lastUseMillis != 0 && ((long) c.k) * 86400000 > 0 && System.currentTimeMillis() - this.lastUseMillis > DDLoadConstants.CACHE_INVALID_TIME;
    }

    public boolean processProctect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f0c1db4ddc4cdf97b0dc656d25172a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f0c1db4ddc4cdf97b0dc656d25172a0")).booleanValue() : this.lastUseMillis == 0 || System.currentTimeMillis() - this.lastUseMillis > DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME;
    }

    public void setIsNewest(int i) {
        this.isNewest = i;
    }

    public void setDeleteState(int i) {
        this.deleteState = i;
    }

    public int getNoVersion() {
        return this.noVersion;
    }

    public void setFileSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d71ba411469dc45b97d2adca1c5be51e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d71ba411469dc45b97d2adca1c5be51e");
        } else {
            this.fileSize = j;
        }
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public int getPreload() {
        return this.preload;
    }

    public String getPreloadFileMd5() {
        return this.preloadFileMd5;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fef2be4d80909942524f94e907ea6cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fef2be4d80909942524f94e907ea6cb")).intValue() : Objects.hash(this.business, this.name, this.version, this.md5);
    }

    /* renamed from: clone */
    public DDResource m10clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf3df455386a78bbd09755265791ec1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResource) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf3df455386a78bbd09755265791ec1e");
        }
        try {
            return (DDResource) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            com.meituan.met.mercury.load.report.d.a("DDResource", "clone", e);
            return null;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c2dec6bf70359c897a0db716ec1a06", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c2dec6bf70359c897a0db716ec1a06");
        }
        return "DDResource{business='" + this.business + "', name='" + this.name + "', version='" + this.version + "', md5='" + this.md5 + "', tags='" + this.tags + "', url='" + this.url + "', localPath='" + this.localPath + "', mode=" + this.mode + ", isNewest=" + this.isNewest + ", deleteState=" + this.deleteState + ", noVersion=" + this.noVersion + ", lastUseMillis=" + this.lastUseMillis + ", originMd5='" + this.originMd5 + "', fileSize=" + this.fileSize + ", preload=" + this.preload + ", preloadFileMd5='" + this.preloadFileMd5 + "', isFromNet=" + this.isFromNet + ", existsIsNew=" + this.existsIsNew + ", hitMetaCache=" + this.hitMetaCache + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public int i;
        int j;
        public boolean k;
        public int l;
        public String m;
        public int n;
        public String o;
        private int p;
        private long q;

        public final DDResource a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9096291743592ed42411fe959c5bba43", RobustBitConfig.DEFAULT_VALUE)) {
                return (DDResource) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9096291743592ed42411fe959c5bba43");
            }
            DDResource dDResource = new DDResource();
            dDResource.business = this.b;
            dDResource.localPath = this.h;
            dDResource.deleteState = this.p;
            dDResource.version = this.d;
            dDResource.md5 = this.e;
            dDResource.url = this.g;
            dDResource.tags = this.f;
            dDResource.name = this.c;
            dDResource.isNewest = this.j;
            dDResource.isFromNet = this.k;
            dDResource.mode = this.i;
            dDResource.noVersion = this.l;
            dDResource.originMd5 = this.m;
            dDResource.fileSize = this.q;
            dDResource.preload = this.n;
            dDResource.preloadFileMd5 = this.o;
            return dDResource;
        }
    }
}
