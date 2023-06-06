package com.sankuai.waimai.business.page.homepage.controller;

import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.model.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.e;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final Context b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6a8c83034f5a91e5c20c35c1fc71c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6a8c83034f5a91e5c20c35c1fc71c3");
        } else {
            this.b = context;
        }
    }

    private boolean d(com.sankuai.waimai.business.page.homepage.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0d0661db9a8436b4d2c6fddfdd7331", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0d0661db9a8436b4d2c6fddfdd7331")).booleanValue();
        }
        com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(this.b);
        cVar.a(aVar.matUrl);
        return cVar.c();
    }

    public final boolean b(com.sankuai.waimai.business.page.homepage.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c028197e954a08d7a721127f802deb6c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c028197e954a08d7a721127f802deb6c")).booleanValue() : a(aVar) && d(aVar);
    }

    public final void c(com.sankuai.waimai.business.page.homepage.model.a aVar) {
        Bitmap a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75244e76160d2f6f2b76dca9adb9bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75244e76160d2f6f2b76dca9adb9bbf");
            return;
        }
        com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(this.b);
        cVar.d = aVar.matUrl;
        if (cVar.c()) {
            try {
                InputStream a3 = cVar.a();
                if (a3 != null) {
                    aVar.mimeType = e.a(cVar.a());
                    if (aVar.isGif()) {
                        aVar.gifFileCachePath = cVar.b();
                        a3.close();
                        return;
                    }
                    int l = com.sankuai.waimai.platform.b.A().l();
                    int m = com.sankuai.waimai.platform.b.A().m();
                    if (!aVar.isHalfScreenType()) {
                        if (aVar.isCutPicture()) {
                            a2 = e.a(e.a(a3, l, m, Bitmap.Config.RGB_565), l, m);
                        } else {
                            a2 = e.a(a3, l, m, Bitmap.Config.RGB_565);
                        }
                    } else if (aVar.b / l >= 1.25f) {
                        a2 = e.a(a3, l, (aVar.c * l) / aVar.b, Bitmap.Config.RGB_565);
                    } else {
                        a2 = com.sankuai.waimai.launcher.util.image.a.a(a3);
                    }
                    a3.close();
                    aVar.bitmap = a2;
                    if (a2 == null) {
                        i.d(new com.sankuai.waimai.business.page.common.log.a().a("welcome_splash_show").b("decode_error").b());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public String a(List<com.sankuai.waimai.business.page.homepage.model.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267d53c7c35f65fd35c09c38607d8858", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267d53c7c35f65fd35c09c38607d8858");
        }
        if (list == null || list.size() <= 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (com.sankuai.waimai.business.page.homepage.model.a aVar : list) {
            try {
                jSONArray.put(aVar.a());
            } catch (JSONException unused) {
            }
        }
        return jSONArray.toString();
    }

    public final boolean a(com.sankuai.waimai.business.page.homepage.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f9b76b0345dc75a93c4b4c8931c1fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f9b76b0345dc75a93c4b4c8931c1fc")).booleanValue();
        }
        if (aVar.d == null || aVar.d.isEmpty() || aVar.e == null || aVar.e.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Calendar calendar = Calendar.getInstance();
        long j = (calendar.get(11) * DaBaiBean.DABAI_DATA_EXPIRE_TIME) + (calendar.get(12) * 60) + calendar.get(13);
        Iterator<a.C0796a> it = aVar.d.iterator();
        while (it.hasNext()) {
            a.C0796a next = it.next();
            if (next.b <= currentTimeMillis && next.c >= currentTimeMillis) {
                Iterator<a.C0796a> it2 = aVar.e.iterator();
                while (it2.hasNext()) {
                    a.C0796a next2 = it2.next();
                    if (next2.b <= j && next2.c >= j) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
