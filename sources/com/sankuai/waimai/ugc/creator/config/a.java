package com.sankuai.waimai.ugc.creator.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    public int A;
    public String B;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public String v;
    public Map<String, Object> w;
    public List<com.sankuai.waimai.ugc.creator.entity.a> x;
    public String y;
    public String z;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e43de9388e630b8d200882b0328d60b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e43de9388e630b8d200882b0328d60b1");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = "选择图片/视频，开始写笔记";
        this.j = 9;
        this.k = 3000;
        this.l = 60000;
        this.m = 3000;
        this.n = 15000;
        this.o = 3000;
        this.p = 60000;
        this.q = 100;
        this.r = 1280;
        this.s = 5000;
        this.t = 540;
        this.u = "";
        this.A = 0;
        this.B = "";
    }

    public final com.sankuai.waimai.ugc.creator.entity.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42db68475357a2ac9cd22d4f4be81360", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ugc.creator.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42db68475357a2ac9cd22d4f4be81360");
        }
        if (this.x != null) {
            for (com.sankuai.waimai.ugc.creator.entity.a aVar : this.x) {
                if (aVar != null && aVar.c == 1) {
                    return aVar;
                }
            }
            return null;
        }
        return null;
    }
}
