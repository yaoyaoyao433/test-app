package com.sankuai.xm.file.proxy;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.xm.base.util.q;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends q {
    public static ChangeQuickRedirect h;
    private static d j;
    public com.sankuai.xm.network.setting.e i;
    private HashSet<String> k;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b87574130fbe18ef02b0237987c98a55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b87574130fbe18ef02b0237987c98a55");
            return;
        }
        this.i = com.sankuai.xm.network.setting.e.ENV_RELEASE;
        this.k = new HashSet<>();
    }

    public static d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f463470e782ab11e3123353d46413020", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f463470e782ab11e3123353d46413020");
        }
        if (j == null) {
            synchronized (d.class) {
                if (j == null) {
                    j = new d();
                }
            }
        }
        return j;
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        JSONArray optJSONArray;
        com.sankuai.xm.network.setting.e eVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a93685ac93e91a726d8d3ca83bf1ce5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a93685ac93e91a726d8d3ca83bf1ce5");
            return;
        }
        JSONObject jSONObject = this.f;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("file_config")) == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            String optString = jSONObject2.optString("env");
            Object[] objArr2 = {optString};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76f050b8331039398b0fd178ed4c3be8", 6917529027641081856L)) {
                eVar = (com.sankuai.xm.network.setting.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76f050b8331039398b0fd178ed4c3be8");
            } else if (TextUtils.equals(optString, "test")) {
                eVar = com.sankuai.xm.network.setting.e.ENV_TEST;
            } else if (TextUtils.equals(optString, "staging")) {
                eVar = com.sankuai.xm.network.setting.e.ENV_STAGING;
            } else {
                eVar = com.sankuai.xm.network.setting.e.ENV_RELEASE;
            }
            if (eVar == this.i) {
                boolean equalsIgnoreCase = jSONObject2.optString(MarketingModel.TYPE_ENTER_DIALOG).equalsIgnoreCase("true");
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("url");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        String string = optJSONArray2.getString(i2);
                        if (!TextUtils.isEmpty(string)) {
                            hashSet.add(string);
                        }
                    }
                }
                f.a(equalsIgnoreCase);
                f.a(hashSet);
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf114f08eb6501f87b4417b8a4e9159f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf114f08eb6501f87b4417b8a4e9159f");
        } else {
            a("url_white_list", false, false);
        }
    }

    public void a(HashSet<String> hashSet) {
        Object[] objArr = {hashSet};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabab61bef5441c0050783b095c5f53a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabab61bef5441c0050783b095c5f53a");
            return;
        }
        synchronized (this) {
            hashSet.addAll(this.k);
        }
    }
}
