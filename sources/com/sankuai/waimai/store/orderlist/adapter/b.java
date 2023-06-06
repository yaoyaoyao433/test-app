package com.sankuai.waimai.store.orderlist.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    OrderListFragment b;
    public String c;
    public String d;
    private Context e;

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        return 1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f958b1f3b1d55f9f84e435746b973d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f958b1f3b1d55f9f84e435746b973d34");
            return;
        }
        if (!TextUtils.isEmpty(this.d)) {
            aVar2.a.setVisibility(0);
            aVar2.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.adapter.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b52e31bb983e870659063ce9e6efea9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b52e31bb983e870659063ce9e6efea9");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_7lvi26jz_mc").a();
                    if (b.this.b != null) {
                        b.this.b.a(1);
                    }
                }
            });
        } else {
            aVar2.a.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.c)) {
            aVar2.c.setVisibility(0);
            aVar2.c.setText(this.c);
        } else {
            aVar2.c.setVisibility(8);
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = aVar2.d;
        bVar.e = "b_waimai_fzc8v7me_mv" + i + this.c;
        bVar.a("page_type", 0);
        if (this.e instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.e, bVar);
        } else {
            com.sankuai.shangou.stone.util.log.a.d("OrderListNoItemAdapter", "mContext is not IExposeHost", new Object[0]);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5aaa0e86d24bf23763c3a62ef2c50d6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5aaa0e86d24bf23763c3a62ef2c50d6") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_order_list_no_order, viewGroup, false));
    }

    public b(OrderListFragment orderListFragment) {
        Object[] objArr = {orderListFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac8087373bc3e7aaf6d73aabc6d3a97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac8087373bc3e7aaf6d73aabc6d3a97");
            return;
        }
        this.e = orderListFragment.getActivity();
        this.b = orderListFragment;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.s {
        public TextView a;
        public View b;
        public TextView c;
        public com.sankuai.waimai.store.expose.v2.entity.b d;

        public a(View view) {
            super(view);
            this.d = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_fzc8v7me_mv", view);
            this.a = (TextView) view.findViewById(R.id.btn_info);
            this.b = view.findViewById(R.id.layout_info);
            this.c = (TextView) view.findViewById(R.id.bottom_txt);
        }
    }
}
