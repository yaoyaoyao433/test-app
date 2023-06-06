package com.xiaomi.push.service;

import com.xiaomi.push.fo;
import com.xiaomi.push.service.XMPushService;
/* loaded from: classes6.dex */
public final class bk extends XMPushService.j {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ XMPushService d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(XMPushService xMPushService, int i, int i2, String str, byte[] bArr) {
        super(14);
        this.d = xMPushService;
        this.a = i2;
        this.b = str;
        this.c = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        fo foVar;
        this.d.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        cn.a = null;
        cn.a();
        ag.a().a("5");
        com.xiaomi.push.e.a(this.a);
        foVar = this.d.i;
        foVar.d = fo.a();
        com.xiaomi.channel.commonutils.logger.c.a("clear account and start registration. " + this.b);
        this.d.a(this.c, this.b);
    }
}
