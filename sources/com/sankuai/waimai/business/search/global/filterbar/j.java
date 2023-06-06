package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends BaseAdapter {
    public static ChangeQuickRedirect a;
    int b;
    private Context c;
    private List<h.a> d;
    private int e;
    private int f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public j(Context context, List<h.a> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d687979fd0e315c3b1059c8bfd95bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d687979fd0e315c3b1059c8bfd95bd");
            return;
        }
        this.d = new ArrayList();
        this.b = 0;
        this.e = context.getResources().getColor(R.color.takeout_widget_filter_bar_filter_category_dialog_count_text_normal);
        this.f = context.getResources().getColor(R.color.takeout_widget_search_filter_bar_sort_dialog_item_text_selected);
        this.c = context;
        if (list != null) {
            this.d.addAll(list);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66fa94a0e6deec0f18209379f3fbbda", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66fa94a0e6deec0f18209379f3fbbda")).intValue() : this.d.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a */
    public h.a getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b79d38fcb8f2c016c41d88a1cbff83", RobustBitConfig.DEFAULT_VALUE)) {
            return (h.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b79d38fcb8f2c016c41d88a1cbff83");
        }
        if (this.d == null || i >= this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8b631a87ddf448577cc1a984206c20", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8b631a87ddf448577cc1a984206c20");
        }
        if (view == null) {
            a aVar2 = new a();
            View inflate = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.wm_widget_filter_bar_sort_dialog_sort_item, viewGroup, false);
            aVar2.a = (RelativeLayout) inflate.findViewById(R.id.ll_sort_discount_wrapper);
            aVar2.b = (TextView) inflate.findViewById(R.id.txt_text);
            aVar2.c = (TextView) inflate.findViewById(R.id.txt_bubble);
            inflate.setTag(aVar2);
            aVar = aVar2;
            view2 = inflate;
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        h.a item = getItem(i);
        if (item != null) {
            Object[] objArr2 = {aVar, item, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be646d9620d0927d7c7db1e76ff2a586", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be646d9620d0927d7c7db1e76ff2a586");
            } else {
                aVar.b.setText(item.b);
                if (item.h != null && item.h.a) {
                    aVar.c.setVisibility(0);
                } else {
                    aVar.c.setVisibility(8);
                }
                if (i == this.b) {
                    aVar.b.setTextColor(this.f);
                    aVar.b.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    aVar.b.setTextColor(this.e);
                    aVar.b.setTypeface(Typeface.DEFAULT);
                }
            }
        }
        return view2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a {
        public RelativeLayout a;
        public TextView b;
        public TextView c;

        private a() {
        }
    }
}
