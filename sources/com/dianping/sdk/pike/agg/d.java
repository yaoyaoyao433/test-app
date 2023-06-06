package com.dianping.sdk.pike.agg;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public long d;
    public String e;
    public int f;
    public int g;
    public long h;
    public int i;
    public List<f> j;
    public StringBuilder k;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a4a3b73eacda1741dabcddd90a64da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a4a3b73eacda1741dabcddd90a64da");
            return;
        }
        this.j = new ArrayList();
        this.k = new StringBuilder();
    }
}
