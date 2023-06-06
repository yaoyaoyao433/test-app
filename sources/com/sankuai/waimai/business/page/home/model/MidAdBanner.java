package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MidAdBanner extends PouchDynamicAd {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(ConfigInfo.MODULE_PLATINUM_BANNER)
    public com.sankuai.waimai.business.page.home.list.future.ad.a dynamicPlatinumBanner;
}
