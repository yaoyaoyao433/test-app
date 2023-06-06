package com.meituan.msc.uimanager.events;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.view.MotionEvent;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.SoftAssertions;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends a<e> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<e> d = new Pools.SynchronizedPool<>(3);
    float b;
    float c;
    @Nullable
    private MotionEvent e;
    @Nullable
    private g j;
    private short k;

    public static e a(int i, g gVar, MotionEvent motionEvent, long j, float f, float f2, f fVar) {
        short c;
        Object[] objArr = {Integer.valueOf(i), gVar, motionEvent, new Long(j), Float.valueOf(f), Float.valueOf(f2), fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e826ad04e314667563013925e89cb717", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e826ad04e314667563013925e89cb717");
        }
        e acquire = d.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        Object[] objArr2 = {Integer.valueOf(i), gVar, motionEvent, new Long(j), Float.valueOf(f), Float.valueOf(f2), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "d14b70fcfb27bba97ea3b8938cd707b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "d14b70fcfb27bba97ea3b8938cd707b0");
        } else {
            super.b(i);
            SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
            int action = motionEvent.getAction() & 255;
            switch (action) {
                case 0:
                    fVar.a(j);
                    c = 0;
                    break;
                case 1:
                    fVar.d(j);
                    c = 0;
                    break;
                case 2:
                    c = fVar.c(j);
                    break;
                case 3:
                    fVar.d(j);
                    c = 0;
                    break;
                case 4:
                default:
                    throw new RuntimeException("Unhandled MotionEvent action: " + action);
                case 5:
                case 6:
                    fVar.b(j);
                    c = 0;
                    break;
            }
            acquire.j = gVar;
            acquire.e = MotionEvent.obtain(motionEvent);
            acquire.k = c;
            acquire.b = f;
            acquire.c = f2;
        }
        return acquire;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5e69cd15bbb9a4f0a9b4467d420c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5e69cd15bbb9a4f0a9b4467d420c40");
            return;
        }
        try {
            ((MotionEvent) com.facebook.infer.annotation.a.a(this.e)).recycle();
            this.e = null;
            d.release(this);
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a("TouchEvent@onDispose", null, th);
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54efadda15c4145626a3cdcd93328592", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54efadda15c4145626a3cdcd93328592") : g.a((g) com.facebook.infer.annotation.a.a(this.j));
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdccfebe0039b313143d5879210e5a51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdccfebe0039b313143d5879210e5a51")).booleanValue();
        }
        switch ((g) com.facebook.infer.annotation.a.a(this.j)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                throw new RuntimeException("Unknown touch event type: " + this.j);
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        return this.k;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a58856d71f360f04ba8fcda2ff2d2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a58856d71f360f04ba8fcda2ff2d2d");
            return;
        }
        g gVar = (g) com.facebook.infer.annotation.a.a(this.j);
        int i = this.h;
        Object[] objArr2 = {rCTEventEmitter, gVar, Integer.valueOf(i), this};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d90e1b41e69a1f79474f3022053fd38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d90e1b41e69a1f79474f3022053fd38");
            return;
        }
        WritableArray a2 = h.a(i, this);
        MotionEvent e = e();
        WritableArray createArray = Arguments.createArray();
        if (gVar == g.MOVE || gVar == g.CANCEL) {
            for (int i2 = 0; i2 < e.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else if (gVar == g.START || gVar == g.END) {
            createArray.pushInt(e.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + gVar);
        }
        rCTEventEmitter.receiveTouches(rCTEventEmitter.getPageId(), g.a(gVar), a2, createArray, g.START == gVar || g.END == gVar);
    }

    public final MotionEvent e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbd3f8df78a88e7005e5a011d958314", RobustBitConfig.DEFAULT_VALUE)) {
            return (MotionEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbd3f8df78a88e7005e5a011d958314");
        }
        com.facebook.infer.annotation.a.a(this.e);
        return this.e;
    }
}
