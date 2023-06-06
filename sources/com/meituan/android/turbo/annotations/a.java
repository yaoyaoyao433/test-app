package com.meituan.android.turbo.annotations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    TO_JSON,
    FROM_JSON_READER,
    FROM_JSON_ELEMENT;
    
    public static ChangeQuickRedirect a;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a44c8e4588cd726a3ef5fade8955b73", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a44c8e4588cd726a3ef5fade8955b73") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5648b4323bf92bfda19b156aa2f5e16d", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5648b4323bf92bfda19b156aa2f5e16d") : (a[]) values().clone();
    }

    a() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49dbe15fd4bf8c895dbf82c0fab616e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49dbe15fd4bf8c895dbf82c0fab616e8");
        }
    }
}
