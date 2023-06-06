package com.sankuai.xm.network.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum e {
    ENV_RELEASE,
    ENV_STAGING,
    ENV_TEST;
    
    public static ChangeQuickRedirect a;

    e() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8e0b9737f3b399e288133b86b0c8f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8e0b9737f3b399e288133b86b0c8f7");
        }
    }

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "feadc746bd49bec84e58d552ad824f96", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "feadc746bd49bec84e58d552ad824f96") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31cf4fe06170c54073d9efd95c2e9b7c", 6917529027641081856L) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31cf4fe06170c54073d9efd95c2e9b7c") : (e[]) values().clone();
    }
}
