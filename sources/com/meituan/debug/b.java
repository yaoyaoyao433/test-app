package com.meituan.debug;

import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.android.privacy.interfaces.monitor.b {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.privacy.interfaces.monitor.b b;
    private final List<Integer> c;
    private final a d;

    public b(com.meituan.android.privacy.interfaces.monitor.b bVar, a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f0baf33c5e23ba9af788a0b104b1435", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f0baf33c5e23ba9af788a0b104b1435");
            return;
        }
        this.c = Arrays.asList(-2, -12, -1, -11, -100);
        this.b = bVar;
        this.d = aVar;
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5eb0b181e1e676ff42ec110a24a6aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5eb0b181e1e676ff42ec110a24a6aa");
            return;
        }
        if (this.b != null) {
            this.b.a(dVar);
        }
        if (this.c.contains(Integer.valueOf(dVar.e))) {
            final a aVar = this.d;
            final String str = "权限: " + dVar.d + ", token:" + dVar.c + ", 错误码: " + dVar.e;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "250014885e6bd180e989b1d0a6b5d615", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "250014885e6bd180e989b1d0a6b5d615");
            } else {
                aVar.k.post(new Runnable() { // from class: com.meituan.debug.a.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3f6039a3ed2e9f8e0d2c7799cd8c0b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3f6039a3ed2e9f8e0d2c7799cd8c0b1");
                            return;
                        }
                        a.this.r.add(str);
                        a.this.a();
                        a.this.b();
                    }
                });
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831f1d99c2289f5c8540cf2272fdf5f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831f1d99c2289f5c8540cf2272fdf5f1");
        } else if (this.b != null) {
            this.b.a(aVar, i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void b(c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5ea06411f2e8afb4c558369752b28f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5ea06411f2e8afb4c558369752b28f");
        } else if (this.b != null) {
            this.b.b(aVar, i);
        }
    }
}
