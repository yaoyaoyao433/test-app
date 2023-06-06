package com.sankuai.xm.im.transfer.download;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g implements e {
    public static ChangeQuickRedirect a;
    private static g b = new g();
    private a c;

    @Override // com.sankuai.xm.im.transfer.download.e
    public final int a() {
        return 3;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664c8f7ff489d235241859c9bca03739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664c8f7ff489d235241859c9bca03739");
        } else {
            this.c = new a();
        }
    }

    public static g c() {
        return b;
    }

    @Override // com.sankuai.xm.im.transfer.download.e
    public final Comparator b() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Comparator<d> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(d dVar, d dVar2) {
            boolean z;
            boolean z2;
            d dVar3 = dVar;
            d dVar4 = dVar2;
            Object[] objArr = {dVar3, dVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d699cfd407ed3f01b3f50b8f22c369", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d699cfd407ed3f01b3f50b8f22c369")).intValue();
            }
            if (dVar3.b == null || dVar4.b == null) {
                z = false;
                z2 = false;
            } else {
                com.sankuai.xm.im.session.c j = IMClient.a().j();
                z2 = j.b(SessionId.a(dVar3.b));
                z = j.b(SessionId.a(dVar4.b));
            }
            long j2 = dVar3.f - dVar4.f;
            if (dVar3.e < dVar4.e) {
                return 1;
            }
            if (dVar3.e > dVar4.e) {
                return -1;
            }
            if (!z2 || z) {
                if (z2 || !z) {
                    int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                    if (i > 0) {
                        return -1;
                    }
                    return i < 0 ? 1 : 0;
                }
                return 1;
            }
            return -1;
        }
    }

    @Override // com.sankuai.xm.im.transfer.download.e
    public final boolean a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403f1e328e9da0449f2674e0b6093d16", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403f1e328e9da0449f2674e0b6093d16")).booleanValue();
        }
        if (dVar != null) {
            if (dVar.b == null) {
                return true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (dVar.e == 1 || currentTimeMillis <= dVar.b.getSts() || currentTimeMillis - dVar.b.getSts() < 604800000) {
                return true;
            }
        }
        return false;
    }
}
