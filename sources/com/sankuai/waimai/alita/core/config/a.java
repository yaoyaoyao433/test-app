package com.sankuai.waimai.alita.core.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.dataupload.AlitaModelDataUploadConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.alita.core.config.observabledata.c<String> b;
    public com.sankuai.waimai.alita.core.config.observabledata.c<String> c;
    public com.sankuai.waimai.alita.core.config.observabledata.c<String> d;
    public com.sankuai.waimai.alita.core.config.observabledata.c<AlitaModelDataUploadConfig> e;
    C0699a f;
    public com.sankuai.waimai.alita.core.config.observabledata.c<String> g;
    public com.sankuai.waimai.alita.core.config.observabledata.c<com.sankuai.waimai.alita.core.featuredatareport.a> h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be0938f49e8bde2db39bafdddf3575f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be0938f49e8bde2db39bafdddf3575f");
            return;
        }
        this.b = new com.sankuai.waimai.alita.core.config.observabledata.c<>();
        this.c = new com.sankuai.waimai.alita.core.config.observabledata.c<>();
        this.d = new com.sankuai.waimai.alita.core.config.observabledata.c<>();
        this.e = new com.sankuai.waimai.alita.core.config.observabledata.c<>();
        this.f = new C0699a();
        this.g = new com.sankuai.waimai.alita.core.config.observabledata.c<>();
        this.h = new com.sankuai.waimai.alita.core.config.observabledata.c<>();
    }

    public final void a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f97ec36962b370024a05cab5b7eea5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f97ec36962b370024a05cab5b7eea5d");
            return;
        }
        a("alita_feature_js_list", jSONObject, this.b);
        a("alita_operator_js_list", jSONObject, this.c);
        a("alita_strategy_js_list", jSONObject, this.d);
        a("alita_custom_config", jSONObject, this.g);
        com.sankuai.waimai.alita.core.config.observabledata.c<AlitaModelDataUploadConfig> cVar = this.e;
        Object[] objArr2 = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf64d4f8a8550f23e04142d129664e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf64d4f8a8550f23e04142d129664e21");
        } else if (jSONObject != null && !TextUtils.isEmpty("alita_report_model_list") && (optJSONArray = jSONObject.optJSONArray("alita_report_model_list")) != null) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                AlitaModelDataUploadConfig a2 = AlitaModelDataUploadConfig.a(optJSONArray.optJSONObject(i));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            cVar.a((List<AlitaModelDataUploadConfig>) arrayList);
        }
        C0699a c0699a = this.f;
        Object[] objArr3 = {jSONObject, c0699a};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d867a4e002b7e3c47623afa1c874374b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d867a4e002b7e3c47623afa1c874374b");
        } else if (jSONObject != null && !TextUtils.isEmpty("alita_switch_config") && (optJSONObject = jSONObject.optJSONObject("alita_switch_config")) != null) {
            Object[] objArr4 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect4 = C0699a.a;
            if (PatchProxy.isSupport(objArr4, c0699a, changeQuickRedirect4, false, "78a9aed62c5a0a01df3e5d04198a4faf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, c0699a, changeQuickRedirect4, false, "78a9aed62c5a0a01df3e5d04198a4faf");
            } else if (optJSONObject != null) {
                c0699a.b.b((com.sankuai.waimai.alita.core.config.observabledata.b) Integer.valueOf(optJSONObject.optInt("close_model_predict")));
                c0699a.c.b((com.sankuai.waimai.alita.core.config.observabledata.b) Integer.valueOf(optJSONObject.optInt("close_js_calculate")));
                c0699a.d.b((com.sankuai.waimai.alita.core.config.observabledata.b) Integer.valueOf(optJSONObject.optInt("close_autorun")));
                c0699a.e.b((com.sankuai.waimai.alita.core.config.observabledata.b) Integer.valueOf(optJSONObject.optInt("close_data_download")));
                c0699a.f.b((com.sankuai.waimai.alita.core.config.observabledata.b) Integer.valueOf(optJSONObject.optInt("enable_log")));
                c0699a.g.b((com.sankuai.waimai.alita.core.config.observabledata.b) Integer.valueOf(optJSONObject.optInt("enable_sql_compatible")));
            }
        }
        a(jSONObject, this.h);
    }

    private void a(String str, @Nullable JSONObject jSONObject, @NonNull com.sankuai.waimai.alita.core.config.observabledata.c<String> cVar) {
        JSONArray optJSONArray;
        Object[] objArr = {str, jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e7f1f92ec814998506dab76b4cced2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e7f1f92ec814998506dab76b4cced2");
        } else if (jSONObject != null && !TextUtils.isEmpty(str) && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object opt = optJSONArray.opt(i);
                if (opt instanceof String) {
                    arrayList.add((String) opt);
                }
            }
            cVar.a((List<String>) arrayList);
        }
    }

    private void a(@Nullable JSONObject jSONObject, @NonNull com.sankuai.waimai.alita.core.config.observabledata.c<com.sankuai.waimai.alita.core.featuredatareport.a> cVar) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1073ff789438c44e5415a2be54d43516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1073ff789438c44e5415a2be54d43516");
            return;
        }
        String str = com.sankuai.waimai.alita.core.featuredatareport.a.b;
        if (jSONObject == null || TextUtils.isEmpty("alita_feature_data_report") || (optJSONArray = jSONObject.optJSONArray("alita_feature_data_report")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            com.sankuai.waimai.alita.core.featuredatareport.a a2 = com.sankuai.waimai.alita.core.featuredatareport.a.a(optJSONArray.optJSONObject(i));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        cVar.a((List<com.sankuai.waimai.alita.core.featuredatareport.a>) arrayList);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0699a {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.alita.core.config.observabledata.b b;
        com.sankuai.waimai.alita.core.config.observabledata.b c;
        com.sankuai.waimai.alita.core.config.observabledata.b d;
        com.sankuai.waimai.alita.core.config.observabledata.b e;
        com.sankuai.waimai.alita.core.config.observabledata.b f;
        com.sankuai.waimai.alita.core.config.observabledata.b g;

        public C0699a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54630e542c02bf096f22d8886b90edf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54630e542c02bf096f22d8886b90edf");
                return;
            }
            this.b = new com.sankuai.waimai.alita.core.config.observabledata.b();
            this.c = new com.sankuai.waimai.alita.core.config.observabledata.b();
            this.d = new com.sankuai.waimai.alita.core.config.observabledata.b();
            this.e = new com.sankuai.waimai.alita.core.config.observabledata.b();
            this.f = new com.sankuai.waimai.alita.core.config.observabledata.b();
            this.g = new com.sankuai.waimai.alita.core.config.observabledata.b();
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72895a4cd22b5f90262f2316e1ed209", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72895a4cd22b5f90262f2316e1ed209");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("close_model_predict", this.b.a());
                jSONObject.putOpt("close_js_calculate", this.c.a());
                jSONObject.putOpt("close_autorun", this.d.a());
                jSONObject.putOpt("close_data_download", this.e.a());
                jSONObject.putOpt("enable_log", this.f.a());
                jSONObject.putOpt("enable_sql_compatible", this.g.a());
                return jSONObject.toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
