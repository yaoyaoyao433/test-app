package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.dh;
import com.xiaomi.push.hg;
import com.xiaomi.push.service.z;
/* loaded from: classes6.dex */
public final class be extends z.a {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(int i, String str, Context context) {
        super(102, str);
        this.a = context;
    }

    @Override // com.xiaomi.push.service.z.a
    public final void a() {
        dh.a(this.a).d = com.xiaomi.push.service.z.a(this.a).a(hg.AwakeInfoUploadWaySwitch.by, 0);
    }
}
