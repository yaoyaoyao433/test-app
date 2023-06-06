package com.sankuai.waimai.store.widgets.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j<Holder extends RecyclerView.s> extends RecyclerView.a<Holder> {
    public static ChangeQuickRedirect c;
    @NonNull
    final i<Holder> d;

    public j(@NonNull i<Holder> iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b20a205ec02b0ed52fc70ed377ff96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b20a205ec02b0ed52fc70ed377ff96");
            return;
        }
        this.d = iVar;
        this.d.a(new k() { // from class: com.sankuai.waimai.store.widgets.recycler.j.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.k
            public final void b(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c05c389dea12cf5ec1b16846dc40d746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c05c389dea12cf5ec1b16846dc40d746");
                } else {
                    j.this.notifyItemRangeChanged(i, i2);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.k
            public final void c(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88e46d63dd63533306a2c6c8a5bc63dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88e46d63dd63533306a2c6c8a5bc63dc");
                } else {
                    j.this.notifyItemRangeInserted(i, i2);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.k
            public final void d(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eee7b473ffe68051da3e0275433c2675", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eee7b473ffe68051da3e0275433c2675");
                } else {
                    j.this.notifyItemRangeRemoved(i, i2);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.h
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e7cf88995ce5e09fda66091c156f9ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e7cf88995ce5e09fda66091c156f9ff");
                } else {
                    j.this.notifyDataSetChanged();
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.h
            public final void a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "775c26fa44c40f442b3a3f3902b7d238", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "775c26fa44c40f442b3a3f3902b7d238");
                } else {
                    j.this.notifyItemRangeInserted(i, i2);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f63c6a3040182aa78672728710a72fa", RobustBitConfig.DEFAULT_VALUE) ? (Holder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f63c6a3040182aa78672728710a72fa") : this.d.b(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(Holder holder, int i) {
        Object[] objArr = {holder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590fc5f9de094bb678049a8db0b40d11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590fc5f9de094bb678049a8db0b40d11");
        } else {
            this.d.a(holder, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewRecycled(@NonNull Holder holder) {
        Object[] objArr = {holder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9956eb87b85ace364ba1c14639d4b0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9956eb87b85ace364ba1c14639d4b0f");
            return;
        }
        super.onViewRecycled(holder);
        this.d.a((i<Holder>) holder);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewDetachedFromWindow(@NonNull Holder holder) {
        Object[] objArr = {holder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ca3e962f41a40b8fe5bfd1530e20ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ca3e962f41a40b8fe5bfd1530e20ad");
            return;
        }
        super.onViewDetachedFromWindow(holder);
        this.d.c(holder);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71304588c05dcd68d1b65916f7504b60", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71304588c05dcd68d1b65916f7504b60")).intValue() : this.d.k();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7662d17754ff92b473d7a5198a6b2d6e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7662d17754ff92b473d7a5198a6b2d6e")).intValue() : this.d.e(i);
    }
}
