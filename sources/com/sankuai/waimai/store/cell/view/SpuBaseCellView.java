package com.sankuai.waimai.store.cell.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.cell.core.c;
import com.sankuai.waimai.store.platform.domain.core.goods.AtmosphereMapFrame;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceAdapterView;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.s;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.view.SpuHandPriceNewView;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import com.sankuai.waimai.store.view.standard.FlashButton;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import com.sankuai.waimai.store.widgets.StrikeTextView;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuBaseCellView extends FrameLayout implements View.OnClickListener, com.sankuai.waimai.store.cell.core.a {
    public static ChangeQuickRedirect m;
    protected HandPriceAdapterView A;
    protected TextView B;
    protected TextView C;
    public TextView D;
    public FlashPrice E;
    protected ImageView F;
    protected FlashButton G;
    protected TextView H;
    protected FrameLayout I;
    protected FrameLayout J;
    protected TextView K;
    protected FrameLayout L;
    protected FlashButton M;
    protected TextView N;
    public StrikeTextView O;
    public SpuEstimatedPriceView P;
    protected SpuHandPriceNewView Q;
    public TextView R;
    protected FrameLayout S;
    protected ImageView T;
    protected TextView U;
    protected ImageView V;
    protected TextView W;
    private com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a;
    protected View aa;
    protected ImageView ab;
    public ImageView ac;
    protected UniversalImageView ad;
    public GoodsSpu ae;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a af;
    protected int ag;
    protected boolean ah;
    protected boolean ai;
    protected com.sankuai.waimai.store.cell.core.b aj;
    protected c ak;
    protected CellUiConfig al;
    protected Drawable am;
    protected View an;
    protected ImageView ao;
    protected Drawable ap;
    protected Drawable aq;
    private GoodDetailResponse b;
    protected View n;
    protected TextView o;
    protected TagCanvasView p;
    protected TextView q;
    protected TextView r;
    protected ImageView s;
    protected View t;
    protected ImageView u;
    protected ImageView v;
    protected TextView w;
    protected ViewGroup x;
    protected TagCanvasView y;
    protected ViewGroup z;

    public float getAtmosphereBackgroundMapRadius() {
        return 6.0f;
    }

    public int getLayoutId() {
        return -1;
    }

    public String getMinOrderCountText() {
        return "份";
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public View getView() {
        return this;
    }

    public boolean r() {
        return true;
    }

    public static /* synthetic */ String a(SpuBaseCellView spuBaseCellView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, spuBaseCellView, changeQuickRedirect, false, "a6ad488a1a13d98a2fb9ed69269fc6e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, spuBaseCellView, changeQuickRedirect, false, "a6ad488a1a13d98a2fb9ed69269fc6e7");
        }
        StringBuilder sb = new StringBuilder();
        TextView textView = new TextView(spuBaseCellView.getContext());
        textView.setTextSize(2, 14.0f);
        textView.getPaint().setFakeBoldText(true);
        textView.setText("T");
        float desiredWidth = Layout.getDesiredWidth(textView.getText().toString(), 0, textView.getText().length(), textView.getPaint());
        if (desiredWidth > 0.0f) {
            for (int i2 = 0; i2 < ((int) Math.ceil(i / desiredWidth)); i2++) {
                sb.append("T");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ void a(SpuBaseCellView spuBaseCellView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, spuBaseCellView, changeQuickRedirect, false, "c33faaf51718b5ca0e255998ba632e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, spuBaseCellView, changeQuickRedirect, false, "c33faaf51718b5ca0e255998ba632e33");
            return;
        }
        if (!p.a(spuBaseCellView.aj)) {
            spuBaseCellView.aj.b(spuBaseCellView.ae, spuBaseCellView.getGoodImageRatio(), spuBaseCellView.ag);
        }
        if (p.a(spuBaseCellView.ak)) {
            return;
        }
        spuBaseCellView.ak.f(spuBaseCellView.ae, spuBaseCellView.ag);
    }

    public static /* synthetic */ void b(SpuBaseCellView spuBaseCellView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, spuBaseCellView, changeQuickRedirect, false, "999a02306f81b78a542b9424b95639f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, spuBaseCellView, changeQuickRedirect, false, "999a02306f81b78a542b9424b95639f6");
        } else if (p.a(spuBaseCellView.aj)) {
        } else {
            spuBaseCellView.aj.c(spuBaseCellView.ae, spuBaseCellView.ag);
        }
    }

    public SpuBaseCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9cf056750dd05bba96b5eb1089c685", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9cf056750dd05bba96b5eb1089c685");
            return;
        }
        this.ag = 0;
        this.ah = false;
        this.ai = false;
        this.al = CellUiConfig.a();
        this.ap = new e.a().a(h.a(getContext(), 6.0f)).c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFCC33)).a();
        this.aq = new e.a().a(h.a(getContext(), 6.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_6CD12E), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_39AA23)}).a();
        c();
    }

    public SpuBaseCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b809e1abc518e0c789bec01a9fb3a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b809e1abc518e0c789bec01a9fb3a5");
            return;
        }
        this.ag = 0;
        this.ah = false;
        this.ai = false;
        this.al = CellUiConfig.a();
        this.ap = new e.a().a(h.a(getContext(), 6.0f)).c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFCC33)).a();
        this.aq = new e.a().a(h.a(getContext(), 6.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_6CD12E), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_39AA23)}).a();
        c();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d85af541e0a8393fcec1d2007efad81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d85af541e0a8393fcec1d2007efad81");
            return;
        }
        this.n = z.a(getContext(), getLayoutId(), this, false);
        addView(this.n);
        this.u = (ImageView) this.n.findViewById(R.id.img_stickydish_pic);
        this.v = (ImageView) this.n.findViewById(R.id.iv_spu_video_icon);
        this.t = this.n.findViewById(R.id.img_stickydish_pic_shadow_of_up);
        this.s = (ImageView) this.n.findViewById(R.id.img_stickydish_pic_shadow);
        this.r = (TextView) this.n.findViewById(R.id.txt_stickyfood_status_out);
        this.w = (TextView) this.n.findViewById(R.id.txt_promotion_info);
        this.S = (FrameLayout) this.n.findViewById(R.id.fl_freeget_container);
        this.T = (ImageView) this.n.findViewById(R.id.img_freeget);
        this.U = (TextView) this.n.findViewById(R.id.tv_freeget);
        this.x = (ViewGroup) this.n.findViewById(R.id.product_label_pictures);
        this.y = (TagCanvasView) this.n.findViewById(R.id.tag_top_left_of_icon);
        this.z = (ViewGroup) this.n.findViewById(R.id.product_label_pictures_right);
        this.o = (TextView) this.n.findViewById(R.id.txt_stickyfoodList_adapter_food_name);
        this.p = (TagCanvasView) this.n.findViewById(R.id.tag_front_of_name);
        this.q = (TextView) this.n.findViewById(R.id.tv_pre_sale_delivery_time);
        this.A = (HandPriceAdapterView) this.n.findViewById(R.id.new_price_layout);
        this.B = (TextView) this.n.findViewById(R.id.tv_money_unit_current_price);
        this.C = (TextView) this.n.findViewById(R.id.txt_stickyfoodList_adapter_food_price_fix);
        this.D = (TextView) this.n.findViewById(R.id.txt_stickyfoodList_adapter_food_original_price_fix);
        this.E = (FlashPrice) this.n.findViewById(R.id.food_list_spu_flash_price);
        this.F = (ImageView) this.n.findViewById(R.id.img_foodCount_add_fix);
        if (this.F != null) {
            this.F.setContentDescription(com.sankuai.waimai.store.util.b.a(getContext(), (int) R.string.wm_sg_food_increase));
        }
        this.G = (FlashButton) this.n.findViewById(R.id.btn_foodCount_add_fix_x);
        this.H = (TextView) this.n.findViewById(R.id.btn_choose_sku_fix);
        this.I = (FrameLayout) this.n.findViewById(R.id.btn_choose_sku_fix_fl);
        this.K = (TextView) this.n.findViewById(R.id.tv_spu_base_cycle_purchase);
        this.J = (FrameLayout) this.n.findViewById(R.id.fl_spu_base_cycle_purchase);
        this.L = (FrameLayout) this.n.findViewById(R.id.fl_spu_base_pre_sale);
        this.M = (FlashButton) this.n.findViewById(R.id.tv_spu_base_pre_sale);
        this.N = (TextView) this.n.findViewById(R.id.txt_skufood_count_fix);
        this.O = (StrikeTextView) this.n.findViewById(R.id.tv_member_price_tag);
        this.P = (SpuEstimatedPriceView) this.n.findViewById(R.id.estimated_price_customated_layout);
        this.Q = (SpuHandPriceNewView) this.n.findViewById(R.id.hand_price_new_view);
        this.R = (TextView) this.n.findViewById(R.id.tag_of_top_number_and_privacy);
        this.V = (ImageView) this.n.findViewById(R.id.img_food_count_dec);
        if (this.V != null) {
            this.V.setContentDescription(com.sankuai.waimai.store.util.b.a(getContext(), (int) R.string.wm_sg_food_decrease));
        }
        this.W = (TextView) this.n.findViewById(R.id.txt_food_count_number_new);
        this.aa = this.n.findViewById(R.id.fl_hot_sale_sort_container);
        this.ab = (ImageView) this.n.findViewById(R.id.img_hot_sale_sort);
        this.ac = (ImageView) this.n.findViewById(R.id.img_promotion_drawable_left);
        this.ad = (UniversalImageView) this.n.findViewById(R.id.limited_time_spiked_label);
        this.an = this.n.findViewById(R.id.wm_sc_goods_list_atmosphere_map_view);
        this.ao = (ImageView) this.n.findViewById(R.id.wm_sc_goods_list_atmosphere_map_bottom_view);
        a(false);
        a(0, false, false);
        setOnClickListener(new com.sankuai.waimai.store.widgets.a(this));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = m;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e14d35e1db6100f0800396099e008575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e14d35e1db6100f0800396099e008575");
        } else if (this.am == null) {
            this.am = new e.a().a(h.a(getContext(), 4.0f)).c(getContext().getResources().getColor(R.color.wm_st_common_80FFFFFF)).a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174d294ac8475d7a715b1b64e29f51dc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174d294ac8475d7a715b1b64e29f51dc");
            return;
        }
        if (!p.a(this.aj, this.ae)) {
            this.aj.a(this.ae, getGoodImageRatio(), this.ag);
        }
        if (p.a(this.ak, this.ae)) {
            return;
        }
        this.ak.d(this.ae, this.ag);
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a9f2f1a661cd7d7fc1797ed4fd4586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a9f2f1a661cd7d7fc1797ed4fd4586");
            return;
        }
        A();
        com.sankuai.shangou.stone.util.log.a.b("#updateOrderGood", new Object[0]);
        x();
        b();
        l();
        G();
    }

    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d63edf247aef3da1c457318f697924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d63edf247aef3da1c457318f697924");
        } else if (p.a(this.ae, this.q)) {
        } else {
            u.a(this.q, this.ae.deliveryTimeShow);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public void setActionCallback(@NonNull com.sankuai.waimai.store.cell.core.b bVar) {
        this.aj = bVar;
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public void setEventCallback(@NonNull c cVar) {
        this.ak = cVar;
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public void setPoiHelper(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        this.af = aVar;
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public void a(@NonNull GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6472ae06d0fbc8d57f1e7e47c1e4c33b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6472ae06d0fbc8d57f1e7e47c1e4c33b");
            return;
        }
        this.ae = goodsSpu;
        this.ag = i;
        if (goodsSpu != null) {
            View view = this.n;
            view.setContentDescription(goodsSpu.name + com.sankuai.waimai.store.util.b.a(getContext(), R.string.wm_sg_food_price, Double.valueOf(goodsSpu.getMinPrice())));
        }
        d();
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public final void a(boolean z, boolean z2) {
        this.ah = z;
        this.ai = z2;
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public void setCellConfig(@NonNull CellUiConfig cellUiConfig) {
        Object[] objArr = {cellUiConfig};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfea837906436c8d1e2384e12e9a637b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfea837906436c8d1e2384e12e9a637b");
        } else if (p.a(cellUiConfig)) {
        } else {
            this.al = cellUiConfig;
            if (p.a(this.ae)) {
                return;
            }
            d();
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.a
    public void setGoodDetailResponse(GoodDetailResponse goodDetailResponse) {
        this.b = goodDetailResponse;
    }

    public com.sankuai.waimai.store.util.h getGoodImageRatio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5ddc99adac9ccc137162a80cdf028d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.util.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5ddc99adac9ccc137162a80cdf028d");
        }
        ImageView imageView = this.u;
        Object[] objArr2 = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        float f = -1.0f;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2a79fd0e613b61792e1d95c6a63664b0", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2a79fd0e613b61792e1d95c6a63664b0")).floatValue();
        } else if (imageView != null && imageView.getDrawable() != null) {
            Rect bounds = imageView.getDrawable().getBounds();
            if (bounds.width() != 0) {
                f = (bounds.height() * 1.0f) / bounds.width();
            }
        }
        return new com.sankuai.waimai.store.util.h(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.cell.view.SpuBaseCellView.d():void");
    }

    public final boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12dcc8944d88ba7e231a016e7f889ecc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12dcc8944d88ba7e231a016e7f889ecc")).booleanValue() : this.af.t() ? (this.ae == null || this.ae.kanoSpuLabel == null || this.ae.kanoSpuLabel.extensionInfo == null || TextUtils.isEmpty(this.ae.kanoSpuLabel.extensionInfo.productImageBottomTagColor) || TextUtils.isEmpty(this.ae.kanoSpuLabel.extensionInfo.productImageBottomTagUrl)) ? false : true : (this.ae == null || this.ae.mAtmosphereMapFrame == null || (this.ae.mAtmosphereMapFrame.singleFrame == null && this.ae.mAtmosphereMapFrame.doubleFrame == null)) ? false : true;
    }

    private void setDrugAtmosphereBottomIcon(AtmosphereMapFrame.Frame frame) {
        Object[] objArr = {frame};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1da1c724f9ddc0ec2de862d8130cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1da1c724f9ddc0ec2de862d8130cc4");
        } else {
            m.a(frame.pic, h.a(getContext(), 96.0f), ImageQualityUtil.b()).a(new b.a() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cf790eb125a8e54da1504d2c77bd8f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cf790eb125a8e54da1504d2c77bd8f7");
                    } else if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    } else {
                        int floor = (int) Math.floor((bitmap.getHeight() / bitmap.getWidth()) * h.a(SpuBaseCellView.this.getContext(), 96.0f));
                        ViewGroup.LayoutParams layoutParams = SpuBaseCellView.this.ao.getLayoutParams();
                        if (layoutParams instanceof FrameLayout.LayoutParams) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.bottomMargin = 0;
                            layoutParams2.height = floor;
                            SpuBaseCellView.this.ao.setLayoutParams(layoutParams);
                        }
                        SpuBaseCellView.this.ao.setImageBitmap(bitmap);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b1639a85f621c296e7cd8c66c3095bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b1639a85f621c296e7cd8c66c3095bd");
                    } else {
                        SpuBaseCellView.this.ao.setVisibility(8);
                    }
                }
            }, 1);
        }
    }

    public Drawable a(@NonNull AtmosphereMapFrame.Frame frame) {
        Object[] objArr = {frame};
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc4baada78c6112776c259d0acba347", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc4baada78c6112776c259d0acba347") : new e.a().a(d.a(frame.startColor, getResources().getColor(R.color.wm_st_common_transparent))).b(h.a(getContext(), 1.0f)).a(h.a(getContext(), getAtmosphereBackgroundMapRadius())).a();
    }

    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4787acd9cab734f2f700cca2a6f1f37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4787acd9cab734f2f700cca2a6f1f37");
        } else if ((this.b != null && this.b.poiInformation != null && this.b.poiInformation.mPurchasedType == 1) || (this.af != null && this.af.x())) {
            if (this.F != null) {
                this.F.setImageResource(R.drawable.wm_sc_bg_shop_add_select_green);
            }
            if (this.V != null) {
                this.V.setImageResource(R.drawable.wm_sc_bg_shop_dec_select_green);
            }
            if (this.H != null) {
                this.H.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
                this.H.setBackground(new e.a().a(h.a(getContext(), 16.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_6CD12E), ContextCompat.getColor(getContext(), R.color.wm_sg_color_39AA23)}).a());
            }
            if (this.M != null) {
                this.M.a(new e.a().a(h.a(getContext(), 4.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_6CD12E), ContextCompat.getColor(getContext(), R.color.wm_sg_color_39AA23)}).a(), R.color.white, R.dimen.wm_sc_common_dimen_6);
            }
            if (this.G == null || this.aq == null) {
                return;
            }
            this.G.a(this.aq, R.color.white, R.dimen.wm_sc_common_dimen_3);
            this.G.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_sc_btn_food_count_add_white));
        } else {
            if (this.F != null) {
                this.F.setImageResource(R.drawable.wm_sc_bg_shop_add_select);
            }
            if (this.V != null) {
                this.V.setImageResource(R.drawable.wm_sc_bg_shop_dec_select);
            }
            if (this.H != null) {
                this.H.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_text_title));
                this.H.setBackgroundResource(R.drawable.wm_sc_bg_food_detail_add_shop_cart);
            }
            if (this.G == null || this.ap == null) {
                return;
            }
            this.G.a(this.ap, R.color.black, R.dimen.wm_sc_common_dimen_3);
            this.G.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_sc_btn_food_count_add_black));
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e86afda8d5ae0af9ff0dcf34fc6fe52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e86afda8d5ae0af9ff0dcf34fc6fe52");
        } else if (this.v == null) {
        } else {
            if (this.ae == null || t.a(this.ae.videoIconUrl)) {
                this.v.setVisibility(8);
                return;
            }
            m.c(this.ae.videoIconUrl, this.v.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_15)).a(this.v);
            this.v.setVisibility(0);
        }
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9968894d308fbe68b5a5bdf978c9cdf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9968894d308fbe68b5a5bdf978c9cdf9");
        } else if (p.a(this.ae, this.u)) {
        } else {
            b.C0608b a = m.a(this.ae.getPicture(), (int) getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_75), ImageQualityUtil.b());
            a.j = R.drawable.wm_sc_common_poi_error;
            a.i = R.drawable.wm_sc_common_loading_large;
            a.a(this.u);
            u.a(this.u);
        }
    }

    private void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57d02a6b19ab385adad5c4c91b0952b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57d02a6b19ab385adad5c4c91b0952b");
            return;
        }
        if (this.F != null) {
            if (i == 0) {
                this.F.setContentDescription(com.sankuai.waimai.store.util.b.a(getContext(), (int) R.string.wm_sg_food_increase));
            } else {
                this.F.setContentDescription(com.sankuai.waimai.store.util.b.a(getContext(), R.string.wm_sg_food_increase_with_number, String.valueOf(i)));
            }
        }
        if (this.V != null) {
            if (i == 0) {
                this.V.setContentDescription(com.sankuai.waimai.store.util.b.a(getContext(), (int) R.string.wm_sg_food_decrease));
            } else {
                this.V.setContentDescription(com.sankuai.waimai.store.util.b.a(getContext(), R.string.wm_sg_food_decrease_with_number, String.valueOf(i)));
            }
        }
        if (!z2) {
            u.c(this.W, this.N);
        } else if (z || this.al.d == 1 || this.al.d == 3) {
            if (!z || this.af.t()) {
                u.c(this.W);
                u.a(this.N);
                if (p.a(this.N)) {
                    return;
                }
                this.N.setText(String.valueOf(i));
                this.N.setContentDescription(String.valueOf(i));
                return;
            }
            u.c(this.N);
            u.a(this.W);
            if (p.a(this.W)) {
                return;
            }
            this.W.setText(String.valueOf(i));
            this.W.setContentDescription(String.valueOf(i));
        } else if (this.al.d == 2) {
            u.c(this.N);
            u.a(this.W);
            if (p.a(this.W)) {
                return;
            }
            this.W.setText(String.valueOf(i));
            this.W.setContentDescription(String.valueOf(i));
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b5ca3a0dd141da1d7ca1815309df5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b5ca3a0dd141da1d7ca1815309df5e");
        } else if (this.al.d != 2 || !z) {
            u.c(this.V);
        } else if (p.a(this.V)) {
        } else {
            u.a(this.V);
            u.a(true, this.V);
            this.V.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d8ae9456b89a4b33c69a7a1e9c812c0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d8ae9456b89a4b33c69a7a1e9c812c0");
                    } else {
                        SpuBaseCellView.a(SpuBaseCellView.this);
                    }
                }
            });
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779b2e2895861670a55cccd072bcbce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779b2e2895861670a55cccd072bcbce8");
        } else if (p.a(this.V)) {
        } else {
            u.a(this.V);
            u.a(true, this.V);
            this.V.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e90a2094c98b607c9a2292336db7d30b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e90a2094c98b607c9a2292336db7d30b");
                        return;
                    }
                    am.a(SpuBaseCellView.this.getContext(), "请在购物车内修改数量");
                    SpuBaseCellView.a(SpuBaseCellView.this);
                }
            });
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ee2b76fc7c1fb9316f198b8d40355c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ee2b76fc7c1fb9316f198b8d40355c");
        } else if (p.a(this.ae, this.r)) {
        } else {
            switch (this.ae.getStatus()) {
                case 0:
                    t();
                    return;
                case 1:
                case 2:
                    u();
                    return;
                case 3:
                    v();
                    return;
                default:
                    return;
            }
        }
    }

    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5080b4df03c609988e82ae34af00e000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5080b4df03c609988e82ae34af00e000");
            return;
        }
        u.c(this.r, this.s);
        E();
    }

    public void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56ef158e4fb30cde0ab7681ce0ed570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56ef158e4fb30cde0ab7681ce0ed570");
            return;
        }
        u.a(this.r, this.s);
        u.c(this.t);
        if (!t.a(this.ae.getStatusDescription())) {
            this.r.setText(this.ae.getStatusDescription());
        } else {
            this.r.setText(R.string.wm_sc_common_sold_out);
        }
        u.c(this.w);
    }

    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0659b8ea183676d9cf417c7db50b45b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0659b8ea183676d9cf417c7db50b45b4");
            return;
        }
        u.a(this.r, this.s);
        u.c(this.t);
        if (!t.a(this.ae.getStatusDescription())) {
            this.r.setText(this.ae.getStatusDescription());
        } else {
            this.r.setText(R.string.wm_sc_common_not_sale_time);
        }
        u.c(this.w);
    }

    public boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58091234c1ee5a25fb116673b905d484", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58091234c1ee5a25fb116673b905d484")).booleanValue();
        }
        if (p.a(this.ae, this.ab, this.al) || !this.al.c) {
            return false;
        }
        if (t.a(this.ae.rankNumPic)) {
            u.c(this.ab);
            return false;
        }
        u.a(this.ab);
        u.c(this.S, this.x, this.ad);
        m.d(this.ae.rankNumPic, h.a(getContext(), 22.0f)).a(this.ab);
        return true;
    }

    public void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9e7f07de8a4f3a8fb86514d258a2e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9e7f07de8a4f3a8fb86514d258a2e7");
        } else if (goodsSpu == null || goodsSpu.isManySku()) {
        } else {
            this.aj.a(goodsSpu, this.F, getGoodImageRatio(), this.ag);
        }
    }

    public void setSpuSelectedStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30de17ad0adccbf933a9c9d45f43e45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30de17ad0adccbf933a9c9d45f43e45c");
        } else if (z) {
            this.o.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_text_highlight));
        } else {
            this.o.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_text_title));
        }
    }

    public String getDrugName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ddcd76424bee32f92e8ddc233e45cb2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ddcd76424bee32f92e8ddc233e45cb2") : this.ae != null ? this.ae.getName() : "";
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9c8ca1113a3c45af2c1dfba1c1aafc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9c8ca1113a3c45af2c1dfba1c1aafc");
        } else if (p.a(this.ae, this.C)) {
        } else {
            switch (this.ae.getStatus()) {
                case 1:
                case 2:
                    if (this.E == null || this.af.t()) {
                        this.C.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_999999));
                        if (!p.a(this.B)) {
                            this.B.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_999999));
                            break;
                        }
                    } else if (this.E != null) {
                        this.E.setPriceTheme(1);
                        break;
                    }
                    break;
                default:
                    if (this.E == null || this.af.t()) {
                        this.C.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_FB4E44));
                        if (!p.a(this.B)) {
                            this.B.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_FB4E44));
                            break;
                        }
                    } else if (this.E != null) {
                        this.E.setPriceTheme(0);
                        break;
                    }
                    break;
            }
            if (this.E == null || this.af.t()) {
                this.C.setText(i.a(this.ae.getMinPrice()));
            } else if (this.E != null) {
                this.E.setPrice(i.a(this.ae.getMinPrice()));
            }
        }
    }

    public void setHandPriceConfig(com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b bVar) {
        this.a = bVar;
    }

    public void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6362e953ce439b3adc37c2d17c93cf69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6362e953ce439b3adc37c2d17c93cf69");
            return;
        }
        u.c(this.P);
        if (k()) {
            u.a(this.R);
            com.sankuai.waimai.store.cell.a.a(getContext(), this.R, this.ae.mTopNumberAndPrivacyTag, this.am);
            return;
        }
        u.c(this.R);
        HandPriceInfo a = k.a(this.af.b, this.ae);
        if (a == null || this.P == null) {
            return;
        }
        u.a(this.P);
        this.P.a(this.af.b, a);
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a183b09e0bfc9b0bb81e958cbdfce863", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a183b09e0bfc9b0bb81e958cbdfce863")).booleanValue() : (p.a(this.ae, this.R) || this.ae.mTopNumberAndPrivacyTag == null) ? false : true;
    }

    public void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd54c8617ad8a76efbad1aa3ab8d4653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd54c8617ad8a76efbad1aa3ab8d4653");
        } else if (p.a(this.af)) {
        } else {
            if (!this.af.t()) {
                u.c(this.A, this.P);
            } else if (z()) {
                u.a(this.A);
                if (p.a(this.A)) {
                    return;
                }
                this.A.a(this.ae, com.sankuai.waimai.store.order.a.e().i(this.af.d()), this.a, this.af.u());
            } else {
                u.a(this.B, this.C);
                u.c(this.A);
                if (y()) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = m;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91b55a49f7c047819b27d0b417fd21a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91b55a49f7c047819b27d0b417fd21a4");
                    } else if (p.a(this.P, this.af)) {
                    } else {
                        HandPriceInfo a = k.a(this.af.b, this.ae);
                        if (a == null) {
                            u.c(this.P);
                            if (!p.a(this.C)) {
                                this.C.setTextColor(getContext().getResources().getColor(R.color.wm_st_common_FB4E44));
                            }
                            if (p.a(this.B)) {
                                return;
                            }
                            this.B.setTextColor(getContext().getResources().getColor(R.color.wm_st_common_FB4E44));
                            return;
                        }
                        if (!p.a(this.C)) {
                            this.C.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_000000));
                        }
                        if (!p.a(this.B)) {
                            this.B.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_000000));
                        }
                        u.a(this.P);
                        this.P.a(this.af.b, a);
                    }
                }
            }
        }
    }

    public boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36256a1a1969bbf098cad48c6f7a7e48", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36256a1a1969bbf098cad48c6f7a7e48")).booleanValue() : !k();
    }

    public final boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b28c8d2e41fc790f3d16e5e5ad8830c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b28c8d2e41fc790f3d16e5e5ad8830c")).booleanValue();
        }
        if (this.ae == null || p.a(this.A)) {
            return false;
        }
        HandPriceInfo handPriceInfo = this.ae.handPriceInfo;
        return (handPriceInfo != null && handPriceInfo.isShowNewStyle()) || !TextUtils.isEmpty(this.af.u());
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c05e4cd3151c816f50c09079803dc74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c05e4cd3151c816f50c09079803dc74");
        } else if (p.a(this.ae)) {
        } else {
            s.a(this.ae, new s.a<GoodsSpu>() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    Object[] objArr2 = {goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75afa952e69ea942d9e72026c017fb12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75afa952e69ea942d9e72026c017fb12");
                        return;
                    }
                    u.c(SpuBaseCellView.this.O);
                    if (SpuBaseCellView.this.E == null || SpuBaseCellView.this.af.t()) {
                        u.a(SpuBaseCellView.this.D);
                        if (p.a(SpuBaseCellView.this.D)) {
                            return;
                        }
                        if (i.e(Double.valueOf(SpuBaseCellView.this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                            SpuBaseCellView.this.D.setText(SpuBaseCellView.this.getContext().getString(R.string.wm_sc_common_price, i.a(SpuBaseCellView.this.ae.getOriginPrice())));
                            return;
                        } else {
                            u.c(SpuBaseCellView.this.D);
                            return;
                        }
                    }
                    u.c(SpuBaseCellView.this.D);
                    if (p.a(SpuBaseCellView.this.E)) {
                        return;
                    }
                    if (i.e(Double.valueOf(SpuBaseCellView.this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
                        SpuBaseCellView.this.E.setOriginPriceVisibility(0);
                        SpuBaseCellView.this.E.setOriginPrice(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_price, i.a(SpuBaseCellView.this.ae.getOriginPrice())));
                        return;
                    }
                    SpuBaseCellView.this.E.setOriginPriceVisibility(8);
                }

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void b(GoodsSpu goodsSpu) {
                    Object[] objArr2 = {goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96284bb4711d708229b6dddf2b97dc3b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96284bb4711d708229b6dddf2b97dc3b");
                        return;
                    }
                    u.a(SpuBaseCellView.this.O);
                    if (SpuBaseCellView.this.E == null || SpuBaseCellView.this.af.t()) {
                        u.c(SpuBaseCellView.this.D);
                    } else {
                        SpuBaseCellView.this.E.setOriginPriceVisibility(8);
                    }
                    if (p.a(SpuBaseCellView.this.O)) {
                        return;
                    }
                    if (!i.e(Double.valueOf(SpuBaseCellView.this.ae.memberPrice), Double.valueOf(0.0d))) {
                        u.c(SpuBaseCellView.this.O);
                        return;
                    }
                    SpuBaseCellView.this.O.setStrikeThrough(i.e(Double.valueOf(SpuBaseCellView.this.ae.memberPrice), Double.valueOf(SpuBaseCellView.this.ae.getMinPrice())));
                    SpuBaseCellView.this.O.setText(SpuBaseCellView.this.getContext().getString(R.string.wm_sc_common_price, i.a(SpuBaseCellView.this.ae.memberPrice)));
                }
            });
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0319dd15099eaa0682921d2e90b61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0319dd15099eaa0682921d2e90b61d");
        } else if (z()) {
            u.c(this.O);
            u.c(this.D);
            u.c(this.B, this.C);
            u.c(this.P);
        }
    }

    public final void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ab3733b7aec9c99e64e2d52695b774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ab3733b7aec9c99e64e2d52695b774");
            return;
        }
        if (com.sankuai.waimai.store.config.k.a() && this.af == null) {
            am.a(getContext(), (int) R.string.wm_sg_test_poi_helper_is_null);
        }
        if (p.a(this.ae, this.aj, this.af)) {
            return;
        }
        boolean goodStatusIsAddDisable = getGoodStatusIsAddDisable();
        if (this.af.z()) {
            goodStatusIsAddDisable = true;
        }
        if (goodStatusIsAddDisable) {
            u.b(this.F, this.V, this.W, this.G);
            u.a(false, this.F);
            u.a(false, this.V);
            u.c(this.I, this.N, this.W, this.J, this.L);
            return;
        }
        if (this.ae.mSaleType == 1) {
            m();
        } else if (this.ae.mSaleType == 2) {
            B();
        } else {
            o();
        }
        s();
    }

    public void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06ef24c35b5adef3f1d6f8052871e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06ef24c35b5adef3f1d6f8052871e90");
            return;
        }
        u.a(this.L);
        u.a(true, this.M);
        u.c(this.I, this.N, this.W, this.F, this.G, this.J);
        if (p.a(this.M, this.L)) {
            return;
        }
        this.L.setOnClickListener(new com.sankuai.waimai.store.widgets.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.10
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1480042085fbce4b2eac39e94f42e05", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1480042085fbce4b2eac39e94f42e05");
                } else {
                    SpuBaseCellView.b(SpuBaseCellView.this);
                }
            }
        }));
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d69ff512f9aa5d9eb88eee4305454eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d69ff512f9aa5d9eb88eee4305454eb");
            return;
        }
        u.a(this.J);
        u.a(true, this.K);
        u.c(this.I, this.N, this.W, this.F, this.G, this.L);
        if (p.a(this.K, this.J)) {
            return;
        }
        this.J.setOnClickListener(new com.sankuai.waimai.store.widgets.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.11
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13aaa2fa737ee4317445855841f84e40", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13aaa2fa737ee4317445855841f84e40");
                } else {
                    SpuBaseCellView.this.D();
                }
            }
        }));
    }

    private void o() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01e6f553056814d7a21cf75f7247e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01e6f553056814d7a21cf75f7247e5d");
            return;
        }
        u.a(false, this.K);
        u.c(this.J, this.L);
        Map<String, List<GoodsAttr>> attrList = this.ae.getAttrList();
        List<GoodsSku> skuList = this.ae.getSkuList();
        final boolean z2 = (skuList != null && skuList.size() > 1) || (attrList != null && attrList.size() > 0);
        boolean z3 = this.al.d != 1;
        int a = w.a(this.ae, this.af.d());
        if ((z2 && z3 && a == 0) || (z2 && z3 && this.af.t())) {
            u.b(this.F, this.G);
            u.a(false, this.F);
            a(false);
            u.a(this.I);
            if (!p.a(this.H, this.I)) {
                this.H.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_text_title));
                this.I.setOnClickListener(new View.OnClickListener(true) { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.12
                    public static ChangeQuickRedirect a;
                    public final /* synthetic */ boolean b = true;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8f8427e1f2c4cf68d193a926394c866", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8f8427e1f2c4cf68d193a926394c866");
                        } else {
                            SpuBaseCellView.this.b(this.b);
                        }
                    }
                });
            }
        } else {
            H();
            u.a(true, this.F);
            u.c(this.I);
            if (!p.a(this.F)) {
                this.F.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76e2adeb18ba455eae5b9275c06646aa", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76e2adeb18ba455eae5b9275c06646aa");
                        } else {
                            SpuBaseCellView.this.b(z2);
                        }
                    }
                });
            }
            if (!p.a(this.G)) {
                this.G.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f767d579779ae617221687f93b76de9", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f767d579779ae617221687f93b76de9");
                        } else {
                            SpuBaseCellView.this.b(z2);
                        }
                    }
                });
            }
        }
        if (this.ae.getStatus() == 3 || this.af.z() || a <= 0) {
            a(0, false, false);
            a(false);
            return;
        }
        a(a <= 99 ? a : 99, z2 && z3, true);
        a((z2 && z3) ? true : true);
        if (!z2 || this.af.t()) {
            return;
        }
        h();
    }

    public boolean getGoodStatusIsAddDisable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f706e711e23a1404a77538a0d94380", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f706e711e23a1404a77538a0d94380")).booleanValue();
        }
        boolean z = this.ae.getStatus() != 0;
        if (this.af == null || !this.af.k) {
            return z;
        }
        return true;
    }

    public final boolean C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2fe8c5e5e82c3748eb38e855825e3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2fe8c5e5e82c3748eb38e855825e3d")).booleanValue();
        }
        if (this.ae == null) {
            return false;
        }
        Map<String, List<GoodsAttr>> attrList = this.ae.getAttrList();
        List<GoodsSku> skuList = this.ae.getSkuList();
        return (skuList != null && skuList.size() > 1) || (attrList != null && attrList.size() > 0);
    }

    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704ee8a8ca45049ddc86b00c74674f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704ee8a8ca45049ddc86b00c74674f30");
        } else if (z) {
            if (!p.a(this.aj)) {
                this.aj.a(this.ae, this.ag);
            }
            if (p.a(this.ak)) {
                return;
            }
            this.ak.g(this.ae, this.ag);
        } else {
            if (!p.a(this.aj) && this.ae.mSaleType == 0) {
                this.aj.a(this.ae, this.F, getGoodImageRatio(), this.ag);
            }
            if (p.a(this.ak)) {
                return;
            }
            this.ak.e(this.ae, this.ag);
        }
    }

    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a023d99f4ca680b321eb67c2f38fe55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a023d99f4ca680b321eb67c2f38fe55");
            return;
        }
        if (!p.a(this.aj)) {
            this.aj.b(this.ae, this.ag);
        }
        p.a(this.ak);
    }

    public void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf53c288b8bd0540f92dcfbc19667f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf53c288b8bd0540f92dcfbc19667f39");
        } else if (p.a(this.w, this.ae) || this.ae.promotion == null || t.a(this.ae.promotion.promotionTxt)) {
            F();
        } else {
            u.a(this.w);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
            switch (this.ae.promotion.labelType) {
                case 0:
                    u.c(this.ac);
                    setNormalPromotionInfo(dimensionPixelSize);
                    return;
                case 1:
                    setNewCustomerLabel(dimensionPixelSize);
                    return;
                default:
                    F();
                    return;
            }
        }
    }

    public void setNewCustomerLabel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f736208cbbd619c93d176a8dcdd21f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f736208cbbd619c93d176a8dcdd21f9");
            return;
        }
        this.w.setBackgroundResource(R.drawable.wm_sg_bg_spu_promotion_info_new_customer);
        this.w.setPadding(0, 0, i, 0);
        this.w.setText(this.ae.promotion.promotionTxt);
        this.w.setTextColor(getResources().getColor(R.color.wm_sc_price_red));
        if (this.ac != null) {
            if (t.a(this.ae.promotion.labelPic)) {
                u.c(this.ac);
                return;
            }
            u.a(this.ac);
            m.b(this.ae.promotion.labelPic).a(new b.a() { // from class: com.sankuai.waimai.store.cell.view.SpuBaseCellView.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c28a2f44d3a08f90d8b6704dd3afc8d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c28a2f44d3a08f90d8b6704dd3afc8d0");
                        return;
                    }
                    SpuBaseCellView.this.ac.getLayoutParams().width = (SpuBaseCellView.this.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16) * bitmap.getWidth()) / bitmap.getHeight();
                    SpuBaseCellView.this.ac.setImageBitmap(bitmap);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9ee865a16f970f6a81703f1d5181cda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9ee865a16f970f6a81703f1d5181cda");
                    } else {
                        SpuBaseCellView.this.F();
                    }
                }
            });
        }
    }

    public void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466e35d89d64ade49e1b365a860befd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466e35d89d64ade49e1b365a860befd4");
        } else {
            u.c(this.w, this.ac);
        }
    }

    public void setNormalPromotionInfo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0019fe514c3590ac556ca1980985958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0019fe514c3590ac556ca1980985958");
            return;
        }
        this.w.setBackgroundResource(R.drawable.wm_st_new_poi_market_adapter_goods_item_promotion_bg_of_floor);
        this.w.setPadding(i, 0, i, 0);
        this.w.setText(this.ae.promotion.promotionTxt);
        this.w.setTextColor(getResources().getColor(R.color.wm_st_common_white));
    }

    public void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f17533658f1aedeedd196c58a2b7d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f17533658f1aedeedd196c58a2b7d8");
        } else if (this.af == null || this.ae == null || this.af.t()) {
        } else {
            u.c(this.P, this.R);
            HandPriceInfo b = k.b(this.af.b, this.ae);
            if (b != null && !t.a(b.getHandActivityPriceText())) {
                if (this.Q != null) {
                    u.c(this.R);
                    u.a(this.Q);
                    this.Q.a(b, 1);
                    if (this.E != null) {
                        this.E.setOriginPriceVisibility(8);
                    }
                    u.c(this.O);
                }
            } else if (this.E == null || this.E.getOriginPriceVisibility() != 8) {
                u.c(this.Q);
            } else {
                u.b(this.Q);
            }
        }
    }

    public void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e19e756ca2be987cb47769e3476ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e19e756ca2be987cb47769e3476ea1");
        } else if (this.af == null || this.ae == null) {
        } else {
            if (com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.skus, 0) == null || this.G == null || this.af.t()) {
                u.a(this.F);
                u.c(this.G);
                return;
            }
            int i = ((GoodsSku) Objects.requireNonNull(com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.skus, 0))).minOrderCount;
            if (w.a(this.ae, this.af.d()) != 0 || i <= 1) {
                u.c(this.G);
                u.a(this.F);
                return;
            }
            u.a(this.G);
            u.c(this.F);
            FlashButton flashButton = this.G;
            flashButton.setText(i + getMinOrderCountText());
            this.G.setMidMargin(0);
        }
    }
}
