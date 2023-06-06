package com.sankuai.waimai.business.page.common.arch;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.pga.common.c;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T> extends com.meituan.android.cube.pga.block.a {
    public static ChangeQuickRedirect r;
    public PageFragment s;
    public Context t;
    public View u;
    private T v;
    private boolean w;
    private int x;
    private int y;

    public void N() {
    }

    @Override // com.meituan.android.cube.pga.block.a
    public View a(ViewGroup viewGroup) {
        return viewGroup;
    }

    public void a(PageFragment pageFragment) {
    }

    public void b(Rect rect) {
    }

    public void d(T t) {
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        return null;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09aeae8149655debe64ebc77074cbe1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09aeae8149655debe64ebc77074cbe1f");
        } else {
            this.w = false;
        }
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        this((PageFragment) aVar.h());
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b85a0f8b95502056230b0c314f9095e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b85a0f8b95502056230b0c314f9095e2");
        }
    }

    public a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd54042b243431d738809c4d0091b40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd54042b243431d738809c4d0091b40");
            return;
        }
        this.w = false;
        this.s = pageFragment;
        this.t = pageFragment.F;
    }

    public final View M() {
        return this.u;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.meituan.android.cube.pga.viewmodel.a] */
    public final void O() {
        c j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1de089521418cac2c4ee90fce006493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1de089521418cac2c4ee90fce006493");
            return;
        }
        if (this.w) {
            d((a<T>) this.v);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fceab8d87cd3795c828761b0b51f5d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fceab8d87cd3795c828761b0b51f5d0");
            } else if (this.u != null && G() != 0 && G().j() != null && (j = G().j()) != null) {
                int i = j.a;
                int i2 = j.b;
                if (i != this.x || i2 != this.y) {
                    ViewGroup.LayoutParams layoutParams = this.u.getLayoutParams();
                    if (layoutParams instanceof RecyclerView.g) {
                        RecyclerView.g gVar = (RecyclerView.g) layoutParams;
                        if (j != null) {
                            gVar.topMargin = g.a(b.a, j.a);
                            gVar.bottomMargin = g.a(b.a, j.b);
                            this.x = i;
                            this.y = i2;
                            this.u.setLayoutParams(gVar);
                        }
                    }
                }
            }
        }
        this.w = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5c560cf5343ffd74aa3556a0543a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5c560cf5343ffd74aa3556a0543a5b");
            return;
        }
        super.a((a<T>) aVar);
        e(aVar.f());
    }

    public final void e(T t) {
        this.v = t;
        this.w = true;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cde8e3dafc347ed229cbd7afff3cd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cde8e3dafc347ed229cbd7afff3cd01");
        } else {
            y();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.core.f
    public View i() {
        return this.u;
    }

    public final View b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8e1aad085792c6af8687b4176e23f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8e1aad085792c6af8687b4176e23f7");
        }
        if (this.u == null) {
            this.u = a(viewGroup);
        }
        return this.u;
    }
}
