package com.dianping.judas;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements com.dianping.judas.interfaces.a {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private String d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3c41b471eaceab6571689171581be5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3c41b471eaceab6571689171581be5");
        } else if (context == null) {
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.c = displayMetrics.heightPixels;
            this.b = displayMetrics.widthPixels;
            this.d = context.getClass().getName();
        }
    }

    @Override // com.dianping.judas.interfaces.a
    public final int a() {
        return this.c;
    }

    @Override // com.dianping.judas.interfaces.a
    public final String b() {
        return this.d;
    }
}
