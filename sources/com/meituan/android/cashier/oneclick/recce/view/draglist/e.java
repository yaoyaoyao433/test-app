package com.meituan.android.cashier.oneclick.recce.view.draglist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.cashier.oneclick.recce.view.draglist.c;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e<T extends c> extends RecyclerView.a<a> implements com.meituan.android.cashier.oneclick.recce.view.draglist.helper.a {
    public static ChangeQuickRedirect a;
    List<T> b;
    com.meituan.android.cashier.oneclick.recce.view.draglist.event.a c;
    int d;
    boolean e;
    private Context f;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6dc9e1d75b84cc948140dc45fb7a6f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6dc9e1d75b84cc948140dc45fb7a6f9");
            return;
        }
        T t = this.b.get(i);
        aVar2.e.setText(t.getItemContent());
        PayLabelContainer payLabelContainer = aVar2.g;
        List<Label> labels = t.getLabels();
        Object[] objArr2 = {labels};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.widgets.label.a.a;
        if (PatchProxy.isSupport(objArr2, payLabelContainer, changeQuickRedirect2, false, "5eb18b7d94b37e76381ee13e786d7103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, payLabelContainer, changeQuickRedirect2, false, "5eb18b7d94b37e76381ee13e786d7103");
        } else {
            payLabelContainer.a(labels, -1);
        }
        if (this.e) {
            aVar2.e.setTextColor(ContextCompat.getColor(this.f, R.color.cashieroneclick__drag_listview_item_text_color));
            aVar2.f.setImageResource(R.drawable.cashieroneclick__drag_listview_item_icon);
            return;
        }
        aVar2.e.setTextColor(ContextCompat.getColor(this.f, R.color.cashieroneclick__drag_listview_item_text_color_disable));
        aVar2.f.setImageResource(R.drawable.cashieroneclick__drag_listview_item_icon_disable);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d579aa1d4671d9d75574ff4431506c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d579aa1d4671d9d75574ff4431506c") : new a(this.f, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cashieroneclick__drag_listview_item, viewGroup, false), this.d);
    }

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73527fa46123e14d8a1e5afb9a5d981", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73527fa46123e14d8a1e5afb9a5d981");
            return;
        }
        this.d = -1;
        this.e = true;
        this.f = context;
        this.b = new ArrayList();
    }

    @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.helper.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f2b399c2b2b6e51eb07596f0d87bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f2b399c2b2b6e51eb07596f0d87bd0");
            return;
        }
        this.b.remove(i);
        notifyItemRemoved(i);
    }

    @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.helper.a
    public final boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d51979961984624d068d876d24bc04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d51979961984624d068d876d24bc04")).booleanValue();
        }
        Collections.swap(this.b, i, i2);
        notifyItemMoved(i, i2);
        if (this.c != null) {
            this.c.a(com.meituan.android.recce.utils.b.a().toJson(this.b));
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a6aa96934be85f92f7e3230d0f51da9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a6aa96934be85f92f7e3230d0f51da9")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.s implements com.meituan.android.cashier.oneclick.recce.view.draglist.helper.b {
        public static ChangeQuickRedirect a;
        public final float b;
        public final float c;
        public final float d;
        public final TextView e;
        public final ImageView f;
        public final PayLabelContainer g;
        public final View h;
        private Context i;
        private int j;

        public a(Context context, View view, int i) {
            super(view);
            Object[] objArr = {context, view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2967b05975b0637c294ef76cee78650", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2967b05975b0637c294ef76cee78650");
                return;
            }
            this.b = 1.03f;
            this.c = 1.0f;
            this.d = 10.0f;
            this.i = context;
            this.h = view;
            this.j = i;
            this.e = (TextView) view.findViewById(R.id.cashieroneclick__drag_listview_item_text);
            this.f = (ImageView) view.findViewById(R.id.cashieroneclick__drag_listview_item_icon);
            this.g = (PayLabelContainer) view.findViewById(R.id.cashieroneclick__drag_listview_item_label_container);
            view.setBackground(a(context, i));
        }

        @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.helper.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d6386bf9b681ab85cf683ee9671471", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d6386bf9b681ab85cf683ee9671471");
                return;
            }
            Context context = this.i;
            int i = this.j;
            Object[] objArr2 = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            GradientDrawable a2 = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d6953fa17d3094289729380122fa12f", RobustBitConfig.DEFAULT_VALUE) ? (GradientDrawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d6953fa17d3094289729380122fa12f") : a(context, i, R.drawable.cashieroneclick__drag_listview_item_background_pressed);
            View findViewById = this.h.findViewById(R.id.cashieroneclick__drag_listview_item_layout);
            findViewById.setBackground(a2);
            findViewById.setScaleY(1.03f);
            findViewById.setScaleX(1.03f);
            findViewById.setTranslationZ(10.0f);
        }

        @Override // com.meituan.android.cashier.oneclick.recce.view.draglist.helper.b
        @SuppressLint({"ResourceAsColor"})
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae3ff9cdd843314d77a8e1d33d63ec5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae3ff9cdd843314d77a8e1d33d63ec5");
                return;
            }
            GradientDrawable a2 = a(this.i, this.j);
            View findViewById = this.h.findViewById(R.id.cashieroneclick__drag_listview_item_layout);
            findViewById.setBackground(a2);
            findViewById.setScaleY(1.0f);
            findViewById.setScaleX(1.0f);
            findViewById.setTranslationZ(0.0f);
        }

        private GradientDrawable a(Context context, int i) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c52c402322b67c9d45fd6fb03d9253", RobustBitConfig.DEFAULT_VALUE) ? (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c52c402322b67c9d45fd6fb03d9253") : a(context, i, R.drawable.cashieroneclick__drag_listview_item_background);
        }

        private GradientDrawable a(Context context, int i, int i2) {
            Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06e5197d0a4acda795e7980da487847c", RobustBitConfig.DEFAULT_VALUE)) {
                return (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06e5197d0a4acda795e7980da487847c");
            }
            GradientDrawable gradientDrawable = (GradientDrawable) context.getResources().getDrawable(i2).mutate();
            gradientDrawable.setColor(i);
            return gradientDrawable;
        }
    }
}
