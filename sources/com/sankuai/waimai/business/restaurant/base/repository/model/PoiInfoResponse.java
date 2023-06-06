package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.poi.ActivityItem;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiDetailStoryInfo;
import com.sankuai.waimai.platform.domain.core.poi.PoiEnv;
import com.sankuai.waimai.platform.domain.core.poi.PoiExtendInfo;
import com.sankuai.waimai.platform.domain.core.poi.PoiFoodPalaceInfo;
import com.sankuai.waimai.platform.domain.core.poi.PoiQualifyInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Poi poi;
    public JSONArray remindArray;

    public static PoiInfoResponse parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3b9e3cebf17934bb1db2f5634ef46be", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiInfoResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3b9e3cebf17934bb1db2f5634ef46be");
        }
        PoiInfoResponse poiInfoResponse = new PoiInfoResponse();
        Poi poi = new Poi();
        poi.parseJsonToPoi(jSONObject);
        processPoiInfo(poi, jSONObject);
        poiInfoResponse.poi = poi;
        JSONArray optJSONArray = jSONObject.optJSONArray("remind_infos");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            poiInfoResponse.remindArray = optJSONArray;
        }
        return poiInfoResponse;
    }

    private static void processPoiInfo(Poi poi, JSONObject jSONObject) {
        Object[] objArr = {poi, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4e2ad2f83dfd30dc992eeb06ecf1baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4e2ad2f83dfd30dc992eeb06ecf1baa");
            return;
        }
        long optLong = jSONObject.optLong("wm_poi_id");
        String optString = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        poi.setId(optLong);
        poi.setPoiIDStr(optString);
        poi.setAppDeliveryTip(jSONObject.optString("delivery_tip"));
        JSONObject optJSONObject = jSONObject.optJSONObject("poi_story_info");
        if (optJSONObject != null) {
            PoiDetailStoryInfo poiDetailStoryInfo = new PoiDetailStoryInfo();
            poi.poiDetailStoryInfo = poiDetailStoryInfo;
            poiDetailStoryInfo.topPic = optJSONObject.optString("top_pic");
            poiDetailStoryInfo.videoIcon = optJSONObject.optString("video_icon");
            poiDetailStoryInfo.title = optJSONObject.optString("title");
            poiDetailStoryInfo.entranceUrl = optJSONObject.optString("entrance_url");
            poiDetailStoryInfo.poiLogoIcon = optJSONObject.optString("poi_logo_icon");
            poiDetailStoryInfo.poiTabIcon = optJSONObject.optString("poi_tab_icon");
            poiDetailStoryInfo.storyBigPic = optJSONObject.optString("poi_story_big_pic");
            poiDetailStoryInfo.storyBigPicWitth = optJSONObject.optInt("poi_story_big_pic_width");
            poiDetailStoryInfo.storyBigPicHeight = optJSONObject.optInt("poi_story_big_pic_height");
            poiDetailStoryInfo.storyBigPicTitle = optJSONObject.optString("poi_story_big_pic_title");
            poiDetailStoryInfo.storyBigPicSubTitle = optJSONObject.optString("poi_story_big_pic_sub_title");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("poi_env_info");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            poi.poiEnv = new PoiEnv();
            poi.poiEnv.show = true;
            poi.poiEnv.insteadPoiId = optLong;
            JSONArray optJSONArray = optJSONObject2.optJSONArray("thumbnails_url_list");
            if (optJSONArray != null) {
                poi.poiEnv.mAlbumThumbnails = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    poi.poiEnv.mAlbumThumbnails.add(optJSONArray.optString(i));
                }
            }
            poi.poiEnv.mAlbumHasMore = optJSONObject2.optBoolean("has_more");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("poi_qualify_info");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            poi.poiQualifyInfo = new PoiQualifyInfo();
            poi.poiQualifyInfo.show = true;
            poi.poiQualifyInfo.content = optJSONObject3.optString("content");
            poi.poiQualifyInfo.url = optJSONObject3.optString("url");
        }
        String optString2 = jSONObject.optString("poi_service_info");
        if (!TextUtils.isEmpty(optString2)) {
            poi.mPoiServices = (ArrayList) com.sankuai.waimai.foundation.utils.k.a().fromJson(optString2, new TypeToken<ArrayList<Poi.PoiService>>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.model.PoiInfoResponse.1
            }.getType());
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("poi_media_info");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            poi.poiExtendInfoEntrances = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                PoiExtendInfo poiExtendInfo = new PoiExtendInfo();
                JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject4 != null) {
                    poiExtendInfo.parseJson(optJSONObject4);
                    poi.poiExtendInfoEntrances.add(poiExtendInfo);
                }
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("poi_foodpalace_info");
        if (optJSONObject5 != null && optJSONObject5.length() > 0) {
            poi.poiFoodPalaceInfo = new PoiFoodPalaceInfo();
            poi.poiFoodPalaceInfo.iconUrl = optJSONObject5.optString("icon_url");
            poi.poiFoodPalaceInfo.isShow = true;
            poi.poiFoodPalaceInfo.content = optJSONObject5.optString("content");
            poi.poiFoodPalaceInfo.url = optJSONObject5.optString("url");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("poi_info_tags");
        if (optJSONObject6 != null) {
            JSONArray optJSONArray3 = optJSONObject6.optJSONArray("label_info");
            if (optJSONArray3 != null) {
                ArrayList<ActivityItem> arrayList = new ArrayList<>();
                poi.setBottomActivities(arrayList);
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    JSONObject optJSONObject7 = optJSONArray3.optJSONObject(i3);
                    ActivityItem activityItem = new ActivityItem();
                    activityItem.setInfo(optJSONObject7.optString("info"));
                    activityItem.setIconUrl(optJSONObject7.optString("icon_url"));
                    arrayList.add(activityItem);
                }
            }
            poi.usePoiNormalTagsField = optJSONObject6.optBoolean("use_poi_normal_tags_field");
            String optString3 = optJSONObject6.optString("poi_normal_tags");
            if (TextUtils.isEmpty(optString3)) {
                return;
            }
            poi.poiNormalTags = (List) com.sankuai.waimai.foundation.utils.k.a().fromJson(optString3, new TypeToken<List<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.model.PoiInfoResponse.2
            }.getType());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<PoiInfoResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public PoiInfoResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090eb1623c6bd1a6c4b4a574dfafdbbf", RobustBitConfig.DEFAULT_VALUE)) {
                return (PoiInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090eb1623c6bd1a6c4b4a574dfafdbbf");
            }
            try {
                return PoiInfoResponse.parseJson(new JSONObject(jsonElement.toString()));
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return null;
            }
        }
    }
}
