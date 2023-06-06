package com.sankuai.waimai.store.orderlist.helper;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.store.util.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    public List<ButtonItem> c;
    public View d;
    public PopupWindow e;
    public ListView f;
    public b g;
    public String h;
    private C1257a i;
    private int[] j;
    private int k;
    private final Set<Integer> l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(ButtonItem buttonItem, int i);
    }

    public static /* synthetic */ void a(a aVar) {
        Object tag;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "863669a928f41d0f266eda1934f6f15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "863669a928f41d0f266eda1934f6f15b");
        } else if (aVar.f != null) {
            int childCount = aVar.f.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (aVar.f.getChildAt(i) != null && u.b(aVar.f.getChildAt(i), aVar.f) && (tag = aVar.f.getChildAt(i).getTag()) != null && (tag instanceof C1257a.C1258a)) {
                    C1257a.C1258a c1258a = (C1257a.C1258a) tag;
                    ButtonItem buttonItem = (ButtonItem) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.c, c1258a.b);
                    if (!aVar.l.contains(Integer.valueOf(c1258a.b)) && buttonItem != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("page_type", Integer.valueOf(aVar.k));
                        hashMap.put("button_name", buttonItem.title);
                        hashMap.put("status_code", Integer.valueOf(buttonItem.code));
                        hashMap.put("poi_id", aVar.h);
                        com.sankuai.waimai.store.manager.judas.b.b("c_waimai_m5pcse9e", "b_waimai_snhfvikt_mv").b(hashMap).a();
                        aVar.l.add(Integer.valueOf(c1258a.b));
                    }
                }
            }
        }
    }

    public a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d154351f61bdf3c6bd2030def2c137", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d154351f61bdf3c6bd2030def2c137");
            return;
        }
        this.e = null;
        this.i = null;
        this.j = new int[2];
        this.l = new HashSet();
        this.b = context;
        this.k = i;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501d47823aa490f863e1272cc2be5551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501d47823aa490f863e1272cc2be5551");
            return;
        }
        this.i = new C1257a(this.c);
        this.f.setAdapter((ListAdapter) this.i);
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82952e21a571043ae10f227cbaef3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82952e21a571043ae10f227cbaef3f9");
            return;
        }
        this.l.clear();
        int count = this.i.getCount();
        int dimensionPixelOffset = count >= 0 ? this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_36) * count : 0;
        int dimensionPixelOffset2 = count > 0 ? (count - 1) * this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1_half) : 0;
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
        int dimensionPixelOffset4 = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_51);
        int dimensionPixelOffset5 = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_50);
        int i = dimensionPixelOffset + dimensionPixelOffset2 + dimensionPixelOffset4 + dimensionPixelOffset3;
        if (i < 0) {
            i = 0;
        }
        int dimensionPixelOffset6 = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
        view.getLocationOnScreen(this.j);
        e.a aVar = new e.a();
        aVar.a(this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2));
        aVar.c(this.b.getResources().getColor(R.color.wm_st_common_white));
        aVar.a(this.b.getResources().getColor(R.color.wm_st_common_ffc4c4c4));
        aVar.b(1);
        this.f.setBackground(aVar.a());
        try {
            if (this.j[1] + i > h.b(this.b) - dimensionPixelOffset5) {
                p.a(this.e, view, -dimensionPixelOffset6, -i);
            } else {
                p.a(this.e, view, -dimensionPixelOffset6, 10);
            }
        } catch (Throwable th) {
            com.sankuai.shangou.stone.util.log.a.d("OrderListAdapterOrderMoreAction", "closeListWindow:" + th.getMessage(), new Object[0]);
        }
        this.f.post(new Runnable() { // from class: com.sankuai.waimai.store.orderlist.helper.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d9bd33ecf4e3e05983cf5dc72691a82", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d9bd33ecf4e3e05983cf5dc72691a82");
                } else {
                    a.a(a.this);
                }
            }
        });
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277afb16dff66eb5ba9f58f6f9565839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277afb16dff66eb5ba9f58f6f9565839");
            return;
        }
        try {
            if (this.e != null) {
                p.b(this.e);
            }
        } catch (Throwable th) {
            com.sankuai.shangou.stone.util.log.a.d("OrderListAdapterOrderMoreAction", "closeListWindow:" + th.getMessage(), new Object[0]);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.orderlist.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1257a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        private final List<ButtonItem> b;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.orderlist.helper.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C1258a {
            public TextView a;
            public int b;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public C1257a(List<ButtonItem> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ea86b318291d3e31de04075ed5b43e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ea86b318291d3e31de04075ed5b43e");
                return;
            }
            this.b = new ArrayList();
            this.b.clear();
            if (list != null) {
                this.b.addAll(list);
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06eb54e04b773cc98cc4f12a62045bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06eb54e04b773cc98cc4f12a62045bf")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.widget.Adapter
        /* renamed from: a */
        public ButtonItem getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f31da1ede2f9a539b21697aa0c6adc0", RobustBitConfig.DEFAULT_VALUE) ? (ButtonItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f31da1ede2f9a539b21697aa0c6adc0") : (ButtonItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C1258a c1258a;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e09813e28f44a45d69662ce2ec7e65", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e09813e28f44a45d69662ce2ec7e65");
            }
            if (view == null) {
                C1258a c1258a2 = new C1258a();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_order_list_adapter_order_more_item, viewGroup, false);
                c1258a2.a = (TextView) inflate.findViewById(R.id.txt_text);
                inflate.setTag(c1258a2);
                c1258a = c1258a2;
                view2 = inflate;
            } else {
                view2 = view;
                c1258a = (C1258a) view.getTag();
            }
            ButtonItem item = getItem(i);
            if (item != null && !TextUtils.isEmpty(item.title)) {
                c1258a.a.setVisibility(0);
                c1258a.a.setText(item.title);
                c1258a.b = i;
            } else {
                c1258a.a.setVisibility(8);
            }
            Object[] objArr2 = {item, c1258a};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed2d4f190c36550a88d7e50c6ed777bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed2d4f190c36550a88d7e50c6ed777bb");
            } else if (item != null && c1258a != null) {
                if (item.code == 2055) {
                    c1258a.a.setText(R.string.wm_sg_poi_have_subscribe);
                    c1258a.a.setTextColor(c1258a.a.getResources().getColor(R.color.wm_sg_color_BCBCBD));
                } else if (item.code == 2054) {
                    c1258a.a.setText(R.string.wm_sg_poi_can_subscribe);
                    c1258a.a.setTextColor(c1258a.a.getResources().getColor(R.color.wm_common_theme_dark));
                }
            }
            return view2;
        }
    }
}
