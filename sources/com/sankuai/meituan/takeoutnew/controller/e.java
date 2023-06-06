package com.sankuai.meituan.takeoutnew.controller;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b;
import com.sankuai.waimai.foundation.utils.m;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Context b;
    public List<WelcomeAd> c;
    d d;
    public boolean e;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf414f6abd35463070d0acba77a1c0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf414f6abd35463070d0acba77a1c0d");
            return;
        }
        this.e = true;
        this.b = context;
        this.c = new ArrayList();
        this.d = new d();
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8f38bdf7d35a292bfb11ee1b8e3948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8f38bdf7d35a292bfb11ee1b8e3948");
            return;
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, "welcome_ad_list", (String) null);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(b);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.c.add(new WelcomeAd(jSONArray.optJSONObject(i)));
            }
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92efdec323b7b3e2c17bbf2408c0cc43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92efdec323b7b3e2c17bbf2408c0cc43");
        } else if (this.c.isEmpty()) {
        } else {
            l.a(new l.a() { // from class: com.sankuai.meituan.takeoutnew.controller.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "347fb91ce2a9b372e0a65319cb90ef4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "347fb91ce2a9b372e0a65319cb90ef4b");
                        return;
                    }
                    e eVar = e.this;
                    boolean z2 = z;
                    boolean z3 = true;
                    Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "abb2a29719e713277f253f31e84195c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "abb2a29719e713277f253f31e84195c4");
                        return;
                    }
                    for (WelcomeAd welcomeAd : eVar.c) {
                        if (!eVar.a(welcomeAd) && (!welcomeAd.isVideoSource() || z2)) {
                            eVar.b(welcomeAd);
                            z3 = false;
                        }
                    }
                    if (z3) {
                        e.a("WelcomeAdController", "allWelcomeAdExpired Or IsVideoSource");
                    }
                }
            }, (String) null);
        }
    }

    public void a(List<WelcomeAd> list) {
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d06c4dbae6907af7c3ab8e402e300d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d06c4dbae6907af7c3ab8e402e300d");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.c)) {
            boolean a2 = com.sankuai.waimai.foundation.utils.d.a(list);
            ArrayList arrayList = new ArrayList();
            for (WelcomeAd welcomeAd : this.c) {
                if (welcomeAd != null && !TextUtils.isEmpty(welcomeAd.matUrl)) {
                    String str = welcomeAd.matUrl;
                    if (a2) {
                        arrayList.add(str);
                    } else {
                        int i = 0;
                        while (true) {
                            if (i >= list.size()) {
                                z = true;
                                break;
                            }
                            WelcomeAd welcomeAd2 = list.get(i);
                            if (welcomeAd2 != null && !TextUtils.isEmpty(welcomeAd2.matUrl) && welcomeAd2.matUrl.equals(str) && !a(welcomeAd2)) {
                                z = false;
                                break;
                            }
                            i++;
                        }
                        if (z) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, "welcome_ad_mark_clear_list", new Gson().toJson(arrayList));
        }
    }

    public final WelcomeAd a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1a38200b6c3a6d60dcb75314dd6fd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (WelcomeAd) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1a38200b6c3a6d60dcb75314dd6fd4");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "00d8528b1fcc81699483579f4d0ac60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "00d8528b1fcc81699483579f4d0ac60c");
        } else {
            Context context = com.meituan.android.singleton.b.a;
            try {
                String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "welcome_ad_mark_clear_list", "");
                if (!TextUtils.isEmpty(b)) {
                    List<String> list = (List) new Gson().fromJson(b, new TypeToken<List<String>>() { // from class: com.sankuai.meituan.takeoutnew.controller.a.1
                    }.getType());
                    if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                        com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a aVar = new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.a(context);
                        for (String str : list) {
                            aVar.a(str);
                            if (!TextUtils.isEmpty(str) && aVar.c()) {
                                aVar.d();
                            }
                        }
                    }
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "welcome_ad_mark_clear_list");
                }
            } catch (Exception unused) {
            }
        }
        if (this.c != null && !this.c.isEmpty()) {
            ArrayList<WelcomeAd> arrayList = new ArrayList();
            if (!this.c.isEmpty()) {
                for (WelcomeAd welcomeAd : this.c) {
                    if (welcomeAd.adType == 19) {
                        arrayList.add(welcomeAd);
                    }
                }
            }
            int b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, "welcome_ad_last_index", -1);
            long b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.b, "welcome_ad_last_show_time", 0L);
            long b4 = com.meituan.android.time.c.b();
            Date date = new Date(b3);
            Date date2 = new Date(b4);
            int nextInt = new Random().nextInt(10);
            if (b2 == -1 || b3 == 0 || !com.meituan.android.base.util.a.a(date, date2)) {
                z = true;
            } else {
                nextInt = (b2 + 1) % 10;
                z = false;
            }
            com.sankuai.waimai.foundation.utils.log.a.d("welcome_ad", "final index:%d, is from random:%s", Integer.valueOf(nextInt), Boolean.valueOf(z));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, "welcome_ad_last_index", nextInt);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.b, "welcome_ad_last_show_time", b4);
            for (WelcomeAd welcomeAd2 : arrayList) {
                if (welcomeAd2.order != null && welcomeAd2.order.size() > 0) {
                    com.sankuai.waimai.foundation.utils.log.a.b("welcome_ad", "ad[%s] order:%s", Long.valueOf(welcomeAd2.id), welcomeAd2.order);
                    if (welcomeAd2.order.contains(Integer.valueOf(nextInt + 1)) && a.b(welcomeAd2)) {
                        a("WelcomeAdController", "命中本地广告缓存");
                        return welcomeAd2;
                    }
                }
            }
        }
        this.e = false;
        return null;
    }

    public boolean a(WelcomeAd welcomeAd) {
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb5c8d928f8b7ee87ed53880f01da1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb5c8d928f8b7ee87ed53880f01da1b")).booleanValue();
        }
        if (welcomeAd == null || TextUtils.isEmpty(welcomeAd.matUrl) || welcomeAd.dailyTime == null || welcomeAd.dailyTime.isEmpty() || welcomeAd.cycleTime == null || welcomeAd.cycleTime.isEmpty()) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Calendar calendar = Calendar.getInstance();
        long j = (calendar.get(11) * DaBaiBean.DABAI_DATA_EXPIRE_TIME) + (calendar.get(12) * 60) + calendar.get(13);
        Iterator<WelcomeAd.Timeline> it = welcomeAd.dailyTime.iterator();
        while (it.hasNext()) {
            if (it.next().endTime >= currentTimeMillis) {
                Iterator<WelcomeAd.Timeline> it2 = welcomeAd.cycleTime.iterator();
                while (it2.hasNext()) {
                    if (it2.next().endTime >= j) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    public void b(final WelcomeAd welcomeAd) {
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db1b7621cee88d5179e5b697001a469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db1b7621cee88d5179e5b697001a469");
            return;
        }
        final HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adType", welcomeAd.adType);
            jSONObject.put("adChargeInfo", m.a(welcomeAd.chargeInfo));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        hashMap.put("ad", jSONObject.toString());
        hashMap.put("is_image", Integer.valueOf(1 ^ welcomeAd.isVideoSource()));
        new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b(this.b).a(welcomeAd.matUrl, new b.a() { // from class: com.sankuai.meituan.takeoutnew.controller.e.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b.a
            public final void a(String str, Throwable th) {
                Object[] objArr2 = {str, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0402fc463b9d6b3b4b316bb1d4fe0cd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0402fc463b9d6b3b4b316bb1d4fe0cd8");
                    return;
                }
                e.a("WelcomeAdController", "download error");
                JudasManualManager.b("b_hPVlW").a(e.this.b).a("c_w10r5g3").a(hashMap).a("is_suc", 0).a();
                a.AbstractC1040a b = new com.sankuai.meituan.takeoutnew.log.a().a("welcome_ad_download").b("download_error");
                i.d(b.c(welcomeAd.matUrl + "#" + th.getMessage()).b(true).b());
                if (welcomeAd.isVideoSource()) {
                    com.sankuai.waimai.platform.capacity.log.c.a().a(17901, 0, "waimai_startup_download_video_net");
                    a.AbstractC1040a b2 = new com.sankuai.meituan.takeoutnew.log.a().a("waimai_startup_download_video_net").b("download_error");
                    i.d(b2.c(welcomeAd.matUrl + "#" + th.getMessage()).b(true).b());
                    e.this.d.a(welcomeAd.matUrl);
                }
            }

            @Override // com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b5137213a94e539599236e04933a382", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b5137213a94e539599236e04933a382");
                    return;
                }
                e.a("WelcomeAdController", "download CacheError");
                JudasManualManager.b("b_hPVlW").a(e.this.b).a("c_w10r5g3").a(hashMap).a("is_suc", 0).a();
                i.d(new com.sankuai.meituan.takeoutnew.log.a().a("welcome_ad_download").b("cache_error").c(welcomeAd.matUrl).b());
                if (welcomeAd.isVideoSource()) {
                    com.sankuai.waimai.platform.capacity.log.c.a().a(17901, 0, "waimai_startup_download_video_net");
                    i.d(new com.sankuai.meituan.takeoutnew.log.a().a("waimai_startup_download_video_net").b("cache_error").c(welcomeAd.matUrl).b());
                    e.this.d.a(welcomeAd.matUrl);
                }
            }

            @Override // com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8bad272b23f92f355b1941bd6ea13eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8bad272b23f92f355b1941bd6ea13eb");
                    return;
                }
                e.a("WelcomeAdController", "download success");
                JudasManualManager.b("b_hPVlW").a(e.this.b).a("c_w10r5g3").a(hashMap).a("is_suc", 1).a();
                i.c(new com.sankuai.meituan.takeoutnew.log.a().a("welcome_ad_download").b());
                if (welcomeAd.isVideoSource()) {
                    com.sankuai.waimai.platform.capacity.log.c.a().a(17900, 0, "waimai_startup_download_video_net");
                }
            }
        });
        String str = welcomeAd.clickImageUrl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b(com.meituan.android.singleton.b.a).a(str, null);
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "352d4af549b5e6d0ca744c43c19f7672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "352d4af549b5e6d0ca744c43c19f7672");
        } else {
            i.b(new a.AbstractC1040a() { // from class: com.sankuai.meituan.takeoutnew.controller.e.3
                @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
                public final String a() {
                    return "welcome_ad";
                }
            }.a(str).d(str2).b());
        }
    }
}
