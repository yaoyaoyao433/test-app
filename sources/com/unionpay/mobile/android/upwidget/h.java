package com.unionpay.mobile.android.upwidget;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class h implements AdapterView.OnItemClickListener {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.a = gVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList;
        arrayList = this.a.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AdapterView.OnItemClickListener) it.next()).onItemClick(adapterView, view, i, j);
        }
    }
}
