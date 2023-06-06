package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum ab {
    ERROR_CODE_DEFAULT(0),
    ERROR_CODE_CREATE_INSTANCE_FAIL(1),
    ERROR_CODE_SO_LOAD_FAIL(2),
    ERROR_CODE_LOAD_BUNDLE_FAIL(3),
    ERROR_CODE_RUNTIME_JS_EXCEPTION(4),
    ERROR_CODE_RENDER_VIEW_EXCEPTION(5);
    
    public static ChangeQuickRedirect a;
    private final int h;

    public static ab valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d1db311c0e0d09fc20f862b9fbc9c1e", RobustBitConfig.DEFAULT_VALUE) ? (ab) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d1db311c0e0d09fc20f862b9fbc9c1e") : (ab) Enum.valueOf(ab.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ab[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d292db60f6a62e964f9f86bffae65d4", RobustBitConfig.DEFAULT_VALUE) ? (ab[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d292db60f6a62e964f9f86bffae65d4") : (ab[]) values().clone();
    }

    ab(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f02b8cced9f3004abde9ef74e314492", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f02b8cced9f3004abde9ef74e314492");
        } else {
            this.h = i2;
        }
    }

    public final int a() {
        return this.h;
    }
}
