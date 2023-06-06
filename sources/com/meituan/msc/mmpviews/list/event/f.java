package com.meituan.msc.mmpviews.list.event;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListView;
import com.meituan.msc.mmpviews.perflist.event.RListEventEmitter;
import com.meituan.msc.uimanager.ak;
import com.meituan.msc.uimanager.events.ReactEventEmitter;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends b {
    public static ChangeQuickRedirect c;
    protected g d;
    private final SparseArray<a> l;
    private final float[] m;
    private boolean n;
    private long o;
    private final com.meituan.msc.uimanager.events.f p;
    private int q;
    private boolean r;
    private com.meituan.msc.mmpviews.list.c s;

    public f(ViewGroup viewGroup, int i) {
        super(viewGroup);
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c818b0563a8f76f5d45dc9280f2c4e7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c818b0563a8f76f5d45dc9280f2c4e7d");
            return;
        }
        this.l = new SparseArray<>();
        this.m = new float[2];
        this.n = false;
        this.o = Long.MIN_VALUE;
        this.p = new com.meituan.msc.uimanager.events.f();
        this.d = null;
        this.r = false;
        this.q = i;
    }

    private void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a461e23d2d0035fadd530b9c15cd88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a461e23d2d0035fadd530b9c15cd88f");
            return;
        }
        for (Map.Entry<String, com.meituan.msc.mmpviews.list.c> entry : this.b.entrySet()) {
            com.meituan.msc.mmpviews.list.c value = entry.getValue();
            if (value.a(entry.getKey(), gVar.i)) {
                value.a(gVar);
                this.s = value;
                return;
            }
        }
    }

    @Override // com.meituan.msc.mmpviews.list.event.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6ff85e046c2b1e4e9e1c076fc7899b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6ff85e046c2b1e4e9e1c076fc7899b");
            return;
        }
        this.l.clear();
        this.d = null;
        this.s = null;
    }

    private void a(com.meituan.msc.uimanager.events.a aVar, com.meituan.msc.uimanager.events.b bVar) {
        MotionEvent e;
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52461a15b7e66d30826a8f969fc15567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52461a15b7e66d30826a8f969fc15567");
        } else if (this.d == null || this.d.i == null || !(this.d.i.getContext() instanceof ReactContext)) {
            bVar.a(aVar);
        } else if (this.d.k) {
        } else {
            com.meituan.msc.uimanager.events.b a2 = ((ReactContext) this.d.i.getContext()).getUIManagerModule().a();
            ReactEventEmitter reactEventEmitter = a2.c;
            if ((reactEventEmitter instanceof RListEventEmitter) && this.d.h <= 0) {
                com.meituan.msc.modules.reporter.g.b("[MSCListTouchJSDispatcher@dispatchEvent]", null, reactEventEmitter, this.d);
                if (!(aVar instanceof e) || (e = ((e) aVar).e()) == null || e.getPointerCount() <= 1) {
                    return;
                }
                com.meituan.msc.modules.reporter.g.d("[MSCListTouchJSDispatcher@dispatchEvent]", "multi pointer motionEvent:", e);
                return;
            }
            a2.a(aVar);
        }
    }

    @Override // com.meituan.msc.uimanager.h
    public final void b(MotionEvent motionEvent, com.meituan.msc.uimanager.events.b bVar) {
        boolean z = false;
        Object[] objArr = {motionEvent, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f57897130dd803853dc0376ba9007da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f57897130dd803853dc0376ba9007da");
        } else if (this.n) {
        } else {
            if (bVar != null && bVar.b != null && bVar.b.getRuntimeDelegate().isNativeRenderType()) {
                z = true;
            }
            if (z) {
                return;
            }
            c(motionEvent, bVar);
            this.n = true;
        }
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb4e7ad0bf75756a8aa1f5127eeaa22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb4e7ad0bf75756a8aa1f5127eeaa22");
            return;
        }
        if (this.d == null) {
            this.d = g.a();
        } else {
            this.d.b();
        }
        ak.a(motionEvent.getX(), motionEvent.getY(), this.j, this.m, this.d);
        this.f = this.d.c;
        a(this.d);
        com.meituan.msc.modules.reporter.g.d("[MSCListTouchEventJSDispatcher@findTargetViewAndSetCoordinates]", "findTargetToken: " + this.d);
    }

    private boolean b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe53aa9c9ab1f06a6bc2a789b45c06c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe53aa9c9ab1f06a6bc2a789b45c06c")).booleanValue();
        }
        if (motionEvent == null || motionEvent.getPointerCount() < 2) {
            return false;
        }
        String str = null;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            g a2 = g.a();
            ak.a(x, y, this.j, new float[2], a2);
            View view = a2.i;
            if (view != null && (view.getContext() instanceof ReactContext)) {
                String simpleName = ((ReactContext) view.getContext()).getUIManagerModule().a().c.getClass().getSimpleName();
                if (str == null) {
                    str = simpleName;
                } else if (!str.equals(simpleName)) {
                    com.meituan.msc.modules.reporter.g.d("[MSCListTouchJSDispatcher@isMultiPointerInDifferentRuntime] different:", "pre:", str, "current:", simpleName);
                    return true;
                }
            }
        }
        return false;
    }

    private void c(MotionEvent motionEvent, com.meituan.msc.uimanager.events.b bVar) {
        Object[] objArr = {motionEvent, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eaea013241a0cf216547394c35eb233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eaea013241a0cf216547394c35eb233");
        } else if (this.f == -1) {
            com.meituan.msc.modules.reporter.g.e("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
        } else {
            com.facebook.infer.annotation.a.a(!this.n, "Expected to not have already sent a cancel for this gesture");
            if (this.d == null) {
                a(motionEvent);
            }
            View view = this.d.i;
            if (view != null && (view.getContext() instanceof ReactContext)) {
                com.meituan.msc.uimanager.events.b a2 = ((ReactContext) view.getContext()).getUIManagerModule().a();
                if (!TextUtils.equals(a2.getClass().getSimpleName(), bVar.getClass().getSimpleName())) {
                    com.meituan.msc.modules.reporter.g.b("[MSCListTouchJSDispatcher@dispatchCancelEvent]", null, "viewEventDispatcher:", a2, bVar);
                    return;
                }
            }
            ((com.meituan.msc.uimanager.events.b) com.facebook.infer.annotation.a.a(bVar)).a(a(this.f, com.meituan.msc.uimanager.events.g.CANCEL, motionEvent, this.o, this.m[0], this.m[1], this.p, this.d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public float a;
        public float b;
        public long c;

        public a() {
        }
    }

    @Override // com.meituan.msc.uimanager.h
    public final void a(MotionEvent motionEvent, com.meituan.msc.uimanager.events.b bVar) {
        Map<String, String> map;
        Object[] objArr = {motionEvent, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c2a145efdc1b4c742cf22f22d10c303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c2a145efdc1b4c742cf22f22d10c303");
            return;
        }
        boolean z = (bVar == null || bVar.b == null || !bVar.b.getRuntimeDelegate().isNativeRenderType()) ? false : true;
        boolean z2 = z && bVar.b.getRuntimeDelegate().enableVNodeErrorFix();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f != -1) {
                com.meituan.msc.modules.reporter.g.a("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            if (this.r && z2) {
                return;
            }
            this.n = false;
            this.o = motionEvent.getEventTime();
            a(motionEvent);
            a(a(this.f, com.meituan.msc.uimanager.events.g.START, motionEvent, this.o, this.m[0], this.m[1], this.p, this.d), bVar);
            a aVar = new a();
            aVar.a = s.c(motionEvent.getX());
            aVar.b = s.c(motionEvent.getY());
            aVar.c = System.currentTimeMillis();
            this.l.put(this.f, aVar);
            if ((this.s instanceof MSCListView) && (((MSCListView) this.s).getContext() instanceof ReactContext)) {
                ((ReactContext) ((MSCListView) this.s).getContext()).getUIManagerModule().c.a(2, false, "listView:touchBegin");
            }
        } else if (this.n && !z) {
            a(motionEvent);
        } else if (this.f == -1) {
            com.meituan.msc.modules.reporter.g.a("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
        } else if (action != 1) {
            if (action == 2) {
                if (this.r && z2) {
                    return;
                }
                if (this.d == null) {
                    a(motionEvent);
                }
                a(a(this.f, com.meituan.msc.uimanager.events.g.MOVE, motionEvent, this.o, this.m[0], this.m[1], this.p, this.d), bVar);
            } else if (action == 5) {
                if (z2) {
                    this.r = b(motionEvent);
                    if (this.r) {
                        return;
                    }
                }
                if (this.d == null) {
                    a(motionEvent);
                }
                a(a(this.f, com.meituan.msc.uimanager.events.g.START, motionEvent, this.o, this.m[0], this.m[1], this.p, this.d), bVar);
            } else if (action == 6) {
                if (this.r && z2) {
                    this.r = false;
                    return;
                }
                if (this.d == null) {
                    a(motionEvent);
                }
                a(a(this.d.c, com.meituan.msc.uimanager.events.g.END, motionEvent, this.o, this.m[0], this.m[1], this.p, this.d), bVar);
                if ((this.s instanceof MSCListView) && (((MSCListView) this.s).getContext() instanceof ReactContext)) {
                    ((ReactContext) ((MSCListView) this.s).getContext()).getUIManagerModule().c.a(3, false, "listView:touchEnd");
                }
            } else if (action != 3) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f);
            } else {
                this.r = b(motionEvent);
                if (this.r && z2) {
                    com.meituan.msc.modules.reporter.g.d("[MSCListTouchJSDispatcher@handleTouchEvent]", "action_cancel: multi pointer in different Runtime");
                    return;
                }
                if (this.p.e(motionEvent.getDownTime())) {
                    c(motionEvent, bVar);
                } else {
                    com.meituan.msc.modules.reporter.g.a("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.f = -1;
                this.d = null;
                this.o = Long.MIN_VALUE;
            }
        } else if (this.r && z2) {
            this.r = false;
        } else {
            if (this.d == null) {
                a(motionEvent);
            }
            e a2 = a(this.f, com.meituan.msc.uimanager.events.g.END, motionEvent, this.o, this.m[0], this.m[1], this.p, this.d);
            WritableArray a3 = com.meituan.msc.mmpviews.list.event.a.a(this.f, a2);
            a(a2, bVar);
            a aVar2 = this.l.get(this.f);
            if (aVar2 != null && this.d != null && !this.d.l) {
                long currentTimeMillis = System.currentTimeMillis() - aVar2.c;
                double pow = Math.pow(Math.abs(s.c(motionEvent.getX()) - aVar2.a), 2.0d);
                double pow2 = Math.pow(Math.abs(s.c(motionEvent.getY()) - aVar2.b), 2.0d);
                if (currentTimeMillis < 251 && Math.sqrt(pow + pow2) < 3.0d) {
                    Object[] objArr2 = {motionEvent, a3, bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fee98950e48dcd92820324c3ee861f4d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fee98950e48dcd92820324c3ee861f4d");
                    } else if (this.s != null && this.d != null && (map = this.d.d) != null && !map.isEmpty() && bVar != null) {
                        ReadableMap map2 = a3.getMap(0);
                        WritableMap createMap = Arguments.createMap();
                        createMap.merge(map2);
                        StringBuilder sb = new StringBuilder();
                        for (String str : map.keySet()) {
                            createMap.putString(str, map.get(str));
                            if ("bindtap".equals(str) || "catchtap".equals(str)) {
                                sb.append("tap:");
                                sb.append(map.get(str));
                                sb.append(CommonConstant.Symbol.COMMA);
                            }
                        }
                        String sb2 = sb.toString();
                        if (sb2.endsWith(CommonConstant.Symbol.COMMA)) {
                            sb2 = sb2.substring(0, sb2.length() - 1);
                        }
                        createMap.putMap("dataset", new MSCReadableMap(this.d.f));
                        if ((this.s instanceof MSCListView) && (((MSCListView) this.s).getContext() instanceof ReactContext)) {
                            ((ReactContext) ((MSCListView) this.s).getContext()).getUIManagerModule().c.a(3, true, sb2);
                        }
                        a(new com.meituan.msc.mmpviews.list.Touchable.a(this.d.h, createMap, false), bVar);
                        com.meituan.msc.modules.reporter.g.d("[MSCListTouchEventJSDispatcher@dispatchTouchableEvent] ", this.d.h + ", eventData: " + createMap);
                    }
                }
            }
            this.l.remove(this.f);
            this.f = -1;
            this.d = null;
            this.o = Long.MIN_VALUE;
        }
    }

    private e a(int i, com.meituan.msc.uimanager.events.g gVar, MotionEvent motionEvent, long j, float f, float f2, com.meituan.msc.uimanager.events.f fVar, g gVar2) {
        int i2;
        Object[] objArr = {Integer.valueOf(i), gVar, motionEvent, new Long(j), Float.valueOf(f), Float.valueOf(f2), fVar, gVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbe367bba2dd178d7657b65ac9e6f7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbe367bba2dd178d7657b65ac9e6f7a");
        }
        if (gVar2.j > 0) {
            i2 = gVar2.j;
        } else {
            i2 = gVar2.h == 0 ? i : gVar2.h;
        }
        return e.a(i2, gVar, motionEvent, j, f, f2, fVar, gVar2);
    }
}
