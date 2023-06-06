package com.meizu.cloud.pushsdk.c.e;

import com.meizu.cloud.pushsdk.c.a.e;
import com.meizu.cloud.pushsdk.c.c.k;
/* loaded from: classes3.dex */
public final class c {
    public static <T> com.meizu.cloud.pushsdk.c.a.c<T> a(com.meizu.cloud.pushsdk.c.a.b bVar) {
        switch (bVar.b) {
            case 0:
                return b(bVar);
            case 1:
                return c(bVar);
            case 2:
                return d(bVar);
            default:
                return new com.meizu.cloud.pushsdk.c.a.c<>(new com.meizu.cloud.pushsdk.c.b.a());
        }
    }

    private static <T> com.meizu.cloud.pushsdk.c.a.c<T> b(com.meizu.cloud.pushsdk.c.a.b bVar) {
        Throwable th;
        k kVar;
        Exception e;
        com.meizu.cloud.pushsdk.c.b.a e2;
        try {
            try {
                kVar = a.a(bVar);
                try {
                    if (kVar == null) {
                        com.meizu.cloud.pushsdk.c.a.c<T> cVar = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a()));
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return cVar;
                    } else if (bVar.c == e.d) {
                        com.meizu.cloud.pushsdk.c.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.c.a.c<>(kVar);
                        cVar2.c = kVar;
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return cVar2;
                    } else if (kVar.a >= 400) {
                        com.meizu.cloud.pushsdk.c.a.c<T> cVar3 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(kVar), bVar, kVar.a));
                        cVar3.c = kVar;
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return cVar3;
                    } else {
                        com.meizu.cloud.pushsdk.c.a.c<T> a = bVar.a(kVar);
                        a.c = kVar;
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return a;
                    }
                } catch (com.meizu.cloud.pushsdk.c.b.a e3) {
                    e2 = e3;
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar4 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(e2)));
                    com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                    return cVar4;
                } catch (Exception e4) {
                    e = e4;
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar5 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e));
                    com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                    return cVar5;
                }
            } catch (Throwable th2) {
                th = th2;
                com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
                throw th;
            }
        } catch (com.meizu.cloud.pushsdk.c.b.a e5) {
            kVar = null;
            e2 = e5;
        } catch (Exception e6) {
            kVar = null;
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
            throw th;
        }
    }

    private static <T> com.meizu.cloud.pushsdk.c.a.c<T> c(com.meizu.cloud.pushsdk.c.a.b bVar) {
        try {
            k b = a.b(bVar);
            if (b == null) {
                return new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a()));
            }
            if (b.a >= 400) {
                com.meizu.cloud.pushsdk.c.a.c<T> cVar = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(b), bVar, b.a));
                cVar.c = b;
                return cVar;
            }
            com.meizu.cloud.pushsdk.c.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.c.a.c<>("success");
            cVar2.c = b;
            return cVar2;
        } catch (com.meizu.cloud.pushsdk.c.b.a e) {
            return new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(e)));
        } catch (Exception e2) {
            return new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e2));
        }
    }

    private static <T> com.meizu.cloud.pushsdk.c.a.c<T> d(com.meizu.cloud.pushsdk.c.a.b bVar) {
        Throwable th;
        k kVar;
        Exception e;
        com.meizu.cloud.pushsdk.c.b.a e2;
        try {
            try {
                kVar = a.c(bVar);
                try {
                    if (kVar == null) {
                        com.meizu.cloud.pushsdk.c.a.c<T> cVar = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a()));
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return cVar;
                    } else if (bVar.c == e.d) {
                        com.meizu.cloud.pushsdk.c.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.c.a.c<>(kVar);
                        cVar2.c = kVar;
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return cVar2;
                    } else if (kVar.a >= 400) {
                        com.meizu.cloud.pushsdk.c.a.c<T> cVar3 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(kVar), bVar, kVar.a));
                        cVar3.c = kVar;
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return cVar3;
                    } else {
                        com.meizu.cloud.pushsdk.c.a.c<T> a = bVar.a(kVar);
                        a.c = kVar;
                        com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                        return a;
                    }
                } catch (com.meizu.cloud.pushsdk.c.b.a e3) {
                    e2 = e3;
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar4 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e2));
                    com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                    return cVar4;
                } catch (Exception e4) {
                    e = e4;
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar5 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e));
                    com.meizu.cloud.pushsdk.c.h.a.a(kVar, bVar);
                    return cVar5;
                }
            } catch (Throwable th2) {
                th = th2;
                com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
                throw th;
            }
        } catch (com.meizu.cloud.pushsdk.c.b.a e5) {
            kVar = null;
            e2 = e5;
        } catch (Exception e6) {
            kVar = null;
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
            throw th;
        }
    }
}
