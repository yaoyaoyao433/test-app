package com.facebook.react.uimanager.events;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends b<f> {
    private static final Pools.SynchronizedPool<f> c = new Pools.SynchronizedPool<>(3);
    float a;
    float b;
    @Nullable
    private MotionEvent g;
    @Nullable
    private h h;
    private short i;

    public static f a(int i, h hVar, MotionEvent motionEvent, long j, float f, float f2, g gVar) {
        f acquire = c.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        super.a(i);
        short s = 0;
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
        acquire.h = hVar;
        acquire.g = MotionEvent.obtain(motionEvent);
        acquire.i = s;
        acquire.a = f;
        acquire.b = f2;
        return acquire;
    }

    private f() {
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        try {
            ((MotionEvent) com.facebook.infer.annotation.a.a(this.g)).recycle();
            this.g = null;
            c.release(this);
        } catch (Throwable th) {
            com.facebook.common.logging.a.c("TouchEvent@onDispose", null, th);
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return h.a((h) com.facebook.infer.annotation.a.a(this.h));
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        switch ((h) com.facebook.infer.annotation.a.a(this.h)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                throw new RuntimeException("Unknown touch event type: " + this.h);
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return this.i;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        h hVar = (h) com.facebook.infer.annotation.a.a(this.h);
        int i = this.e;
        WritableArray createArray = Arguments.createArray();
        MotionEvent h = h();
        float x = h.getX() - this.a;
        float y = h.getY() - this.b;
        for (int i2 = 0; i2 < h.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", w.c(h.getX(i2)));
            createMap.putDouble("pageY", w.c(h.getY(i2)));
            createMap.putDouble("locationX", w.c(h.getX(i2) - x));
            createMap.putDouble("locationY", w.c(h.getY(i2) - y));
            createMap.putInt("target", i);
            createMap.putDouble(DeviceInfo.TM, this.f);
            createMap.putDouble("identifier", h.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        MotionEvent h2 = h();
        WritableArray createArray2 = Arguments.createArray();
        if (hVar == h.MOVE || hVar == h.CANCEL) {
            for (int i3 = 0; i3 < h2.getPointerCount(); i3++) {
                createArray2.pushInt(i3);
            }
        } else if (hVar == h.START || hVar == h.END) {
            createArray2.pushInt(h2.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + hVar);
        }
        rCTEventEmitter.receiveTouches(h.a(hVar), createArray, createArray2);
    }

    public final MotionEvent h() {
        com.facebook.infer.annotation.a.a(this.g);
        return this.g;
    }
}
