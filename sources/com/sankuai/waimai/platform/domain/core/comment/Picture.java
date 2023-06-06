package com.sankuai.waimai.platform.domain.core.comment;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Picture implements Serializable {
    public static final int TYPE_COMMENT = 1;
    public static final int TYPE_COMMENT_DP = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private a commentVideo;
    @SerializedName("thumbnail_url")
    private String dpThumbUrl;
    @SerializedName("url")
    private String dpUrl;
    private boolean isVideo;
    private String wmThumbUrlWithQuality;
    private String wmThumbUrlWithoutQuality;
    private String wmUrlWithQuality;
    private String wmUrlWithoutQuality;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface Type {
    }

    public Picture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70387456a5f5863b92202a196760a8e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70387456a5f5863b92202a196760a8e0");
            return;
        }
        this.wmUrlWithoutQuality = null;
        this.wmThumbUrlWithoutQuality = null;
        this.wmUrlWithQuality = null;
        this.wmThumbUrlWithQuality = null;
        this.dpUrl = null;
        this.dpThumbUrl = null;
        this.isVideo = false;
    }

    public String getThumbUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddd6cc2a4a6c06203625076eb8f60183", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddd6cc2a4a6c06203625076eb8f60183");
        }
        if (!TextUtils.isEmpty(this.wmThumbUrlWithQuality)) {
            return this.wmThumbUrlWithQuality;
        }
        if (TextUtils.isEmpty(this.wmThumbUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpThumbUrl) ? this.dpThumbUrl : "";
        }
        return ImageQualityUtil.b(context, this.wmThumbUrlWithoutQuality, 0, g.a(context, 80.0f));
    }

    public String getFullSizeUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb4d53ea266c804e483a1e9a00e5c2a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb4d53ea266c804e483a1e9a00e5c2a6");
        }
        if (!TextUtils.isEmpty(this.wmUrlWithQuality)) {
            return this.wmUrlWithQuality;
        }
        if (TextUtils.isEmpty(this.wmUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpUrl) ? this.dpUrl : "";
        }
        return ImageQualityUtil.b(context, this.wmUrlWithoutQuality, 0, g.a(context));
    }

    public String getThumbUrlWithoutQuality(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "426f47f8b1cf53635c947613ec119cf1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "426f47f8b1cf53635c947613ec119cf1");
        }
        if (TextUtils.isEmpty(this.wmThumbUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpThumbUrl) ? this.dpThumbUrl : "";
        }
        return this.wmThumbUrlWithoutQuality;
    }

    public String getFullSizeUrlWithoutQuality(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25c408ae9a4086fb82ee45d900aebd62", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25c408ae9a4086fb82ee45d900aebd62");
        }
        if (TextUtils.isEmpty(this.wmUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpUrl) ? this.dpUrl : "";
        }
        return this.wmUrlWithoutQuality;
    }

    public void setWmUrlWithoutQuality(String str) {
        this.wmUrlWithoutQuality = str;
    }

    public void setWmUrlWithQuality(String str) {
        this.wmUrlWithQuality = str;
    }

    public void setWmThumbUrlWithoutQuality(String str) {
        this.wmThumbUrlWithoutQuality = str;
    }

    public void setWmThumbUrlWithQuality(String str) {
        this.wmThumbUrlWithQuality = str;
    }

    public void setDpUrl(String str) {
        this.dpUrl = str;
    }

    public void setDpThumbUrl(String str) {
        this.dpThumbUrl = str;
    }

    public void setIsVideo(boolean z) {
        this.isVideo = z;
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    public void setCommentVideo(a aVar) {
        this.commentVideo = aVar;
    }

    public a getCommentVideo() {
        return this.commentVideo;
    }

    public static ArrayList<Picture> formJsonArray(JSONArray jSONArray, @Type int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c219b5fc2239a98530b5882e87f48944", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c219b5fc2239a98530b5882e87f48944");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<Picture> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Picture fromJson = fromJson(jSONArray.optJSONObject(i2), i);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    private static Picture fromJson(JSONObject jSONObject, @Type int i) {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cae53480013830d53f3feed1d8164fb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Picture) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cae53480013830d53f3feed1d8164fb7");
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("thumbnail_url");
        Picture picture = new Picture();
        if (i == 2) {
            picture.setDpUrl(optString);
            picture.setDpThumbUrl(optString2);
        } else {
            picture.setWmUrlWithoutQuality(optString);
            picture.setWmThumbUrlWithoutQuality(optString2);
        }
        return picture;
    }
}
