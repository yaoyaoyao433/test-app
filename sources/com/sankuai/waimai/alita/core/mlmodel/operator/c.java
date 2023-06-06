package com.sankuai.waimai.alita.core.mlmodel.operator;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private g<String, a> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092010eacb7e30fcb2572aca1e696949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092010eacb7e30fcb2572aca1e696949");
        } else {
            this.c = new g<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51a8c1c2c0c02ef3205689493606cc76", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51a8c1c2c0c02ef3205689493606cc76");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    @NonNull
    public final b a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c327e6bddf81aca287ee6c3b53b306", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c327e6bddf81aca287ee6c3b53b306");
        }
        a a2 = this.c.a((g<String, a>) str);
        if (a2 == null) {
            a2 = new a(new b(str));
            this.c.a((g<String, a>) a2);
        }
        return (b) a2.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<b> {
        public a(@NonNull b bVar) {
            super(bVar.b, bVar);
        }
    }
}
