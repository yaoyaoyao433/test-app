package com.sankuai.waimai.irmo.render;

import com.facebook.react.bridge.ReadableMap;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public String a;
    public String b;
    public String c;
    public Map d;
    public int e;
    public com.sankuai.waimai.mach.parser.d f;
    public String g;

    public f(Mach mach, Map<String, Object> map) {
        this.e = -1;
        if (mach == null || map == null) {
            return;
        }
        try {
            if (map.containsKey("effect-url")) {
                this.b = map.get("effect-url").toString();
            }
            if (map.containsKey("effect-action")) {
                this.e = com.sankuai.waimai.mach.utils.g.c(map.get("effect-action").toString());
            }
            if (map.containsKey("extra-params")) {
                Object obj = map.get("extra-params");
                if (obj instanceof String) {
                    this.d = (Map) k.a().fromJson((String) obj, (Class<Object>) Map.class);
                }
                if (obj != null) {
                    this.c = obj.toString();
                }
            }
            if (map.containsKey("effect-json")) {
                this.a = map.get("effect-json").toString();
            }
            Object obj2 = map.get("@effect-callback");
            if (obj2 instanceof com.sankuai.waimai.mach.parser.d) {
                this.f = (com.sankuai.waimai.mach.parser.d) obj2;
            }
            this.g = mach.getTemplateId();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("MachAttrs_Irmo", "attrs parse error: " + e.getMessage(), new Object[0]);
        }
    }

    public f(ReadableMap readableMap) {
        this.e = -1;
        if (readableMap == null) {
            return;
        }
        this.d = readableMap.toHashMap();
    }
}
