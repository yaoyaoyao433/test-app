package com.sankuai.waimai.platform.widget.recycler;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f implements View.OnClickListener {
    public static ChangeQuickRedirect c;
    private long a;
    private long b;
    boolean d;

    public abstract void a(View view);

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00fc4d5474f52068c608cf40d4ef208e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00fc4d5474f52068c608cf40d4ef208e");
            return;
        }
        this.b = 1000L;
        this.d = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91eb43fe8c09fa9011b4b2a4e9f353c6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91eb43fe8c09fa9011b4b2a4e9f353c6");
        } else if (!this.d) {
            a(view);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.a > this.b) {
                a(view);
                this.a = currentTimeMillis;
            }
        }
    }
}
