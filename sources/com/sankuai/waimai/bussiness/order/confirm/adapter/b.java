package com.sankuai.waimai.bussiness.order.confirm.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    Context b;
    private final int c;
    private List<DiscountItem.d.c> d;

    public b(Context context, List<DiscountItem.d.c> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee0d76c8c54c1088a546c3fa338d40d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee0d76c8c54c1088a546c3fa338d40d");
            return;
        }
        this.c = 6;
        this.b = context;
        this.d = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.waimai.bussiness.order.confirm.adapter.b.a r19, android.view.View r20, com.sankuai.waimai.business.order.api.submit.model.DiscountItem.d.c r21) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.adapter.b.a(com.sankuai.waimai.bussiness.order.confirm.adapter.b$a, android.view.View, com.sankuai.waimai.business.order.api.submit.model.DiscountItem$d$c):void");
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8332d23318dcda7f0e4490eb3c017402", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8332d23318dcda7f0e4490eb3c017402") : new a(LayoutInflater.from(this.b).inflate(R.layout.wm_order_confirm_adapter_allowance_food_list_item, (ViewGroup) null));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "913b03b2b42ec7e97faf5b06a4fa89e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "913b03b2b42ec7e97faf5b06a4fa89e3");
        } else if (sVar instanceof a) {
            a((a) sVar, sVar.itemView, this.d.get(i));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5a4fe628c3af26c8e839c6ab767303a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5a4fe628c3af26c8e839c6ab767303a")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public TextView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public ImageView f;
        public ViewGroup g;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.txt_product_name);
            this.b = (TextView) view.findViewById(R.id.txt_allowance_reduce);
            this.c = (TextView) view.findViewById(R.id.txt_food_count);
            this.d = (TextView) view.findViewById(R.id.txt_product_spec);
            this.e = (TextView) view.findViewById(R.id.txt_allowance_tip);
            this.f = (ImageView) view.findViewById(R.id.img_good);
            this.g = (LinearLayout) view.findViewById(R.id.layout_product_spec);
        }
    }
}
