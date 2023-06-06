package com.sankuai.meituan.takeoutnew.controller;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public JSONObject a(WelcomeAd welcomeAd) {
        String str;
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9075bbabab4aae21acbb0fe65865cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9075bbabab4aae21acbb0fe65865cb");
        }
        if (welcomeAd == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dType", com.sankuai.waimai.platform.b.A().g());
            jSONObject.put("dId", com.sankuai.waimai.platform.b.A().b());
            jSONObject.put("dVersion", com.sankuai.waimai.platform.b.A().h());
            jSONObject.put("appName", com.sankuai.waimai.platform.b.A().q());
            jSONObject.put("appVersion", com.sankuai.waimai.platform.b.A().i());
            jSONObject.put("customerId", com.sankuai.waimai.platform.domain.manager.user.a.i().d());
            jSONObject.put("uuid", com.sankuai.waimai.platform.b.A().c());
            jSONObject.put("visitid", com.sankuai.waimai.platform.b.A().f());
            jSONObject.put("utm_source", com.sankuai.waimai.platform.b.A().d());
            com.sankuai.waimai.platform.b.A();
            jSONObject.put("utm_campaign", com.sankuai.waimai.platform.b.H());
            jSONObject.put("utm_medium", com.sankuai.waimai.platform.b.A().o());
            jSONObject.put("utm_content", com.sankuai.waimai.platform.b.A().b());
            jSONObject.put("utm_term", com.sankuai.waimai.platform.b.A().j());
            try {
                str = com.sankuai.waimai.platform.b.A().J();
            } catch (Exception unused) {
                str = "";
            }
            jSONObject.put("ua", str);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "");
            jSONObject.put("time", System.currentTimeMillis());
            jSONObject.put("cType", com.sankuai.waimai.platform.b.A().o());
            jSONObject.put("channel", com.sankuai.waimai.platform.b.A().d());
            WMLocation j = g.j();
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, (long) (j.getLatitude() * 1000000.0d));
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, (long) (j.getLongitude() * 1000000.0d));
            jSONObject.put("ad_city_id", welcomeAd.cityId);
            jSONObject.put("ad_slot_id", welcomeAd.slotId);
            jSONObject.put("ad_id", welcomeAd.id);
            jSONObject.put("ad_launch_id", welcomeAd.launchId);
            jSONObject.put("ad_st_id", welcomeAd.strategyId);
            jSONObject.put("ad_imp_url", welcomeAd.exposeLogUrl);
            jSONObject.put("ad_click_url", welcomeAd.clickLogUrl);
            jSONObject.put("ad_monitor_imp_url", welcomeAd.thirdExposeLogUrl);
            jSONObject.put("ad_monitor_click_url", welcomeAd.thirdClickLogUrl);
            jSONObject.put("ad_exposed_time", System.currentTimeMillis());
            return jSONObject;
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public final void a(String str) {
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07529f2e97bfc0b8f6f95643738016a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07529f2e97bfc0b8f6f95643738016a");
            return;
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a aVar = new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a(com.meituan.android.singleton.b.a);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ef00f21bb851d201fe327e6c82582098", RobustBitConfig.DEFAULT_VALUE)) {
            j = ((Long) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ef00f21bb851d201fe327e6c82582098")).longValue();
        } else {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(aVar.b, com.sankuai.waimai.business.page.home.cache.b.a(str));
                if (file.exists() && file.canRead()) {
                    j = file.length();
                } else {
                    com.sankuai.waimai.business.page.home.cache.c cVar = aVar.c;
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.cache.c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "ddcf541103f3a292af353453c1da9cdd", RobustBitConfig.DEFAULT_VALUE)) {
                        j = ((Long) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "ddcf541103f3a292af353453c1da9cdd")).longValue();
                    } else if (!TextUtils.isEmpty(str)) {
                        String a2 = com.sankuai.waimai.business.page.home.cache.b.a(str);
                        File file2 = new File(cVar.b, a2);
                        if (file2.exists() && file2.canRead()) {
                            j = file2.length();
                        } else {
                            File file3 = new File(cVar.c, a2);
                            if (file3.exists() && file3.canRead()) {
                                j = file3.length();
                            }
                        }
                    }
                }
            }
            j = 0;
        }
        long j2 = j / 1024;
        if (j2 > 2048) {
            a.AbstractC1040a b = new com.sankuai.meituan.takeoutnew.log.a().a("waimai_startup_download_video_net").b("video_size_warning");
            i.d(b.c(str + "#" + j2 + "KB").b(true).b());
        }
    }
}
