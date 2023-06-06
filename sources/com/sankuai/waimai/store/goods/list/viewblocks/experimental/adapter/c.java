package com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.d;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.h;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.j;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.repository.model.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends f<g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> {
    public static ChangeQuickRedirect a;
    private final e b;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "591805a7bc16b7d79e8aaccb7e0d437a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "591805a7bc16b7d79e8aaccb7e0d437a");
            return;
        }
        super.onViewRecycled(cVar2);
        cVar2.b.g();
    }

    public c(com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar, e eVar) {
        super(aVar);
        Object[] objArr = {aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e12f03e98f42e751e51048d9a7f2e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e12f03e98f42e751e51048d9a7f2e2");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        com.sankuai.waimai.store.newwidgets.list.g a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7130b37aa878a4f77fee2a69e3972850", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7130b37aa878a4f77fee2a69e3972850");
        }
        switch (i) {
            case 1:
            case 10:
            case 11:
                a2 = j.a(i);
                a2.q = false;
                break;
            case 2:
            case 7:
            case 8:
            default:
                a2 = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.f();
                break;
            case 3:
                a2 = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.c();
                break;
            case 4:
                a2 = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.b();
                break;
            case 5:
                a2 = new h((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.i);
                break;
            case 6:
                a2 = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.e(this.b);
                break;
            case 9:
                a2 = new d();
                break;
        }
        a2.a((com.sankuai.waimai.store.newwidgets.list.g) f());
        return a2;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb50dbb9c0f4a14af6864316c0b0532", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb50dbb9c0f4a14af6864316c0b0532")).intValue() : h(i).b;
    }
}
