package com.meituan.android.cube.pga.block;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.meituan.android.cube.core.f;
import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b<ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends f {
    public static ChangeQuickRedirect j;
    private List<b> f;
    private ContextType g;
    public WeakReference<b> k;
    com.meituan.android.cube.pga.common.f l;
    com.meituan.android.cube.pga.common.f m;
    public ViewModelType n;
    Bundle o;
    protected boolean p;
    boolean q;

    public void A() {
    }

    public void H() {
    }

    public void I() {
    }

    public ViewModelType L() {
        return null;
    }

    public void a(@Nullable b bVar) {
    }

    public final List<b> E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4572112672cf9cd5c7ea5b64768df37f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4572112672cf9cd5c7ea5b64768df37f");
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        return this.f;
    }

    public ContextType F() {
        return this.g;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd086ec04f76ba2ac7d172d7b41fcab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd086ec04f76ba2ac7d172d7b41fcab5");
            return;
        }
        this.m = new com.meituan.android.cube.pga.common.f();
        this.p = false;
        this.q = true;
    }

    public b(ContextType contexttype) {
        this();
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fef258ad0f253d1d65ae9ca8030bbd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fef258ad0f253d1d65ae9ca8030bbd0");
        } else {
            a((b<ViewModelType, ContextType>) contexttype);
        }
    }

    public void a(ContextType contexttype) {
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea1b65949d59eba7f865fd6fb6ba310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea1b65949d59eba7f865fd6fb6ba310");
            return;
        }
        this.g = contexttype;
        this.b = (com.meituan.android.cube.core.b) contexttype;
        s();
        H();
    }

    public ViewModelType G() {
        return this.n;
    }

    @CallSuper
    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e0ea686491a67418563464ac6ec5c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e0ea686491a67418563464ac6ec5c9");
            return;
        }
        this.n = L();
        this.g.f().a(new com.meituan.android.cube.pga.action.a() { // from class: com.meituan.android.cube.pga.block.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5adf2f602621edabcb4487772d492d6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5adf2f602621edabcb4487772d492d6c");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.j;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "75b360a95eb331044045a1203c0712e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "75b360a95eb331044045a1203c0712e6");
                } else if (bVar.l != null) {
                    bVar.l.a();
                    bVar.l = null;
                }
                b.this.m.a();
                b.this.m = null;
                if (b.this.e) {
                    return;
                }
                b.this.bE_();
            }
        }).a(this.m);
    }

    public void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad77baadde7c95dad29e032c9e31c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad77baadde7c95dad29e032c9e31c83");
            return;
        }
        b(obj);
        t();
    }

    public void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826db35782816ff2aa6becfed157bcae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826db35782816ff2aa6becfed157bcae");
            return;
        }
        if (this.n != null) {
            this.n.a(obj);
        }
        if (this.q) {
            for (b bVar : E()) {
                if (!bVar.p) {
                    com.meituan.android.cube.pga.action.c<Object, DataType> cVar = bVar.n.f;
                    bVar.b(cVar == 0 ? obj : cVar.a(obj));
                }
            }
        }
    }

    @CallSuper
    public void a(ViewModelType viewmodeltype) {
        Object[] objArr = {viewmodeltype};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035149f9f14e6bd9e921953facce4b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035149f9f14e6bd9e921953facce4b7d");
            return;
        }
        this.n = viewmodeltype;
        I();
    }

    public void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a68a1f16594817583388adb70d8ca3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a68a1f16594817583388adb70d8ca3d");
            return;
        }
        bVar.a((b) this);
        E().add(bVar);
        bVar.c((b) this);
        bVar.A();
    }

    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11db04dfa0fb00d38c27e4b73b5dc34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11db04dfa0fb00d38c27e4b73b5dc34");
            return;
        }
        for (b bVar : E()) {
            bVar.v();
        }
        b D = D();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, D, changeQuickRedirect2, false, "3daeddb90eabb1c228afec1bdaa9a5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, D, changeQuickRedirect2, false, "3daeddb90eabb1c228afec1bdaa9a5ab");
        } else {
            D.E().remove(this);
        }
        a((b) null);
    }

    @CallSuper
    public void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff0160298a92edda1b5d46abcb87d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff0160298a92edda1b5d46abcb87d7d");
            return;
        }
        for (b bVar : E()) {
            bVar.v();
        }
    }

    public final com.meituan.android.cube.pga.common.f J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9d65e58ff0ce02d6b29362123fde4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.common.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9d65e58ff0ce02d6b29362123fde4e");
        }
        if (this.l == null) {
            this.l = new com.meituan.android.cube.pga.common.f();
        }
        return this.l;
    }

    public final Bundle K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8c7eb0701f74896fb73aa3b6a9154d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8c7eb0701f74896fb73aa3b6a9154d");
        }
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028743a2111fd066d67b05eef6197bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028743a2111fd066d67b05eef6197bf8");
            return;
        }
        List<b> E = E();
        for (int i = 0; i < E.size(); i++) {
            E.get(i).b(bundle);
        }
    }

    public final void a(com.meituan.android.cube.pga.action.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c1b2d154e3e14ab2eee480ee0f5393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c1b2d154e3e14ab2eee480ee0f5393");
        } else {
            this.n.f = cVar;
        }
    }

    @Nullable
    public b D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e19010710d55fd6eaeb26a865fe92685", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e19010710d55fd6eaeb26a865fe92685");
        }
        if (this.k == null) {
            return null;
        }
        return this.k.get();
    }

    public final void c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0767175deb02c253ed71508d7a399624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0767175deb02c253ed71508d7a399624");
        } else {
            this.k = new WeakReference<>(bVar);
        }
    }

    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d414cec7ae94c16557c1cf959b0faea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d414cec7ae94c16557c1cf959b0faea");
            return;
        }
        if (this.q) {
            for (b bVar : E()) {
                if (!bVar.p) {
                    bVar.t();
                }
            }
        }
        I();
    }

    public void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a5e7ce5ee35259a2eb3b63a9c2d3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a5e7ce5ee35259a2eb3b63a9c2d3f7");
            return;
        }
        this.o = bundle;
        List<b> E = E();
        for (int i = 0; i < E.size(); i++) {
            b bVar = E.get(i);
            bVar.o = bundle;
            bVar.c(bundle);
        }
    }
}
