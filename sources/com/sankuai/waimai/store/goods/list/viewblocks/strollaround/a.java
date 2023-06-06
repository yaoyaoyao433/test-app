package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.newwidgets.list.f<PoiCommonMachListItem, c> {
    public static ChangeQuickRedirect a;
    private Context b;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4d948037e213a01bbabf5ff78d1bbd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4d948037e213a01bbabf5ff78d1bbd4");
            return;
        }
        super.onViewAttachedToWindow(cVar2);
        if (cVar2 == null || cVar2.itemView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar2.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            int adapterPosition = cVar2.getAdapterPosition();
            if (adapterPosition >= 0) {
                if (getItemViewType(adapterPosition) != 2) {
                    if (h(adapterPosition) == null || h(adapterPosition).spanSize != 1) {
                        if (h(adapterPosition) == null) {
                            bVar.b = true;
                            return;
                        } else {
                            bVar.b = false;
                            return;
                        }
                    }
                    bVar.b = true;
                    return;
                }
                bVar.b = true;
                return;
            }
            bVar.b = true;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087ba18012bd361f71c884ee2618f2b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087ba18012bd361f71c884ee2618f2b0");
            return;
        }
        super.onViewRecycled(cVar2);
        if (cVar2.b instanceof C1198a) {
            ((C1198a) cVar2.b).g();
        }
    }

    public a(@NonNull c cVar, Context context) {
        super(cVar);
        Object[] objArr = {cVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da2eac689259c6d08f7ecad31e79eb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da2eac689259c6d08f7ecad31e79eb0");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    public final void c_(List<PoiCommonMachListItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e307806102e443c501f374bbfc65536d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e307806102e443c501f374bbfc65536d");
        } else {
            super.c_(list);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8199436e0166fab50d9614dde9f916f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8199436e0166fab50d9614dde9f916f5");
        }
        if (i == 1) {
            return new C1198a(new e(this.b, ((c) this.i).k()));
        }
        return new b();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f, android.support.v7.widget.RecyclerView.a
    /* renamed from: a */
    public final void onBindViewHolder(@NonNull f.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1ddec64c10e1da4f893a20ec453c9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1ddec64c10e1da4f893a20ec453c9f");
            return;
        }
        super.onBindViewHolder(cVar, i);
        if (cVar == null || !(cVar.b instanceof C1198a)) {
            return;
        }
        ((C1198a) cVar.b).b.a("goods_detail_update_shopcart_account", ((c) this.i).l());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82bef08b34ca074f9c395f85b4c2bcb0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82bef08b34ca074f9c395f85b4c2bcb0")).intValue();
        }
        PoiCommonMachListItem h = h(i);
        if (h != null) {
            return h.mViewType;
        }
        return super.getItemViewType(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1198a extends g<PoiCommonMachListItem, c> {
        public static ChangeQuickRedirect a;
        public e b;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(PoiCommonMachListItem poiCommonMachListItem, int i) {
            PoiCommonMachListItem poiCommonMachListItem2 = poiCommonMachListItem;
            Object[] objArr = {poiCommonMachListItem2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b09a7ee7501abfbee45d26c5b22e17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b09a7ee7501abfbee45d26c5b22e17");
            } else {
                this.b.a(poiCommonMachListItem2, i);
            }
        }

        public C1198a(e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191d55e8dbbed058d425772124fa79dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191d55e8dbbed058d425772124fa79dc");
            } else {
                this.b = eVar;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "040c7eb79fe80c7edeeffa3b1348356b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "040c7eb79fe80c7edeeffa3b1348356b") : this.b.createView(viewGroup);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g, com.sankuai.waimai.store.newwidgets.list.h
        public final void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370223eb603d678b76c24b7be4dba062", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370223eb603d678b76c24b7be4dba062");
            } else if (this.b != null) {
                this.b.a();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends g<PoiCommonMachListItem, c> {
        public static ChangeQuickRedirect a;
        private TextView b;
        private com.sankuai.waimai.store.expose.v2.entity.b c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_goods_list_mach_title;
        }

        public b() {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(PoiCommonMachListItem poiCommonMachListItem, int i) {
            PoiCommonMachListItem poiCommonMachListItem2 = poiCommonMachListItem;
            Object[] objArr = {poiCommonMachListItem2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb3af2699e27771cd45f036cd853dc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb3af2699e27771cd45f036cd853dc1");
            } else if (poiCommonMachListItem2 != null) {
                u.a(this.b, poiCommonMachListItem2.title);
                com.sankuai.waimai.store.expose.v2.entity.b bVar = this.c;
                bVar.e = "GuessLikeHolder";
                bVar.a("poi_id", ((c) this.o).m().d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(((c) this.o).m().v()));
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3daf3df51b0428c02d00e9607fd250b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3daf3df51b0428c02d00e9607fd250b");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.tv_title);
            this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_uzunod3r", this.b);
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) view.getContext(), this.c);
        }
    }

    static {
        com.sankuai.waimai.store.goods.list.viewblocks.embed.a.b();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    public final void b_(List<PoiCommonMachListItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e01678898cc70fbfbb723f7d7b100589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e01678898cc70fbfbb723f7d7b100589");
            return;
        }
        List<T> list2 = this.f;
        list2.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            list2.addAll(list);
        }
        notifyDataSetChanged();
    }
}
