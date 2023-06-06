package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import java.util.Date;
/* loaded from: classes6.dex */
public final class fm implements fq {
    final /* synthetic */ fl a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fm(fl flVar) {
        this.a = flVar;
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar) {
        com.xiaomi.channel.commonutils.logger.c.c("[Slim] " + this.a.b.format(new Date()) + " Connection started (" + this.a.c.hashCode() + CommonConstant.Symbol.BRACKET_RIGHT);
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar, int i, Exception exc) {
        com.xiaomi.channel.commonutils.logger.c.c("[Slim] " + this.a.b.format(new Date()) + " Connection closed (" + this.a.c.hashCode() + CommonConstant.Symbol.BRACKET_RIGHT);
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar, Exception exc) {
        com.xiaomi.channel.commonutils.logger.c.c("[Slim] " + this.a.b.format(new Date()) + " Reconnection failed due to an exception (" + this.a.c.hashCode() + CommonConstant.Symbol.BRACKET_RIGHT);
        exc.printStackTrace();
    }

    @Override // com.xiaomi.push.fq
    public final void b(fn fnVar) {
        com.xiaomi.channel.commonutils.logger.c.c("[Slim] " + this.a.b.format(new Date()) + " Connection reconnected (" + this.a.c.hashCode() + CommonConstant.Symbol.BRACKET_RIGHT);
    }
}
