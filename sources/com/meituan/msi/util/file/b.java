package com.meituan.msi.util.file;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static boolean a(File file, com.meituan.msi.provider.a aVar) {
        Object[] objArr = {file, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8379ae493c6cb6cd4faa08e9c0634cbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8379ae493c6cb6cd4faa08e9c0634cbc")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            if (a(file, aVar.a().getCanonicalFile()) || a(file, new File(aVar.c()).getCanonicalFile())) {
                return true;
            }
            return a(file, new File(aVar.b()).getCanonicalFile());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, com.meituan.msi.provider.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7166eda15857f81a925cc44dbc73ebc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7166eda15857f81a925cc44dbc73ebc")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return a(new File(str).getCanonicalFile(), aVar);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, File file) {
        Object[] objArr = {str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb8b8678ada0b2105fa6850fba2d3aeb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb8b8678ada0b2105fa6850fba2d3aeb")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return a(new File(str).getCanonicalFile(), file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04a8ffa8e9825e5c4447b7eea5b9bb8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04a8ffa8e9825e5c4447b7eea5b9bb8e")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return a(new File(str).getCanonicalFile(), new File(str2).getCanonicalFile());
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean a(File file, File file2) {
        while (true) {
            Object[] objArr = {file, file2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb36877699a73154dce8f9d38bf6e7a3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb36877699a73154dce8f9d38bf6e7a3")).booleanValue();
            }
            if (file == null) {
                return false;
            }
            if (file2.equals(file)) {
                return true;
            }
            file = file.getParentFile();
        }
    }
}
