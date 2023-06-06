package com.meituan.android.common.badge.log;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DefaultLogger implements Logger {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.badge.log.Logger
    public void debug(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fe4c810a2f935d938938c90cfdc1d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fe4c810a2f935d938938c90cfdc1d05");
        }
    }

    @Override // com.meituan.android.common.badge.log.Logger
    public void verbose(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36270949455453b76639e388285fe6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36270949455453b76639e388285fe6a9");
        }
    }

    @Override // com.meituan.android.common.badge.log.Logger
    public void warn(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f780d379e2bab0a0b2bb26a1b7d0d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f780d379e2bab0a0b2bb26a1b7d0d52");
        }
    }

    @Override // com.meituan.android.common.badge.log.Logger
    public void error(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20ec40b3de43e35d4289f401d768b9ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20ec40b3de43e35d4289f401d768b9ce");
        } else {
            Log.e(str, str2);
        }
    }

    @Override // com.meituan.android.common.badge.log.Logger
    public void error(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f6dd7eb49fce018a2936d5b8b5f2b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f6dd7eb49fce018a2936d5b8b5f2b61");
        } else {
            Log.e(str, str2, th);
        }
    }
}
