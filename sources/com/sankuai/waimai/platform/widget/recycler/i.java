package com.sankuai.waimai.platform.widget.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i<Holder extends RecyclerView.s> extends RecyclerView.a<Holder> {
    public static ChangeQuickRedirect a;
    @NonNull
    private final g<Holder> b;

    public i(@NonNull g<Holder> gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d604b7ae00a49672c62be5fc697e5d14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d604b7ae00a49672c62be5fc697e5d14");
            return;
        }
        this.b = gVar;
        this.b.a(new e() { // from class: com.sankuai.waimai.platform.widget.recycler.i.1
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72caf2ea5ebdbc584eda67636d232b2", RobustBitConfig.DEFAULT_VALUE) ? (Holder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72caf2ea5ebdbc584eda67636d232b2") : this.b.a_(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(Holder holder, int i) {
        Object[] objArr = {holder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528a289da84f0b4f50a52e82c384757a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528a289da84f0b4f50a52e82c384757a");
        } else {
            this.b.a(holder, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277c7241d98ed4237351182219077e88", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277c7241d98ed4237351182219077e88")).intValue() : this.b.e();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7563f9c4ff36f4b207d17a84127c76bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7563f9c4ff36f4b207d17a84127c76bf")).intValue() : this.b.g(i);
    }
}
