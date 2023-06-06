package com.meituan.android.loader.impl;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static boolean a(File file) {
        boolean z = true;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb8307467cc7c86b84c39fafdd211596", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb8307467cc7c86b84c39fafdd211596")).booleanValue();
        }
        if (file == null || !file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z2 = true;
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z2 &= a(file2);
                }
                if (!file2.delete()) {
                    z2 = false;
                }
            }
            z = z2;
        }
        return file.delete() & z;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bafd8a252b175eaa879af13d6aa5a24c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bafd8a252b175eaa879af13d6aa5a24c")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory()) {
                return a(file);
            }
            return file.delete();
        }
        return false;
    }
}
