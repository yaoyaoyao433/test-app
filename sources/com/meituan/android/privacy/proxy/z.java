package com.meituan.android.privacy.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
    public static ChangeQuickRedirect a = null;
    public static String b = "c_audio";
    public static String c = "c_camera";
    public static String d = "c_media";

    public static boolean a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cb1553166a671b26257522fa2126e48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cb1553166a671b26257522fa2126e48")).booleanValue();
        }
        int[] iArr = {0};
        boolean a2 = y.a(str, str2, iArr);
        com.meituan.android.privacy.interfaces.monitor.b bVar = com.meituan.android.privacy.interfaces.monitor.c.a;
        if (bVar != null) {
            com.meituan.android.privacy.interfaces.monitor.d dVar = new com.meituan.android.privacy.interfaces.monitor.d();
            dVar.b = "callAPI";
            dVar.c = str2;
            dVar.d = str;
            dVar.e = iArr[0];
            dVar.f = !com.meituan.android.privacy.impl.a.c();
            dVar.k = str3;
            dVar.m = a2 ? "Called" : "NotCalled";
            dVar.o = true;
            bVar.a(dVar);
        }
        return a2;
    }
}
