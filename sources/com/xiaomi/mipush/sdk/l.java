package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.dr;
import com.xiaomi.push.service.z;
/* loaded from: classes6.dex */
public final class l extends z.a {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i, String str, Context context) {
        super(100, str);
        this.a = context;
    }

    @Override // com.xiaomi.push.service.z.a
    public final void a() {
        dr.a(this.a);
    }
}
