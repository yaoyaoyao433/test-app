package com.unionpay.mobile.android.upwidget;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.unionpay.mobile.android.upwidget.j;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class p implements View.OnClickListener {
    final /* synthetic */ j a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(j jVar) {
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        boolean z;
        j.a[] aVarArr;
        j.a[] aVarArr2;
        ArrayList arrayList;
        j.a[] aVarArr3;
        int intValue = ((Integer) view.getTag()).intValue();
        i = this.a.o;
        if (intValue == i) {
            return;
        }
        this.a.a(intValue);
        z = this.a.e;
        if (z) {
            aVarArr = this.a.f;
            if (!TextUtils.isEmpty(aVarArr[intValue].d)) {
                aVarArr2 = this.a.f;
                view.setTag(aVarArr2[intValue].d);
                arrayList = this.a.w;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                j jVar = this.a;
                aVarArr3 = this.a.f;
                jVar.a((LinearLayout) aVarArr3[intValue].c, true, "正在查询。。。", null, null);
                j.o(this.a);
            }
        }
        view.setTag(Integer.valueOf(intValue));
    }
}
