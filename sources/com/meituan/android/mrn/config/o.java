package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class o implements com.meituan.android.mrn.horn.d {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71442ede5f5c9ff2500b61c944218b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71442ede5f5c9ff2500b61c944218b3c");
        } else if (b) {
        } else {
            synchronized (o.class) {
                if (b) {
                    return;
                }
                com.meituan.android.mrn.horn.a.a(new o());
                b = true;
            }
        }
    }

    @Override // com.meituan.android.mrn.horn.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511430c79efdd8e99bc4e4102c0299bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511430c79efdd8e99bc4e4102c0299bd")).booleanValue();
        }
        k a2 = k.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "61bfdd40dfdf0f5f8374dadc33da6a86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "61bfdd40dfdf0f5f8374dadc33da6a86")).booleanValue() : ((Boolean) t.b.a("Image.shouldDestroyDomeTreeOriginal")).booleanValue();
    }

    @Override // com.meituan.android.mrn.horn.d
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "651b19672f1b326abb5db0b386495346", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "651b19672f1b326abb5db0b386495346")).booleanValue();
        }
        ac a2 = ac.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ac.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2b04538df7d99084b3093694485f963b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2b04538df7d99084b3093694485f963b")).booleanValue() : ((Boolean) t.b.a("MRNWebView.shouldUseDeprecatedMRNWebView")).booleanValue();
    }
}
