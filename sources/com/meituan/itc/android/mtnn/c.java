package com.meituan.itc.android.mtnn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum c {
    FORWARD_CPU(0),
    FORWARD_OPENCL(3),
    FORWARD_AUTO(4),
    FORWARD_OPENGL(6),
    FORWARD_VULKAN(7);
    
    public static ChangeQuickRedirect a;
    public int g;

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ca973081f376994e5eae147af784074", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ca973081f376994e5eae147af784074") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61ce0cfda6d98d03a9134022da627dc9", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61ce0cfda6d98d03a9134022da627dc9") : (c[]) values().clone();
    }

    c(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf223c715c33cc8fb5b0050aac56398", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf223c715c33cc8fb5b0050aac56398");
        } else {
            this.g = i;
        }
    }
}
