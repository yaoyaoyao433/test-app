package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ab implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ aa e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(aa aaVar, int i, List list, List list2, String str) {
        this.e = aaVar;
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.e.b;
        context = this.e.a;
        pushMessageCallback.onSetTags(context, this.a, this.b, this.c, this.d);
    }
}
