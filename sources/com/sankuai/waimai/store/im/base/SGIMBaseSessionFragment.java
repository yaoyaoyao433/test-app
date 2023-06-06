package com.sankuai.waimai.store.im.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGIMBaseSessionFragment extends SessionFragment implements com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect a;
    protected final MetricsSpeedMeterTask b;
    protected com.sankuai.waimai.store.im.base.i.a c;
    protected boolean d;
    protected boolean e;
    private boolean f;
    private boolean g;

    public abstract void a(String str, Bundle bundle);

    public SGIMBaseSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19b52d140528040452869c29f62a41d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19b52d140528040452869c29f62a41d6");
            return;
        }
        this.b = MetricsSpeedMeterTask.createPageSpeedMeterTask(this);
        this.f = false;
        this.g = false;
        this.d = false;
        this.e = false;
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    @Nullable
    public final /* synthetic */ Activity bB_() {
        return super.getActivity();
    }

    @Override // com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42018934a4b9f0c23ae098f7af7764e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42018934a4b9f0c23ae098f7af7764e");
            return;
        }
        this.b.recordStep("fragment_attach");
        super.onAttach(context);
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d83f5eb09e53f54a770de28ad12cd0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d83f5eb09e53f54a770de28ad12cd0b");
            return;
        }
        super.onDetach();
        b(false);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffac3aff463cb54628f566cc4f961e28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffac3aff463cb54628f566cc4f961e28");
            return;
        }
        this.b.recordStep("fragment_create");
        super.onCreate(bundle);
        getContext();
        SessionParams sessionParams = this.t;
        if (sessionParams != null) {
            a(sessionParams.u.getString("delegate_type", ""), sessionParams.u);
        }
        if (this.c != null) {
            this.c.a(bundle);
        }
    }

    private void b(boolean z) {
        boolean e;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "898df051569779f2b342fbdda16113cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "898df051569779f2b342fbdda16113cb");
        } else if (z == this.d || (e = e()) == this.d) {
        } else {
            this.d = e;
        }
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d50f188c19d830e3813f270fa1ce74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d50f188c19d830e3813f270fa1ce74");
            return;
        }
        this.e = z;
        b(z);
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d7abdd7bdd56ad1aac9d40fe19fe4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d7abdd7bdd56ad1aac9d40fe19fe4f")).booleanValue();
        }
        return this.e && super.isVisible() && getUserVisibleHint();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb05a1fc212aa32cf1ed9445dbf32ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb05a1fc212aa32cf1ed9445dbf32ca");
            return;
        }
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        super.onViewCreated(view, bundle);
        if (this.c != null) {
            this.c.a(view, bundle);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2996e35f22b5c31ad1549a925baac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2996e35f22b5c31ad1549a925baac2");
            return;
        }
        if (!this.f) {
            this.b.recordStep("fragment_start");
            this.f = true;
        }
        super.onStart();
        if (this.c != null) {
            this.c.b();
        }
        c(true);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "621cec54786c0cb959c8e763c36d0058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "621cec54786c0cb959c8e763c36d0058");
            return;
        }
        if (!this.g) {
            this.b.recordStep("fragment_resume");
            this.g = true;
        }
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
        if (this.c != null) {
            this.c.c();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "270ada7d3d6553062d5e4cac023a2eed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "270ada7d3d6553062d5e4cac023a2eed");
            return;
        }
        super.onDestroyView();
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
        if (this.c != null) {
            this.c.d();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5e4af975fd14a894fd909ca700902d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5e4af975fd14a894fd909ca700902d");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf5bb6ea8331ad3d1657517199a8fc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf5bb6ea8331ad3d1657517199a8fc5");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
        c(false);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbb44f1be93650aed3bdc9a3046c8be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbb44f1be93650aed3bdc9a3046c8be");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            this.c.e();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e99831c032e983ef5376d925f416b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e99831c032e983ef5376d925f416b6d");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1540e326dec171145b0aea38a0ed1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1540e326dec171145b0aea38a0ed1a");
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dd08f902ab59aeed3a595a85b9ec35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dd08f902ab59aeed3a595a85b9ec35");
        } else {
            super.onViewStateRestored(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17804b3cd43854a36c251d4f6558b8d8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17804b3cd43854a36c251d4f6558b8d8") : getView();
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d41dc6600ba0af31af85136b9c0cc4ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d41dc6600ba0af31af85136b9c0cc4ac");
            return;
        }
        super.onHiddenChanged(z);
        b(!z ? 1 : 0);
    }
}
