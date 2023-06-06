package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.view.view.a;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FilterBarViewHome extends LinearLayout {
    public static ChangeQuickRedirect a;
    private int A;
    public LinearLayout b;
    public ViewGroup c;
    private Context d;
    private LayoutInflater e;
    private LinearLayout f;
    private LinearLayout g;
    private b.g h;
    private b.d i;
    private b.f j;
    private b.e k;
    private b.h l;
    private b.c m;
    private boolean n;
    private TextView o;
    private View p;
    private View q;
    private View r;
    private View s;
    private int t;
    private int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public FilterBarViewHome(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "427e038d8b5f6d7dda009cf5a1c82521", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "427e038d8b5f6d7dda009cf5a1c82521");
            return;
        }
        this.n = true;
        this.u = -1;
        this.v = 0;
        this.w = 1;
        this.x = 2;
        this.y = 3;
        this.z = 4;
        a(context);
    }

    public FilterBarViewHome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3249a7e0417f3fee3099877a0341cdfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3249a7e0417f3fee3099877a0341cdfd");
            return;
        }
        this.n = true;
        this.u = -1;
        this.v = 0;
        this.w = 1;
        this.x = 2;
        this.y = 3;
        this.z = 4;
        a(context);
    }

    public FilterBarViewHome(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e74e4af0d52d42e6ebb27fa02ae26ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e74e4af0d52d42e6ebb27fa02ae26ef");
            return;
        }
        this.n = true;
        this.u = -1;
        this.v = 0;
        this.w = 1;
        this.x = 2;
        this.y = 3;
        this.z = 4;
        a(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd1fd4f89773445206c2865a44475d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd1fd4f89773445206c2865a44475d3");
        } else {
            super.onFinishInflate();
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1251029cbc81edee5a48b76aa21d6888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1251029cbc81edee5a48b76aa21d6888");
            return;
        }
        this.d = context;
        this.e = LayoutInflater.from(this.d);
        inflate(this.d, R.layout.wm_widget_filter_bar_bar_view_home, this);
        this.f = (LinearLayout) findViewById(R.id.filter_container);
        this.g = (LinearLayout) findViewById(R.id.filter_bar);
        this.b = (LinearLayout) findViewById(R.id.fast_filter_bar);
        this.c = (ViewGroup) findViewById(R.id.second_fast_filter_bar);
        setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04a6f9b962cbc658bc90d2019dfac58c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04a6f9b962cbc658bc90d2019dfac58c");
                }
            }
        });
        this.t = com.sankuai.waimai.platform.b.A().l() - com.sankuai.waimai.foundation.utils.g.a(this.d, 32.0f);
    }

    public void setFastFilterBarBackground(int i) {
        this.u = i;
    }

    public final boolean a(@NonNull com.sankuai.waimai.platform.widget.filterbar.view.model.a aVar, int i, boolean z) {
        boolean z2;
        Object[] objArr = {aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a933b7ab29696d71a8599c2628f55749", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a933b7ab29696d71a8599c2628f55749")).booleanValue();
        }
        if (aVar.a == null) {
            return false;
        }
        ArrayList<h.a> arrayList = aVar.a.a;
        ArrayList<h.a> arrayList2 = aVar.a.b;
        if ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) {
            return false;
        }
        this.g.removeAllViews();
        if (this.A == 1 || this.A == 2) {
            this.f.setPadding(com.sankuai.waimai.foundation.utils.g.a(this.d, 12.0f), getPaddingTop(), com.sankuai.waimai.foundation.utils.g.a(this.d, 12.0f), getPaddingBottom());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams.setMargins(com.sankuai.waimai.foundation.utils.g.a(this.d, 4.0f), layoutParams.topMargin, com.sankuai.waimai.foundation.utils.g.a(this.d, 4.0f), layoutParams.bottomMargin);
            this.g.setLayoutParams(layoutParams);
            this.t = com.sankuai.waimai.platform.b.A().l() - com.sankuai.waimai.foundation.utils.g.a(this.d, 24.0f);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z2 = false;
        } else {
            h.a aVar2 = arrayList.get(0);
            a(aVar2, true, aVar.b != null && aVar2.a == aVar.b.longValue());
            z2 = true;
        }
        setSortArrow(aVar.f && z);
        com.sankuai.waimai.platform.widget.filterbar.domain.model.f fVar = aVar.j == null ? new com.sankuai.waimai.platform.widget.filterbar.domain.model.f() : aVar.j;
        if (i == 1) {
            a(fVar, aVar.h && z);
        } else {
            View view = new View(this.d);
            view.setBackgroundColor(0);
            view.setLayoutParams(new LinearLayout.LayoutParams(this.t / 4, com.sankuai.waimai.foundation.utils.g.a(this.d, 1.0f)));
            this.g.addView(view);
        }
        this.s = a(aVar.l, aVar.k, aVar.e, aVar.i && z, true);
        if (this.s != null) {
            this.g.addView(this.s);
        }
        this.p = a(this.d.getResources().getString(R.string.takeout_widget_filter_bar_filter_new_style), aVar.c, aVar.d, aVar.g && z, false);
        if (this.p != null) {
            this.g.addView(this.p);
        }
        return z2;
    }

    public void setFilterViewArrow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5574a426a076bb9fe1bcbe10f17512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5574a426a076bb9fe1bcbe10f17512");
        } else if (this.p != null) {
            this.p.setSelected(z);
        }
    }

    public void setDynamicFilterViewArrow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d9fb4cba27bad02d034b00cc9a0435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d9fb4cba27bad02d034b00cc9a0435");
        } else if (this.s != null) {
            this.s.setSelected(z);
        }
    }

    public void setCategoryViewArrow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27712f25e2b4b3e848eeaaef7800e608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27712f25e2b4b3e848eeaaef7800e608");
        } else if (this.r != null) {
            this.r.setSelected(z);
        }
    }

    public void setSortArrow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e99d0a233ee0064f9b10c0e13c9863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e99d0a233ee0064f9b10c0e13c9863");
        } else if (this.o == null) {
        } else {
            if (z) {
                a(this.o);
            } else {
                b(this.o);
            }
            if (this.q != null) {
                this.q.setSelected(z);
            }
        }
    }

    public final boolean a(List<b.a.C1086a> list, Set<String> set) {
        Object[] objArr = {list, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2737faa3ebf3a50149b97ed61be2df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2737faa3ebf3a50149b97ed61be2df")).booleanValue();
        }
        this.b.removeAllViews();
        if (list == null || list.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (b.a.C1086a c1086a : list) {
            if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
                a(list.size(), c1086a, set != null && set.contains(c1086a.a));
                z = true;
            }
        }
        return z;
    }

    public void setOnTabSortClickListener(b.g gVar) {
        this.h = gVar;
    }

    public void setOnTabCategoryClickListener(b.d dVar) {
        this.i = dVar;
    }

    public void setOnTabFilterClickListener(b.f fVar) {
        this.j = fVar;
    }

    public void setOnTabDynamicFilterClickListener(b.e eVar) {
        this.k = eVar;
    }

    public void setOnTabSortItemClickListener(b.h hVar) {
        this.l = hVar;
    }

    public void setOnFastFilterItemClickListener(b.c cVar) {
        this.m = cVar;
    }

    public int getFastFilterBarOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f33b352ffc07bd0e389f9f7ec6e7aee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f33b352ffc07bd0e389f9f7ec6e7aee")).intValue();
        }
        if (this.b.getVisibility() == 0) {
            return getTop() - this.b.getTop();
        }
        return 0;
    }

    private void a(@NonNull com.sankuai.waimai.platform.widget.filterbar.domain.model.f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7a310b14d4ad0868d791e2da24e300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7a310b14d4ad0868d791e2da24e300");
        } else if (b(this.d)) {
            View a2 = a(2);
            ((TextView) a2.findViewById(R.id.filter_count)).setVisibility(8);
            TextView textView = (TextView) a2.findViewById(R.id.filter_text);
            a2.findViewById(R.id.filter_bubble).setVisibility(8);
            textView.setText(fVar.c);
            this.r = a2;
            a2.setSelected(z);
            if (z) {
                a(textView);
            } else {
                b(textView);
            }
            if (fVar.a != 0 || z) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                setFilterTextSelectedColor(textView);
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                setFilterTextNormalColor(textView);
            }
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae5f129dafcf56f3b0269f52eef7949e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae5f129dafcf56f3b0269f52eef7949e");
                    } else if (FilterBarViewHome.this.i != null) {
                        FilterBarViewHome.this.i.a(FilterBarViewHome.this.n);
                    }
                }
            });
            this.g.addView(a2);
        }
    }

    private void a(h.a aVar, boolean z, boolean z2) {
        Object[] objArr = {aVar, (byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ac558385b942feb6b88c8b6502f26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ac558385b942feb6b88c8b6502f26e");
        } else if (aVar == null || !b(this.d)) {
        } else {
            View a2 = a(0);
            ((TextView) a2.findViewById(R.id.filter_count)).setVisibility(8);
            TextView textView = (TextView) a2.findViewById(R.id.filter_text);
            View findViewById = a2.findViewById(R.id.filter_bubble);
            textView.setText(aVar.b);
            this.o = textView;
            this.q = a2;
            b(textView);
            if (z2) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                setFilterTextSelectedColor(textView);
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                setFilterTextNormalColor(textView);
            }
            if (aVar.h != null && aVar.h.a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc029d812ae7e502850f6ae4cadca85a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc029d812ae7e502850f6ae4cadca85a");
                    } else if (FilterBarViewHome.this.h != null) {
                        FilterBarViewHome.this.h.a(FilterBarViewHome.this.n);
                    }
                }
            });
            this.g.addView(a2);
        }
    }

    private View a(String str, int i, boolean z, boolean z2, final boolean z3) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b64677d48bd75ca9ed24cf253063ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b64677d48bd75ca9ed24cf253063ac");
        }
        if (b(this.d)) {
            View a2 = a(this.d.getResources().getString(R.string.takeout_widget_filter_bar_filter_new_style).equals(str) ? 4 : 3);
            TextView textView = (TextView) a2.findViewById(R.id.filter_count);
            TextView textView2 = (TextView) a2.findViewById(R.id.filter_text);
            View findViewById = a2.findViewById(R.id.filter_bubble);
            textView2.setText(str);
            if (i > 0) {
                textView.setVisibility(0);
                textView.setText(String.valueOf(i));
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView2.setTypeface(Typeface.defaultFromStyle(1));
                setFilterTextSelectedColor(textView2);
            } else {
                textView.setVisibility(8);
                b(textView2);
                textView2.setTypeface(Typeface.defaultFromStyle(0));
                setFilterTextNormalColor(textView2);
            }
            a2.setSelected(z2);
            if (z2) {
                textView2.setTypeface(Typeface.defaultFromStyle(1));
                setFilterTextSelectedColor(textView2);
                if (i <= 0) {
                    a(textView2);
                }
            }
            if (z) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd61605d0247769268fa73364aa08d32", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd61605d0247769268fa73364aa08d32");
                    } else if (!z3 && FilterBarViewHome.this.j != null) {
                        FilterBarViewHome.this.j.a(FilterBarViewHome.this.n);
                    } else if (!z3 || FilterBarViewHome.this.k == null) {
                    } else {
                        FilterBarViewHome.this.k.a(FilterBarViewHome.this.n);
                    }
                }
            });
            return a2;
        }
        return null;
    }

    private View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc47bfff8946ea406b33ccd0d33f199", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc47bfff8946ea406b33ccd0d33f199");
        }
        View inflate = this.e.inflate(R.layout.wm_widget_filter_bar_tab_item_home, (ViewGroup) this.g, false);
        if (this.A == 1 || this.A == 2) {
            this.t = com.sankuai.waimai.platform.b.A().l() - com.sankuai.waimai.foundation.utils.g.a(this.d, 32.0f);
        }
        inflate.setLayoutParams(new LinearLayout.LayoutParams(i == 1 ? this.t / 6 : this.t / 4, -2));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.filter_container);
        if (this.A == 1 || this.A == 2) {
            inflate.setPadding(inflate.getPaddingLeft(), 0, inflate.getPaddingRight(), inflate.getPaddingBottom());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.findViewById(R.id.filter_text).getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, com.sankuai.waimai.foundation.utils.g.a(this.d, 7.0f), layoutParams.rightMargin, com.sankuai.waimai.foundation.utils.g.a(this.d, 7.0f));
            inflate.findViewById(R.id.filter_text).setLayoutParams(layoutParams);
        }
        if (i == 0) {
            linearLayout.setGravity(3);
        } else if (i == 4) {
            linearLayout.setGravity(5);
        } else {
            linearLayout.setGravity(1);
        }
        return inflate;
    }

    private void a(int i, final b.a.C1086a c1086a, boolean z) {
        Object[] objArr = {Integer.valueOf(i), c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa81f49cdeeb7a3a01ffddfe626678a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa81f49cdeeb7a3a01ffddfe626678a9");
        } else if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
        } else {
            final a aVar = new a(this.d);
            final View a2 = aVar.a(this.b);
            if (this.A == 1 || this.A == 2) {
                aVar.a();
            }
            if (this.A == 1 || this.A == 2) {
                this.t = com.sankuai.waimai.platform.b.A().l() - com.sankuai.waimai.foundation.utils.g.a(this.d, 24.0f);
            }
            a2.setLayoutParams(new LinearLayout.LayoutParams((this.t - ((i - 1) * com.sankuai.waimai.foundation.utils.g.a(this.d, 8.0f))) / i, -2));
            if (this.u != -1) {
                aVar.a(this.u);
            }
            this.b.addView(a2);
            aVar.a(c1086a, z, false, new a.InterfaceC1094a() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.a.InterfaceC1094a
                public final void a() {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.a.InterfaceC1094a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "624d513d9c15728d7daffaa0b0816a4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "624d513d9c15728d7daffaa0b0816a4a");
                    } else {
                        FilterBarViewHome.this.b.removeView(a2);
                    }
                }
            });
            aVar.a(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b567cba6945572a1d445066342124a6f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b567cba6945572a1d445066342124a6f");
                    } else if (FilterBarViewHome.this.m == null || com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
                    } else {
                        b.c cVar = FilterBarViewHome.this.m;
                        b.a.C1086a c1086a2 = c1086a;
                        a aVar2 = aVar;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        cVar.a(c1086a2, PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "0f2a837df3d634d60ca1abf0ceb86569", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "0f2a837df3d634d60ca1abf0ceb86569")).booleanValue() : aVar2.d.isSelected() ? false : true, false, false);
                    }
                }
            });
        }
    }

    private boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d3416d916550a5dc30d52987c11bfb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d3416d916550a5dc30d52987c11bfb9")).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public void setPageType(int i) {
        this.A = i;
    }

    private void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee218204cf61f50e9d0d542e51884d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee218204cf61f50e9d0d542e51884d0");
        } else if (textView == null) {
        } else {
            if (this.A == 1 || this.A == 2) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.d.getResources().getDrawable(R.drawable.wm_wigdet_filter_bar_tab_icon_up_arrow), (Drawable) null);
                textView.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(this.d, 1.0f));
                return;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.d.getResources().getDrawable(R.drawable.wm_widget_filter_bar_tab_icon_sort_drop_up_home), (Drawable) null);
            textView.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(this.d, 4.0f));
        }
    }

    private void b(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1c3f7a97a5671862ef602202afa6c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1c3f7a97a5671862ef602202afa6c9");
        } else if (textView == null) {
        } else {
            if (this.A == 1 || this.A == 2) {
                textView.setTextSize(12.0f);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.d.getResources().getDrawable(R.drawable.wm_wigdet_filter_bar_tab_icon_down_arrow), (Drawable) null);
                textView.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(this.d, 1.0f));
                return;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.d.getResources().getDrawable(R.drawable.wm_widget_filter_bar_tab_icon_sort_drop_down_home), (Drawable) null);
            textView.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(this.d, 4.0f));
        }
    }

    private void setFilterTextSelectedColor(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8413d32ad46fb63a8ac376dd3c65b93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8413d32ad46fb63a8ac376dd3c65b93e");
        } else if (textView == null) {
        } else {
            if (this.A == 1 || this.A == 2) {
                textView.setTextSize(12.0f);
                textView.setTextColor(getResources().getColor(R.color.takeout_widget_filter_bar_text_bold_home_page));
                return;
            }
            textView.setTextColor(getResources().getColor(R.color.takeout_widget_filter_bar_text_bold_home));
        }
    }

    private void setFilterTextNormalColor(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8548cd0eec67425e768a2479da675a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8548cd0eec67425e768a2479da675a8");
        } else if (textView == null) {
        } else {
            if (this.A == 1 || this.A == 2) {
                textView.setTextSize(12.0f);
                textView.setTextColor(getResources().getColor(R.color.takeout_widget_filter_bar_text_normal_home_page));
                return;
            }
            textView.setTextColor(getResources().getColor(R.color.takeout_widget_filter_bar_text_normal));
        }
    }
}
