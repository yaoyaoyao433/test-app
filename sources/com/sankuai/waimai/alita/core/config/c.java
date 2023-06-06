package com.sankuai.waimai.alita.core.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717309190aa4242973b59b0d04ec69e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717309190aa4242973b59b0d04ec69e8");
        } else {
            this.c = new g<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d08c78fd8d8ddf9a04374107b88a815", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d08c78fd8d8ddf9a04374107b88a815");
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

    @Nullable
    public final AlitaBizConfigManager a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a11a7cabe919ad24e101907d5b88f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaBizConfigManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a11a7cabe919ad24e101907d5b88f6");
        }
        a a2 = this.c.a((g<String, a>) str);
        if (a2 != null) {
            return (AlitaBizConfigManager) a2.d;
        }
        return null;
    }

    public final void a(@NonNull AlitaBizConfigManager alitaBizConfigManager) {
        Object[] objArr = {alitaBizConfigManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b5807503b9ab122bb5c2a68209e843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b5807503b9ab122bb5c2a68209e843");
        } else {
            this.c.a((g<String, a>) new a(alitaBizConfigManager));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<AlitaBizConfigManager> {
        public a(@NonNull AlitaBizConfigManager alitaBizConfigManager) {
            super(alitaBizConfigManager.b, alitaBizConfigManager);
        }
    }
}
