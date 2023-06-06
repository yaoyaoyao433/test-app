package com.vivo.push;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class l implements Runnable {
    public Context a;
    private int b;
    private o c;

    protected abstract void a(o oVar);

    public l(o oVar) {
        this.b = -1;
        this.c = oVar;
        this.b = oVar.b();
        if (this.b < 0) {
            throw new IllegalArgumentException("PushTask need a > 0 task id.");
        }
        this.a = e.a().h();
    }

    public final int a() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null && !(this.c instanceof com.vivo.push.b.n)) {
            Context context = this.a;
            com.vivo.push.util.p.a(context, "[执行指令]" + this.c);
        }
        a(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        sb.append(this.c == null ? "[null]" : this.c.toString());
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }
}
