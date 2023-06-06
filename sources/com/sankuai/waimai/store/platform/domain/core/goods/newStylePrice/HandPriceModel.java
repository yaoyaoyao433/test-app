package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HandPriceModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("added-to-cart")
    private boolean isAddGoods;
    private boolean isMultiplySpec;
    @SerializedName("price-unit")
    private String mCurrentPriceUnitl;
    @SerializedName("current-price")
    private double mGoodsCurrentPrice;
    @SerializedName("origin-price")
    private double mGoodsOriginPrice;
    @SerializedName("hand-price")
    private HandPriceInfo mHandPriceInfo;
    @SerializedName("member-icon")
    private String mMemberIcon;
    @SerializedName("single-standard-price")
    private String mStandardPrice;
    @SerializedName("underline-price")
    private String mUnderlinePrice;
    @SerializedName("price-exp-info")
    private String priceExpInfo;
    private String toBeMemberPrice;

    public void converNewStyleData(GoodsSpu goodsSpu, GoodsSku goodsSku, boolean z, String str) {
        Object[] objArr = {goodsSpu, goodsSku, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f0823bce9be785f9e6128d230c903ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f0823bce9be785f9e6128d230c903ac");
        } else if (goodsSpu == null) {
        } else {
            this.priceExpInfo = str;
            if (goodsSku != null) {
                this.mGoodsCurrentPrice = goodsSku.price;
                this.mGoodsOriginPrice = goodsSku.originPrice;
                this.mHandPriceInfo = goodsSku.handPriceInfo;
            } else {
                this.mGoodsCurrentPrice = goodsSpu.minPrice;
                this.mHandPriceInfo = goodsSpu.handPriceInfo;
                this.mGoodsOriginPrice = goodsSpu.getOriginPrice();
                this.mCurrentPriceUnitl = TextUtils.isEmpty(this.priceExpInfo) ? goodsSpu.getGoodsUnit() : goodsSpu.getDrugGoodsUnit();
            }
            this.isAddGoods = z;
            this.isMultiplySpec = goodsSpu.hasManySpec();
            this.mMemberIcon = initAndGetMemberIcon(goodsSpu);
            this.mStandardPrice = goodsSpu.standardPrice;
            this.mUnderlinePrice = goodsSpu.underlinePrice;
            this.toBeMemberPrice = goodsSpu.toBeMemberPrice;
        }
    }

    public boolean getIsAddGoods() {
        return this.isAddGoods;
    }

    private String initAndGetMemberIcon(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc7c0f1acf00c53ee38beccc2fcbdc24", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc7c0f1acf00c53ee38beccc2fcbdc24");
        }
        if (!TextUtils.isEmpty(this.priceExpInfo) && goodsSpu != null) {
            return goodsSpu.memberIcon;
        }
        if (getHandPriceInfo() != null) {
            return getHandPriceInfo().icon;
        }
        return null;
    }

    public boolean isEnhancePriceStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2fd204e51f34c665291018393ab83ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2fd204e51f34c665291018393ab83ab")).booleanValue() : !TextUtils.isEmpty(this.priceExpInfo);
    }

    public boolean isMultiplySpec() {
        return this.isMultiplySpec;
    }

    public String getCurrentPriceUnit() {
        return this.mCurrentPriceUnitl;
    }

    public String getMemberIcon() {
        return this.mMemberIcon;
    }

    public HandPriceInfo getHandPriceInfo() {
        return this.mHandPriceInfo;
    }

    public double getGoodsOriginPrice() {
        return this.mGoodsOriginPrice;
    }

    public double getGoodsCurrentPrice() {
        return this.mGoodsCurrentPrice;
    }

    public String getStandardPrice() {
        return this.mStandardPrice;
    }

    public String getUnderlinePrice() {
        return this.mUnderlinePrice;
    }

    public String getToBeMemberPrice() {
        return this.toBeMemberPrice;
    }
}
