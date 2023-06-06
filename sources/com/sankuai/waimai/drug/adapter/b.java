package com.sankuai.waimai.drug.adapter;

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
/* loaded from: classes4.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    public List<ShopCartTotalBoxPriceInfo.a> b;
    private final Context c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e2e605bb1bf64a6f29d5c7e1b64541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e2e605bb1bf64a6f29d5c7e1b64541");
            return;
        }
        ShopCartTotalBoxPriceInfo.a aVar3 = (ShopCartTotalBoxPriceInfo.a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        Object[] objArr2 = {aVar3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "bf22377d75e57024d868aeebcbe86cfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "bf22377d75e57024d868aeebcbe86cfd");
        } else if (aVar3 != null) {
            aVar2.b.setText(aVar3.a);
            aVar2.c.setText(aVar3.c);
            aVar2.d.setText(aVar3.b);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9225efd8c40c8524514512be5af730", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9225efd8c40c8524514512be5af730") : new a(LayoutInflater.from(this.c).inflate(R.layout.wm_drug_shopcart_box_fee_dialog_item, viewGroup, false));
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d7c64782b7d829ba38a6f6faf971d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d7c64782b7d829ba38a6f6faf971d3");
        } else {
            this.c = context;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea129115c38f70facb1778c827ffa51", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea129115c38f70facb1778c827ffa51")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        TextView b;
        TextView c;
        TextView d;

        public a(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f222886139903a40928c7b117baf8928", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f222886139903a40928c7b117baf8928");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.product_name);
            this.c = (TextView) view.findViewById(R.id.box_fee_desc);
            this.d = (TextView) view.findViewById(R.id.box_fee_price);
        }
    }
}
