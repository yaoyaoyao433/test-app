package com.sankuai.waimai.alita.bundle.load;

import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.cache.a;
import com.sankuai.waimai.alita.bundle.download.record.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.load.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0694a {
        @MainThread
        void a(b bVar);

        @MainThread
        void a(com.sankuai.waimai.alita.bundle.model.a aVar);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fcfa5d13def452ae2e137a4f7c3cb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fcfa5d13def452ae2e137a4f7c3cb72");
            return;
        }
        try {
            com.sankuai.waimai.alita.bundle.a.a().a(str);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, final InterfaceC0694a interfaceC0694a) {
        Object[] objArr = {str, str2, interfaceC0694a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5798463f34f68f71bdce84633622f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5798463f34f68f71bdce84633622f01");
            return;
        }
        SystemClock.uptimeMillis();
        final com.sankuai.waimai.alita.bundle.download.record.a aVar = new com.sankuai.waimai.alita.bundle.download.record.a();
        com.sankuai.waimai.alita.bundle.a.a().a(str, str2, new a.InterfaceC0691a() { // from class: com.sankuai.waimai.alita.bundle.load.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.bundle.cache.a.InterfaceC0691a
            public final void a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5d71a26da84a5aea6f48ac736e758e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5d71a26da84a5aea6f48ac736e758e3");
                } else if (InterfaceC0694a.this != null) {
                    b.a aVar3 = new b.a();
                    aVar3.b = "AlitaJSManager-->asyncLoadJSBundleWithID-->asyncLoadAlitaBundle#onSuccess";
                    aVar3.c = "从缓存加载bundle成功，可直接使用";
                    aVar.a(aVar3.a());
                    InterfaceC0694a.this.a(aVar2);
                    aVar.a();
                }
            }

            @Override // com.sankuai.waimai.alita.bundle.cache.a.InterfaceC0691a
            public final void a(@NonNull com.sankuai.waimai.alita.bundle.cache.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c11778ad2ec381d96a139e175f00947", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c11778ad2ec381d96a139e175f00947");
                    return;
                }
                b.a aVar2 = new b.a();
                aVar2.b = "AlitaJSManager-->asyncLoadJSBundleWithID-->asyncLoadAlitaBundle#onFailure";
                aVar2.c = "模板加载失败,下载终止";
                aVar2.d = 17720;
                aVar.a(aVar2.a());
                if (InterfaceC0694a.this != null) {
                    InterfaceC0694a.this.a(new b(bVar));
                }
                aVar.b();
            }
        });
    }
}
