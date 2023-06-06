package com.sankuai.waimai.store.search.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends StatisticsEntity implements Serializable {
    public static ChangeQuickRedirect a = null;
    private static final long serialVersionUID = 4526923907472050700L;
    @SerializedName("bgImgMantleStart")
    public String b;
    @SerializedName("borderColor")
    public String c;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String d;
    @SerializedName("returnButtonColor")
    public String e;
    @SerializedName("bgImgUrl")
    public String f;
    @SerializedName("nearbyPoiContent")
    public String g;
    @SerializedName("title")
    public String h;
    @SerializedName("labelUrl")
    public String i;
    @SerializedName("logoUrl")
    public String j;
    @SerializedName("bgImgMantleEnd")
    public String k;
    @SerializedName("topTopic")
    public String l;
    @SerializedName("titleColor")
    public String m;
    @SerializedName("actionContent")
    public String n;
    @SerializedName("brandId")
    public String o;
    @SerializedName("changeAddressColor")
    public String p;
    @SerializedName("slogan")
    public String q;
    @SerializedName("projectId")
    public String r;
    @SerializedName("aladdinCardType")
    public Integer s;
    @SerializedName("poiId")
    public String t;
    public boolean u;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8910321c2848eb5352ad4b43e24ad281", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8910321c2848eb5352ad4b43e24ad281");
        } else {
            this.u = false;
        }
    }

    public static g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e65383468fd7c98c5eb7eea1544c4030", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e65383468fd7c98c5eb7eea1544c4030") : (g) new Gson().fromJson(str, (Class<Object>) g.class);
    }
}
