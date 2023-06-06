package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DynamicTabInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public int id;
    @SerializedName("index")
    public int index;
    @SerializedName("is_show")
    public boolean isShow;
    @SerializedName(RegionLinkDao.TABLENAME)
    public String link;
    @SerializedName("link_type")
    public int linkType;
    @SerializedName("name")
    public String name;
    @SerializedName("normal_pic_url")
    public String normalPicUrl;
    @SerializedName("selected_pic_url")
    public String selectedPicUrl;
}
