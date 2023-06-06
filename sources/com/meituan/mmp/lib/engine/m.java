package com.meituan.mmp.lib.engine;

import android.support.annotation.Nullable;
import com.meituan.mmp.lib.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    public final String b;
    public int c;
    public com.meituan.mmp.lib.config.a d;
    public com.meituan.mmp.lib.trace.h e;
    public a f;
    public b g;
    public e h;
    public d i;
    public com.meituan.mmp.lib.config.f j;
    public volatile u k;
    public com.meituan.mmp.lib.api.h l;
    @Nullable
    public com.meituan.mmp.lib.devtools.e m;
    @Nullable
    public com.meituan.mmp.lib.devtools.g n;
    public com.meituan.mmp.lib.api.r o;
    public k p;
    public ab q;
    public com.meituan.mmp.lib.a r;
    public List<com.meituan.mmp.lib.a> s;
    public boolean t;
    public boolean u;
    public volatile boolean v;
    public boolean w;
    public boolean x;

    public m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f90a7ca8154d0a741b74c280a166ee6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f90a7ca8154d0a741b74c280a166ee6");
            return;
        }
        this.s = new CopyOnWriteArrayList();
        this.b = str;
    }

    public final com.meituan.mmp.lib.page.e a(int i) {
        ab y;
        com.meituan.mmp.lib.page.e a2;
        com.meituan.mmp.lib.page.e a3;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3751f6d8ef24db90e8402358251fa271", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3751f6d8ef24db90e8402358251fa271");
        }
        if (this.q == null || (a3 = this.q.a(i)) == null) {
            for (com.meituan.mmp.lib.a aVar : this.s) {
                if (aVar != null && (y = aVar.y()) != null && (a2 = y.a(i)) != null) {
                    return a2;
                }
            }
            com.meituan.mmp.lib.trace.b.b("MiniApp", "getPageById: can't find page ", Integer.valueOf(i));
            return null;
        }
        return a3;
    }

    public final com.meituan.mmp.lib.a b(int i) {
        ab y;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c96a4e617585b12de3bb2ceabf2358", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c96a4e617585b12de3bb2ceabf2358");
        }
        if (this.q != null && this.q.a(i) != null) {
            return this.r;
        }
        for (com.meituan.mmp.lib.a aVar : this.s) {
            if (aVar != null && (y = aVar.y()) != null && y.a(i) != null) {
                return aVar;
            }
        }
        com.meituan.mmp.lib.trace.b.b("MiniApp", "getContainerById: can't find page ", Integer.valueOf(i));
        return null;
    }

    public final com.meituan.mmp.lib.a c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964fa0a52d85c77ea9a65a1b3027366b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964fa0a52d85c77ea9a65a1b3027366b");
        }
        com.meituan.mmp.lib.a b = b(i);
        return b == null ? this.r : b;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb60de43ce0b67bf020142f85423856", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb60de43ce0b67bf020142f85423856")).booleanValue() : this.s != null && this.s.size() == 1;
    }
}
