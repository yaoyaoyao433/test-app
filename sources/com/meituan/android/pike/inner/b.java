package com.meituan.android.pike.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import io.socket.client.e;
import io.socket.emitter.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private Map<String, a.InterfaceC1525a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "571b7c108a11a36a299cc1e6af2b39a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "571b7c108a11a36a299cc1e6af2b39a9");
            return;
        }
        this.b = new HashMap();
        this.b.put("pike", null);
        this.b.put("connect_error", null);
        this.b.put("connect_timeout", null);
        this.b.put("connect", null);
        this.b.put("connecting", null);
        this.b.put("disconnect", null);
        this.b.put("error", null);
        this.b.put("reconnect", null);
        this.b.put("reconnect_attempt", null);
        this.b.put("reconnect_error", null);
        this.b.put("reconnect_failed", null);
        this.b.put("reconnecting", null);
    }

    public final void a(e eVar, final c cVar) {
        Object[] objArr = {eVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e300bf2552bc31814f8b46c62f248f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e300bf2552bc31814f8b46c62f248f");
            return;
        }
        for (Map.Entry<String, a.InterfaceC1525a> entry : this.b.entrySet()) {
            final String key = entry.getKey();
            a.InterfaceC1525a interfaceC1525a = new a.InterfaceC1525a() { // from class: com.meituan.android.pike.inner.b.1
                public static ChangeQuickRedirect a;

                @Override // io.socket.emitter.a.InterfaceC1525a
                public final void a(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "6b937058f8fab4e652474b2b4a7b6374", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "6b937058f8fab4e652474b2b4a7b6374");
                    } else {
                        cVar.a(key, objArr2);
                    }
                }
            };
            this.b.put(key, interfaceC1525a);
            eVar.a(key, interfaceC1525a);
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4e1e62002686be53189f342d1a40f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4e1e62002686be53189f342d1a40f4");
            return;
        }
        for (Map.Entry<String, a.InterfaceC1525a> entry : this.b.entrySet()) {
            eVar.c(entry.getKey(), entry.getValue());
        }
    }
}
