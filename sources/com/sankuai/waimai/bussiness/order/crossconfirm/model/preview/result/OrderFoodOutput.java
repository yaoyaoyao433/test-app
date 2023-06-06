package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.tencent.connect.common.Constants;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderFoodOutput implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("act_info_list")
    public List<FoodActInfo> actInfoList;
    @SerializedName("activity_extra")
    public String activityExtra;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("premium_attrs")
    public List<GoodsAttr> addPriceAttrs;
    @SerializedName("attrs")
    public List<OrderFoodOutputAttr> attrs;
    @SerializedName("box_price")
    public double boxPrice;
    @SerializedName("box_price_desc")
    public String boxPriceDesc;
    @SerializedName("cart_id")
    public int cartId;
    @SerializedName("combo_type")
    public int comboType;
    @SerializedName("count")
    public int count;
    @SerializedName("desc")
    public String desc;
    @SerializedName("description_tip")
    public String descriptionTip;
    @SerializedName("each_nper_count")
    public int eachNperCount;
    @SerializedName("food_label_url")
    public String foodLabelUrl;
    public String groupChatShare;
    @SerializedName("id")
    public long id;
    @SerializedName("rx_flag")
    public boolean isRxFlag;
    @SerializedName("item_addtional_tips")
    public String itemAddtionalTips;
    @SerializedName("combo_products")
    public List<ComboProduct> mComboProduct;
    @SerializedName("maidian")
    public String maidian;
    @SerializedName("name")
    public String name;
    @SerializedName("original_box_num")
    public double originalBoxNum;
    @SerializedName("original_box_price")
    public double originalBoxPrice;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName(Constants.PACKAGE_ID)
    public int packageId;
    @SerializedName("picture")
    public String picture;
    @SerializedName("price")
    public double price;
    @SerializedName("product_extra_info")
    public String productExtraInfo;
    @SerializedName("product_icon_urls")
    public List<String> productLabelList;
    @SerializedName("spot_price")
    public a productSpotPrice;
    @SerializedName("sfc")
    public String sfc;
    @SerializedName("spec")
    public String spec;
    @SerializedName("spu_id")
    public long spuId;
    @SerializedName("sub_box_total_price")
    public double subBoxTotalPrice;
    @SerializedName("sub_box_total_price_desc")
    public String subBoxTotalPriceDesc;
    @SerializedName("sub_total_price")
    public double subTotalPrice;
    @SerializedName("unit")
    public String unit;
    @SerializedName("vip_label_url")
    public String vipLabelUrl;

    public int getSeckill() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc081e94c76751261976fba519e30fd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc081e94c76751261976fba519e30fd2")).intValue();
        }
        if (TextUtils.isEmpty(this.activityExtra)) {
            return 0;
        }
        try {
            return new JSONObject(this.activityExtra).optInt("seckill");
        } catch (Exception unused) {
            return 0;
        }
    }
}
