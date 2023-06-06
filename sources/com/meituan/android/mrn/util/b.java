package com.meituan.android.mrn.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69057cf5ea8c5bd10d275829a8e2cee9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69057cf5ea8c5bd10d275829a8e2cee9")).booleanValue();
        }
        if (uri != null && "file".equals(uri.getScheme())) {
            return a(uri.getPath());
        }
        return false;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69cc0af5b16937e3d55a1d65b64bd80a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69cc0af5b16937e3d55a1d65b64bd80a")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || new File(str).exists()) {
            return false;
        }
        return str.contains("mrn_dio");
    }

    private static String b(String str) {
        int indexOf;
        int indexOf2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61ce8f7541220cc4866aacc8fed25389", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61ce8f7541220cc4866aacc8fed25389");
        }
        if (str == null || !str.contains("mrn_dio") || (indexOf = str.indexOf("/rn_")) < 0 || (indexOf2 = str.indexOf(47, indexOf + 1)) < 0) {
            return str;
        }
        return str.substring(0, indexOf2) + MRNBundleManager.DIO_BUNDLE_SUFFIX + str.substring(indexOf2);
    }

    public static DioFile b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f15cde6e0c6efba282cd5de913e13a94", RobustBitConfig.DEFAULT_VALUE) ? (DioFile) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f15cde6e0c6efba282cd5de913e13a94") : a(uri, true);
    }

    private static DioFile a(Uri uri, boolean z) {
        Object[] objArr = {uri, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "750e3d38f1c2a70fd5fc1b6f36347eb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "750e3d38f1c2a70fd5fc1b6f36347eb8");
        }
        if (uri == null) {
            return null;
        }
        return a(uri.getPath(), true);
    }

    private static DioFile a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4258f8840fae07e2ce4df7ab5c945f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4258f8840fae07e2ce4df7ab5c945f9");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            str = b(str);
        }
        return new DioFile(str);
    }
}
