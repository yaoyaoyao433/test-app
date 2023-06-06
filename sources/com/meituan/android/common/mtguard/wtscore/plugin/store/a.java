package com.meituan.android.common.mtguard.wtscore.plugin.store;

import android.text.TextUtils;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static Boolean a(String str, byte[] bArr, String str2) {
        Object[] objArr = {str, bArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a67526ad94f5ad044358b502b0cb018", 6917529027641081856L)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a67526ad94f5ad044358b502b0cb018");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || bArr == null) {
            return Boolean.FALSE;
        }
        Object[] main3 = NBridge.main3(32, new Object[]{str, str2, bArr});
        if (main3 == null) {
            MTGuardLog.setErrorLogan(new RuntimeException("enc store failed"));
            return Boolean.FALSE;
        } else if (main3[0] instanceof Integer) {
            MTGuardLog.setErrorLogan(new RuntimeException("enc save failed error: " + main3[0]));
            return Boolean.FALSE;
        } else {
            return (Boolean) main3[0];
        }
    }

    private static byte[] a(String str, String str2) {
        Object[] main3;
        Object obj;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29509777a7c4cabcd7b6192f4f585aef", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29509777a7c4cabcd7b6192f4f585aef");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (main3 = NBridge.main3(33, new Object[]{str, str2})) == null) {
            return null;
        } else {
            if (main3[0] instanceof Integer) {
                MTGuardLog.setErrorLogan(new RuntimeException("enc load failed errno: " + main3[0]));
                return null;
            }
            obj = main3[0];
        }
        return (byte[]) obj;
    }
}
