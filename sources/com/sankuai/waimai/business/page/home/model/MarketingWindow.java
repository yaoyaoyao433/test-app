package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MarketingWindow implements Serializable {
    public static final int TYPE_GUIDE_POP_HIGH = 3;
    public static final int TYPE_REWARD_COIN_TASK = 1;
    public static final int TYPE_SKY_FALL_ACTIVITY = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("type")
    public int type;

    @Nullable
    public static MarketingWindow getData(@Nullable List<MarketingWindow> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0b82aa53d7b6c76bb444add0331f33f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarketingWindow) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0b82aa53d7b6c76bb444add0331f33f");
        }
        if (list != null && !list.isEmpty()) {
            for (MarketingWindow marketingWindow : list) {
                if (marketingWindow != null && marketingWindow.type == i) {
                    return marketingWindow;
                }
            }
        }
        return null;
    }
}
