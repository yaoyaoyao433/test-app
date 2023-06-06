package com.sankuai.waimai.business.page.common.net.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.page.common.model.ChannelSubCategory;
import com.sankuai.waimai.business.page.home.model.v10.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ChannelInfoResponseV8 extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("sub_category_list")
    public ArrayList<ChannelSubCategory> categories;
    @SerializedName("tab_info")
    public a tabInfo;
}
