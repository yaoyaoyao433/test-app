package com.sankuai.xm.network.analyse;

import android.support.v4.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements com.sankuai.xm.base.feedback.c {
    public static ChangeQuickRedirect a;
    public static LruCache<Long, String> b = new LruCache<>(20);
    private volatile String c;
    private volatile boolean d;
    private Set<String> e;
    private Set<String> f;
    private JSONObject g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998e460ad1f1696908f0f67d311b488c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998e460ad1f1696908f0f67d311b488c");
        } else {
            ((l) m.a(l.class)).a(com.sankuai.xm.base.feedback.c.class).a((l.a) this);
        }
    }

    @Override // com.sankuai.xm.base.feedback.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90255b8f01fbe87f751ff0f757ee4068", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90255b8f01fbe87f751ff0f757ee4068");
            return;
        }
        Map<Long, String> snapshot = b.snapshot();
        b.evictAll();
        if (snapshot.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("---------------------------feedback:recent api------------------------------");
        for (Map.Entry<Long, String> entry : snapshot.entrySet()) {
            sb.append("\n");
            sb.append(entry.getValue());
            if (sb.length() > 2000) {
                com.sankuai.xm.network.b.b(sb.toString(), new Object[0]);
                sb = new StringBuilder();
            }
        }
        com.sankuai.xm.network.b.b(sb.toString(), new Object[0]);
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f0c1bd7cc1de3fb66feafb28438e86", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f0c1bd7cc1de3fb66feafb28438e86")).booleanValue();
        }
        c();
        return this.d;
    }

    public final boolean a(String str) {
        int optInt;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9623045a0e03b0065bf8a512a0fa35", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9623045a0e03b0065bf8a512a0fa35")).booleanValue();
        }
        c();
        synchronized (this) {
            optInt = this.g == null ? -999 : this.g.optInt("appstate", -999);
        }
        return (optInt == -999 || optInt == f.m().j()) && b(str);
    }

    private void c() {
        HashSet hashSet;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666ee57776db870cda3f6d2659ee0e5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666ee57776db870cda3f6d2659ee0e5e");
        } else if (this.c == null) {
            this.c = com.sankuai.xm.base.hornconfig.a.a().a("log_control");
            try {
                if (ac.a(this.c)) {
                    return;
                }
                com.sankuai.xm.network.b.a("ApiDetectorConfig::loadConfig, %s", this.c);
                JSONObject jSONObject = new JSONObject(this.c);
                this.d = jSONObject.optBoolean(MarketingModel.TYPE_ENTER_DIALOG, false);
                if (this.d) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("core_api_whitelist");
                    HashSet hashSet2 = null;
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            hashSet.add(optJSONArray.optString(i));
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("other_api_whitelist");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet2 = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            hashSet2.add(optJSONArray2.optString(i2));
                        }
                    }
                    synchronized (this) {
                        this.g = jSONObject.optJSONObject("condition");
                        this.e = hashSet;
                        this.f = hashSet2;
                    }
                }
            } catch (Exception e) {
                com.sankuai.xm.network.b.a(e);
            }
        }
    }

    private boolean b(String str) {
        boolean a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ef6aee9d33389015d62771ef6e9017", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ef6aee9d33389015d62771ef6e9017")).booleanValue();
        }
        if (ac.a(str)) {
            return false;
        }
        String replace = str.replace(com.sankuai.xm.network.setting.f.a().b().a(false), "");
        if (ac.a(replace)) {
            return false;
        }
        synchronized (this) {
            a2 = com.sankuai.xm.base.util.b.a(replace, this.e, this.f);
        }
        return a2;
    }
}
