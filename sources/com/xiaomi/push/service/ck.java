package com.xiaomi.push.service;

import com.xiaomi.push.gz;
import com.xiaomi.push.he;
import java.util.List;
/* loaded from: classes6.dex */
public final class ck implements gz {
    final XMPushService a;

    public ck(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.gz
    public final void a(List<he> list, String str, String str2) {
        this.a.a(new cl(this, 4, str, list, str2), 0L);
    }
}
