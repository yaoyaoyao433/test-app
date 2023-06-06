package com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodResponse;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private com.sankuai.waimai.bussiness.order.confirm.collect.callback.a A;
    private com.sankuai.waimai.bussiness.order.confirm.submit.a B;
    ViewGroup e;
    ViewGroup f;
    ViewGroup g;
    TextView h;
    TextView i;
    CollectOrderFoodParams j;
    CollectOrderFoodResponse k;
    e l;
    long m;
    String n;
    private final String o;
    private ViewGroup p;
    private TextView q;
    private RecyclerView r;
    private View s;
    private View t;
    private com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b u;
    private com.sankuai.waimai.bussiness.order.confirm.collect.adapter.a v;
    private TranslateAnimation w;
    private TranslateAnimation x;
    private f y;
    private View.OnClickListener z;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_collectfood;
    }

    public static /* synthetic */ void a(b bVar, double d2) {
        int i;
        double d3;
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a233e55c6c94e2f2be81383ff00531d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a233e55c6c94e2f2be81383ff00531d6");
            return;
        }
        List<CollectOrder.DiscountStageInfo> list = bVar.j.l;
        if (!bVar.j.c() || com.sankuai.waimai.foundation.utils.b.b(list)) {
            return;
        }
        bVar.f.setVisibility(0);
        boolean z = bVar.j.g == 0.0d;
        boolean z2 = d2 >= list.get(list.size() - 1).spreadPrice;
        if (!z2) {
            i = 0;
            while (i < list.size()) {
                CollectOrder.DiscountStageInfo discountStageInfo = list.get(i);
                if (discountStageInfo != null && d2 < discountStageInfo.spreadPrice) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        String str = "";
        if (!z2) {
            if (i < list.size()) {
                CollectOrder.DiscountStageInfo discountStageInfo2 = list.get(i);
                double d4 = discountStageInfo2.spreadPrice - d2;
                if (i == 0 && z) {
                    str = String.format(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_not_reaching_threshold), h.a(d4), h.a(discountStageInfo2.discountPrice));
                } else {
                    int i2 = i - 1;
                    if (i2 >= 0) {
                        d3 = list.get(i2).discountPrice;
                    } else {
                        d3 = bVar.j.g;
                    }
                    str = String.format(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_discount_reaching_part_threshold), h.a(d3), h.a(d4), h.a(discountStageInfo2.discountPrice - d3));
                }
            }
        } else {
            str = String.format(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_discount_meet_the_conditions), h.a(list.get(list.size() - 1).price), h.a(list.get(list.size() - 1).discountPrice));
        }
        bVar.h.setText(Html.fromHtml(str), TextView.BufferType.SPANNABLE);
    }

    public static /* synthetic */ void a(b bVar, int i) {
        String string;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "dc108e965cf1bc69dc3311fd0d99cd58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "dc108e965cf1bc69dc3311fd0d99cd58");
        } else if (bVar.j != null) {
            List<DiscountItem.a> list = bVar.j.n;
            if (!bVar.j.e() || com.sankuai.waimai.foundation.utils.b.b(list)) {
                return;
            }
            DiscountItem.a aVar = null;
            for (DiscountItem.a aVar2 : list) {
                if (aVar2 != null && (aVar == null || aVar.a() > aVar2.a())) {
                    aVar = aVar2;
                }
            }
            if (aVar == null || aVar.a() <= 0) {
                return;
            }
            bVar.f.setVisibility(0);
            int i2 = i + bVar.j.m;
            if (i2 >= aVar.a()) {
                String valueOf = String.valueOf(aVar.a());
                if (bVar.k != null && !aa.a(bVar.k.minThresholdText)) {
                    string = bVar.k.minThresholdText.replace("{}", valueOf);
                } else {
                    string = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_buy_more_discount_reaching_threshold, valueOf);
                }
            } else {
                Context context = com.meituan.android.singleton.b.a;
                Object[] objArr2 = new Object[3];
                objArr2[0] = String.valueOf(i2);
                objArr2[1] = String.valueOf(aVar.a() - i2);
                objArr2[2] = aVar.c == null ? "" : aVar.c;
                string = context.getString(R.string.wm_order_confirm_collect_food_buy_more_discount_unreach_threshold, objArr2);
            }
            bVar.h.setText(Html.fromHtml(string));
        }
    }

    public static /* synthetic */ void a(b bVar, BaseResponse baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "95979d6e44f126f459010d8dce188f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "95979d6e44f126f459010d8dce188f09");
            return;
        }
        Activity activity = (Activity) bVar.c;
        if (baseResponse == null) {
            ae.a(activity, (int) R.string.takeout_loading_fail_try_afterwhile);
        } else if (baseResponse.code != 0) {
            ae.a(activity, TextUtils.isEmpty(baseResponse.msg) ? activity.getString(R.string.takeout_loading_fail_try_afterwhile) : baseResponse.msg);
        } else if (baseResponse.data == 0) {
            ae.a(activity, (int) R.string.takeout_loading_fail_try_afterwhile);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e293fbf5d243db5e764a37f97ff369fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e293fbf5d243db5e764a37f97ff369fe");
            return;
        }
        JudasManualManager.a a = JudasManualManager.a(str).a("c_ykhs39e");
        if (bVar.j != null) {
            a.a("wm_preview_tanceng", bVar.j.b - 1);
        }
        if (z) {
            a.a("is_added", !com.sankuai.waimai.foundation.utils.d.a(bVar.i()) ? 1 : 0);
        }
        a.a(bVar.c).a();
    }

    public static /* synthetic */ void b(b bVar) {
        com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "fd5fd32967662001c07e5c66a4277eac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "fd5fd32967662001c07e5c66a4277eac");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b14f6670d7138bfc1be568c32388fbd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b14f6670d7138bfc1be568c32388fbd4");
        } else {
            String str = "";
            switch (bVar.j.b) {
                case 1:
                    str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_staple_food_title);
                    break;
                case 2:
                    str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_red_packet_title);
                    break;
                case 3:
                    str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_coupon_title);
                    break;
                case 4:
                    str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_discount_title);
                    break;
                case 5:
                    if (bVar.k != null && !aa.a(bVar.k.activityTitle)) {
                        str = bVar.k.activityTitle;
                        break;
                    } else {
                        str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_buy_more_discount_title);
                        break;
                    }
                    break;
                case 6:
                    str = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_delivery_collect_fee_title);
                    break;
            }
            bVar.q.setText(str);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "174eb27d048b6dfaa7f379dfc72a20b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "174eb27d048b6dfaa7f379dfc72a20b5");
        } else if (bVar.j.b == 6 && !TextUtils.isEmpty(bVar.j.p)) {
            bVar.h.setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(bVar.j.p, "#FFA000"));
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = d;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "5a5d520d8c62fbdf7dcbfe17c3b17f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "5a5d520d8c62fbdf7dcbfe17c3b17f04");
        } else {
            bVar.v.b = !bVar.j.b();
            com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b bVar2 = bVar.u;
            CollectOrderFoodParams collectOrderFoodParams = bVar.j;
            CollectOrderFoodResponse collectOrderFoodResponse = bVar.k;
            Object[] objArr5 = {collectOrderFoodParams, collectOrderFoodResponse};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
            if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "7dcd715cf0f6234d6e8d1479bfffba2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "7dcd715cf0f6234d6e8d1479bfffba2b");
            } else {
                bVar2.b.clear();
                bVar2.b.addAll(collectOrderFoodParams.k);
                bVar2.g = 0.0d;
                bVar2.h = 0.0d;
                bVar2.i = 0.0d;
                Object[] objArr6 = {collectOrderFoodParams};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
                if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "ab51136db2ce417432440c478f5ede9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "ab51136db2ce417432440c478f5ede9e");
                } else if (collectOrderFoodParams != null) {
                    bVar2.g = collectOrderFoodParams.f;
                    if (bVar2.e != null) {
                        bVar2.e.a(bVar2.g);
                        if (collectOrderFoodParams.c()) {
                            bVar2.e.c(0.0d);
                        }
                    }
                }
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
                if (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "1cedc53a56962c5f116088e43b7ac4fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "1cedc53a56962c5f116088e43b7ac4fc");
                } else if (bVar2.e != null) {
                    bVar2.e.b(0.0d);
                }
                List<GoodsSpu> list = collectOrderFoodResponse.mGoodsSpus;
                Object[] objArr8 = {list};
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
                if (PatchProxy.isSupport(objArr8, bVar2, changeQuickRedirect8, false, "0da71396c4cce3f5d251bffe925a88ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, bVar2, changeQuickRedirect8, false, "0da71396c4cce3f5d251bffe925a88ae");
                } else {
                    bVar2.c.clear();
                    Iterator<GoodsSpu> it = list.iterator();
                    while (it.hasNext()) {
                        GoodsSpu next = it.next();
                        List<com.sankuai.waimai.bussiness.order.confirm.collect.model.a> list2 = bVar2.c;
                        Object[] objArr9 = new Object[1];
                        objArr9[c] = next;
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
                        Iterator<GoodsSpu> it2 = it;
                        if (PatchProxy.isSupport(objArr9, bVar2, changeQuickRedirect9, false, "94998e08a3b02478b90aa271dec9bc7e", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar = (com.sankuai.waimai.bussiness.order.confirm.collect.model.a) PatchProxy.accessDispatch(objArr9, bVar2, changeQuickRedirect9, false, "94998e08a3b02478b90aa271dec9bc7e");
                        } else {
                            aVar = new com.sankuai.waimai.bussiness.order.confirm.collect.model.a();
                            aVar.a(next);
                            for (OrderedFood orderedFood : bVar2.b) {
                                if (bVar2.a(orderedFood.spu, next)) {
                                    if (aVar.j < 0) {
                                        aVar.j = orderedFood.getCartId();
                                    } else {
                                        aVar.j = Math.min(orderedFood.getCartId(), aVar.j);
                                    }
                                    aVar.d += orderedFood.count;
                                }
                            }
                            if (aVar.j < 0) {
                                aVar.j = 0;
                            }
                        }
                        list2.add(aVar);
                        it = it2;
                        c = 0;
                    }
                }
                bVar2.j = collectOrderFoodResponse.mMinCountTtip;
                bVar2.k = collectOrderFoodResponse.mMaxStockTip;
                bVar2.notifyDataSetChanged();
                Object[] objArr10 = {collectOrderFoodParams};
                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
                if (PatchProxy.isSupport(objArr10, bVar2, changeQuickRedirect10, false, "d174b5c9a323ffab89a60e1000469946", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, bVar2, changeQuickRedirect10, false, "d174b5c9a323ffab89a60e1000469946");
                } else if (bVar2.e != null && collectOrderFoodParams.e()) {
                    bVar2.e.a(bVar2.a());
                }
            }
        }
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect11 = d;
        if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "1270d5222d78da86abee8543c0c30ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "1270d5222d78da86abee8543c0c30ea0");
        } else if (bVar.e.getVisibility() == 8) {
            bVar.e.setVisibility(0);
            bVar.p.startAnimation(bVar.w);
        }
    }

    public b(@NonNull Context context, @Nullable ViewStub viewStub, @NonNull f fVar, @Nullable e eVar) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, fVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a83536efa8008ef44b41a8c5c63217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a83536efa8008ef44b41a8c5c63217");
            return;
        }
        this.o = getClass().getSimpleName() + System.currentTimeMillis();
        this.m = -1L;
        this.n = "";
        this.z = new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4284aa515177866a4fedb6eecc07c822", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4284aa515177866a4fedb6eecc07c822");
                    return;
                }
                if (view.getId() == R.id.collect_food_layout_close_img) {
                    b.a(b.this, "b_waimai_gef7us0a_mc", false);
                } else if (view.getId() == R.id.layout_collect_food) {
                    b.a(b.this, "b_waimai_z5vjd28n_mc", false);
                } else if (view.getId() != R.id.collect_food_footer_confirm_btn) {
                    return;
                } else {
                    b.a(b.this, "b_waimai_c0slwzv6_mc", true);
                    if (b.this.l != null) {
                        b.this.l.a(b.this.m, b.this.n, b.this.i());
                    }
                }
                b.this.g();
            }
        };
        this.A = new com.sankuai.waimai.bussiness.order.confirm.collect.callback.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.collect.callback.a
            public final void a(double d2) {
                String string;
                String string2;
                Object[] objArr2 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95fd43f6a4dc6e5e196d7c5f1c159fbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95fd43f6a4dc6e5e196d7c5f1c159fbe");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect3 = b.d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a5d01e730ff21e252b06f400cc299dd5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a5d01e730ff21e252b06f400cc299dd5");
                } else if (bVar.j.b()) {
                    bVar.f.setVisibility(8);
                } else {
                    if (!bVar.j.d()) {
                        if (!(bVar.j.b == 2)) {
                            return;
                        }
                    }
                    bVar.f.setVisibility(0);
                    if (d2 > 0.0d) {
                        if (bVar.j.d()) {
                            string2 = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_coupon_notice);
                        } else {
                            string2 = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_red_pocket_notice);
                        }
                        bVar.h.setText(Html.fromHtml(String.format(string2, h.a(d2), h.a(bVar.j.e))), TextView.BufferType.SPANNABLE);
                        return;
                    }
                    if (bVar.j.d()) {
                        string = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_coupon_meet_the_conditions);
                    } else {
                        string = com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_red_pocket_meet_the_conditions);
                    }
                    bVar.h.setText(Html.fromHtml(String.format(string, h.a(bVar.j.c), h.a(bVar.j.e))), TextView.BufferType.SPANNABLE);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.collect.callback.a
            public final void b(double d2) {
                Object[] objArr2 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10d7cae24901d17bc02084b3b01cfb7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10d7cae24901d17bc02084b3b01cfb7e");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect3 = b.d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "cab1c943b76679544ef9f91f406b17fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "cab1c943b76679544ef9f91f406b17fc");
                } else if (d2 == 0.0d) {
                    bVar.g.setVisibility(8);
                } else {
                    bVar.i.setText(String.format(com.meituan.android.singleton.b.a.getString(R.string.wm_order_confirm_collect_food_additional_pocket_fee), h.a(d2)));
                    bVar.g.setVisibility(0);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.collect.callback.a
            public final void c(double d2) {
                Object[] objArr2 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1081bf2a8b05e541794d4566ae40d70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1081bf2a8b05e541794d4566ae40d70");
                } else {
                    b.a(b.this, d2);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.collect.callback.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddaebe89c90ba7b80218ccbafc5c8498", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddaebe89c90ba7b80218ccbafc5c8498");
                } else {
                    b.a(b.this, i);
                }
            }
        };
        this.B = new com.sankuai.waimai.bussiness.order.confirm.submit.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f93f0a87b4d861292f915212e35322c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f93f0a87b4d861292f915212e35322c8");
                    return;
                }
                if (b.this.l != null) {
                    b.this.l.a(th);
                }
                b.a(b.this, (BaseResponse) null);
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
            public final void a(BaseResponse baseResponse) {
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d66ab5b105ec63602284be00ef2f6cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d66ab5b105ec63602284be00ef2f6cd");
                } else if (baseResponse != null && (baseResponse.data instanceof CollectOrderFoodResponse) && !com.sankuai.waimai.foundation.utils.b.b(((CollectOrderFoodResponse) baseResponse.data).mGoodsSpus)) {
                    if (b.this.l != null) {
                        b.this.l.a();
                    }
                    b.this.k = (CollectOrderFoodResponse) baseResponse.data;
                    b.b(b.this);
                } else {
                    if (b.this.l != null) {
                        b.this.l.a(new IllegalArgumentException("response is wrong"));
                    }
                    b.a(b.this, baseResponse);
                }
            }
        };
        this.y = fVar;
        this.l = eVar;
        this.u = new com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b(this.y, this.A);
        this.r.setAdapter(this.u);
        this.e.setOnClickListener(this.z);
        this.s.setOnClickListener(this.z);
        this.t.setOnClickListener(this.z);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad80087c57f9e2807398c4ca205cbeff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad80087c57f9e2807398c4ca205cbeff");
            return;
        }
        super.b();
        this.e = (ViewGroup) this.b.findViewById(R.id.layout_collect_food);
        this.p = (ViewGroup) this.e.findViewById(R.id.collect_food_layout);
        this.q = (TextView) this.e.findViewById(R.id.collect_food_title_txt);
        this.f = (ViewGroup) this.e.findViewById(R.id.collect_food_coupon_layout);
        this.h = (TextView) this.e.findViewById(R.id.collect_food_coupon_txt);
        this.s = this.e.findViewById(R.id.collect_food_layout_close_img);
        this.r = (RecyclerView) this.e.findViewById(R.id.collect_food_list);
        this.r.setLayoutManager(new LinearLayoutManager(com.meituan.android.singleton.b.a, 1, false));
        this.v = new com.sankuai.waimai.bussiness.order.confirm.collect.adapter.a(com.meituan.android.singleton.b.a);
        this.r.addItemDecoration(this.v);
        this.g = (ViewGroup) this.e.findViewById(R.id.collect_food_footer_pocket_fee_layout);
        this.i = (TextView) this.e.findViewById(R.id.collect_food_footer_pocket_fee_txt);
        this.t = this.e.findViewById(R.id.collect_food_footer_confirm_btn);
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776da589d55c1bce0519f3a722a0b03f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776da589d55c1bce0519f3a722a0b03f")).booleanValue() : this.e != null && this.e.getVisibility() == 0;
    }

    public final void a(CollectOrderFoodParams collectOrderFoodParams) {
        Object[] objArr = {collectOrderFoodParams};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62eb6fbb0edc84d3b5ad8f63dfcfa416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62eb6fbb0edc84d3b5ad8f63dfcfa416");
        } else if (collectOrderFoodParams == null || !collectOrderFoodParams.a()) {
            if (this.l != null) {
                this.l.a(new IllegalArgumentException("params is not legal"));
            }
        } else {
            this.m = collectOrderFoodParams.h;
            this.n = collectOrderFoodParams.i;
            this.j = collectOrderFoodParams;
            h();
            if (this.l != null) {
                this.l.b();
            }
            com.sankuai.waimai.bussiness.order.confirm.collect.request.a.a(collectOrderFoodParams, this.B, this.o);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483275240b1ea0270af769ce3308963e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483275240b1ea0270af769ce3308963e");
            return;
        }
        g();
        this.m = -1L;
        this.n = "";
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b1f6af1e76a5661f7d66dd2b049fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b1f6af1e76a5661f7d66dd2b049fa1");
            return;
        }
        this.w = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.w.setDuration(300L);
        this.x = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.x.setDuration(300L);
        this.x.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.b.4
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4181f496efeff0fac60f79d22532d27", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4181f496efeff0fac60f79d22532d27");
                } else {
                    b.this.e.setVisibility(8);
                }
            }
        });
    }

    void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505113c43021f11996fae5c4648f1909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505113c43021f11996fae5c4648f1909");
        } else if (this.e.getVisibility() == 0) {
            this.p.startAnimation(this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<OrderedFood> i() {
        OrderedFood orderedFood;
        boolean z;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62070795ad226ccf743c767426150a04", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62070795ad226ccf743c767426150a04");
        }
        if (this.u != null) {
            com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b bVar = this.u;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9d8852ec183e1c4d8bfe721380017c33", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9d8852ec183e1c4d8bfe721380017c33");
            }
            ArrayList<OrderedFood> arrayList = new ArrayList();
            for (com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar : bVar.c) {
                if (aVar.e != 0) {
                    aVar.a();
                    arrayList.add(aVar.b);
                }
            }
            if (arrayList.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (OrderedFood orderedFood2 : bVar.b) {
                    char c2 = 1;
                    boolean z2 = false;
                    for (OrderedFood orderedFood3 : arrayList) {
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = orderedFood2;
                        objArr3[c2] = orderedFood3;
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.collect.adapter.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "5d57e3ea98d8069a0d8b6445f334ac81", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "5d57e3ea98d8069a0d8b6445f334ac81")).booleanValue();
                            orderedFood = orderedFood3;
                        } else {
                            if (orderedFood2 != null) {
                                orderedFood = orderedFood3;
                                if (orderedFood != null && bVar.a(orderedFood2.spu, orderedFood.spu) && orderedFood2.getCartId() == orderedFood.getCartId()) {
                                    z = true;
                                }
                            } else {
                                orderedFood = orderedFood3;
                            }
                            z = false;
                        }
                        if (z) {
                            orderedFood.setCount(orderedFood.getCount() + orderedFood2.getCount());
                            c2 = 1;
                            c = 0;
                            z2 = true;
                        } else {
                            c2 = 1;
                            c = 0;
                        }
                    }
                    if (!z2) {
                        arrayList2.add(orderedFood2);
                    }
                    c = 0;
                }
                arrayList2.addAll(arrayList);
                return arrayList2;
            }
            return null;
        }
        return null;
    }
}
