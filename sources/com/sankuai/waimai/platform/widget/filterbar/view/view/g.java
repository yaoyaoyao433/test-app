package com.sankuai.waimai.platform.widget.filterbar.view.view;

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
/* loaded from: classes5.dex */
public final class g extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private Context b;
    private List<h.a> c;
    private int d;
    private int e;
    private int f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public g(Context context, List<h.a> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b7af849ac2b2b601df68f2e1da8d4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b7af849ac2b2b601df68f2e1da8d4d");
            return;
        }
        this.c = new ArrayList();
        this.d = 0;
        this.e = context.getResources().getColor(R.color.takeout_widget_filter_bar_sort_dialog_item_text_unselected);
        this.f = context.getResources().getColor(R.color.takeout_widget_filter_bar_sort_dialog_item_text_selected);
        this.b = context;
        if (list != null) {
            this.c.addAll(list);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69aeb13358f8afbfc4f002afc3bdf570", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69aeb13358f8afbfc4f002afc3bdf570")).intValue() : this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: b */
    public h.a getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b27dbe1774de1c1ce36d9227dcc30b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (h.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b27dbe1774de1c1ce36d9227dcc30b5");
        }
        if (this.c == null || i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beca76bfc49e9d56dde0a4f9e4b31d6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beca76bfc49e9d56dde0a4f9e4b31d6a");
        }
        if (view == null) {
            a aVar2 = new a();
            View inflate = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.wm_widget_filter_bar_sort_dialog_sort_item_home, viewGroup, false);
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
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73da17351f8f3697dd8eb9084224e6cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73da17351f8f3697dd8eb9084224e6cd");
            } else {
                aVar.b.setText(item.b);
                if (item.h != null && item.h.a) {
                    aVar.c.setVisibility(0);
                } else {
                    aVar.c.setVisibility(8);
                }
                if (i == this.d) {
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

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a2bc5a2ca83f3e00fe98183d848775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a2bc5a2ca83f3e00fe98183d848775");
            return;
        }
        this.d = i;
        notifyDataSetChanged();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a {
        public RelativeLayout a;
        public TextView b;
        public TextView c;

        private a() {
        }
    }
}
