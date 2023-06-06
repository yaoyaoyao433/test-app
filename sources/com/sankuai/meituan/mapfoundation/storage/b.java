package com.sankuai.meituan.mapfoundation.storage;

import android.content.SharedPreferences;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static File a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26f41c60aae13b0958661f7edd7c6cd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26f41c60aae13b0958661f7edd7c6cd2");
        }
        File a2 = a(str, false);
        if (a2 == null) {
            return null;
        }
        File file = new File(a2, str2);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return file;
    }

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c46808c8ad5d51b3e2caf0d6c6a0675a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c46808c8ad5d51b3e2caf0d6c6a0675a")).booleanValue();
        }
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    public static File a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbbc1a0ddd0d92abc82472972e894243", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbbc1a0ddd0d92abc82472972e894243");
        }
        if (com.sankuai.meituan.mapfoundation.base.a.b == null) {
            return null;
        }
        File a2 = q.a(com.sankuai.meituan.mapfoundation.base.a.b, str, "", z ? u.c : u.e);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    public static SharedPreferences a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d1c926825a8835403fce9d54f4b159a", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d1c926825a8835403fce9d54f4b159a");
        }
        if (com.sankuai.meituan.mapfoundation.base.a.b == null) {
            return null;
        }
        return q.a(com.sankuai.meituan.mapfoundation.base.a.b, str, 2).a();
    }
}
