package com.sankuai.meituan.takeoutnew.controller;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(WelcomeAd welcomeAd) {
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53c97478c12104fd62beb4cb098779fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53c97478c12104fd62beb4cb098779fc")).booleanValue();
        }
        if (welcomeAd == null || TextUtils.isEmpty(welcomeAd.matUrl)) {
            e.a("AdUtils", "welcomeAd == null || matUrl isEmpty");
            return false;
        } else if (welcomeAd.dailyTime == null || welcomeAd.dailyTime.isEmpty() || welcomeAd.cycleTime == null || welcomeAd.cycleTime.isEmpty()) {
            e.a("AdUtils", "广告已失效");
            return false;
        } else {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Calendar calendar = Calendar.getInstance();
            long j = (calendar.get(11) * DaBaiBean.DABAI_DATA_EXPIRE_TIME) + (calendar.get(12) * 60) + calendar.get(13);
            Iterator<WelcomeAd.Timeline> it = welcomeAd.dailyTime.iterator();
            while (it.hasNext()) {
                WelcomeAd.Timeline next = it.next();
                if (next.startTime <= currentTimeMillis && next.endTime >= currentTimeMillis) {
                    Iterator<WelcomeAd.Timeline> it2 = welcomeAd.cycleTime.iterator();
                    while (it2.hasNext()) {
                        WelcomeAd.Timeline next2 = it2.next();
                        if (next2.startTime <= j && next2.endTime >= j) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            e.a("AdUtils", "广告生效时间未到");
            return false;
        }
    }

    public static boolean b(WelcomeAd welcomeAd) {
        Bitmap a2;
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eb54d15ad83642a30b76003630395d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eb54d15ad83642a30b76003630395d1")).booleanValue();
        }
        if (!a(welcomeAd)) {
            if (welcomeAd != null && welcomeAd.isVideoSource()) {
                a.AbstractC1040a b = new com.sankuai.meituan.takeoutnew.log.a().a("waimai_startup_get_video").b("time_not_valid_or_empty_url");
                i.d(b.c(welcomeAd.matUrl + "#time_not_valid_or_empty_url").b());
            }
            return false;
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a aVar = new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a(com.meituan.android.singleton.b.a);
        aVar.a(welcomeAd.matUrl);
        if (!aVar.c()) {
            if (welcomeAd.isVideoSource()) {
                com.sankuai.waimai.platform.capacity.log.c.a().a(17903, 0, "waimai_startup_get_video");
                a.AbstractC1040a b2 = new com.sankuai.meituan.takeoutnew.log.a().a("waimai_startup_get_video").b("no_cache");
                i.d(b2.c(welcomeAd.matUrl + "#no_cache").b());
            }
            a.AbstractC1040a b3 = new com.sankuai.meituan.takeoutnew.log.a().a("waimai_ad_splash").b("no_cache");
            i.d(b3.c(welcomeAd.matUrl + "#no_cache").b());
            e.a("AdUtils", "资源需要展示，但是文件未缓存，获取失败");
            return false;
        } else if (welcomeAd.isVideoSource()) {
            e.a("AdUtils", "welcomeAd.isVideoSource width x height: " + welcomeAd.matWidth + " x " + welcomeAd.matHeight);
            com.sankuai.waimai.platform.capacity.log.c.a().a(17902, 0, "waimai_startup_get_video");
            return true;
        } else {
            try {
                InputStream a3 = aVar.a();
                if (a3 != null) {
                    welcomeAd.mimeType = com.sankuai.waimai.platform.utils.e.a(aVar.a());
                    if (welcomeAd.isGif()) {
                        welcomeAd.gifFileCachePath = aVar.b();
                        a3.close();
                        return true;
                    }
                    int l = com.sankuai.waimai.platform.b.A().l();
                    int m = com.sankuai.waimai.platform.b.A().m();
                    if (welcomeAd.isHalfScreenType()) {
                        if (welcomeAd.picWidth / l >= 1.25f) {
                            a2 = com.sankuai.waimai.platform.utils.e.a(a3, l, (welcomeAd.picHeight * l) / welcomeAd.picWidth, Bitmap.Config.RGB_565);
                        } else {
                            a2 = com.sankuai.waimai.launcher.util.image.a.a(a3);
                        }
                    } else if (welcomeAd.isCutPicture()) {
                        a2 = com.sankuai.waimai.platform.utils.e.a(com.sankuai.waimai.platform.utils.e.a(a3, l, m, Bitmap.Config.RGB_565), l, m);
                    } else {
                        a2 = com.sankuai.waimai.platform.utils.e.a(a3, l, m, Bitmap.Config.RGB_565);
                    }
                    a3.close();
                    welcomeAd.bitmap = a2;
                    if (a2 == null) {
                        i.d(new com.sankuai.meituan.takeoutnew.log.a().a("welcome_ad_show").b("decode_error").b());
                    } else {
                        e.a("AdUtils", "startPicture width/height: " + a2.getWidth() + "， " + a2.getHeight());
                    }
                }
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a(th);
            }
            return welcomeAd.bitmap != null;
        }
    }
}
