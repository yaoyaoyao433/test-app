package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsRecipeInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("menu_id")
    public String id;
    @SerializedName("menu_name")
    public String menuName;
    @SerializedName("menu_name_list")
    public String menuNameList;
    @SerializedName("menu_text")
    public String menuText;
}
