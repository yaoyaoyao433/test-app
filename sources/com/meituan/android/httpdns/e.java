package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private final List<a<String, Integer>> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117c128e07c09337d9636c1417ae05f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117c128e07c09337d9636c1417ae05f7");
        } else {
            this.b = Collections.synchronizedList(new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<String, Integer> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed42dcbcd183c5c084cc898f6ee98b4a", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed42dcbcd183c5c084cc898f6ee98b4a");
        }
        if (x.a(str)) {
            return null;
        }
        for (int i = 0; i < this.b.size(); i++) {
            a<String, Integer> aVar = this.b.get(i);
            if (aVar != null && x.a(str, aVar.a)) {
                return aVar;
            }
        }
        a<String, Integer> aVar2 = new a<>(str, 0);
        this.b.add(aVar2);
        return aVar2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a<F, S> {
        public F a;
        public S b;

        public a(F f, S s) {
            this.a = f;
            this.b = s;
        }
    }
}
