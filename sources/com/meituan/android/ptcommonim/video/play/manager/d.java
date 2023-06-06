package com.meituan.android.ptcommonim.video.play.manager;

import com.meituan.android.ptcommonim.video.play.manager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final a.RunnableC0358a b;
    private final List c;
    private final CountDownLatch d;
    private final boolean e;
    private final String f;

    public d(a.RunnableC0358a runnableC0358a, List list, CountDownLatch countDownLatch, boolean z, String str) {
        this.b = runnableC0358a;
        this.c = list;
        this.d = countDownLatch;
        this.e = z;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8016d0ae84ee9d3715716b2e3e3e193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8016d0ae84ee9d3715716b2e3e3e193");
            return;
        }
        final a.RunnableC0358a runnableC0358a = this.b;
        final List list = this.c;
        final CountDownLatch countDownLatch = this.d;
        final boolean z = this.e;
        final String str = this.f;
        Object[] objArr2 = {runnableC0358a, list, countDownLatch, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = a.RunnableC0358a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "663ead6d232bef69ad3b3ca48978c386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "663ead6d232bef69ad3b3ca48978c386");
            return;
        }
        if (a.this.f) {
            a.this.d.b(0.0f);
        }
        if (a.this.h != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(a.this.h);
            a.this.d.a(arrayList);
        }
        a.this.d.a(new c.b() { // from class: com.meituan.android.ptcommonim.video.play.manager.a.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.b
            public final void a(float f) {
                Object[] objArr3 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4a55f424a07e717502b515a4b775632a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4a55f424a07e717502b515a4b775632a");
                    return;
                }
                a aVar = a.this;
                Object[] objArr4 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "da0cc30d5d18d2eaba8e67412d2bc0e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "da0cc30d5d18d2eaba8e67412d2bc0e0");
                } else if (aVar.g != null) {
                    aVar.e.post(com.meituan.android.ptcommonim.video.play.manager.b.a(aVar, f));
                }
            }

            @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.b
            public final void a(d.a aVar) {
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6adbed0c324f23672b6f7f6838f66e35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6adbed0c324f23672b6f7f6838f66e35");
                    return;
                }
                if (aVar == null || aVar.a != 0) {
                    StringBuilder sb = new StringBuilder("code:");
                    sb.append(aVar != null ? aVar.a : -1);
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_commonbus_video_edit", "edit_failed", sb.toString());
                }
                list.add(aVar);
                countDownLatch.countDown();
                runnableC0358a.a(countDownLatch, z, str);
            }
        });
        a.this.d.a(runnableC0358a.b);
        a.this.d.a(2, str);
    }
}
