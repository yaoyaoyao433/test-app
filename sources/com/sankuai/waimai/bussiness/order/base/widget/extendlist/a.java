package com.sankuai.waimai.bussiness.order.base.widget.extendlist;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends c<com.sankuai.waimai.bussiness.order.base.model.c> {
    public static ChangeQuickRedirect a;

    public a(Context context, List<com.sankuai.waimai.bussiness.order.base.model.c> list) {
        super(context, list);
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6957feda8bc94aed6738a71113d019b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6957feda8bc94aed6738a71113d019b1");
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0887a c0887a;
        View view2;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1931ee63b5077c1ca10586259085a3a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1931ee63b5077c1ca10586259085a3a0");
        }
        if (view == null) {
            c0887a = new C0887a();
            view2 = LayoutInflater.from(this.f).inflate(R.layout.wm_order_base_adapter_delivery_time_item_first, viewGroup, false);
            c0887a.a = (TextView) view2.findViewById(R.id.txt_delivery_time_item);
            view2.setTag(c0887a);
        } else {
            c0887a = (C0887a) view.getTag();
            view2 = view;
        }
        com.sankuai.waimai.bussiness.order.base.model.c cVar = (com.sankuai.waimai.bussiness.order.base.model.c) this.e.get(i);
        c0887a.a.setText(cVar.b);
        if (i == this.e.size() - 1 && this.c == i) {
            this.d.setBackgroundResource(R.drawable.wm_order_base_adapter_right_top_corner_bg);
        } else {
            this.d.setBackgroundColor(-657930);
        }
        if (this.c == i) {
            c0887a.a.setBackgroundColor(-1);
        } else if (this.c > 0 && this.c - 1 == i) {
            c0887a.a.setBackgroundResource(R.drawable.wm_order_base_adapter_right_bottom_corner_bg);
        } else if (this.c + 1 == i) {
            c0887a.a.setBackgroundResource(R.drawable.wm_order_base_adapter_right_top_corner_bg);
        } else {
            c0887a.a.setBackgroundColor(-657930);
        }
        if (this.c == i) {
            TextView textView = c0887a.a;
            textView.setContentDescription(cVar.b + "，已选中");
        } else {
            c0887a.a.setContentDescription(cVar.b);
        }
        return view2;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.widget.extendlist.c
    public final List a(int i) {
        com.sankuai.waimai.bussiness.order.base.model.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a2b99844d0130ddf3e5fc00ef51086", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a2b99844d0130ddf3e5fc00ef51086");
        }
        if (this.e == null || i < 0 || this.e.size() <= i || (cVar = (com.sankuai.waimai.bussiness.order.base.model.c) this.e.get(i)) == null) {
            return null;
        }
        return cVar.c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.base.widget.extendlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0887a {
        public TextView a;

        public C0887a() {
        }
    }
}
