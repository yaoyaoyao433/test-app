package com.meituan.android.privacy.interfaces;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ac implements h {
    public static ChangeQuickRedirect a;
    private static volatile ac b;

    public ac() {
        com.sankuai.waimai.manipulator.runtime.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e671b888dbad5df5cc967bff7b1571d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e671b888dbad5df5cc967bff7b1571d4");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.aop.f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f926834021149ca55cf4149a96a89dfe", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.waimai.manipulator.runtime.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f926834021149ca55cf4149a96a89dfe");
        } else {
            com.meituan.android.privacy.impl.e.a();
            a2 = com.sankuai.waimai.manipulator.runtime.a.a();
        }
        boolean z = a2.b;
    }

    public static ac c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59fe426e5b04d8532c0dfe2400329b8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ac) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59fe426e5b04d8532c0dfe2400329b8e");
        }
        if (b == null) {
            synchronized (ac.class) {
                if (b == null) {
                    b = new ac();
                }
            }
        }
        return b;
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final u a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd38f239ead404175fab352d2b9ef69", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd38f239ead404175fab352d2b9ef69");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.o(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final MtTelephonyManager b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1194ab7a69e5e2502ff07b29abe5a82a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtTelephonyManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1194ab7a69e5e2502ff07b29abe5a82a");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.b(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.u(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final MtWifiManager c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c435f0b6781d57b25573adadcc969c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtWifiManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c435f0b6781d57b25573adadcc969c9");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.c(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.v(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final w d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477b5f0cc964dd98039b79d72341b5f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477b5f0cc964dd98039b79d72341b5f0");
        }
        if (Build.VERSION.SDK_INT < 22) {
            return null;
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.d(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.s(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final x e(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e25c6b58996f16adb924568c8e87a2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (x) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e25c6b58996f16adb924568c8e87a2d");
        }
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.e(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.t(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final r f(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6ba03573aee436e99c506c7cbfc1ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6ba03573aee436e99c506c7cbfc1ed");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.f(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.l(context);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final p a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25813f61bd1a894d9bfc50b6605912a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25813f61bd1a894d9bfc50b6605912a8");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(str);
        }
        com.meituan.android.privacy.interfaces.def.j jVar = new com.meituan.android.privacy.interfaces.def.j();
        jVar.a();
        return jVar;
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final p a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a0268e15074de9eb4078008bdc2dc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a0268e15074de9eb4078008bdc2dc2");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(str, i);
        }
        com.meituan.android.privacy.interfaces.def.j jVar = new com.meituan.android.privacy.interfaces.def.j();
        jVar.a(i);
        return jVar;
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final p a(String str, Camera camera) {
        Object[] objArr = {str, camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1f69c14d6ef04cb1e6da76b7f3ee09", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1f69c14d6ef04cb1e6da76b7f3ee09");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(str, camera);
        }
        com.meituan.android.privacy.interfaces.def.j jVar = new com.meituan.android.privacy.interfaces.def.j();
        jVar.a(camera);
        return jVar;
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final v b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce8c208f9c91dfde761a7420d70a44c", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce8c208f9c91dfde761a7420d70a44c");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.b(str);
        }
        return new com.meituan.android.privacy.interfaces.def.p();
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final j a(String str, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11bc240c93bd657fdf0f88cd20bda985", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11bc240c93bd657fdf0f88cd20bda985");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(str, i, i2, i3, i4, i5);
        }
        return new com.meituan.android.privacy.interfaces.def.b(i, i2, i3, i4, i5);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final n g(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f541c675016241e112bf5097d24ebe33", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f541c675016241e112bf5097d24ebe33");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.g(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.i(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final o a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e3c3504661d2f4c33b58d4963db816", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e3c3504661d2f4c33b58d4963db816");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(context);
        }
        return new com.meituan.android.privacy.interfaces.def.h(context);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final MtBluetoothAdapter c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f3b1a590f15a3406f465a843149047b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtBluetoothAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f3b1a590f15a3406f465a843149047b");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.c(str);
        }
        return new com.meituan.android.privacy.interfaces.def.d(str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2548725c3f49a468c13e6a6df6ada9ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2548725c3f49a468c13e6a6df6ada9ba");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a();
        }
        return new com.meituan.android.privacy.interfaces.def.e();
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final l d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29bdde169232c56343a1478d52796dda", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29bdde169232c56343a1478d52796dda");
        }
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.d(str);
        }
        return new com.meituan.android.privacy.interfaces.def.f(str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final m b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0cf663945904094cd0047246abb228", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0cf663945904094cd0047246abb228");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.b();
        }
        return new com.meituan.android.privacy.interfaces.def.g();
    }

    @Override // com.meituan.android.privacy.interfaces.h
    @Nullable
    public final t h(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f8102d80b26386b2e27e25e52462a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f8102d80b26386b2e27e25e52462a3");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.h(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.n(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final MtSensorManager i(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6c72df326225bf8215bbf72a5db361", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtSensorManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6c72df326225bf8215bbf72a5db361");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.i(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.r(context);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final r a(Context context, String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866c03a74f236cc9e4da5c2eea0427d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866c03a74f236cc9e4da5c2eea0427d7");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(context, str, bVar);
        }
        return new com.meituan.android.privacy.interfaces.def.l(context, bVar);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final s b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a22c49ce1bd24dd1f859d57539cd6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a22c49ce1bd24dd1f859d57539cd6e");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.b(context);
        }
        return new com.meituan.android.privacy.interfaces.def.m(context);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final s a(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5abce06a57ca93c0989ca76539a4eff9", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5abce06a57ca93c0989ca76539a4eff9");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.a(context, bVar);
        }
        return new com.meituan.android.privacy.interfaces.def.m(context, bVar);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final q j(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734ee0d1ac8912794e9d72d05f2b4cf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734ee0d1ac8912794e9d72d05f2b4cf9");
        }
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.j(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.k(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final MtPackageManager k(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f9b644acd43349e4c250d8f113fb84", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtPackageManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f9b644acd43349e4c250d8f113fb84");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.k(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.q(context, str);
    }

    @Override // com.meituan.android.privacy.interfaces.h
    public final i l(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd056bfc738bcf19fa5db0b55d381d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd056bfc738bcf19fa5db0b55d381d6");
        }
        h a2 = ab.a();
        if (a2 != null) {
            return a2.l(context, str);
        }
        return new com.meituan.android.privacy.interfaces.def.a(context, str);
    }
}
