package com.meituan.msc.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.msc.modules.container.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends t {
    public static ChangeQuickRedirect c;
    public static Uri e;
    public List<t> d;

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4404e20296a3fabe7912ad74f884a14a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4404e20296a3fabe7912ad74f884a14a");
        } else {
            this.d = new ArrayList();
        }
    }

    public final d a(t tVar) {
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67756785004c7b6f30e9a3f1858ae235", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67756785004c7b6f30e9a3f1858ae235");
        }
        this.d.add(tVar);
        return this;
    }

    public static Uri a() {
        return e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Context b;
        public boolean c;
        public boolean d;
        public Uri e;
        public Uri f;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d22d7113321f79a3224cf879a4fd866", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d22d7113321f79a3224cf879a4fd866");
                return;
            }
            this.c = true;
            this.b = context;
        }
    }

    @Override // com.meituan.msc.modules.container.t
    public final boolean a(Context context, Intent intent, boolean z) {
        boolean z2 = false;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aafd24d0ace19302a0e5694ef997150b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aafd24d0ace19302a0e5694ef997150b")).booleanValue();
        }
        for (t tVar : this.d) {
            if (tVar.a(context, intent, z)) {
                z2 = true;
            }
        }
        return z2;
    }
}
