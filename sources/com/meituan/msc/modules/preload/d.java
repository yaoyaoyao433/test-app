package com.meituan.msc.modules.preload;

import android.support.annotation.NonNull;
import com.meituan.msc.modules.container.o;
import com.meituan.msc.modules.engine.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    final BlockingQueue<a> b;

    public static /* synthetic */ void a(d dVar, final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "a0db9b41af70b9518870d6659c25a466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "a0db9b41af70b9518870d6659c25a466");
        } else if (aVar == null) {
            com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "doPreloadPendingBiz finish");
        } else {
            com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "doPreloadPendingBiz", aVar);
            e.a().a(aVar.b, aVar.b, new com.meituan.msc.common.framework.a<h>() { // from class: com.meituan.msc.modules.preload.d.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(h hVar) {
                    h hVar2 = hVar;
                    Object[] objArr2 = {hVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bd03feb21478a1ced906cbbd2f923ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bd03feb21478a1ced906cbbd2f923ea");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "doPreloadPendingBiz success", aVar);
                    if (aVar.d != null) {
                        aVar.d.a(hVar2);
                    }
                    if (o.b.a()) {
                        com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "cancel doPreloadPendingBiz when container launching", aVar);
                    } else {
                        d.a(d.this, (a) d.this.b.poll());
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22fadf44d936c5b0f3428e3b098582fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22fadf44d936c5b0f3428e3b098582fe");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.b("PendingBizPreloadTasksManager", exc, "doPreloadPendingBiz", str, aVar);
                    if (aVar.d != null) {
                        aVar.d.a(str, exc);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0afab2db5c9f52d1933c688ddbd8282", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0afab2db5c9f52d1933c688ddbd8282");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "doPreloadPendingBiz onCancel", aVar);
                    if (aVar.d != null) {
                        aVar.d.a();
                    }
                }
            });
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5858a7f0fcfaebe30a267b9f8e754e9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5858a7f0fcfaebe30a267b9f8e754e9f");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4698091c62d281bc8cd781c988debd36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4698091c62d281bc8cd781c988debd36");
        } else {
            this.b = new LinkedBlockingQueue();
        }
    }

    public final boolean a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd808212d74d4180983b8886705de18", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd808212d74d4180983b8886705de18")).booleanValue() : this.b.contains(aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public com.meituan.msc.common.framework.a<h> d;

        public a(String str, String str2, com.meituan.msc.common.framework.a<h> aVar) {
            Object[] objArr = {str, str2, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3795ccba512e81069651e16fe0645cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3795ccba512e81069651e16fe0645cb");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716732d7e334eb7c8acc7e16df62834a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716732d7e334eb7c8acc7e16df62834a")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067e9d73a92a3856e1025d59776c9e77", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067e9d73a92a3856e1025d59776c9e77")).intValue() : Objects.hash(this.b);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde12a3d34e9dc33472bc97b463c4e31", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde12a3d34e9dc33472bc97b463c4e31");
            }
            return "PreloadBizData{appId='" + this.b + "', targetPath='" + this.c + "'}";
        }
    }
}
