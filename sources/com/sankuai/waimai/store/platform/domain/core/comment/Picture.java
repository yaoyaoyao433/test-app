package com.sankuai.waimai.store.platform.domain.core.comment;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.platform.domain.core.goods.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Picture implements Serializable {
    public static final int TYPE_COMMENT = 1;
    public static final int TYPE_COMMENT_DP = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("thumbnail_url")
    private String dpThumbUrl;
    @SerializedName("url")
    private String dpUrl;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20e26030b28b41aede3fbb60eec1a426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20e26030b28b41aede3fbb60eec1a426");
            return;
        }
        this.wmUrlWithoutQuality = null;
        this.wmThumbUrlWithoutQuality = null;
        this.wmUrlWithQuality = null;
        this.wmThumbUrlWithQuality = null;
        this.dpUrl = null;
        this.dpThumbUrl = null;
    }

    public static Collection<e> toMediaInfos(@NonNull List<Picture> list, Context context) {
        Object[] objArr = {list, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b3e91529ef0f410ab688c0251470588", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b3e91529ef0f410ab688c0251470588");
        }
        ArrayList arrayList = new ArrayList();
        for (Picture picture : list) {
            if (picture != null) {
                e eVar = new e();
                eVar.c = picture.getFullSizeUrl(context);
                eVar.b = 0;
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public String getThumbUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e177b4a4c8389c980bdfd3efcd7dada7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e177b4a4c8389c980bdfd3efcd7dada7");
        }
        if (!TextUtils.isEmpty(this.wmThumbUrlWithQuality)) {
            return this.wmThumbUrlWithQuality;
        }
        if (TextUtils.isEmpty(this.wmThumbUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpThumbUrl) ? this.dpThumbUrl : "";
        }
        return ImageQualityUtil.a(context, this.wmThumbUrlWithoutQuality, 0, h.a(context, 80.0f));
    }

    public String getFullSizeUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e81c50ee987a92105d1af51af9e1b0b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e81c50ee987a92105d1af51af9e1b0b7");
        }
        if (!TextUtils.isEmpty(this.wmUrlWithQuality)) {
            return this.wmUrlWithQuality;
        }
        if (TextUtils.isEmpty(this.wmUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpUrl) ? this.dpUrl : "";
        }
        return ImageQualityUtil.a(context, this.wmUrlWithoutQuality, 0, h.a(context));
    }

    public String getThumbUrlWithoutQuality(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b6618cdd0cbe7e144c455572de2486c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b6618cdd0cbe7e144c455572de2486c");
        }
        if (TextUtils.isEmpty(this.wmThumbUrlWithoutQuality)) {
            return !TextUtils.isEmpty(this.dpThumbUrl) ? this.dpThumbUrl : "";
        }
        return this.wmThumbUrlWithoutQuality;
    }

    public String getFullSizeUrlWithoutQuality(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a02e6bb43f232395376a08998318a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a02e6bb43f232395376a08998318a18");
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

    public static ArrayList<Picture> formJsonArray(JSONArray jSONArray, @Type int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "898c06b88a2fbbb4ab3a11e26734f942", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "898c06b88a2fbbb4ab3a11e26734f942");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a23f6f330cb1d459b3c8196d1e9148cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Picture) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a23f6f330cb1d459b3c8196d1e9148cc");
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("thumbnail_url");
        Picture picture = new Picture();
        if (i != 2) {
            picture.setWmUrlWithoutQuality(optString);
            picture.setWmThumbUrlWithoutQuality(optString2);
        } else {
            picture.setDpUrl(optString);
            picture.setDpThumbUrl(optString2);
        }
        return picture;
    }
}
