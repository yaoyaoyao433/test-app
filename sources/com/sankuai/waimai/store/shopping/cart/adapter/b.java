package com.sankuai.waimai.store.shopping.cart.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    private List<ShopCartTotalBoxPriceInfo.a> b;
    private final Context c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae96fe894514dbb174746793e4477b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae96fe894514dbb174746793e4477b83");
            return;
        }
        ShopCartTotalBoxPriceInfo.a aVar3 = (ShopCartTotalBoxPriceInfo.a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        Object[] objArr2 = {aVar3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "eaca64a935227fe80298562f41d02d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "eaca64a935227fe80298562f41d02d4e");
        } else if (aVar3 != null) {
            aVar2.b.setText(aVar3.a);
            aVar2.c.setText(aVar3.b);
            aVar2.d.setText(aVar3.c);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4845d4c16cacdfe7ba0e9f835912c9f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4845d4c16cacdfe7ba0e9f835912c9f") : new a(LayoutInflater.from(this.c).inflate(R.layout.wm_sc_shopcart_box_fee_dialog_item, viewGroup, false));
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656db3c29c133614411fc30da1206539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656db3c29c133614411fc30da1206539");
        } else {
            this.c = context;
        }
    }

    public final void a(List<ShopCartTotalBoxPriceInfo.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba55363c06d3b8af575c416077e06a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba55363c06d3b8af575c416077e06a9");
            return;
        }
        this.b = list;
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf67b916c8c270e1158efc5f6443c30", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf67b916c8c270e1158efc5f6443c30")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        TextView b;
        TextView c;
        TextView d;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf839b4f78d45060f48619ce6f4de59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf839b4f78d45060f48619ce6f4de59");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.product_name);
            this.c = (TextView) view.findViewById(R.id.box_fee_price);
            this.d = (TextView) view.findViewById(R.id.box_fee_per);
        }
    }
}
