package com.sankuai.waimai.drug.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.drug.adapter.a;
import com.sankuai.waimai.store.util.l;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.f, a.InterfaceC0932a> {
    public static ChangeQuickRedirect a;
    TextView b;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private View d;
    private TextView e;
    private ImageView f;
    private TextView g;
    private View h;
    private View i;
    private com.sankuai.waimai.store.expose.v2.entity.b j;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shopcart_adapter_pocket_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.drug.model.f fVar, int i) {
        final com.sankuai.waimai.drug.model.f fVar2 = fVar;
        Object[] objArr = {fVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277763efca28a388f50c23bae0e016cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277763efca28a388f50c23bae0e016cd");
            return;
        }
        Object[] objArr2 = {fVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52a8db704422341c1927eed2bd0205e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52a8db704422341c1927eed2bd0205e6");
        } else if (fVar2 != null) {
            String str = fVar2.i;
            String str2 = fVar2.k;
            Object[] objArr3 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a72e1e377ab12a93a6328dc655cb2de3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a72e1e377ab12a93a6328dc655cb2de3");
            } else {
                this.g.setText(str);
                if (!TextUtils.isEmpty(str2)) {
                    this.e.setText(l.a(str2, this.p.getContext().getString(R.string.wm_st_shop_cart_high_light_color)), TextView.BufferType.SPANNABLE);
                }
            }
            this.d.setOnClickListener(null);
            Object[] objArr4 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "63762108d43baa9fbe7842bcca0f69ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "63762108d43baa9fbe7842bcca0f69ba");
            } else {
                if (fVar2.e == com.sankuai.waimai.drug.model.f.b) {
                    this.f.setVisibility(0);
                    this.b.setVisibility(0);
                    this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.viewHolder.f.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr5 = {view};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b8440e38d275b16b9ec7bb158a03bd5b", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b8440e38d275b16b9ec7bb158a03bd5b");
                                return;
                            }
                            String plusScheme = f.this.c.b.getPlusScheme();
                            if (t.a(plusScheme)) {
                                return;
                            }
                            com.sankuai.waimai.store.router.d.a(f.this.p.getContext(), plusScheme);
                        }
                    });
                } else if (!t.a(fVar2.m)) {
                    this.f.setVisibility(0);
                    this.b.setVisibility(0);
                    this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.viewHolder.f.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr5 = {view};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b49dddb819b595945e80b8d82f137d96", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b49dddb819b595945e80b8d82f137d96");
                                return;
                            }
                            String str3 = fVar2.n;
                            if (!t.a(str3)) {
                                com.sankuai.waimai.store.router.d.a(f.this.p.getContext(), str3);
                            }
                            String charSequence = f.this.b.getText().toString();
                            com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(f.this.b.getContext(), "b_waimai_sg_746oriy9_mc").a("poi_id", f.this.c.d());
                            if (t.a(charSequence)) {
                                charSequence = "-999";
                            }
                            a2.a("title", charSequence).a("activity_id", t.a(fVar2.q) ? "-999" : fVar2.q).a();
                        }
                    });
                    String str3 = fVar2.q;
                    Object[] objArr5 = {str3};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e75af75c30cb95341064c2a3a2d46412", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e75af75c30cb95341064c2a3a2d46412");
                    } else {
                        if (this.j == null) {
                            this.j = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_746oriy9_mv", this.b);
                            if (this.p.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.p.getContext(), this.j);
                            }
                        }
                        String charSequence = this.b.getText().toString();
                        this.j.a("poi_id", this.c.d());
                        com.sankuai.waimai.store.expose.v2.entity.b bVar = this.j;
                        if (t.a(charSequence)) {
                            charSequence = "-999";
                        }
                        bVar.a("title", charSequence);
                        com.sankuai.waimai.store.expose.v2.entity.b bVar2 = this.j;
                        if (t.a(str3)) {
                            str3 = "-999";
                        }
                        bVar2.a("activity_id", str3);
                    }
                } else {
                    this.f.setVisibility(4);
                    this.b.setVisibility(4);
                }
                String str4 = fVar2.m;
                TextView textView = this.b;
                if (str4 == null) {
                    str4 = "";
                }
                u.a(textView, l.a(str4, com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_high_light_color)));
            }
            Object[] objArr6 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e221f60c9e6da2a49fc10f35265a5780", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e221f60c9e6da2a49fc10f35265a5780");
            } else if (TextUtils.isEmpty(fVar2.i)) {
                this.h.setVisibility(0);
                this.d.setVisibility(8);
                this.i.setVisibility(8);
            } else {
                this.h.setVisibility(8);
                this.i.setVisibility(0);
                this.d.setVisibility(0);
            }
        }
    }

    public f(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f68686f21dc631315d18d7d5797b3db1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f68686f21dc631315d18d7d5797b3db1");
        } else {
            this.c = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6323a186450318f643a92945297e15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6323a186450318f643a92945297e15");
            return;
        }
        this.d = view.findViewById(R.id.layout_pocket);
        this.h = view.findViewById(R.id.blank_view);
        this.i = view.findViewById(R.id.view_food_divider);
        this.g = (TextView) view.findViewById(R.id.txt_promotion_info);
        this.e = (TextView) view.findViewById(R.id.txt_cart_desc);
        this.b = (TextView) view.findViewById(R.id.text_plus_tag);
        this.f = (ImageView) view.findViewById(R.id.img_shop_cart_arrow);
        this.f.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.f.getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sg_color_FF6D27, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT));
    }
}
