package com.huawei.updatesdk.b.f;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private static c a = new c();
    private static com.huawei.updatesdk.b.f.a b = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements com.huawei.updatesdk.b.f.a {
        private final List<b> a = new ArrayList();

        a() {
        }

        @Override // com.huawei.updatesdk.b.f.a
        public final void a(int i, com.huawei.updatesdk.a.b.b.b bVar) {
            synchronized (this.a) {
                for (b bVar2 : this.a) {
                    bVar2.a(i, bVar);
                }
            }
        }

        @Override // com.huawei.updatesdk.b.f.a
        public final void a(b bVar) {
            String str;
            String str2;
            synchronized (this.a) {
                try {
                    if (bVar == null) {
                        return;
                    }
                    if (!this.a.contains(bVar)) {
                        try {
                            this.a.add(bVar);
                        } catch (ClassCastException unused) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver ClassCastException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        } catch (IllegalArgumentException unused2) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver IllegalArgumentException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        } catch (UnsupportedOperationException unused3) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver UnsupportedOperationException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.updatesdk.b.f.a
        public final void b(b bVar) {
            synchronized (this.a) {
                try {
                    this.a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("InstallObserverManager", "unRegisterObserver UnsupportedOperationException");
                }
            }
        }
    }

    private c() {
    }

    public static com.huawei.updatesdk.b.f.a a() {
        return b;
    }

    public static c b() {
        return a;
    }

    public final void a(com.huawei.updatesdk.a.b.b.b bVar) {
        b.a(1, bVar);
    }

    public final void b(com.huawei.updatesdk.a.b.b.b bVar) {
        b.a(0, bVar);
    }

    public final void c(com.huawei.updatesdk.a.b.b.b bVar) {
        b.a(2, bVar);
    }
}
