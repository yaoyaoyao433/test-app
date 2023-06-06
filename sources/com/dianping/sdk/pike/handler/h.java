package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.packet.ab;
import com.dianping.sdk.pike.packet.ac;
import com.dianping.sdk.pike.packet.af;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h<S extends ac, R extends ab> extends f<R> {
    public static ChangeQuickRedirect a;
    protected final j<S> i;
    protected final Class<S> j;
    private final Queue<String> k;

    public h(q qVar, Class<S> cls, Class<R> cls2, j<S> jVar) {
        super(qVar, cls2, "message down", -30);
        Object[] objArr = {qVar, cls, cls2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ecdd1f53655b9e54a63c64271a5e16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ecdd1f53655b9e54a63c64271a5e16");
            return;
        }
        this.k = new ArrayBlockingQueue(50);
        this.j = cls;
        this.i = jVar;
    }

    @Override // com.dianping.sdk.pike.handler.f, com.dianping.sdk.pike.handler.d
    public final void a(com.dianping.sdk.pike.service.l lVar, af afVar) {
        String str;
        Object[] objArr = {lVar, afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729e47542cf6ac782036f7ba42919c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729e47542cf6ac782036f7ba42919c88");
            return;
        }
        final ab abVar = (ab) a(afVar);
        if (abVar == null || (str = abVar.b) == null) {
            return;
        }
        if (!this.k.contains(str)) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa2154adefa8eda4ed0c6205bb854197", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa2154adefa8eda4ed0c6205bb854197");
            } else {
                if (this.k.size() >= 50) {
                    this.k.poll();
                }
                this.k.offer(str);
            }
            Object[] objArr3 = {abVar};
            ChangeQuickRedirect changeQuickRedirect3 = d.b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03c66bbc8af3a94f3de387758e10a88f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03c66bbc8af3a94f3de387758e10a88f");
                return;
            } else {
                this.c.a(new Runnable() { // from class: com.dianping.sdk.pike.handler.d.2
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0f7abaa71fd64cbdc0c80feec3840d53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0f7abaa71fd64cbdc0c80feec3840d53");
                        } else if (this.d != null) {
                            this.d.a((b<R>) abVar);
                        }
                    }
                });
                return;
            }
        }
        com.dianping.sdk.pike.i.a("MessageDown", "message id exist.messageId : " + str);
        String str2 = abVar.c;
        Object[] objArr4 = {str2, str};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f0e71e27449e4d01be61bb1616eab2b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f0e71e27449e4d01be61bb1616eab2b8");
        } else if (this.i == null || this.j == null) {
        } else {
            try {
                S newInstance = this.j.newInstance();
                newInstance.c = str2;
                newInstance.a = str;
                newInstance.b = 2;
                this.i.a(newInstance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
