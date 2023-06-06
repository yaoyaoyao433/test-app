package com.meituan.android.neohybrid.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.neohybrid.neo.ssr.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements android.arch.lifecycle.f, com.meituan.android.neohybrid.neo.bridge.a, com.meituan.android.neohybrid.neo.report.f {
    public static ChangeQuickRedirect a;
    public com.meituan.android.neohybrid.core.listener.a b;
    public n c;
    public com.meituan.android.neohybrid.neo.b d;
    public com.meituan.android.neohybrid.neo.breathe.a e;
    public boolean f;
    public boolean g;
    public android.arch.lifecycle.g h;
    public List<c.b> i;
    List<c.a> j;
    private com.meituan.android.neohybrid.neo.report.e k;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0302a {
        boolean a(com.meituan.android.neohybrid.core.listener.a aVar);
    }

    public static /* synthetic */ boolean a(String str, int i, String str2, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a7177399142b83b30aba5f743aae69b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a7177399142b83b30aba5f743aae69b")).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean b(String str, JSONObject jSONObject, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a9e2245ae85d8eaf515a9eeefda0263", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a9e2245ae85d8eaf515a9eeefda0263")).booleanValue();
        }
        return false;
    }

    public a(t tVar) {
        n uVar;
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbbd4e47f562cdbad167386d9fb66986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbbd4e47f562cdbad167386d9fb66986");
            return;
        }
        this.h = new android.arch.lifecycle.g(this);
        this.i = new ArrayList();
        this.j = new ArrayList();
        Object[] objArr2 = {tVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42dac904dfcd81ed3b8790946c5a721c", RobustBitConfig.DEFAULT_VALUE)) {
            switch (tVar) {
                case NATIVE_SIDE_RENDER:
                    uVar = new u(this);
                    break;
                case PRE_LOAD:
                    uVar = new v(this);
                    break;
                default:
                    uVar = new n(this);
                    break;
            }
        } else {
            uVar = (n) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42dac904dfcd81ed3b8790946c5a721c");
        }
        this.c = uVar;
    }

    public final void a(com.meituan.android.neohybrid.core.listener.a aVar, Bundle bundle) {
        Object[] objArr = {aVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68faa24d128e86d7b880d971210c0d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68faa24d128e86d7b880d971210c0d87");
            return;
        }
        this.b = aVar;
        this.c.a(aVar.g(), bundle);
        this.d = com.meituan.android.neohybrid.neo.b.b(this);
        this.d.b();
        this.h.a(d.a.ON_CREATE);
    }

    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba167cd705ba6b71df05954b16d3aa19", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba167cd705ba6b71df05954b16d3aa19");
        }
        View a2 = this.c.a(layoutInflater, viewGroup);
        this.d.a(a2);
        return a2;
    }

    public final void a(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8ec957ae667a74dac84b50d34305860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8ec957ae667a74dac84b50d34305860");
            return;
        }
        this.c.a(view, bundle);
        a(R.id.neo_compat, this);
    }

    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403d1ec6436e90bc94a641622c249da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403d1ec6436e90bc94a641622c249da7");
        } else {
            this.c.a(bundle);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730f65157ce2f27cfdd28f1655150730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730f65157ce2f27cfdd28f1655150730");
        } else {
            this.c.f();
        }
    }

    public static /* synthetic */ boolean a(NeoConfig neoConfig, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {neoConfig, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4abbb3b3466749207c5b72a56707abf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4abbb3b3466749207c5b72a56707abf")).booleanValue() : aVar.a(neoConfig);
    }

    public final void a(com.meituan.android.neohybrid.neo.n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ca0742886c0123bd0533b21d454920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ca0742886c0123bd0533b21d454920");
            return;
        }
        this.d.a(nVar);
        n nVar2 = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, nVar2, changeQuickRedirect2, false, "b5396e15f79da5de11b0ecf0a5b8dd6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar2, changeQuickRedirect2, false, "b5396e15f79da5de11b0ecf0a5b8dd6c");
        } else {
            nVar2.h();
        }
        a(this.b, e.a());
    }

    public static /* synthetic */ boolean b(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a1bef342f8233ca255d45f0a4129392", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a1bef342f8233ca255d45f0a4129392")).booleanValue();
        }
        aVar.z_();
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0454b98276d40134753632cc6c725f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0454b98276d40134753632cc6c725f");
            return;
        }
        this.d.a(com.meituan.android.neohybrid.neo.n.FINISHED);
        this.c.g();
        a(this.b, f.a());
        this.e = new com.meituan.android.neohybrid.neo.breathe.a(this);
        this.e.a(true);
    }

    public static /* synthetic */ boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "790a7035a299027174ae3ce4c68ba42b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "790a7035a299027174ae3ce4c68ba42b")).booleanValue();
        }
        aVar.y_();
        return false;
    }

    public static /* synthetic */ boolean a(View view, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398e653ede72a2dc8600adb7a9473588", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398e653ede72a2dc8600adb7a9473588")).booleanValue();
        }
        aVar.a(view);
        return false;
    }

    public final void a(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65eb0bcde0f6b65d5e4697b4ecc2f4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65eb0bcde0f6b65d5e4697b4ecc2f4af");
            return;
        }
        this.d.a(com.meituan.android.neohybrid.neo.n.END);
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5d38b6863b311f8efd69373142cfdc55", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0302a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5d38b6863b311f8efd69373142cfdc55") : new h(view, z, z2));
        NeoConfig f = f();
        if (f != null) {
            if (z && f.downgradeConfig().isLoadingTimeout()) {
                a("downgrade_loading_timeout");
            } else if (z2 && f.downgradeConfig().isLoadingCancel()) {
                a("downgrade_loading_cancel");
            }
        }
    }

    public static /* synthetic */ boolean a(View view, boolean z, boolean z2, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0277db3f68398dc171178d2a7f903b6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0277db3f68398dc171178d2a7f903b6e")).booleanValue();
        }
        aVar.a(view, z, z2);
        return false;
    }

    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c0119868eee47ce6f61ab910ede5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c0119868eee47ce6f61ab910ede5bb");
            return;
        }
        this.c.a(str, jSONObject);
        a(this.b, i.a(str, jSONObject));
    }

    public static /* synthetic */ boolean a(String str, JSONObject jSONObject, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "460ce0d859a2142d386b9dd3c830f20b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "460ce0d859a2142d386b9dd3c830f20b")).booleanValue() : aVar.a(str, jSONObject);
    }

    public final boolean b(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f21f78c262c2237dddc6fd853fb4fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f21f78c262c2237dddc6fd853fb4fb")).booleanValue();
        }
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr2 = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        return a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2dcfac49294cfadf82a8e6501921d67d", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0302a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2dcfac49294cfadf82a8e6501921d67d") : new j(str, jSONObject));
    }

    public final boolean a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7b2c507dc14290b4834d5ad6e7a907", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7b2c507dc14290b4834d5ad6e7a907")).booleanValue();
        }
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr2 = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        return a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c832cd9b6e36e31046ab3d711f0b3e9", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0302a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c832cd9b6e36e31046ab3d711f0b3e9") : new k(str, i, str2));
    }

    public static /* synthetic */ boolean a(String str, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fbf9572f84c9b7ee40bb69a74c922ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fbf9572f84c9b7ee40bb69a74c922ed")).booleanValue() : aVar.b(str);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4149c1b87d03d5670f6b0db713d69514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4149c1b87d03d5670f6b0db713d69514");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(c.a(this, str));
        } else if (a(this.b, d.a(this, str))) {
        } else {
            b(str);
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfc3e733f57beb15334f241402a11ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfc3e733f57beb15334f241402a11ed0");
        } else {
            aVar.a(str);
        }
    }

    public static /* synthetic */ boolean a(a aVar, String str, com.meituan.android.neohybrid.core.listener.a aVar2) {
        Object[] objArr = {aVar, str, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95c9592ae1a60755d8bb973826ed6099", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95c9592ae1a60755d8bb973826ed6099")).booleanValue();
        }
        boolean a2 = aVar2.a(str);
        if (a2) {
            com.meituan.android.neohybrid.neo.report.d.b(aVar, "b_pay_neo_native_common_exception_mv", com.meituan.android.neohybrid.neo.report.a.c("message", str).b("container", String.valueOf(aVar2)));
        }
        return a2;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ffdac7231f2266c498be2494649b2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ffdac7231f2266c498be2494649b2d");
            return;
        }
        Activity d = d();
        if (d != null) {
            com.meituan.android.neohybrid.neo.report.d.b(this, "b_pay_neo_native_common_exception_mv", com.meituan.android.neohybrid.neo.report.a.c("message", str).a("isNeoDowngrade", "true").b("container", String.valueOf(this.b)));
            d.setResult(703710, new Intent().putExtra("downgrade_message", str));
            q();
        }
    }

    public final Context c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1882a0172307d03ccefb330da2a399da", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1882a0172307d03ccefb330da2a399da") : this.c.e;
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final Activity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16253606bab7327166eb1d1da701560f", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16253606bab7327166eb1d1da701560f") : this.c.i();
    }

    public final WebView e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3deb533f26a0dd996fb555f0335dda1f", RobustBitConfig.DEFAULT_VALUE) ? (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3deb533f26a0dd996fb555f0335dda1f") : this.c.j();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final NeoConfig f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb670fc06b0545bf2c029649b516e2db", RobustBitConfig.DEFAULT_VALUE) ? (NeoConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb670fc06b0545bf2c029649b516e2db") : this.c.l();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final com.meituan.android.neohybrid.core.listener.a g() {
        return this.b;
    }

    public final com.meituan.android.neohybrid.neo.report.e h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03067b4ac92d2e3f4563111680a9aa12", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.report.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03067b4ac92d2e3f4563111680a9aa12");
        }
        if (this.k == null) {
            this.k = new com.meituan.android.neohybrid.neo.report.e();
        }
        return this.k;
    }

    public final com.meituan.android.neohybrid.neo.adapter.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17494a0bf42c54a0e9a6b82224f840df", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.neo.adapter.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17494a0bf42c54a0e9a6b82224f840df") : this.c.m;
    }

    public final String a(a.InterfaceC0309a interfaceC0309a) {
        Object[] objArr = {interfaceC0309a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b992078accc1318925ffeb432694d8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b992078accc1318925ffeb432694d8d");
        }
        com.meituan.android.neohybrid.neo.ssr.a aVar = (com.meituan.android.neohybrid.neo.ssr.a) this.d.a("ssr_plugin");
        if (aVar != null) {
            if (interfaceC0309a != null) {
                aVar.f = interfaceC0309a;
            }
            return aVar.e;
        }
        return null;
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b531768513982eba6112c28a3a2e3d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b531768513982eba6112c28a3a2e3d3")).booleanValue() : this.c.m();
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5ebcefda559cb8c2558aee298c82d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5ebcefda559cb8c2558aee298c82d2");
        } else if (this.c != null) {
            this.c.b(str);
        }
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207d79190728c74671ba4b02452499dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207d79190728c74671ba4b02452499dd");
            return;
        }
        Activity d = d();
        if (d != null) {
            d.finish();
        }
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df8e17ecb41dc0d10cb211c195b5990", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df8e17ecb41dc0d10cb211c195b5990") : this.c.h;
    }

    public final void a(c.b... bVarArr) {
        Object[] objArr = {bVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a98b80a6625f59aed7e989338343e71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a98b80a6625f59aed7e989338343e71");
        } else if (bVarArr.length > 0) {
            for (c.b bVar : bVarArr) {
                if (bVar != null) {
                    this.i.add(bVar);
                }
            }
        }
    }

    public final void a(c.a... aVarArr) {
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6607a36ebd74a369c064eb6b08212ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6607a36ebd74a369c064eb6b08212ddd");
            return;
        }
        for (int i = 0; i <= 0; i++) {
            c.a aVar = aVarArr[0];
            if (aVar != null) {
                this.j.add(aVar);
            }
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66c0eb884e4e0fdd97621f8a802014e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66c0eb884e4e0fdd97621f8a802014e");
            return;
        }
        for (c.a aVar : this.j) {
            aVar.onFailProcess(i, str);
        }
        this.j.clear();
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4adf9d4fc26dff4b5b1ffdf480ea314a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4adf9d4fc26dff4b5b1ffdf480ea314a");
            return;
        }
        for (c.b bVar : this.i) {
            bVar.c(k());
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78de6c08fc7b8832a860a7a049751f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78de6c08fc7b8832a860a7a049751f90");
            return;
        }
        for (c.b bVar : this.i) {
            bVar.d(str);
        }
    }

    public final void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d6dd41a5a59036a7af54a9dce43bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d6dd41a5a59036a7af54a9dce43bc3");
            return;
        }
        for (c.b bVar : this.i) {
            bVar.b(str, i, str2);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ec6caabf3b44fe91bb4fcbfdbf892f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ec6caabf3b44fe91bb4fcbfdbf892f");
            return;
        }
        n nVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "a297eb20bce079796dc5f2694891efeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "a297eb20bce079796dc5f2694891efeb");
        } else {
            com.meituan.android.neohybrid.util.o.a(q.a(nVar));
        }
    }

    public boolean a(com.meituan.android.neohybrid.core.listener.a aVar, InterfaceC0302a interfaceC0302a) {
        Object[] objArr = {aVar, interfaceC0302a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07fda812e4d6530a50db2165da9a5958", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07fda812e4d6530a50db2165da9a5958")).booleanValue();
        }
        if (aVar == null || interfaceC0302a == null) {
            return false;
        }
        return a(aVar.i(), interfaceC0302a) || interfaceC0302a.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(com.meituan.android.neohybrid.core.listener.a aVar, InterfaceC0302a interfaceC0302a) {
        Object[] objArr = {aVar, interfaceC0302a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b6cb74647d148e047da2b2aeb1b107", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b6cb74647d148e047da2b2aeb1b107")).booleanValue();
        }
        if (aVar == null || interfaceC0302a == null) {
            return false;
        }
        return interfaceC0302a.a(aVar) || b(aVar.i(), interfaceC0302a);
    }

    public final View n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b02a4f8d82ae2c5eb78ad9e57055b03", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b02a4f8d82ae2c5eb78ad9e57055b03") : this.c.f;
    }

    public void a(@IdRes int i, Object obj) {
        Object[] objArr = {Integer.valueOf((int) R.id.neo_compat), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef1a9a3959c091f9941667e6a7862b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef1a9a3959c091f9941667e6a7862b1");
            return;
        }
        WebView e = e();
        if (e == null) {
            return;
        }
        e.setTag(R.id.neo_compat, obj);
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public final android.arch.lifecycle.d getLifecycle() {
        return this.h;
    }

    @Override // com.meituan.android.neohybrid.neo.report.f
    public final void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125f5f85871c3ce2dc0706a8ad3abf0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125f5f85871c3ce2dc0706a8ad3abf0a");
            return;
        }
        com.meituan.android.neohybrid.neo.report.d.b(this, str, null, map);
        com.meituan.android.neohybrid.neo.report.d.c(this, str2, map);
    }

    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250f075c4d641cf99ad7b147927e0028", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250f075c4d641cf99ad7b147927e0028") : this.c.j.a();
    }

    public final Map<String, NeoBridgeCustomizeInterface> p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdd7702e7dc441a2f4316a4a2d760cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdd7702e7dc441a2f4316a4a2d760cc");
        }
        n nVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "4fdf8be7e5313e57e41abb3cc2918c96", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "4fdf8be7e5313e57e41abb3cc2918c96");
        }
        if (nVar.n == null) {
            nVar.n = new HashMap();
        }
        return nVar.n;
    }
}
