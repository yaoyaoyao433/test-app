package com.meituan.msc.modules.container;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class l implements p {
    public static ChangeQuickRedirect D;
    protected r E;
    protected n F;
    protected Activity G;
    protected q H;
    protected com.meituan.msc.modules.page.c I;
    protected boolean J;
    int K;
    protected boolean L;

    public void c(Bundle bundle) {
    }

    public void d(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8757dddebfa2e532ce02ae558cb7d2a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8757dddebfa2e532ce02ae558cb7d2a4");
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964dce4796800cd2254b8a08992a9423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964dce4796800cd2254b8a08992a9423");
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "167a7a0ec37c4bf33ece9ab7f1c53002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "167a7a0ec37c4bf33ece9ab7f1c53002");
        }
    }

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b57d848b25ad47ea64e059913fabcbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b57d848b25ad47ea64e059913fabcbb");
        } else {
            this.J = false;
        }
    }

    public final l a(q qVar) {
        this.H = qVar;
        return this;
    }

    public final q z() {
        return this.H;
    }

    @Override // com.meituan.msc.modules.container.p
    public final boolean A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc3fc80eb75e52aababb2a8417c3bd3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc3fc80eb75e52aababb2a8417c3bd3")).booleanValue() : !B();
    }

    @Override // com.meituan.msc.modules.container.p
    @NonNull
    public final Activity C() {
        return this.G;
    }

    @Override // com.meituan.msc.modules.container.p
    public final boolean D() {
        return this.J;
    }

    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27afea6b936a061f880cbf39ba6bacf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27afea6b936a061f880cbf39ba6bacf9");
            return;
        }
        if (bundle == null) {
            this.K = hashCode() + ((int) SystemClock.elapsedRealtime());
        } else {
            this.K = bundle.getInt("containerId");
            com.meituan.msc.modules.reporter.g.b("containerId", "container restored: ", Integer.valueOf(this.K));
        }
        com.meituan.msc.common.utils.n.a(this.G);
    }

    public final boolean E() {
        return this.L;
    }

    public final void c(boolean z) {
        this.L = z;
    }

    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f212b808f9212280626f92bac58915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f212b808f9212280626f92bac58915");
            return;
        }
        this.J = false;
        if (this.H != null) {
            this.H.b(this);
        }
    }

    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2292d03c3fff769e1069bf8f012be77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2292d03c3fff769e1069bf8f012be77d");
            return;
        }
        this.J = true;
        if (this.H != null) {
            this.H.c(this);
        }
    }

    public void f(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e7f29eb59d3c6f33826258f8bd3241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e7f29eb59d3c6f33826258f8bd3241");
        } else {
            bundle.putInt("containerId", this.K);
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final int F() {
        return this.K;
    }

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a54220ffdc20623c4cfb228b8d419a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a54220ffdc20623c4cfb228b8d419a") : com.meituan.msc.common.utils.y.a(H(), str);
    }

    @Override // com.meituan.msc.modules.container.p
    public final r G() {
        return this.E;
    }

    public final void a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ff5e49602c9b3351d9f00037ecafc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ff5e49602c9b3351d9f00037ecafc8");
            return;
        }
        this.E = rVar;
        this.G = rVar.c();
    }

    @Override // com.meituan.msc.modules.container.p
    public final Intent H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025e1485f7ed6029793365f01ae11a95", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025e1485f7ed6029793365f01ae11a95") : this.E.getIntent();
    }

    @Override // com.meituan.msc.modules.container.p
    public final d.b I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d0b611ec2ca2f62bf8c4cdd051349a", RobustBitConfig.DEFAULT_VALUE) ? (d.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d0b611ec2ca2f62bf8c4cdd051349a") : this.E.getLifecycle().a();
    }

    public final boolean J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e7517b94b6fc47b4f8974e279d5695", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e7517b94b6fc47b4f8974e279d5695")).booleanValue() : B() && (this.E instanceof AppBrandMSCActivity);
    }

    public final boolean K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b9d53f91f42e29e66ba407aca58906", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b9d53f91f42e29e66ba407aca58906")).booleanValue() : I().a(d.b.RESUMED);
    }

    public final boolean L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c0d266f8cbe7abb1cb7673b1f3c228", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c0d266f8cbe7abb1cb7673b1f3c228")).booleanValue() : !I().a(d.b.CREATED);
    }

    public final n N() {
        return this.F;
    }

    public final boolean B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76df447177feb51f34b59897ae93a13", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76df447177feb51f34b59897ae93a13")).booleanValue() : this.E.d();
    }

    public void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2089cc46c216228998e2e3313e7a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2089cc46c216228998e2e3313e7a43");
        } else if (this.H != null) {
            this.H.d(this);
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4087d2a5a36c23b6d88b2b2159ac084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4087d2a5a36c23b6d88b2b2159ac084");
        } else if (this.H != null) {
            this.H.a(this, z);
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final boolean M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888d51d0ce21dbfbca9327afecbdcca6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888d51d0ce21dbfbca9327afecbdcca6")).booleanValue() : this.G.isFinishing();
    }
}
