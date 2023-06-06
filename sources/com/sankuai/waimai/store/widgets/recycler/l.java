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
public class l<Holder extends RecyclerView.s> extends RecyclerView.a<Holder> {
    public static ChangeQuickRedirect c;
    @NonNull
    final i<Holder> d;

    public l(@NonNull i<Holder> iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2f240466a74df208a85cbd591f6605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2f240466a74df208a85cbd591f6605");
            return;
        }
        this.d = iVar;
        this.d.a(new h() { // from class: com.sankuai.waimai.store.widgets.recycler.l.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.h
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bd938e1b3218ca11ecf39dfefa8be61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bd938e1b3218ca11ecf39dfefa8be61");
                } else {
                    l.this.notifyDataSetChanged();
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.h
            public final void a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be5db655aa468074a44622ebc422d76a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be5db655aa468074a44622ebc422d76a");
                } else {
                    l.this.notifyItemRangeInserted(i, i2);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da66ccd78233b3f477b35066e58967b", RobustBitConfig.DEFAULT_VALUE) ? (Holder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da66ccd78233b3f477b35066e58967b") : this.d.b(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(Holder holder, int i) {
        Object[] objArr = {holder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1caa46ff98afd0c4653b2b3358e3f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1caa46ff98afd0c4653b2b3358e3f4");
        } else {
            this.d.a(holder, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92199c2f3dcdb53a746f13a7081af14", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92199c2f3dcdb53a746f13a7081af14")).intValue() : this.d.k();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469acbfdb3876db5431943561f3eeeb9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469acbfdb3876db5431943561f3eeeb9")).intValue() : this.d.e(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewRecycled(@NonNull Holder holder) {
        Object[] objArr = {holder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad2e49fa8d58e6e130cd3af8e14e0db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad2e49fa8d58e6e130cd3af8e14e0db");
            return;
        }
        super.onViewRecycled(holder);
        this.d.a((i<Holder>) holder);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewAttachedToWindow(Holder holder) {
        Object[] objArr = {holder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203ca6eb61037ac463efd61fbce94885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203ca6eb61037ac463efd61fbce94885");
            return;
        }
        super.onViewAttachedToWindow(holder);
        this.d.b(holder);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewDetachedFromWindow(@NonNull Holder holder) {
        Object[] objArr = {holder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52af02ac79982841afa9846e48960926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52af02ac79982841afa9846e48960926");
            return;
        }
        super.onViewDetachedFromWindow(holder);
        this.d.c(holder);
    }
}
