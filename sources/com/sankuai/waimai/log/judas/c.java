package com.sankuai.waimai.log.judas;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c<VH extends RecyclerView.s> extends RecyclerView.a<VH> {
    public static ChangeQuickRedirect i;
    StatisticsRecyclerView.a j;

    public abstract VH a(ViewGroup viewGroup, int i2);

    public void a(ViewGroup viewGroup, int i2, VH vh) {
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final VH onCreateViewHolder(ViewGroup viewGroup, int i2) {
        Object[] objArr = {viewGroup, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0875f269011bc5463c4e3307c7c4a856", RobustBitConfig.DEFAULT_VALUE)) {
            return (VH) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0875f269011bc5463c4e3307c7c4a856");
        }
        VH a = a(viewGroup, i2);
        if (a != null) {
            a.itemView.setTag(a);
            a.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.log.judas.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a19992ed65d785179db6a12705615a8e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a19992ed65d785179db6a12705615a8e");
                    } else if (c.this.j != null) {
                        c.this.j.a(view, ((RecyclerView.s) view.getTag()).getAdapterPosition());
                    }
                }
            });
        }
        a(viewGroup, i2, a);
        return a;
    }
}
