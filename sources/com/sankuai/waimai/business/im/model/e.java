package com.sankuai.waimai.business.im.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @SerializedName("type")
    public int b;
    @SerializedName("title")
    public String c;
    @SerializedName("description_list")
    public List<String> d;
    @SerializedName(RegionLinkDao.TABLENAME)
    public String e;
    @SerializedName("json_data")
    public String f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("poi_longitude")
        public long a;
        @SerializedName("poi_latitude")
        public long b;
        @SerializedName(AgainManager.EXTRA_POI_NAME)
        public String c;
        @SerializedName("poi_address")
        public String d;
        @SerializedName("user_longitude")
        public long e;
        @SerializedName("user_latitude")
        public long f;
        @SerializedName("distance")
        public String g;
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6a10f153e31750bde87f88bb74b492", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6a10f153e31750bde87f88bb74b492");
        }
        if (TextUtils.isEmpty(this.f)) {
            return null;
        }
        try {
            return (a) new Gson().fromJson(this.f, (Class<Object>) a.class);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }
}
