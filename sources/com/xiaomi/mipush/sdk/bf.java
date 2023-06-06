package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.cq;
import com.xiaomi.push.ha;
import com.xiaomi.push.ho;
import com.xiaomi.push.ia;
/* loaded from: classes6.dex */
public final class bf implements cq {
    private Context a;

    public bf(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.cq
    public final void a(ia iaVar, ha haVar, ho hoVar) {
        ag.a(this.a).a((ag) iaVar, haVar, (ho) null);
    }

    @Override // com.xiaomi.push.cq
    public final String a() {
        return ap.a(this.a).b.d;
    }
}
