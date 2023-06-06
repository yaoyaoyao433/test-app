package com.xiaomi.push;

import android.content.Context;
import java.io.File;
/* loaded from: classes6.dex */
public final class jv extends ju {
    final /* synthetic */ Runnable a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.a = runnable;
    }

    @Override // com.xiaomi.push.ju
    protected final void a(Context context) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
