package com.sankuai.waimai.platform.domain.manager.bubble;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a k;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public List<b> j;
    private List<com.sankuai.waimai.platform.domain.manager.bubble.modle.a> l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb62d9b9da577e9146c10bac9bfcbff2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb62d9b9da577e9146c10bac9bfcbff2");
            return;
        }
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = false;
        this.l = null;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2718937304333237fce69fe92281bb8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2718937304333237fce69fe92281bb8a");
        }
        if (k == null) {
            k = new a();
        }
        return k;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8a306e1908c621902df9857d2f0f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8a306e1908c621902df9857d2f0f82");
        } else if (this.j != null) {
            for (b bVar : this.j) {
                bVar.b(0);
            }
        }
    }

    public final boolean a(Context context, int i) {
        Object[] objArr = {context, 4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88cca1f765fd8ea0c33ce301a26b95ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88cca1f765fd8ea0c33ce301a26b95ac")).booleanValue() : this.b || this.c || this.d || this.g || this.e || this.h || e() || this.f;
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f74eb0d50c3df310e1d391c0dcbfd78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f74eb0d50c3df310e1d391c0dcbfd78")).booleanValue() : this.l != null && this.l.size() > 0;
    }

    public final com.sankuai.waimai.platform.domain.manager.bubble.modle.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c189833f115010b6eed980817dbba65", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.domain.manager.bubble.modle.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c189833f115010b6eed980817dbba65");
        }
        if (d()) {
            return this.l.remove(0);
        }
        return null;
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed01d777e8e7c43fd146267fda65c8d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed01d777e8e7c43fd146267fda65c8d4")).booleanValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().a() && this.i;
    }
}
