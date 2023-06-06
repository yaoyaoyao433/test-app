package com.meituan.android.common.mrn.analytics.library;

import android.text.TextUtils;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureInfoMrnCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static ExposureInfoMrnCache mInstance;
    public Map<ExposureInfoId, ExposureInfo> mInfoMap;

    public ExposureInfoMrnCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb5f367b857765ce4e2b193f5134ed5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb5f367b857765ce4e2b193f5134ed5");
        } else {
            this.mInfoMap = new ConcurrentHashMap();
        }
    }

    public static ExposureInfoMrnCache getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "506091bf477a25c4babe931789280473", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExposureInfoMrnCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "506091bf477a25c4babe931789280473");
        }
        if (mInstance == null) {
            synchronized (ExposureInfoMrnCache.class) {
                if (mInstance == null) {
                    mInstance = new ExposureInfoMrnCache();
                }
            }
        }
        return mInstance;
    }

    public void addExposureInfo(String str, String str2, ExposureInfo exposureInfo) {
        Object[] objArr = {str, str2, exposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ada6c5e3ec21a74cfc6396efceaeff15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ada6c5e3ec21a74cfc6396efceaeff15");
        } else {
            this.mInfoMap.put(new ExposureInfoId(str, str2), exposureInfo);
        }
    }

    public ExposureInfo getExposureInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c3d794894553176cc56429719852311", RobustBitConfig.DEFAULT_VALUE) ? (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c3d794894553176cc56429719852311") : this.mInfoMap.get(new ExposureInfoId(str, str2));
    }

    public void removeExposureInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33c430bcbad749dd9b47b60c2a678e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33c430bcbad749dd9b47b60c2a678e7b");
        } else {
            this.mInfoMap.remove(new ExposureInfoId(str, str2));
        }
    }

    public void clearCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba88600e20e6bd8a32a527a3a89da1cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba88600e20e6bd8a32a527a3a89da1cc");
            return;
        }
        Iterator<Map.Entry<ExposureInfoId, ExposureInfo>> it = this.mInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            ExposureInfoId key = it.next().getKey();
            if (key != null && TextUtils.equals(key.containerId, str)) {
                it.remove();
            }
        }
    }
}
