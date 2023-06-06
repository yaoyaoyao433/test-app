package com.meituan.msc.modules.api.legacy.timing;

import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.JavaCallback;
import com.meituan.msc.jse.bridge.JavaFunctionsInterface;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.f;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = "MainTiming")
/* loaded from: classes3.dex */
public class c extends k {
    public static ChangeQuickRedirect a;
    b b;
    boolean c;
    private q d;
    private q e;
    private q f;
    private q g;

    public static /* synthetic */ JSTimers a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bf215e490318b5e135541afbfd9407cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSTimers) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bf215e490318b5e135541afbfd9407cb");
        }
        JSInstance d = ((com.meituan.msc.modules.engine.k) cVar.U_().c(com.meituan.msc.modules.engine.k.class)).d();
        if (d == null) {
            return null;
        }
        return (JSTimers) d.getJSModule(JSTimers.class);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d399e25f4e4c6c8f594115999c6c303", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d399e25f4e4c6c8f594115999c6c303");
            return;
        }
        this.c = false;
        this.d = new q() { // from class: com.meituan.msc.modules.api.legacy.timing.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f81cc41d9a75c9dd294d96814cf1e17b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f81cc41d9a75c9dd294d96814cf1e17b");
                } else if (fVar.c == com.meituan.msc.modules.service.a.Released) {
                    c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "af17cfbf612ebb2399641a2b929d2fcf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "af17cfbf612ebb2399641a2b929d2fcf");
                    } else {
                        cVar.b.d();
                    }
                }
            }
        };
        this.e = new q() { // from class: com.meituan.msc.modules.api.legacy.timing.c.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07f448148f8065dcff971fba52ea586b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07f448148f8065dcff971fba52ea586b");
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "e39ac43626e136b13c1224945f60286f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "e39ac43626e136b13c1224945f60286f");
                } else if (cVar.c) {
                } else {
                    cVar.b.a();
                }
            }
        };
        this.f = new q() { // from class: com.meituan.msc.modules.api.legacy.timing.c.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a924b1e48c033fb5a54ccb67d3f4952b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a924b1e48c033fb5a54ccb67d3f4952b");
                } else {
                    c.this.c();
                }
            }
        };
        this.g = new q() { // from class: com.meituan.msc.modules.api.legacy.timing.c.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3086cf3d0e5bbe7aa324f27eb60edd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3086cf3d0e5bbe7aa324f27eb60edd0");
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "baa1f4ab657500ba34e4bede68f9a4f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "baa1f4ab657500ba34e4bede68f9a4f4");
                } else {
                    cVar.b.c();
                }
            }
        };
        this.b = new b(new com.meituan.msc.modules.api.legacy.timing.a() { // from class: com.meituan.msc.modules.api.legacy.timing.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.api.legacy.timing.a
            public final void a(WritableArray writableArray) {
                Object[] objArr2 = {writableArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e08a9d3a559c2a36ace780581bc560d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e08a9d3a559c2a36ace780581bc560d");
                    return;
                }
                JSTimers a2 = c.a(c.this);
                if (a2 == null) {
                    return;
                }
                a2.callTimers(writableArray);
            }

            @Override // com.meituan.msc.modules.api.legacy.timing.a
            public final void a(double d) {
                Object[] objArr2 = {Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78cb35f5fbf51c56fad50ab1f15c3b19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78cb35f5fbf51c56fad50ab1f15c3b19");
                    return;
                }
                JSTimers a2 = c.a(c.this);
                if (a2 == null) {
                    return;
                }
                a2.callIdleCallbacks(d);
            }
        });
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aaebda6ef0685eb96a9efc3c649c3ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aaebda6ef0685eb96a9efc3c649c3ea");
            return;
        }
        super.a(hVar);
        U_().a("msc_event_engine_status_changed", this.d);
        U_().a("msc_event_container_resumed", this.g);
        U_().a("msc_event_container_paused", this.e);
        U_().a("msc_event_container_destroyed", this.f);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c103e5d07a253312e22cb94c02ab5551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c103e5d07a253312e22cb94c02ab5551");
        } else {
            this.b.b();
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b430dfea5bb29b1e21deae665daa99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b430dfea5bb29b1e21deae665daa99");
            return;
        }
        c();
        U_().a(this.d);
        U_().a(this.e);
        U_().a(this.f);
        U_().a(this.g);
        super.L_();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements JavaFunctionsInterface {
        public static ChangeQuickRedirect a;
        private JavaCallback c;
        private JavaCallback d;

        public a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c703cc47aa132148c0f097c34c562cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c703cc47aa132148c0f097c34c562cc");
                return;
            }
            this.c = new JavaCallback() { // from class: com.meituan.msc.modules.api.legacy.timing.c.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.JavaCallback
                public final String invoke(ReadableArray readableArray) {
                    Object[] objArr2 = {readableArray};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fabe7149f432de734183b80c8fe44c5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fabe7149f432de734183b80c8fe44c5");
                    }
                    if (readableArray == null || readableArray.size() != 4) {
                        return null;
                    }
                    int i = (int) readableArray.getDouble(1);
                    boolean z = readableArray.getBoolean(3);
                    c.this.b.createTimer((int) readableArray.getDouble(0), Math.max(0L, (((long) readableArray.getDouble(2)) - System.currentTimeMillis()) + i), i, z);
                    return null;
                }
            };
            this.d = new JavaCallback() { // from class: com.meituan.msc.modules.api.legacy.timing.c.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.JavaCallback
                public final String invoke(ReadableArray readableArray) {
                    Object[] objArr2 = {readableArray};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b334997da135adfc798e166d6f5a8899", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b334997da135adfc798e166d6f5a8899");
                    }
                    if (readableArray == null || readableArray.size() <= 0) {
                        return null;
                    }
                    c.this.b.deleteTimer(readableArray.getInt(0));
                    return null;
                }
            };
        }

        @Override // com.meituan.msc.jse.bridge.JavaFunctionsInterface
        public final String[] getFunctionNames() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3deeea7bd55fc013518f6f46c8b2b46", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3deeea7bd55fc013518f6f46c8b2b46") : new String[]{"createTimer", "deleteTimer"};
        }

        @Override // com.meituan.msc.jse.bridge.JavaFunctionsInterface
        public final JavaCallback[] getFunctions() {
            return new JavaCallback[]{this.c, this.d};
        }
    }
}
