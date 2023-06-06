package com.huawei.hmf.tasks;
/* loaded from: classes2.dex */
public final class g<TResult> {
    public final com.huawei.hmf.tasks.a.e<TResult> a = new com.huawei.hmf.tasks.a.e<>();

    public g() {
    }

    public g(a aVar) {
        new Runnable() { // from class: com.huawei.hmf.tasks.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a.f();
            }
        };
    }

    public final void a(TResult tresult) {
        com.huawei.hmf.tasks.a.e<TResult> eVar = this.a;
        synchronized (eVar.a) {
            if (eVar.b) {
                return;
            }
            eVar.b = true;
            eVar.c = tresult;
            eVar.a.notifyAll();
            eVar.g();
        }
    }

    public final void a(Exception exc) {
        com.huawei.hmf.tasks.a.e<TResult> eVar = this.a;
        synchronized (eVar.a) {
            if (eVar.b) {
                return;
            }
            eVar.b = true;
            eVar.d = exc;
            eVar.a.notifyAll();
            eVar.g();
        }
    }
}
