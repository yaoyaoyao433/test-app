package com.meituan.android.paybase.fingerprint.util;

import android.annotation.SuppressLint;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    public static final String b = "b";

    @SuppressLint({"TrulyRandom"})
    public static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab75cd5b584a1c43624b31793dc3a12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab75cd5b584a1c43624b31793dc3a12d");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            b();
            new com.meituan.android.paybase.asynctask.a<Void, Void, Void>() { // from class: com.meituan.android.paybase.fingerprint.util.b.1
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.paybase.asynctask.b
                @SuppressLint({"InlinedApi"})
                public Void a(Void... voidArr) {
                    Object[] objArr2 = {voidArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63de2d4f1ae06d8e5fe85ea37f22b78e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63de2d4f1ae06d8e5fe85ea37f22b78e");
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GoogleFingerprintKeyUtil_doInBackground").a("message", e.getMessage()).b);
                    }
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(ag.a(str), 4).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_ejfhz5x2_mv", new a.c().a("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
                        return null;
                    } catch (Exception e2) {
                        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GoogleFingerprintKeyUtil_doInBackground").a("message", e2.getMessage()).a("action", "createKey").a("lab_value", LogMonitor.EXCEPTION_TAG).b);
                        return null;
                    }
                }
            }.b(new Void[0]);
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48051a5d40800c606f56c6f0b7dd2a2d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48051a5d40800c606f56c6f0b7dd2a2d")).booleanValue() : "huawei".equalsIgnoreCase(Build.BRAND) || RouteSelector.BRAND_HUAWEI2.equalsIgnoreCase(Build.BRAND);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9d249d43002b274f1e3e0e738cb3af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9d249d43002b274f1e3e0e738cb3af6");
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                keyStore.deleteEntry(ag.a(str));
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GoogleFingerprintKeyUtil_removeKey").a("message", e.getMessage()).b);
            }
        }
    }

    public static boolean c(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd3f5a3c4597c20680025fe29c2e08b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd3f5a3c4597c20680025fe29c2e08b2")).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        b();
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            PrivateKey privateKey = (PrivateKey) keyStore.getKey(ag.a(str), null);
            if (privateKey != null) {
                signature.initSign(privateKey);
            }
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GoogleFingerprintKeyUtil_isKeyValid").a("message", e.getMessage()).b);
            z = false;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_rtzvhyfq_mv", new a.c().a("isKeyValid", String.valueOf(z)).b);
        return z;
    }

    public static boolean d(String str) {
        boolean z = false;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "924dda2b3ffaed50ee772bedbb12f2b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "924dda2b3ffaed50ee772bedbb12f2b4")).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (((PrivateKey) keyStore.getKey(ag.a(str), null)) != null) {
                z = true;
            }
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GoogleFingerprintKeyUtil_hasKey").a("message", e.getMessage()).a("action", "hasKey").b);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_f4gnud4s_mv", new a.c().a("hasKey", String.valueOf(z)).b);
        return z;
    }

    private static void b() {
        com.meituan.android.paybase.fingerprint.manager.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8853fa6a08410c5b78c13189c334caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8853fa6a08410c5b78c13189c334caa");
        } else if (!a() || Build.VERSION.SDK_INT >= 26 || (a2 = com.meituan.android.paybase.fingerprint.manager.c.a(new com.meituan.android.paybase.fingerprint.manager.b() { // from class: com.meituan.android.paybase.fingerprint.util.b.2
            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void a() {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void a(FingerprintManager.AuthenticationResult authenticationResult) {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void b() {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void c() {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void d() {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void e() {
            }
        }, 1, "")) == null) {
        } else {
            a2.a();
            a2.cancel();
        }
    }
}
