package com.sankuai.waimai.store.search.template.poicate;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.search.model.LabelOnPicture;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.RecommendSummary;
import com.sankuai.waimai.store.search.model.SaleOutView;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import com.sankuai.waimai.store.search.view.SoldOutRemindView;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected View c;
    protected int d;
    protected PoiEntity e;
    protected int f;
    protected SaleOutView g;
    protected View h;
    protected SoldOutRemindView i;
    protected String j;
    protected String k;
    protected String l;
    protected TextView m;
    protected RecommendSummary n;
    protected SCSingleLineFlowLayout o;
    int p;
    protected boolean q;
    protected boolean r;
    protected List<SGSearchTagInfo> s;
    LinearLayout t;
    TagCanvasView u;
    com.sankuai.waimai.store.search.ui.result.dynamictag.d v;
    ImageView w;
    protected LabelOnPicture x;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.poicate.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1317a {
        void a(boolean z);
    }

    public abstract void b(T t);

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d141c7e371464a308c92c5ddbd07eb4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d141c7e371464a308c92c5ddbd07eb4f");
        } else if (aVar.w != null) {
            u.a(aVar.w, i);
        }
    }

    public a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b0e5e7fe09878fe10d91ad2432a2cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b0e5e7fe09878fe10d91ad2432a2cf");
            return;
        }
        this.p = 1;
        this.c = view;
        this.b = view.getContext();
        a(view);
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa7e40994d1de9230cde11c2f4b464a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa7e40994d1de9230cde11c2f4b464a");
            return;
        }
        this.h = view.findViewById(R.id.search_common_sold_out_layer);
        this.i = (SoldOutRemindView) view.findViewById(R.id.search_common_sold_out_view_container);
        this.m = (TextView) view.findViewById(R.id.search_common_text_align_image_bottom);
        this.o = (SCSingleLineFlowLayout) view.findViewById(R.id.search_common_recommend_summary);
        this.t = (LinearLayout) view.findViewById(R.id.search_common_dynamic_tag_container);
        this.u = (TagCanvasView) view.findViewById(R.id.search_common_dynamic_tag_view);
        this.w = (ImageView) view.findViewById(R.id.search_common_dynamic_tag_arrow);
    }

    public void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e832234c111b04e63e6e5491d16e6b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e832234c111b04e63e6e5491d16e6b47");
            return;
        }
        b(t);
        a();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e73dd01ddd3d3e4529f37c3cd1cb82a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e73dd01ddd3d3e4529f37c3cd1cb82a6");
            return;
        }
        b();
        c();
        if (d() || e() || f()) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "604085a291862961979f68a1df6add7d", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "604085a291862961979f68a1df6add7d")).booleanValue();
        } else if (this.m == null) {
        } else {
            RecommendSummary.RecommendTag recommendTag = null;
            if (this.n != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) this.n.recommendTags)) {
                Iterator<RecommendSummary.RecommendTag> it = this.n.recommendTags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RecommendSummary.RecommendTag next = it.next();
                    if (next != null && next.location == 1) {
                        recommendTag = next;
                        break;
                    }
                }
            }
            if (recommendTag != null) {
                this.m.setVisibility(0);
                this.m.setText(recommendTag.text);
                this.m.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
                this.m.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_color_80000000));
                return;
            }
            this.m.setVisibility(8);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e927cb2c5c1cab15dce3d6f39b7de00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e927cb2c5c1cab15dce3d6f39b7de00");
            return;
        }
        if (this.h != null) {
            this.h.setVisibility(8);
        }
        if (this.i != null) {
            this.i.setVisibility(8);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b90f7de5078db75aaf26fec18a7854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b90f7de5078db75aaf26fec18a7854");
        } else if (this.m != null) {
            this.m.setVisibility(8);
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59f647c277c7063ca6b390f4f23b188", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59f647c277c7063ca6b390f4f23b188")).booleanValue();
        }
        if (this.i == null) {
            return false;
        }
        if (this.g != null && this.d != 3 && this.f == 1) {
            if (this.h != null) {
                this.h.setVisibility(0);
            }
            this.i.setVisibility(0);
            this.i.a(this.g);
            return true;
        }
        if (this.h != null) {
            this.h.setVisibility(8);
        }
        this.i.setVisibility(8);
        return false;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e96f6c5122437716549814cb1b1469", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e96f6c5122437716549814cb1b1469")).booleanValue();
        }
        if (this.m == null) {
            return false;
        }
        if (TextUtils.isEmpty(this.j)) {
            this.m.setVisibility(8);
            return false;
        }
        this.m.setVisibility(0);
        this.m.setText(this.j);
        this.m.setTextColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_white));
        this.m.setBackgroundColor(this.b.getResources().getColor(R.color.wm_sc_nox_search_item_status_close));
        return true;
    }

    public boolean f() {
        String str;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f064821772418c3a6bc328a31112af9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f064821772418c3a6bc328a31112af9b")).booleanValue();
        }
        if (this.m == null) {
            return false;
        }
        int i2 = this.d;
        int i3 = R.color.wm_sc_nox_search_white;
        switch (i2) {
            case 2:
                str = this.k;
                i = R.color.wm_sc_nox_search_item_status_busy;
                break;
            case 3:
                str = this.k;
                i = R.color.wm_sc_nox_search_color_575859;
                break;
            default:
                str = null;
                i3 = 0;
                i = 0;
                break;
        }
        if (TextUtils.isEmpty(str)) {
            this.m.setVisibility(8);
            return false;
        }
        this.m.setVisibility(0);
        this.m.setText(str);
        this.m.setTextColor(this.b.getResources().getColor(i3));
        this.m.setBackgroundColor(this.b.getResources().getColor(i));
        return true;
    }

    public final boolean a(final InterfaceC1317a interfaceC1317a) {
        Object[] objArr = {interfaceC1317a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7270710682387af8afbe99d6223e2d43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7270710682387af8afbe99d6223e2d43")).booleanValue();
        }
        if (this.t == null || this.u == null) {
            return false;
        }
        if (!this.q || com.sankuai.shangou.stone.util.a.b(this.s)) {
            this.t.setVisibility(8);
            return false;
        }
        this.t.setVisibility(0);
        if (this.v == null) {
            this.v = new com.sankuai.waimai.store.search.ui.result.dynamictag.d(this.b, null);
            this.v.e = false;
            this.u.setAdapter(this.v);
        }
        if (this.r) {
            this.u.setMaxLines(Integer.MAX_VALUE);
        } else {
            this.u.setMaxLines(this.p);
        }
        this.v.b(com.sankuai.waimai.store.search.ui.result.dynamictag.b.a(this.b, this.s));
        this.v.notifyChanged();
        this.u.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.store.search.template.poicate.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf91ac3ef0b58c3c85d40e984a6f6e1a", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf91ac3ef0b58c3c85d40e984a6f6e1a")).booleanValue();
                }
                a.this.u.getViewTreeObserver().removeOnPreDrawListener(this);
                if (a.this.v.b().size() > a.this.p || a.this.v.d) {
                    u.a(a.this.w);
                    if (a.this.r) {
                        a.a(a.this, R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_up_search);
                    } else {
                        a.a(a.this, R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_down_search);
                    }
                    a.this.t.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.poicate.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "751dd5133f6224fa606b29c16e4e9f08", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "751dd5133f6224fa606b29c16e4e9f08");
                                return;
                            }
                            if (a.this.r) {
                                a.this.r = false;
                                a.a(a.this, R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_down_search);
                                a.this.u.setMaxLines(a.this.p);
                            } else {
                                a.this.r = true;
                                a.a(a.this, R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_up_search);
                                a.this.u.setMaxLines(Integer.MAX_VALUE);
                            }
                            if (interfaceC1317a != null) {
                                interfaceC1317a.a(a.this.r);
                            }
                        }
                    });
                } else {
                    u.c(a.this.w);
                    a.this.t.setOnClickListener(null);
                }
                return true;
            }
        });
        return true;
    }
}
