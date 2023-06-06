package com.meituan.android.privacy.impl;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.MtPackageManager;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.ab;
import com.meituan.android.privacy.interfaces.h;
import com.meituan.android.privacy.interfaces.j;
import com.meituan.android.privacy.interfaces.k;
import com.meituan.android.privacy.interfaces.n;
import com.meituan.android.privacy.interfaces.p;
import com.meituan.android.privacy.interfaces.q;
import com.meituan.android.privacy.interfaces.r;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.android.privacy.proxy.i;
import com.meituan.android.privacy.proxy.l;
import com.meituan.android.privacy.proxy.m;
import com.meituan.android.privacy.proxy.o;
import com.meituan.android.privacy.proxy.s;
import com.meituan.android.privacy.proxy.v;
import com.meituan.android.privacy.proxy.w;
import com.meituan.android.privacy.proxy.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5997cc09bc023f58d284c9dc5a56e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5997cc09bc023f58d284c9dc5a56e81");
        } else if (b) {
        } else {
            synchronized (e.class) {
                if (b) {
                    return;
                }
                ab.a(new h() { // from class: com.meituan.android.privacy.impl.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final u a(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29e2c90a3324578c8dc0e6705facd95d", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29e2c90a3324578c8dc0e6705facd95d") : new o(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final MtTelephonyManager b(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e9219503857c6ce32ac3727f9723a13", RobustBitConfig.DEFAULT_VALUE) ? (MtTelephonyManager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e9219503857c6ce32ac3727f9723a13") : new w(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final MtWifiManager c(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70ccca6f76144481b8a793a563e1be9", RobustBitConfig.DEFAULT_VALUE) ? (MtWifiManager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70ccca6f76144481b8a793a563e1be9") : new x(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final com.meituan.android.privacy.interfaces.w d(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f27ef9718dbd53d27776a8f1151cdd7", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.meituan.android.privacy.interfaces.w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f27ef9718dbd53d27776a8f1151cdd7");
                        }
                        if (Build.VERSION.SDK_INT < 22) {
                            return null;
                        }
                        return new s(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final com.meituan.android.privacy.interfaces.x e(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ad7810346674cd4c1fedabd12d22488", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.meituan.android.privacy.interfaces.x) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ad7810346674cd4c1fedabd12d22488");
                        }
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        return new v(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final r f(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abf7f30b6a4148b9b687180c0a2ccc64", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abf7f30b6a4148b9b687180c0a2ccc64") : new l(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final r a(Context context, String str, com.meituan.android.privacy.interfaces.b bVar) {
                        Object[] objArr2 = {context, str, bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fc3aa94da56cf22457a5bb99455ddce", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fc3aa94da56cf22457a5bb99455ddce") : new l(context, str, bVar);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final com.meituan.android.privacy.interfaces.s a(Context context, com.meituan.android.privacy.interfaces.b bVar) {
                        Object[] objArr2 = {context, bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "723df02a5e21dc8c53ebda9259fdc810", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.s) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "723df02a5e21dc8c53ebda9259fdc810") : new m(context, bVar);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final p a(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "531cd9e629d7ba9a178972c5b4b05b22", RobustBitConfig.DEFAULT_VALUE)) {
                            return (p) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "531cd9e629d7ba9a178972c5b4b05b22");
                        }
                        i iVar = new i(str);
                        iVar.a();
                        return iVar;
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final p a(String str, int i) {
                        Object[] objArr2 = {str, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be8683a9b327526a907eb68c1d43d658", RobustBitConfig.DEFAULT_VALUE)) {
                            return (p) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be8683a9b327526a907eb68c1d43d658");
                        }
                        i iVar = new i(str);
                        iVar.a(i);
                        return iVar;
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final p a(String str, Camera camera) {
                        Object[] objArr2 = {str, camera};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2d03faafdc29f6697ce867b77449b6e", RobustBitConfig.DEFAULT_VALUE)) {
                            return (p) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2d03faafdc29f6697ce867b77449b6e");
                        }
                        i iVar = new i(str);
                        iVar.a(camera);
                        return iVar;
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final com.meituan.android.privacy.interfaces.v b(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70132b77b1472d555382818bdd6d6543", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.v) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70132b77b1472d555382818bdd6d6543") : new com.meituan.android.privacy.proxy.p(str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final j a(String str, int i, int i2, int i3, int i4, int i5) {
                        Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81653833036228a70dbdbbdb51179325", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81653833036228a70dbdbbdb51179325") : new com.meituan.android.privacy.proxy.b(str, i, i2, i3, i4, i5);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final n g(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1967a1b42bc087ed206cdd244910f6ff", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1967a1b42bc087ed206cdd244910f6ff") : new com.meituan.android.privacy.proxy.g(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final com.meituan.android.privacy.interfaces.o a(Context context) {
                        Object[] objArr2 = {context};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18176ce3059394fd0339529cfc8f9c04", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.o) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18176ce3059394fd0339529cfc8f9c04") : new com.meituan.android.privacy.proxy.h(context);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final MtBluetoothAdapter c(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef615e5ddf1c988af48ab6b3e5d32e02", RobustBitConfig.DEFAULT_VALUE) ? (MtBluetoothAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef615e5ddf1c988af48ab6b3e5d32e02") : new com.meituan.android.privacy.proxy.c(str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final k a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6abf9bf84610e9841af0c774fa0f9eb0", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6abf9bf84610e9841af0c774fa0f9eb0") : new com.meituan.android.privacy.proxy.d();
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final com.meituan.android.privacy.interfaces.l d(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e170f21e1f15d697b14ef67078d9f94c", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.meituan.android.privacy.interfaces.l) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e170f21e1f15d697b14ef67078d9f94c");
                        }
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        return new com.meituan.android.privacy.proxy.e(str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final com.meituan.android.privacy.interfaces.m b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c39d3fc6d4d96857c0bcc865bc33a727", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.meituan.android.privacy.interfaces.m) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c39d3fc6d4d96857c0bcc865bc33a727");
                        }
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        return new com.meituan.android.privacy.proxy.f();
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    @Nullable
                    public final t h(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fba44eaf0a8d2cf70e56fcae4698284c", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fba44eaf0a8d2cf70e56fcae4698284c") : new com.meituan.android.privacy.proxy.n(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final MtSensorManager i(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61c3bcc28fa49430b889c17a7aaa6365", RobustBitConfig.DEFAULT_VALUE) ? (MtSensorManager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61c3bcc28fa49430b889c17a7aaa6365") : new com.meituan.android.privacy.proxy.r(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final com.meituan.android.privacy.interfaces.s b(Context context) {
                        Object[] objArr2 = {context};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e121f6f6dd00d8f6d920242904a890c9", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.s) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e121f6f6dd00d8f6d920242904a890c9") : new m(context);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final q j(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea736624f7d1492604ec728b259e8200", RobustBitConfig.DEFAULT_VALUE)) {
                            return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea736624f7d1492604ec728b259e8200");
                        }
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        return new com.meituan.android.privacy.proxy.j(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final MtPackageManager k(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "786c0fee49c4c7a8117c82783e74b7f9", RobustBitConfig.DEFAULT_VALUE) ? (MtPackageManager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "786c0fee49c4c7a8117c82783e74b7f9") : new com.meituan.android.privacy.proxy.q(context, str);
                    }

                    @Override // com.meituan.android.privacy.interfaces.h
                    public final com.meituan.android.privacy.interfaces.i l(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c54e94124c6517a7c0cfe3ce4c349bee", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.i) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c54e94124c6517a7c0cfe3ce4c349bee") : new com.meituan.android.privacy.proxy.a(context, str);
                    }
                });
                b = true;
            }
        }
    }
}
