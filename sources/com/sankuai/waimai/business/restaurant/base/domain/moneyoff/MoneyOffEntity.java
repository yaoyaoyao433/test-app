package com.sankuai.waimai.business.restaurant.base.domain.moneyoff;

import android.support.annotation.Keep;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MoneyOffEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("assistant_icon")
    public String assistantIcon;
    @SerializedName("assistant_msg")
    public String assistantMsg;
    @SerializedName("assistant_right_msg")
    public String assistantRightMsg;
    @SerializedName("recommend_list")
    public List<MoneyOffGradientEntity> rawRecommendGroupItems;
    public List<MoneyOffGradientEntity> recommendGroupItems;
    @SerializedName("selected_index")
    public int selectedIndex;
    @SerializedName("trace_id")
    public String traceId;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public MoneyOffEntity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ae52079c9d8a44905b7b5f85585350", RobustBitConfig.DEFAULT_VALUE)) {
                return (MoneyOffEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ae52079c9d8a44905b7b5f85585350");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    MoneyOffEntity moneyOffEntity = (MoneyOffEntity) new GsonBuilder().create().fromJson(jsonElement, type);
                    if (!d.a(moneyOffEntity.rawRecommendGroupItems)) {
                        ArrayList arrayList = new ArrayList();
                        for (MoneyOffGradientEntity moneyOffGradientEntity : moneyOffEntity.rawRecommendGroupItems) {
                            if (!d.a(moneyOffGradientEntity.productList)) {
                                arrayList.add(moneyOffGradientEntity);
                            }
                        }
                        moneyOffEntity.recommendGroupItems = arrayList;
                    }
                    return moneyOffEntity;
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
