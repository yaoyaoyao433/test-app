package com.meituan.android.common.statistics.exposure;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureInfoCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile ExposureInfoCache mInstance;
    public ConcurrentHashMap<String, Object> mInfoMap;

    public ExposureInfoCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c5f560d21d58641cce4f8c12d7d7e89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c5f560d21d58641cce4f8c12d7d7e89");
        } else {
            this.mInfoMap = new ConcurrentHashMap<>();
        }
    }

    public static ExposureInfoCache getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0101ae4cbf8428d89773a1263fbbf65a", 6917529027641081856L)) {
            return (ExposureInfoCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0101ae4cbf8428d89773a1263fbbf65a");
        }
        if (mInstance == null) {
            synchronized (ExposureInfoCache.class) {
                if (mInstance == null) {
                    mInstance = new ExposureInfoCache();
                }
            }
        }
        return mInstance;
    }

    public void addExposureInfo(String str, ExposureInfo exposureInfo) {
        Object[] objArr = {str, exposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2f5ff73d108353df93865206dc28ecf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2f5ff73d108353df93865206dc28ecf");
        } else {
            this.mInfoMap.put(str, exposureInfo);
        }
    }

    public void addExposureInfo(String str, SoftReference<ExposureInfo> softReference) {
        Object[] objArr = {str, softReference};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff9bfe617bfc4dfde7529148443037f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff9bfe617bfc4dfde7529148443037f5");
        } else {
            this.mInfoMap.put(str, softReference);
        }
    }

    public ExposureInfo getExposureInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dd10e22f022166963d4a568641ac860", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dd10e22f022166963d4a568641ac860");
        }
        Object obj = this.mInfoMap.get(str);
        if (obj != null) {
            if (obj instanceof SoftReference) {
                return (ExposureInfo) ((SoftReference) obj).get();
            }
            return (ExposureInfo) obj;
        }
        return null;
    }

    public void removeExposureInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3a8f3eae8b8c448e0d123faf5a7c48c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3a8f3eae8b8c448e0d123faf5a7c48c");
        } else {
            this.mInfoMap.remove(str);
        }
    }

    public void removeSoftRefExposureInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5ec2178eeb05bfa725cc28b924a0ddf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5ec2178eeb05bfa725cc28b924a0ddf");
            return;
        }
        Object obj = this.mInfoMap.get(str);
        if (obj == null || !(obj instanceof SoftReference)) {
            return;
        }
        this.mInfoMap.remove(str);
    }

    public void updateExposureInfo(String str, String str2, String str3, String str4, String str5) {
        ExposureInfo exposureInfo;
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7dd1ae1c0b7e6169323e0b8bbca6171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7dd1ae1c0b7e6169323e0b8bbca6171");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (exposureInfo = getExposureInfo(str)) == null) {
        } else {
            exposureInfo.updateReqId(str2);
            exposureInfo.updateSession(str3);
            exposureInfo.updateCid(str5);
            exposureInfo.updateAppSession(str4);
        }
    }
}
