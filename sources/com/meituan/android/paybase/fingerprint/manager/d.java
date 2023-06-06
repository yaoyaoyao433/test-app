package com.meituan.android.paybase.fingerprint.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.Signature;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class d implements a {
    public static ChangeQuickRedirect a;
    Context b;
    b c;
    int d;
    private FingerprintManager e;
    private CancellationSignal f;
    private FingerprintManager.AuthenticationCallback g;
    private String h;

    public d(Context context, b bVar, String str) {
        Object[] objArr = {context, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9d7528df17ec0750854acf83afdbe1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9d7528df17ec0750854acf83afdbe1");
            return;
        }
        this.d = 0;
        this.c = bVar;
        this.b = context;
        this.h = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "460ab2b4ebd1266de4c445c05979cd54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "460ab2b4ebd1266de4c445c05979cd54");
            return;
        }
        this.e = (FingerprintManager) this.b.getSystemService(com.meituan.android.common.fingerprint.FingerprintManager.TAG);
        this.f = new CancellationSignal();
        this.g = this.c != null ? new FingerprintManager.AuthenticationCallback() { // from class: com.meituan.android.paybase.fingerprint.manager.d.1
            public static ChangeQuickRedirect a;

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationFailed() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5615de6c9bc7ed0b22bb6113aa03ff9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5615de6c9bc7ed0b22bb6113aa03ff9e");
                    return;
                }
                d.this.d++;
                com.meituan.android.paybase.common.analyse.a.a("b_pay_vkwa6nrg_mc", new a.c().a("failTime", Integer.valueOf(d.this.d)).a("type", "soter").b);
                if (!d.this.a(d.this.b)) {
                    Context context2 = d.this.b;
                    Object[] objArr4 = {context2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4fd345217e528b7d9688b69554a9bf54", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4fd345217e528b7d9688b69554a9bf54");
                    } else {
                        com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.a(context2, com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.a(context2) + 1);
                    }
                    if (!com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.e(d.this.b)) {
                        com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.b(d.this.b);
                    } else if (d.this.d == 3 || d.this.b()) {
                        d.this.c.d();
                        d.this.cancel();
                        return;
                    } else {
                        d.this.c.b();
                        return;
                    }
                }
                d.this.c.d();
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                Object[] objArr3 = {authenticationResult};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a48da40f5247187b6fbc2e78579ae50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a48da40f5247187b6fbc2e78579ae50");
                } else {
                    d.this.c.a(authenticationResult);
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationError(int i, CharSequence charSequence) {
                Object[] objArr3 = {Integer.valueOf(i), charSequence};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "91eeb1f42299695c99acbd4c9bb63d70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "91eeb1f42299695c99acbd4c9bb63d70");
                } else if (i != 7) {
                    if (i != 5) {
                        d.this.c.c();
                    }
                } else {
                    if (!com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.e(d.this.b) && !com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.d(d.this.b) && !com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.a()) {
                        com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.b(d.this.b);
                    }
                    d.this.c.d();
                }
            }
        } : null;
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a8d3f9d6aa108b108e353f76cf8ea1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a8d3f9d6aa108b108e353f76cf8ea1")).booleanValue();
        }
        if (this.g == null || this.e == null) {
            return false;
        }
        this.d = 0;
        String a2 = com.meituan.android.paybase.fingerprint.soter.b.a().a(this.h);
        Signature d = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.d(a2);
        if (d == null) {
            com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(a2, false);
            return false;
        } else if (a(this.b)) {
            return false;
        } else {
            try {
                this.e.authenticate(new FingerprintManager.CryptoObject(d), this.f, 0, this.g, null);
                return true;
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterFingerprintManager_startAuth").a("message", e.getMessage()).b);
                return false;
            }
        }
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d598958a75e7c471fb9acbbb89ac96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d598958a75e7c471fb9acbbb89ac96");
            return;
        }
        if (this.f != null && !this.f.isCanceled()) {
            this.f.cancel();
        }
        this.b = null;
        this.g = null;
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51d346a50bb87ba6f3e5ba636c5c458", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51d346a50bb87ba6f3e5ba636c5c458")).booleanValue() : this.f == null || this.f.isCanceled();
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a180b8872470415e249313be3d3e2536", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a180b8872470415e249313be3d3e2536")).booleanValue();
        }
        try {
            if (this.e != null) {
                return this.e.hasEnrolledFingerprints();
            }
            return false;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterFingerprintManager_hasEnrolledFingerprints").a("message", e.getMessage()).b);
            return false;
        }
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c2af2b18c8406d8dd501a40dce3c20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c2af2b18c8406d8dd501a40dce3c20")).booleanValue();
        }
        try {
            if (this.e != null) {
                return this.e.isHardwareDetected();
            }
            return false;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterFingerprintManager_isHardwareDetected").a("message", e.getMessage()).b);
            return false;
        }
    }

    boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df530698231a3e442617c885e0e2d109", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df530698231a3e442617c885e0e2d109")).booleanValue();
        }
        if (com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.a()) {
            return false;
        }
        if (!com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.d(context)) {
            return !com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.e(context);
        }
        if (!com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.e(context)) {
            com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint.a.c(context);
        }
        return false;
    }
}
