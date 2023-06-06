package com.dianping.video.util;

import android.content.Context;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String b = "c";

    public static boolean a(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02c710d5286bf286f4aea1ff75e76818", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02c710d5286bf286f4aea1ff75e76818")).booleanValue();
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "13ab06f77713eca0ffd05835f75ab5e0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "13ab06f77713eca0ffd05835f75ab5e0")).booleanValue();
        } else if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            return false;
        }
        return new File(str).exists();
    }

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49d807db0f5172aaf9bc4ed21786a368", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49d807db0f5172aaf9bc4ed21786a368");
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (-1 != read) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    return sb.toString().replaceAll("\\r\\n", "\n");
                }
            }
        } catch (Exception unused) {
            String str2 = b;
            Log.e(str2, "getAssetString failed " + str);
            return "";
        }
    }
}
