package com.sankuai.waimai.store.repository.model;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class VerticalityHeaderResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("first_blocks")
    public List<Object> blockAList = new ArrayList();
    @SerializedName("second_blocks")
    public List<Object> blockBList = new ArrayList();
    @SerializedName("across_banner_list")
    public List<VerticalityAcrossBanner> mVerticalityAcrossBannerList;
    @SerializedName("banner_list")
    public List<VerticalityBanner> mVerticalityBannerList;
    @SuppressLint({"SerializableCheck"})
    public JSONObject originRespData;
    @SerializedName("style_type")
    public String styleType;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<VerticalityHeaderResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public VerticalityHeaderResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            VerticalityHeaderResponse verticalityHeaderResponse;
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6875bc48c0de85cd3909872a0661628f", RobustBitConfig.DEFAULT_VALUE)) {
                return (VerticalityHeaderResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6875bc48c0de85cd3909872a0661628f");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    String jsonElement2 = jsonElement.toString();
                    verticalityHeaderResponse = (VerticalityHeaderResponse) com.sankuai.waimai.store.util.i.a(jsonElement2, type);
                    if (verticalityHeaderResponse != null) {
                        try {
                            verticalityHeaderResponse.originRespData = new JSONObject(jsonElement2);
                        } catch (Exception e) {
                            e = e;
                            com.sankuai.waimai.store.base.log.a.a(e);
                            com.sankuai.shangou.stone.util.log.a.a(e);
                            return verticalityHeaderResponse;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    verticalityHeaderResponse = null;
                }
                return verticalityHeaderResponse;
            }
            return null;
        }
    }
}
