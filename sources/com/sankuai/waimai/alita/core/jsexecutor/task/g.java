package com.sankuai.waimai.alita.core.jsexecutor.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    d d;
    List<JSONObject> e;
    JSONObject f;
    com.sankuai.waimai.alita.core.jsexecutor.h g;
    com.sankuai.waimai.alita.core.engine.h h;
    private String i;
    private JSONObject j;

    private g(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73bab5d3dbda109ef9b94ae1b911c24a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73bab5d3dbda109ef9b94ae1b911c24a");
            return;
        }
        this.b = aVar.b;
        this.i = aVar.c;
        this.j = aVar.d;
        this.c = aVar.e;
        this.g = aVar.i;
        this.h = aVar.j;
        this.e = aVar.f;
        this.f = aVar.g;
        this.d = aVar.h;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8496a02f384f0bd7666b5f5540eb47de", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8496a02f384f0bd7666b5f5540eb47de") : this.d.b;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cf519aca5e07b8e956be53805b4e57", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cf519aca5e07b8e956be53805b4e57") : this.d.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        String c;
        JSONObject d;
        public String e;
        public List<JSONObject> f;
        public JSONObject g;
        public d h;
        public com.sankuai.waimai.alita.core.jsexecutor.h i;
        public com.sankuai.waimai.alita.core.engine.h j;

        public final g a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f950a87738f08b7028b3d521c1366d1b", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f950a87738f08b7028b3d521c1366d1b") : new g(this);
        }
    }
}
