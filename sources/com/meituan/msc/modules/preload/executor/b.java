package com.meituan.msc.modules.preload.executor;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;
    private final boolean f;
    private final ScheduledExecutorService g;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a8fb580b30efb96077a20f20308bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a8fb580b30efb96077a20f20308bc3");
            return;
        }
        this.g = com.sankuai.android.jarvis.c.b(str, 1);
        this.f = true;
    }

    public b(@NonNull ScheduledExecutorService scheduledExecutorService) {
        Object[] objArr = {scheduledExecutorService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe44c1e9aa4768bc4ccd4fc2195ac705", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe44c1e9aa4768bc4ccd4fc2195ac705");
            return;
        }
        this.g = scheduledExecutorService;
        this.f = false;
    }

    @Override // com.meituan.msc.modules.preload.executor.e
    public final void a(@NonNull final c cVar, long j) {
        Object[] objArr = {cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88eb04f29871b5dc438cb294d4714fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88eb04f29871b5dc438cb294d4714fb8");
        } else {
            this.g.schedule(new Runnable() { // from class: com.meituan.msc.modules.preload.executor.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beb24c19129d05c0b97bdc2df3829b7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beb24c19129d05c0b97bdc2df3829b7f");
                    } else {
                        b.this.b(cVar);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.meituan.msc.modules.preload.executor.e
    public final void a(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3037133dafabc8b593179d7b1ac5c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3037133dafabc8b593179d7b1ac5c7b");
        } else {
            this.g.execute(new Runnable() { // from class: com.meituan.msc.modules.preload.executor.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "683f52d049273e5c51538a646a1a35c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "683f52d049273e5c51538a646a1a35c8");
                    } else {
                        b.super.a(cVar);
                    }
                }
            });
        }
    }
}
