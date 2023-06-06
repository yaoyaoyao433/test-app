package com.sankuai.xm.base.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static Object[] a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a7453e827096694f14493cd87fce199", 6917529027641081856L) ? (Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a7453e827096694f14493cd87fce199") : new Object[]{obj};
    }

    public static Object[] a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "465ec987f480e5bd88844a92ec93cf4d", 6917529027641081856L) ? (Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "465ec987f480e5bd88844a92ec93cf4d") : new Object[]{obj, obj2};
    }
}
