package com.meituan.android.pike.message;

import com.meituan.android.pike.message.b;
import com.meituan.android.pike.taskqueue.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final Object b;
    com.meituan.android.pike.message.b c;
    e d;
    Map<String, a> e;

    public c(com.meituan.android.pike.message.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419ea0ed804547d573c762a098400551", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419ea0ed804547d573c762a098400551");
            return;
        }
        this.c = bVar;
        this.d = new e();
        this.e = new HashMap();
        this.b = new Object();
        this.d.a();
    }

    public final void a(String str) {
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836a8437435dcc838ef5bf4f40423269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836a8437435dcc838ef5bf4f40423269");
            return;
        }
        synchronized (this.b) {
            j = this.e.containsKey(str) ? this.e.get(str).a : -1L;
            this.e.remove(str);
            if (this.e.isEmpty()) {
                this.d.b();
            }
        }
        if (j != -1) {
            this.d.a(j);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47e250aa80d4335cc1775ef9a20d3d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47e250aa80d4335cc1775ef9a20d3d3");
            return;
        }
        this.d.b();
        synchronized (this.b) {
            this.e.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        UNKNOWN,
        NORMAL,
        CANCEL,
        TRANSMIT,
        DATA;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403fc9ca8bc81f394e8bed584aa3186a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403fc9ca8bc81f394e8bed584aa3186a");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b39b174d6d57a3202c07c7840ee3cd16", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b39b174d6d57a3202c07c7840ee3cd16") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da33d04a29aa10e584b31bbeb4c1f983", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da33d04a29aa10e584b31bbeb4c1f983") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public long a;
        public int b;
        public b.C0345b c;
        public long d;
        public int e;

        private a() {
        }
    }
}
