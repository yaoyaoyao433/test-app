package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.jg;
import com.tencent.mapsdk.internal.jj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jl<D extends jj> extends jq<D> implements jg<D> {
    ArrayList<ji<D>> a = new ArrayList<>();
    private boolean b = true;

    @Override // com.tencent.mapsdk.internal.jg
    public final jg<D> a() {
        return this;
    }

    private void a(boolean z) {
        this.b = z;
    }

    private void a(ji<D>... jiVarArr) {
        this.a.addAll(Arrays.asList(jiVarArr));
    }

    public final ji<D> a(int i) {
        if (i >= this.a.size()) {
            return null;
        }
        return this.a.get(i);
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final void a(String str, D d) {
        kn.b(ki.o, str);
        kn.a(ki.p, str, "put data length", Integer.valueOf(d == null ? 0 : d.a()));
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    ((jp) next).m().b(str, (String) d);
                } else {
                    next.a(str, (String) d);
                }
            }
        }
    }

    private static void a(String str, D d, List<ji<D>> list) {
        for (ji<D> jiVar : list) {
            if (jiVar instanceof jp) {
                ((jp) jiVar).m().b(str, (String) d);
            } else {
                jiVar.a(str, (String) d);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final D a(String str, Class<D> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<ji<D>> it = this.a.iterator();
        D d = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    d = ((jp) next).m().b(str, cls);
                } else {
                    d = next.a(str, cls);
                }
                if (d != null && d.a() > 0) {
                    kj.c(ki.f, "从[" + next + "]缓存中获取数据成功");
                    break;
                } else if (this.b) {
                    kn.a(ki.o, str, (Object) "back to fill ".concat(String.valueOf(next)));
                    arrayList.add(next);
                }
            }
        }
        if (d != null && d.a() > 0 && !arrayList.isEmpty()) {
            a(str, d, arrayList);
        }
        kn.a(ki.o, str, "get data length", Integer.valueOf(d == null ? 0 : d.a()));
        kn.f(ki.o, str);
        return d;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final boolean a(String str) {
        Iterator<ji<D>> it = this.a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    z = ((jp) next).m().b(str);
                } else {
                    z = next.a(str);
                }
            }
        }
        return z;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final void b() {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    ((jp) next).m().j();
                } else {
                    next.b();
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final long c() {
        Iterator<ji<D>> it = this.a.iterator();
        long j = 0;
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    j += ((jp) next).m().k();
                } else {
                    j += next.c();
                }
            }
        }
        return j;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final long d() {
        Iterator<ji<D>> it = this.a.iterator();
        long j = 0;
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    j += ((jp) next).m().l();
                } else {
                    j += next.d();
                }
            }
        }
        return j;
    }

    @Override // com.tencent.mapsdk.internal.ji, com.tencent.mapsdk.internal.jp
    public final long e() {
        Iterator<ji<D>> it = this.a.iterator();
        long j = 0;
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jp) {
                    j += ((jp) next).m().e();
                } else {
                    j += next.e();
                }
            }
        }
        return j;
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(String str, D d, jg.a<Boolean> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().a(str, (String) d, aVar);
                } else if (next instanceof jp) {
                    ((jp) next).m().b(str, (String) d);
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                } else {
                    next.a(str, (String) d);
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(String str, Class<D> cls, jg.a<D> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().a(str, cls, aVar);
                } else if (next instanceof jp) {
                    jp<D> m = ((jp) next).m();
                    if (aVar != null) {
                        aVar.callback(m.b(str, cls));
                    }
                } else if (aVar != null) {
                    aVar.callback(next.a(str, cls));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(String str, jg.a<Boolean> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().a(str, aVar);
                } else if (next instanceof jp) {
                    jp<D> m = ((jp) next).m();
                    if (aVar != null) {
                        aVar.callback(Boolean.valueOf(m.b(str)));
                    }
                } else if (aVar != null) {
                    aVar.callback(Boolean.valueOf(next.a(str)));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(jg.a<Boolean> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().a(aVar);
                } else if (next instanceof jp) {
                    ((jp) next).m().j();
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                } else {
                    next.b();
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void b(jg.a<Long> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().b(aVar);
                } else if (next instanceof jp) {
                    jp<D> m = ((jp) next).m();
                    if (aVar != null) {
                        aVar.callback(Long.valueOf(m.k()));
                    }
                } else if (aVar != null) {
                    aVar.callback(Long.valueOf(next.c()));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void c(jg.a<Long> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().c(aVar);
                } else if (next instanceof jp) {
                    jp<D> m = ((jp) next).m();
                    if (aVar != null) {
                        aVar.callback(Long.valueOf(m.l()));
                    }
                } else if (aVar != null) {
                    aVar.callback(Long.valueOf(next.d()));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void d(jg.a<Long> aVar) {
        Iterator<ji<D>> it = this.a.iterator();
        while (it.hasNext()) {
            ji<D> next = it.next();
            if (next != null) {
                if (next instanceof jg) {
                    ((jg) next).a().d(aVar);
                } else if (next instanceof jp) {
                    jp<D> m = ((jp) next).m();
                    if (aVar != null) {
                        aVar.callback(Long.valueOf(m.e()));
                    }
                } else if (aVar != null) {
                    aVar.callback(Long.valueOf(next.e()));
                }
            }
        }
    }
}
