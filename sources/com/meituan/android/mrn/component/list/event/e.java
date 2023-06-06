package com.meituan.android.mrn.component.list.event;

import android.support.v4.util.Pools;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends com.facebook.react.uimanager.events.b<e> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<e> i = new Pools.SynchronizedPool<>(3);
    float b;
    float c;
    int g;
    int h;
    @Nullable
    private MotionEvent j;
    @Nullable
    private com.facebook.react.uimanager.events.h k;
    private short l;

    public static e a(int i2, com.facebook.react.uimanager.events.h hVar, MotionEvent motionEvent, long j, float f, float f2, com.facebook.react.uimanager.events.g gVar, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i2), hVar, motionEvent, new Long(j), Float.valueOf(f), Float.valueOf(f2), gVar, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23451546d3835c8ce462dcadc1edfd77", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23451546d3835c8ce462dcadc1edfd77");
        }
        e acquire = i.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        Object[] objArr2 = {Integer.valueOf(i2), hVar, motionEvent, new Long(j), Float.valueOf(f), Float.valueOf(f2), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "867123caf88b5ac88fb04b0ce6052b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "867123caf88b5ac88fb04b0ce6052b52");
        } else {
            short s = 0;
            super.a(i2);
            SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
            int action = motionEvent.getAction() & 255;
            switch (action) {
                case 0:
                    gVar.a(j);
                    break;
                case 1:
                    gVar.d(j);
                    break;
                case 2:
                    s = gVar.c(j);
                    break;
                case 3:
                    gVar.d(j);
                    break;
                case 4:
                default:
                    throw new RuntimeException("Unhandled MotionEvent action: " + action);
                case 5:
                case 6:
                    gVar.b(j);
                    break;
            }
            acquire.k = hVar;
            acquire.j = MotionEvent.obtain(motionEvent);
            acquire.l = s;
            acquire.b = f;
            acquire.c = f2;
        }
        acquire.g = i3;
        acquire.h = i4;
        return acquire;
    }

    public final MotionEvent h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c32bae3e2c948d598b96ca5e52b2c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MotionEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c32bae3e2c948d598b96ca5e52b2c1");
        }
        com.facebook.infer.annotation.a.a(this.j);
        return this.j;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482f6ac8b7acc0bfdc9a8b9f273e1ecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482f6ac8b7acc0bfdc9a8b9f273e1ecd");
            return;
        }
        try {
            ((MotionEvent) com.facebook.infer.annotation.a.a(this.j)).recycle();
            this.j = null;
            i.release(this);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[MListTouchEvent@onDispose]", null, th);
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb40515c7a76d281fe33ab98dca1fcb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb40515c7a76d281fe33ab98dca1fcb")).booleanValue();
        }
        switch ((com.facebook.react.uimanager.events.h) com.facebook.infer.annotation.a.a(this.k)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                throw new RuntimeException("Unknown touch event type: " + this.k);
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return this.l;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa9edb3443eff332a550c0ff580eb62", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa9edb3443eff332a550c0ff580eb62") : com.facebook.react.uimanager.events.h.a((com.facebook.react.uimanager.events.h) com.facebook.infer.annotation.a.a(this.k));
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d455781a1fa23992d50a17c6be973aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d455781a1fa23992d50a17c6be973aa");
            return;
        }
        com.facebook.react.uimanager.events.h hVar = (com.facebook.react.uimanager.events.h) com.facebook.infer.annotation.a.a(this.k);
        int e = e();
        Object[] objArr2 = {rCTEventEmitter, hVar, Integer.valueOf(e), this};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c0e16c07a2da0b7ad17fa214489ca2fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c0e16c07a2da0b7ad17fa214489ca2fe");
            return;
        }
        WritableArray a2 = g.a(e, this);
        MotionEvent h = h();
        WritableArray createArray = Arguments.createArray();
        if (hVar == com.facebook.react.uimanager.events.h.MOVE || hVar == com.facebook.react.uimanager.events.h.CANCEL) {
            for (int i2 = 0; i2 < h.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else if (hVar == com.facebook.react.uimanager.events.h.START || hVar == com.facebook.react.uimanager.events.h.END) {
            createArray.pushInt(h.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + hVar);
        }
        rCTEventEmitter.receiveTouches(com.facebook.react.uimanager.events.h.a(hVar), a2, createArray);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa8718c6d0eda2277dd391ed6712a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa8718c6d0eda2277dd391ed6712a18");
        }
        return "MListTouchEvent{mSectionIndex=" + this.g + ", mItemIndex=" + this.h + ", mMotionEvent=" + this.j + '}';
    }
}
