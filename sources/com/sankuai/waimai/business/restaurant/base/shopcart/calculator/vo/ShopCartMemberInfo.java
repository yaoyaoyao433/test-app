package com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ShopCartMemberInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_cart_floating_layer_member_info")
    public String cartMemberInfo;
    private MemberFloatLayerInfo mMemberLayerInfo;
    @SerializedName("member_floating_layer_info")
    public String memberFloatingLayerInfo;
    private MemberVpParam memberVpParam;
    private PoiCartFloatingLayerMemberInfo poiCartFloatingLayerMemberInfo;
    private int selfDelivery;
    private TipText tipText;
    @SerializedName("tip_text")
    public String tipTextJson;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class MemberActivityInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_tip")
        public String activityTip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class MemberFloatLayerInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("biz_icon")
        public String memberIcon;
        @SerializedName("biz_title")
        public String memberTitle;
        @SerializedName("products")
        public List<MemberProduct> productList;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class MemberProduct implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_infos")
        public MemberActivityInfo activityInfo;
        @SerializedName(DMKeys.KEY_SELECTED)
        public boolean isSelected;
        @SerializedName("original_price")
        public String originalPrice;
        @SerializedName("price")
        public String price;
        @SerializedName("biz_product_data")
        public MemberProductBizData productBizData;
        @SerializedName("product_desc")
        public String productDesc;
        @SerializedName("product_id")
        public int productId;
        @SerializedName("product_tip_list")
        public List<String> productTipList;
        @SerializedName("product_title")
        public String productTitle;
        @SerializedName("product_type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class MemberProductBizData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_count")
        public int couponCount;
        @SerializedName("coupon_limit_threshold")
        public String couponLimit;
        @SerializedName("coupon_money")
        public float couponMoney;
        @SerializedName("selected_tip")
        public String selectedTip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class MemberVpParam implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("extendInfo")
        public String extendInfo = "{\"ttsqClientVersion\":\"1\"}";
        @SerializedName("vp_product_list")
        public List<ProductParam> productParams;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PoiCartFloatingLayerMemberInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("biz_agreement_desc")
        public String bizAgreementDesc;
        @SerializedName("biz_desc")
        public String bizDesc;
        @SerializedName("biz_icon")
        public String bizIcon;
        @SerializedName("biz_title")
        public String bizTitle;
        @SerializedName("product_common_desc")
        public String productCommonDesc;
        @SerializedName("products")
        public List<Product> products;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class Product implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("agreement_desc")
            public String agreementDesc;
            @SerializedName("biz_icon")
            public String bizIcon;
            @SerializedName("biz_product_data")
            public BizProductData bizProductData;
            @SerializedName("biz_title")
            public String bizTitle;
            @SerializedName("product_desc")
            public String productDesc;
            @SerializedName("product_id")
            public String productId;
            @SerializedName("product_title")
            public String productTitle;
            @SerializedName("product_type")
            public int productType;
            @SerializedName(DMKeys.KEY_SELECTED)
            public boolean selected;

            /* compiled from: ProGuard */
            @Keep
            /* loaded from: classes4.dex */
            public static class BizProductData implements Serializable {
                public static ChangeQuickRedirect changeQuickRedirect;
                @SerializedName("selected_tip")
                public String selectedTip;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ProductParam implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("id")
        public String productId;
        @SerializedName(DMKeys.KEY_SELECTED)
        public int selected;
        @SerializedName("type")
        public int type = 3;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TipText implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("biz_icon")
        public String bizIcon;
        @SerializedName("biz_title")
        public String bizTTitle;
    }

    public MemberFloatLayerInfo getMemberFloatLayerInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f4cf8a20e926000a7b965654ba185b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MemberFloatLayerInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f4cf8a20e926000a7b965654ba185b8");
        }
        if (TextUtils.isEmpty(this.memberFloatingLayerInfo)) {
            return null;
        }
        if (this.mMemberLayerInfo == null) {
            this.mMemberLayerInfo = (MemberFloatLayerInfo) new Gson().fromJson(this.memberFloatingLayerInfo, (Class<Object>) MemberFloatLayerInfo.class);
        }
        return this.mMemberLayerInfo;
    }

    public void setSelfDelivery(int i) {
        this.selfDelivery = i;
    }

    public int getSelfDelivery() {
        return this.selfDelivery;
    }

    public void setMemberVpParam(MemberVpParam memberVpParam) {
        this.memberVpParam = memberVpParam;
    }

    public MemberVpParam getMemberVpParam() {
        MemberFloatLayerInfo memberFloatLayerInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a1cd8cea248620c271e12ae4fcde5c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MemberVpParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a1cd8cea248620c271e12ae4fcde5c0");
        }
        if (this.memberVpParam == null && (memberFloatLayerInfo = getMemberFloatLayerInfo()) != null && memberFloatLayerInfo.productList != null) {
            this.memberVpParam = new MemberVpParam();
            ArrayList arrayList = new ArrayList();
            for (MemberProduct memberProduct : memberFloatLayerInfo.productList) {
                if (memberProduct != null) {
                    ProductParam productParam = new ProductParam();
                    productParam.productId = String.valueOf(memberProduct.productId);
                    productParam.selected = memberProduct.isSelected ? 1 : 0;
                    productParam.type = memberProduct.type;
                    arrayList.add(productParam);
                }
            }
            this.memberVpParam.productParams = arrayList;
        }
        return this.memberVpParam;
    }

    public List<Map<String, Object>> getApParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c25267e1292287fd8c39eaf791c3aa44", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c25267e1292287fd8c39eaf791c3aa44");
        }
        ArrayList arrayList = new ArrayList();
        MemberFloatLayerInfo memberFloatLayerInfo = getMemberFloatLayerInfo();
        if (memberFloatLayerInfo != null && memberFloatLayerInfo.productList != null) {
            for (MemberProduct memberProduct : memberFloatLayerInfo.productList) {
                if (memberProduct != null && memberProduct.isSelected) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", Integer.valueOf(memberProduct.type));
                    hashMap.put(DMKeys.KEY_SELECTED, Boolean.valueOf(memberProduct.isSelected));
                    hashMap.put("product_id", Integer.valueOf(memberProduct.productId));
                    arrayList.add(hashMap);
                }
            }
        }
        return arrayList;
    }

    public PoiCartFloatingLayerMemberInfo getPoiCartFloatingLayerMemberInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36b533fe765a33fa7dd9b11857ab9cb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCartFloatingLayerMemberInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36b533fe765a33fa7dd9b11857ab9cb3");
        }
        if (TextUtils.isEmpty(this.cartMemberInfo)) {
            return null;
        }
        if (this.poiCartFloatingLayerMemberInfo == null) {
            try {
                this.poiCartFloatingLayerMemberInfo = (PoiCartFloatingLayerMemberInfo) k.a().fromJson(this.cartMemberInfo, (Class<Object>) PoiCartFloatingLayerMemberInfo.class);
            } catch (JsonSyntaxException unused) {
            }
        }
        return this.poiCartFloatingLayerMemberInfo;
    }

    public TipText getTipText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1a1beaf1109c4aa6e540b78aa5b4594", RobustBitConfig.DEFAULT_VALUE)) {
            return (TipText) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1a1beaf1109c4aa6e540b78aa5b4594");
        }
        if (TextUtils.isEmpty(this.tipTextJson)) {
            return null;
        }
        if (this.tipText == null) {
            try {
                this.tipText = (TipText) k.a().fromJson(this.tipTextJson, (Class<Object>) TipText.class);
            } catch (JsonSyntaxException unused) {
            }
        }
        return this.tipText;
    }
}
