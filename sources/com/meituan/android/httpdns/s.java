package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum s {
    NET_2G,
    NET_3G,
    NET_4G,
    NET_5G,
    NET_WIFI,
    NET_UNKNOWN;
    
    public static ChangeQuickRedirect a;

    s() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a6ad965347f6f7b5c4cd19a529e5c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a6ad965347f6f7b5c4cd19a529e5c4");
        }
    }

    public static s valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8de4d56518e5cfc30203c7e82b3ea5cb", 6917529027641081856L) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8de4d56518e5cfc30203c7e82b3ea5cb") : (s) Enum.valueOf(s.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static s[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca89d77aff34b9b2f1067c3301418c52", 6917529027641081856L) ? (s[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca89d77aff34b9b2f1067c3301418c52") : (s[]) values().clone();
    }
}
