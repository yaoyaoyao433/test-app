package com.sankuai.waimai.bussiness.order.base.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.location.AddressCategory;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    public c b;
    public int c;
    private ArrayList<AddressCategory> d;
    private Context e;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94cf5bb9b6a929d544ddcf2934e12ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94cf5bb9b6a929d544ddcf2934e12ca");
            return;
        }
        aVar2.a.setText(this.d.get(i).categoryName);
        if (this.c == i) {
            aVar2.a.setBackground(this.e.getResources().getDrawable(R.drawable.wm_order_confirm_label_select_bg));
            aVar2.a.setTextColor(this.e.getResources().getColor(R.color.wm_common_text_highlight));
        } else {
            aVar2.a.setBackground(this.e.getResources().getDrawable(R.drawable.wm_order_confirm_label_normal_bg));
            aVar2.a.setTextColor(this.e.getResources().getColor(R.color.takeout_black11));
        }
        aVar2.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.adapter.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "023a4471e78eb82c3e13746a4f51e295", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "023a4471e78eb82c3e13746a4f51e295");
                } else {
                    b.this.b.a(view);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cbb6632ee192a4d36d1343b12d041f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cbb6632ee192a4d36d1343b12d041f4");
        }
        View inflate = LayoutInflater.from(this.e).inflate(R.layout.wm_order_confirm_label, viewGroup, false);
        a aVar = new a(inflate);
        inflate.setTag(aVar);
        return aVar;
    }

    public b(Context context, List<AddressCategory> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b59a451e5e6476fa1f06310b3d8d90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b59a451e5e6476fa1f06310b3d8d90");
            return;
        }
        this.d = new ArrayList<>();
        this.c = -1;
        this.e = context;
        this.d.addAll(list);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf07109184000a5cbd6ff46523febd1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf07109184000a5cbd6ff46523febd1")).intValue() : this.d.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.s {
        public TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.txt_label);
        }
    }
}
