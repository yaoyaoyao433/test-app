package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiUserSpuScrollKingKong implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pic_url")
    public String picUrl;
    @SerializedName("primary_filter_condlist")
    public ArrayList<PrimaryFilterCondList> primaryFilterList;
    @SerializedName("text_list")
    public ArrayList<String> textList;
}
