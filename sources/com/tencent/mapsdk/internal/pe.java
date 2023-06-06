package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.ab;
import com.tencent.mapsdk.internal.pf;
import com.tencent.mapsdk.internal.pg;
import com.tencent.mapsdk.internal.pj;
import com.tencent.mapsdk.internal.pl;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pe implements pf.b, pg.a {
    public static final String b = "AUTH_MARKER";
    public final bk a;
    private final rm c;
    private final qq d;
    private final pl e;
    private final mn f;
    private List<AsyncTask> g;
    private final pj h;
    private boolean i;
    private final so j;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(Bitmap bitmap, int i, int i2);
    }

    public pe(bh bhVar) {
        Context context = bhVar.c;
        this.j = bhVar.b;
        this.c = bhVar.b.k;
        this.a = bhVar.d;
        this.d = bhVar.e;
        this.e = bhVar.f;
        this.f = bhVar.b.aB;
        this.g = new ArrayList();
        String str = "";
        String str2 = "";
        if (bhVar.b != null && bhVar.b.K() != null) {
            str = bhVar.b.K().getSubKey();
            str2 = bhVar.b.K().getSubId();
        }
        this.h = new pj(context, bhVar, str);
        this.g.add(new pf(this.a.j, str, str2, this));
        this.g.add(new pg(bhVar, this));
    }

    private void a(a aVar, TencentMapOptions tencentMapOptions) {
        this.a.a(aVar, tencentMapOptions);
    }

    public final void a() {
        kn.b(km.U);
        for (AsyncTask asyncTask : this.g) {
            com.sankuai.waimai.launcher.util.aop.b.a(asyncTask, new Object[0]);
        }
    }

    private void a(JSONArray jSONArray, fp fpVar) {
        List<qp> a2;
        if (this.d == null) {
            return;
        }
        qq qqVar = this.d;
        String a3 = qqVar.d.a(ej.A);
        if (jSONArray != null && (a2 = qq.a(jSONArray)) != null) {
            qqVar.c.clear();
            qqVar.c.addAll(a2);
            if (!jSONArray.toString().equals(a3)) {
                qqVar.d.a();
                qqVar.d.a(ej.A, jSONArray.toString());
            }
        }
        ab abVar = this.j.o;
        if (abVar != null) {
            if (fpVar != null) {
                abVar.b = fpVar;
                kj.b(ki.f, "IndoorAuth:".concat(String.valueOf(fpVar)));
                abVar.a.a(ej.B, fpVar.c);
                abVar.a.a(ej.C, fpVar.d);
                if (fpVar.e != null) {
                    abVar.a.a(ej.D, fpVar.e.toString());
                }
                if (abVar.d != null) {
                    abVar.d.a(abVar.a());
                    if (abVar.a() == 1) {
                        abVar.d.a(abVar.b());
                    }
                }
            } else {
                abVar.a.a(new String[]{ej.B, ej.C, ej.D});
            }
            if (abVar.b == null) {
                abVar.b = new fp();
            }
            jy.a(new ab.AnonymousClass1());
        }
        pj pjVar = this.h;
        String a4 = this.d.a();
        String a5 = pjVar.a();
        if (pj.e.containsKey(a5)) {
            pjVar.a(a5, pjVar.f);
            return;
        }
        pjVar.a(a5, pjVar.f);
        kn.b(km.V);
        jy.b(new pj.a(pjVar, a4, fpVar));
    }

    public final void b() {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); i++) {
                this.g.get(i).cancel(true);
            }
            this.g.clear();
        }
        this.g = null;
        this.i = true;
    }

    @Override // com.tencent.mapsdk.internal.pg.a
    public final void a(boolean z, rl rlVar) {
        if (this.j == null || rlVar == null) {
            return;
        }
        this.j.a(z, rlVar.c());
        if (z) {
            this.c.a();
        }
        this.c.d = true;
    }

    @Override // com.tencent.mapsdk.internal.pf.b
    public final void a(pf.a aVar) {
        fp fpVar;
        List<qp> a2;
        boolean z;
        boolean z2;
        if (this.i) {
            return;
        }
        JSONArray jSONArray = null;
        if (aVar != null) {
            jSONArray = aVar.b;
            fpVar = aVar.a;
            if (aVar.d != null) {
                pl plVar = this.e;
                pk pkVar = aVar.d;
                if (pkVar != null && pkVar.a) {
                    plVar.b.clear();
                    plVar.b.addAll(pkVar.b);
                    if (plVar.d.isEmpty() && !plVar.b.isEmpty()) {
                        z = false;
                        for (pm pmVar : plVar.b) {
                            pl.a aVar2 = new pl.a(plVar, (byte) 0);
                            aVar2.d = pmVar.a;
                            aVar2.e = pmVar.b;
                            plVar.d.add(aVar2);
                            z = true;
                        }
                    } else {
                        z = false;
                        for (pm pmVar2 : plVar.b) {
                            Iterator<pl.a> it = plVar.d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                pl.a next = it.next();
                                if (next.d.equals(pmVar2.a)) {
                                    if (!next.e.equalsIgnoreCase(pmVar2.b)) {
                                        pmVar2.e = true;
                                        next.e = pmVar2.b;
                                    }
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                pl.a aVar3 = new pl.a(plVar, (byte) 0);
                                aVar3.d = pmVar2.a;
                                aVar3.e = pmVar2.b;
                                plVar.d.add(aVar3);
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ke.a(plVar.c).a("layer-infos", JsonUtils.collectionToJson(plVar.d));
                    }
                }
            }
        } else {
            fpVar = null;
        }
        if (this.d != null) {
            qq qqVar = this.d;
            String a3 = qqVar.d.a(ej.A);
            if (jSONArray != null && (a2 = qq.a(jSONArray)) != null) {
                qqVar.c.clear();
                qqVar.c.addAll(a2);
                if (!jSONArray.toString().equals(a3)) {
                    qqVar.d.a();
                    qqVar.d.a(ej.A, jSONArray.toString());
                }
            }
            ab abVar = this.j.o;
            if (abVar != null) {
                if (fpVar != null) {
                    abVar.b = fpVar;
                    kj.b(ki.f, "IndoorAuth:".concat(String.valueOf(fpVar)));
                    abVar.a.a(ej.B, fpVar.c);
                    abVar.a.a(ej.C, fpVar.d);
                    if (fpVar.e != null) {
                        abVar.a.a(ej.D, fpVar.e.toString());
                    }
                    if (abVar.d != null) {
                        abVar.d.a(abVar.a());
                        if (abVar.a() == 1) {
                            abVar.d.a(abVar.b());
                        }
                    }
                } else {
                    abVar.a.a(new String[]{ej.B, ej.C, ej.D});
                }
                if (abVar.b == null) {
                    abVar.b = new fp();
                }
                jy.a(new ab.AnonymousClass1());
            }
            pj pjVar = this.h;
            String a4 = this.d.a();
            String a5 = pjVar.a();
            if (pj.e.containsKey(a5)) {
                pjVar.a(a5, pjVar.f);
            } else {
                pjVar.a(a5, pjVar.f);
                kn.b(km.V);
                jy.b(new pj.a(pjVar, a4, fpVar));
            }
        }
        if (this.f != null && aVar != null) {
            if (aVar.e == qz.d || aVar.e == qz.e) {
                this.f.g(true);
            } else {
                this.f.g(false);
            }
            dw dwVar = (dw) this.f.getMapComponent(dw.class);
            if (dwVar != null) {
                dwVar.a(aVar.c);
            }
        }
        kn.d(km.U);
    }
}
