package com.sankuai.waimai.irmo.mach.effect;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.effect.bean.EffectBreathingLightConfig;
import com.sankuai.waimai.irmo.mach.effect.bean.EffectGyroConfig;
import com.sankuai.waimai.irmo.mach.effect.bean.EffectZoomConfig;
import com.sankuai.waimai.irmo.mach.effect.mgr.c;
import com.sankuai.waimai.irmo.mach.effect.mgr.e;
import com.sankuai.waimai.irmo.mach.effect.mgr.f;
import com.sankuai.waimai.irmo.mach.effect.mgr.g;
import com.sankuai.waimai.mach.parser.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements g<ViewGroup> {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public d d;
    private int e;
    private List<g<ViewGroup>> f;

    public b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7b904d86e423fa6bd4113a24724b97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7b904d86e423fa6bd4113a24724b97");
            return;
        }
        this.c = -1;
        this.f = new ArrayList();
        if (map == null) {
            return;
        }
        if (map.containsKey("effect-config")) {
            this.b = map.get("effect-config").toString();
        }
        if (map.containsKey("effect-action")) {
            this.c = com.sankuai.waimai.mach.utils.g.c(map.get("effect-action").toString());
        }
        Object obj = map.get("@effect-callback");
        if (obj instanceof d) {
            this.d = (d) obj;
        }
    }

    private g<ViewGroup> a(int i, @NonNull JSONObject jSONObject) {
        g<ViewGroup> fVar;
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c681ffe70df2a390260dadb86327330", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c681ffe70df2a390260dadb86327330");
        }
        try {
        } catch (JsonSyntaxException e) {
            com.sankuai.waimai.foundation.utils.log.a.a("WmEffectGroupManager", e);
        }
        if (i == 999) {
            fVar = new f((EffectZoomConfig) new Gson().fromJson(jSONObject.toString(), (Class<Object>) EffectZoomConfig.class));
        } else {
            switch (i) {
                case 1002:
                    fVar = new e((EffectGyroConfig) new Gson().fromJson(jSONObject.toString(), (Class<Object>) EffectGyroConfig.class));
                    break;
                case 1003:
                    fVar = new com.sankuai.waimai.irmo.mach.effect.mgr.d();
                    break;
                case 1004:
                    fVar = new c((EffectBreathingLightConfig) new Gson().fromJson(jSONObject.toString(), (Class<Object>) EffectBreathingLightConfig.class));
                    break;
                default:
                    return null;
            }
        }
        return fVar;
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d1d2556f606ed0cb90f7e5b77e50ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d1d2556f606ed0cb90f7e5b77e50ea");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.a();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882d9038be87bee9c1e1f64ab5dc3778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882d9038be87bee9c1e1f64ab5dc3778");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.b();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d26cefed27792debed1023ee68b28e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d26cefed27792debed1023ee68b28e");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.c();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c28f53b051e88b484fffd6b36268d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c28f53b051e88b484fffd6b36268d9");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.d();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ebe3bf4fb958e78dc9fe8cf82ec36e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ebe3bf4fb958e78dc9fe8cf82ec36e");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.a((g<ViewGroup>) viewGroup);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(com.sankuai.waimai.mach.node.a<ViewGroup> aVar) {
        g<ViewGroup> a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ff8cadf82350143a5112674efd8f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ff8cadf82350143a5112674efd8f8e");
        } else if (this.b != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.b);
                if (jSONObject.has("effectMode")) {
                    this.e = jSONObject.getInt("effectMode");
                }
                JSONArray jSONArray = jSONObject.has("effects") ? jSONObject.getJSONArray("effects") : null;
                if (jSONArray == null) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null && (a2 = a(jSONObject2.optInt("effectType"), jSONObject2)) != null) {
                        this.f.add(a2);
                    }
                }
                b(aVar);
                a(this.d);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a("WmEffectGroupManager", e);
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85b74646fa78606860ddf13bd2659c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85b74646fa78606860ddf13bd2659c7");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.e();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7089a98765380de8e2f2c882d054d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7089a98765380de8e2f2c882d054d8e");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.a(dVar);
        }
    }

    private void b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccfdc8daef02568a605d525f7ff618a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccfdc8daef02568a605d525f7ff618a9");
            return;
        }
        for (g<ViewGroup> gVar : this.f) {
            gVar.a(aVar);
        }
    }
}
