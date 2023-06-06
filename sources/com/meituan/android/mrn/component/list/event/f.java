package com.meituan.android.mrn.component.list.event;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends a {
    public static ChangeQuickRedirect i;
    private final float[] j;
    private boolean k;
    private long l;
    private final com.facebook.react.uimanager.events.g m;
    private com.facebook.react.uimanager.events.c n;
    private HashMap<String, com.meituan.android.mrn.component.list.b> o;
    private k p;
    private com.meituan.android.mrn.component.list.b q;

    public f(ViewGroup viewGroup, com.facebook.react.uimanager.events.c cVar) {
        super(viewGroup);
        Object[] objArr = {viewGroup, cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d3bd8ccad01a9d867a15d66d7bd4e28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d3bd8ccad01a9d867a15d66d7bd4e28");
            return;
        }
        this.j = new float[2];
        this.k = false;
        this.l = Long.MIN_VALUE;
        this.m = new com.facebook.react.uimanager.events.g();
        this.o = new HashMap<>();
        this.p = null;
        this.n = cVar;
    }

    private void a(MotionEvent motionEvent, Object... objArr) {
        Object[] objArr2 = {motionEvent, objArr};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "c4aa363917fad0771ea9333ad4c0c69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "c4aa363917fad0771ea9333ad4c0c69c");
            return;
        }
        Iterator<h> it = this.h.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (next != null && (objArr[0] instanceof WritableMap) && (objArr[1] instanceof k)) {
                next.a(motionEvent, (WritableMap) objArr[0], (k) objArr[1]);
            }
        }
    }

    public final void a(View view, com.meituan.android.mrn.component.list.b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d789ee3216a864c52902d08003f7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d789ee3216a864c52902d08003f7a1");
        } else {
            this.o.put(a(view), bVar);
        }
    }

    private static String a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e2626a52506b4a435747783cffb2dd2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e2626a52506b4a435747783cffb2dd2") : Integer.toHexString(System.identityHashCode(view));
    }

    private k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79670308c243ee3bd1e0e734106dbe2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79670308c243ee3bd1e0e734106dbe2e");
        }
        for (com.meituan.android.mrn.component.list.b bVar : this.o.values()) {
            k c = bVar.c(this.a);
            if (!k.a().equals(c)) {
                this.q = bVar;
                return c;
            }
        }
        return k.a();
    }

    @Override // com.facebook.react.uimanager.j
    public final void b(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        Object[] objArr = {motionEvent, cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b2a778e1ef72a036547567063ce908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b2a778e1ef72a036547567063ce908");
            return;
        }
        if (this.n == null) {
            this.n = cVar;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.a != -1) {
                com.facebook.common.logging.a.d("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.k = false;
            this.l = motionEvent.getEventTime();
            this.a = a(motionEvent);
            this.p = a();
            int i2 = this.a;
            if (this.p.e != -1) {
                i2 = this.p.e;
            }
            e a = e.a(i2, com.facebook.react.uimanager.events.h.START, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c);
            WritableArray a2 = g.a(i2, a);
            cVar.a(a);
            if (this.h.size() <= 0 || k.a().equals(this.p)) {
                return;
            }
            a(motionEvent, a2);
        } else if (this.k) {
            this.a = a(motionEvent);
            this.p = a();
            int i3 = this.a;
            if (this.p.e != -1) {
                i3 = this.p.e;
            }
            WritableArray a3 = g.a(i3, e.a(i3, com.facebook.react.uimanager.events.h.MOVE, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c));
            if (this.h.size() <= 0 || k.a().equals(this.p)) {
                return;
            }
            a(motionEvent, a3);
        } else if (this.a == -1) {
            com.facebook.common.logging.a.d("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
        } else if (action == 1) {
            a(motionEvent);
            if (this.p == null) {
                this.p = a();
            }
            int i4 = this.a;
            if (this.p.e != -1) {
                i4 = this.p.e;
            }
            e a4 = e.a(i4, com.facebook.react.uimanager.events.h.END, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c);
            WritableArray a5 = g.a(i4, a4);
            cVar.a(a4);
            if (this.h.size() > 0 && !k.a().equals(this.p)) {
                a(motionEvent, a5);
            }
            this.a = -1;
            this.p = null;
            this.l = Long.MIN_VALUE;
        } else if (action == 2) {
            a(motionEvent);
            if (this.p == null) {
                this.p = a();
            }
            int i5 = this.a;
            if (this.p.e != -1) {
                i5 = this.p.e;
            }
            cVar.a(e.a(i5, com.facebook.react.uimanager.events.h.MOVE, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c));
        } else if (action == 5) {
            if (this.p == null) {
                this.p = a();
            }
            int i6 = this.a;
            if (this.p.e != -1) {
                i6 = this.p.e;
            }
            cVar.a(e.a(i6, com.facebook.react.uimanager.events.h.START, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c));
        } else if (action == 6) {
            if (this.p == null) {
                this.p = a();
            }
            int i7 = this.a;
            if (this.p.e != -1) {
                i7 = this.p.e;
            }
            cVar.a(e.a(i7, com.facebook.react.uimanager.events.h.END, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c));
        } else if (action == 3) {
            if (this.m.e(motionEvent.getDownTime())) {
                c(motionEvent, cVar);
            } else {
                com.facebook.common.logging.a.d("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            this.a = -1;
            this.p = null;
            this.l = Long.MIN_VALUE;
        } else {
            com.facebook.common.logging.a.c("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.a);
        }
    }

    private void a(MotionEvent motionEvent, WritableArray writableArray) {
        Object[] objArr = {motionEvent, writableArray};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f357efd7a91f8438e473813f1313d85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f357efd7a91f8438e473813f1313d85d");
        } else if (this.q != null) {
            Object obj = this.p;
            WritableMap a = a(writableArray);
            a.putBoolean("mChildIsHandlingNativeGesture", this.k);
            a(motionEvent, a, obj);
        }
    }

    @Override // com.facebook.react.uimanager.j
    public final void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        Object[] objArr = {motionEvent, cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e99c4e27bffd0c03d2a0e4e42196a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e99c4e27bffd0c03d2a0e4e42196a37");
        } else if (this.k) {
        } else {
            c(motionEvent, cVar);
            this.k = true;
        }
    }

    private int a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16eb4773389d67defb6d6a2235372031", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16eb4773389d67defb6d6a2235372031")).intValue() : ap.a(motionEvent.getX(), motionEvent.getY(), this.e, this.j, (int[]) null);
    }

    private WritableMap a(WritableArray writableArray) {
        ReadableMap map;
        Object[] objArr = {writableArray};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63dbac1b52d5ec9d21c798c5652da5e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63dbac1b52d5ec9d21c798c5652da5e6");
        }
        WritableMap createMap = Arguments.createMap();
        if (writableArray == null || writableArray.size() <= 0 || (map = writableArray.getMap(0)) == null) {
            return createMap;
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.merge(map);
        return createMap2;
    }

    private void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        Object[] objArr = {motionEvent, cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f23993f76319b19b947315be883ee88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f23993f76319b19b947315be883ee88");
        } else if (this.a == -1) {
            com.facebook.common.logging.a.c("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
        } else {
            com.facebook.infer.annotation.a.a(!this.k, "Expected to not have already sent a cancel for this gesture");
            if (this.p == null) {
                this.p = a();
            }
            int i2 = this.a;
            if (this.p.e != -1) {
                i2 = this.p.e;
            }
            e a = e.a(i2, com.facebook.react.uimanager.events.h.CANCEL, motionEvent, this.l, this.j[0], this.j[1], this.m, this.p.b, this.p.c);
            WritableArray a2 = g.a(i2, a);
            ((com.facebook.react.uimanager.events.c) com.facebook.infer.annotation.a.a(cVar)).a(a);
            if (this.h.size() > 0) {
                a(motionEvent, a2);
            }
        }
    }
}
