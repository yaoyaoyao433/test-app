package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.foundation.utils.ab;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShareInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("channels")
    public ArrayList<Integer> channels;
    @SerializedName("comment")
    private String comment;
    @SerializedName("order_comment_score")
    private int commentScore;
    @SerializedName("share_head_tip")
    private String headTip;
    @SerializedName("poi_icon")
    private String poiIconUrl;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    private String poiName;
    @SerializedName("praise_list")
    private ArrayList<a> praiseList;
    @SerializedName("url_tip")
    private String qrcodeTip;
    @SerializedName("poi_share_url")
    private String shareUrl;
    @SerializedName("mt_slogan")
    private String sloganUrl;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("name")
        public String b;
    }

    public static ShareInfo fromJson(JSONObject jSONObject) {
        a aVar;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6437758cededfd430a032a14817cdd9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6437758cededfd430a032a14817cdd9a");
        }
        if (jSONObject == null) {
            return null;
        }
        ShareInfo shareInfo = new ShareInfo();
        shareInfo.headTip = jSONObject.optString("share_head_tip");
        shareInfo.poiName = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
        shareInfo.poiIconUrl = jSONObject.optString("poi_icon");
        shareInfo.commentScore = jSONObject.optInt("order_comment_score");
        shareInfo.comment = jSONObject.optString("comment");
        JSONArray optJSONArray = jSONObject.optJSONArray("praise_list");
        if (optJSONArray != null) {
            shareInfo.praiseList = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                ArrayList<a> arrayList = shareInfo.praiseList;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                Object[] objArr2 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "60811d2da4b9ecdd3b760d603b0b55f8", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "60811d2da4b9ecdd3b760d603b0b55f8");
                } else if (optJSONObject == null) {
                    aVar = null;
                } else {
                    a aVar2 = new a();
                    aVar2.b = optJSONObject.optString("name");
                    aVar = aVar2;
                }
                arrayList.add(aVar);
            }
        }
        shareInfo.shareUrl = jSONObject.optString("poi_share_url");
        shareInfo.sloganUrl = jSONObject.optString("mt_slogan");
        shareInfo.qrcodeTip = jSONObject.optString("url_tip");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("channels");
        if (optJSONArray2 != null) {
            shareInfo.channels = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                shareInfo.channels.add(Integer.valueOf(optJSONArray2.optInt(i2)));
            }
        }
        return shareInfo;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<ShareInfo> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public ShareInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf413fb114ae32fe2bf20bd113c4aa81", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShareInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf413fb114ae32fe2bf20bd113c4aa81");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return ShareInfo.fromJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public boolean checkShareParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a49f1982a6f7dd5184f59bf5c89995b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a49f1982a6f7dd5184f59bf5c89995b3")).booleanValue() : (TextUtils.isEmpty(this.qrcodeTip) || TextUtils.isEmpty(this.poiName) || TextUtils.isEmpty(this.shareUrl) || this.commentScore > 5 || this.commentScore < 0) ? false : true;
    }

    public String getHeadTip() {
        return this.headTip;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getPoiIconUrl() {
        return this.poiIconUrl;
    }

    public int getCommentScore() {
        return this.commentScore;
    }

    public String getComment() {
        return this.comment;
    }

    public ArrayList<a> getPraiseList() {
        return this.praiseList;
    }

    public String getPraiseStr() {
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6596412437dace6434256b1754b4712", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6596412437dace6434256b1754b4712");
        }
        if (this.praiseList == null || this.praiseList.size() == 0) {
            return null;
        }
        int size = this.praiseList.size();
        StringBuilder sb = new StringBuilder();
        sb.append(ab.a(R.string.wm_platform_share_info_recommend));
        String a2 = ab.a(R.string.wm_platform_share_info_recommend_split);
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            if (this.praiseList.get(i2) != null) {
                sb.append(this.praiseList.get(i2).b);
                sb.append(a2);
            }
            i2++;
        }
        if (this.praiseList.get(i) != null) {
            sb.append(this.praiseList.get(i).b);
        }
        return sb.toString();
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSloganUrl() {
        return this.sloganUrl;
    }

    public String getQrcodeTip() {
        return this.qrcodeTip;
    }

    public ArrayList<Integer> getChannels() {
        return this.channels;
    }

    public void setHeadTip(String str) {
        this.headTip = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setPoiIconUrl(String str) {
        this.poiIconUrl = str;
    }

    public void setCommentScore(int i) {
        this.commentScore = i;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setPraiseList(ArrayList<a> arrayList) {
        this.praiseList = arrayList;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSloganUrl(String str) {
        this.sloganUrl = str;
    }

    public void setQrcodeTip(String str) {
        this.qrcodeTip = str;
    }

    public void setChannels(ArrayList<Integer> arrayList) {
        this.channels = arrayList;
    }
}
