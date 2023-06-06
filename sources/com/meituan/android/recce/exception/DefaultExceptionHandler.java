package com.meituan.android.recce.exception;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DefaultExceptionHandler implements RecceExceptionHandler {
    private static final String TAG = "RecceExceptionHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.recce.exception.RecceExceptionHandler
    public void handleException(int i, String str, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da5d17d31a936bb620aac44246bae5fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da5d17d31a936bb620aac44246bae5fc");
            return;
        }
        Log.e(TAG, "errorCode: " + i + " errorName: " + str);
        if (th != null) {
            th.printStackTrace();
        }
    }
}
