package com.unionpay.mobile.android.hce;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import com.unionpay.mobile.android.plugin.BaseActivity;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.tsmservice.data.ResultCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class f {
    private static final Object w = new Object();
    private Context a;
    private com.unionpay.mobile.android.fully.a b;
    private Handler c;
    private String d;
    private String e;
    private int f = 0;
    private int g = 0;
    private int h = 10;
    private int i = 1000;
    private String j = "hce";
    private String k = "";
    private String m = "";
    private HashMap<String, k> n = new HashMap<>(0);
    private List<k> o = new ArrayList(0);
    private HashMap<Integer, k> p = new HashMap<>(0);
    private int q = 0;
    private int r = 1;
    private int s = 0;
    private int t = 5;
    private ConcurrentHashMap<String, d> u = new ConcurrentHashMap<>(0);
    private ConcurrentHashMap<String, l> v = new ConcurrentHashMap<>(0);
    private final Handler.Callback x = new g(this);
    private Handler y = new Handler(this.x);
    private String l = "20150801000000000000";

    public f(Context context) {
        this.a = context;
        this.b = (com.unionpay.mobile.android.fully.a) ((BaseActivity) context).a(UPPayEngine.class.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(f fVar) {
        for (Map.Entry<String, k> entry : fVar.n.entrySet()) {
            k value = entry.getValue();
            if (!value.a()) {
                String b = value.b();
                String e = value.e();
                if (com.unionpay.mobile.android.utils.c.a(fVar.a, b) && e.equalsIgnoreCase(com.unionpay.mobile.android.utils.c.b(fVar.a, b))) {
                    fVar.q++;
                    fVar.p.put(Integer.valueOf(fVar.q), value);
                    fVar.v.put(b, new l(b));
                    fVar.u.put(b, new d(b));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(f fVar, String str) {
        d dVar = fVar.u.get(str);
        l lVar = fVar.v.get(str);
        if (dVar.a() && lVar.a()) {
            fVar.y.removeMessages(2006, str);
            String c = lVar.c();
            com.unionpay.mobile.android.hce.service.a b = lVar.b();
            String c2 = dVar.c();
            ServiceConnection d = dVar.d();
            if (c != null && !TextUtils.isEmpty(c) && c2 != null && !TextUtils.isEmpty(c2)) {
                String a = a.a(c2, c);
                com.unionpay.mobile.android.utils.k.c("uppay-hce", str + " card after: " + a);
                try {
                    JSONArray jSONArray = new JSONArray(a);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj = jSONArray.get(i);
                        if (obj != null) {
                            JSONObject jSONObject = (JSONObject) obj;
                            if (com.unionpay.mobile.android.model.b.bb == null) {
                                com.unionpay.mobile.android.model.b.bb = new ArrayList(1);
                            }
                            c cVar = new c(jSONObject, c, b, d);
                            boolean z = false;
                            for (int i2 = 0; com.unionpay.mobile.android.model.b.bb != null && i2 < com.unionpay.mobile.android.model.b.bb.size(); i2++) {
                                if (!TextUtils.isEmpty(cVar.a()) && cVar.a().equalsIgnoreCase(com.unionpay.mobile.android.model.b.bb.get(i2).a())) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                com.unionpay.mobile.android.model.b.bb.add(cVar);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dVar.f();
            fVar.u.put(str, dVar);
            lVar.e();
            fVar.v.put(str, lVar);
            synchronized (w) {
                fVar.s--;
            }
            fVar.b();
        }
        for (Map.Entry<String, d> entry : fVar.u.entrySet()) {
            if (!entry.getValue().b()) {
                return;
            }
        }
        com.unionpay.mobile.android.utils.k.c("uppay", "hce finished !!!!!!!!!!!!");
        com.unionpay.mobile.android.model.b.bl = true;
        if (fVar.c != null) {
            fVar.c.sendMessage(fVar.c.obtainMessage(0));
        }
    }

    private boolean a(Bundle bundle) {
        String string = bundle.getString("action_resp_code");
        String string2 = bundle.getString("action_resp_message");
        if ("0000".equalsIgnoreCase(string) && string2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(string2);
                String a = com.unionpay.mobile.android.utils.j.a(jSONObject, "resp");
                com.unionpay.mobile.android.utils.j.a(jSONObject, "msg");
                JSONObject c = com.unionpay.mobile.android.utils.j.c(jSONObject, "params");
                if (a.equalsIgnoreCase("00")) {
                    this.d = com.unionpay.mobile.android.utils.j.c(c, "signature").toString();
                    JSONArray d = com.unionpay.mobile.android.utils.j.d(c, "configs");
                    if (d != null) {
                        for (int i = 0; i < d.length(); i++) {
                            this.o.add(new k(d.getJSONObject(i)));
                            this.m = com.unionpay.mobile.android.utils.j.a(c, "version");
                        }
                    }
                    int intValue = Integer.decode(com.unionpay.mobile.android.utils.j.a(c, "total_count")).intValue();
                    if (intValue > this.h) {
                        this.g = intValue / this.h;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2) {
        i iVar = new i(this, str, str2);
        d dVar = new d(str);
        dVar.a(iVar);
        this.u.put(str, dVar);
        try {
            Intent intent = new Intent();
            intent.setAction("com.unionpay.uppay.action.HCE");
            intent.setPackage(str);
            this.a.startService(intent);
            return this.a.bindService(intent, iVar, 1);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action_resp_code", "0000");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", "1.9");
            jSONObject.put("cmd", this.j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("params", jSONObject2);
            jSONObject2.put("base_version", str);
            bundle.putString("action_resp_message", this.b.a(jSONObject.toString()));
            a(bundle);
            this.f++;
            if (this.f <= this.g) {
                d(this.l);
            }
            return bundle;
        } catch (JSONException unused) {
            bundle.putString("action_resp_code", ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k(f fVar) {
        if (!TextUtils.isEmpty(fVar.m)) {
            for (k kVar : fVar.o) {
                fVar.n.put(kVar.b(), kVar);
            }
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, k> entry : fVar.n.entrySet()) {
                jSONArray.put(entry.getValue().f());
            }
            PreferenceUtils.a(fVar.a, fVar.m, "hce_version");
            PreferenceUtils.a(fVar.a, jSONArray.toString(), "hce_info");
        }
        if (TextUtils.isEmpty(fVar.k) || fVar.n == null || fVar.n.size() <= 0) {
            return;
        }
        Iterator<Map.Entry<String, k>> it = fVar.n.entrySet().iterator();
        while (it.hasNext()) {
            if (!fVar.k.equals(it.next().getValue().c())) {
                it.remove();
            }
        }
    }

    public final void a() {
        this.f = 1;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(Handler handler) {
        this.c = handler;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.j = str;
    }

    public final void b() {
        if (this.q == 0) {
            com.unionpay.mobile.android.model.b.bl = true;
            if (this.c != null) {
                this.c.sendMessage(this.c.obtainMessage(0));
                return;
            }
            return;
        }
        synchronized (w) {
            for (int i = this.r; i <= this.q && this.s < this.t; i++) {
                k kVar = this.p.get(Integer.valueOf(i));
                String b = kVar.b();
                String d = kVar.d();
                this.s++;
                new h(this, b, d).start();
                this.r++;
            }
        }
    }

    public final void b(int i) {
        if (i > 0) {
            this.i = i;
        }
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void c() {
        if (com.unionpay.mobile.android.model.b.bb != null) {
            com.unionpay.mobile.android.model.b.bb.clear();
            com.unionpay.mobile.android.model.b.bb = null;
        }
        String a = PreferenceUtils.a(this.a, "hce_version");
        if (!TextUtils.isEmpty(a)) {
            this.l = a;
        }
        String a2 = PreferenceUtils.a(this.a, "hce_info");
        if (TextUtils.isEmpty(a2)) {
            a2 = "[{\"package\":\"com.yitong.mbank0408\",\"issuer\":\"64083300\",\"syn_key\":\"0123456789ABCDEF1010101010101010\",\"pub_key\":\"268576AF6F50DA40196E18D6E059D2A721373638\",\"status\":\"I\",\"priority\":\"1\"}]";
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            for (int i = 0; i < jSONArray.length(); i++) {
                k kVar = new k(jSONArray.getJSONObject(i));
                this.n.put(kVar.b(), kVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(new j(this)).start();
    }

    public final void c(int i) {
        if (i > 0) {
            this.t = i;
        }
    }

    public final void c(String str) {
        this.k = str;
    }
}
