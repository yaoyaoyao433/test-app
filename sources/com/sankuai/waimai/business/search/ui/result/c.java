package com.sankuai.waimai.business.search.ui.result;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.adapterdelegates.d;
import com.sankuai.waimai.business.search.adapterdelegates.e;
import com.sankuai.waimai.business.search.ui.result.itemViewDelegate.f;
import com.sankuai.waimai.business.search.ui.result.mach.g;
import com.sankuai.waimai.business.search.ui.result.mach.h;
import com.sankuai.waimai.business.search.ui.result.pouch.c;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends e {
    public static ChangeQuickRedirect e;
    public b f;
    private d<List<Serializable>> g;
    private ResultFragment h;
    private com.sankuai.waimai.business.search.common.data.d i;
    private Context j;

    public c(ResultFragment resultFragment, Context context, com.sankuai.waimai.business.search.common.data.d dVar, b bVar, String str) {
        Object[] objArr = {resultFragment, context, dVar, bVar, str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a27ea0c95aacccbb3a45c1d78283bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a27ea0c95aacccbb3a45c1d78283bf");
            return;
        }
        this.h = resultFragment;
        this.j = context;
        this.i = dVar;
        this.f = bVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b5aa39cc245f5d0027265cd957b5a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b5aa39cc245f5d0027265cd957b5a2f");
            return;
        }
        this.g = new d<>();
        this.g.a(new g(this.j));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.noresult.b(this.j));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.itemViewDelegate.c(this.j, this.f));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.itemViewDelegate.g(this.j, this.h, this.f));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.pouch.c(this.h, this.j));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.itemViewDelegate.e(this.j));
        this.g.a(new f(this.j));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.itemViewDelegate.a(this.j));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.noresult.a(this.j));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.itemViewDelegate.b(this.j, this.h));
        this.g.a(new com.sankuai.waimai.business.search.ui.result.itemViewDelegate.d(this.j));
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37baa1c5981b67253194aa9fcc7206ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37baa1c5981b67253194aa9fcc7206ac");
        } else {
            com.sankuai.waimai.business.search.statistics.c.a(this.i);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.e
    public final int b() {
        if (this.i == null) {
            return 0;
        }
        return this.i.size();
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.e
    public final int c(int i) {
        return this.g.a((d<List<Serializable>>) this.i, i);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.e
    @NonNull
    public final RecyclerView.s a(@NonNull ViewGroup viewGroup, int i) {
        return this.g.a(viewGroup, i);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.e
    public final void a(@NonNull RecyclerView.s sVar, int i) {
        this.g.a(this.i, i, sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191ea448d34dc5aebbf3e1e80bed6f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191ea448d34dc5aebbf3e1e80bed6f04");
            return;
        }
        super.onViewDetachedFromWindow(sVar);
        this.g.b(sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewAttachedToWindow(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7cea27a235e6a27118c02473db0ae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7cea27a235e6a27118c02473db0ae4");
            return;
        }
        super.onViewAttachedToWindow(sVar);
        this.g.a(sVar);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewRecycled(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37c3ab914dde1f0221e99233de9d272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37c3ab914dde1f0221e99233de9d272");
            return;
        }
        super.onViewRecycled(sVar);
        if (sVar instanceof g.a) {
            g.a aVar = (g.a) sVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "40a92c819c24c5c2000e73c8160bdc1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "40a92c819c24c5c2000e73c8160bdc1e");
                return;
            }
            h hVar = aVar.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "0a0f3513fb129078c5f69270e2debccd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "0a0f3513fb129078c5f69270e2debccd");
            } else if (hVar.g != null) {
                hVar.g.b(hVar.f);
            }
        } else if (sVar instanceof c.a) {
            c.a aVar2 = (c.a) sVar;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c.a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "75416bdc718b2004f5598f3c7e6b991c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "75416bdc718b2004f5598f3c7e6b991c");
                return;
            }
            com.sankuai.waimai.business.search.ui.result.pouch.f fVar = aVar2.b;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.search.ui.result.pouch.f.a;
            if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "c78846095b26b3688442ae9e71419c11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "c78846095b26b3688442ae9e71419c11");
            } else if (fVar.f != null) {
                com.sankuai.waimai.pouch.a aVar3 = fVar.f;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.pouch.a.a;
                if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "cd13f21c7abc74f89e7993f1f4162672", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "cd13f21c7abc74f89e7993f1f4162672");
                } else if (aVar3.b != null) {
                    aVar3.b.e();
                }
            }
        }
    }
}
