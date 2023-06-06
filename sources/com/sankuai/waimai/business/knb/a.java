package com.sankuai.waimai.business.knb;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.Abi64TitansCompat;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SharedPreferences a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d7edf74fc3c0d38ed94374a881ffeea", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d7edf74fc3c0d38ed94374a881ffeea") : q.a(context, "delete_webview_gpu_cache").a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(@NonNull File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a638297dda5b6b316a63b03b6e32b5a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a638297dda5b6b316a63b03b6e32b5a4")).booleanValue();
        }
        if (file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        boolean z = !file.exists() || file.delete();
        String str = "delete isSuccessDelete: " + z + " fileName: " + file;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e55be5c5babce74777a610c896c991bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e55be5c5babce74777a610c896c991bf");
        } else {
            System.out.println("Abi64WebViewCompat:" + str);
            com.dianping.networklog.c.a(str, 35, new String[]{Abi64TitansCompat.TAG});
        }
        return z;
    }
}
