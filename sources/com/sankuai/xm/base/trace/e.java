package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum e {
    NORMAL,
    ONLY_FAIL,
    NONE,
    SAMPLE;
    
    public static ChangeQuickRedirect a;

    e() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3fd3c61d890235e8299a3d1d9a0a431", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3fd3c61d890235e8299a3d1d9a0a431");
        }
    }

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b954cd11d34c3b35a6d93071d64ac97c", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b954cd11d34c3b35a6d93071d64ac97c") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d79585cda668d8014b92ba3d1695610", 6917529027641081856L) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d79585cda668d8014b92ba3d1695610") : (e[]) values().clone();
    }
}
