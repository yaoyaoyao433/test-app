package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
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
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private Context b;
    private List<CategoryBean.Category> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private View h;
    private int i;
    private int j;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public e(Context context, View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae83738a6fdae7b7fd206c60d9ace98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae83738a6fdae7b7fd206c60d9ace98");
            return;
        }
        this.c = new ArrayList();
        this.d = 0;
        this.e = context.getResources().getColor(R.color.takeout_widget_filter_bar_filter_category_dialog_name_text_normal);
        this.f = context.getResources().getColor(R.color.takeout_widget_filter_bar_filter_category_dialog_text_selected);
        this.g = context.getResources().getColor(R.color.takeout_widget_filter_bar_filter_category_dialog_count_text_normal);
        this.b = context;
        this.h = view;
        this.i = context.getResources().getDimensionPixelSize(R.dimen.takeout_widget_filter_bar_category_item_padding) * 2;
    }

    public final void a(List<CategoryBean.Category> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1a6a39ab6a031f6d993a8663616c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1a6a39ab6a031f6d993a8663616c12");
            return;
        }
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db1c99928bc608dfb24431ba610461ed", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db1c99928bc608dfb24431ba610461ed")).intValue() : this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: b */
    public CategoryBean.Category getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "684daa27977dee014fe5b7ca074db4d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (CategoryBean.Category) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "684daa27977dee014fe5b7ca074db4d7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6093bc9bb6cb444ecef049bdf4e7bb60", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6093bc9bb6cb444ecef049bdf4e7bb60");
        }
        if (view == null) {
            a aVar2 = new a();
            View inflate = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.wm_widget_filter_bar_category_dialog_item, viewGroup, false);
            aVar2.a = (RelativeLayout) inflate.findViewById(R.id.rl_category_item);
            aVar2.b = (TextView) inflate.findViewById(R.id.txt_text);
            aVar2.c = (TextView) inflate.findViewById(R.id.txt_count);
            inflate.setTag(aVar2);
            aVar = aVar2;
            view2 = inflate;
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        CategoryBean.Category item = getItem(i);
        if (item != null) {
            Object[] objArr2 = {aVar, item, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "955cee965dbfb3fd076af3c4110e3cd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "955cee965dbfb3fd076af3c4110e3cd5");
            } else {
                if (item.quantity < 10000) {
                    aVar.c.setText(String.valueOf(item.quantity));
                } else {
                    aVar.c.setText("9999+");
                }
                if (aVar.a.getMeasuredWidth() > 0) {
                    this.j = aVar.a.getMeasuredWidth();
                }
                if (i == this.d) {
                    aVar.b.setTextColor(this.f);
                    aVar.b.setTypeface(Typeface.DEFAULT_BOLD);
                    aVar.c.setTextColor(this.f);
                    aVar.c.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    aVar.b.setTextColor(this.e);
                    aVar.b.setTypeface(Typeface.DEFAULT);
                    aVar.c.setTextColor(this.g);
                    aVar.c.setTypeface(Typeface.DEFAULT);
                }
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57845cc4878137e12138ed503a6df6e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57845cc4878137e12138ed503a6df6e1");
                } else if (this.j != 0) {
                    Paint paint = new Paint();
                    paint.setTextSize(aVar.c.getTextSize());
                    paint.setTypeface(aVar.c.getTypeface());
                    aVar.b.setMaxWidth((this.j - ((int) paint.measureText(aVar.c.getText().toString()))) - this.i);
                }
                aVar.b.setText(item.name);
                Object[] objArr4 = {aVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "29c9fc5f893b86f81480ec3fbde1c9cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "29c9fc5f893b86f81480ec3fbde1c9cb");
                } else if (this.h != null) {
                    if (i == this.d) {
                        aVar.a.setBackground(new ColorDrawable(this.b.getResources().getColor(R.color.white)));
                    } else if (i == this.d - 1) {
                        aVar.a.setBackgroundResource(R.drawable.wm_widget_filter_bar_category_item_bottom_round_rect);
                    } else if (i == this.d + 1) {
                        aVar.a.setBackgroundResource(R.drawable.wm_widget_filter_bar_category_item_top_round_rect);
                    } else {
                        aVar.a.setBackgroundResource(R.drawable.wm_widget_filter_bar_category_item_round_rect);
                    }
                    if (i == this.d && i == getCount() - 1) {
                        this.h.setBackgroundResource(R.drawable.wm_widget_filter_bar_category_item_top_round_rect);
                    } else {
                        this.h.setBackground(new ColorDrawable(this.b.getResources().getColor(R.color.takeout_widget_filter_bar_filter_main_category_bg)));
                    }
                }
            }
        }
        return view2;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d5d7d808bfdb982247f7113251e254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d5d7d808bfdb982247f7113251e254");
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
