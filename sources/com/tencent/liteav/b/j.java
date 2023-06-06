package com.tencent.liteav.b;

import android.annotation.TargetApi;
import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.i.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(17)
/* loaded from: classes6.dex */
public class j {
    private com.tencent.liteav.l.a a;
    private List<a.C1455a> b;
    private int c;
    private int d;

    public j(Context context) {
        this.a = new com.tencent.liteav.l.a(context);
    }

    public void a(List<a.C1455a> list, int i, int i2) {
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public int a(ArrayList<f> arrayList) {
        if (arrayList == null || this.b.size() != arrayList.size()) {
            TXCLog.e("TXCombineProcess", "join picture must has same TXAbsoluteRect!!!");
            return -1;
        }
        com.tencent.liteav.basic.e.a[] aVarArr = new com.tencent.liteav.basic.e.a[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            a.C1455a c1455a = this.b.get(i);
            com.tencent.liteav.basic.e.a aVar = new com.tencent.liteav.basic.e.a();
            aVar.a = arrayList.get(i).a;
            aVar.b = 0;
            if (arrayList.get(i).b != null) {
                aVar.c = arrayList.get(i).b.m();
                aVar.d = arrayList.get(i).b.n();
            } else {
                aVar.c = c1455a.c;
                aVar.d = c1455a.d;
            }
            aVar.f = com.tencent.liteav.basic.util.g.a(aVar.c, aVar.d, c1455a.c, c1455a.d);
            aVar.g = new com.tencent.liteav.basic.opengl.a(c1455a.a, c1455a.b, c1455a.c, c1455a.d);
            aVarArr[i] = aVar;
        }
        this.a.a(this.c, this.d);
        this.a.b(this.c, this.d);
        return this.a.a(aVarArr, 0);
    }

    public void a() {
        TXCLog.i("TXCombineProcess", "destroy!");
        if (this.a != null) {
            this.a.a();
        }
    }
}
