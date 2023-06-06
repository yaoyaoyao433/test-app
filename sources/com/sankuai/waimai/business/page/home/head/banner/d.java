package com.sankuai.waimai.business.page.home.head.banner;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.platform.domain.core.ad.Ad;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<HomeNewHeadResponse> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final /* synthetic */ void a(HomeNewHeadResponse homeNewHeadResponse) {
        HomeNewHeadResponse homeNewHeadResponse2 = homeNewHeadResponse;
        Object[] objArr = {homeNewHeadResponse2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6fe7c4d8bd347275b5d688160794a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6fe7c4d8bd347275b5d688160794a5");
            return;
        }
        super.a((d) homeNewHeadResponse2);
        if (homeNewHeadResponse2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c21720181c90accf21726394970382aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c21720181c90accf21726394970382aa");
            } else if (e().topBannerList != null) {
                Iterator<Ad> it = e().topBannerList.iterator();
                while (it.hasNext()) {
                    Ad next = it.next();
                    String showContentStr = next.getShowContentStr();
                    if (!TextUtils.isEmpty(showContentStr)) {
                        next.setAdShowContent((Ad.b) new GsonBuilder().create().fromJson(showContentStr, (Class<Object>) Ad.b.class));
                        Ad.b adShowContent = next.getAdShowContent();
                        if (adShowContent != null) {
                            adShowContent.d = adShowContent.toString();
                        }
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final /* synthetic */ Object f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a71e2ffe3eb1f9e6af6462c35d8746", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a71e2ffe3eb1f9e6af6462c35d8746");
        }
        if (e() != null) {
            return new b(e().topBannerList, e().qualificationRule);
        }
        return null;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49c62a5089f041bf5e680d3553b7680", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49c62a5089f041bf5e680d3553b7680");
        }
        if (e() != null && !com.sankuai.waimai.foundation.utils.d.a(e().topBannerList)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
