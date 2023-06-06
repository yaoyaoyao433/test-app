package com.huawei.updatesdk.b.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    private static com.huawei.updatesdk.service.otaupdate.b a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements com.huawei.updatesdk.a.b.c.c.a {
        private b() {
        }

        @Override // com.huawei.updatesdk.a.b.c.c.a
        public void a(com.huawei.updatesdk.a.b.c.c.c cVar, com.huawei.updatesdk.a.b.c.c.d dVar) {
        }

        @Override // com.huawei.updatesdk.a.b.c.c.a
        public void b(com.huawei.updatesdk.a.b.c.c.c cVar, com.huawei.updatesdk.a.b.c.c.d dVar) {
            if (f.a == null) {
                return;
            }
            if (!(dVar instanceof com.huawei.updatesdk.service.appmgr.bean.b)) {
                f.a.a(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVar;
            if (dVar.d() != 0 || dVar.e() != 0) {
                f.a.b(dVar.d());
            } else if (bVar.g() == null) {
                f.a.a(dVar.d());
            } else {
                f.a.a(bVar.g());
            }
        }
    }

    public static void a(com.huawei.updatesdk.service.otaupdate.b bVar) {
        a = bVar;
    }

    public static void a(boolean z) {
        com.huawei.updatesdk.b.g.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(z ? com.huawei.updatesdk.service.otaupdate.f.f().c() : null), new b());
    }
}
