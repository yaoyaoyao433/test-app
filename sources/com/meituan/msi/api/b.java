package com.meituan.msi.api;

import com.meituan.msi.dispather.IContainerEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements IContainerEvent, com.meituan.msi.lifecycle.a, com.meituan.msi.lifecycle.b {
    public static ChangeQuickRedirect a;
    public final Map<String, Object> b;
    private final com.meituan.msi.view.g c;
    private final com.meituan.msi.view.a d;

    public b(com.meituan.msi.view.g gVar, com.meituan.msi.view.a aVar) {
        Object[] objArr = {gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00163f6e760923df239d1a9001ca4b75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00163f6e760923df239d1a9001ca4b75");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = gVar;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:56:0x010d, B:58:0x011b, B:59:0x0126, B:61:0x012a, B:63:0x0135, B:64:0x013c), top: B:69:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a A[Catch: Exception -> 0x0142, TryCatch #0 {Exception -> 0x0142, blocks: (B:56:0x010d, B:58:0x011b, B:59:0x0126, B:61:0x012a, B:63:0x0135, B:64:0x013c), top: B:69:0x010d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.meituan.msi.api.a a(com.meituan.msi.api.ApiRequest<T> r19) throws com.meituan.msi.bean.ApiException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.b.a(com.meituan.msi.api.ApiRequest):com.meituan.msi.api.a");
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3b86e8fff1e5e01588cc0bebf6ab8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3b86e8fff1e5e01588cc0bebf6ab8f");
            return;
        }
        for (Object obj : this.b.values()) {
            if (obj instanceof com.meituan.msi.lifecycle.a) {
                ((com.meituan.msi.lifecycle.a) obj).a();
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f7431adfceb135c3721f9a95e04192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f7431adfceb135c3721f9a95e04192");
            return;
        }
        for (Object obj : this.b.values()) {
            if (obj instanceof com.meituan.msi.lifecycle.a) {
                ((com.meituan.msi.lifecycle.a) obj).b();
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef2c5dc89f5db6c286da0077e477213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef2c5dc89f5db6c286da0077e477213");
            return;
        }
        for (Object obj : this.b.values()) {
            if (obj instanceof com.meituan.msi.lifecycle.a) {
                ((com.meituan.msi.lifecycle.a) obj).c();
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7904803fc30ae55e2a074b83c2ca3af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7904803fc30ae55e2a074b83c2ca3af");
            return;
        }
        for (Object obj : this.b.values()) {
            if (obj instanceof com.meituan.msi.lifecycle.a) {
                ((com.meituan.msi.lifecycle.a) obj).d();
            }
        }
        com.meituan.msi.view.g gVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.view.g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "bfa1c66eff46c74f61d4a3e5ff4c5153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "bfa1c66eff46c74f61d4a3e5ff4c5153");
        } else {
            gVar.b.clear();
        }
    }

    @Override // com.meituan.msi.dispather.IContainerEvent
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef3deb3eda95697e1103be2de493cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef3deb3eda95697e1103be2de493cbb");
            return;
        }
        for (Object obj2 : this.b.values()) {
            if (obj2 instanceof IContainerEvent) {
                ((IContainerEvent) obj2).a(str, obj);
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d40ad058303a1f57a40a3bd3a27dcda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d40ad058303a1f57a40a3bd3a27dcda");
            return;
        }
        for (Object obj : this.b.values()) {
            if (obj instanceof com.meituan.msi.lifecycle.b) {
                ((com.meituan.msi.lifecycle.b) obj).b(i);
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c72fd54819b65001217284a34b993d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c72fd54819b65001217284a34b993d");
            return;
        }
        for (Object obj : this.b.values()) {
            if (obj instanceof com.meituan.msi.lifecycle.b) {
                ((com.meituan.msi.lifecycle.b) obj).a(i);
            }
        }
    }
}
