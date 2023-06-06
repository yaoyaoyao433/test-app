package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SimilarInStoreInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("spus")
    public List<GoodsSpu> similarSpuList;
    @SerializedName("title")
    public String title;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64ec566d9cf1369a7af56f2d9bf73ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64ec566d9cf1369a7af56f2d9bf73ffb");
        } else if (jSONObject != null) {
            try {
                this.title = jSONObject.optString("title");
                JSONArray optJSONArray = jSONObject.optJSONArray("spus");
                if (optJSONArray != null) {
                    this.similarSpuList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        GoodsSpu goodsSpu = new GoodsSpu();
                        goodsSpu.parseJson(optJSONObject);
                        this.similarSpuList.add(goodsSpu);
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }
}
