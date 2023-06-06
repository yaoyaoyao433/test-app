package com.meituan.android.neohybrid.v2.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.neohybrid.v2.neo.ssr.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements android.arch.lifecycle.f, com.meituan.android.neohybrid.neo.bridge.a, com.meituan.android.neohybrid.neo.report.f {
    public static ChangeQuickRedirect a;
    public com.meituan.android.neohybrid.core.listener.a b;
    public n c;
    public com.meituan.android.neohybrid.v2.neo.b d;
    public com.meituan.android.neohybrid.v2.neo.breathe.a e;
    public boolean f;
    public android.arch.lifecycle.g g;
    public List<c.b> h;
    public List<c.a> i;
    private com.meituan.android.neohybrid.neo.report.e j;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0311a {
        boolean a(com.meituan.android.neohybrid.core.listener.a aVar);
    }

    public static /* synthetic */ boolean a(String str, int i, String str2, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f84f9b2678d37209ef3658a2cf254e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f84f9b2678d37209ef3658a2cf254e3")).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean b(String str, JSONObject jSONObject, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11d10c2a70b5dd546fe0b17d952d7827", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11d10c2a70b5dd546fe0b17d952d7827")).booleanValue();
        }
        return false;
    }

    public a(r rVar) {
        n sVar;
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a666b5bb02e1afff10523c01e8860d61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a666b5bb02e1afff10523c01e8860d61");
            return;
        }
        this.g = new android.arch.lifecycle.g(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        Object[] objArr2 = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e0dcbd4e85faf6c5f39ac1c224093ca", RobustBitConfig.DEFAULT_VALUE)) {
            switch (rVar) {
                case NATIVE_SIDE_RENDER:
                    sVar = new s(this);
                    break;
                case PRE_LOAD:
                    sVar = new t(this);
                    break;
                default:
                    sVar = new n(this);
                    break;
            }
        } else {
            sVar = (n) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e0dcbd4e85faf6c5f39ac1c224093ca");
        }
        this.c = sVar;
    }

    public static /* synthetic */ boolean a(NeoConfig neoConfig, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {neoConfig, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa44e27f9310d17d329eab72d04ba31b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa44e27f9310d17d329eab72d04ba31b")).booleanValue() : aVar.a(neoConfig);
    }

    public static /* synthetic */ boolean b(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9680fdd041eae6d53b2e0be9412ae47f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9680fdd041eae6d53b2e0be9412ae47f")).booleanValue();
        }
        aVar.z_();
        return false;
    }

    public static /* synthetic */ boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fca073519f945a93d21b8148b95a936", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fca073519f945a93d21b8148b95a936")).booleanValue();
        }
        aVar.y_();
        return false;
    }

    public static /* synthetic */ boolean a(View view, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bca5530aa013579010b154141b679d81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bca5530aa013579010b154141b679d81")).booleanValue();
        }
        aVar.a(view);
        return false;
    }

    public final void a(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67d60f785bf028840d4cdebe011958a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67d60f785bf028840d4cdebe011958a");
            return;
        }
        this.d.a(com.meituan.android.neohybrid.neo.n.END);
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e5f7a34031d4f8ba5500a384b42c1104", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0311a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e5f7a34031d4f8ba5500a384b42c1104") : new h(view, z, z2));
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2afd973d6595992a4734007d97a0318", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2afd973d6595992a4734007d97a0318")).booleanValue();
        }
        aVar.a(view, z, z2);
        return false;
    }

    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ef9bd0ccb6a364ef6aa9a462e1b483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ef9bd0ccb6a364ef6aa9a462e1b483");
            return;
        }
        n nVar = this.c;
        Object[] objArr2 = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "3553f35f745b63a764760d6dc99f77c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "3553f35f745b63a764760d6dc99f77c3");
        } else {
            nVar.i.a(str, jSONObject);
        }
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr3 = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        a(aVar, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ca7420dd9f6d77a0b3c9ce877ef9bf82", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0311a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ca7420dd9f6d77a0b3c9ce877ef9bf82") : new i(str, jSONObject));
    }

    public static /* synthetic */ boolean a(String str, JSONObject jSONObject, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e998c30a4e43946bb0c9a70d8455d007", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e998c30a4e43946bb0c9a70d8455d007")).booleanValue() : aVar.a(str, jSONObject);
    }

    public final boolean b(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb3453b65b419fbfc4092ccd7dc6b5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb3453b65b419fbfc4092ccd7dc6b5b")).booleanValue();
        }
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr2 = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        return a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "406a26c75e39d5b5407f3c6da0cba394", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0311a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "406a26c75e39d5b5407f3c6da0cba394") : new j(str, jSONObject));
    }

    public final boolean a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19ce655f654e0456545f4422b55a0bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19ce655f654e0456545f4422b55a0bf")).booleanValue();
        }
        com.meituan.android.neohybrid.core.listener.a aVar = this.b;
        Object[] objArr2 = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        return a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dd103f74046f2d3c67cb09b375caa68e", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0311a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dd103f74046f2d3c67cb09b375caa68e") : new k(str, i, str2));
    }

    public static /* synthetic */ boolean a(String str, com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a22ddebb99efde10a12ce52ce63765bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a22ddebb99efde10a12ce52ce63765bd")).booleanValue() : aVar.b(str);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a8244a1e0ecabc3dda8728a549549e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a8244a1e0ecabc3dda8728a549549e");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed268b6fb53872ade70dfebeeb031b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed268b6fb53872ade70dfebeeb031b6e");
        } else {
            aVar.a(str);
        }
    }

    public static /* synthetic */ boolean a(a aVar, String str, com.meituan.android.neohybrid.core.listener.a aVar2) {
        Object[] objArr = {aVar, str, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db9eca508ca18ac4c80e4a7db8a960fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db9eca508ca18ac4c80e4a7db8a960fa")).booleanValue();
        }
        boolean a2 = aVar2.a(str);
        if (a2) {
            com.meituan.android.neohybrid.v2.neo.report.a.b(aVar, "b_pay_neo_native_common_exception_mv", com.meituan.android.neohybrid.neo.report.a.c("message", str).b("container", String.valueOf(aVar2)));
        }
        return a2;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e63d3070a031598fbda0bab102f61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e63d3070a031598fbda0bab102f61d");
            return;
        }
        Activity d = d();
        if (d != null) {
            com.meituan.android.neohybrid.v2.neo.report.a.b(this, "b_pay_neo_native_common_exception_mv", com.meituan.android.neohybrid.neo.report.a.c("message", str).a("isNeoDowngrade", "true").b("container", String.valueOf(this.b)));
            d.setResult(703710, new Intent().putExtra("downgrade_message", str));
            i();
        }
    }

    public final Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c81341c674f2c26d8845507b249a503", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c81341c674f2c26d8845507b249a503") : this.c.e;
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final Activity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd151537c28faf2341d80be62a3c055", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd151537c28faf2341d80be62a3c055") : this.c.i();
    }

    public final com.meituan.android.neohybrid.protocol.kernel.c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a76fccef8231880b17b83aa73707b84c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.protocol.kernel.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a76fccef8231880b17b83aa73707b84c") : this.c.j();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final NeoConfig f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a6bed90fdf1b3309222b99497672f5", RobustBitConfig.DEFAULT_VALUE) ? (NeoConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a6bed90fdf1b3309222b99497672f5") : this.c.l();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final com.meituan.android.neohybrid.core.listener.a g() {
        return this.b;
    }

    public final com.meituan.android.neohybrid.neo.report.e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956e4af02c99abad65d51b4a53bf70f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.report.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956e4af02c99abad65d51b4a53bf70f0");
        }
        if (this.j == null) {
            this.j = new com.meituan.android.neohybrid.neo.report.e();
        }
        return this.j;
    }

    public final com.meituan.android.neohybrid.v2.neo.adapter.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c67d3e6cbae2062a72e442549c9dd4e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.v2.neo.adapter.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c67d3e6cbae2062a72e442549c9dd4e") : this.c.l;
    }

    public final String a(a.InterfaceC0317a interfaceC0317a) {
        Object[] objArr = {interfaceC0317a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2784b95e87ef9f08c2276407a6f0842d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2784b95e87ef9f08c2276407a6f0842d");
        }
        com.meituan.android.neohybrid.v2.neo.ssr.a aVar = (com.meituan.android.neohybrid.v2.neo.ssr.a) this.d.a("ssr_plugin");
        if (aVar != null) {
            if (interfaceC0317a != null) {
                aVar.f = interfaceC0317a;
            }
            return aVar.e;
        }
        return null;
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400fb26a9efc042396bcd2392ec67d63", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400fb26a9efc042396bcd2392ec67d63")).booleanValue() : this.c.m();
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f5a5f789a4f3d286149360f4525819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f5a5f789a4f3d286149360f4525819");
        } else if (this.c != null) {
            this.c.b(str);
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eae511ae40987624e61dbf5dcfe7e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eae511ae40987624e61dbf5dcfe7e55");
            return;
        }
        Activity d = d();
        if (d != null) {
            d.finish();
        }
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aad5cb9341232a91a0e265f157bb61a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aad5cb9341232a91a0e265f157bb61a") : this.c.h;
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc5425068203a38d6e58ab1fb942aeb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc5425068203a38d6e58ab1fb942aeb5");
            return;
        }
        for (c.a aVar : this.i) {
            aVar.onFailProcess(i, str);
        }
        this.i.clear();
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e9e1994cd8b22c69ae49a6828f4fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e9e1994cd8b22c69ae49a6828f4fe8");
            return;
        }
        for (c.b bVar : this.h) {
            bVar.d(str);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.a
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e583399b92eac18b324ecf026618ccd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e583399b92eac18b324ecf026618ccd8");
            return;
        }
        n nVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "a882430a62d939615188d337d67fb466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "a882430a62d939615188d337d67fb466");
        } else {
            com.meituan.android.neohybrid.util.o.a(p.a(nVar));
        }
    }

    public boolean a(com.meituan.android.neohybrid.core.listener.a aVar, InterfaceC0311a interfaceC0311a) {
        Object[] objArr = {aVar, interfaceC0311a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a701d2e20465028c353da67efadd6bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a701d2e20465028c353da67efadd6bc")).booleanValue();
        }
        if (aVar == null || interfaceC0311a == null) {
            return false;
        }
        return a(aVar.i(), interfaceC0311a) || interfaceC0311a.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(com.meituan.android.neohybrid.core.listener.a aVar, InterfaceC0311a interfaceC0311a) {
        Object[] objArr = {aVar, interfaceC0311a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc4fd00c5f37df8bb3f2e7f3189d462", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc4fd00c5f37df8bb3f2e7f3189d462")).booleanValue();
        }
        if (aVar == null || interfaceC0311a == null) {
            return false;
        }
        return interfaceC0311a.a(aVar) || b(aVar.i(), interfaceC0311a);
    }

    public final View k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8264c6eebeec9f1e56136b2853e9430b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8264c6eebeec9f1e56136b2853e9430b") : this.c.f;
    }

    public void a(@IdRes int i, Object obj) {
        Object[] objArr = {Integer.valueOf((int) R.id.neo_compat), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f15d1f2b466cdb3e9719a526b191980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f15d1f2b466cdb3e9719a526b191980");
            return;
        }
        View j = b().j();
        if (j == null) {
            return;
        }
        j.setTag(R.id.neo_compat, obj);
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public final android.arch.lifecycle.d getLifecycle() {
        return this.g;
    }

    @Override // com.meituan.android.neohybrid.neo.report.f
    public final void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32098620144402701a398f117986ab53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32098620144402701a398f117986ab53");
            return;
        }
        com.meituan.android.neohybrid.neo.report.b.b(str, null, map);
        com.meituan.android.neohybrid.neo.report.c.a(str2, map);
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5459c1c90fe140d80029d6f86fcd67", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5459c1c90fe140d80029d6f86fcd67") : this.c.i.a();
    }

    public final Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666da7b405f6ea46bc1c71b14166f1a9", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666da7b405f6ea46bc1c71b14166f1a9") : this.c.m;
    }
}
