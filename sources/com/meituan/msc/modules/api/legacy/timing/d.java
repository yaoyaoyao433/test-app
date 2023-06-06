package com.meituan.msc.modules.api.legacy.timing;

import com.facebook.react.modules.core.TimingModule;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.f;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.q;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = TimingModule.NAME)
/* loaded from: classes3.dex */
public final class d extends k {
    public static ChangeQuickRedirect a;
    boolean b;
    final b c;
    private volatile boolean d;

    public static /* synthetic */ JSTimers b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "e5c5e03dc1d67725b6d61aee6612c748", RobustBitConfig.DEFAULT_VALUE) ? (JSTimers) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "e5c5e03dc1d67725b6d61aee6612c748") : (JSTimers) dVar.U_().a(JSTimers.class);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements com.meituan.msc.modules.api.legacy.timing.a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.msc.modules.api.legacy.timing.a
        public final void a(WritableArray writableArray) {
            Object[] objArr = {writableArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57675f4538f20f4bee2683d00bdde915", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57675f4538f20f4bee2683d00bdde915");
            } else if (d.this.d) {
                g.a("[BridgeTimerManager@callTimers]", "TimingModule destroyed");
            } else {
                JSTimers b = d.b(d.this);
                if (b == null) {
                    return;
                }
                b.callTimers(writableArray);
            }
        }

        @Override // com.meituan.msc.modules.api.legacy.timing.a
        public final void a(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e113f724990030934a98498f570c71b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e113f724990030934a98498f570c71b");
            } else if (d.this.d) {
                g.a("[BridgeTimerManager@callIdleCallbacks]", "TimingModule destroyed");
            } else {
                JSTimers b = d.b(d.this);
                if (b == null) {
                    return;
                }
                b.callIdleCallbacks(d);
            }
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "241030615b3c0b5b807a1398c67ec2d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "241030615b3c0b5b807a1398c67ec2d5");
            return;
        }
        this.b = true;
        this.d = false;
        this.c = new b(new a());
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a017d1f4147ba42b24b96decbf5d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a017d1f4147ba42b24b96decbf5d6d");
            return;
        }
        super.a(hVar);
        this.c.b = ((com.meituan.msc.modules.engine.a) c(com.meituan.msc.modules.engine.a.class)).f();
        this.d = false;
        U_().a("msc_event_engine_status_changed", new q<com.meituan.msc.modules.service.a>() { // from class: com.meituan.msc.modules.api.legacy.timing.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f<com.meituan.msc.modules.service.a> fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a89659d5f006696ca8464c66691947c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a89659d5f006696ca8464c66691947c");
                } else if (fVar.c == com.meituan.msc.modules.service.a.Released) {
                    d dVar = d.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3cbb26c0192581a852fc54be7dc1a0af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3cbb26c0192581a852fc54be7dc1a0af");
                    } else {
                        dVar.c.d();
                    }
                }
            }
        });
        U_().a("msc_event_container_resumed", new q() { // from class: com.meituan.msc.modules.api.legacy.timing.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c626a714aaba09b4e2854ca23a771165", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c626a714aaba09b4e2854ca23a771165");
                    return;
                }
                d dVar = d.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "00bfa0feac943d910cfdc297e1bb9913", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "00bfa0feac943d910cfdc297e1bb9913");
                } else {
                    dVar.c.c();
                }
            }
        });
        U_().a("msc_event_container_paused", new q() { // from class: com.meituan.msc.modules.api.legacy.timing.d.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                boolean z = true;
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "472ed7b30a295827f71aac5bb555ec6e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "472ed7b30a295827f71aac5bb555ec6e");
                    return;
                }
                d dVar = d.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "ff5a66afcad6563abd738a618ca2b361", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "ff5a66afcad6563abd738a618ca2b361");
                    return;
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "f6a216c9067a7263a55b0cb2aa8c5469", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "f6a216c9067a7263a55b0cb2aa8c5469")).booleanValue();
                } else if (!dVar.b || MSCHornRollbackConfig.o()) {
                    z = false;
                }
                if (z) {
                    return;
                }
                dVar.c.a();
            }
        });
        U_().a("msc_event_container_destroyed", new q() { // from class: com.meituan.msc.modules.api.legacy.timing.d.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09981d089f63dca2311d3bc894fb526a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09981d089f63dca2311d3bc894fb526a");
                } else {
                    d.this.c();
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8fffb996abb34d9c673482cb1b10cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8fffb996abb34d9c673482cb1b10cfe");
            return;
        }
        c();
        this.d = true;
        g.d("[TimingModule@onDestroy]", "mDestroyed: ", Boolean.valueOf(this.d));
        U_().c("msc_event_engine_status_changed");
        U_().c("msc_event_container_resumed");
        U_().c("msc_event_container_paused");
        U_().c("msc_event_container_destroyed");
        super.L_();
    }

    @MSCMethod
    public final void createTimer(double d, double d2, double d3, boolean z) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5b28f889665be338621e6a05f9d7c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5b28f889665be338621e6a05f9d7c0");
            return;
        }
        int i = (int) d;
        int i2 = (int) d2;
        b bVar = this.c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "99f44846c541ebe49cb2fa17880461a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "99f44846c541ebe49cb2fa17880461a4");
            return;
        }
        long max = Math.max(0L, (((long) d3) - System.currentTimeMillis()) + i2);
        if (i2 == 0 && !z) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(i);
            bVar.c.a(createArray);
            return;
        }
        bVar.createTimer(i, max, i2, z);
    }

    @MSCMethod
    public final void deleteTimer(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fbd376c9128cf473d348f114e64d06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fbd376c9128cf473d348f114e64d06b");
        } else {
            this.c.deleteTimer((int) d);
        }
    }

    @MSCMethod
    public final void setSendIdleEvents(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d59c97a7cd295be4e7f7be085e4b60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d59c97a7cd295be4e7f7be085e4b60b");
        } else {
            this.c.setSendIdleEvents(z);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a55f7be50633350afcf7bf0854ce404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a55f7be50633350afcf7bf0854ce404");
        } else {
            this.c.b();
        }
    }

    @MSCMethod
    public final void enableBackgroundTimer(boolean z, com.meituan.msc.modules.manager.d<Boolean> dVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea264eabb588f70dee461bca4a18bdb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea264eabb588f70dee461bca4a18bdb9");
            return;
        }
        this.b = z;
        dVar.a(Boolean.TRUE);
    }
}
