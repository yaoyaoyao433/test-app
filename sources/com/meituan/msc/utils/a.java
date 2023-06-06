package com.meituan.msc.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26ea2ccdf7b57b2dabc2e0fb24ed967e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26ea2ccdf7b57b2dabc2e0fb24ed967e")).booleanValue();
        }
        if (uri != null && "file".equals(uri.getScheme())) {
            String path = uri.getPath();
            Object[] objArr2 = {path};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "376360b81b710472125ee0dae89a7151", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "376360b81b710472125ee0dae89a7151")).booleanValue();
            }
            if (TextUtils.isEmpty(path) || new File(path).exists()) {
                return false;
            }
            return path.contains(MRNBundleManager.DIO_BUNDLE_SUFFIX);
        }
        return false;
    }

    public static DioFile b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70931f57660e4a2102757061ab7fc02b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70931f57660e4a2102757061ab7fc02b");
        }
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        Object[] objArr2 = {path};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d021ae99e8a898134033b280c122a7b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d021ae99e8a898134033b280c122a7b3");
        }
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        return new DioFile(path);
    }
}
