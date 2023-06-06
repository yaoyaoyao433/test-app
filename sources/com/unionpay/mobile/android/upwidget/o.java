package com.unionpay.mobile.android.upwidget;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class o implements View.OnClickListener {
    final /* synthetic */ j a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j jVar) {
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i5;
        i = this.a.n;
        i2 = this.a.d;
        if (i != i2) {
            arrayList2 = this.a.g;
            i5 = this.a.n;
            Object obj = arrayList2.get(i5);
            if (obj instanceof c) {
                ((c) obj).a(-1);
            }
        }
        j jVar = this.a;
        i3 = this.a.o;
        jVar.n = i3;
        j jVar2 = this.a;
        i4 = this.a.d;
        jVar2.p = i4;
        arrayList = this.a.x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
    }
}
