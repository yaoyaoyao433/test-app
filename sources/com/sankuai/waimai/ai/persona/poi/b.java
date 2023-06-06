package com.sankuai.waimai.ai.persona.poi;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.h;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.d;
import com.sankuai.waimai.alita.persona.e;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.alita.persona.a implements Runnable {
    public static ChangeQuickRedirect a;
    private e b;
    private com.sankuai.waimai.ai.utils.a c;
    private final int d;
    private volatile boolean e;
    private boolean f;
    private String i;
    private String j;
    private String k;
    private String l;

    @Override // com.sankuai.waimai.alita.persona.a
    public final String a() {
        return "persona_poi_interest";
    }

    @Override // com.sankuai.waimai.alita.persona.a
    @NonNull
    public final String b() {
        return "waimai";
    }

    @Override // com.sankuai.waimai.alita.persona.a
    @NonNull
    public final String c() {
        return "persona_poi_interest";
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4c3aea7329066fb1d748dd54553dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4c3aea7329066fb1d748dd54553dff");
            return;
        }
        this.d = 3000;
        this.f = false;
    }

    public static /* synthetic */ void a(b bVar, AlitaJSValue alitaJSValue, e eVar) {
        Object[] objArr = {alitaJSValue, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "94eb85ad4ffd5b51d310598ce885b82b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "94eb85ad4ffd5b51d310598ce885b82b");
        } else if (eVar == null || alitaJSValue == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("WMAlitaPoiInterestPerso", "TaskListener | onSuccess | invalid input params", new Object[0]);
        } else {
            try {
                com.sankuai.waimai.foundation.utils.log.a.b("WMAlitaPoiInterestPerso", "TaskListener | onSuccess | " + alitaJSValue.stringValue(), new Object[0]);
                JSONObject jSONObject = new JSONObject(alitaJSValue.stringValue()).getJSONObject("data");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("exp_group_name", bVar.k);
                jSONObject3.put("scene_name", bVar.j);
                jSONObject3.put("exp_name", bVar.l);
                jSONObject3.put("jsBundle_id", bVar.i);
                jSONObject2.put("exp_info", jSONObject3);
                eVar.a(jSONObject);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("WMAlitaPoiInterestPerso", e.getMessage(), new Object[0]);
            }
        }
    }

    public static /* synthetic */ void a(b bVar, Exception exc, e eVar) {
        Object[] objArr = {exc, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "2f034f2f12845b9f17ca0c1aac0145ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "2f034f2f12845b9f17ca0c1aac0145ec");
        } else if (eVar == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("WMAlitaPoiInterestPerso", "TaskListener | onFailed | invalid input params", new Object[0]);
        } else {
            try {
                com.sankuai.waimai.foundation.utils.log.a.b("WMAlitaPoiInterestPerso", "TaskListener | onFailed | " + exc.getMessage(), new Object[0]);
                eVar.a();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("WMAlitaPoiInterestPerso", e.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final void a(@Nullable e eVar) {
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f12a26cbfa958570e82747686d5b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f12a26cbfa958570e82747686d5b24");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, "定时运行->", new Object[0]);
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        String str = this.i;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "078066dfba8de88da74afd3be22c049d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "078066dfba8de88da74afd3be22c049d");
        } else {
            d.a().a(str, null, new h() { // from class: com.sankuai.waimai.ai.persona.poi.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                    Object[] objArr3 = {str2, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9d3fe2f778fc211be68730f2f8fa69e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9d3fe2f778fc211be68730f2f8fa69e");
                    } else {
                        b.a(b.this, alitaJSValue, b.this.b);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable Exception exc) {
                    Object[] objArr3 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37bb606d94557c817614367ab95ae08b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37bb606d94557c817614367ab95ae08b");
                    } else {
                        b.a(b.this, exc, b.this.b);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d7a57e055052b7e5bb1845940baafa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d7a57e055052b7e5bb1845940baafa");
        } else if (this.e) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.d("WMAlitaPoiInterestPerso", "start produce", new Object[0]);
            if (!h()) {
                com.sankuai.waimai.foundation.utils.log.a.e("WMAlitaPoiInterestPerso", "配置数据缺失，回调错误", new Object[0]);
                if (this.b != null) {
                    this.b.a();
                }
                return;
            }
            this.e = true;
            this.c = new com.sankuai.waimai.ai.utils.a(PayTask.j, new Handler(), this);
            com.sankuai.waimai.ai.utils.a aVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ai.utils.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "68726c9d44df9ddf5744094a5e9919e9", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "68726c9d44df9ddf5744094a5e9919e9")).booleanValue();
            } else {
                Object[] objArr3 = {0L};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ai.utils.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "01abbbc8452661e3ff8e66d9a33ffebb", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "01abbbc8452661e3ff8e66d9a33ffebb")).booleanValue();
                } else if (!aVar.b) {
                    aVar.b = true;
                    aVar.a(0L);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08bc1f36182a6b711bd42b78b3671926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08bc1f36182a6b711bd42b78b3671926");
            return;
        }
        this.e = false;
        if (this.c != null) {
            com.sankuai.waimai.foundation.utils.log.a.d("WMAlitaPoiInterestPerso", "stop produce , cancel timer", new Object[0]);
            this.c.cancel();
        }
        this.b = null;
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c79994e04e931764957d91260ed717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c79994e04e931764957d91260ed717");
            return;
        }
        if (this.e) {
            com.sankuai.waimai.foundation.utils.log.a.d("WMAlitaPoiInterestPerso", "pause produce", new Object[0]);
            this.f = true;
            e();
        }
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e7e69f674417e4b8a87563069e66d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e7e69f674417e4b8a87563069e66d2");
            return;
        }
        if (this.f) {
            com.sankuai.waimai.foundation.utils.log.a.d("WMAlitaPoiInterestPerso", "resume produce", new Object[0]);
            d();
            this.f = false;
        }
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final void b(final e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f331376172e96cfac49852d7e589185c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f331376172e96cfac49852d7e589185c");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.d("WMAlitaPoiInterestPerso", "update perona produce", new Object[0]);
        if (!h()) {
            com.sankuai.waimai.foundation.utils.log.a.e("WMAlitaPoiInterestPerso", "配置数据缺失，回调错误", new Object[0]);
            if (eVar != null) {
                eVar.a();
                return;
            }
            return;
        }
        d.a().a(this.i, null, new h() { // from class: com.sankuai.waimai.ai.persona.poi.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                Object[] objArr2 = {str, alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99946add123c7fcfa4a5f603f3086f4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99946add123c7fcfa4a5f603f3086f4d");
                } else {
                    b.a(b.this, alitaJSValue, eVar);
                }
            }

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cfa3cb4a36c32cbf13b2d5c1eedf5fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cfa3cb4a36c32cbf13b2d5c1eedf5fb");
                } else {
                    b.a(b.this, exc, eVar);
                }
            }
        });
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0716b51eff7e8a96ada90997730bde62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0716b51eff7e8a96ada90997730bde62")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("poilist_Interactive_Rec", null);
        if (strategy == null) {
            return false;
        }
        this.l = strategy.expName;
        this.k = strategy.groupName;
        this.j = strategy.sceneName;
        Map<String, String> params = strategy.getParams();
        if (params == null) {
            return false;
        }
        this.i = params.get(Constants.JSBundleConstants.KEY_BUNDLE_ID);
        return !TextUtils.isEmpty(this.i);
    }
}
