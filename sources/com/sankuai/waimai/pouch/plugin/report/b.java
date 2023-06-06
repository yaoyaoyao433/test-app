package com.sankuai.waimai.pouch.plugin.report;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public String b;
    public String c;
    public int d;
    public Map<String, Object> e;
    public com.sankuai.waimai.mach.node.a f;
    public Map<String, Object> g;

    public b() {
    }

    public b(b bVar) {
        if (bVar != null) {
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e == null ? null : new HashMap(bVar.e);
            this.f = bVar.f;
            this.g = bVar.g != null ? new HashMap(bVar.g) : null;
        }
    }
}
