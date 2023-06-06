package com.meituan.snare;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public ThreadLocal<String> b;
    private q c;
    private l d;
    private c e;
    private Context f;
    private String g;

    private d(Context context, String str, q qVar, c cVar, l lVar) {
        Object[] objArr = {context, str, qVar, cVar, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bedcaf156986050fc8bebfba5b86967a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bedcaf156986050fc8bebfba5b86967a");
            return;
        }
        this.b = new ThreadLocal<>();
        this.g = str;
        this.c = qVar;
        this.e = cVar;
        this.d = lVar;
        this.f = context;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public q c;
        public c d;
        public Context e;
        public l f;

        public a(Context context, l lVar) {
            Object[] objArr = {context, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225c69569330f777bf231536ad8570bf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225c69569330f777bf231536ad8570bf");
                return;
            }
            this.e = context.getApplicationContext();
            this.f = lVar;
        }
    }
}
