package com.meituan.android.pay.process.ntv.pay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.hardware.fingerprint.FingerprintManager;
import android.text.TextUtils;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class n {
    public static ChangeQuickRedirect a;
    private static volatile n f;
    public int b;
    public String c;
    @MTPayNeedToPersist
    public String d;
    private com.meituan.android.paybase.fingerprint.manager.a e;

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1daa1ad549df3bc16d36bdfb137f5300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1daa1ad549df3bc16d36bdfb137f5300");
        } else if (this.b != 1 || com.meituan.android.paybase.fingerprint.util.b.d(com.meituan.android.paycommon.lib.config.a.a().i())) {
        } else {
            com.meituan.android.paybase.fingerprint.util.b.a(com.meituan.android.paycommon.lib.config.a.a().i());
        }
    }

    public static n a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb3f034928156a967915a456eeaec39e", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb3f034928156a967915a456eeaec39e");
        }
        if (f == null) {
            synchronized (n.class) {
                if (f == null) {
                    f = new n();
                }
            }
        }
        return f;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27c2a0cfa2579a7aa2fabb8605ea226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27c2a0cfa2579a7aa2fabb8605ea226");
        } else if ((this.e != null && !d()) || e() || com.meituan.android.pay.utils.k.a().c == null) {
        } else {
            com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(3, false, null);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67652bb0a85d45f00b9fb6a35f1fde5a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67652bb0a85d45f00b9fb6a35f1fde5a")).booleanValue() : this.e != null && this.e.b();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2238a713f2b5ecf733d4fddd7e24df3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2238a713f2b5ecf733d4fddd7e24df3e");
        } else if (this.e != null) {
            this.e.cancel();
        }
    }

    @SuppressLint({"NewApi"})
    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593bfd565f6d9db6df8ec66f84ce5b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593bfd565f6d9db6df8ec66f84ce5b2c")).booleanValue();
        }
        this.e = com.meituan.android.paybase.fingerprint.manager.c.a(new a(f), this.b, this.c);
        return this.e != null && this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements com.meituan.android.paybase.fingerprint.manager.b {
        public static ChangeQuickRedirect a;
        private WeakReference<n> b;

        public a(n nVar) {
            Object[] objArr = {nVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d2e99bc248f1424e7172fb75d2c06a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d2e99bc248f1424e7172fb75d2c06a");
            } else {
                this.b = new WeakReference<>(nVar);
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc425bbe54b808143f6daf97415d0e64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc425bbe54b808143f6daf97415d0e64");
            } else if (com.meituan.android.pay.utils.k.a().c != null) {
                n.a().c();
                if (com.meituan.android.pay.desk.component.data.a.a((Activity) null)) {
                    com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(2, false, null);
                }
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        @SuppressLint({"NewApi"})
        public final void a(FingerprintManager.AuthenticationResult authenticationResult) {
            n nVar;
            com.meituan.android.paybase.fingerprint.soter.sotercore.external.c cVar;
            Object[] objArr = {authenticationResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c9d06428b4d5406044314d052c7f49", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c9d06428b4d5406044314d052c7f49");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63846bb1b757a6dcde773b07cef1da4c", RobustBitConfig.DEFAULT_VALUE)) {
                nVar = (n) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63846bb1b757a6dcde773b07cef1da4c");
            } else {
                nVar = this.b != null ? this.b.get() : null;
            }
            if (nVar != null) {
                if (authenticationResult == null || nVar.b != 2 || TextUtils.isEmpty(nVar.d)) {
                    cVar = null;
                } else {
                    try {
                        Signature signature = authenticationResult.getCryptoObject().getSignature();
                        signature.update(nVar.d.getBytes());
                        cVar = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(signature.sign());
                    } catch (Exception unused) {
                        if (com.meituan.android.pay.utils.k.a().c != null) {
                            com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(3, false, null);
                            return;
                        }
                        return;
                    }
                }
                HashMap<String, String> hashMap = new HashMap<>();
                if (cVar != null) {
                    hashMap.put("auth_json", cVar.b);
                    hashMap.put("auth_json_signature", cVar.c);
                }
                if (com.meituan.android.pay.utils.k.a().c != null) {
                    com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(0, false, hashMap);
                }
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d37e3d2c911815301d40bf2a8fa8744", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d37e3d2c911815301d40bf2a8fa8744");
            } else if (com.meituan.android.pay.utils.k.a().c != null) {
                com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(1, false, null);
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "204da88e3d9e11b6cf1ef653a1277be7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "204da88e3d9e11b6cf1ef653a1277be7");
            } else if (com.meituan.android.pay.utils.k.a().c != null) {
                com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(3, false, null);
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa02e5bdad719f79212a70ae44fabbe2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa02e5bdad719f79212a70ae44fabbe2");
            } else if (com.meituan.android.pay.utils.k.a().c != null) {
                com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(3, true, null);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160008);
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e913fff5fc213386fcf7184e437760", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e913fff5fc213386fcf7184e437760");
            } else if (com.meituan.android.pay.utils.k.a().c != null) {
                com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(4, false, null);
            }
        }
    }
}
