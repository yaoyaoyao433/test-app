package com.meituan.android.cipstorage;

import com.meituan.android.cipstorage.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class CIPSBusinessCleaner {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public void onCleanExpiredCacheOver(String str, long j) {
    }

    @Deprecated
    public void onCleanExpiredCacheStart(String str, long j) {
    }

    @Deprecated
    public void onClearCacheOver(String str) {
    }

    @Deprecated
    public void onClearCacheStart(String str) {
    }

    @Deprecated
    public void onClearDataOver(String str) {
    }

    @Deprecated
    public void onClearDataStart(String str) {
    }

    @Deprecated
    public void onConfigExceed(String str, long j) {
    }

    @Deprecated
    public void onStorageExceed(String str, long j) {
    }

    public void onConfigExceed(String str, af.a aVar, long j, long j2) {
        Object[] objArr = {str, aVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0ce9419018340df46a0ec8625190683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0ce9419018340df46a0ec8625190683");
        } else {
            onConfigExceed(str, j2);
        }
    }

    public void onStorageExceed(String str, af.a aVar, long j) {
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21dd9493ee287a9936c9f97a42612d8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21dd9493ee287a9936c9f97a42612d8f");
        } else {
            onStorageExceed(str, j);
        }
    }

    public void onCleanExpiredCacheStart(String str, af.a aVar, long j) {
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c0e29de6ade72c488c2eaac1e0738c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c0e29de6ade72c488c2eaac1e0738c");
        } else {
            onCleanExpiredCacheStart(str, j);
        }
    }

    public void onCleanExpiredCacheOver(String str, af.a aVar, long j) {
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e209ae8037cbcec8d63011dc8cf143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e209ae8037cbcec8d63011dc8cf143");
        } else {
            onCleanExpiredCacheOver(str, j);
        }
    }

    public void onClearCacheStart(String str, af.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d80f6d5a5e68be280e44b7c4d252be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d80f6d5a5e68be280e44b7c4d252be");
        } else {
            onClearCacheStart(str);
        }
    }

    public void onClearCacheOver(String str, af.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31e44f7c3d9c14eb1586caadfb827b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31e44f7c3d9c14eb1586caadfb827b8");
        } else {
            onClearCacheOver(str);
        }
    }

    public void onClearDataStart(String str, af.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a836e046f43635b1124e4d505726e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a836e046f43635b1124e4d505726e10");
        } else {
            onClearDataStart(str);
        }
    }

    public void onClearDataOver(String str, af.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c93a9a5aa4e52a593daf42cef14fe70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c93a9a5aa4e52a593daf42cef14fe70d");
        } else {
            onClearDataOver(str);
        }
    }
}
