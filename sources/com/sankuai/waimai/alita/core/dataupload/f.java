package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f c;
    public com.sankuai.waimai.alita.core.base.g<String, a> b;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76fb7965035cdac998025d9acc36e47f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76fb7965035cdac998025d9acc36e47f");
        } else {
            this.b = new com.sankuai.waimai.alita.core.base.g<>();
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10d3fbaf5c8432912ea025c8d74bc7d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10d3fbaf5c8432912ea025c8d74bc7d4");
        }
        if (c == null) {
            synchronized (f.class) {
                if (c == null) {
                    c = new f();
                }
            }
        }
        return c;
    }

    @Nullable
    public final e a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67803fb218da0a03aca7521aacd09621", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67803fb218da0a03aca7521aacd09621");
        }
        a a2 = this.b.a((com.sankuai.waimai.alita.core.base.g<String, a>) str);
        if (a2 != null) {
            return (e) a2.d;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<e> {
        public a(@NonNull e eVar) {
            super(eVar.b, eVar);
        }
    }
}
