package com.sankuai.waimai.store.platform.domain.core.comment;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Video implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3227892652544830813L;
    @SerializedName(DynamicTitleParser.PARSER_VAL_STRETCH_COVER)
    public String cover;
    @SerializedName("duration")
    public int duration;
    @SerializedName("height")
    public int height;
    @SerializedName("url")
    public String url;
    @SerializedName("width")
    public int width;

    public static Collection<e> toMediaInfos(@NonNull List<Video> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8229c43cbd63f914139fa4f24730834", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8229c43cbd63f914139fa4f24730834");
        }
        ArrayList arrayList = new ArrayList();
        for (Video video : list) {
            if (video != null) {
                e eVar = new e();
                eVar.b = 1;
                eVar.c = video.url;
                eVar.d = video.cover;
                eVar.g = video.height;
                eVar.h = video.width;
                eVar.e = video.duration;
                eVar.b = 1;
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public void parseVideoInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24dfa64b75555cde52738a5e0830ae0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24dfa64b75555cde52738a5e0830ae0a");
            return;
        }
        this.duration = jSONObject.optInt("duration");
        this.height = jSONObject.optInt("height");
        this.width = jSONObject.optInt("width");
        this.url = jSONObject.optString("url");
        this.cover = jSONObject.optString(DynamicTitleParser.PARSER_VAL_STRETCH_COVER);
    }
}
