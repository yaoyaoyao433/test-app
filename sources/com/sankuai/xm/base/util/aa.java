package com.sankuai.xm.base.util;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class aa {
    public static ChangeQuickRedirect a;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d93814014afe85dbb81757282bd2e332", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d93814014afe85dbb81757282bd2e332");
        }
        try {
            return Environment.getExternalStorageState();
        } catch (Exception e) {
            com.sankuai.xm.log.c.a("StorageSettingsUtils", e);
            if (Build.VERSION.SDK_INT <= 29) {
                return b(context);
            }
            return null;
        }
    }

    private static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3090773c0b8b357030ad3b144bda00e7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3090773c0b8b357030ad3b144bda00e7");
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = storageManager.getClass().getMethod("getVolumeState", String.class);
            Method method3 = Class.forName("android.os.storage.StorageVolume").getMethod("getPath", new Class[0]);
            Object[] objArr2 = (Object[]) method.invoke(storageManager, new Object[0]);
            if (objArr2 == null || objArr2.length <= 0) {
                return null;
            }
            return (String) method2.invoke(storageManager, (String) method3.invoke(objArr2[0], new Object[0]));
        } catch (Throwable unused) {
            return null;
        }
    }
}
