package com.meituan.android.ptcommonim.pageadapter.message.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NonNull CacheException cacheException);

        void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar);
    }

    public static void a(String str, String str2, String str3, final a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9720dcca06788cca0ea0dc017ee9a791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9720dcca06788cca0ea0dc017ee9a791");
        } else {
            com.sankuai.waimai.mach.manager.a.a().a(str, str2, str3, new a.InterfaceC1013a() { // from class: com.meituan.android.ptcommonim.pageadapter.message.mach.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "224657a80b99a611afe9ba5988548074", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "224657a80b99a611afe9ba5988548074");
                    } else if (a.this != null) {
                        a.this.a(eVar);
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr2 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "767d9e8994ffe27827822c211e11a8eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "767d9e8994ffe27827822c211e11a8eb");
                    } else if (a.this != null) {
                        a.this.a(cacheException);
                    }
                }
            });
        }
    }
}
