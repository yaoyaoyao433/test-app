package com.sankuai.waimai.store.skuchoose;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.util.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    GoodsSpu b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    com.sankuai.waimai.store.observers.a d;
    c e;
    GoodsSku f;
    LinkedHashMap<String, String> g;
    GoodsAttr[] h;
    private LinearLayout i;
    private LayoutInflater j;
    private boolean k;

    public static /* synthetic */ void a(d dVar, ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "cd2ece1fe104aefd0704754dbac86111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "cd2ece1fe104aefd0704754dbac86111");
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.setSelected(false);
                }
            }
        }
    }

    public d(@NonNull Context context, com.sankuai.waimai.store.observers.a aVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2, GoodsSpu goodsSpu, @NonNull c cVar, boolean z) {
        super(context);
        Object[] objArr = {context, aVar, aVar2, goodsSpu, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b76b479340d0bbd47cb9f54bfb7865d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b76b479340d0bbd47cb9f54bfb7865d");
            return;
        }
        this.c = aVar2;
        this.d = aVar;
        this.e = cVar;
        this.b = goodsSpu;
        this.k = z;
        this.g = new LinkedHashMap<>();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a409ac116a6bd000de3333c9c304c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a409ac116a6bd000de3333c9c304c8d");
            return;
        }
        super.onViewCreated();
        this.i = (LinearLayout) this.mView;
        this.j = LayoutInflater.from(this.mContext);
    }

    public final void a() {
        LinearLayout a2;
        LinearLayout a3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abee65a5057e3c724174438ef9cd979c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abee65a5057e3c724174438ef9cd979c");
        } else if (this.b != null && this.c != null) {
            List<OrderedFood> b = com.sankuai.waimai.store.order.a.e().b(this.c.f(), this.b.getId());
            List<GoodsSku> skuList = this.b.getSkuList();
            Map<String, List<GoodsAttr>> attrList = this.b.getAttrList();
            Object[] objArr2 = {b, skuList, attrList};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            OrderedFood orderedFood = null;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fed270c45af5f296e91bbe182a676e17", RobustBitConfig.DEFAULT_VALUE)) {
                orderedFood = (OrderedFood) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fed270c45af5f296e91bbe182a676e17");
            } else if (!com.sankuai.shangou.stone.util.a.b(b) && b.size() != 0 && !com.sankuai.shangou.stone.util.a.b(skuList) && skuList.size() != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                loop1: for (GoodsSku goodsSku : skuList) {
                    if (goodsSku != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(goodsSku.id);
                        String sb2 = sb.toString();
                        for (OrderedFood orderedFood2 : b) {
                            if (orderedFood2 != null && orderedFood2.sku != null && orderedFood2.sku.id == goodsSku.id) {
                                if (attrList == null || attrList.size() == 0) {
                                    orderedFood = orderedFood2;
                                    break loop1;
                                }
                                List list = (List) linkedHashMap.get(sb2);
                                if (list == null) {
                                    list = new ArrayList();
                                    linkedHashMap.put(sb2, list);
                                }
                                list.add(orderedFood2);
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.size() != 0) {
                    Iterator it = linkedHashMap.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<OrderedFood> list2 = (List) it.next();
                        if (attrList != null && attrList.size() != 0) {
                            for (List<GoodsAttr> list3 : attrList.values()) {
                                if (com.sankuai.shangou.stone.util.a.b(list2)) {
                                    break;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (GoodsAttr goodsAttr : list3) {
                                    for (OrderedFood orderedFood3 : list2) {
                                        if (orderedFood3 != null && orderedFood3.getAttrIds() != null && Arrays.asList(orderedFood3.getAttrIds()).contains(goodsAttr)) {
                                            arrayList.add(orderedFood3);
                                        }
                                    }
                                }
                                list2 = arrayList;
                            }
                            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
                                orderedFood = a(list2, attrList);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            this.i.removeAllViews();
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) skuList)) {
                if (orderedFood == null) {
                    GoodsSku a4 = this.k ? a(skuList) : b(skuList);
                    if (a4 != null) {
                        a3 = a(this.b.getSkuLabel(), skuList, a4.getSkuId());
                    } else {
                        a3 = a(this.b.getSkuLabel(), skuList, 0L);
                    }
                } else {
                    a3 = a(this.b.getSkuLabel(), skuList, orderedFood.getSkuId());
                }
                if (a3 != null) {
                    this.i.addView(a3);
                }
            }
            if (attrList == null || attrList.size() <= 0) {
                return;
            }
            this.h = new GoodsAttr[attrList.size()];
            int i = 0;
            for (String str : this.b.getAttrNameList()) {
                List<GoodsAttr> list4 = attrList.get(str);
                if (!com.sankuai.shangou.stone.util.a.b(list4)) {
                    if (orderedFood != null && orderedFood.getAttrIds() != null && orderedFood.getAttrIds().length > i) {
                        a2 = a(str, list4, orderedFood.getAttrIds()[i], i);
                    } else {
                        a2 = a(str, list4, list4.get(0), i);
                    }
                    this.i.addView(a2);
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    private LinearLayout a(final String str, @NonNull List<GoodsSku> list, long j) {
        Iterator<GoodsSku> it;
        LinearLayout linearLayout;
        TextView textView;
        Drawable drawable;
        int i = 0;
        Object[] objArr = {str, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159d021cf881bb4214f5b7f74b016d18", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159d021cf881bb4214f5b7f74b016d18");
        }
        if (list.size() == 1) {
            this.f = list.get(0);
            String spec = this.f.getSpec();
            this.e.a(this.f, null);
            if (TextUtils.isEmpty(spec)) {
                return null;
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) this.j.inflate(R.layout.wm_sc_layout_food_sku, (ViewGroup) null);
        final HorizontalFlowLayout horizontalFlowLayout = (HorizontalFlowLayout) linearLayout2.findViewById(R.id.layout_attribute);
        ((TextView) linearLayout2.findViewById(R.id.txt_label)).setText(str + CommonConstant.Symbol.COLON);
        Iterator<GoodsSku> it2 = list.iterator();
        while (it2.hasNext()) {
            GoodsSku next = it2.next();
            if (next != null) {
                TextView textView2 = (TextView) this.j.inflate(R.layout.wm_sc_btn_food_sku, (ViewGroup) horizontalFlowLayout, (boolean) i);
                textView2.setText(next.getSpec());
                textView2.setTag(next);
                if (!this.k) {
                    int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
                    textView2.setPadding(dimensionPixelOffset, i, dimensionPixelOffset, i);
                    textView2.setBackground(b());
                    textView2.setTextColor(c());
                }
                if (next.getStatus() == 1) {
                    if (next.isDisplaySubscribe()) {
                        if (this.k) {
                            it = it2;
                            linearLayout = linearLayout2;
                            textView = textView2;
                        } else {
                            int dimensionPixelOffset2 = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
                            textView2.setPadding(dimensionPixelOffset2, i, dimensionPixelOffset2, i);
                            Object[] objArr2 = new Object[i];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            it = it2;
                            linearLayout = linearLayout2;
                            textView = textView2;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82297797f4df28cc4cf5c9eac29a4256", RobustBitConfig.DEFAULT_VALUE)) {
                                drawable = (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82297797f4df28cc4cf5c9eac29a4256");
                            } else {
                                float dimensionPixelOffset3 = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2) * 3.0f;
                                drawable = com.sankuai.waimai.store.util.e.a().a(new int[]{16842913}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_FAFAFA)).b(this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1)).a(ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFBA2C)).a(dimensionPixelOffset3).a()).a(new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_FAFAFA)).a(dimensionPixelOffset3).a()).b;
                            }
                            textView.setBackground(drawable);
                            textView.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_BCBCBD));
                        }
                        if (j == next.getSkuId()) {
                            textView.setSelected(true);
                            this.g.put(str, next.getSpec());
                            this.e.a(next);
                            this.f = next;
                            this.e.a(this.f, this.g);
                        }
                    } else {
                        it = it2;
                        linearLayout = linearLayout2;
                        textView = textView2;
                        textView.setEnabled(false);
                    }
                } else {
                    it = it2;
                    linearLayout = linearLayout2;
                    textView = textView2;
                    if (!next.isSoldable()) {
                        textView.setEnabled(false);
                    } else if (j == next.getSkuId()) {
                        textView.setSelected(true);
                        this.g.put(str, next.getSpec());
                        this.e.a(next);
                        this.f = next;
                        this.e.a(this.f, this.g);
                        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.d.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f38fbdfe7d4ab3341a39de05c3c5469", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f38fbdfe7d4ab3341a39de05c3c5469");
                                    return;
                                }
                                d.this.e.a();
                                d.a(d.this, horizontalFlowLayout);
                                view.setSelected(true);
                                GoodsSku goodsSku = (GoodsSku) view.getTag();
                                if (goodsSku == null) {
                                    return;
                                }
                                d.this.g.put(str, goodsSku.getSpec());
                                d.this.e.a(goodsSku);
                                d.this.f = goodsSku;
                                d.this.e.a(d.this.f, d.this.g);
                                d.this.e.a(com.sankuai.waimai.store.order.a.e().a(d.this.c.d(), d.this.b.getId(), goodsSku.getSkuId(), d.this.h), d.this.f, d.this.h);
                                d.this.d.ba_();
                            }
                        });
                        horizontalFlowLayout.addView(textView);
                        it2 = it;
                        linearLayout2 = linearLayout;
                        i = 0;
                    }
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.d.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f38fbdfe7d4ab3341a39de05c3c5469", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f38fbdfe7d4ab3341a39de05c3c5469");
                            return;
                        }
                        d.this.e.a();
                        d.a(d.this, horizontalFlowLayout);
                        view.setSelected(true);
                        GoodsSku goodsSku = (GoodsSku) view.getTag();
                        if (goodsSku == null) {
                            return;
                        }
                        d.this.g.put(str, goodsSku.getSpec());
                        d.this.e.a(goodsSku);
                        d.this.f = goodsSku;
                        d.this.e.a(d.this.f, d.this.g);
                        d.this.e.a(com.sankuai.waimai.store.order.a.e().a(d.this.c.d(), d.this.b.getId(), goodsSku.getSkuId(), d.this.h), d.this.f, d.this.h);
                        d.this.d.ba_();
                    }
                });
                horizontalFlowLayout.addView(textView);
                it2 = it;
                linearLayout2 = linearLayout;
                i = 0;
            }
        }
        return linearLayout2;
    }

    private Drawable b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111a4f5f26d5d309f9f59a84d9139d45", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111a4f5f26d5d309f9f59a84d9139d45");
        }
        float dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
        return com.sankuai.waimai.store.util.e.a().a(new int[]{-16842910}, new e.a().c(ContextCompat.getColor(getContext(), R.color.wm_sg_color_FAFAFA)).a(dimensionPixelOffset).a()).a(new int[]{16842913}, new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFE14D), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFC34D)}).a(dimensionPixelOffset).a()).a(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFFFFF)).a(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_D3D3D3)).b(1).a(dimensionPixelOffset).a()).b;
    }

    private ColorStateList c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bc26fbe21c56bd15b30b4023ec03a35", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bc26fbe21c56bd15b30b4023ec03a35") : new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_BCBCBD), ContextCompat.getColor(getContext(), R.color.wm_st_common_222426)});
    }

    private LinearLayout a(final String str, @NonNull List<GoodsAttr> list, GoodsAttr goodsAttr, final int i) {
        Object[] objArr = {str, list, goodsAttr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a226cf05f3ef81430cff151e681b3ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a226cf05f3ef81430cff151e681b3ea");
        }
        LinearLayout linearLayout = (LinearLayout) this.j.inflate(R.layout.wm_sc_layout_food_sku, (ViewGroup) null);
        final HorizontalFlowLayout horizontalFlowLayout = (HorizontalFlowLayout) linearLayout.findViewById(R.id.layout_attribute);
        ((TextView) linearLayout.findViewById(R.id.txt_label)).setText(str + CommonConstant.Symbol.COLON);
        for (GoodsAttr goodsAttr2 : list) {
            if (goodsAttr2 != null) {
                TextView textView = (TextView) this.j.inflate(R.layout.wm_sc_btn_food_sku, (ViewGroup) horizontalFlowLayout, false);
                if (!this.k) {
                    int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
                    textView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    textView.setBackground(b());
                    textView.setTextColor(c());
                }
                if (goodsAttr2.getValue() != null) {
                    textView.setText(goodsAttr2.getValue());
                }
                textView.setTag(goodsAttr2);
                if (goodsAttr2.equals(goodsAttr)) {
                    textView.setSelected(true);
                    this.g.put(str, goodsAttr2.getValue());
                    this.e.a(this.f, this.g);
                    if (i < this.h.length) {
                        this.h[i] = goodsAttr2;
                        this.e.a(this.h);
                    }
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.d.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d48b7129b1cb5770a96e0c3a4e4526b3", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d48b7129b1cb5770a96e0c3a4e4526b3");
                            return;
                        }
                        d.this.e.a();
                        d.a(d.this, horizontalFlowLayout);
                        view.setSelected(true);
                        if (i < d.this.h.length) {
                            d.this.h[i] = (GoodsAttr) view.getTag();
                            d.this.g.put(str, d.this.h[i].getValue());
                        }
                        if (d.this.f != null) {
                            d.this.e.a(com.sankuai.waimai.store.order.a.e().a(d.this.c.d(), d.this.b.getId(), d.this.f.getSkuId(), d.this.h), d.this.f, d.this.h);
                        }
                        d.this.d.ba_();
                    }
                });
                horizontalFlowLayout.addView(textView);
            }
        }
        return linearLayout;
    }

    private OrderedFood a(List<OrderedFood> list, Map<String, List<GoodsAttr>> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a2efe416dbe8c1f1dbd50731a37371", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a2efe416dbe8c1f1dbd50731a37371");
        }
        for (List<GoodsAttr> list2 : map.values()) {
            for (GoodsAttr goodsAttr : list2) {
                for (OrderedFood orderedFood : list) {
                    if (orderedFood != null && orderedFood.getAttrIds() != null && Arrays.asList(orderedFood.getAttrIds()).contains(goodsAttr)) {
                        return orderedFood;
                    }
                }
            }
        }
        return null;
    }

    private GoodsSku a(List<GoodsSku> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26e2baec3258e19aea62ac510a20127", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26e2baec3258e19aea62ac510a20127");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (GoodsSku goodsSku : list) {
            if (goodsSku != null && goodsSku.isSoldable()) {
                return goodsSku;
            }
        }
        return (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
    }

    private GoodsSku b(List<GoodsSku> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e9fdb360aac3d3f42a4fe64390278b", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e9fdb360aac3d3f42a4fe64390278b");
        }
        GoodsSku goodsSku = null;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (GoodsSku goodsSku2 : list) {
            if (goodsSku2 != null && goodsSku2.isSoldable() && (goodsSku == null || goodsSku2.getPrice() < goodsSku.getPrice())) {
                goodsSku = goodsSku2;
            }
        }
        return goodsSku;
    }
}
