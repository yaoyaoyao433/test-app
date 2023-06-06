package com.sankuai.waimai.alita.bundle.model;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.d;
import com.sankuai.waimai.alita.core.event.autorunner.e;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.FeatureConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.ModelConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public b e;
    public boolean f;
    public C0695a g;
    public e h;
    public ModelConfig i;
    public FeatureConfig j;
    public TensorConfig k;
    private String l;

    public a(b bVar, String str) {
        e eVar;
        C0695a c0695a;
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f9952cb676e15ff1f45de8a1c841e7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f9952cb676e15ff1f45de8a1c841e7d");
            return;
        }
        this.c = str;
        this.d = bVar.c;
        this.e = bVar;
        if (this.e.k != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2da1164a93f66522c4d32f3ef239be72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2da1164a93f66522c4d32f3ef239be72");
                return;
            }
            try {
                this.i = ModelConfig.fromJson(new JSONObject(d.a(this.e.k)));
                if (ModelConfig.ModelFileType.TYPE_ALITA_JS.equals(this.i.getModelFileType())) {
                    this.b = d.a(this.e.j);
                }
            } catch (Exception unused) {
            }
            try {
                this.j = FeatureConfig.fromJson(new JSONObject(d.a(this.e.m)));
            } catch (Exception unused2) {
            }
            try {
                this.k = TensorConfig.fromJson(new JSONObject(d.a(this.e.l)));
                return;
            } catch (Exception unused3) {
                return;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f5e2f9b565de3b2844888771634145f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f5e2f9b565de3b2844888771634145f");
            return;
        }
        this.l = d.a(this.e.e);
        this.b = d.a(this.e.f);
        d.a(this.e.g);
        e.a aVar = null;
        try {
            JSONObject jSONObject = new JSONObject(d.a(this.e.h));
            Object[] objArr4 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect4 = C0695a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "61cbb512062cd1d2f27ba528f5abff4a", RobustBitConfig.DEFAULT_VALUE)) {
                c0695a = (C0695a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "61cbb512062cd1d2f27ba528f5abff4a");
            } else {
                c0695a = new C0695a();
                c0695a.b = jSONObject.optInt("bundleType", 0);
                c0695a.c = jSONObject.optString("bundleScene", "");
            }
            this.g = c0695a;
        } catch (Exception unused4) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject(d.a(this.e.i));
            Object[] objArr5 = {jSONObject2};
            ChangeQuickRedirect changeQuickRedirect5 = e.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "bf0332b7ecbce3031e37ab83521680ee", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "bf0332b7ecbce3031e37ab83521680ee");
            } else {
                eVar = new e();
                e.d<e.c> dVar = new e.d<e.c>() { // from class: com.sankuai.waimai.alita.core.event.autorunner.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.event.autorunner.e.d
                    @Nullable
                    public final /* synthetic */ c a(@Nullable JSONObject jSONObject3) {
                        Object[] objArr6 = {jSONObject3};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "11bde56cdbee267cbad62bb8bc6997ae", RobustBitConfig.DEFAULT_VALUE)) {
                            return (c) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "11bde56cdbee267cbad62bb8bc6997ae");
                        }
                        Object[] objArr7 = {jSONObject3};
                        ChangeQuickRedirect changeQuickRedirect7 = c.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "992e4eb3fcf5945f659e87ba492f2e2f", RobustBitConfig.DEFAULT_VALUE)) {
                            return (c) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "992e4eb3fcf5945f659e87ba492f2e2f");
                        }
                        if (jSONObject3 != null) {
                            c cVar = new c();
                            cVar.b = jSONObject3.optString("eventType");
                            cVar.c = jSONObject3.optString("cid");
                            cVar.d = jSONObject3.optString("ref_cid");
                            cVar.e = jSONObject3.optString("bid");
                            cVar.f = jSONObject3.optString("msid");
                            cVar.g = jSONObject3.optLong("tm");
                            cVar.h = jSONObject3.optInt("report_source");
                            cVar.i = jSONObject3.optString("category");
                            cVar.j = jSONObject3.optLong("seq");
                            cVar.k = jSONObject3.optLong("min_duration");
                            cVar.l = jSONObject3.optLong("max_duration");
                            cVar.m = jSONObject3.optLong("min_life_time");
                            cVar.n = jSONObject3.optLong("max_life_time");
                            cVar.o = jSONObject3.optString("attach_param");
                            cVar.p = jSONObject3.optLong("time_window");
                            return cVar;
                        }
                        return null;
                    }
                };
                eVar.b = e.a(jSONObject2.optJSONArray("start_event"), dVar);
                eVar.c = e.a(jSONObject2.optJSONArray("run_event"), dVar);
                eVar.d = e.C0702e.a(jSONObject2.optJSONObject("run_loop"));
                eVar.e = e.a(jSONObject2.optJSONArray("sleep_event"), dVar);
                eVar.f = e.b.a(jSONObject2.optJSONObject("sleep_count"));
                eVar.g = e.a(jSONObject2.optJSONArray("dead_event"), dVar);
                eVar.h = e.b.a(jSONObject2.optJSONObject("dead_count"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("back_trace_config");
                Object[] objArr6 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect6 = e.a.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "333ea8d9c2ff3f818d97e38af38ce908", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (e.a) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "333ea8d9c2ff3f818d97e38af38ce908");
                } else if (optJSONObject != null) {
                    String optString = optJSONObject.optString(Constants.SQLConstants.KEY_WHERE);
                    long optLong = optJSONObject.optLong("time");
                    int optInt = optJSONObject.optInt("count");
                    if (!TextUtils.isEmpty(Constants.SQLConstants.KEY_WHERE) && optLong > 0 && optInt > 0) {
                        aVar = new e.a();
                        aVar.b = optString;
                        aVar.c = optLong;
                        aVar.d = optInt;
                    }
                }
                eVar.i = aVar;
            }
            this.h = eVar;
        } catch (Exception unused5) {
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f836d907f0ea5a5301bbc9a1f46d65de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f836d907f0ea5a5301bbc9a1f46d65de")).booleanValue() : !TextUtils.isEmpty(this.b);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0695a {
        public static ChangeQuickRedirect a;
        public int b;
        public String c;

        public C0695a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ed7ed6bbcb35afcbd130f9397bc010", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ed7ed6bbcb35afcbd130f9397bc010");
            } else {
                this.b = 0;
            }
        }
    }
}
