package com.sankuai.waimai.platform.mach.lottieextend;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    boolean c;
    boolean d;
    float e;
    float f;
    float g;
    String h;

    public b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef5d2dd67d07f2c8ff05a4dc4a8ba6ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef5d2dd67d07f2c8ff05a4dc4a8ba6ba");
            return;
        }
        this.e = 1.0f;
        this.f = 0.0f;
        this.g = 1.0f;
        this.h = "start";
        if (map == null) {
            return;
        }
        if (map.containsKey("lottie-url")) {
            this.b = map.get("lottie-url").toString();
        }
        if (map.containsKey("loop-animation")) {
            this.c = map.get("loop-animation").toString().equals("true");
        }
        if (map.containsKey("auto-reverse")) {
            this.d = map.get("auto-reverse").toString().equals("true");
        }
        if (map.containsKey("max-progress")) {
            this.e = com.sankuai.waimai.mach.utils.g.a(map.get("max-progress").toString());
        }
        if (map.containsKey("min-progress")) {
            this.f = com.sankuai.waimai.mach.utils.g.c(map.get("min-progress").toString());
        }
        if (map.containsKey("animation-speed")) {
            this.g = com.sankuai.waimai.mach.utils.g.a(map.get("animation-speed").toString());
        }
        if (map.containsKey("animation-status")) {
            this.h = map.get("animation-status").toString();
        }
    }
}
