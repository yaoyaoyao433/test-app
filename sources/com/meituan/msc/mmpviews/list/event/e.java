package com.meituan.msc.mmpviews.list.event;

import android.support.v4.util.Pools;
import android.view.MotionEvent;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.SoftAssertions;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.meituan.msc.uimanager.events.a<e> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<e> j = new Pools.SynchronizedPool<>(3);
    float b;
    float c;
    int d;
    String e;
    @Nullable
    private MotionEvent k;
    @Nullable
    private com.meituan.msc.uimanager.events.g l;
    private short m;

    public static e a(int i, com.meituan.msc.uimanager.events.g gVar, MotionEvent motionEvent, long j2, float f, float f2, com.meituan.msc.uimanager.events.f fVar, g gVar2) {
        Object[] objArr = {Integer.valueOf(i), gVar, motionEvent, new Long(j2), Float.valueOf(f), Float.valueOf(f2), fVar, gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "280b797f4fd54f67f2653519557cccc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "280b797f4fd54f67f2653519557cccc3");
        }
        e acquire = j.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        Object[] objArr2 = {Integer.valueOf(i), gVar, motionEvent, new Long(j2), Float.valueOf(f), Float.valueOf(f2), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "77fb6fdc97aa614949aa876235015394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "77fb6fdc97aa614949aa876235015394");
        } else {
            short s = 0;
            super.b(i);
            SoftAssertions.assertCondition(j2 != Long.MIN_VALUE, "Gesture start time must be initialized");
            int action = motionEvent.getAction() & 255;
            switch (action) {
                case 0:
                    fVar.a(j2);
                    break;
                case 1:
                    fVar.d(j2);
                    break;
                case 2:
                    s = fVar.c(j2);
                    break;
                case 3:
                    fVar.d(j2);
                    break;
                case 4:
                default:
                    throw new RuntimeException("Unhandled MotionEvent action: " + action);
                case 5:
                case 6:
                    fVar.b(j2);
                    break;
            }
            acquire.l = gVar;
            acquire.k = MotionEvent.obtain(motionEvent);
            acquire.m = s;
            acquire.b = f;
            acquire.c = f2;
        }
        acquire.d = gVar2.b;
        acquire.e = gVar2.e;
        return acquire;
    }

    public final MotionEvent e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "645edde044bbb18eb85414bb0bfbdcdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MotionEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "645edde044bbb18eb85414bb0bfbdcdd");
        }
        com.facebook.infer.annotation.a.a(this.k);
        return this.k;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eebec652e0ab73906cbd485825dae676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eebec652e0ab73906cbd485825dae676");
            return;
        }
        try {
            ((MotionEvent) com.facebook.infer.annotation.a.a(this.k)).recycle();
            this.k = null;
            j.release(this);
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.b("[MListTouchEvent@onDispose]", null, th);
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2380798b283badd7fadec47e60ffd895", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2380798b283badd7fadec47e60ffd895")).booleanValue();
        }
        switch ((com.meituan.msc.uimanager.events.g) com.facebook.infer.annotation.a.a(this.l)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                throw new RuntimeException("Unknown touch event type: " + this.l);
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        return this.m;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e0994d053f56da7be01de17d72d77a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e0994d053f56da7be01de17d72d77a") : com.meituan.msc.uimanager.events.g.a((com.meituan.msc.uimanager.events.g) com.facebook.infer.annotation.a.a(this.l));
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1060e46d2afd88429dfdec09b3df6c3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1060e46d2afd88429dfdec09b3df6c3c");
            return;
        }
        com.meituan.msc.uimanager.events.g gVar = (com.meituan.msc.uimanager.events.g) com.facebook.infer.annotation.a.a(this.l);
        int i = this.h;
        Object[] objArr2 = {rCTEventEmitter, gVar, Integer.valueOf(i), this};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e38b192c073fb76d9bc5ee5f9f4490e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e38b192c073fb76d9bc5ee5f9f4490e3");
            return;
        }
        WritableArray a2 = a.a(i, this);
        MotionEvent e = e();
        WritableArray createArray = Arguments.createArray();
        if (gVar == com.meituan.msc.uimanager.events.g.MOVE || gVar == com.meituan.msc.uimanager.events.g.CANCEL) {
            for (int i2 = 0; i2 < e.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else if (gVar == com.meituan.msc.uimanager.events.g.START || gVar == com.meituan.msc.uimanager.events.g.END) {
            createArray.pushInt(e.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + gVar);
        }
        rCTEventEmitter.receiveTouches(rCTEventEmitter.getPageId(), com.meituan.msc.uimanager.events.g.a(gVar), a2, createArray, com.meituan.msc.uimanager.events.g.START == gVar || com.meituan.msc.uimanager.events.g.END == gVar);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0536f6ec1e03e0c2bf63ab39c2c271", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0536f6ec1e03e0c2bf63ab39c2c271");
        }
        return "MListTouchEvent{mItemIndex=" + this.d + ", mMotionEvent=" + this.k + '}';
    }
}
