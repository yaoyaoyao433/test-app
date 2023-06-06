package com.sankuai.waimai.store.order.detail.blockview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.detail.model.LogisticsInfo;
import com.sankuai.waimai.business.order.api.model.OrderDeliverPackInfo;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.meituan.android.cube.pga.view.a implements View.OnClickListener {
    public static ChangeQuickRedirect e;
    private TextView d;
    boolean f;
    private TextView g;
    private View h;
    private String i;
    private ArrayList<String> j;
    private RecyclerView k;
    private ViewGroup l;
    private com.sankuai.waimai.store.order.detail.adapter.b m;
    private String n;
    private String o;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_logistics_entrance_view;
    }

    public boolean e() {
        return true;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9def40cfbbee75a83952b122289657", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9def40cfbbee75a83952b122289657");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4812a6d18978335e51cb27e99c55d23f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4812a6d18978335e51cb27e99c55d23f");
            return;
        }
        super.b();
        this.h = this.b;
        this.d = (TextView) this.b.findViewById(R.id.logistics_arrow);
        this.g = (TextView) this.b.findViewById(R.id.logistics_desc);
        this.l = (ViewGroup) this.b.findViewById(R.id.rl_express_info_defalult);
        if (e()) {
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.bottomMargin = 0;
            }
            View findViewById = this.b.findViewById(R.id.divider_line);
            ViewGroup.LayoutParams layoutParams2 = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.leftMargin = 0;
                marginLayoutParams2.rightMargin = 0;
            }
        }
        com.sankuai.waimai.store.view.a a = com.sankuai.waimai.store.view.a.a(this.c, (int) R.dimen.wm_sc_common_dimen_6, (int) R.dimen.wm_sc_common_dimen_10, (int) R.color.wm_sg_color_BCBCBD, a.EnumC1338a.RIGHT);
        this.d.setCompoundDrawablePadding(com.sankuai.shangou.stone.util.h.a(this.c, 7.0f));
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        this.k = (RecyclerView) this.b.findViewById(R.id.rv_express_info_container);
        this.k.setLayoutManager(new LinearLayoutManager(this.c));
        this.k.setNestedScrollingEnabled(false);
        this.k.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.order.detail.blockview.d.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77dad9292e657dbac341a12141512b7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77dad9292e657dbac341a12141512b7c");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (state.c() > 0) {
                    if (childAdapterPosition != state.c() - 1) {
                        rect.bottom = com.sankuai.shangou.stone.util.h.a(d.this.c, 18.0f);
                    } else {
                        rect.bottom = 0;
                    }
                }
            }
        });
        this.m = new com.sankuai.waimai.store.order.detail.adapter.b();
        this.k.setAdapter(new l(this.m));
    }

    public final void a(LogisticsInfo logisticsInfo, Long l, String str, boolean z) {
        Object[] objArr = {logisticsInfo, l, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012c0457336974c82fc7e5fa386d603f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012c0457336974c82fc7e5fa386d603f");
        } else if (logisticsInfo == null) {
            u.c(this.b);
        } else {
            u.a(this.b);
            com.sankuai.waimai.store.order.detail.adapter.b bVar = this.m;
            List<OrderDeliverPackInfo> list = logisticsInfo.packInfos;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.detail.adapter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4a186bc0f4d668686b8410ce5bf68c84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4a186bc0f4d668686b8410ce5bf68c84");
            } else {
                if (bVar.b == null) {
                    bVar.b = list;
                } else {
                    bVar.b.clear();
                    com.sankuai.shangou.stone.util.a.a((Collection) bVar.b, (Collection) list);
                }
                bVar.m();
            }
            String str2 = logisticsInfo.desc;
            if (!aa.a(str2)) {
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = e;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d123a8804e26c74bef768cabe043a93f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d123a8804e26c74bef768cabe043a93f");
                } else {
                    this.j = com.sankuai.waimai.store.order.detail.manager.a.a(str2, "((\\+?\\d{4}|\\d{3})?-?(\\d{7,8})(-\\d{1,2})?(\\d{1,2})?)|((\\d{4}|\\d{3})-(\\d{4}|\\d{3})-(\\d{4}|\\d{3}))");
                    SpannableString a = com.sankuai.waimai.store.order.detail.manager.a.a(str2, this.j, ColorUtils.a("#FF8000", (int) SupportMenu.CATEGORY_MASK), new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.blockview.d.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d90f05b42de45a650ee27c131925709a", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d90f05b42de45a650ee27c131925709a");
                            } else {
                                d.this.f = true;
                            }
                        }
                    });
                    this.g.setMovementMethod(LinkMovementMethod.getInstance());
                    this.g.setFocusable(false);
                    this.g.setText(a);
                }
            }
            this.i = logisticsInfo.schemaUrl;
            if (aa.a(this.i)) {
                this.d.setVisibility(8);
                if (this.j != null && !this.j.isEmpty()) {
                    this.g.setOnClickListener(this);
                }
            } else {
                this.d.setVisibility(0);
                this.g.setOnClickListener(this);
                this.h.setOnClickListener(this);
            }
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) logisticsInfo.packInfos)) {
                this.l.setVisibility(8);
            } else if (TextUtils.isEmpty(this.i) && TextUtils.isEmpty(str2)) {
                u.c(this.b);
            } else {
                this.l.setVisibility(0);
            }
            if (z) {
                this.k.setVisibility(0);
            } else {
                this.k.setVisibility(8);
            }
            if (this.k.getVisibility() != 0 && this.l.getVisibility() != 0) {
                u.c(this.b);
            }
            this.n = String.valueOf(l);
            this.o = String.valueOf(str);
            com.sankuai.waimai.store.order.detail.adapter.b bVar2 = this.m;
            String str3 = this.n;
            String str4 = this.o;
            bVar2.c = str3;
            bVar2.d = str4;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11aee465e313c27949e166c77897887d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11aee465e313c27949e166c77897887d");
            return;
        }
        if (!this.f) {
            if (!aa.a(this.i)) {
                com.sankuai.waimai.store.router.d.a(this.c, this.i);
            }
        } else {
            com.sankuai.waimai.store.order.detail.manager.a.a(this.c, this.j);
        }
        this.f = false;
    }
}
