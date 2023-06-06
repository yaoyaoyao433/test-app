package com.tencent.open.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import com.tencent.open.utils.j;
import com.tencent.open.utils.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static b a;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private List<Serializable> i = Collections.synchronizedList(new ArrayList());
    private List<Serializable> j = Collections.synchronizedList(new ArrayList());
    private Executor k = j.b();
    private boolean l;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    private b() {
    }

    public void a(String str, Context context) {
        SLog.i("AttaReporter", "init");
        this.b = str;
        this.c = i.a(context);
        this.e = k.d(context, com.tencent.open.utils.f.b());
        this.f = com.tencent.open.utils.f.b();
        this.g = i.b(context) ? "1" : "0";
        this.h = k.c(context, "com.tencent.mobileqq");
        b();
    }

    private void b() {
        while (!this.j.isEmpty()) {
            c cVar = (c) this.j.remove(0);
            cVar.a.put("appid", this.b);
            cVar.a.put("app_name", this.c);
            cVar.a.put(Constants.PARAM_APP_VER, this.e);
            cVar.a.put(Constants.PARAM_PKG_NAME, this.f);
            cVar.a.put("qq_install", this.g);
            cVar.a.put(Constants.PARAM_QQ_VER, this.h);
            cVar.a.put("openid", this.d);
            HashMap<String, String> hashMap = cVar.a;
            hashMap.put("time_appid_openid", cVar.a.get("time") + CommonConstant.Symbol.UNDERLINE + this.b + CommonConstant.Symbol.UNDERLINE + this.d);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(cVar);
            SLog.i("AttaReporter", sb.toString());
            this.i.add(cVar);
        }
    }

    public void a(String str) {
        SLog.i("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.d = str;
    }

    public void a(String str, String str2) {
        a(str, str2, null);
    }

    public void a(String str, String str2, Map<String, Object> map) {
        a(str, str2, "", map);
    }

    public void a(String str, Object obj) {
        a(str, "", obj, null);
    }

    public void a(String str, String str2, Object obj, Map<String, Object> map) {
        c b = b(str, str2, obj, map);
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || com.tencent.open.utils.f.a() == null) {
            SLog.i("AttaReporter", "attaReport cancel appid=" + this.b + ", mAppName=" + this.c + ", context=" + com.tencent.open.utils.f.a() + ", " + b);
            this.j.add(b);
            return;
        }
        a(b);
    }

    private void a(final c cVar) {
        com.sankuai.waimai.launcher.util.aop.b.a(this.k, new Runnable() { // from class: com.tencent.open.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.i.add(cVar);
                if (k.b(com.tencent.open.utils.f.a())) {
                    try {
                        b.this.c();
                        return;
                    } catch (Exception e) {
                        SLog.e("AttaReporter", "Exception", e);
                        return;
                    }
                }
                SLog.i("AttaReporter", "attaReport net disconnect, " + cVar);
            }
        });
    }

    private c b(String str, String str2, Object obj, Map<String, Object> map) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("attaid", "09400051119");
        hashMap.put("token", "9389887874");
        hashMap.put("time_appid_openid", currentTimeMillis + CommonConstant.Symbol.UNDERLINE + this.b + CommonConstant.Symbol.UNDERLINE + this.d);
        hashMap.put("time", String.valueOf(currentTimeMillis));
        hashMap.put("openid", this.d);
        hashMap.put("appid", this.b);
        hashMap.put("app_name", this.c);
        hashMap.put(Constants.PARAM_APP_VER, this.e);
        hashMap.put(Constants.PARAM_PKG_NAME, this.f);
        hashMap.put("os", "AND");
        hashMap.put("os_ver", Build.VERSION.RELEASE);
        hashMap.put("sdk_ver", Constants.SDK_VERSION);
        hashMap.put("model_name", Build.MODEL);
        hashMap.put("interface_name", str);
        hashMap.put("interface_data", str2);
        hashMap.put("interface_result", obj == null ? "" : obj.toString());
        hashMap.put("qq_install", this.g);
        hashMap.put(Constants.PARAM_QQ_VER, this.h);
        if (map != null && !map.isEmpty()) {
            Object obj2 = map.get("reserve1");
            hashMap.put("reserve1", obj2 == null ? "" : obj2.toString());
            Object obj3 = map.get("reserve2");
            hashMap.put("reserve2", obj3 == null ? "" : obj3.toString());
            Object obj4 = map.get("reserve3");
            hashMap.put("reserve3", obj4 == null ? "" : obj4.toString());
            Object obj5 = map.get("reserve4");
            hashMap.put("reserve4", obj5 == null ? "" : obj5.toString());
        }
        return new c(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        SLog.i("AttaReporter", "attaReportAtSubThread");
        if (!this.l) {
            List<Serializable> a2 = g.a().a("report_atta");
            this.l = a2.isEmpty();
            this.i.addAll(a2);
            Iterator<Serializable> it = a2.iterator();
            while (it.hasNext()) {
                SLog.i("AttaReporter", "attaReportAtSubThread from db = " + it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.i.isEmpty()) {
            c cVar = (c) this.i.remove(0);
            if (!b(cVar)) {
                arrayList.add(cVar);
            }
        }
        if (!arrayList.isEmpty()) {
            SLog.i("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                SLog.i("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((c) ((Serializable) it2.next())));
            }
            g.a().a("report_atta", arrayList);
            this.l = false;
        } else if (this.l) {
        } else {
            SLog.i("AttaReporter", "attaReportAtSubThread clear db");
            g.a().b("report_atta");
            this.l = true;
        }
    }

    private boolean b(c cVar) {
        int i = 0;
        do {
            i++;
            try {
                SLog.i("AttaReporter", "doAttaReportItem post " + cVar);
                return com.tencent.open.a.a.a().b("https://h.trace.qq.com/kv", cVar.a).d() == 200;
            } catch (Exception e) {
                SLog.i("AttaReporter", "Exception", e);
                if (i >= 2) {
                    return false;
                }
            }
        } while (i >= 2);
        return false;
    }
}
