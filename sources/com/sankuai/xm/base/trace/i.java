package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum i {
    begin,
    beginNormal,
    normal,
    recv,
    send,
    collect,
    end;
    
    public static ChangeQuickRedirect a;

    i() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea6439482519c6038781f9f83bd16a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea6439482519c6038781f9f83bd16a4");
        }
    }

    public static i valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7665621efd50131f816b6691b60cb32c", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7665621efd50131f816b6691b60cb32c") : (i) Enum.valueOf(i.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83bf5742a8289ec25005f4b02eee0cc3", 6917529027641081856L) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83bf5742a8289ec25005f4b02eee0cc3") : (i[]) values().clone();
    }
}
