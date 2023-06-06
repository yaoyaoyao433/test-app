package com.sankuai.waimai.alita.persona;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    public com.sankuai.waimai.alita.base.d<String, a> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8711e6a8d014ccfef493363080907cb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8711e6a8d014ccfef493363080907cb3");
        } else {
            this.b = new com.sankuai.waimai.alita.base.d<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "495e18d10d6afc7ba77185828873a93d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "495e18d10d6afc7ba77185828873a93d");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    @Nullable
    public final b a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d84f1554ce2c3a9d9d34080fffc65a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d84f1554ce2c3a9d9d34080fffc65a");
        }
        a a2 = this.b.a((com.sankuai.waimai.alita.base.d<String, a>) str);
        if (a2 != null) {
            return (b) a2.b;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.sankuai.waimai.alita.base.a<b> {
        public a(@NonNull b bVar) {
            super(bVar.b, bVar);
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec510edcaf3227cd024646975db9b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec510edcaf3227cd024646975db9b55");
            return;
        }
        Iterator<a> a2 = this.b.a();
        while (a2.hasNext()) {
            b bVar = (b) a2.next().b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b04ccdd22120194bfb4655c291c87b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b04ccdd22120194bfb4655c291c87b");
            return;
        }
        Iterator<a> a2 = this.b.a();
        while (a2.hasNext()) {
            b bVar = (b) a2.next().b;
            if (bVar != null) {
                bVar.a();
            }
        }
    }
}
