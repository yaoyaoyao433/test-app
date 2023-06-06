package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.l;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.m;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.domain.core.goods.GoodsLogField;
import com.sankuai.waimai.platform.domain.core.goods.GoodsRemind;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.MultiLineHorizontalFlowLayout;
import com.sankuai.waimai.platform.widget.SkuDialogLinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ChooseSkuGoodsDialog extends Dialog implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, OrderGoodObserver {
    public static ChangeQuickRedirect a;
    public static int h = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 40.0f);
    private LinkedHashMap<String, String> A;
    private HashMap<String, GoodsAttr> B;
    private HashSet<Long> C;
    private com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a D;
    private TextView E;
    private Boolean F;
    private LinearLayout G;
    private LinearLayout H;
    private View I;
    protected GoodsSpu b;
    protected k c;
    protected d d;
    boolean e;
    public View.OnClickListener f;
    public View.OnClickListener g;
    private String i;
    private long j;
    private int k;
    private GoodsSku l;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g m;
    private g n;
    private h o;
    private LayoutInflater p;
    private ViewGroup q;
    private LinearLayout r;
    private TextView s;
    private ImageView t;
    private TextView u;
    private ViewGroup v;
    private LinearLayout w;
    private WeakReference<View> x;
    private com.sankuai.waimai.restaurant.shopcart.ui.a y;
    private GoodsAttr[] z;

    public static /* synthetic */ void a(ChooseSkuGoodsDialog chooseSkuGoodsDialog, int i, GoodsAttr goodsAttr) {
        Object[] objArr = {Integer.valueOf(i), goodsAttr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "f2620e3f9a3a1c8d9a884bd402c5ffc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "f2620e3f9a3a1c8d9a884bd402c5ffc4");
        } else if (chooseSkuGoodsDialog.z != null && i >= 0 && i < chooseSkuGoodsDialog.z.length) {
            if (chooseSkuGoodsDialog.z[i] != null) {
                chooseSkuGoodsDialog.B.remove(chooseSkuGoodsDialog.z[i].getName());
            }
            chooseSkuGoodsDialog.B.put(goodsAttr.getName(), goodsAttr);
            chooseSkuGoodsDialog.C.clear();
            for (GoodsAttr goodsAttr2 : chooseSkuGoodsDialog.B.values()) {
                chooseSkuGoodsDialog.C.add(Long.valueOf(goodsAttr2.id));
            }
            chooseSkuGoodsDialog.z[i] = goodsAttr;
        }
    }

    public static /* synthetic */ void a(ChooseSkuGoodsDialog chooseSkuGoodsDialog, ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "23a19376f25b102f527ea96b5df58124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "23a19376f25b102f527ea96b5df58124");
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.setSelected(false);
                    TextView textView = (TextView) childAt.findViewById(R.id.txt_name);
                    if (textView != null && textView.getTag() != null) {
                        textView.setText(chooseSkuGoodsDialog.a((String) textView.getTag(), "#999999"));
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(ChooseSkuGoodsDialog chooseSkuGoodsDialog, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "b0d3065a7357c91df894746ab8c26092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "b0d3065a7357c91df894746ab8c26092");
            return;
        }
        chooseSkuGoodsDialog.A.remove(str);
        chooseSkuGoodsDialog.n();
    }

    public static /* synthetic */ void a(ChooseSkuGoodsDialog chooseSkuGoodsDialog, String str, GoodsAttr goodsAttr) {
        Object[] objArr = {str, goodsAttr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "372c7cf0c3c9973aac06063d7cc98e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "372c7cf0c3c9973aac06063d7cc98e7a");
            return;
        }
        chooseSkuGoodsDialog.A.put(str, goodsAttr.getValue());
        chooseSkuGoodsDialog.n();
    }

    public static /* synthetic */ void f(ChooseSkuGoodsDialog chooseSkuGoodsDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "0690d80e57968195366afd8b1e7e824c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "0690d80e57968195366afd8b1e7e824c");
        } else if (!com.sankuai.waimai.business.restaurant.poicontainer.helper.e.a(chooseSkuGoodsDialog.b) || chooseSkuGoodsDialog.m == null || chooseSkuGoodsDialog.b == null) {
        } else {
            JudasManualManager.a a2 = JudasManualManager.a("b_waimai_4z9s559u_mc").a("poi_id", chooseSkuGoodsDialog.m.f()).a(KernelConfig.KEY_CONTAINER_TYPE, chooseSkuGoodsDialog.m.s()).a("spu_id", chooseSkuGoodsDialog.b.id).a("brand_id", chooseSkuGoodsDialog.j).a("spu_type", chooseSkuGoodsDialog.b.spuType).a(chooseSkuGoodsDialog.m());
            a2.b = AppUtil.generatePageInfoKey(chooseSkuGoodsDialog.e());
            a2.a();
        }
    }

    public static /* synthetic */ void g(ChooseSkuGoodsDialog chooseSkuGoodsDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "3512a7aea999a88eda47d09f96b82712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "3512a7aea999a88eda47d09f96b82712");
        } else {
            super.dismiss();
        }
    }

    public static /* synthetic */ void x(ChooseSkuGoodsDialog chooseSkuGoodsDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "dbe49d007c6e591aefe999cc6b398cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "dbe49d007c6e591aefe999cc6b398cb8");
            return;
        }
        int childCount = chooseSkuGoodsDialog.r.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup = (ViewGroup) chooseSkuGoodsDialog.r.getChildAt(i);
            chooseSkuGoodsDialog.a(viewGroup, ((GoodsAttrList) viewGroup.getTag()).getName(), (GoodsAttr) null);
        }
    }

    public static /* synthetic */ void y(ChooseSkuGoodsDialog chooseSkuGoodsDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "73d51ab02b4c92e5a8c84f2dc8b9830f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseSkuGoodsDialog, changeQuickRedirect, false, "73d51ab02b4c92e5a8c84f2dc8b9830f");
            return;
        }
        int childCount = chooseSkuGoodsDialog.r.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup = (ViewGroup) chooseSkuGoodsDialog.r.getChildAt(i);
            if (viewGroup.getTag() != null && (viewGroup.getTag() instanceof GoodsAttrList)) {
                String name = ((GoodsAttrList) viewGroup.getTag()).getName();
                chooseSkuGoodsDialog.a(viewGroup, name, chooseSkuGoodsDialog.B.get(name));
            }
        }
    }

    public ChooseSkuGoodsDialog(Activity activity) {
        super(activity, R.style.WmSkuDialogTheme);
        WindowManager.LayoutParams attributes;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a30fbc2afb8c3cb64fb0b6ee6c3fbf39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a30fbc2afb8c3cb64fb0b6ee6c3fbf39");
            return;
        }
        this.k = -1;
        this.c = k.a();
        this.B = new HashMap<>();
        this.C = new HashSet<>();
        this.F = Boolean.valueOf(com.sankuai.waimai.business.restaurant.poicontainer.b.P());
        this.f = new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(final View view) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                String str;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be23c337d1bf38129f0c6981397351a5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be23c337d1bf38129f0c6981397351a5");
                    return;
                }
                if (ChooseSkuGoodsDialog.this.D != null) {
                    com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a aVar = ChooseSkuGoodsDialog.this.D;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "fcaeeeb30ef64682c29e70ab9d0bf791", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "fcaeeeb30ef64682c29e70ab9d0bf791");
                    } else if (aVar.c == null || com.sankuai.waimai.restaurant.shopcart.utils.b.a(aVar.c.multiAttrsList)) {
                        str = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (GoodsAttrList goodsAttrList : aVar.c.multiAttrsList) {
                            if (!aVar.e.containsKey(goodsAttrList.name)) {
                                sb.append("“");
                                sb.append(goodsAttrList.name);
                                sb.append("”、");
                            }
                        }
                        if (sb.length() > 0) {
                            sb.insert(0, "请选择");
                            sb.replace(sb.lastIndexOf("、"), sb.length(), "");
                        }
                        str = sb.toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ae.a(view, str);
                        return;
                    }
                }
                if (k.a().n(ChooseSkuGoodsDialog.this.m.f()).j() && !ChooseSkuGoodsDialog.this.e && ChooseSkuGoodsDialog.this.l != null) {
                    ChooseSkuGoodsDialog.this.l.hasFullDiscountPrice();
                }
                ChooseSkuGoodsDialog.this.c.a(ChooseSkuGoodsDialog.this.e(), ChooseSkuGoodsDialog.this.i, ChooseSkuGoodsDialog.this.b, ChooseSkuGoodsDialog.this.l, ChooseSkuGoodsDialog.this.z, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.8.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e3d971d2ed758ea1c86e703d3583d2c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e3d971d2ed758ea1c86e703d3583d2c6");
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                        Object[] objArr4 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d3ad427d952d6f0ea6689911ef4f385f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d3ad427d952d6f0ea6689911ef4f385f");
                            return;
                        }
                        if (ChooseSkuGoodsDialog.this.b().c) {
                            ChooseSkuGoodsDialog.this.y.a(ChooseSkuGoodsDialog.this.getContext(), view, ChooseSkuGoodsDialog.this.x == null ? null : (View) ChooseSkuGoodsDialog.this.x.get(), ChooseSkuGoodsDialog.this.v);
                        }
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.I, true);
                        if (com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.i, ChooseSkuGoodsDialog.this.b, ChooseSkuGoodsDialog.this.l) < ChooseSkuGoodsDialog.this.l() || ChooseSkuGoodsDialog.this.l() == -1) {
                            return;
                        }
                        View view2 = view;
                        Object[] objArr5 = {view2};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.restaurant.shopcart.utils.d.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "baad908f6423249e23f01dee22002eb2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "baad908f6423249e23f01dee22002eb2");
                        } else {
                            ae.a(view2, com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_out_of_stock));
                        }
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.I, false);
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) ChooseSkuGoodsDialog.this.E, false);
                        ChooseSkuGoodsDialog.this.d.a(true);
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar2) {
                        Object[] objArr4 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5538d4b0216fbfcfc8c3f7eef58c87af", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5538d4b0216fbfcfc8c3f7eef58c87af");
                            return;
                        }
                        if (!TextUtils.isEmpty(aVar2.getMessage())) {
                            ChooseSkuGoodsDialog.this.a(aVar2.getMessage());
                            ChooseSkuGoodsDialog.this.aF_();
                        }
                        i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("add_food").c(aVar2.getMessage()).b());
                    }
                });
                HashMap hashMap = new HashMap();
                try {
                    Map<String, Object> javaMap = MachProJsonUtil.a(ChooseSkuGoodsDialog.this.b.logData.toString()).getJavaMap();
                    if (javaMap != null) {
                        hashMap.putAll(javaMap);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                double d = -1.0d;
                int i6 = -1;
                if (ChooseSkuGoodsDialog.this.f()) {
                    hashMap.put("poi_id", ChooseSkuGoodsDialog.this.m.f());
                    hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(ChooseSkuGoodsDialog.this.b().a));
                    hashMap.put(DataConstants.CATEGORY_ID, ChooseSkuGoodsDialog.this.b.getTag());
                    hashMap.put("spu_id", Long.valueOf(ChooseSkuGoodsDialog.this.b.id));
                    hashMap.put("sku_id", ChooseSkuGoodsDialog.this.l != null ? Long.valueOf(ChooseSkuGoodsDialog.this.l.getSkuId()) : null);
                    hashMap.put("spu_type", Integer.valueOf(ChooseSkuGoodsDialog.this.b.spuType));
                    hashMap.put("rec_trace_id", ChooseSkuGoodsDialog.this.b.recTraceId);
                    hashMap.put("stid", ChooseSkuGoodsDialog.this.m.e);
                    hashMap.put("rank_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
                    hashMap.put("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref"));
                    if (ChooseSkuGoodsDialog.this.b().b >= 0) {
                        hashMap.put("product_index", Integer.valueOf(ChooseSkuGoodsDialog.this.n.b));
                    }
                    l.a(ChooseSkuGoodsDialog.this.e(), hashMap);
                    JSONObject jSONObject = ChooseSkuGoodsDialog.this.b.logData;
                    if (jSONObject != null) {
                        d = jSONObject.optDouble("reduce_price");
                        i2 = jSONObject.optInt("tag_type");
                        i3 = jSONObject.optInt("fixedprice");
                        i4 = jSONObject.optInt("category_type");
                        i5 = jSONObject.optInt("product_type");
                    } else {
                        i2 = -1;
                        i3 = -1;
                        i4 = -1;
                        i5 = -1;
                    }
                    hashMap.put("reduce_price", Double.valueOf(d));
                    hashMap.put("tag_type", Integer.valueOf(i2));
                    hashMap.put("fixedprice", Integer.valueOf(i3));
                    hashMap.put("word_type", l.a(jSONObject, "word_type", -1));
                    hashMap.put("seckill_act", Integer.valueOf(ChooseSkuGoodsDialog.this.l != null ? ChooseSkuGoodsDialog.this.l.getSeckill() : 0));
                    hashMap.put("brand_id", Long.valueOf(ChooseSkuGoodsDialog.this.m.A()));
                    hashMap.put("category_type", Integer.valueOf(i4));
                    hashMap.put("product_type", Integer.valueOf(i5));
                    JudasManualManager.a a2 = JudasManualManager.a("b_m9pmX").a((Map<String, Object>) hashMap).a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                    a2.a();
                    com.sankuai.waimai.ai.uat.b.a().a("GOODS_ADD_KEY", Long.valueOf(ChooseSkuGoodsDialog.this.b.getId()));
                } else if (!ChooseSkuGoodsDialog.this.g()) {
                    if (ChooseSkuGoodsDialog.this.h()) {
                        l.a(ChooseSkuGoodsDialog.this.e(), hashMap);
                        JudasManualManager.a a3 = JudasManualManager.a("b_bGeUX").a((Map<String, Object>) hashMap).a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("spu_type", ChooseSkuGoodsDialog.this.b.spuType).a("sku_id", (ChooseSkuGoodsDialog.this.l != null ? Long.valueOf(ChooseSkuGoodsDialog.this.l.getSkuId()) : null).longValue()).a("keyword", ChooseSkuGoodsDialog.this.c().a == null ? "" : ChooseSkuGoodsDialog.this.c().a).a("poisearch_log_id", ChooseSkuGoodsDialog.this.c().c).a("index", ChooseSkuGoodsDialog.this.c().d).a("poisearch_global_id", ChooseSkuGoodsDialog.this.c().b).a("c_1b9anm4");
                        a3.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                        a3.a();
                    } else if (ChooseSkuGoodsDialog.this.i()) {
                        JudasManualManager.a a4 = JudasManualManager.a("b_sz0fsbv3").a((Map<String, Object>) hashMap).a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("orig_price", "").a("current_price", ChooseSkuGoodsDialog.this.b.getPromotionInfo()).a("c_u4fk4kw");
                        a4.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                        a4.a();
                    } else if (ChooseSkuGoodsDialog.v(ChooseSkuGoodsDialog.this)) {
                        JudasManualManager.a a5 = JudasManualManager.a("b_m9pmX").a((Map<String, Object>) hashMap).a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("spu_type", ChooseSkuGoodsDialog.this.b.spuType).a("c_5y4tc0m");
                        a5.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                        a5.a();
                    }
                } else {
                    com.sankuai.waimai.platform.domain.manager.goods.a a6 = com.sankuai.waimai.platform.domain.manager.goods.a.a();
                    GoodsLogField goodLogField = ChooseSkuGoodsDialog.this.b.getGoodLogField();
                    if (goodLogField != null) {
                        d = goodLogField.getReducePrice();
                        i6 = goodLogField.getTagType();
                        i = goodLogField.getFixedPrice();
                    } else {
                        i = -1;
                    }
                    hashMap.put("reduce_price", Double.valueOf(d));
                    hashMap.put("tag_type", Integer.valueOf(i6));
                    hashMap.put("fixedprice", Integer.valueOf(i));
                    hashMap.put("seckill_act", Integer.valueOf(ChooseSkuGoodsDialog.this.l != null ? ChooseSkuGoodsDialog.this.l.getSeckill() : 0));
                    l.a(ChooseSkuGoodsDialog.this.e(), hashMap);
                    JudasManualManager.a a7 = JudasManualManager.a("b_fwQ6d").a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("sku_id", (ChooseSkuGoodsDialog.this.l != null ? Long.valueOf(ChooseSkuGoodsDialog.this.l.getSkuId()) : null).longValue()).a("is_show_remain_num", a6.d ? "1" : "0").a("has_comment", a6.e ? "1" : "0").a("comment_source", a6.f).a("product_tag", a6.c()).a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a("c_u4fk4kw");
                    a7.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                    a7.a((Map<String, Object>) hashMap).a();
                }
                if (!com.sankuai.waimai.business.restaurant.poicontainer.helper.e.a(ChooseSkuGoodsDialog.this.b) || ChooseSkuGoodsDialog.this.m == null || ChooseSkuGoodsDialog.this.b == null) {
                    return;
                }
                JudasManualManager.a a8 = JudasManualManager.a("b_waimai_wdl7j8kx_mc").a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a(KernelConfig.KEY_CONTAINER_TYPE, ChooseSkuGoodsDialog.this.m.s()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("spu_type", ChooseSkuGoodsDialog.this.b.spuType).a(ChooseSkuGoodsDialog.this.m());
                a8.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                a8.a();
            }
        };
        this.g = new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "161509c0b56e12d0281e2e1784a129bd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "161509c0b56e12d0281e2e1784a129bd");
                    return;
                }
                ChooseSkuGoodsDialog.this.c.a(ChooseSkuGoodsDialog.this.i, ChooseSkuGoodsDialog.this.b, ChooseSkuGoodsDialog.this.l, ChooseSkuGoodsDialog.this.z, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.9.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50bc4406b23bc6688efd5482c1817f64", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50bc4406b23bc6688efd5482c1817f64");
                        } else {
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) ChooseSkuGoodsDialog.this.E, true);
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff5d63ce378b907a20188eed0630c9e4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff5d63ce378b907a20188eed0630c9e4");
                        } else if (com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.i, ChooseSkuGoodsDialog.this.b, ChooseSkuGoodsDialog.this.l) >= ChooseSkuGoodsDialog.this.l() || ChooseSkuGoodsDialog.this.l() == -1) {
                        } else {
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.I, true);
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) ChooseSkuGoodsDialog.this.E, true);
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                        Object[] objArr3 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a2a7e369d4623e32d09593e14cb990c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a2a7e369d4623e32d09593e14cb990c");
                            return;
                        }
                        if (com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.i, ChooseSkuGoodsDialog.this.b, ChooseSkuGoodsDialog.this.l) >= ChooseSkuGoodsDialog.this.l() || ChooseSkuGoodsDialog.this.l() == -1) {
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.I, false);
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) ChooseSkuGoodsDialog.this.E, false);
                        } else {
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a(ChooseSkuGoodsDialog.this.I, true);
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) ChooseSkuGoodsDialog.this.E, true);
                        }
                        if (!TextUtils.isEmpty(aVar.getMessage())) {
                            ChooseSkuGoodsDialog.this.a(aVar.getMessage());
                            ChooseSkuGoodsDialog.this.aF_();
                        }
                        i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("delete_food").c(aVar.getMessage()).b());
                    }
                });
                if (ChooseSkuGoodsDialog.this.f()) {
                    int seckill = ChooseSkuGoodsDialog.this.l != null ? ChooseSkuGoodsDialog.this.l.getSeckill() : 0;
                    JudasManualManager.a a2 = JudasManualManager.a("b_FRrXo").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                    a2.a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a(KernelConfig.KEY_CONTAINER_TYPE, ChooseSkuGoodsDialog.this.b().a).a(DataConstants.CATEGORY_ID, ChooseSkuGoodsDialog.this.b.getTag()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("sku_id", ChooseSkuGoodsDialog.this.l != null ? ChooseSkuGoodsDialog.this.l.getSkuId() : 0L).a("seckill_act", seckill).a();
                } else if (!ChooseSkuGoodsDialog.this.g()) {
                    if (ChooseSkuGoodsDialog.this.i()) {
                        JudasManualManager.a a3 = JudasManualManager.a("b_4y1xwrgy").a("c_u4fk4kw");
                        a3.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                        a3.a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("orig_price", "").a("current_price", ChooseSkuGoodsDialog.this.b.getPromotionInfo()).a();
                    }
                } else {
                    com.sankuai.waimai.platform.domain.manager.goods.a a4 = com.sankuai.waimai.platform.domain.manager.goods.a.a();
                    JudasManualManager.a a5 = JudasManualManager.b("b_utxGH").a("c_u4fk4kw");
                    a5.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                    a5.a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("sku_id", ChooseSkuGoodsDialog.this.l != null ? ChooseSkuGoodsDialog.this.l.getSkuId() : 0L).a("is_show_remain_num", a4.d ? "1" : "0").a("has_comment", a4.e ? "1" : "0").a("comment_source", a4.f).a("product_tag", a4.c()).a();
                }
                if (!com.sankuai.waimai.business.restaurant.poicontainer.helper.e.a(ChooseSkuGoodsDialog.this.b) || ChooseSkuGoodsDialog.this.m == null || ChooseSkuGoodsDialog.this.b == null) {
                    return;
                }
                JudasManualManager.a a6 = JudasManualManager.a("b_waimai_w0dvsowh_mc").a("poi_id", ChooseSkuGoodsDialog.this.m.f()).a(KernelConfig.KEY_CONTAINER_TYPE, ChooseSkuGoodsDialog.this.m.s()).a("spu_id", ChooseSkuGoodsDialog.this.b.id).a("spu_type", ChooseSkuGoodsDialog.this.b.spuType).a(ChooseSkuGoodsDialog.this.m());
                a6.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                a6.a();
            }
        };
        this.v = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, 2131558963)).inflate(R.layout.takeout_goods_dialog_choosesku, (ViewGroup) null, false);
        setContentView(this.v);
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.gravity = 17;
            attributes.height = -1;
            attributes.width = -1;
            window.setAttributes(attributes);
        }
        setOwnerActivity(activity);
        setOnDismissListener(this);
        setOnCancelListener(this);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b262372eb9fa0bb21e6e9ed4ad73ad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b262372eb9fa0bb21e6e9ed4ad73ad2");
            return;
        }
        this.v = (ViewGroup) findViewById(R.id.goods_dialog_choosesku);
        this.r = (LinearLayout) findViewById(R.id.layout_sku_and_attr_holder);
        this.s = (TextView) findViewById(R.id.title_name);
        this.t = (ImageView) findViewById(R.id.btn_dialog_close);
        this.q = (ViewGroup) findViewById(R.id.layout_scroll_price_info);
        this.u = (TextView) findViewById(R.id.txt_choose_info);
        this.u.setVisibility(0);
        this.w = (LinearLayout) findViewById(R.id.show_choose_sku);
        this.I = findViewById(R.id.img_foodCount_add);
        this.E = (TextView) this.q.findViewById(R.id.txt_add_shopcart);
        if (this.F.booleanValue()) {
            new SkuDialogLinearLayout(getContext()).setMaxHeight(700);
            this.s.setTextSize(30.0f);
            this.s.setMaxLines(2);
            this.u.setTextSize(24.0f);
            this.u.setMaxLines(2);
            this.u.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a78ccf2e0d8b907be56dee4afce7a9a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a78ccf2e0d8b907be56dee4afce7a9a7");
            return;
        }
        super.onCreate(bundle);
        if (f()) {
            JudasManualManager.a a2 = JudasManualManager.b("b_UHTLt").a("poi_id", this.m.f()).a(KernelConfig.KEY_CONTAINER_TYPE, b().a).a("spu_id", this.b.id);
            a2.b = AppUtil.generatePageInfoKey(e());
            a2.a("c_CijEL").a();
        }
        if (!com.sankuai.waimai.business.restaurant.poicontainer.helper.e.a(this.b) || this.m == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        List<GoodsSku> skuList = this.b.getSkuList();
        if (skuList != null && skuList.size() > 0) {
            for (GoodsSku goodsSku : skuList) {
                if (goodsSku != null && goodsSku.isSoldable() && goodsSku.activityType == 1) {
                    sb.append(goodsSku.getSkuId() + CommonConstant.Symbol.COMMA);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        JudasManualManager.a a3 = JudasManualManager.b("b_waimai_sm4z3bwx_mv").a("poi_id", this.m.f()).a(KernelConfig.KEY_CONTAINER_TYPE, this.m.s()).a("spu_id", this.b.id).a("spu_type", this.b.spuType).a("sku_id", sb.toString()).a(m());
        a3.b = AppUtil.generatePageInfoKey(e());
        a3.a();
    }

    @Override // android.app.Dialog
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42379faa9f0595458ca04a287008f401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42379faa9f0595458ca04a287008f401");
            return;
        }
        super.onStart();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a1c7f3a285329a37821e106a8adaa1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a1c7f3a285329a37821e106a8adaa1e");
        } else {
            Activity e = e();
            if (e != null) {
                this.p = LayoutInflater.from(e);
                this.y = new com.sankuai.waimai.restaurant.shopcart.ui.a();
                this.d = new d(e(), this.q);
                d dVar = this.d;
                double minPrice = this.b.getMinPrice();
                Object[] objArr3 = {Double.valueOf(minPrice)};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "b60f8528d6217dbeebb532dbe0bfc7c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "b60f8528d6217dbeebb532dbe0bfc7c2");
                } else {
                    dVar.k.setVisibility(8);
                    dVar.g.setVisibility(8);
                    dVar.f.setVisibility(8);
                    dVar.a(minPrice);
                }
                if (com.sankuai.waimai.business.restaurant.poicontainer.helper.e.b(this.b) && com.sankuai.waimai.foundation.utils.g.a((Context) e()) <= 720) {
                    d dVar2 = this.d;
                    Object[] objArr4 = {18};
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "6582ee51d1a899d2b256eb3bb1ca4380", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "6582ee51d1a899d2b256eb3bb1ca4380");
                    } else if (dVar2.c != null) {
                        dVar2.c.setTextSize(1, 18.0f);
                    }
                }
                this.q.setBackgroundResource(R.drawable.wm_goods_choosesku_background);
                this.c.a(this);
                this.A = new LinkedHashMap<>();
                if (this.b != null && this.b.hasMultiSaleAttr && this.b.getFoodMultiSpuResponse() != null && this.b.getFoodMultiSpuResponse().multiAttrsList != null && this.b.getFoodMultiSpuResponse().multiAttrsList.size() > 0) {
                    k();
                } else {
                    j();
                }
                n();
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1c1b43a25b38abf1d46531a29bea69a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1c1b43a25b38abf1d46531a29bea69a0");
                } else {
                    this.t.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr6 = {view};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "13a99fcc54388e42de8bfa30ac45b3ef", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "13a99fcc54388e42de8bfa30ac45b3ef");
                                return;
                            }
                            if (ChooseSkuGoodsDialog.this.f()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("poi_id", ChooseSkuGoodsDialog.this.m.f());
                                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(ChooseSkuGoodsDialog.this.n.a));
                                hashMap.put("spu_ordered", Boolean.valueOf(!com.sankuai.waimai.foundation.utils.d.a(k.a().b(ChooseSkuGoodsDialog.this.m.f(), ChooseSkuGoodsDialog.this.b.getId()))));
                                hashMap.put("brand_id", Long.valueOf(ChooseSkuGoodsDialog.this.j));
                                JudasManualManager.a a2 = JudasManualManager.a("b_7IVOH").a("c_CijEL");
                                a2.b = AppUtil.generatePageInfoKey(ChooseSkuGoodsDialog.this.e());
                                a2.b(hashMap).a();
                            }
                            ChooseSkuGoodsDialog.f(ChooseSkuGoodsDialog.this);
                            ChooseSkuGoodsDialog.this.dismiss();
                        }
                    });
                    d dVar3 = this.d;
                    View.OnClickListener onClickListener = this.f;
                    View.OnClickListener onClickListener2 = this.g;
                    Object[] objArr6 = {onClickListener, onClickListener2};
                    ChangeQuickRedirect changeQuickRedirect6 = d.a;
                    if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "9e0952e7810f42b9ad34826c8fdbd421", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "9e0952e7810f42b9ad34826c8fdbd421");
                    } else {
                        dVar3.o.setIncListener(onClickListener);
                        dVar3.o.setDecListener(onClickListener2);
                    }
                    this.v.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr7 = {view};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "981bd301f721d3020c6d8837ddf613c7", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "981bd301f721d3020c6d8837ddf613c7");
                                return;
                            }
                            ChooseSkuGoodsDialog.f(ChooseSkuGoodsDialog.this);
                            ChooseSkuGoodsDialog.this.dismiss();
                        }
                    });
                    findViewById(R.id.show_choose_sku).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr7 = {view};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aa5e638388b91ce66fcbd36c2764d29c", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aa5e638388b91ce66fcbd36c2764d29c");
                            }
                        }
                    });
                }
            }
        }
        JudasManualManager.a("c_CijEL", this);
        ae.a(getWindow());
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ff711654c9c799c8c068ba1406271660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ff711654c9c799c8c068ba1406271660");
            return;
        }
        this.w.clearAnimation();
        this.w.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.wm_goods_sku_enter));
    }

    public final void a(int i, Poi poi, GoodsSpu goodsSpu, View view) {
        Object[] objArr = {Integer.valueOf(i), poi, goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b44b41362036c0f46304aa5474f75b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b44b41362036c0f46304aa5474f75b");
        } else if (poi == null || goodsSpu == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("ChooseSkuGoodsDialog", "输入参数不合法", new Object[0]);
        } else {
            this.k = i;
            this.x = new WeakReference<>(view);
            this.m = new com.sankuai.waimai.business.restaurant.base.manager.order.g(poi);
            this.i = this.m.f();
            this.j = this.m.A();
            this.b = goodsSpu;
        }
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449a66617dfb7e71ce0b5712e6192d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449a66617dfb7e71ce0b5712e6192d63");
            return;
        }
        b().a = i;
        b().b = i2;
        b().c = z;
    }

    public final g b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5127c57d74684ad18d4817779d3592f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5127c57d74684ad18d4817779d3592f0");
        }
        if (this.n == null) {
            this.n = new g();
        }
        return this.n;
    }

    public final h c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667cd68a66363a67cf5211bfd62efb00", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667cd68a66363a67cf5211bfd62efb00");
        }
        if (this.o == null) {
            this.o = new h();
        }
        return this.o;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66132c9a9e1b681aee8ed61b75118e15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66132c9a9e1b681aee8ed61b75118e15");
            return;
        }
        try {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null || ownerActivity.isFinishing()) {
                return;
            }
            show();
        } catch (Exception e) {
            i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("waimai_restaurant").c(e.getMessage()).b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ad102a36163a9815d0609cbf5e1c62", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ad102a36163a9815d0609cbf5e1c62");
        }
        Context context = getContext();
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return this.k == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.k == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.k == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return this.k == 4;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e216b2c22e31f1c677040fd30cda92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e216b2c22e31f1c677040fd30cda92");
        } else {
            this.c.b(this);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90763dcb97429f439ec8b1f100c71f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90763dcb97429f439ec8b1f100c71f9");
            return;
        }
        this.x = null;
        this.c.b(this);
        ae.a();
        com.sankuai.waimai.touchmatrix.views.b.a().b(this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03dc1b27a5de33d0ec24cff0529129fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03dc1b27a5de33d0ec24cff0529129fd");
            return;
        }
        this.w.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(e(), R.anim.wm_goods_sku_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.6
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40a210ad71b2dc998dd0a71a54c3eca1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40a210ad71b2dc998dd0a71a54c3eca1");
                } else {
                    ChooseSkuGoodsDialog.g(ChooseSkuGoodsDialog.this);
                }
            }
        });
        this.w.startAnimation(loadAnimation);
    }

    private void j() {
        LinearLayout a2;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64553cadbf789227e0f715edbc0fda59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64553cadbf789227e0f715edbc0fda59");
        } else if (this.b != null) {
            this.r.removeAllViews();
            this.s.setText(this.b.getName());
            List<GoodsSku> skuList = this.b.getSkuList();
            Map<String, List<GoodsAttr>> attrList = this.b.getAttrList();
            OrderedFood a3 = e.a(k.a().b(this.i, this.b.getId()), skuList, attrList);
            if (skuList != null && skuList.size() > 0) {
                if (a3 == null) {
                    LinkedList linkedList = new LinkedList(skuList);
                    Collections.sort(linkedList, new Comparator<GoodsSku>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.7
                        public static ChangeQuickRedirect a;

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(GoodsSku goodsSku, GoodsSku goodsSku2) {
                            GoodsSku goodsSku3 = goodsSku;
                            GoodsSku goodsSku4 = goodsSku2;
                            Object[] objArr2 = {goodsSku3, goodsSku4};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "470622c51538c7adea1629db18b6ea6e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "470622c51538c7adea1629db18b6ea6e")).intValue() : Double.compare(goodsSku3.price, goodsSku4.price);
                        }
                    });
                    GoodsSku a4 = a(linkedList);
                    if (a4 != null) {
                        a2 = a(this.b.getSkuLabel(), skuList, a4.getSkuId());
                    } else {
                        a2 = a(this.b.getSkuLabel(), skuList, 0L);
                    }
                } else {
                    a2 = a(this.b.getSkuLabel(), skuList, a3.getSkuId());
                }
                if (a2 != null) {
                    this.r.addView(a2);
                }
            }
            if (attrList == null || attrList.size() <= 0) {
                return;
            }
            this.z = a(a3, attrList);
            for (String str : this.b.getAttrNameList()) {
                List<GoodsAttr> list = attrList.get(str);
                if (list != null) {
                    LinearLayout a5 = a(str, list, this.B.get(str), i);
                    if (this.b.attrs != null) {
                        a5.setTag(this.b.attrs.get(i));
                    }
                    this.r.addView(a5);
                    i++;
                }
            }
        }
    }

    private GoodsAttr[] a(OrderedFood orderedFood, Map<String, List<GoodsAttr>> map) {
        GoodsAttr[] goodsAttrArr;
        GoodsAttr goodsAttr;
        int i = 2;
        char c = 1;
        Object[] objArr = {orderedFood, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd368bf2fe13b089fde29596425e340b", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd368bf2fe13b089fde29596425e340b");
        }
        if (orderedFood != null && orderedFood.getAttrIds() != null) {
            goodsAttrArr = orderedFood.getAttrIds();
            if (goodsAttrArr != null && goodsAttrArr.length > 0) {
                for (GoodsAttr goodsAttr2 : goodsAttrArr) {
                    this.C.add(Long.valueOf(goodsAttr2.id));
                }
            }
            Iterator<Long> it = this.C.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                Object[] objArr2 = new Object[i];
                objArr2[0] = new Long(longValue);
                objArr2[c] = map;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de51a33a8c22af62415824e34ba83704", RobustBitConfig.DEFAULT_VALUE)) {
                    Iterator<List<GoodsAttr>> it2 = map.values().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            goodsAttr = null;
                            break;
                        }
                        for (GoodsAttr goodsAttr3 : it2.next()) {
                            if (goodsAttr3.id == longValue) {
                                goodsAttr = goodsAttr3;
                                break;
                            }
                        }
                    }
                } else {
                    goodsAttr = (GoodsAttr) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de51a33a8c22af62415824e34ba83704");
                }
                if (goodsAttr != null) {
                    this.B.put(goodsAttr.getName(), goodsAttr);
                }
                i = 2;
                c = 1;
            }
        } else {
            goodsAttrArr = new GoodsAttr[map.size()];
            List<String> attrNameList = this.b.getAttrNameList();
            for (String str : attrNameList) {
                List<GoodsAttr> list = map.get(str);
                if (list != null) {
                    HashMap<String, GoodsAttr> hashMap = new HashMap<>(this.B);
                    hashMap.remove(str);
                    Set<Long> a2 = a(hashMap);
                    Iterator<GoodsAttr> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            GoodsAttr next = it3.next();
                            if (!a2.contains(Long.valueOf(next.id))) {
                                this.C.add(Long.valueOf(next.id));
                                this.B.put(str, next);
                                break;
                            }
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < attrNameList.size(); i2++) {
                goodsAttrArr[i2] = this.B.get(attrNameList.get(i2));
            }
        }
        return goodsAttrArr;
    }

    private Set<Long> a(HashMap<String, GoodsAttr> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e1ff5b2059dc5153c7e8c70aa29a5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e1ff5b2059dc5153c7e8c70aa29a5b");
        }
        HashSet hashSet = new HashSet();
        if (hashMap.size() == 0) {
            return hashSet;
        }
        for (GoodsAttr goodsAttr : hashMap.values()) {
            if (goodsAttr != null && !com.sankuai.waimai.restaurant.shopcart.utils.b.a(goodsAttr.mutexAttrs)) {
                hashSet.addAll(goodsAttr.mutexAttrs);
            }
        }
        return hashSet;
    }

    private void k() {
        OrderedFood a2;
        GoodsAttr[] attrIds;
        GoodsSku goodsSku;
        FoodMultiSpuResponse foodMultiSpuResponse;
        GoodsAttr goodsAttr;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb114c1b229b921759078e731541cf80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb114c1b229b921759078e731541cf80");
        } else if (this.b != null) {
            this.r.removeAllViews();
            this.s.setText(this.b.getName());
            this.D = new com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a(this.b, this.m);
            com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a aVar = this.D;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b3c705ee546c1e586d6f343eb6de1da2", RobustBitConfig.DEFAULT_VALUE)) {
                foodMultiSpuResponse = (FoodMultiSpuResponse) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b3c705ee546c1e586d6f343eb6de1da2");
            } else if (aVar.c == null) {
                foodMultiSpuResponse = null;
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "48e27c587575f7a3d36e775b0fd4c04a", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (OrderedFood) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "48e27c587575f7a3d36e775b0fd4c04a");
                } else {
                    a2 = aVar.b == null ? null : e.a(k.a().b(aVar.d.f(), aVar.b.getId()), aVar.b.getSkuList(), aVar.b.getAttrList());
                }
                if (a2 == null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "6012ef6022866e95942f5abdb5f10f86", RobustBitConfig.DEFAULT_VALUE)) {
                        goodsSku = (GoodsSku) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "6012ef6022866e95942f5abdb5f10f86");
                    } else {
                        if (!com.sankuai.waimai.restaurant.shopcart.utils.b.a(aVar.b.skus)) {
                            aVar.a();
                            if (aVar.c != null && aVar.c.skuAttrsMap != null && aVar.c.skuAttrsMap.size() != 0) {
                                for (int i2 = 0; i2 < aVar.b.skus.size(); i2++) {
                                    GoodsSku goodsSku2 = aVar.b.skus.get(i2);
                                    if (aVar.c.skuAttrsMap.containsKey(Long.valueOf(goodsSku2.id)) && goodsSku2.isSoldable()) {
                                        goodsSku = goodsSku2;
                                        break;
                                    }
                                }
                            }
                        }
                        goodsSku = null;
                    }
                    attrIds = null;
                } else {
                    GoodsSku goodsSku3 = a2.sku;
                    attrIds = a2.getAttrIds();
                    goodsSku = goodsSku3;
                }
                if (goodsSku == null && !com.sankuai.waimai.restaurant.shopcart.utils.b.a(aVar.c.multiAttrsList)) {
                    for (GoodsAttrList goodsAttrList : aVar.c.multiAttrsList) {
                        for (GoodsAttr goodsAttr2 : goodsAttrList.values) {
                            goodsAttr2.status = 1;
                        }
                    }
                    foodMultiSpuResponse = aVar.c;
                } else {
                    if (attrIds != null && attrIds.length > 0) {
                        for (GoodsAttr goodsAttr3 : attrIds) {
                            aVar.f.add(Long.valueOf(goodsAttr3.id));
                        }
                    }
                    if (aVar.c.skuAttrsMap != null && aVar.c.skuAttrsMap.size() > 0) {
                        for (com.sankuai.waimai.platform.domain.core.goods.g gVar : aVar.c.skuAttrsMap.get(Long.valueOf(goodsSku.id))) {
                            aVar.f.add(Long.valueOf(gVar.c));
                        }
                    }
                    Iterator<Long> it = aVar.f.iterator();
                    while (it.hasNext()) {
                        long longValue = it.next().longValue();
                        Object[] objArr5 = {new Long(longValue)};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "5ec42f3126285bcffd982d1cd2ad8f35", RobustBitConfig.DEFAULT_VALUE)) {
                            goodsAttr = (GoodsAttr) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "5ec42f3126285bcffd982d1cd2ad8f35");
                        } else {
                            if (aVar.c != null && !com.sankuai.waimai.restaurant.shopcart.utils.b.a(aVar.c.multiAttrsList)) {
                                for (GoodsAttrList goodsAttrList2 : aVar.c.multiAttrsList) {
                                    for (GoodsAttr goodsAttr4 : goodsAttrList2.values) {
                                        if (goodsAttr4.id == longValue) {
                                            goodsAttr = goodsAttr4;
                                            break;
                                        }
                                    }
                                }
                            }
                            goodsAttr = null;
                        }
                        if (goodsAttr != null) {
                            aVar.e.put(goodsAttr.getName(), goodsAttr);
                        }
                    }
                    aVar.a(true);
                    foodMultiSpuResponse = aVar.c;
                }
            }
            if (foodMultiSpuResponse.multiAttrsList == null || foodMultiSpuResponse.multiAttrsList.size() <= 0) {
                return;
            }
            this.l = this.D.b();
            this.z = this.D.c();
            for (GoodsAttrList goodsAttrList3 : foodMultiSpuResponse.multiAttrsList) {
                List<GoodsAttr> list = goodsAttrList3.values;
                if (list != null) {
                    LinearLayout a3 = a(goodsAttrList3.getName(), list, (GoodsAttr) null, i);
                    a3.setTag(goodsAttrList3);
                    this.r.addView(a3);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2201a58a7e53a3945359063becbce3c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2201a58a7e53a3945359063becbce3c")).intValue() : this.l.getStock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9162660747ff60f5e4d3a5c7eeb04eb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9162660747ff60f5e4d3a5c7eeb04eb") : g() ? "c_u4fk4kw" : h() ? "c_1b9anm4" : i() ? "c_u4fk4kw" : "c_CijEL";
    }

    private GoodsSku a(List<GoodsSku> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7529ff4799f90bd5d4087b037f5cc702", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7529ff4799f90bd5d4087b037f5cc702");
        }
        if (list.size() <= 0) {
            return null;
        }
        for (GoodsSku goodsSku : list) {
            if (goodsSku.isSoldable()) {
                return goodsSku;
            }
        }
        return null;
    }

    private void a(int i, GoodsSku goodsSku) {
        Object[] objArr = {Integer.valueOf(i), goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3240fd152cc5321a27149665ea6f24a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3240fd152cc5321a27149665ea6f24a");
            return;
        }
        this.d.a((String) null);
        d dVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "5fe0dbaa01d948ab8ea2027b980d11d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "5fe0dbaa01d948ab8ea2027b980d11d7");
        } else {
            dVar.d.setVisibility(0);
        }
        if (this.m.g.getState() == 3) {
            d dVar2 = this.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "edcfcd129580563a4bf0a082620b6da6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "edcfcd129580563a4bf0a082620b6da6");
                return;
            }
            dVar2.m.setVisibility(8);
            dVar2.o.setVisibility(8);
            dVar2.h.setVisibility(8);
            dVar2.i.setVisibility(8);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "47835e46a4e58465e41654a470c8a9f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "47835e46a4e58465e41654a470c8a9f6");
            } else if (dVar2.o == null || dVar2.m == null || dVar2.n == null) {
            } else {
                dVar2.o.setVisibility(4);
                dVar2.m.setVisibility(8);
                dVar2.n.setVisibility(8);
            }
        } else if (goodsSku == null || this.b == null) {
            this.d.b(null);
        } else {
            if (goodsSku.activityType == 9) {
                this.d.a(aa.a(goodsSku.priceDesc) ? "总计" : goodsSku.priceDesc);
                d dVar3 = this.d;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = d.a;
                if (PatchProxy.isSupport(objArr5, dVar3, changeQuickRedirect5, false, "b38f92faea287877076d545cd0890b4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, dVar3, changeQuickRedirect5, false, "b38f92faea287877076d545cd0890b4a");
                } else {
                    dVar3.d.setVisibility(8);
                }
            }
            switch (this.b.getStatus()) {
                case 1:
                case 2:
                    this.d.b(this.b.statusDescription);
                    return;
                case 3:
                    d dVar4 = this.d;
                    List<GoodsRemind> list = this.b.getmRemindList();
                    Object[] objArr6 = {list};
                    ChangeQuickRedirect changeQuickRedirect6 = d.a;
                    if (PatchProxy.isSupport(objArr6, dVar4, changeQuickRedirect6, false, "d2a50e6681a6fdf4796d96abcfaea108", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, dVar4, changeQuickRedirect6, false, "d2a50e6681a6fdf4796d96abcfaea108");
                        return;
                    }
                    dVar4.i.setVisibility(0);
                    dVar4.i.setOnClickListener(new m(dVar4.b, list));
                    dVar4.h.setVisibility(8);
                    dVar4.o.setVisibility(4);
                    dVar4.m.setVisibility(8);
                    dVar4.n.setVisibility(8);
                    return;
                default:
                    this.d.a(i, false, goodsSku.getMinOrderCount(), a(goodsSku, i), null, this.f);
                    return;
            }
        }
    }

    private boolean a(GoodsSku goodsSku, int i) {
        Object[] objArr = {goodsSku, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604365bc6096cb996e1978ade18110ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604365bc6096cb996e1978ade18110ac")).booleanValue();
        }
        int minOrderCount = goodsSku.getMinOrderCount();
        return minOrderCount > 1 && i < minOrderCount;
    }

    private LinearLayout a(final String str, List<GoodsSku> list, long j) {
        ViewGroup viewGroup;
        boolean z = false;
        Object[] objArr = {str, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b51409c18e10b51f54573784199e2c8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b51409c18e10b51f54573784199e2c8f");
        }
        if (list.size() == 1) {
            this.l = list.get(0);
            if (TextUtils.isEmpty(a(this.l))) {
                return null;
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.p.inflate(R.layout.takeout_layout_food_sku, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.txt_label);
        if (this.F.booleanValue()) {
            textView.setTextSize(20.0f);
            viewGroup = (ViewGroup) linearLayout.findViewById(R.id.layout_attribute_for_old_people);
        } else {
            viewGroup = (ViewGroup) linearLayout.findViewById(R.id.layout_attribute);
        }
        ViewGroup viewGroup2 = viewGroup;
        viewGroup2.setVisibility(0);
        textView.setText(str);
        Iterator<GoodsSku> it = list.iterator();
        while (it.hasNext()) {
            GoodsSku next = it.next();
            View inflate = this.p.inflate(R.layout.takeout_btn_food_sku, viewGroup2, z);
            final TextView textView2 = (TextView) inflate.findViewById(R.id.txt_name);
            if (this.F.booleanValue()) {
                this.G = (LinearLayout) inflate.findViewById(R.id.ll_sku_container);
                textView2.setTextSize(24.0f);
                textView2.setSingleLine(z);
                textView2.setGravity(3);
                textView2.setGravity(16);
                textView2.setMaxWidth(com.sankuai.waimai.foundation.utils.g.a(getContext(), 280.0f));
                inflate.findViewById(R.id.takeout_btn_food_sku_layout).getLayoutParams().height = -2;
                this.G.getLayoutParams().height = -2;
                this.G.setPadding(com.sankuai.waimai.foundation.utils.g.a(getContext(), 9.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 6.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 9.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 6.0f));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
                marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(getContext(), 12.0f);
                this.G.setLayoutParams(marginLayoutParams);
            }
            final SpannableStringBuilder a2 = a(a(next), "#FFB000");
            Object[] objArr2 = {inflate, next, a2, str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            Iterator<GoodsSku> it2 = it;
            LinearLayout linearLayout2 = linearLayout;
            final ViewGroup viewGroup3 = viewGroup2;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dbaac3b23405940860857f80d7d3e78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dbaac3b23405940860857f80d7d3e78");
            } else {
                TextView textView3 = (TextView) inflate.findViewById(R.id.txt_name);
                TextView textView4 = (TextView) inflate.findViewById(R.id.tv_good_coupon_price_tag);
                TextView textView5 = (TextView) inflate.findViewById(R.id.food_sku_discount);
                if (next.activityType != 9 || aa.a(next.specDesc)) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(8);
                    textView4.setText(next.specDesc);
                }
                String a3 = a(next);
                textView3.setTag(a3);
                SpannableStringBuilder a4 = a(a3, "#999999");
                SpannableStringBuilder a5 = a(a3, "#c9c9c9");
                textView3.setText(a4);
                inflate.setTag(next);
                if (next.getStatus() == 1) {
                    textView3.setText(a5);
                    inflate.setEnabled(false);
                    textView5.setEnabled(false);
                } else if (!next.isSoldable()) {
                    textView3.setText(a5);
                    inflate.setEnabled(false);
                    textView5.setEnabled(false);
                } else if (j == next.getSkuId()) {
                    textView3.setText(a2);
                    inflate.setEnabled(true);
                    inflate.setSelected(true);
                    textView5.setEnabled(true);
                    a(next, str);
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.10
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec2e1fc7d8fc9b90b3a4cc4296d69476", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec2e1fc7d8fc9b90b3a4cc4296d69476");
                                return;
                            }
                            ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, viewGroup3);
                            view.setSelected(true);
                            textView2.setText(a2);
                            ChooseSkuGoodsDialog.this.a((GoodsSku) view.getTag(), str);
                        }
                    });
                    viewGroup3.addView(inflate);
                    viewGroup2 = viewGroup3;
                    it = it2;
                    linearLayout = linearLayout2;
                    z = false;
                } else {
                    inflate.setEnabled(true);
                    inflate.setSelected(false);
                    textView5.setEnabled(true);
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.10
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec2e1fc7d8fc9b90b3a4cc4296d69476", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec2e1fc7d8fc9b90b3a4cc4296d69476");
                                return;
                            }
                            ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, viewGroup3);
                            view.setSelected(true);
                            textView2.setText(a2);
                            ChooseSkuGoodsDialog.this.a((GoodsSku) view.getTag(), str);
                        }
                    });
                    viewGroup3.addView(inflate);
                    viewGroup2 = viewGroup3;
                    it = it2;
                    linearLayout = linearLayout2;
                    z = false;
                }
            }
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.10
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec2e1fc7d8fc9b90b3a4cc4296d69476", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec2e1fc7d8fc9b90b3a4cc4296d69476");
                        return;
                    }
                    ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, viewGroup3);
                    view.setSelected(true);
                    textView2.setText(a2);
                    ChooseSkuGoodsDialog.this.a((GoodsSku) view.getTag(), str);
                }
            });
            viewGroup3.addView(inflate);
            viewGroup2 = viewGroup3;
            it = it2;
            linearLayout = linearLayout2;
            z = false;
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GoodsSku goodsSku, String str) {
        Object[] objArr = {goodsSku, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc368655b0287d455f5426414ca12171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc368655b0287d455f5426414ca12171");
            return;
        }
        this.A.put(str, a(goodsSku));
        this.l = goodsSku;
        n();
    }

    private LinearLayout a(final String str, List<GoodsAttr> list, GoodsAttr goodsAttr, final int i) {
        final ViewGroup viewGroup;
        Object[] objArr = {str, list, goodsAttr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ccb3f77198449da6e56af6f6c17a56e", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ccb3f77198449da6e56af6f6c17a56e");
        }
        LinearLayout linearLayout = (LinearLayout) this.p.inflate(R.layout.takeout_layout_food_sku, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.txt_label);
        if (this.F.booleanValue()) {
            textView.setTextSize(20.0f);
            viewGroup = (ViewGroup) linearLayout.findViewById(R.id.layout_attribute_for_old_people);
        } else {
            viewGroup = (ViewGroup) linearLayout.findViewById(R.id.layout_attribute);
        }
        viewGroup.setVisibility(0);
        ((MultiLineHorizontalFlowLayout) viewGroup).setChildHeight(com.sankuai.waimai.foundation.utils.g.a(getContext(), 49.0f));
        textView.setText(str);
        if (com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.i, this.b, this.l) == l()) {
            com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.I, false);
            com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) this.E, false);
        }
        final ArrayList arrayList = new ArrayList();
        for (GoodsAttr goodsAttr2 : list) {
            FrameLayout frameLayout = (FrameLayout) this.p.inflate(R.layout.takeout_btn_food_attr, viewGroup, false);
            f.a((TextView) frameLayout.findViewById(R.id.tv_rmb_sign));
            f.a((TextView) frameLayout.findViewById(R.id.txt_price));
            if (this.F.booleanValue()) {
                arrayList.add(frameLayout);
                this.H = (LinearLayout) frameLayout.findViewById(R.id.ll_spu_item);
                this.H.setClipChildren(false);
                this.H.setClipToPadding(false);
                ((TextView) frameLayout.findViewById(R.id.tv_rmb_sign)).setTextSize(24.0f);
                ((TextView) frameLayout.findViewById(R.id.txt_price)).setTextSize(24.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
                marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(getContext(), 12.0f);
                this.H.setLayoutParams(marginLayoutParams);
                this.H.setPadding(com.sankuai.waimai.foundation.utils.g.a(getContext(), 9.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 6.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 9.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 6.0f));
                this.H.getLayoutParams().height = -2;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.findViewById(R.id.layout_price).getLayoutParams();
                marginLayoutParams2.topMargin = com.sankuai.waimai.foundation.utils.g.a(getContext(), -6.0f);
                marginLayoutParams2.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(getContext(), -6.0f);
                frameLayout.findViewById(R.id.layout_price).setLayoutParams(marginLayoutParams2);
                frameLayout.findViewById(R.id.takeout_btn_food_attr_layout).getLayoutParams().height = -2;
            }
            a(frameLayout, goodsAttr2, goodsAttr, str);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c68fa993c53318238b1bcbebb3e3a6a6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c68fa993c53318238b1bcbebb3e3a6a6");
                        return;
                    }
                    GoodsAttr goodsAttr3 = (GoodsAttr) view.getTag();
                    if (ChooseSkuGoodsDialog.this.D != null) {
                        if (goodsAttr3.status == 2) {
                            com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a aVar = ChooseSkuGoodsDialog.this.D;
                            Object[] objArr3 = {goodsAttr3};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a81550dfc5d7d3c8c87879590395114c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a81550dfc5d7d3c8c87879590395114c");
                            } else {
                                aVar.e.remove(goodsAttr3.getName());
                                aVar.a(false);
                            }
                            ChooseSkuGoodsDialog.this.l = ChooseSkuGoodsDialog.this.D.b();
                            ChooseSkuGoodsDialog.this.z = ChooseSkuGoodsDialog.this.D.c();
                            ChooseSkuGoodsDialog.x(ChooseSkuGoodsDialog.this);
                            ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, str);
                            ChooseSkuGoodsDialog.this.d.a(false);
                            com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) ChooseSkuGoodsDialog.this.E, true);
                            return;
                        } else if (goodsAttr3.status == 0) {
                            com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a aVar2 = ChooseSkuGoodsDialog.this.D;
                            Object[] objArr4 = {goodsAttr3};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "13feb0916d4302df43b6df50fbc17506", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "13feb0916d4302df43b6df50fbc17506");
                            } else {
                                aVar2.e.put(goodsAttr3.getName(), goodsAttr3);
                                aVar2.a(false);
                            }
                            ChooseSkuGoodsDialog.this.l = ChooseSkuGoodsDialog.this.D.b();
                            ChooseSkuGoodsDialog.this.z = ChooseSkuGoodsDialog.this.D.c();
                            ChooseSkuGoodsDialog.x(ChooseSkuGoodsDialog.this);
                            ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, str, goodsAttr3);
                            return;
                        } else {
                            return;
                        }
                    }
                    ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, i, goodsAttr3);
                    ChooseSkuGoodsDialog.y(ChooseSkuGoodsDialog.this);
                    ChooseSkuGoodsDialog.a(ChooseSkuGoodsDialog.this, str, goodsAttr3);
                }
            });
            viewGroup.addView(frameLayout);
        }
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
            viewGroup.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c1811749c1ddbe8a2425c00910af754", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c1811749c1ddbe8a2425c00910af754");
                        return;
                    }
                    for (View view : arrayList) {
                        int width = ((ViewGroup) view.findViewById(R.id.layout_price)).getWidth();
                        TextView textView2 = (TextView) view.findViewById(R.id.txt_name);
                        textView2.setMaxWidth(((viewGroup.getWidth() - ChooseSkuGoodsDialog.this.H.getPaddingLeft()) - ChooseSkuGoodsDialog.this.H.getPaddingRight()) - width);
                        if (ChooseSkuGoodsDialog.h == textView2.getWidth()) {
                            textView2.setGravity(17);
                        } else {
                            textView2.setGravity(19);
                        }
                    }
                }
            });
        }
        return linearLayout;
    }

    private void a(ViewGroup viewGroup, String str, GoodsAttr goodsAttr) {
        final ViewGroup viewGroup2;
        Object[] objArr = {viewGroup, str, goodsAttr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b534c60bc75935b423c52932b41ecb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b534c60bc75935b423c52932b41ecb7");
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.txt_label);
        if (this.F.booleanValue()) {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.layout_attribute_for_old_people);
        } else {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.layout_attribute);
        }
        viewGroup2.setVisibility(0);
        textView.setText(str);
        int childCount = viewGroup2.getChildCount();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup2.getChildAt(i);
            arrayList.add(childAt);
            a(childAt, (GoodsAttr) childAt.getTag(), goodsAttr, str);
        }
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
            viewGroup2.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "475602ff4e294da654e0f628f502f04d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "475602ff4e294da654e0f628f502f04d");
                        return;
                    }
                    for (View view : arrayList) {
                        int width = ((ViewGroup) view.findViewById(R.id.layout_price)).getWidth();
                        TextView textView2 = (TextView) view.findViewById(R.id.txt_name);
                        textView2.setMaxWidth(((viewGroup2.getWidth() - ChooseSkuGoodsDialog.this.H.getPaddingLeft()) - ChooseSkuGoodsDialog.this.H.getPaddingRight()) - width);
                        if (ChooseSkuGoodsDialog.h == textView2.getWidth()) {
                            textView2.setGravity(17);
                        } else {
                            textView2.setGravity(19);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.view.View r19, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr r20, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuGoodsDialog.a(android.view.View, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr, java.lang.String):void");
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b181272e06be3277390518de236c8b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b181272e06be3277390518de236c8b60");
            return;
        }
        a(k.a().a(this.i, this.b.getId(), this.l == null ? 0L : this.l.getSkuId(), this.z), this.l);
        aF_();
    }

    private SpannableStringBuilder a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15422580214060ce8a006944b285e55", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15422580214060ce8a006944b285e55");
        }
        return (SpannableStringBuilder) Html.fromHtml(str.replaceAll("<highlight>", "<font color=" + str2 + ">").replaceAll("</highlight>", "</font>"));
    }

    private void o() {
        GoodsAttr[] goodsAttrArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c3ebb3aae9b46972029853f88ae161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c3ebb3aae9b46972029853f88ae161");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5c5e17e29336f9717007c6e2321efa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5c5e17e29336f9717007c6e2321efa0");
        } else {
            StringBuilder sb = new StringBuilder();
            if (this.D != null && this.z != null) {
                for (GoodsAttr goodsAttr : this.z) {
                    if (!TextUtils.isEmpty(goodsAttr.value)) {
                        sb.append(goodsAttr.value);
                        sb.append("、");
                    }
                }
            } else {
                for (String str : this.A.keySet()) {
                    if (!TextUtils.isEmpty(this.A.get(str))) {
                        sb.append(this.A.get(str));
                        sb.append("、");
                    }
                }
            }
            if (TextUtils.isEmpty(sb.toString())) {
                this.u.setVisibility(0);
                this.u.setText("已选规格：");
            } else {
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, "已选规格：");
                SpannableStringBuilder a2 = a(sb.toString(), "#999999");
                a2.setSpan(new ForegroundColorSpan(Color.parseColor("#999999")), 0, 5, 33);
                this.u.setVisibility(0);
                this.u.setText(a2);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ba24e0d77a4566b5bfe9b7ff40c34bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ba24e0d77a4566b5bfe9b7ff40c34bd");
        } else if (this.b != null && this.l != null && this.l.isSoldable()) {
            int a3 = k.a().a(this.i, this.b.getId(), this.l.getSkuId(), this.z);
            this.d.a(a3, false, this.l.getMinOrderCount(), a(this.l, a3), null, this.f);
            int a4 = com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.i, this.b, this.l);
            Object[] objArr4 = {Integer.valueOf(a4)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2af716fd785091edda2db30a2a6589da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2af716fd785091edda2db30a2a6589da");
            } else if (a4 >= l() && l() != -1) {
                com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.I, false);
                this.d.a(true);
                com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) this.E, false);
            } else {
                com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.I, true);
                this.d.a(false);
                com.sankuai.waimai.restaurant.shopcart.utils.d.a((View) this.E, true);
            }
        }
    }

    private String a(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a1a8753057ccb1902ef7333eccf0615", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a1a8753057ccb1902ef7333eccf0615");
        }
        String specInfo = goodsSku.getSpecInfo();
        return TextUtils.isEmpty(specInfo) ? goodsSku.getSpec() : specInfo;
    }

    private void b(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da34f53914d6b98de242d8621f0850f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da34f53914d6b98de242d8621f0850f2");
        } else if (goodsSku == null) {
        } else {
            if (this.e) {
                d dVar = this.d;
                double skuPrice = goodsSku.getSkuPrice();
                Object[] objArr2 = {Double.valueOf(skuPrice)};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "95fd3a56d73b8d72dd21ae493bebae60", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "95fd3a56d73b8d72dd21ae493bebae60");
                } else {
                    dVar.a(skuPrice);
                    dVar.g.setVisibility(8);
                }
            } else {
                this.d.a(goodsSku.getSkuPrice(), goodsSku.getOriginPrice());
                d dVar2 = this.d;
                Object[] objArr3 = {goodsSku};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "f967f0563187649c2582c52364e136f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "f967f0563187649c2582c52364e136f2");
                } else if (goodsSku.aiPromotionTags != null && dVar2.p != null) {
                    dVar2.j.setVisibility(8);
                    dVar2.r = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(dVar2.b, com.sankuai.waimai.platform.widget.tag.util.a.a(dVar2.b, goodsSku.aiPromotionTags));
                    dVar2.p.setAdapter(dVar2.r);
                    dVar2.p.setVisibility(0);
                    dVar2.r.b(com.sankuai.waimai.platform.widget.tag.util.a.a(dVar2.b, goodsSku.aiPromotionTags));
                    dVar2.r.notifyChanged();
                } else {
                    dVar2.p.setVisibility(8);
                }
                byte b = (!goodsSku.hasFullDiscountPrice() || com.sankuai.waimai.business.restaurant.composeorder.a.b) ? (byte) 0 : (byte) 1;
                byte b2 = (b == 0 || !k.a().n(this.m.f()).j()) ? (byte) 0 : (byte) 1;
                d dVar3 = this.d;
                Object[] objArr4 = {goodsSku, Byte.valueOf(b), Byte.valueOf(b2)};
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr4, dVar3, changeQuickRedirect4, false, "73618d328036a97514a235d49d12aa01", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar3, changeQuickRedirect4, false, "73618d328036a97514a235d49d12aa01");
                } else if (goodsSku != null) {
                    dVar3.a(goodsSku.getPrice(), goodsSku.getOriginPrice());
                    dVar3.j.setVisibility(8);
                    if (b2 != 0) {
                        if (goodsSku.aiFullDiscountTags != null && dVar3.q != null) {
                            dVar3.s = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(dVar3.b, com.sankuai.waimai.platform.widget.tag.util.a.a(dVar3.b, goodsSku.aiFullDiscountTags));
                            dVar3.q.setAdapter(dVar3.s);
                            if (dVar3.t.booleanValue()) {
                                dVar3.q.setVisibility(8);
                            } else {
                                dVar3.q.setVisibility(0);
                            }
                            dVar3.s.b(com.sankuai.waimai.platform.widget.tag.util.a.a(dVar3.b, goodsSku.aiFullDiscountTags));
                            dVar3.s.notifyChanged();
                        }
                    } else {
                        dVar3.q.setVisibility(8);
                    }
                }
            }
            if (goodsSku.getStatus() == 1) {
                d dVar4 = this.d;
                GoodsSpu goodsSpu = this.b;
                Object[] objArr5 = {goodsSpu};
                ChangeQuickRedirect changeQuickRedirect5 = d.a;
                if (PatchProxy.isSupport(objArr5, dVar4, changeQuickRedirect5, false, "c3cf6cd3716146c8ffea049ae1ab7c99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, dVar4, changeQuickRedirect5, false, "c3cf6cd3716146c8ffea049ae1ab7c99");
                    return;
                }
                dVar4.o.setVisibility(4);
                dVar4.m.setVisibility(4);
                dVar4.h.setVisibility(0);
                if (goodsSpu != null && !TextUtils.isEmpty(goodsSpu.getStatusDescription())) {
                    dVar4.h.setText(goodsSpu.getStatusDescription());
                } else {
                    dVar4.h.setText(R.string.wm_restaurant_foodList_adapter_sold_out);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee54e9efff1be18a3acdcc7d390eb2b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee54e9efff1be18a3acdcc7d390eb2b9");
            return;
        }
        o();
        b(this.l);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71b3646a5e64cf83c8b7ec520e795f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71b3646a5e64cf83c8b7ec520e795f1");
            return;
        }
        try {
            ae.a(this.v, str);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a("ChooseSkuGoodsDialog", e);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3acd8e1230fd04d821a2d1486a60e8b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3acd8e1230fd04d821a2d1486a60e8b5")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a("ChooseSkuGoodsDialog", e);
            return false;
        }
    }

    public static /* synthetic */ boolean v(ChooseSkuGoodsDialog chooseSkuGoodsDialog) {
        return chooseSkuGoodsDialog.k == 3;
    }
}
