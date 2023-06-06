package com.tencent.map.geolocation.a.a;

import android.content.Context;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i implements Runnable {
    private Context a;
    private List<a> b;
    private List<a> c = null;
    private c d;
    private boolean e;

    public i(Context context, List<a> list) {
        this.b = null;
        this.d = null;
        this.e = false;
        this.a = context;
        this.e = false;
        this.b = new ArrayList();
        this.b.addAll(list);
        this.d = new c(this.a);
    }

    private boolean a(String str) {
        boolean z;
        String c = com.tencent.map.geolocation.a.b.h.c(com.tencent.map.geolocation.a.b.c.b(str, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
        if (c == null) {
            return false;
        }
        this.c = com.tencent.map.geolocation.a.b.h.b(c);
        List<a> b = com.tencent.map.geolocation.a.b.h.b(com.tencent.map.geolocation.a.b.h.b(this.a, "__bad_dex_info__", "preference_default"));
        boolean a = !b.isEmpty() ? com.tencent.map.geolocation.a.b.b.a(b, this.c) : false;
        List<a> list = this.b;
        List<a> list2 = this.c;
        boolean z2 = true;
        for (a aVar : list) {
            Iterator<a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                a next = it.next();
                if (!next.c.contains(".dex")) {
                    next.c += ".dex";
                }
                if (aVar.c.equals(next.c) && aVar.d == next.d && aVar.e.equals(next.e)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        List<a> b2 = com.tencent.map.geolocation.a.b.h.b(com.tencent.map.geolocation.a.b.h.b(this.a, "__SP_UPDATE_TencentLoc_COMP_INFO__", "preference_default"));
        boolean a2 = !b2.isEmpty() ? com.tencent.map.geolocation.a.b.b.a(b2, this.c) : false;
        e.a(this.a).a("DRG", "need and samebad:" + z2 + CommonConstant.Symbol.COMMA + a);
        if (z2 || a || a2) {
            return false;
        }
        e.a(this.a).a("DRG", "to download:".concat(String.valueOf(c)));
        c cVar = this.d;
        List<a> list3 = this.c;
        synchronized (cVar) {
            cVar.a = list3;
        }
        if (cVar.b != 1) {
            new Thread(cVar).start();
        }
        return true;
    }

    private boolean a() {
        byte[] bytes;
        String b = b();
        if (b != null && (bytes = b.getBytes()) != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                byte[] a = com.tencent.map.geolocation.a.b.f.a("https://cc.map.qq.com?desc_c", bytes);
                if (a != null) {
                    String str = new String(a);
                    e.a(this.a).a("DRG", "response suc,try:".concat(String.valueOf(i2)));
                    return a(str);
                }
                com.tencent.map.geolocation.a.b.h.a(10000L);
                i = i2;
            }
        }
        return false;
    }

    private String b() {
        JSONObject jSONObject = new JSONObject();
        String str = this.a.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
        try {
            jSONObject.put("appkey", com.tencent.map.geolocation.a.b.h.c(this.a));
            jSONObject.put("appversion", com.tencent.map.geolocation.a.b.h.a(this.a));
            jSONObject.put("imei", com.tencent.map.geolocation.a.b.g.a(this.a));
            jSONObject.put("coverSDKver", h.a);
            jSONObject.put("model", com.tencent.map.geolocation.a.b.g.c() + CommonConstant.Symbol.UNDERLINE + com.tencent.map.geolocation.a.b.g.b());
            jSONObject.put("APILevel", com.tencent.map.geolocation.a.b.g.d());
            JSONArray jSONArray = new JSONArray();
            if (this.b != null) {
                for (a aVar : this.b) {
                    if (aVar != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("compId", aVar.a);
                        jSONObject2.put("compVer", aVar.b);
                        jSONObject2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, aVar.d);
                        jSONObject2.put("md5", com.tencent.map.geolocation.a.b.h.b(new File(str, aVar.c)));
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("compList", jSONArray);
            String jSONObject3 = jSONObject.toString();
            e.a(this.a).a("DRG", "req:".concat(String.valueOf(jSONObject3)));
            return com.tencent.map.geolocation.a.b.c.a(jSONObject3, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q");
        } catch (Exception e) {
            e.a(this.a).a("DRG", "reqDerror:" + e.toString());
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = System.currentTimeMillis() - com.tencent.map.geolocation.a.b.h.b(this.a, "__last_check_update_time__", (Long) 0L).longValue() > DDLoadConstants.TIME_HOURS_MILLIS;
        e a = e.a(this.a);
        a.a("DRG", "t:" + z + ",i:" + this.e);
        boolean a2 = a();
        com.tencent.map.geolocation.a.b.h.a(this.a, "__last_check_update_time__", Long.valueOf(System.currentTimeMillis()));
        e.a(this.a).b();
        if (a2) {
            return;
        }
        d.a(this.a).b("load");
    }
}
