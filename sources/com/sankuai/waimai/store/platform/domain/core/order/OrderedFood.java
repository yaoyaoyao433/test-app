package com.sankuai.waimai.store.platform.domain.core.order;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.s;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderedFood implements Serializable {
    public static final int BUY_TYPE_COMMON = 0;
    public static final int BUY_TYPE_PLUS = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<com.sankuai.waimai.platform.domain.core.shop.a> activityList;
    private GoodsAttr[] attrIds;
    private int cartId;
    public int count;
    public int countDiscountNum;
    private String foodLabelUrl;
    public boolean ignoreAttrs;
    public boolean isRemoveAll;
    public List<Long> itemCollectionRelations;
    private int mBuyType;
    public int plusCount;
    public double poiMemberPrice;
    private List<String> productIcons;
    public b.C1264b shopCartKanoLabel;
    public boolean showPoiMember;
    public GoodsSku sku;
    public GoodsSpu spu;
    private String subTotal;
    private double subTotalOriginalPrice;
    private double subTotalPrice;

    public void setProductIcons(List<String> list) {
        this.productIcons = list;
    }

    public List<String> getProductIcons() {
        return this.productIcons;
    }

    public boolean isShowPoiMember() {
        return this.showPoiMember;
    }

    public void setShowPoiMember(boolean z) {
        this.showPoiMember = z;
    }

    public double getPoiMemberPrice() {
        return this.poiMemberPrice;
    }

    public void setPoiMemberPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d840478e55511c9ee8c583434444452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d840478e55511c9ee8c583434444452");
        } else {
            this.poiMemberPrice = d;
        }
    }

    public OrderedFood() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7217db75b3dafe0c3ea7ae8580016be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7217db75b3dafe0c3ea7ae8580016be");
            return;
        }
        this.itemCollectionRelations = new ArrayList();
        this.countDiscountNum = 0;
        this.mBuyType = 0;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5aa4f79e1a46be81e78caecb3b1f1b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5aa4f79e1a46be81e78caecb3b1f1b2");
            return;
        }
        this.itemCollectionRelations = new ArrayList();
        this.countDiscountNum = 0;
        this.mBuyType = 0;
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

    public void setDescription(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b9923e1d899d83dda1374aa8706d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b9923e1d899d83dda1374aa8706d43");
        } else {
            this.sku.setDescription(str);
        }
    }

    public int getStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b63ddbd4a3e4cb486ea9176266b0a950", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b63ddbd4a3e4cb486ea9176266b0a950")).intValue() : this.spu.getStatus();
    }

    public void setStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bb55bd476d7c875bc9861143dc2c6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bb55bd476d7c875bc9861143dc2c6d0");
        } else {
            this.spu.setStatus(i);
        }
    }

    public void setMinPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac755d2bfea8b45d68c8cc9f883da609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac755d2bfea8b45d68c8cc9f883da609");
        } else {
            this.spu.setMinPrice(d);
        }
    }

    public int getStock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86634317e8c32569addc6b4b36b26dca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86634317e8c32569addc6b4b36b26dca")).intValue() : this.sku.getStock();
    }

    public void setStock(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d84e9435a36e0cc881b105dabb552f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d84e9435a36e0cc881b105dabb552f2");
        } else {
            this.sku.setStock(i);
        }
    }

    public int getRestrictNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7609ac2083f618d052129391f02c9ec7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7609ac2083f618d052129391f02c9ec7")).intValue() : this.sku.getRestrictNum();
    }

    public void setRestrictNum(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87dbc9f904c4a22e16e462d8caa408d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87dbc9f904c4a22e16e462d8caa408d3");
        } else {
            this.sku.setRestrict(i);
        }
    }

    public String getActivityTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f9cb67e668b8508a64615b1c4889158", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f9cb67e668b8508a64615b1c4889158") : this.spu.getActivityTag();
    }

    public void setActivityTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a014471c786e29fa176ef18192be7583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a014471c786e29fa176ef18192be7583");
        } else {
            this.spu.setActivityTag(str);
        }
    }

    public String getTagCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d01804056322e82edc90c0b251bf768b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d01804056322e82edc90c0b251bf768b") : this.spu.getTag();
    }

    public void setTagCode(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1709326f6741bdd236e9d8e8bb63e786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1709326f6741bdd236e9d8e8bb63e786");
        } else {
            this.spu.setTag(str);
        }
    }

    public String getSpec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "162d80c89357c04e341eb570e183bcf5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "162d80c89357c04e341eb570e183bcf5") : this.sku.getSpec();
    }

    public void setSpec(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d680913eef9274e41a4bda215d51beae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d680913eef9274e41a4bda215d51beae");
        } else {
            this.sku.setSpec(str);
        }
    }

    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "799a3d686046cd2c63072c7375a88fac", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "799a3d686046cd2c63072c7375a88fac") : this.spu.getName();
    }

    public void setName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e1ecd467374cc67ba02a292ecb6378b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e1ecd467374cc67ba02a292ecb6378b");
        } else {
            this.spu.setName(str);
        }
    }

    public double getPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86a71a784aef7530856f4cddb2a79ffb", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86a71a784aef7530856f4cddb2a79ffb")).doubleValue() : this.sku.getSkuPrice();
    }

    public void setPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "821af743879e76c8963d7c86e4a793ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "821af743879e76c8963d7c86e4a793ca");
        } else {
            this.sku.setPrice(d);
        }
    }

    public long getSpuId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "355cd690ab400c6475abbb92d8f76503", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "355cd690ab400c6475abbb92d8f76503")).longValue() : this.spu.getId();
    }

    public void setSpuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7a72613ad00a8a5cbd0f49722831837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7a72613ad00a8a5cbd0f49722831837");
        } else {
            this.spu.id = j;
        }
    }

    public long getSkuId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e8e8da5df4f7fb949ff435170609eaf", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e8e8da5df4f7fb949ff435170609eaf")).longValue() : this.sku.getSkuId();
    }

    public void setSkuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "604083c69adcc3cb43be24ae95981868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "604083c69adcc3cb43be24ae95981868");
        } else {
            this.sku.id = j;
        }
    }

    public double getOriginPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5104ee6b4983dec0cac6b8a46145c67", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5104ee6b4983dec0cac6b8a46145c67")).doubleValue() : this.sku.getOriginPrice();
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2629e27b72c95b7eff1e7d15a17a6aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2629e27b72c95b7eff1e7d15a17a6aae");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f7d76827bad52cc302e0c0b0ab15bf6", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f7d76827bad52cc302e0c0b0ab15bf6")).doubleValue() : this.sku.getBoxNum();
    }

    public void setBoxNum(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8314b55eaafba2c5a6c91048471b8e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8314b55eaafba2c5a6c91048471b8e4");
        } else {
            this.sku.setBoxNum(d);
        }
    }

    public double getBoxPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6d3c362a6bc216fd7b3e9d4cf4644fe", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6d3c362a6bc216fd7b3e9d4cf4644fe")).doubleValue() : this.sku.getBoxPrice();
    }

    public void setBoxPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f3b53869aa8b41d000f8c8027930af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f3b53869aa8b41d000f8c8027930af2");
        } else {
            this.sku.setBoxPrice(d);
        }
    }

    public int getMinCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6232148fee2230a02ff9648fa3b04d03", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6232148fee2230a02ff9648fa3b04d03")).intValue() : this.sku.getMinOrderCount();
    }

    public void setMinCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a226fd8253a3087a6bc338d2b25ab7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a226fd8253a3087a6bc338d2b25ab7f1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4be6fdbe6e51358c4b6fcbe91e03558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4be6fdbe6e51358c4b6fcbe91e03558");
        } else {
            this.subTotalOriginalPrice = d;
        }
    }

    public List<Long> getItemCollectionRelations() {
        return this.itemCollectionRelations;
    }

    public void setItemCollectionRelations(List<Long> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8a295e889ef469073059e3fdf92f301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8a295e889ef469073059e3fdf92f301");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.itemCollectionRelations.clear();
            this.itemCollectionRelations.addAll(list);
        }
    }

    public String getSubTotalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb2856562fc4390f1b5605ebe27245c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb2856562fc4390f1b5605ebe27245c9");
        }
        if (!TextUtils.isEmpty(this.subTotal)) {
            return this.subTotal;
        }
        return i.a(this.subTotalPrice);
    }

    public String getSubOriginalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae0318eb3b0f34bacf9b169da510bb36", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae0318eb3b0f34bacf9b169da510bb36") : i.a(this.subTotalOriginalPrice);
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

    public void setAttrIds(GoodsAttr[] goodsAttrArr) {
        this.attrIds = goodsAttrArr;
    }

    public double getSubTotal() {
        return this.subTotalPrice;
    }

    public void setSubTotalPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5aa00576fbf648aeba14d51f41f59da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5aa00576fbf648aeba14d51f41f59da");
        } else {
            this.subTotalPrice = d;
        }
    }

    public void setFoodLabelUrl(String str) {
        this.foodLabelUrl = str;
    }

    public boolean isSameAttrs(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b141b2d46597c351b2a582275d42adf4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b141b2d46597c351b2a582275d42adf4")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.attrIds) && com.sankuai.shangou.stone.util.a.b(goodsAttrArr)) {
            return true;
        }
        if (this.attrIds == null || goodsAttrArr == null) {
            return false;
        }
        return Arrays.equals(this.attrIds, goodsAttrArr);
    }

    public void setCheckStatus(int i) {
        if (this.sku != null) {
            this.sku.checkStatus = i;
        }
    }

    public void setPhysicalTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d865c808b21dbab2d67e5fd2f834fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d865c808b21dbab2d67e5fd2f834fe");
        } else {
            this.spu.setPhysicalTag(str);
        }
    }

    public void addCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "693ed8e8b3d963e96554c49eba27ce84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "693ed8e8b3d963e96554c49eba27ce84");
        } else {
            this.count += i;
        }
    }

    /* renamed from: clone */
    public OrderedFood m22clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71843ceac4efc8ca4b640ae69ea0dfa6", RobustBitConfig.DEFAULT_VALUE) ? (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71843ceac4efc8ca4b640ae69ea0dfa6") : (OrderedFood) s.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.platform.domain.core.order.OrderedFood.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68138c648a3b301b3b7730a11f827e9b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68138c648a3b301b3b7730a11f827e9b")).intValue() : (int) (this.spu.id ^ (this.spu.id >>> 32));
    }

    private boolean isEqualSpu(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fda66210335724ed30b9503f3707eb4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fda66210335724ed30b9503f3707eb4")).booleanValue() : this.spu.id == goodsSpu.getId();
    }

    public boolean isEqualSku(GoodsSpu goodsSpu, long j) {
        Object[] objArr = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc6bc2174405c9b8864d6b2212ac17df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc6bc2174405c9b8864d6b2212ac17df")).booleanValue() : isEqualSpu(goodsSpu) && this.sku.id == j;
    }

    public void updateGoodSpu(GoodsSpu goodsSpu) {
        List<GoodsSku> skuList;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9411278f51f1c858e8c76c61e26d60bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9411278f51f1c858e8c76c61e26d60bc");
        } else if (goodsSpu != null && (skuList = goodsSpu.getSkuList()) != null) {
            for (GoodsSku goodsSku : skuList) {
                if (getSkuId() == goodsSku.getSkuId()) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7fef0fb11f2a3db96b5eef266426141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7fef0fb11f2a3db96b5eef266426141");
        } else if (orderedFood != null && getSkuId() == orderedFood.getSkuId()) {
            setActivityTag(orderedFood.getActivityTag());
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5583d2529d28e78a9ade749b04bc90a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5583d2529d28e78a9ade749b04bc90a1");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray(PushConstants.INTENT_ACTIVITY_NAME);
                this.activityList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        com.sankuai.waimai.platform.domain.core.shop.a a = com.sankuai.waimai.platform.domain.core.shop.a.a(optString);
                        this.activityList.add(a);
                        if (a != null && "plus_discount".equals(a.b)) {
                            this.plusCount = a.c;
                        }
                    }
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public List<OrderedFood> getOrderedList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76e962e834c2c1da0f089e72709cd85c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76e962e834c2c1da0f089e72709cd85c");
        }
        ArrayList arrayList = new ArrayList();
        setBuyType(0);
        if (!com.sankuai.shangou.stone.util.a.b(this.activityList)) {
            for (int i = 0; i < this.activityList.size(); i++) {
                com.sankuai.waimai.platform.domain.core.shop.a aVar = this.activityList.get(i);
                if ("plus_discount".equals(aVar.b)) {
                    if (aVar.c == this.count) {
                        setBuyType(1);
                        arrayList.add(this);
                    } else {
                        OrderedFood m22clone = m22clone();
                        m22clone.count = aVar.c;
                        m22clone.setBuyType(1);
                        this.count -= aVar.c;
                        arrayList.add(m22clone);
                        arrayList.add(this);
                    }
                }
            }
        } else {
            arrayList.add(this);
        }
        return arrayList;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17743c0515a1afcc6754c63b7df05606", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17743c0515a1afcc6754c63b7df05606");
        }
        return "name: " + getName() + " spu: " + getSpuId() + " sku: " + getSkuId() + " count: " + this.count;
    }

    public OrderedFood deepCopy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17a85c1374e0a8c1eca0d8cb130cd226", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17a85c1374e0a8c1eca0d8cb130cd226");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return (OrderedFood) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (IOException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        } catch (ClassNotFoundException e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
            return null;
        }
    }

    public OrderedFood fromGlobalCart(CartProduct cartProduct) {
        Object[] objArr = {cartProduct};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45667fe7cea34c2f31778d78fde17820", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45667fe7cea34c2f31778d78fde17820");
        }
        setSpuId(cartProduct.spuId);
        setSkuId(cartProduct.skuId);
        setPhysicalTag(cartProduct.tag);
        setCount(cartProduct.count);
        if (cartProduct.attrs != null && cartProduct.attrs.size() > 0) {
            GoodsAttr[] goodsAttrArr = new GoodsAttr[cartProduct.attrs.size()];
            for (int i = 0; i < cartProduct.attrs.size(); i++) {
                GoodsAttr goodsAttr = new GoodsAttr();
                goodsAttr.id = cartProduct.attrs.get(i).longValue();
                goodsAttrArr[i] = goodsAttr;
            }
            setAttrIds(goodsAttrArr);
        }
        return this;
    }

    public OrderedFood fromGlobalCart(com.sankuai.waimai.platform.domain.core.order.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922fa05b340d66695764a1464ee1c06c", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922fa05b340d66695764a1464ee1c06c");
        }
        setSpuId(aVar.b);
        setSkuId(aVar.c);
        setName(aVar.d);
        setCount(aVar.e);
        setStock(aVar.e);
        this.ignoreAttrs = aVar.h;
        return this;
    }

    public CartProduct convert2CartProduct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dfa5645a1d1ae8ee8dfac896e3d1e91", RobustBitConfig.DEFAULT_VALUE)) {
            return (CartProduct) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dfa5645a1d1ae8ee8dfac896e3d1e91");
        }
        CartProduct cartProduct = new CartProduct();
        cartProduct.skuId = getSkuId();
        cartProduct.spuId = getSpuId();
        cartProduct.count = getCount();
        cartProduct.checkStatus = this.sku.checkStatus;
        GoodsAttr[] attrIds = getAttrIds();
        ArrayList arrayList = new ArrayList();
        if (attrIds != null && attrIds.length > 0) {
            for (GoodsAttr goodsAttr : attrIds) {
                if (goodsAttr != null) {
                    arrayList.add(Long.valueOf(goodsAttr.id));
                }
            }
        }
        cartProduct.attrs = arrayList;
        return cartProduct;
    }

    public OrderedFood fromGlobalCart(GlobalCart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "024f47a77918e4ff96face9f74890c07", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "024f47a77918e4ff96face9f74890c07");
        }
        setCount(gVar.g);
        setFoodLabelUrl(gVar.f);
        if (gVar.l != null) {
            GoodsAttr[] goodsAttrArr = new GoodsAttr[gVar.l.size()];
            for (int i = 0; i < gVar.l.size(); i++) {
                goodsAttrArr[i] = gVar.l.get(i);
            }
            setAttrIds(goodsAttrArr);
        }
        this.spu.setActivityTag(gVar.u);
        this.spu.setActivityType(gVar.x);
        this.spu.setPhysicalTag(gVar.s);
        this.spu.picture = gVar.f;
        this.spu.id = gVar.c;
        this.spu.setName(gVar.e);
        this.spu.setActivityPolicy(gVar.y);
        this.sku.id = gVar.d;
        this.sku.spec = gVar.o;
        this.sku.picture = gVar.f;
        this.sku.description = gVar.k;
        this.sku.price = gVar.m;
        this.sku.originPrice = gVar.n;
        this.sku.boxNum = gVar.p;
        this.sku.boxPrice = gVar.q;
        this.sku.minOrderCount = gVar.r;
        this.sku.realStock = gVar.w;
        this.sku.restrict = gVar.t;
        this.sku.activityStock = gVar.v;
        this.sku.status = 0;
        this.spu.activityTagId = gVar.C;
        this.sku.checkStatus = gVar.j != null ? gVar.j.c : 0;
        setActivityList(gVar.E);
        List<GoodsSku> skuList = this.spu.getSkuList();
        if (skuList == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.sku);
            this.spu.setSkuList(arrayList);
        } else if (skuList.isEmpty()) {
            skuList.add(this.sku);
        }
        if (gVar.j != null) {
            this.spu.setStatus(gVar.j.a);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.sankuai.waimai.store.platform.domain.core.order.OrderedFood> fromOrderAgain(org.json.JSONArray r28) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.platform.domain.core.order.OrderedFood.fromOrderAgain(org.json.JSONArray):java.util.List");
    }
}
