package com.sankuai.waimai.log.judas;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Handler b = new Handler();
    private final Map<String, a> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c28074ef7b3d193db9c32811fa4ef7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c28074ef7b3d193db9c32811fa4ef7");
        } else {
            this.c = new HashMap();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646c747ba1ea95641350aada4fae0e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646c747ba1ea95641350aada4fae0e18");
        } else {
            b.post(new Runnable() { // from class: com.sankuai.waimai.log.judas.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aebebd0229f81db3697375074f92b1a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aebebd0229f81db3697375074f92b1a7");
                    } else {
                        b.this.b();
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9767fa00609a407810d69a455d52e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9767fa00609a407810d69a455d52e6");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("ExposeHelper", new com.sankuai.waimai.foundation.utils.log.b("expose start, map = ").a(this.c).toString(), new Object[0]);
        }
        for (a aVar : this.c.values()) {
            aVar.a();
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("ExposeHelper", "expose end", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @NonNull
        private WeakReference<View> b;
        @NonNull
        private Runnable c;
        private boolean d;

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6fba02f078e40f3fdc0f71e30f693f0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6fba02f078e40f3fdc0f71e30f693f0")).booleanValue();
            }
            if (this.d || !b()) {
                return false;
            }
            this.d = true;
            this.c.run();
            return true;
        }

        private boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02aac8dbd18111ea9f0c6759cbfa5c54", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02aac8dbd18111ea9f0c6759cbfa5c54")).booleanValue();
            }
            View view = this.b.get();
            return view != null && view.isShown() && ah.b(view);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41957cc70c861866371ff2587c7080a9", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41957cc70c861866371ff2587c7080a9");
            }
            return new com.sankuai.waimai.foundation.utils.log.b().a(this.b.get()).a(" (").a(this.d ? "hasExpose" : "notExpose").a(CommonConstant.Symbol.BRACKET_RIGHT).toString();
        }
    }
}
