package com.sankuai.waimai.irmo.mach.video;

import com.sankuai.waimai.mach.parser.d;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.sankuai.waimai.irmo.mach.a {
    public String k;
    public d l;
    public boolean m;

    public c(Map<String, Object> map) {
        super(map);
        Object obj;
        Object obj2;
        if (map == null) {
            return;
        }
        if (map.containsKey("video-url") && (obj2 = map.get("video-url")) != null) {
            this.k = obj2.toString();
        }
        Object obj3 = map.get("@video-callback");
        if (obj3 instanceof d) {
            this.l = (d) obj3;
        }
        if (!map.containsKey("muted") || (obj = map.get("muted")) == null) {
            return;
        }
        this.m = Boolean.parseBoolean(obj.toString());
    }
}
