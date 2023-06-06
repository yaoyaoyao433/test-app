package com.sankuai.waimai.platform.domain.core.order;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.w;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.Product;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderedFood implements Serializable {
    public static final int BUY_TYPE_COMMON = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<a> actInfoList;
    public List<com.sankuai.waimai.platform.domain.core.shop.a> activityList;
    public String adDataInfo;
    public String allowanceTip;
    private GoodsAttr[] attrIds;
    private int cartId;
    private String cartPoiPicUrl;
    private String clickUrl;
    private List<OrderedFood> comboItemList;
    public int count;
    public int countDiscountNum;
    public String deliveryDesc;
    public String desc;
    private String foodDesc;
    private String foodLabelUrl;
    private long groupId;
    public boolean ignoreAttrs;
    public boolean isRemoveAll;
    public int isZhiNengZheKou;
    private int itemIndex;
    private int mBuyType;
    @SerializedName(JsBridgeResult.ARG_KEY_LOCATION_MODE)
    public int mode;
    public double originalBoxNum;
    public double originalBoxPrice;
    public int plusCount;
    public String preSaleIconUrl;
    public List<String> productLabelList;
    private int productType;
    public Map<String, String> productUsageInfo;
    public GoodsSku sku;
    public double spotPrice;
    public String spotPriceLabel;
    public GoodsSpu spu;
    private String subBoxPrice;
    private String subBoxPriceDesc;
    public double subBoxTotalPrice;
    public String subBoxTotalPriceDesc;
    private String subTotal;
    private double subTotalOriginalPrice;
    private double subTotalPrice;
    private String uniqueKey;
    public int useGoodCouponNum;
    private String vipLabelUrl;

    public OrderedFood() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df34a94afb29758bb9e91ad97422a1e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df34a94afb29758bb9e91ad97422a1e7");
            return;
        }
        this.countDiscountNum = 0;
        this.useGoodCouponNum = 0;
        this.mBuyType = 0;
        this.mode = -1;
        this.spu = new GoodsSpu();
        this.sku = new GoodsSku();
        List<GoodsSku> skuList = this.spu.getSkuList();
        if (skuList == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.sku);
            this.spu.setSkuList(arrayList);
        } else if (skuList.isEmpty()) {
            skuList.add(this.sku);
        }
    }

    public OrderedFood(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9987f665ee4d961771ed52eddb009a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9987f665ee4d961771ed52eddb009a0");
            return;
        }
        this.countDiscountNum = 0;
        this.useGoodCouponNum = 0;
        this.mBuyType = 0;
        this.mode = -1;
        this.count = i;
        if (goodsAttrArr != null && goodsAttrArr.length > 0) {
            this.attrIds = new GoodsAttr[goodsAttrArr.length];
            for (int i2 = 0; i2 < goodsAttrArr.length; i2++) {
                if (goodsAttrArr[i2] != null) {
                    this.attrIds[i2] = goodsAttrArr[i2].m15clone();
                }
            }
        }
        this.spu = goodsSpu;
        this.sku = goodsSku;
    }

    public String getVipLabelUrl() {
        return this.vipLabelUrl;
    }

    public void setVipLabelUrl(String str) {
        this.vipLabelUrl = str;
    }

    public void setDescription(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eb5ef3345bc051a1f557c2013583f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eb5ef3345bc051a1f557c2013583f3b");
        } else {
            this.sku.setDescription(str);
        }
    }

    public int getStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "017bab37bb6d2f50a367be7deefe5310", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "017bab37bb6d2f50a367be7deefe5310")).intValue() : this.spu.getStatus();
    }

    public void setStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87090ed302aa6b65a601dc0e121fb4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87090ed302aa6b65a601dc0e121fb4c6");
        } else {
            this.spu.setStatus(i);
        }
    }

    public void setMinPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a6e5823c5cf2d043d2747b4535647b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a6e5823c5cf2d043d2747b4535647b");
        } else {
            this.spu.setMinPrice(d);
        }
    }

    public void setActInfoList(List<a> list) {
        this.actInfoList = list;
    }

    public int getStock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b7a5a1195e868fa938679257556a8e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b7a5a1195e868fa938679257556a8e0")).intValue() : this.sku.getStock();
    }

    public void setStock(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8df6362af67877b22098c044dad07ad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8df6362af67877b22098c044dad07ad4");
        } else {
            this.sku.setStock(i);
        }
    }

    public void setPicture(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32f556a1bd7a5e32bec1e9d21efd24e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32f556a1bd7a5e32bec1e9d21efd24e0");
        } else {
            this.spu.setPicture(str);
        }
    }

    public String getPicture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41905f057ac3adef4f7af08ed5cd45f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41905f057ac3adef4f7af08ed5cd45f7") : this.spu.getPicture();
    }

    public void setReason(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "476ee4b1fcf9cd937208bf4a5ab20404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "476ee4b1fcf9cd937208bf4a5ab20404");
        } else {
            this.spu.setReason(str);
        }
    }

    public String getReason() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1f0ef989a371e66516facd5fe44510e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1f0ef989a371e66516facd5fe44510e") : this.spu.getReason();
    }

    public int getRestrictNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf6a5b11bf795bbc3bda225909adf607", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf6a5b11bf795bbc3bda225909adf607")).intValue() : this.sku.getRestrictNum();
    }

    public void setRestrictNum(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31decbd1f0410c819e22daf0a707b6dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31decbd1f0410c819e22daf0a707b6dd");
        } else {
            this.sku.setRestrict(i);
        }
    }

    public String getActivityTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e417ad9ca17e81e32a25faf268eb06e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e417ad9ca17e81e32a25faf268eb06e8") : this.spu.getActivityTag();
    }

    public void setActivityTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caa0ba27328ff8f0143cc86de85bf3dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caa0ba27328ff8f0143cc86de85bf3dd");
        } else {
            this.spu.setActivityTag(str);
        }
    }

    public String getTagCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f7f488c51d0cddd7be03d4f0a83c4c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f7f488c51d0cddd7be03d4f0a83c4c") : this.spu.getTag();
    }

    public void setTagCode(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b0c8bfee401fac151d49743bd495edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b0c8bfee401fac151d49743bd495edc");
        } else {
            this.spu.setTag(str);
        }
    }

    public String getSpec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cd47910a0a089d73a17ef8c2fd2f58e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cd47910a0a089d73a17ef8c2fd2f58e") : this.sku.getSpec();
    }

    public void setSpec(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e20af33c16cf68d8e1b5ac3adb3d3b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e20af33c16cf68d8e1b5ac3adb3d3b9d");
        } else {
            this.sku.setSpec(str);
        }
    }

    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0359d0c8b2f63add1374e2daeef7efb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0359d0c8b2f63add1374e2daeef7efb") : this.spu.getName();
    }

    public void setName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "331ffe3570036beefc3d6e3e74701cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "331ffe3570036beefc3d6e3e74701cd8");
        } else {
            this.spu.setName(str);
        }
    }

    public double getPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dbcd34d37c08dfc7ff007f9b287b449", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dbcd34d37c08dfc7ff007f9b287b449")).doubleValue() : this.sku.getSkuPrice();
    }

    public void setPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a70bac18ff605ec4ca13820a977aaf77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a70bac18ff605ec4ca13820a977aaf77");
        } else {
            this.sku.setPrice(d);
        }
    }

    public long getSpuId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83cec7b348c12a761897c18f163b9923", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83cec7b348c12a761897c18f163b9923")).longValue() : this.spu.getId();
    }

    public void setSpuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e0c6e237f7a51ba75aa38e60e035d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e0c6e237f7a51ba75aa38e60e035d2c");
        } else {
            this.spu.id = j;
        }
    }

    public long getSkuId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b0c4331f9b4c7949e5504b35961dc12", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b0c4331f9b4c7949e5504b35961dc12")).longValue() : this.sku.getSkuId();
    }

    public void setSkuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "873e4633246be8d00b5f0659d73d8d14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "873e4633246be8d00b5f0659d73d8d14");
        } else {
            this.sku.id = j;
        }
    }

    public double getOriginPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eafe72582d5c9ac3e670a8fd516c030a", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eafe72582d5c9ac3e670a8fd516c030a")).doubleValue() : this.sku.getOriginPrice();
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9dfe7c34d2ef9876437566e214831df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9dfe7c34d2ef9876437566e214831df");
        } else {
            this.sku.setOriginPrice(d);
        }
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public double getBoxNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ecbcf505bc18231eced0a272cb2873", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ecbcf505bc18231eced0a272cb2873")).doubleValue() : this.sku.getBoxNum();
    }

    public void setBoxNum(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ee77b9387c194173698f1fd4f40c030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ee77b9387c194173698f1fd4f40c030");
        } else {
            this.sku.setBoxNum(d);
        }
    }

    public double getBoxPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee866b9eb4b967bb2e4c4057d7436e90", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee866b9eb4b967bb2e4c4057d7436e90")).doubleValue() : this.sku.getBoxPrice();
    }

    public void setBoxPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "814ed303bb877abb10b157132afe71ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "814ed303bb877abb10b157132afe71ad");
        } else {
            this.sku.setBoxPrice(d);
        }
    }

    public int getMinCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c793a62e8ce07759ed1087b90b68293", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c793a62e8ce07759ed1087b90b68293")).intValue() : this.sku.getMinOrderCount();
    }

    public void setMinCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2cd0d4531371cac9b2935b733ffc8b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2cd0d4531371cac9b2935b733ffc8b5");
        } else {
            this.sku.setMinOrderCount(i);
        }
    }

    public double getSubTotalOriginalPrice() {
        return this.subTotalOriginalPrice;
    }

    public void setSubTotalOriginalPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5052ddcbb85661ae78eb56942130359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5052ddcbb85661ae78eb56942130359");
        } else {
            this.subTotalOriginalPrice = d;
        }
    }

    public void setAttrs(List<GoodsAttr> list, List<GoodsAttr> list2) {
        int i;
        int i2;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47ffad6592456c5b80e745d7d623b877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47ffad6592456c5b80e745d7d623b877");
            return;
        }
        int size = list != null ? list.size() : 0;
        if (list2 != null) {
            size += list2.size();
        }
        if (size != 0) {
            GoodsAttr[] goodsAttrArr = new GoodsAttr[size];
            if (list != null) {
                int i3 = 0;
                i = 0;
                while (i3 < list.size()) {
                    goodsAttrArr[i3] = list.get(i3);
                    i = i3 + 1;
                    i3 = i;
                }
            } else {
                i = 0;
            }
            if (list2 != null) {
                for (int i4 = 0; i4 < list2.size() && (i2 = i + i4) < size; i4++) {
                    goodsAttrArr[i2] = list2.get(i4);
                    goodsAttrArr[i2].mode = 999;
                }
            }
            this.attrIds = goodsAttrArr;
        }
    }

    public int getMode() {
        GoodsAttr[] attrIds;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97b54a8089409b2160785e8bbdb7a84d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97b54a8089409b2160785e8bbdb7a84d")).intValue();
        }
        if (this.mode == -1 && (attrIds = getAttrIds()) != null) {
            for (GoodsAttr goodsAttr : attrIds) {
                if (goodsAttr.getMode() > 0) {
                    this.mode = goodsAttr.getMode();
                }
            }
        }
        return this.mode;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public String getSubTotalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86425f4cbfb896fa100b1b56fab4c29d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86425f4cbfb896fa100b1b56fab4c29d");
        }
        if (!TextUtils.isEmpty(this.subTotal)) {
            return this.subTotal;
        }
        return ab.a((int) R.string.wm_platform_food_price, h.a(this.subTotalPrice));
    }

    public String getSubOriginalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "035e07c460e260a8776593f85b5763f5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "035e07c460e260a8776593f85b5763f5") : ab.a((int) R.string.wm_platform_food_price, h.a(this.subTotalOriginalPrice));
    }

    public void setSubTotal(String str) {
        this.subTotal = str;
    }

    public int getCartId() {
        return this.cartId;
    }

    public void setCartId(int i) {
        this.cartId = i;
    }

    public GoodsAttr[] getAttrIds() {
        return this.attrIds;
    }

    public String[] getActInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23af529076cb70a6ae9a6a3657c4db12", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23af529076cb70a6ae9a6a3657c4db12");
        }
        if (this.actInfoList == null || this.actInfoList.size() == 0) {
            return null;
        }
        String[] strArr = new String[this.actInfoList.size()];
        for (int i = 0; i < this.actInfoList.size(); i++) {
            strArr[i] = this.actInfoList.get(i).b;
        }
        return strArr;
    }

    public void setAttrIds(GoodsAttr[] goodsAttrArr) {
        this.attrIds = goodsAttrArr;
    }

    public double getSubTotal() {
        return this.subTotalPrice;
    }

    public void setSubTotalPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "282e610d58e696948a7b23b356224399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "282e610d58e696948a7b23b356224399");
        } else {
            this.subTotalPrice = d;
        }
    }

    public String getFoodLabelUrl() {
        return this.foodLabelUrl;
    }

    public void setFoodLabelUrl(String str) {
        this.foodLabelUrl = str;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public boolean isSameAttrs(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fafd982fb468e58cc20881e6446e40f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fafd982fb468e58cc20881e6446e40f1")).booleanValue();
        }
        if ((this.attrIds == null || this.attrIds.length == 0) && (goodsAttrArr == null || goodsAttrArr.length == 0)) {
            return true;
        }
        if (this.attrIds == null || goodsAttrArr == null) {
            return false;
        }
        return Arrays.equals(this.attrIds, goodsAttrArr);
    }

    public void setPhysicalTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76d7994f3e7ffe861bf80168d945f1b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76d7994f3e7ffe861bf80168d945f1b2");
        } else {
            this.spu.setPhysicalTag(str);
        }
    }

    public String getPhysicalTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27bdc96a4be270241934765d30eb10f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27bdc96a4be270241934765d30eb10f0") : this.spu.getPhysicalTag();
    }

    public List<OrderedFood> getComboItems() {
        return this.comboItemList;
    }

    public void setComboItemList(List<OrderedFood> list) {
        this.comboItemList = list;
    }

    public boolean isSameAttrs(List<GoodsAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4509b0065ef7ef4f26ba84a3c0cd6604", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4509b0065ef7ef4f26ba84a3c0cd6604")).booleanValue();
        }
        if ((this.attrIds == null || this.attrIds.length == 0) && (list == null || list.size() == 0)) {
            return true;
        }
        if (this.attrIds == null || list == null) {
            return false;
        }
        if (this.attrIds.length == 0 && list.size() == 0) {
            return true;
        }
        if (this.attrIds.length != list.size()) {
            return false;
        }
        for (int i = 0; i < this.attrIds.length; i++) {
            GoodsAttr goodsAttr = this.attrIds[i];
            GoodsAttr goodsAttr2 = list.get(i);
            if (goodsAttr == null) {
                if (goodsAttr2 != null) {
                    return false;
                }
            } else if (!goodsAttr.equals(goodsAttr2)) {
                return false;
            }
        }
        return true;
    }

    public void addCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bb67f6c434c96792329f9510fec8732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bb67f6c434c96792329f9510fec8732");
        } else {
            this.count += i;
        }
    }

    /* renamed from: clone */
    public OrderedFood m19clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27c4c75a1bf19177df9a01269aefeeed", RobustBitConfig.DEFAULT_VALUE) ? (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27c4c75a1bf19177df9a01269aefeeed") : (OrderedFood) w.a(this);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5b316299125c8448168221bbeb45924", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5b316299125c8448168221bbeb45924")).booleanValue();
        }
        if (obj instanceof OrderedFood) {
            return getUniqueKey().equals(((OrderedFood) obj).getUniqueKey());
        }
        return false;
    }

    public boolean isEqualSpu(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "816799b09f52574937d22918844da32f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "816799b09f52574937d22918844da32f")).booleanValue() : this.spu.id == goodsSpu.getId();
    }

    public boolean isEqualSku(GoodsSpu goodsSpu, long j) {
        Object[] objArr = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "420924fb1cb2cddbfcd6b7b0ab5bc653", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "420924fb1cb2cddbfcd6b7b0ab5bc653")).booleanValue() : isEqualSpu(goodsSpu) && this.sku.id == j;
    }

    public void parseJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59ed6e42cb5af9d764867996d35b9d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59ed6e42cb5af9d764867996d35b9d0a");
            return;
        }
        this.spu.id = jSONObject.optLong("spu_id");
        this.sku.id = jSONObject.optLong("id");
        this.spu.setName(jSONObject.optString("name"));
        this.sku.setPrice(jSONObject.optDouble("price", 0.0d));
        this.spu.setUnit(jSONObject.optString("unit"));
        this.count = jSONObject.optInt("count");
        this.sku.setOriginPrice(jSONObject.optDouble("original_price", 0.0d));
        this.subTotal = jSONObject.optString("sub_total");
        this.subTotalPrice = jSONObject.optDouble("sub_total_price");
        this.subBoxTotalPrice = jSONObject.optDouble("sub_box_total_price", 0.0d);
        this.subBoxTotalPriceDesc = jSONObject.optString("sub_box_total_price_desc");
        JSONArray optJSONArray = jSONObject.optJSONArray("product_icon_urls");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.productLabelList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.productLabelList.add(optJSONArray.optString(i));
            }
        }
        this.foodLabelUrl = jSONObject.optString("icon_url");
        if (TextUtils.isEmpty(this.foodLabelUrl)) {
            this.foodLabelUrl = jSONObject.optString("food_label_url");
        }
        this.clickUrl = jSONObject.optString("click_url");
        this.vipLabelUrl = jSONObject.optString("vip_label_url");
        this.cartId = jSONObject.optInt("cart_id");
        this.sku.setSpec(jSONObject.optString("spec"));
        this.spu.setActivityTag(jSONObject.optString("activity_tag"));
        this.spu.setPicture(jSONObject.optString("picture"));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("attrs");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            int length = optJSONArray2.length();
            this.attrIds = new GoodsAttr[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.attrIds[i2] = GoodsAttr.fromJson(optJSONArray2.getJSONObject(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("premium_attrs");
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            int length2 = optJSONArray3.length();
            GoodsAttr[] goodsAttrArr = new GoodsAttr[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject optJSONObject = optJSONArray3.optJSONObject(i3);
                if (optJSONObject != null) {
                    goodsAttrArr[i3] = GoodsAttr.fromJson(optJSONObject, true, 999);
                }
            }
            if (this.attrIds != null) {
                GoodsAttr[] goodsAttrArr2 = (GoodsAttr[]) Arrays.copyOf(this.attrIds, this.attrIds.length + goodsAttrArr.length);
                System.arraycopy(goodsAttrArr, 0, goodsAttrArr2, this.attrIds.length, goodsAttrArr.length);
                this.attrIds = goodsAttrArr2;
            } else {
                this.attrIds = goodsAttrArr;
            }
        }
        this.actInfoList = a.a(jSONObject.optJSONArray("act_info_list"));
        setActivityList(jSONObject.optString("activity_extra"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("product_usage_info");
        if (optJSONObject2 != null) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                if (this.productUsageInfo == null) {
                    this.productUsageInfo = new HashMap();
                }
                String next = keys.next();
                this.productUsageInfo.put(next, optJSONObject2.optString(next));
            }
        }
        String optString = jSONObject.optString("item_addtional_tips");
        if (!TextUtils.isEmpty(optString)) {
            updateAllowance(optString, null);
        }
        this.desc = jSONObject.optString("desc");
        this.deliveryDesc = jSONObject.optString("delivery_desc");
        this.preSaleIconUrl = jSONObject.optString("presale_icon_url");
        JSONArray optJSONArray4 = jSONObject.optJSONArray("combo_item_list");
        if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
            return;
        }
        this.comboItemList = fromJsonArray(optJSONArray4);
    }

    public GoodsSku getFoodSku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d1e635ee6c471a37698ea7858635278", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d1e635ee6c471a37698ea7858635278");
        }
        if (this.sku == null) {
            this.sku = new GoodsSku();
        }
        return this.sku;
    }

    public GoodsSpu getFoodSpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40bb76686603e89423c0302c60ed192a", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40bb76686603e89423c0302c60ed192a");
        }
        if (this.spu == null) {
            this.spu = new GoodsSpu();
        }
        return this.spu;
    }

    public static OrderedFood fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4b641a8b65100faffca675486578b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4b641a8b65100faffca675486578b81");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            OrderedFood orderedFood = new OrderedFood();
            orderedFood.parseJson(jSONObject);
            return orderedFood;
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public static List<OrderedFood> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc237c9b0685aa3d65f7ab3358e58acf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc237c9b0685aa3d65f7ab3358e58acf");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            OrderedFood fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        public String b;

        public static List<a> a(JSONArray jSONArray) {
            a aVar;
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95c99f859905a731b6376e0a2d2a1db4", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95c99f859905a731b6376e0a2d2a1db4");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Object[] objArr2 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ca34cb65ef41c1a22464dd3efa951436", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ca34cb65ef41c1a22464dd3efa951436");
                } else {
                    if (optJSONObject != null) {
                        a aVar2 = new a();
                        aVar2.b = optJSONObject.optString("act_tip");
                        if (aVar2.b != null) {
                            aVar = aVar2;
                        }
                    }
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        }
    }

    public void updateGoodSpu(GoodsSpu goodsSpu) {
        List<GoodsSku> skuList;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b89b425faa3c3987be5a71ba3bf0918b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b89b425faa3c3987be5a71ba3bf0918b");
        } else if (goodsSpu != null && (skuList = goodsSpu.getSkuList()) != null) {
            for (GoodsSku goodsSku : skuList) {
                if (getSkuId() == goodsSku.getSkuId()) {
                    goodsSku.checkStatus = this.sku.checkStatus;
                    this.sku = goodsSku;
                    this.spu = goodsSpu;
                    setPrice(goodsSku.getSkuPrice());
                    setBoxPrice(goodsSku.getBoxPrice());
                    setBoxNum(goodsSku.getBoxNum());
                    setMinCount(goodsSku.getMinOrderCount());
                    setOriginPrice(goodsSku.getOriginPrice());
                    setStock(goodsSku.getStock());
                    setRestrictNum(goodsSku.getRestrictNum());
                    setActivityTag(goodsSpu.getActivityTag());
                    int stock = goodsSku.getStock();
                    int count = getCount();
                    if (stock <= 0 || stock >= count) {
                        return;
                    }
                    setCount(stock);
                    return;
                }
            }
        }
    }

    public void updateGood(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c96b570b30adc8ec20925d620d37932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c96b570b30adc8ec20925d620d37932");
        } else if (orderedFood != null && getSkuId() == orderedFood.getSkuId()) {
            setActivityTag(orderedFood.getActivityTag());
        }
    }

    public Product convert2Product() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d6f5d51bfc37789962a7e29cf98e26", RobustBitConfig.DEFAULT_VALUE)) {
            return (Product) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d6f5d51bfc37789962a7e29cf98e26");
        }
        Product product = new Product();
        product.setSkuId(getSkuId());
        product.setSpuId(getSpuId());
        product.setPackageId(getCartId());
        product.setCount(getCount());
        GoodsAttr[] attrIds = getAttrIds();
        Object[] objArr2 = {attrIds};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.utils.b.a;
        ArrayList<GoodsAttr> arrayList = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "f30986828ccb5d6a97f02e4395ab4da0", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "f30986828ccb5d6a97f02e4395ab4da0");
        } else if (!com.sankuai.waimai.foundation.utils.b.a(attrIds)) {
            ArrayList<GoodsAttr> arrayList2 = new ArrayList<>();
            for (GoodsAttr goodsAttr : attrIds) {
                if (goodsAttr != null) {
                    arrayList2.add(goodsAttr);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        product.setAttrs(arrayList);
        return product;
    }

    public int getBuyType() {
        return this.mBuyType;
    }

    public void setBuyType(int i) {
        this.mBuyType = i;
    }

    public void setActivityList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9c6e0742b22d76d04ad5448236f24cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9c6e0742b22d76d04ad5448236f24cc");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray(PushConstants.INTENT_ACTIVITY_NAME);
                this.activityList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        this.activityList.add(com.sankuai.waimai.platform.domain.core.shop.a.a(optString));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "854c2414c19d24ff7723b2521fb7ea5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "854c2414c19d24ff7723b2521fb7ea5d");
        }
        return "name: " + getName() + " spu: " + getSpuId() + " sku: " + getSkuId() + " count: " + this.count;
    }

    public void setCheckStatus(int i) {
        if (this.sku != null) {
            this.sku.checkStatus = i;
        }
    }

    public OrderedFood deepCopy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdcf4b33086d29a614371478051f37fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdcf4b33086d29a614371478051f37fb");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return (OrderedFood) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public OrderedFood fromGlobalCart(com.sankuai.waimai.platform.domain.core.order.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57cc49ce66572308f36bd0522cb4dd8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57cc49ce66572308f36bd0522cb4dd8d");
        }
        setSpuId(aVar.b);
        setSkuId(aVar.c);
        setName(aVar.d);
        setCount(aVar.e);
        setStock(aVar.e);
        setReason(aVar.f);
        setPicture(aVar.g);
        setAttrs(aVar.l, aVar.m);
        this.ignoreAttrs = aVar.h;
        return this;
    }

    public static List<OrderedFood> fromOrderAgain(JSONArray jSONArray) {
        int i;
        int i2;
        ArrayList arrayList;
        ActivityPolicy activityPolicy;
        int i3;
        JSONObject optJSONObject;
        JSONArray jSONArray2 = jSONArray;
        Object[] objArr = {jSONArray2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "968551954f085e844d00ffeec25744b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "968551954f085e844d00ffeec25744b5");
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (i4 < jSONArray.length()) {
            JSONObject optJSONObject2 = jSONArray2.optJSONObject(i4);
            long optLong = optJSONObject2.optLong("id");
            String optString = optJSONObject2.optString("name");
            String optString2 = optJSONObject2.optString("tag");
            double optDouble = optJSONObject2.optDouble("min_price", 0.0d);
            String optString3 = optJSONObject2.optString("unit");
            int optInt = optJSONObject2.optInt("status");
            int optInt2 = optJSONObject2.optInt("activity_type");
            String optString4 = optJSONObject2.optString("activity_tag");
            ActivityPolicy activityPolicy2 = new ActivityPolicy();
            activityPolicy2.parseJson(optJSONObject2.optJSONObject("activity_policy"));
            JSONArray optJSONArray = optJSONObject2.optJSONArray("skus");
            if (optJSONArray != null) {
                i = i4;
                i2 = optJSONArray.length();
            } else {
                i = i4;
                i2 = 0;
            }
            ArrayList arrayList3 = arrayList2;
            int optInt3 = optJSONObject2.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, -1);
            int optInt4 = optJSONObject2.optInt("combo_type", 0);
            if (i2 == 0) {
                OrderedFood orderedFood = new OrderedFood();
                orderedFood.setCartId(0);
                orderedFood.setMode(optInt3);
                orderedFood.spu.setActivityType(optInt2);
                orderedFood.spu.id = optLong;
                orderedFood.spu.setName(optString);
                orderedFood.spu.setMinPrice(optDouble);
                orderedFood.spu.setUnit(optString3);
                orderedFood.spu.setStatus(optInt);
                orderedFood.spu.setActivityTag(optString4);
                orderedFood.spu.setTag(optString2);
                orderedFood.spu.setPhysicalTag(optString2);
                orderedFood.spu.setActivityPolicy(activityPolicy2);
                if (optJSONArray != null && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                    orderedFood.sku.parseJson(optJSONObject);
                    orderedFood.setCount(optJSONObject.optInt("count"));
                    orderedFood.setCartId(optJSONObject.optInt("card_id"));
                }
                List<GoodsSku> skuList = orderedFood.spu.getSkuList();
                if (skuList == null) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(orderedFood.sku);
                    orderedFood.spu.setSkuList(arrayList4);
                } else if (skuList.isEmpty()) {
                    skuList.add(orderedFood.sku);
                }
                arrayList3.add(orderedFood);
                arrayList = arrayList3;
            } else {
                JSONArray jSONArray3 = optJSONArray;
                ArrayList arrayList5 = arrayList3;
                int i5 = 0;
                while (i5 < i2) {
                    int i6 = i2;
                    OrderedFood orderedFood2 = new OrderedFood();
                    int i7 = optInt4;
                    JSONObject optJSONObject3 = jSONArray3.optJSONObject(i5);
                    JSONArray jSONArray4 = jSONArray3;
                    orderedFood2.setFoodLabelUrl(optJSONObject3.optString("picture"));
                    orderedFood2.setCount(optJSONObject3.optInt("count"));
                    orderedFood2.setMode(optInt3);
                    orderedFood2.setCartId(optJSONObject3.optInt("card_id"));
                    JSONArray optJSONArray2 = optJSONObject3.optJSONArray("attrs");
                    int i8 = optInt3;
                    ArrayList arrayList6 = new ArrayList();
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        activityPolicy = activityPolicy2;
                        i3 = i5;
                    } else {
                        i3 = i5;
                        int length = optJSONArray2.length();
                        activityPolicy = activityPolicy2;
                        int i9 = 0;
                        while (i9 < length) {
                            arrayList6.add(GoodsAttr.fromJson(optJSONArray2.optJSONObject(i9)));
                            i9++;
                            optJSONArray2 = optJSONArray2;
                        }
                    }
                    JSONArray optJSONArray3 = optJSONObject3.optJSONArray("premium_attrs");
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        int length2 = optJSONArray3.length();
                        int i10 = 0;
                        while (i10 < length2) {
                            arrayList6.add(GoodsAttr.fromJson(optJSONArray3.optJSONObject(i10), true, 999));
                            i10++;
                            length2 = length2;
                            optJSONArray3 = optJSONArray3;
                            optString4 = optString4;
                        }
                    }
                    String str = optString4;
                    GoodsAttr[] goodsAttrArr = (GoodsAttr[]) arrayList6.toArray(new GoodsAttr[0]);
                    JSONArray optJSONArray4 = optJSONObject3.optJSONArray("combo_products");
                    if (optJSONArray4 != null) {
                        orderedFood2.setComboItemList(fromOrderAgain(optJSONArray4));
                    }
                    String str2 = optString3;
                    long optLong2 = optJSONObject3.optLong("group_id");
                    orderedFood2.setAttrIds(goodsAttrArr);
                    orderedFood2.spu.setActivityType(optInt2);
                    orderedFood2.spu.setTag(optString2);
                    orderedFood2.spu.setPhysicalTag(optString2);
                    orderedFood2.spu.id = optLong;
                    orderedFood2.spu.setName(optString);
                    orderedFood2.spu.setMinPrice(optDouble);
                    orderedFood2.spu.setUnit(str2);
                    orderedFood2.spu.setStatus(optInt);
                    optString4 = str;
                    orderedFood2.spu.setActivityTag(optString4);
                    ActivityPolicy activityPolicy3 = activityPolicy;
                    orderedFood2.spu.setActivityPolicy(activityPolicy3);
                    orderedFood2.setProductType(i7 == 1 ? 4 : i7);
                    orderedFood2.setGroupId(optLong2);
                    if (optJSONObject3 != null) {
                        orderedFood2.sku.parseJson(optJSONObject3);
                    }
                    List<GoodsSku> skuList2 = orderedFood2.spu.getSkuList();
                    if (skuList2 == null) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(orderedFood2.sku);
                        orderedFood2.spu.setSkuList(arrayList7);
                    } else if (skuList2.isEmpty()) {
                        skuList2.add(orderedFood2.sku);
                    }
                    ArrayList arrayList8 = arrayList5;
                    arrayList8.add(orderedFood2);
                    i5 = i3 + 1;
                    arrayList5 = arrayList8;
                    optInt4 = i7;
                    optString3 = str2;
                    i2 = i6;
                    jSONArray3 = jSONArray4;
                    optInt3 = i8;
                    activityPolicy2 = activityPolicy3;
                }
                arrayList = arrayList5;
            }
            i4 = i + 1;
            arrayList2 = arrayList;
            jSONArray2 = jSONArray;
        }
        return arrayList2;
    }

    public String getSubBoxPriceDesc() {
        return this.subBoxPriceDesc;
    }

    public void setSubBoxPriceDesc(String str) {
        this.subBoxPriceDesc = str;
    }

    public String getSubBoxPrice() {
        return this.subBoxPrice;
    }

    public void setSubBoxPrice(String str) {
        this.subBoxPrice = str;
    }

    public int getSpuCategory() {
        return this.spu.spuCategory;
    }

    public void updateAllowance(String str, String str2) {
        JSONObject optJSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e94a83f20fa50aa347df599dea15a56a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e94a83f20fa50aa347df599dea15a56a");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                this.allowanceTip = new JSONObject(str).optString("allowanceTip");
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        try {
            if (TextUtils.isEmpty(str2) || (optJSONObject = new JSONObject(str2).optJSONObject("allowanceDisountFoodMaiDian")) == null) {
                return;
            }
            this.adDataInfo = optJSONObject.optString("adDataInfo");
            this.isZhiNengZheKou = optJSONObject.optBoolean("zhiNengZheKou") ? 1 : 0;
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
    }

    public String getUniqueKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62920b159b1f20e7ac5c056406ab72ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62920b159b1f20e7ac5c056406ab72ec");
        }
        if (TextUtils.isEmpty(this.uniqueKey)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getFoodSpu().id);
            sb.append(getFoodSku().id);
            if (!this.ignoreAttrs) {
                GoodsAttr[] attrIds = getAttrIds();
                if (!com.sankuai.waimai.foundation.utils.b.a(attrIds)) {
                    for (GoodsAttr goodsAttr : attrIds) {
                        if (goodsAttr != null) {
                            sb.append(goodsAttr.id);
                            sb.append(goodsAttr.count);
                        }
                    }
                }
            }
            sb.append(this.groupId);
            if (!com.sankuai.waimai.foundation.utils.b.b(getComboItems())) {
                ArrayList arrayList = new ArrayList(getComboItems());
                Collections.sort(arrayList, new Comparator<OrderedFood>() { // from class: com.sankuai.waimai.platform.domain.core.order.OrderedFood.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(OrderedFood orderedFood, OrderedFood orderedFood2) {
                        OrderedFood orderedFood3 = orderedFood;
                        OrderedFood orderedFood4 = orderedFood2;
                        Object[] objArr2 = {orderedFood3, orderedFood4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "07e5707aff83314824324abc66504341", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "07e5707aff83314824324abc66504341")).intValue() : orderedFood3.getUniqueKey().hashCode() - orderedFood4.getUniqueKey().hashCode();
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OrderedFood orderedFood = (OrderedFood) it.next();
                    sb.append(orderedFood.getUniqueKey());
                    sb.append(orderedFood.getCount());
                }
            }
            this.uniqueKey = sb.toString();
        }
        return this.uniqueKey;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "876fe4ee1c38e9384f2e262f55b4c88a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "876fe4ee1c38e9384f2e262f55b4c88a");
        } else {
            this.groupId = j;
        }
    }

    public String getFoodDesc() {
        return this.foodDesc;
    }

    public void setFoodDesc(String str) {
        this.foodDesc = str;
    }

    public String getCartPoiPicUrl() {
        return this.cartPoiPicUrl;
    }

    public void setCartPoiPicUrl(String str) {
        this.cartPoiPicUrl = str;
    }

    public int getProductType() {
        return this.productType;
    }

    public void setProductType(int i) {
        this.productType = i;
    }

    public int getItemIndex() {
        return this.itemIndex;
    }

    public void setItemIndex(int i) {
        this.itemIndex = i;
    }
}
