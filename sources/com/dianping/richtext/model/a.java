package com.dianping.richtext.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    @SerializedName(alternate = {"type"}, value = "tp")
    public Integer a;
    @SerializedName(alternate = {RegionLinkDao.TABLENAME}, value = "lk")
    public String b;
    @SerializedName(alternate = {"linkaction"}, value = "la")
    public String c;
}
