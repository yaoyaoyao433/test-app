package com.sankuai.waimai.business.page.home.list.future.mach.transitionanimation;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.mach.utils.g;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public Map e;
    public int f;
    public d g;
    public String h;
    public int i;
    public int j;
    public long k;
    public long l;

    public b(Mach mach, Map<String, Object> map) {
        Object[] objArr = {mach, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27f791348c94df88606615fd46d1db9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27f791348c94df88606615fd46d1db9");
            return;
        }
        this.f = -1;
        if (mach == null || map == null) {
            return;
        }
        try {
            if (map.containsKey("show-view-count")) {
                this.i = g.c(map.get("show-view-count").toString());
                if (this.i <= 0) {
                    this.i = 2;
                }
            }
            if (map.containsKey("index")) {
                this.j = g.c(map.get("index").toString());
            }
            if (map.containsKey("effect-url")) {
                this.c = map.get("effect-url").toString();
            }
            if (map.containsKey("effect-action")) {
                this.f = g.c(map.get("effect-action").toString());
            }
            if (map.containsKey("extra-params")) {
                Object obj = map.get("extra-params");
                if (obj instanceof String) {
                    this.e = (Map) k.a().fromJson((String) obj, (Class<Object>) Map.class);
                }
                if (obj != null) {
                    this.d = obj.toString();
                }
            }
            if (map.containsKey("effect-json")) {
                this.b = map.get("effect-json").toString();
                String str = this.b;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7944d229478c0ec50072e46b6c33755e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7944d229478c0ec50072e46b6c33755e");
                } else if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("show_effect_params");
                        if (optJSONObject != null) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("scale");
                            this.k = optJSONObject2.optLong("delay");
                            this.l = optJSONObject2.optLong("duration");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (this.k == 0) {
                        this.k = 3600L;
                    }
                    if (this.l == 0) {
                        this.l = 400L;
                    }
                }
            }
            Object obj2 = map.get("@effect-callback");
            if (obj2 instanceof d) {
                this.g = (d) obj2;
            }
            this.h = mach.getTemplateId();
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.e("MachAttrs_Irmo", "attrs parse error: " + e2.getMessage(), new Object[0]);
        }
    }
}
