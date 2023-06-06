package com.meituan.android.mrn.update;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ResponseBundle implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public BundleDiff diff;
    public String id;
    public boolean isMetaType;
    public String md5;
    public List<ResponseBundle> meta;
    public String name;
    public int sequence;
    public List<String> tagList;
    public String tags;
    public String url;
    public String version;
    public String zipMd5;

    public ResponseBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d442b55b0be13fd96f8cd834c45063a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d442b55b0be13fd96f8cd834c45063a");
        } else {
            this.isMetaType = false;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class BundleDiff implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String md5;
        public final String oldVersion;
        public final String url;

        public BundleDiff(String str, String str2, String str3) {
            this.oldVersion = str;
            this.url = str2;
            this.md5 = str3;
        }
    }

    public boolean hasDiff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "445bb33d8fc08b9d33b68d9b3083f1a3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "445bb33d8fc08b9d33b68d9b3083f1a3")).booleanValue() : (this.diff == null || TextUtils.isEmpty(this.diff.oldVersion) || TextUtils.isEmpty(this.diff.url) || TextUtils.isEmpty(this.diff.md5)) ? false : true;
    }

    public String getUrl(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12ed26dda39e64b0a491fb912cdbcf92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12ed26dda39e64b0a491fb912cdbcf92");
        }
        switch (fVar) {
            case DIFF:
                if (hasDiff()) {
                    return this.diff.url;
                }
                return null;
            case WHOLE:
                return this.url;
            default:
                return null;
        }
    }

    public String getHash(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f24c5a070e818483cc9565b37e99366f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f24c5a070e818483cc9565b37e99366f");
        }
        switch (fVar) {
            case DIFF:
                if (hasDiff()) {
                    return this.diff.md5;
                }
                return null;
            case WHOLE:
                return this.zipMd5;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5129f903196ea17f60c5db10fd71dbe1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5129f903196ea17f60c5db10fd71dbe1")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseBundle responseBundle = (ResponseBundle) obj;
        if (this.name == null ? responseBundle.name == null : this.name.equals(responseBundle.name)) {
            return this.version != null ? this.version.equals(responseBundle.version) : responseBundle.version == null;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dfeea4c6288473eb8ca56d537b97d0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dfeea4c6288473eb8ca56d537b97d0c")).intValue();
        }
        return ((this.name != null ? this.name.hashCode() : 0) * 31) + (this.version != null ? this.version.hashCode() : 0);
    }

    public String getShortBundleInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8bdec603436bc82cd32a267e6b62592", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8bdec603436bc82cd32a267e6b62592");
        }
        return this.name + CommonConstant.Symbol.UNDERLINE + this.version;
    }

    public String getUniqueKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d87a94843026d56a78a826a41802fba7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d87a94843026d56a78a826a41802fba7") : getShortBundleInfo();
    }
}
