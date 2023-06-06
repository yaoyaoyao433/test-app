package com.sankuai.waimai.store.skuchoose.judas;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.ak;
import com.sankuai.waimai.store.util.k;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f {
    public static ChangeQuickRedirect b;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    public GoodsSpu d;
    public GoodsSku e;
    public String f;
    public String g;
    public String h;
    public int i;
    public int j;
    public String k;
    public int l;
    public Map<String, Object> m;
    public com.sankuai.waimai.store.param.a n;
    public int o;

    public abstract void a(Context context, long j);

    public abstract void b(Context context, long j);

    public abstract void c(Context context, long j);

    public abstract void d(Context context, long j);

    public static f a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b5f2a6ea4b2878247c2a97ed76f0c50", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b5f2a6ea4b2878247c2a97ed76f0c50");
        }
        if (ak.a(context, i)) {
            return new d();
        }
        if (ak.b(context, i)) {
            return new a();
        }
        if (ak.c(context, i)) {
            return new e();
        }
        if (ak.a(i)) {
            return new b();
        }
        return new c();
    }

    public final void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        this.c = aVar;
        this.d = goodsSpu;
        this.e = goodsSku;
    }

    public final void a(String str, String str2, String str3, int i, int i2, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c4ad0acce2a2053b18c87f7dd86db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c4ad0acce2a2053b18c87f7dd86db7");
            return;
        }
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i;
        this.j = i2;
        this.k = str4;
    }

    public final void a(int i, Map<String, Object> map) {
        this.l = i;
        this.m = map;
    }

    public final void a(com.sankuai.waimai.store.param.a aVar, int i) {
        this.n = aVar;
        this.o = i;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece6ee11dcfe60e3d6c019ad74082008", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece6ee11dcfe60e3d6c019ad74082008") : k.b(this.c.b, this.d, this.e);
    }
}
