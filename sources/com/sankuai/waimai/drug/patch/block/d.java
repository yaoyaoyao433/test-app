package com.sankuai.waimai.drug.patch.block;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.drug.patch.adapter.b;
import com.sankuai.waimai.drug.patch.block.c;
import com.sankuai.waimai.drug.patch.block.v2.f;
import com.sankuai.waimai.drug.patch.block.v2.h;
import com.sankuai.waimai.drug.patch.block.v2.j;
import com.sankuai.waimai.drug.patch.block.v2.k;
import com.sankuai.waimai.drug.patch.contract.b;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends a implements View.OnClickListener, com.sankuai.waimai.drug.contract.b, com.sankuai.waimai.drug.patch.a, c.a, com.sankuai.waimai.drug.patch.contract.a, b.InterfaceC0944b, com.sankuai.waimai.drug.patch.contract.c {
    public static ChangeQuickRedirect b;
    final com.sankuai.waimai.store.shopping.cart.contract.a c;
    private final String d;
    private final SCPageConfig e;
    private final b.a f;
    private b g;
    private c h;
    private h i;
    private k j;
    private com.sankuai.waimai.drug.patch.block.v2.a k;
    private View l;
    private DrugNetInfoLoadView m;
    private TextView n;
    private int o;
    private boolean p;
    private int q;
    @Nullable
    private GoodsSpu r;
    @Nullable
    private GoodsSku s;
    private int t;
    private String u;
    private String v;
    private String w;
    private String x;

    public d(String str, @NonNull Context context, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @Nonnull SCPageConfig sCPageConfig, com.sankuai.waimai.store.shopping.cart.contract.a aVar2) {
        super(context);
        Object[] objArr = {str, context, aVar, sCPageConfig, aVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5e09e99884fdeb2430269a6b710832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5e09e99884fdeb2430269a6b710832");
            return;
        }
        this.o = 1;
        this.p = false;
        this.c = aVar2;
        this.d = str;
        this.e = sCPageConfig;
        this.x = i.a(aVar.s());
        this.f = new com.sankuai.waimai.drug.patch.presenter.a(this, aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2bd0d608c34571c66893475f355d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2bd0d608c34571c66893475f355d4f");
            return;
        }
        super.onViewCreated();
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.drug.patch.block.d.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.l = findView(R.id.black_gap_view);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.patch.block.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7777e9e6ad753631a48ebfe9d2717f0c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7777e9e6ad753631a48ebfe9d2717f0c");
                } else {
                    d.this.a(view);
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76386ef4c9e1333770d2768ed8da08ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76386ef4c9e1333770d2768ed8da08ee");
        } else {
            this.m = (DrugNetInfoLoadView) findView(R.id.patchwork_list_layout_info);
            DrugNetInfoLoadView drugNetInfoLoadView = this.m;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = DrugNetInfoLoadView.a;
            if (PatchProxy.isSupport(objArr3, drugNetInfoLoadView, changeQuickRedirect3, false, "95fb56d34451aa10c6c86a1c5e1fa835", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, drugNetInfoLoadView, changeQuickRedirect3, false, "95fb56d34451aa10c6c86a1c5e1fa835");
            } else {
                drugNetInfoLoadView.c.b = true;
            }
            this.m.setReloadClickListener(this);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f3097d18e9e5208de1dbf8cda1e29544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f3097d18e9e5208de1dbf8cda1e29544");
        } else {
            this.g = new b(getContext(), j(), this, this, this.c, this);
            this.g.bindView(this.mView.findViewById(R.id.new_rv_patchwork_list));
            this.g.hide();
            this.h = new c(this.mContext, this, this);
            this.h.bindView(this.mView.findViewById(R.id.new_patch_head));
            this.h.hide();
            this.i = new h(this, getContext(), this, j(), this);
            this.i.bindView(this.mView.findViewById(R.id.new_rv_patchwork_list_root_v2));
            this.i.hide();
            this.j = new k(this.mContext);
            this.j.bindView(this.mView.findViewById(R.id.new_patch_head_v2));
            this.j.hide();
            this.n = (TextView) this.mView.findViewById(R.id.tv_patchwork_tip_text);
            this.k = new com.sankuai.waimai.drug.patch.block.v2.a(this.mContext, this);
            this.k.bindView(this.mView.findViewById(R.id.content_anim_view));
            this.k.d = this.j.e;
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "09c396e7f629ce1c5cf752e3e7466705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "09c396e7f629ce1c5cf752e3e7466705");
            return;
        }
        TextView textView = (TextView) findView(R.id.b2c_patch_select_done_tv);
        if (this.c != null && this.c.m()) {
            textView.setVisibility(0);
            textView.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 6.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFE14D), ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFC34D)}).a());
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.patch.block.d.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a1e2fa05abd34674c4ed26195eb4811d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a1e2fa05abd34674c4ed26195eb4811d");
                        return;
                    }
                    d.this.a(view);
                    d.this.c.k();
                }
            });
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.InterfaceC0944b
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef53d0845caa73ee998782807fcaa56", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef53d0845caa73ee998782807fcaa56") : t.a(this.d) ? "" : this.d;
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.InterfaceC0944b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e9d251c82919000953202a36c5fb8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e9d251c82919000953202a36c5fb8f");
            return;
        }
        DrugNetInfoLoadView drugNetInfoLoadView = this.m;
        Object[] objArr2 = {2};
        ChangeQuickRedirect changeQuickRedirect2 = DrugNetInfoLoadView.a;
        if (PatchProxy.isSupport(objArr2, drugNetInfoLoadView, changeQuickRedirect2, false, "8973e9f99a4f77ff52a9df9f44199f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugNetInfoLoadView, changeQuickRedirect2, false, "8973e9f99a4f77ff52a9df9f44199f9c");
        } else {
            drugNetInfoLoadView.b = 2;
            drugNetInfoLoadView.a("");
        }
        this.m.setBackgroundResource(R.color.wm_st_common_white);
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.InterfaceC0944b
    public final void a(com.sankuai.waimai.drug.model.d dVar) {
        byte b2;
        String str;
        com.sankuai.waimai.drug.model.c cVar;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0352b2bb4208f4f81c0d5fb79e4ffc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0352b2bb4208f4f81c0d5fb79e4ffc1");
            return;
        }
        this.m.c();
        this.u = dVar.h;
        this.v = dVar.getTraceId();
        this.w = dVar.getStids();
        if (dVar.b == 0) {
            this.g.show();
            this.h.show();
            b bVar = this.g;
            int i = this.o;
            int i2 = this.q;
            Object[] objArr2 = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1a1cf45e9fd80848b8cc341fdb0646b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1a1cf45e9fd80848b8cc341fdb0646b5");
            } else {
                List<b.a> a = bVar.a(dVar, i, i2);
                if (com.sankuai.shangou.stone.util.a.b(a)) {
                    DrugNetInfoLoadView a2 = bVar.c.a();
                    if (a2 != null) {
                        a2.c("暂时没有凑单推荐，去看看其他商品吧", "");
                    }
                } else {
                    com.sankuai.waimai.drug.patch.adapter.b bVar2 = bVar.b;
                    Object[] objArr3 = {a};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.drug.patch.adapter.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "6313413f3ba4fc29a69df90c3561969e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "6313413f3ba4fc29a69df90c3561969e");
                    } else {
                        bVar2.b.clear();
                        if (!com.sankuai.shangou.stone.util.a.b(a)) {
                            bVar2.b.addAll(a);
                        }
                        bVar2.m();
                    }
                }
            }
            c cVar2 = this.h;
            String str2 = dVar.d;
            String str3 = dVar.c;
            boolean z = this.p;
            Object[] objArr4 = {str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "4a2103fa773755acf85b06bc340f846a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "4a2103fa773755acf85b06bc340f846a");
            } else if (z) {
                cVar2.d.setVisibility(0);
                cVar2.e.setVisibility(8);
                cVar2.b.setVisibility(8);
                cVar2.c.setVisibility(8);
                if (TextUtils.isEmpty(str2)) {
                    cVar2.d.setText(R.string.wm_drug_plus_success);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) cVar2.c.getContext().getString(R.string.wm_drug_plus_success));
                    spannableStringBuilder.append((CharSequence) l.a(str2, "#FF8000"));
                    cVar2.d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                }
            } else {
                cVar2.d.setVisibility(8);
                Object[] objArr5 = {str3};
                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "5c1d8f1d8e67df7be070e96598f86d17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "5c1d8f1d8e67df7be070e96598f86d17");
                } else if (TextUtils.isEmpty(str3)) {
                    cVar2.e.setVisibility(8);
                    cVar2.b.setVisibility(8);
                    cVar2.c.setVisibility(0);
                } else {
                    cVar2.e.setVisibility(0);
                    cVar2.b.setVisibility(0);
                    cVar2.c.setVisibility(8);
                    cVar2.e.setText(str3);
                }
                Object[] objArr6 = {str2};
                ChangeQuickRedirect changeQuickRedirect6 = c.a;
                if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "e3237c05f4c57e7ffdfd2c34e6da866a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "e3237c05f4c57e7ffdfd2c34e6da866a");
                } else if (cVar2.e.getVisibility() == 0) {
                    cVar2.c.setVisibility(8);
                } else if (TextUtils.isEmpty(str2)) {
                    if (cVar2.g != null && cVar2.g.d()) {
                        cVar2.c.setText(cVar2.getContext().getResources().getString(R.string.wm_drug_shopcart_patchwork_tip_from_buy_now));
                    } else {
                        cVar2.c.setText(cVar2.getContext().getResources().getString(R.string.wm_st_shopcart_patchwork_tip));
                    }
                    cVar2.c.setVisibility(8);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (cVar2.g != null && cVar2.g.d()) {
                        spannableStringBuilder2.append((CharSequence) "凑一凑，");
                        spannableStringBuilder2.append((CharSequence) l.a(str2, "#FF6363"));
                    } else {
                        spannableStringBuilder2.append((CharSequence) "智能凑单(");
                        spannableStringBuilder2.append((CharSequence) l.a(str2, "#FF6363"));
                        spannableStringBuilder2.append((CharSequence) CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                    cVar2.c.setVisibility(0);
                    cVar2.c.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
                }
            }
            this.i.hide();
            this.j.hide();
            this.j.a();
            this.k.hide();
        } else {
            Object[] objArr7 = {dVar};
            ChangeQuickRedirect changeQuickRedirect7 = b;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6f0915ea8d87675120efbe64fb5f941b", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6f0915ea8d87675120efbe64fb5f941b")).booleanValue();
            } else {
                if (dVar != null) {
                    boolean z2 = dVar.e == null || com.sankuai.shangou.stone.util.a.b(dVar.e.c);
                    boolean z3 = dVar.g == null || com.sankuai.shangou.stone.util.a.b(dVar.g.b);
                    boolean z4 = dVar.f == null || com.sankuai.shangou.stone.util.a.b(dVar.f.b);
                    if (!z2 || !z3 || !z4) {
                        b2 = 0;
                    }
                }
                b2 = 1;
            }
            this.g.hide();
            this.h.hide();
            this.i.show();
            h hVar = this.i;
            int i3 = this.o;
            Object[] objArr8 = {dVar, Byte.valueOf(b2), Integer.valueOf(i3), Integer.valueOf(this.q)};
            ChangeQuickRedirect changeQuickRedirect8 = h.a;
            if (PatchProxy.isSupport(objArr8, hVar, changeQuickRedirect8, false, "c19f8478ae8d9d358f142ca256705044", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, hVar, changeQuickRedirect8, false, "c19f8478ae8d9d358f142ca256705044");
            } else {
                if (b2 != 0) {
                    DrugNetInfoLoadView a3 = hVar.f.a();
                    a3.c(1 == i3 ? "暂无商品推荐，进店看看更多商品吧" : "商品不满起送，进店看看更多商品吧", "");
                    a3.b();
                    a3.setReloadButtonText(R.string.wm_sc_common_shop_patch);
                    Object[] objArr9 = {hVar, dVar};
                    ChangeQuickRedirect changeQuickRedirect9 = j.a;
                    a3.setReloadClickListener(PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "fb28b88b43462ff30bda5a0d83785adb", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "fb28b88b43462ff30bda5a0d83785adb") : new j(hVar, dVar));
                } else {
                    com.sankuai.waimai.drug.patch.block.v2.b bVar3 = hVar.c;
                    com.sankuai.waimai.drug.model.b bVar4 = dVar.g;
                    com.sankuai.waimai.drug.model.b bVar5 = dVar.g;
                    com.sankuai.waimai.drug.model.c cVar3 = dVar.f;
                    Object[] objArr10 = {bVar5, cVar3};
                    ChangeQuickRedirect changeQuickRedirect10 = h.a;
                    if (PatchProxy.isSupport(objArr10, hVar, changeQuickRedirect10, false, "5bb8188b85cb033587080280dd23283b", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr10, hVar, changeQuickRedirect10, false, "5bb8188b85cb033587080280dd23283b");
                    } else if (bVar5 != null) {
                        str = bVar5.a;
                    } else {
                        str = cVar3 != null ? cVar3.a : "";
                    }
                    Object[] objArr11 = {bVar4, str};
                    ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.drug.patch.block.v2.b.a;
                    if (PatchProxy.isSupport(objArr11, bVar3, changeQuickRedirect11, false, "77781b0edef037b038a07769e04a8e78", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, bVar3, changeQuickRedirect11, false, "77781b0edef037b038a07769e04a8e78");
                    } else {
                        boolean z5 = bVar4 != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) bVar4.b);
                        if (z5) {
                            bVar3.c.setVisibility(0);
                            bVar3.b.b_(bVar4.b);
                            bVar3.d.b().a(com.sankuai.shangou.stone.util.a.a((List) bVar4.b));
                        } else {
                            bVar3.c.setVisibility(8);
                        }
                        bVar3.e.setText(str);
                        if (!z5 && TextUtils.isEmpty(str)) {
                            bVar3.hide();
                        } else {
                            bVar3.show();
                        }
                    }
                    hVar.e.a(hVar.g, hVar.a(dVar.g));
                    hVar.b.a(dVar.e);
                    hVar.d.e = dVar.i;
                    com.sankuai.waimai.drug.patch.block.v2.spulist.a aVar = hVar.d;
                    com.sankuai.waimai.drug.model.b bVar6 = dVar.g;
                    com.sankuai.waimai.drug.model.c cVar4 = dVar.f;
                    Object[] objArr12 = {bVar6, cVar4};
                    ChangeQuickRedirect changeQuickRedirect12 = h.a;
                    if (PatchProxy.isSupport(objArr12, hVar, changeQuickRedirect12, false, "d4d274c980bf10be09470ed343eed048", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar4 = (com.sankuai.waimai.drug.model.c) PatchProxy.accessDispatch(objArr12, hVar, changeQuickRedirect12, false, "d4d274c980bf10be09470ed343eed048");
                    } else if (bVar6 != null && (cVar = (com.sankuai.waimai.drug.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar6.b, 0)) != null) {
                        cVar.c = true;
                        cVar4 = cVar;
                    }
                    aVar.a(cVar4);
                }
                hVar.show();
            }
            this.j.show();
            this.j.a(dVar);
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = b;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "9174826d4d87a0d35a20a0b46879c96d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "9174826d4d87a0d35a20a0b46879c96d");
            } else if (this.n != null) {
                String format = String.format(Locale.ENGLISH, "满%s元起送，看看凑单商品吧", this.x);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format);
                spannableStringBuilder3.setSpan(new ForegroundColorSpan(-46554), 0, format.length() - 10, 17);
                this.n.setText(spannableStringBuilder3);
            }
            if (this.p && b2 == 0) {
                this.k.show();
                com.sankuai.waimai.drug.patch.block.v2.a aVar2 = this.k;
                Object[] objArr14 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect14 = com.sankuai.waimai.drug.patch.block.v2.a.a;
                if (PatchProxy.isSupport(objArr14, aVar2, changeQuickRedirect14, false, "eadf0a1dbad5e6c417f7c360a791635f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr14, aVar2, changeQuickRedirect14, false, "eadf0a1dbad5e6c417f7c360a791635f");
                } else {
                    aVar2.e.reset();
                    aVar2.c.clearAnimation();
                    aVar2.c.setVisibility(8);
                    aVar2.f.reset();
                    aVar2.b.clearAnimation();
                    aVar2.g.reset();
                    aVar2.d.clearAnimation();
                    aVar2.d.clearAnimation();
                    aVar2.d.setVisibility(0);
                    aVar2.c.setVisibility(0);
                    aVar2.c.startAnimation(aVar2.e);
                }
                k kVar = this.j;
                Object[] objArr15 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect15 = k.a;
                if (PatchProxy.isSupport(objArr15, kVar, changeQuickRedirect15, false, "ba5629384a5372dd5ed9bb0db06648e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr15, kVar, changeQuickRedirect15, false, "ba5629384a5372dd5ed9bb0db06648e4");
                } else {
                    kVar.b.clearAnimation();
                    kVar.c.clearAnimation();
                    kVar.d.clearAnimation();
                    kVar.f.clearAnimation();
                    kVar.b.setVisibility(8);
                    kVar.c.setVisibility(8);
                    kVar.d.setVisibility(8);
                    kVar.f.setVisibility(8);
                }
            } else {
                this.k.hide();
                this.j.a();
            }
        }
        com.sankuai.waimai.drug.patch.burried.a.a(this.e, l(), this.o, this.q, this.v, this.w);
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41384cddf159fd200b919c91566954cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41384cddf159fd200b919c91566954cb");
            return;
        }
        this.g.hide();
        this.i.hide();
        this.h.hide();
        this.j.hide();
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.InterfaceC0944b
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af6f3dc5bd2e5442a982751551be57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af6f3dc5bd2e5442a982751551be57b");
            return;
        }
        this.m.a(str, "");
        this.m.b();
        this.m.setReloadButtonText(R.string.wm_sc_common_reload);
        this.m.setReloadClickListener(this);
    }

    @Override // com.sankuai.waimai.drug.patch.block.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e056f39e8ec6ece3707298e5559007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e056f39e8ec6ece3707298e5559007");
            return;
        }
        b bVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "087a7762c2d0b5b12d2b90a6142d297d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "087a7762c2d0b5b12d2b90a6142d297d");
        } else {
            bVar.b.m();
        }
        h hVar = this.i;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "af8b2633d05f80d141900c43e206ed30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "af8b2633d05f80d141900c43e206ed30");
            return;
        }
        com.sankuai.waimai.drug.patch.block.v2.c cVar = hVar.b;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.drug.patch.block.v2.c.a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "7362a550117a2c0c83ea48df8241ac5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "7362a550117a2c0c83ea48df8241ac5b");
        } else {
            for (f fVar : cVar.c) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = f.a;
                if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "53ac7638fd382970cc2cc5f4b9152ad7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "53ac7638fd382970cc2cc5f4b9152ad7");
                } else if (fVar.f != null) {
                    fVar.f.notifyDataSetChanged();
                }
            }
        }
        com.sankuai.waimai.drug.patch.block.v2.spulist.a aVar = hVar.d;
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.drug.patch.block.v2.spulist.a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "853513fc0b5fc6d5d8aebbe23f2b6cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "853513fc0b5fc6d5d8aebbe23f2b6cbb");
        } else {
            aVar.c.m();
        }
    }

    @Override // com.sankuai.waimai.drug.patch.block.a
    public final void a(double d, boolean z, int i) {
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287b5b2087ba267bcec63f081591ec57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287b5b2087ba267bcec63f081591ec57");
        } else {
            a(d, z, i, null, null, 0);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.block.a
    public final void a(double d, boolean z, int i, @Nullable GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku, int i2) {
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), goodsSpu, goodsSku, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62f6fc67826999c7dd0ece842144d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62f6fc67826999c7dd0ece842144d22");
            return;
        }
        super.a(d, z, i, goodsSpu, goodsSku, i2);
        this.r = goodsSpu;
        this.s = goodsSku;
        this.t = i2;
        this.p = z;
        this.q = i;
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (z) {
            this.o = 2;
        } else {
            this.o = 1;
        }
        layoutParams.height = com.sankuai.waimai.platform.widget.tag.util.b.a(getContext(), 255.0f);
        k();
        this.f.a(d, i, this.r, this.s, this.t);
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9afc1d465c53fca81703bc33662fe3a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9afc1d465c53fca81703bc33662fe3a1")).booleanValue() : (goodsSpu == null || this.r == null || goodsSpu.getId() != this.r.getId() || this.s == null || this.s.id != goodsSpu.getCycleSkuId()) ? false : true;
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final int g() {
        return this.t;
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb02e16e5a7abe4e7411314c1fb59eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb02e16e5a7abe4e7411314c1fb59eb");
        } else {
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, this.c.g().d(), this.o, this.q, str, i, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe07e5dee018fe67d8c3e2416014eed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe07e5dee018fe67d8c3e2416014eed");
        } else {
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, this.c.g().d(), this.o, this.q, i, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void a(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e05fe4fd43d63ea79d656aa5368b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e05fe4fd43d63ea79d656aa5368b24");
        } else {
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, this.c.g().d(), str, this.o, this.q, i, this.v, i2, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514769c16cbbe43279647d843173958e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514769c16cbbe43279647d843173958e");
        } else {
            com.sankuai.waimai.drug.patch.burried.a.b(this.e, this.c.g().d(), this.o, this.q, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1ea85cc43eb94f4dc7ffad0741b993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1ea85cc43eb94f4dc7ffad0741b993");
        } else {
            com.sankuai.waimai.drug.patch.burried.a.c(this.e, this.c.g().d(), this.o, this.q, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.c
    public final void a(GoodsSpu goodsSpu, String str, int i) {
        Object[] objArr = {goodsSpu, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "737f0d0f0603ce82c99495fae9e8557d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "737f0d0f0603ce82c99495fae9e8557d");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.drug.util.d.a(this.mContext, goodsSpu, j().b);
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, l(), this.o, this.q, goodsSpu.id, i, str, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.c
    public final void a(GoodsSpu goodsSpu, View view, int i, String str) {
        Object[] objArr = {goodsSpu, view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d3ed44ad13f2fa31a628540effda370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d3ed44ad13f2fa31a628540effda370");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.order.a.e().a(j().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a((this.c == null || !this.c.m()) ? view : null, 273, j().d()));
            com.sankuai.waimai.drug.patch.burried.a.b(this.e, l(), this.o, this.q, goodsSpu.id, i, str, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.c
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a3d509a8031923dc22f09e775007c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a3d509a8031923dc22f09e775007c7");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.order.a.e().b(j().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(getView(), j().d()));
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.c
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099332a3dca946a63b2477597c6924ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099332a3dca946a63b2477597c6924ee");
        } else {
            com.sankuai.waimai.store.drug.util.d.a((Activity) this.mContext, goodsSpu, this.f.a().b, 4);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66825122eff8ed4c8874b3f975f49c0e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66825122eff8ed4c8874b3f975f49c0e") : this.f.a();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d079f3b90f8814199afaceb8ca88f1e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d079f3b90f8814199afaceb8ca88f1e4");
            return;
        }
        super.hide();
        if (this.c != null) {
            this.c.e();
        }
        this.g.hide();
        this.i.hide();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b43e260baeacdca23092b34d1cbd36d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b43e260baeacdca23092b34d1cbd36d");
        } else {
            this.f.a(this.r, this.s, this.t);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f736c6d78f015499e7e5de755331c4fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f736c6d78f015499e7e5de755331c4fb");
        } else {
            hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac0ec569032a64b33b436796700d9b4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac0ec569032a64b33b436796700d9b4") : j().d();
    }

    @Override // com.sankuai.waimai.drug.contract.b
    public final DrugNetInfoLoadView a() {
        return this.m;
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void a(final List<GoodsSpu> list, final String str, final int i) {
        Object[] objArr = {list, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7212ec94241482adb11cda98ae762cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7212ec94241482adb11cda98ae762cd1");
        } else {
            com.sankuai.waimai.store.manager.user.a.a(getContext(), new Runnable() { // from class: com.sankuai.waimai.drug.patch.block.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b290d4bf4dacd981df426bac24703ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b290d4bf4dacd981df426bac24703ff");
                    } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        int a2 = com.sankuai.shangou.stone.util.a.a(list);
                        int i2 = 0;
                        for (int i3 = 0; i3 < a2; i3++) {
                            GoodsSpu goodsSpu = (GoodsSpu) list.get(i3);
                            if (goodsSpu != null) {
                                int max = Math.max(goodsSpu.inCartCount, 1);
                                arrayList.add(new WmOrderedFood(goodsSpu.getId(), goodsSpu.getCycleSkuId(), goodsSpu.getFirstGoodAttr(), max, 0, 0, goodsSpu.activityTag));
                                if (com.sankuai.waimai.store.order.a.e().a(d.this.j().d(), goodsSpu.getId(), goodsSpu.getCycleSkuId()) <= 0) {
                                    arrayList2.add(new OrderedFood(goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), null, max));
                                }
                                if (i2 == 0) {
                                    sb.append(goodsSpu.id);
                                } else {
                                    sb.append(CommonConstant.Symbol.COMMA);
                                    sb.append(goodsSpu.id);
                                }
                                i2++;
                            }
                        }
                        if (!com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                            com.sankuai.waimai.store.order.a.e().f(d.this.j().d(), arrayList2);
                            com.sankuai.waimai.store.order.a.e().c(d.this.j().d(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                        }
                        com.sankuai.waimai.drug.patch.burried.a.b(d.this.e, d.this.l(), d.this.o, d.this.q, str, sb.toString(), i, d.this.v, d.this.w);
                        if (!(d.this.mContext instanceof Activity) || com.sankuai.shangou.stone.util.a.b(arrayList)) {
                            return;
                        }
                        com.sankuai.waimai.store.order.a.e().a((Activity) d.this.mContext, d.this.j(), d.this.e, d.this.d, arrayList, (String) null, (TextView) null, d.this.u);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void b(GoodsSpu goodsSpu, String str, int i) {
        Object[] objArr = {goodsSpu, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5344ef64d1fb86294238457807b087f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5344ef64d1fb86294238457807b087f7");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.drug.util.d.a(this.mContext, goodsSpu, j().b);
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, l(), this.o, this.q, str, goodsSpu.id, i, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void a(com.sankuai.waimai.drug.model.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047f6b178b4cdcf58719d90f141d8719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047f6b178b4cdcf58719d90f141d8719");
        } else if (aVar != null) {
            String str = aVar.a;
            StringBuilder sb = new StringBuilder();
            List<GoodsSpu> list = aVar.f;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                GoodsSpu goodsSpu = list.get(i3);
                if (goodsSpu != null) {
                    if (i2 == 0) {
                        sb.append(goodsSpu.id);
                    } else {
                        sb.append(CommonConstant.Symbol.COMMA);
                        sb.append(goodsSpu.id);
                    }
                    i2++;
                }
            }
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, l(), this.o, this.q, str, sb.toString(), i, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.a
    public final void a(GoodsSpu goodsSpu, int i, String str) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f19bdb42ae45917b97b7097c56afe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f19bdb42ae45917b97b7097c56afe1");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.drug.patch.burried.a.a(this.e, l(), this.o, this.q, goodsSpu.id, str, this.v, this.w);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.block.c.a
    public final boolean d() {
        return this.r != null;
    }

    @Override // com.sankuai.waimai.drug.contract.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd22385977456b7d6085a896d1c561b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd22385977456b7d6085a896d1c561b5");
            return;
        }
        k kVar = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "2f429411ce0fc8f3d23e7a5625ea76d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "2f429411ce0fc8f3d23e7a5625ea76d0");
            return;
        }
        kVar.b();
        kVar.c.startAnimation(kVar.c());
        kVar.b.startAnimation(kVar.c());
        kVar.d.startAnimation(kVar.c());
        kVar.f.startAnimation(kVar.c());
    }

    @Override // com.sankuai.waimai.drug.contract.b
    public final void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6bb1157fe0646a837cffbab250bcc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6bb1157fe0646a837cffbab250bcc7");
            return;
        }
        int i = this.e.e;
        if (i == 1 || i == 9) {
            a(view);
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.store.router.d.a(view.getContext(), str);
        }
    }
}
