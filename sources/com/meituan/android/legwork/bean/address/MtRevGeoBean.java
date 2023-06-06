package com.meituan.android.legwork.bean.address;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.legwork.bean.mtmap.Admin;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MtRevGeoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("addr_info")
    public List<Admin> addInfo;
    @SerializedName("pois")
    public List<PoiBean> pois;
}
