package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.p;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class gu extends p.b {
    final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gu(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.p.b
    public final void a() {
        Object obj;
        ArrayList arrayList;
        List list;
        List list2;
        obj = gt.d;
        synchronized (obj) {
            list = gt.e;
            arrayList = new ArrayList(list);
            list2 = gt.e;
            list2.clear();
        }
        gt.a(this.a, arrayList);
    }
}
