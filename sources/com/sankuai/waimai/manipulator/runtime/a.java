package com.sankuai.waimai.manipulator.runtime;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    public boolean b;
    public T c;

    private a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac603acf29cef355e8d7bd831d5f2d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac603acf29cef355e8d7bd831d5f2d5");
        } else {
            this.b = true;
        }
    }

    private a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099ffe0c4b683b57187975c054cc73b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099ffe0c4b683b57187975c054cc73b2");
            return;
        }
        this.c = t;
        this.b = false;
    }

    public static <T> a<T> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8eb2dd6220eef9dece119a5c8ee9cea1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8eb2dd6220eef9dece119a5c8ee9cea1") : new a<>(true);
    }

    public static <T> a<T> a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5238442a64de3fd1f31e8047927b9de8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5238442a64de3fd1f31e8047927b9de8") : new a<>(t);
    }
}
