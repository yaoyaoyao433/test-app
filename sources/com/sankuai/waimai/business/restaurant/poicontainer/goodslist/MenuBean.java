package com.sankuai.waimai.business.restaurant.poicontainer.goodslist;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.BoughtPoiCategory;
import com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory;
import com.sankuai.waimai.business.restaurant.base.repository.model.OperationPoiCategory;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.k;
import com.sankuai.waimai.business.restaurant.poicontainer.json.c;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import com.sankuai.waimai.platform.domain.core.shop.b;
import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MenuBean implements k {
    public static ChangeQuickRedirect a;
    @SerializedName("container_template")
    public RestMenuResponse.PoiContainer b;
    public RestMenuResponse c;
    @SerializedName("function_control")
    public b d;
    private boolean e;
    private long f;
    private g g;

    public MenuBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b0b345a13ecc3eca3da8ab1b36e495", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b0b345a13ecc3eca3da8ab1b36e495");
            return;
        }
        this.c = new RestMenuResponse();
        this.e = false;
        this.f = -1L;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public String getPoiIdStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914bf27ce2caba4c79744e00fb92a1ef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914bf27ce2caba4c79744e00fb92a1ef") : this.g != null ? this.g.f() : "";
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public OperationPoiCategory getOperationPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b957c4a4ab4ef42aca6bb5367de76071", RobustBitConfig.DEFAULT_VALUE) ? (OperationPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b957c4a4ab4ef42aca6bb5367de76071") : this.c.getOperationPoiCategory();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public BoughtPoiCategory getBoughtPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382d3073ecf5d82483d654d62d3d33ec", RobustBitConfig.DEFAULT_VALUE) ? (BoughtPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382d3073ecf5d82483d654d62d3d33ec") : this.c.getBoughtPoiCategory();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public List<GoodsPoiCategory> getGoodsPoiCategories() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f47086e66c8a7781c025aa198424bc0b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f47086e66c8a7781c025aa198424bc0b") : this.c.getGoodsPoiCategories();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public PoiCategory getSelectPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47de5ef49c19d73edf03a1d6fc0e1e01", RobustBitConfig.DEFAULT_VALUE) ? (PoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47de5ef49c19d73edf03a1d6fc0e1e01") : this.c.getSelectPoiCategory();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public int getTemplateType() {
        return this.b.code;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public void setChosenSpu(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d9c1a102f8ad42913a54a610ec7212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d9c1a102f8ad42913a54a610ec7212");
            return;
        }
        this.f = j;
        this.e = z;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public long getChosenSpuId() {
        return this.f;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public boolean getChosenSpuNeedAdd() {
        return this.e;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public boolean hasVolumeBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effbff29f050eb02f552852866b72a63", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effbff29f050eb02f552852866b72a63")).booleanValue() : this.c.hasVolumeBoard();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public int getCategoryShowType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc0498dbda477e289fee5010507d997", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc0498dbda477e289fee5010507d997")).intValue() : this.c.getCategoryShowType();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<MenuBean> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public MenuBean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd37759ce8f47578074939b362b7192f", RobustBitConfig.DEFAULT_VALUE)) {
                return (MenuBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd37759ce8f47578074939b362b7192f");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    MenuBean menuBean = new MenuBean();
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    menuBean.c = RestMenuResponse.fromJson(new c((JsonObject) jsonElement));
                    menuBean.b = (RestMenuResponse.PoiContainer) new Gson().fromJson(asJsonObject.remove("container_template"), (Class<Object>) RestMenuResponse.PoiContainer.class);
                    menuBean.d = (b) new Gson().fromJson(asJsonObject.remove("function_control"), (Class<Object>) b.class);
                    return menuBean;
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
