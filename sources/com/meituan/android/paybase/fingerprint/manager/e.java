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
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class e implements a {
    public static ChangeQuickRedirect a;
    b b;
    int c;
    private FingerprintManager d;
    private CancellationSignal e;
    private Context f;
    private FingerprintManager.AuthenticationCallback g;

    public static /* synthetic */ int a(e eVar) {
        int i = eVar.c;
        eVar.c = i + 1;
        return i;
    }

    public e(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd957b11f333c834a0f14b18b574062", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd957b11f333c834a0f14b18b574062");
            return;
        }
        this.c = 0;
        this.b = bVar;
        this.f = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96d3cc1809498ae2ce4eeb008dbb2a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96d3cc1809498ae2ce4eeb008dbb2a8a");
            return;
        }
        this.d = (FingerprintManager) this.f.getSystemService(com.meituan.android.common.fingerprint.FingerprintManager.TAG);
        this.e = new CancellationSignal();
        this.g = this.b != null ? new FingerprintManager.AuthenticationCallback() { // from class: com.meituan.android.paybase.fingerprint.manager.e.1
            public static ChangeQuickRedirect a;

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationFailed() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "360a9e322946c2f4d131f68e78b39050", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "360a9e322946c2f4d131f68e78b39050");
                    return;
                }
                super.onAuthenticationFailed();
                e.a(e.this);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_vkwa6nrg_mc", new a.c().a("failTime", Integer.valueOf(e.this.c)).a("type", "google").b);
                if (e.this.c == 3 || e.this.b()) {
                    e.this.b.d();
                    e.this.cancel();
                    return;
                }
                e.this.b.b();
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                Object[] objArr3 = {authenticationResult};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2bffa90ad5c9d36c965634955b1baebe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2bffa90ad5c9d36c965634955b1baebe");
                    return;
                }
                super.onAuthenticationSucceeded(authenticationResult);
                e.this.b.a(null);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public final void onAuthenticationError(int i, CharSequence charSequence) {
                Object[] objArr3 = {Integer.valueOf(i), charSequence};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9fa5ffc056d9c9f90b5912eacffb8ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9fa5ffc056d9c9f90b5912eacffb8ee");
                    return;
                }
                super.onAuthenticationError(i, charSequence);
                e.a(e.this);
                if (i == 7) {
                    e.this.b.d();
                } else if (i == 5) {
                    e.this.b.a();
                } else if (e.this.c == 3) {
                    e.this.b.d();
                } else {
                    e.this.b.c();
                }
            }
        } : null;
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da59124bd973ce23e0367c3fca535c84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da59124bd973ce23e0367c3fca535c84")).booleanValue();
        }
        if (this.g == null || this.d == null) {
            return false;
        }
        this.c = 0;
        try {
            this.d.authenticate(null, this.e, 0, this.g, null);
            return true;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "StandardFingerprintManger_startAuth").a("message", e.getMessage()).b);
            return false;
        }
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7e14f422dd0ce05a91363adb77b8c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7e14f422dd0ce05a91363adb77b8c1");
            return;
        }
        if (this.e != null && !this.e.isCanceled()) {
            this.e.cancel();
        }
        this.f = null;
        this.g = null;
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e97739f56053f4c16cca7fb045c1aa4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e97739f56053f4c16cca7fb045c1aa4")).booleanValue() : this.e == null || this.e.isCanceled();
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a54ffabf36ad395480eb3e1cf281d2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a54ffabf36ad395480eb3e1cf281d2f")).booleanValue();
        }
        try {
            if (this.d != null) {
                return this.d.hasEnrolledFingerprints();
            }
            return false;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "StandardFingerprintManger_hasEnrolledFingerprints").a("message", e.getMessage()).b);
            return false;
        }
    }

    @Override // com.meituan.android.paybase.fingerprint.manager.a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695d38e164f47837492ee69d1da559f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695d38e164f47837492ee69d1da559f9")).booleanValue();
        }
        try {
            if (this.d != null) {
                return this.d.isHardwareDetected();
            }
            return false;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "StandardFingerprintManger_isHardwareDetected").a("message", e.getMessage()).b);
            return false;
        }
    }
}
