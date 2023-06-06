package com.sankuai.waimai.platform.dynamic;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    boolean b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends a.AbstractC1040a {
        @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
        public final String a() {
            return "homepage_head";
        }
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36a2ce158ed214b684a6a335c9ee784", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36a2ce158ed214b684a6a335c9ee784");
            return;
        }
        this.b = true;
        this.b = com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_DYNAMIC_HORN_CONFIG, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(com.meituan.android.cube.pga.dynamic.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4846a36bab8b09309a25bc253c4bdf57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4846a36bab8b09309a25bc253c4bdf57");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("module_id", TextUtils.isEmpty(cVar.a) ? "unknown" : cVar.a);
            jSONObject.put("template_id", TextUtils.isEmpty(cVar.b) ? "unknown" : cVar.b);
            jSONObject.put("native_id", TextUtils.isEmpty(cVar.c) ? "unknown" : cVar.c);
            jSONObject.put("string_data", TextUtils.isEmpty(cVar.d) ? "unknown" : cVar.d);
            jSONObject.put("json_data", cVar.e);
            jSONObject.put("data_type", cVar.f);
            jSONObject.put("template_ph_id", TextUtils.isEmpty(cVar.h) ? "unknown" : cVar.h);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
