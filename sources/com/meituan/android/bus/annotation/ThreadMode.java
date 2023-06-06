package com.meituan.android.bus.annotation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum ThreadMode {
    POSTING,
    MAIN,
    BACKGROUND;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    ThreadMode() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa73f73f69b385bd2231b040ba2766f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa73f73f69b385bd2231b040ba2766f6");
        }
    }

    public static ThreadMode valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0439a86e1af97eb875a4a9f4ecb759d", RobustBitConfig.DEFAULT_VALUE) ? (ThreadMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0439a86e1af97eb875a4a9f4ecb759d") : (ThreadMode) Enum.valueOf(ThreadMode.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ThreadMode[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27330fd8bf3d2b4e15aaca5a1537ce28", RobustBitConfig.DEFAULT_VALUE) ? (ThreadMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27330fd8bf3d2b4e15aaca5a1537ce28") : (ThreadMode[]) values().clone();
    }
}
