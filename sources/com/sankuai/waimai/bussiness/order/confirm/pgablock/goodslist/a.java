package com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.bussiness.order.base.constants.a;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Context b;
    public final ViewGroup c;
    public final LayoutInflater d;
    public String e;
    public boolean f;
    public LinearLayout g;
    public InterfaceC0897a h;
    public long i;
    public String j;
    public List<UnAvailableFood> k;
    public boolean l;
    public LinearLayout m;
    private b n;
    private boolean o;
    private f p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private TreeMap<Integer, List<OrderedFood>> v;
    private List<OrderedFood> w;
    private boolean x;
    private final int y;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0897a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "aff6e794439f0c8056f26d9581a13803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "aff6e794439f0c8056f26d9581a13803");
        } else if (aVar.f) {
            if (z) {
                JudasManualManager.a(a.C0883a.e).a("c_ykhs39e").a("preview_type", aVar.p.aJ_() ? "1" : "0").a(aVar.b).a();
            } else {
                JudasManualManager.a(a.C0883a.g).a("c_ykhs39e").a(aVar.b).a();
            }
        }
    }

    public a(Context context, ViewGroup viewGroup, f fVar) {
        Object[] objArr = {context, viewGroup, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a54d1c647d81fd9bfa56b8cb6bc494d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a54d1c647d81fd9bfa56b8cb6bc494d7");
            return;
        }
        this.o = false;
        this.v = new TreeMap<>();
        this.w = new ArrayList();
        this.k = new ArrayList();
        this.x = false;
        this.y = 6;
        this.b = context;
        this.c = viewGroup;
        this.p = fVar;
        this.d = LayoutInflater.from(this.b);
        this.g = new LinearLayout(this.b);
        this.g.setOrientation(1);
        this.q = this.b.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
        this.r = this.b.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_num);
        this.s = this.b.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_content);
        this.t = this.b.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_goods_list_food_count_price_margin_right);
        this.u = this.b.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_goods_list_food_count_margin_right);
    }

    public void a(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96302165d5988ca7fe2de075b377c6a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96302165d5988ca7fe2de075b377c6a4");
            return;
        }
        this.v.clear();
        if (list != null) {
            for (OrderedFood orderedFood : list) {
                if (!this.v.containsKey(Integer.valueOf(orderedFood.getCartId()))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(orderedFood);
                    this.v.put(Integer.valueOf(orderedFood.getCartId()), arrayList);
                } else {
                    this.v.get(Integer.valueOf(orderedFood.getCartId())).add(orderedFood);
                }
            }
            d();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d692c95cabe530190393036848304f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d692c95cabe530190393036848304f05");
            return;
        }
        this.w.clear();
        for (Map.Entry<Integer, List<OrderedFood>> entry : this.v.entrySet()) {
            this.w.addAll(entry.getValue());
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e803700b70dd1523df92d3c7eb320ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e803700b70dd1523df92d3c7eb320ba");
            return;
        }
        this.x = false;
        for (int i = 0; i < this.w.size(); i++) {
            if (this.w.get(i).getPrice() < this.w.get(i).getOriginPrice()) {
                this.x = true;
                return;
            }
        }
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "647ea3ecd09cc3774a05434452651a8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "647ea3ecd09cc3774a05434452651a8e")).booleanValue() : this.v.size() != 1;
    }

    public void a(boolean z) {
        int i = 1;
        char c = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd691e2946ea1eb730834feb4aff6851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd691e2946ea1eb730834feb4aff6851");
            return;
        }
        int i2 = -1;
        int i3 = 0;
        for (OrderedFood orderedFood : this.w) {
            if (!TextUtils.isEmpty(orderedFood.getName())) {
                if (i3 >= 3 && !z) {
                    return;
                }
                if (a() && orderedFood.getCartId() != i2) {
                    int cartId = orderedFood.getCartId();
                    Object[] objArr2 = new Object[i];
                    objArr2[c] = Integer.valueOf(cartId);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a030a5bd6470ed340a2ff10e07385000", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a030a5bd6470ed340a2ff10e07385000");
                    } else {
                        View inflate = this.d.inflate(R.layout.wm_order_base_adapter_product_list_cart, this.c, false);
                        ((TextView) inflate.findViewById(R.id.txt_cart_title)).setText(this.b.getString(R.string.wm_order_base_confirm_cart_name, Integer.valueOf(cartId + 1)));
                        this.g.addView(inflate);
                    }
                    i2 = orderedFood.getCartId();
                }
                int i4 = i2;
                Object[] objArr3 = {orderedFood};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcd7be8c122b20378aad06f743816579", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcd7be8c122b20378aad06f743816579");
                } else {
                    a(this.d.inflate(R.layout.wm_order_confirm_adapter_product_list_item, this.c, false), orderedFood, true);
                }
                i3++;
                i2 = i4;
                i = 1;
                c = 0;
            }
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6cd2e7bac03751c098f9ba39f34490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6cd2e7bac03751c098f9ba39f34490");
            return;
        }
        this.g.addView(this.d.inflate(R.layout.wm_order_confirm_adapter_unavailable_text, this.c, false));
        for (UnAvailableFood unAvailableFood : this.k) {
            if (!TextUtils.isEmpty(unAvailableFood.name)) {
                Object[] objArr2 = {unAvailableFood};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db0a6795f195c1ac054e440234f64fee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db0a6795f195c1ac054e440234f64fee");
                } else {
                    View inflate = this.d.inflate(R.layout.wm_order_confirm_adapter_unavailable_food_list_item, this.c, false);
                    Object[] objArr3 = {inflate, unAvailableFood};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0b8ba7a8fa155752565151d0acfa45f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0b8ba7a8fa155752565151d0acfa45f");
                    } else {
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.img_good);
                        Object[] objArr4 = {imageView, unAvailableFood};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2009243299c998f941003db262836a4a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2009243299c998f941003db262836a4a");
                        } else if (TextUtils.isEmpty(unAvailableFood.picture)) {
                            imageView.setImageResource(R.drawable.wm_restaurant_pic_goods_default);
                        } else {
                            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a2.b = this.b;
                            a2.c = unAvailableFood.picture;
                            b.C0608b b2 = a2.b((int) this.b.getResources().getDimension(R.dimen.wm_order_list_home_indicator_height));
                            b2.i = R.drawable.wm_restaurant_pic_goods_default;
                            b2.f = ImageQualityUtil.a(1);
                            b2.a(new BitmapTransformation[]{new RoundAndCenterCropTransform(this.b, 6)}, new String[]{"6"}).a(imageView);
                        }
                        inflate.findViewById(R.id.pic_cover).setBackgroundResource(R.drawable.wm_order_unavailable_shape_bg);
                        TextView textView = (TextView) inflate.findViewById(R.id.txt_product_name);
                        if (!TextUtils.isEmpty(unAvailableFood.name)) {
                            textView.setText(unAvailableFood.name);
                        }
                        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_product_spec);
                        textView2.setVisibility(0);
                        textView2.setText("");
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(unAvailableFood.spec)) {
                            arrayList.add(unAvailableFood.spec);
                        }
                        if (!d.a(unAvailableFood.attrsList)) {
                            for (GoodsAttr goodsAttr : unAvailableFood.attrsList) {
                                if (!TextUtils.isEmpty(goodsAttr.getValue())) {
                                    arrayList.add(goodsAttr.getValue());
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            textView2.setText(a("，", arrayList));
                        }
                        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_food_count);
                        if (unAvailableFood.canNotBuyCount > 0) {
                            textView3.setText(Constants.GestureMoveEvent.KEY_X + unAvailableFood.canNotBuyCount);
                        }
                        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_reason);
                        if (!TextUtils.isEmpty(unAvailableFood.simpleErrorReason)) {
                            textView4.setText(unAvailableFood.simpleErrorReason);
                        }
                        this.g.addView(inflate);
                    }
                }
            }
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f412edfadc8c7adfe9f3fa0062392992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f412edfadc8c7adfe9f3fa0062392992");
            return;
        }
        int i = 0;
        for (OrderedFood orderedFood : this.w) {
            if (orderedFood.spu != null && orderedFood.spu.id != -1) {
                i++;
                continue;
            }
            if (i > 3) {
                break;
            }
        }
        if (i <= 3) {
            return;
        }
        View inflate = this.d.inflate(R.layout.wm_order_confirm_good_list_show_more, (ViewGroup) null);
        final TextView textView = (TextView) inflate.findViewById(R.id.txt_order_good_list_show_more);
        textView.setSelected(false);
        textView.setText(R.string.wm_order_base_spread_more);
        this.o = false;
        b(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb79806c1ee055e29d0360ba2d9a693b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb79806c1ee055e29d0360ba2d9a693b");
                } else if (textView.isSelected()) {
                    textView.setSelected(false);
                    textView.setText(R.string.wm_order_base_spread_more);
                    a.this.g.removeAllViews();
                    a.this.a(false);
                    a.a(a.this, false);
                } else {
                    textView.setSelected(true);
                    textView.setText(R.string.wm_order_base_click_to_retract);
                    a.this.g.removeAllViews();
                    a.this.a(true);
                    a.this.b(false);
                    a.a(a.this, true);
                }
            }
        });
        this.c.addView(inflate);
    }

    void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5196026e37791a0da769ca3d38bc54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5196026e37791a0da769ca3d38bc54");
        } else if (this.f) {
            if (z) {
                JudasManualManager.b(a.C0883a.d).a("c_ykhs39e").a("preview_type", this.p.aJ_() ? "1" : "0").a(this.b).a();
            } else if (this.o) {
            } else {
                JudasManualManager.b(a.C0883a.f).a("c_ykhs39e").a(this.b).a();
                this.o = true;
            }
        }
    }

    private String a(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581e639bed37ee1ff0a1e370127eac44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581e639bed37ee1ff0a1e370127eac44");
        }
        if (list.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private void a(View view, final OrderedFood orderedFood, boolean z) {
        ImageView imageView;
        LinearLayout linearLayout;
        TextView textView;
        LinearLayout linearLayout2;
        int i;
        View view2;
        Object[] objArr = {view, orderedFood, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3065f0193d70b3144140abfa0d0ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3065f0193d70b3144140abfa0d0ca4");
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.txt_product_name);
        TextView textView3 = (TextView) view.findViewById(R.id.txt_food_count);
        TextView textView4 = (TextView) view.findViewById(R.id.txt_food_origin_price);
        TextView textView5 = (TextView) view.findViewById(R.id.txt_product_sub_total);
        TextView textView6 = (TextView) view.findViewById(R.id.txt_product_spec);
        TextView textView7 = (TextView) view.findViewById(R.id.txt_product_additional_tips);
        TextView textView8 = (TextView) view.findViewById(R.id.txt_box_price);
        TextView textView9 = (TextView) view.findViewById(R.id.txt_box_price_desc);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.img_good);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_member_icon);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.layout_product_spec);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ll_product_label);
        TextView textView10 = (TextView) view.findViewById(R.id.txt_product_spot_price);
        TextView textView11 = (TextView) view.findViewById(R.id.txt_product_spot_price_label);
        if (this.p.aM_()) {
            textView5.setTypeface(this.p.aN_());
            imageView = imageView3;
            textView5.setTextSize(0, this.r);
            textView10.setTypeface(this.p.aN_());
            textView10.setTextSize(0, this.r);
            textView4.setTypeface(this.p.aN_());
            textView4.setTextSize(0, this.s);
        } else {
            imageView = imageView3;
        }
        if (orderedFood.getPrice() < orderedFood.getOriginPrice()) {
            linearLayout2 = linearLayout3;
            linearLayout = linearLayout4;
            textView = textView11;
            h.a(textView4, this.b.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(orderedFood.getOriginPrice() * orderedFood.getCount())), this.p.aN_(), this.q, -1);
            textView4.getPaint().setFlags(16);
        } else {
            linearLayout = linearLayout4;
            textView = textView11;
            linearLayout2 = linearLayout3;
            textView4.setVisibility(8);
            textView4.setText("");
        }
        if (orderedFood.subBoxTotalPrice > 0.0d) {
            textView8.setText(this.b.getString(R.string.wm_order_confirm_box_price, com.sankuai.waimai.foundation.utils.h.a(orderedFood.subBoxTotalPrice)));
            textView9.setText(orderedFood.subBoxTotalPriceDesc);
        }
        textView3.setText(this.b.getString(R.string.wm_order_confirm_count_with_x, Integer.valueOf(orderedFood.getCount())));
        h.a(textView5, orderedFood.getSubTotalPrice(), this.p.aN_(), this.q, -1);
        a(view, orderedFood, true, textView2, orderedFood.getFoodLabelUrl());
        List<OrderedFood> comboItems = orderedFood.getComboItems();
        String str = orderedFood.desc;
        String spec = orderedFood.getSpec();
        GoodsAttr[] attrIds = orderedFood.getAttrIds();
        if (aa.a(str)) {
            if (comboItems != null && comboItems.size() > 0) {
                textView6.setVisibility(0);
                textView6.setText("");
                int i2 = 0;
                for (OrderedFood orderedFood2 : comboItems) {
                    if (orderedFood2.count > 0 && !TextUtils.isEmpty(orderedFood2.getName())) {
                        textView6.append(orderedFood2.getName());
                        textView6.append(a(orderedFood2.getAttrIds()));
                        textView6.append(Constants.GestureMoveEvent.KEY_X + orderedFood2.count);
                        if (i2 != comboItems.size() - 1) {
                            textView6.append("，");
                        }
                        i2++;
                    }
                }
            } else if (!TextUtils.isEmpty(spec) || attrIds != null) {
                textView6.setVisibility(0);
                textView6.setText("");
                if (!TextUtils.isEmpty(spec)) {
                    textView6.setText(spec);
                }
                if (attrIds != null && attrIds.length > 0) {
                    for (GoodsAttr goodsAttr : attrIds) {
                        if (goodsAttr.getValue() != null && (goodsAttr.mode != 999 || !goodsAttr.isHidden)) {
                            if (!TextUtils.isEmpty(textView6.getText())) {
                                textView6.append("，");
                            }
                            textView6.append(goodsAttr.getValue());
                            if (goodsAttr.isRepeatableChoice && goodsAttr.count > 0) {
                                textView6.append(Constants.GestureMoveEvent.KEY_X);
                                StringBuilder sb = new StringBuilder();
                                sb.append(goodsAttr.count);
                                textView6.append(sb.toString());
                                if (!TextUtils.isEmpty(goodsAttr.unit)) {
                                    textView6.append(goodsAttr.unit);
                                }
                            }
                        }
                    }
                }
            } else {
                textView6.setVisibility(4);
            }
            i = 0;
        } else {
            i = 0;
            textView6.setVisibility(0);
            textView6.setText(str);
        }
        if (!TextUtils.isEmpty(orderedFood.allowanceTip)) {
            textView7.setText(orderedFood.allowanceTip);
            textView7.setVisibility(i);
        } else {
            textView7.setVisibility(8);
        }
        if (orderedFood.spotPrice > 0.0d && !aa.a(orderedFood.spotPriceLabel)) {
            textView10.setVisibility(i);
            TextView textView12 = textView;
            textView12.setVisibility(i);
            Context context = this.b;
            Object[] objArr2 = new Object[1];
            objArr2[i] = com.sankuai.waimai.foundation.utils.h.a(orderedFood.spotPrice);
            h.a(textView10, context.getString(R.string.wm_order_base_price_with_rmb_symbol, objArr2), this.p.aN_(), this.q, -1);
            textView12.setText(orderedFood.spotPriceLabel);
        } else {
            textView10.setVisibility(8);
            textView.setVisibility(8);
        }
        linearLayout.removeAllViews();
        if (!com.sankuai.waimai.foundation.utils.b.b(orderedFood.productLabelList)) {
            LinearLayout linearLayout5 = linearLayout;
            linearLayout5.setVisibility(0);
            for (String str2 : orderedFood.productLabelList) {
                if (!TextUtils.isEmpty(str2)) {
                    ImageView e = e();
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this.b;
                    a2.c = str2;
                    a2.a(e);
                    linearLayout5.addView(e);
                }
            }
        } else {
            linearLayout.setVisibility(8);
        }
        if (orderedFood.getPrice() >= orderedFood.getOriginPrice() && TextUtils.isEmpty(spec) && attrIds == null && com.sankuai.waimai.foundation.utils.b.b(orderedFood.productLabelList) && aa.a(str)) {
            linearLayout2.setVisibility(4);
        }
        a(imageView, orderedFood.getVipLabelUrl());
        a(imageView2, orderedFood);
        if (this.n != null) {
            view2 = view;
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Object[] objArr3 = {view3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "040b04559be84166139e526759197b03", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "040b04559be84166139e526759197b03");
                    }
                }
            });
        } else {
            view2 = view;
        }
        this.g.addView(view2);
        a(orderedFood);
        b(orderedFood);
    }

    private CharSequence a(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02a2cbef2e6610dea89884f0bdf3d9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02a2cbef2e6610dea89884f0bdf3d9d");
        }
        if (goodsAttrArr == null || goodsAttrArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("（");
        for (int i = 0; i < goodsAttrArr.length; i++) {
            sb.append(goodsAttrArr[i].value);
            if (i != goodsAttrArr.length - 1) {
                sb.append("、");
            }
        }
        sb.append("）");
        return sb.toString();
    }

    private ImageView e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71636513629f4ceb72c6915b8927e776", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71636513629f4ceb72c6915b8927e776");
        }
        ImageView imageView = new ImageView(this.b);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        return imageView;
    }

    private void a(@Nonnull OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee93aaab317d42fa5972fae280d3eb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee93aaab317d42fa5972fae280d3eb4");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.b("b_waimai_qw2yx9ea_mv").a("c_ykhs39e").a("poi_id", i.a(this.i, this.j)).a("spu_id", orderedFood.spu.getId()).a("sku_id", orderedFood.sku.getSkuId()).a("index", this.w.indexOf(orderedFood)).a("item_num", orderedFood.count).a("has_package_fee", orderedFood.subBoxTotalPrice <= 0.0d ? 0 : 1).a("package_fee", Double.toString(orderedFood.subBoxTotalPrice));
        a2.a("is_zhinengzhekou", orderedFood.isZhiNengZheKou);
        a2.a("ad_data_info", orderedFood.adDataInfo == null ? "" : orderedFood.adDataInfo);
        a2.a(this.b).a();
    }

    private void b(@Nonnull OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4126b226c0ebbd30aeef36120988b922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4126b226c0ebbd30aeef36120988b922");
        } else if (orderedFood.spotPrice <= 0.0d || aa.a(orderedFood.spotPriceLabel)) {
        } else {
            JudasManualManager.b("b_waimai_sg_4njaou01_mv").a("c_ykhs39e").a("poi_id", i.a(this.i, this.j)).a("spu_id", orderedFood.spu.getId()).a(this.b).a();
        }
    }

    private void a(View view, final OrderedFood orderedFood, boolean z, final TextView textView, String str) {
        Object[] objArr = {view, orderedFood, Byte.valueOf(z ? (byte) 1 : (byte) 0), textView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093569c844da35921c2921a45a2b353a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093569c844da35921c2921a45a2b353a");
        } else if (z) {
            textView.setText(orderedFood.getName());
            final ImageView imageView = (ImageView) view.findViewById(R.id.img_discount);
            if (TextUtils.isEmpty(str)) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            int a2 = g.a(this.b, 16.0f);
            int a3 = g.a(this.b, 16.0f);
            b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a4.b = this.b;
            a4.c = str;
            a4.f = ImageQualityUtil.a(0);
            a4.b(a2).a(a3).a(new FixedSizeTransform(a2, a3)).a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2eb1d7160ffa151719a62a620f0d8a99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2eb1d7160ffa151719a62a620f0d8a99");
                    } else if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        a();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b6ca758c60d91df7e41efdb4227a11d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b6ca758c60d91df7e41efdb4227a11d");
                    } else {
                        imageView.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(a.this.b.getResources(), (int) R.drawable.wm_order_base_ic_new));
                    }
                }
            });
        } else if (!TextUtils.isEmpty(str)) {
            b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a5.b = this.b;
            a5.c = str;
            a5.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b93a0ace56812c2ef20fc4c2dc9f3e40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b93a0ace56812c2ef20fc4c2dc9f3e40");
                        return;
                    }
                    try {
                        if (orderedFood.getName() == null || TextUtils.isEmpty(orderedFood.getName())) {
                            return;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(a.this.b.getResources(), bitmap);
                        bitmapDrawable.setBounds(0, 0, g.a(a.this.b, 15.0f), g.a(a.this.b, 15.0f));
                        com.sankuai.waimai.bussiness.order.base.style.a aVar = new com.sankuai.waimai.bussiness.order.base.style.a(bitmapDrawable);
                        SpannableString spannableString = new SpannableString("     " + orderedFood.getName());
                        spannableString.setSpan(aVar, 0, 4, 33);
                        textView.setText(spannableString);
                    } catch (Throwable unused) {
                        textView.setText(orderedFood.getName());
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d24ffadd31f837f5441a04ab9f9e7087", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d24ffadd31f837f5441a04ab9f9e7087");
                    } else {
                        textView.setText(orderedFood.getName());
                    }
                }
            });
        } else {
            textView.setText(orderedFood.getName());
        }
    }

    private void a(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fc0d08df35a5fecd091d930271cf69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fc0d08df35a5fecd091d930271cf69");
        } else if (!aa.a(str)) {
            imageView.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.e = 0;
            a2.b = this.b;
            a2.c = str;
            a2.f = ImageQualityUtil.a(1);
            a2.a(imageView);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void a(ImageView imageView, OrderedFood orderedFood) {
        Object[] objArr = {imageView, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7066c10ec7aa26d74992224bdee8dfa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7066c10ec7aa26d74992224bdee8dfa4");
        } else if (orderedFood == null || orderedFood.spu == null || TextUtils.isEmpty(orderedFood.spu.getPicture())) {
            imageView.setImageResource(R.drawable.wm_restaurant_pic_goods_default);
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = orderedFood.spu.getPicture();
            b.C0608b b2 = a2.b((int) this.b.getResources().getDimension(R.dimen.wm_order_list_home_indicator_height));
            b2.i = R.drawable.wm_restaurant_pic_goods_default;
            b2.f = ImageQualityUtil.a(1);
            b2.a(new BitmapTransformation[]{new RoundAndCenterCropTransform(this.b, 6)}, new String[]{"6"}).a(imageView);
        }
    }
}
