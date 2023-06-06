package com.sankuai.waimai.touchmatrix.show;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.touchmatrix.rebuild.mach.g {
    public static ChangeQuickRedirect a;
    public List<InterfaceC1357a> b;
    private boolean c;
    private boolean d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.show.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1357a {
        void a(@NonNull String str, @Nullable Map<String, Object> map);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.d = true;
        return true;
    }

    public a(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9130d9d3155d314286b070a22cfd51d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9130d9d3155d314286b070a22cfd51d4");
            return;
        }
        this.c = false;
        this.d = false;
        this.b = new ArrayList();
        a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.touchmatrix.show.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c55d7f1e5e0767e484ee6aacf6f7da10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c55d7f1e5e0767e484ee6aacf6f7da10");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("FuTiaoMachContainer", "Mach onMachViewAttached() ", new Object[0]);
                a.a(a.this, true);
                if (a.this.l != null) {
                    a.this.l.post(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.show.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c4a93b6a7e07d57f95984349518cf5b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c4a93b6a7e07d57f95984349518cf5b");
                                return;
                            }
                            a.this.a(ah.a(a.this.l));
                            a.this.a();
                        }
                    });
                }
            }
        });
    }

    public final void a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ac24d7367892436f80a88c7f2d3afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ac24d7367892436f80a88c7f2d3afc");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c953716c28b7160ed84b27e9b2b8bfc6", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c953716c28b7160ed84b27e9b2b8bfc6")).booleanValue();
        } else if (this.d && !this.c && this.l.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            e();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.g, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3073653657ef40f5928a6c8fcab6e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3073653657ef40f5928a6c8fcab6e4");
            return;
        }
        super.a(str, map);
        if (this.b == null || this.b.size() <= 0) {
            return;
        }
        for (InterfaceC1357a interfaceC1357a : this.b) {
            if (interfaceC1357a != null) {
                interfaceC1357a.a(str, map);
            }
        }
    }
}
