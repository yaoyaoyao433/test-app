package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class cm implements com.xiaomi.channel.commonutils.logger.a {
    private com.xiaomi.channel.commonutils.logger.a a;
    private com.xiaomi.channel.commonutils.logger.a b;

    public cm(com.xiaomi.channel.commonutils.logger.a aVar, com.xiaomi.channel.commonutils.logger.a aVar2) {
        this.a = null;
        this.b = null;
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.xiaomi.channel.commonutils.logger.a
    public final void a(String str) {
        if (this.a != null) {
            this.a.a(str);
        }
        if (this.b != null) {
            this.b.a(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.a
    public final void a(String str, Throwable th) {
        if (this.a != null) {
            this.a.a(str, th);
        }
        if (this.b != null) {
            this.b.a(str, th);
        }
    }
}
