package com.meituan.msc;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum b {
    WEBVIEW("mp-webview"),
    RN("react-native"),
    NATIVE("mp-native"),
    FLUENT("Fluent");
    
    public static ChangeQuickRedirect a;
    public String f;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de25ea4a207e972e485ed217b567f62b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de25ea4a207e972e485ed217b567f62b") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed958980c92839a2607c55a9eedd411f", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed958980c92839a2607c55a9eedd411f") : (b[]) values().clone();
    }

    b(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b61e29ca8949aea5430688fa3140fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b61e29ca8949aea5430688fa3140fc");
        } else {
            this.f = str;
        }
    }

    public static b a(String str) {
        b[] valuesCustom;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bd9ec1b96b0d475c7b9fbc1187de7be", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bd9ec1b96b0d475c7b9fbc1187de7be");
        }
        for (b bVar : valuesCustom()) {
            if (bVar.f.equalsIgnoreCase(str)) {
                return bVar;
            }
        }
        return null;
    }

    public static String a(@NonNull b bVar) {
        return bVar.f;
    }
}
