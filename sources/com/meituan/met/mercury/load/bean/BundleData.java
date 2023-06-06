package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class BundleData implements Cloneable {
    public static final int MODE_RAW = 0;
    public static final int MODE_XZIP = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bundleName;
    private String bundleVersion;
    public Diff diff;
    public String md5;
    public int mode;
    public int noVersion;
    private String originMd5;
    public long producedTimeMillis;
    public String tags;
    public String type;
    public String url;
    public Xzip xzip;

    public void setMd5ToVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "988dd2cb4c8979440bd0dcdc679a32a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "988dd2cb4c8979440bd0dcdc679a32a7");
        } else if (TextUtils.isEmpty(this.bundleVersion)) {
            this.bundleVersion = this.md5;
            this.noVersion = 1;
        }
    }

    public String getBundleVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4db1fef450243e2598128e4075b3aa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4db1fef450243e2598128e4075b3aa4");
        }
        if (TextUtils.isEmpty(this.bundleVersion)) {
            this.bundleVersion = this.md5;
            this.noVersion = 1;
        }
        return this.bundleVersion;
    }

    public String getUrl() {
        return this.url;
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public String getOriginMd5() {
        return this.originMd5;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getTags() {
        return this.tags;
    }

    public String getType() {
        return this.type;
    }

    public Diff getDiff() {
        return this.diff;
    }

    public Xzip getXzip() {
        return this.xzip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Xzip {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String md5;
        public String url;

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84964939e58e21c0a8b90cbd7277322e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84964939e58e21c0a8b90cbd7277322e");
            }
            return "Xzip{url='" + this.url + "', md5='" + this.md5 + "'}";
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Diff {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String diffMd5;
        public String diffUrl;
        public String oldMd5;

        public String getDiffMd5() {
            return this.diffMd5;
        }

        public String getDiffUrl() {
            return this.diffUrl;
        }

        public String getOldMd5() {
            return this.oldMd5;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f24e3f163e40c3b8d8b6eef40aaba346", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f24e3f163e40c3b8d8b6eef40aaba346");
            }
            return "Diff{oldMd5='" + this.oldMd5 + "', diffUrl='" + this.diffUrl + "', diffMd5='" + this.diffMd5 + "'}";
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c236391c4a8d727ce7498a3490136664", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c236391c4a8d727ce7498a3490136664");
        }
        return "BundleData{bundleName='" + this.bundleName + "', bundleVersion='" + this.bundleVersion + "', originMd5='" + this.originMd5 + "', md5='" + this.md5 + "', tags='" + this.tags + "', url='" + this.url + "', mode=" + this.mode + ", xzip=" + this.xzip + ", diff=" + this.diff + ", type='" + this.type + "', noVersion=" + this.noVersion + ", producedTimeMillis=" + this.producedTimeMillis + '}';
    }

    /* renamed from: clone */
    public BundleData m9clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ece7c6c538c9c455bdc781407851affe", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ece7c6c538c9c455bdc781407851affe");
        }
        try {
            return (BundleData) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
