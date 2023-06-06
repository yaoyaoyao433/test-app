package com.meituan.android.edfu.mvex.detectors;

import android.content.Context;
import com.meituan.android.edfu.mvex.interfaces.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public HashMap<Integer, com.meituan.android.edfu.mvex.interfaces.a> b;
    public Context c;
    public int d;
    public a.InterfaceC0253a e;
    public a.InterfaceC0253a f;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8735e251d31afe5acf59afde87f7ac5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8735e251d31afe5acf59afde87f7ac5b");
            return;
        }
        this.f = new a.InterfaceC0253a() { // from class: com.meituan.android.edfu.mvex.detectors.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mvex.interfaces.a.InterfaceC0253a
            public final void a(com.meituan.android.edfu.mvex.netservice.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9675909b0dfc0e1451052b5e465973c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9675909b0dfc0e1451052b5e465973c2");
                } else if (b.this.e != null) {
                    b.this.e.a(cVar);
                }
            }

            @Override // com.meituan.android.edfu.mvex.interfaces.a.InterfaceC0253a
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5fb0f3ad5107e88406cf47cd03fc3cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5fb0f3ad5107e88406cf47cd03fc3cb");
                } else if (b.this.e != null) {
                    b.this.e.a(i, str);
                }
            }

            @Override // com.meituan.android.edfu.mvex.interfaces.a.InterfaceC0253a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8a161060e0a3a45aa3095acae09526d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8a161060e0a3a45aa3095acae09526d");
                } else if (b.this.e != null) {
                    b.this.e.a(str);
                }
            }
        };
        this.b = new HashMap<>();
        this.c = context;
    }

    public com.meituan.android.edfu.mvex.interfaces.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8182808a89695f9a562442034fe729c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.edfu.mvex.interfaces.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8182808a89695f9a562442034fe729c") : this.b.get(Integer.valueOf(this.d));
    }
}
