package com.sankuai.waimai.alita.core.event.autorunner;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    public com.sankuai.waimai.alita.core.base.g<String, a> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfa0a25db05fb74dd9335824152e1af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfa0a25db05fb74dd9335824152e1af");
        } else {
            this.b = new com.sankuai.waimai.alita.core.base.g<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff44f474bc6ddef3db4f8201facee08e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff44f474bc6ddef3db4f8201facee08e");
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
    public final AlitaAutoRunManager a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d703a2fe503d2cf560ce22c0f11438d", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaAutoRunManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d703a2fe503d2cf560ce22c0f11438d");
        }
        a a2 = this.b.a((com.sankuai.waimai.alita.core.base.g<String, a>) str);
        if (a2 != null) {
            return (AlitaAutoRunManager) a2.d;
        }
        return null;
    }

    @NonNull
    public final AlitaAutoRunManager b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dcdba34309bfe260cf89d5f729481e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaAutoRunManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dcdba34309bfe260cf89d5f729481e0");
        }
        a a2 = this.b.a((com.sankuai.waimai.alita.core.base.g<String, a>) str);
        if (a2 == null) {
            a2 = new a(new AlitaAutoRunManager(str));
            this.b.a((com.sankuai.waimai.alita.core.base.g<String, a>) a2);
        }
        return (AlitaAutoRunManager) a2.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<AlitaAutoRunManager> {
        public a(@NonNull AlitaAutoRunManager alitaAutoRunManager) {
            super(alitaAutoRunManager.b, alitaAutoRunManager);
        }
    }
}
