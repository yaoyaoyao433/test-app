package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ar;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.swmansion.gesturehandler.k;
import com.swmansion.gesturehandler.n;
import com.swmansion.gesturehandler.o;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = RNGestureHandlerModule.MODULE_NAME)
/* loaded from: classes6.dex */
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private List<Integer> mEnqueuedRootViewInit;
    private com.swmansion.gesturehandler.i mEventListener;
    private b[] mHandlerFactories;
    private com.swmansion.gesturehandler.react.d mInteractionManager;
    private final com.swmansion.gesturehandler.react.f mRegistry;
    private List<com.swmansion.gesturehandler.react.g> mRoots;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class b<T extends com.swmansion.gesturehandler.b> implements com.swmansion.gesturehandler.react.c<T> {
        public abstract T a(Context context);

        public abstract Class<T> a();

        public abstract String b();

        private b() {
        }

        public void a(final T t, ReadableMap readableMap) {
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t.m = readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                boolean z = readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED);
                if (t.f != null) {
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.cancel();
                        }
                    });
                }
                t.i = z;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        @Override // com.swmansion.gesturehandler.react.c
        public void a(T t, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, t.n);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class d extends b<com.swmansion.gesturehandler.h> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "NativeViewGestureHandler";
        }

        private d() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ void a(com.swmansion.gesturehandler.h hVar, ReadableMap readableMap) {
            com.swmansion.gesturehandler.h hVar2 = hVar;
            super.a((d) hVar2, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                hVar2.a = readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                hVar2.b = readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION);
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.h hVar = (com.swmansion.gesturehandler.h) bVar;
            super.a((d) hVar, writableMap);
            writableMap.putBoolean("pointerInside", hVar.h);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<com.swmansion.gesturehandler.h> a() {
            return com.swmansion.gesturehandler.h.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ com.swmansion.gesturehandler.h a(Context context) {
            return new com.swmansion.gesturehandler.h();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class h extends b<o> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "TapGestureHandler";
        }

        private h() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ void a(o oVar, ReadableMap readableMap) {
            o oVar2 = oVar;
            super.a((h) oVar2, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                oVar2.x = readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                oVar2.v = readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                oVar2.w = readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                oVar2.a = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                oVar2.b = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y));
            }
            if (readableMap.hasKey("maxDist")) {
                float a = w.a(readableMap.getDouble("maxDist"));
                oVar2.u = a * a;
            }
            if (readableMap.hasKey("minPointers")) {
                oVar2.y = readableMap.getInt("minPointers");
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            o oVar = (o) bVar;
            super.a((h) oVar, writableMap);
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(oVar.h()));
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(oVar.i()));
            writableMap.putDouble("absoluteX", w.c(oVar.k));
            writableMap.putDouble("absoluteY", w.c(oVar.l));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<o> a() {
            return o.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ o a(Context context) {
            return new o();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class c extends b<com.swmansion.gesturehandler.g> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "LongPressGestureHandler";
        }

        private c() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ void a(com.swmansion.gesturehandler.g gVar, ReadableMap readableMap) {
            com.swmansion.gesturehandler.g gVar2 = gVar;
            super.a((c) gVar2, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                gVar2.a = readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS);
            }
            if (readableMap.hasKey("maxDist")) {
                float a = w.a(readableMap.getDouble("maxDist"));
                gVar2.b = a * a;
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.g gVar = (com.swmansion.gesturehandler.g) bVar;
            super.a((c) gVar, writableMap);
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(gVar.h()));
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(gVar.i()));
            writableMap.putDouble("absoluteX", w.c(gVar.k));
            writableMap.putDouble("absoluteY", w.c(gVar.l));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<com.swmansion.gesturehandler.g> a() {
            return com.swmansion.gesturehandler.g.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ com.swmansion.gesturehandler.g a(Context context) {
            return new com.swmansion.gesturehandler.g(context);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class e extends b<com.swmansion.gesturehandler.j> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "PanGestureHandler";
        }

        private e() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ void a(com.swmansion.gesturehandler.j jVar, ReadableMap readableMap) {
            boolean z;
            com.swmansion.gesturehandler.j jVar2 = jVar;
            super.a((e) jVar2, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                jVar2.a = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                jVar2.b = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                jVar2.u = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                jVar2.v = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                jVar2.w = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                jVar2.x = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                jVar2.y = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                jVar2.z = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                float a = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY));
                jVar2.C = a * a;
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                jVar2.A = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                jVar2.B = w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y));
                z = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                jVar2.a(w.a(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z) {
                jVar2.a(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                jVar2.D = readableMap.getInt("minPointers");
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                jVar2.E = readableMap.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                jVar2.N = readableMap.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES);
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.j jVar = (com.swmansion.gesturehandler.j) bVar;
            super.a((e) jVar, writableMap);
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(jVar.h()));
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(jVar.i()));
            writableMap.putDouble("absoluteX", w.c(jVar.k));
            writableMap.putDouble("absoluteY", w.c(jVar.l));
            writableMap.putDouble(RecceAnimUtils.TRANSLATION_X, w.c((jVar.J - jVar.F) + jVar.H));
            writableMap.putDouble(RecceAnimUtils.TRANSLATION_Y, w.c((jVar.K - jVar.G) + jVar.I));
            writableMap.putDouble("velocityX", w.c(jVar.L));
            writableMap.putDouble("velocityY", w.c(jVar.M));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<com.swmansion.gesturehandler.j> a() {
            return com.swmansion.gesturehandler.j.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ com.swmansion.gesturehandler.j a(Context context) {
            return new com.swmansion.gesturehandler.j(context);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class f extends b<k> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "PinchGestureHandler";
        }

        private f() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            k kVar = (k) bVar;
            super.a((f) kVar, writableMap);
            writableMap.putDouble("scale", kVar.b);
            writableMap.putDouble("focalX", w.c(kVar.a == null ? Float.NaN : kVar.a.getFocusX()));
            writableMap.putDouble("focalY", w.c(kVar.a != null ? kVar.a.getFocusY() : Float.NaN));
            writableMap.putDouble(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, kVar.u);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<k> a() {
            return k.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ k a(Context context) {
            return new k();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class a extends b<com.swmansion.gesturehandler.a> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "FlingGestureHandler";
        }

        private a() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ void a(com.swmansion.gesturehandler.a aVar, ReadableMap readableMap) {
            com.swmansion.gesturehandler.a aVar2 = aVar;
            super.a((a) aVar2, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                aVar2.b = readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS);
            }
            if (readableMap.hasKey("direction")) {
                aVar2.a = readableMap.getInt("direction");
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.a aVar = (com.swmansion.gesturehandler.a) bVar;
            super.a((a) aVar, writableMap);
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(aVar.h()));
            writableMap.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(aVar.i()));
            writableMap.putDouble("absoluteX", w.c(aVar.k));
            writableMap.putDouble("absoluteY", w.c(aVar.l));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<com.swmansion.gesturehandler.a> a() {
            return com.swmansion.gesturehandler.a.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ com.swmansion.gesturehandler.a a(Context context) {
            return new com.swmansion.gesturehandler.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class g extends b<n> {
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final String b() {
            return "RotationGestureHandler";
        }

        private g() {
            super();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b, com.swmansion.gesturehandler.react.c
        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            n nVar = (n) bVar;
            super.a((g) nVar, writableMap);
            writableMap.putDouble(RecceAnimUtils.ROTATION, nVar.b);
            writableMap.putDouble("anchorX", w.c(nVar.a == null ? Float.NaN : nVar.a.e));
            writableMap.putDouble("anchorY", w.c(nVar.a != null ? nVar.a.f : Float.NaN));
            writableMap.putDouble(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, nVar.u);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final Class<n> a() {
            return n.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.b
        public final /* synthetic */ n a(Context context) {
            return new n();
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEventListener = new com.swmansion.gesturehandler.i() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerModule.1
            @Override // com.swmansion.gesturehandler.i
            public final void a(com.swmansion.gesturehandler.b bVar, MotionEvent motionEvent) {
                RNGestureHandlerModule.this.onTouchEvent(bVar, motionEvent);
            }

            @Override // com.swmansion.gesturehandler.i
            public final void a(com.swmansion.gesturehandler.b bVar, int i, int i2) {
                RNGestureHandlerModule.this.onStateChange(bVar, i, i2);
            }
        };
        this.mHandlerFactories = new b[]{new d(), new h(), new c(), new e(), new f(), new g(), new a()};
        this.mRegistry = new com.swmansion.gesturehandler.react.f();
        this.mInteractionManager = new com.swmansion.gesturehandler.react.d();
        this.mRoots = new ArrayList();
        this.mEnqueuedRootViewInit = new ArrayList();
    }

    @ReactMethod
    public void createGestureHandler(String str, int i, ReadableMap readableMap) {
        for (int i2 = 0; i2 < this.mHandlerFactories.length; i2++) {
            b bVar = this.mHandlerFactories[i2];
            if (bVar.b().equals(str)) {
                com.swmansion.gesturehandler.b a2 = bVar.a(getReactApplicationContext());
                a2.e = i;
                a2.p = this.mEventListener;
                this.mRegistry.a(a2);
                this.mInteractionManager.a(a2, readableMap);
                bVar.a((b) a2, readableMap);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
    }

    @ReactMethod
    public void attachGestureHandler(int i, int i2) {
        tryInitializeHandlerForReactRootView(i2);
        if (this.mRegistry.a(i, i2)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
    }

    @ReactMethod
    public void updateGestureHandler(int i, ReadableMap readableMap) {
        b findFactoryForHandler;
        com.swmansion.gesturehandler.b a2 = this.mRegistry.a(i);
        if (a2 == null || (findFactoryForHandler = findFactoryForHandler(a2)) == null) {
            return;
        }
        this.mInteractionManager.a(i);
        this.mInteractionManager.a(a2, readableMap);
        findFactoryForHandler.a((b) a2, readableMap);
    }

    @ReactMethod
    public void dropGestureHandler(int i) {
        this.mInteractionManager.a(i);
        this.mRegistry.b(i);
    }

    @ReactMethod
    public void handleSetJSResponder(int i, boolean z) {
        final com.swmansion.gesturehandler.react.g findRootHelperForViewAncestor;
        if (this.mRegistry == null || (findRootHelperForViewAncestor = findRootHelperForViewAncestor(i)) == null || !z) {
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.g.1
            @Override // java.lang.Runnable
            public final void run() {
                findRootHelperForViewAncestor.b();
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map getConstants() {
        return com.facebook.react.common.c.a("State", com.facebook.react.common.c.a("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, "FAILED", 1, "END", 5), "Direction", com.facebook.react.common.c.a("RIGHT", 1, "LEFT", 2, Constant.TOKENIZATION_PROVIDER, 4, "DOWN", 8));
    }

    public com.swmansion.gesturehandler.react.f getRegistry() {
        return this.mRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.a();
        com.swmansion.gesturehandler.react.d dVar = this.mInteractionManager;
        dVar.a.clear();
        dVar.b.clear();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                com.swmansion.gesturehandler.react.g gVar = this.mRoots.get(0);
                ViewGroup viewGroup = gVar.a;
                if (viewGroup instanceof com.swmansion.gesturehandler.react.a) {
                    com.swmansion.gesturehandler.react.a aVar = (com.swmansion.gesturehandler.react.a) viewGroup;
                    if (aVar.b != null) {
                        aVar.b.a();
                        aVar.b = null;
                    }
                } else {
                    gVar.a();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    private void tryInitializeHandlerForReactRootView(int i) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        final int resolveRootTagFromReactTag = uIManagerModule.resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag <= 0) {
            throw new JSApplicationIllegalArgumentException("Could find root view for a given ancestor with tag " + i);
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                ViewGroup viewGroup = this.mRoots.get(i2).a;
                if ((viewGroup instanceof ReactRootView) && ((ReactRootView) viewGroup).getRootViewTag() == resolveRootTagFromReactTag) {
                    return;
                }
            }
            synchronized (this.mEnqueuedRootViewInit) {
                if (this.mEnqueuedRootViewInit.contains(Integer.valueOf(resolveRootTagFromReactTag))) {
                    return;
                }
                this.mEnqueuedRootViewInit.add(Integer.valueOf(resolveRootTagFromReactTag));
                uIManagerModule.addUIBlock(new ar() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerModule.2
                    @Override // com.facebook.react.uimanager.ar
                    public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                        View d2 = nativeViewHierarchyManager.d(resolveRootTagFromReactTag);
                        if (d2 instanceof com.swmansion.gesturehandler.react.a) {
                            com.swmansion.gesturehandler.react.a aVar = (com.swmansion.gesturehandler.react.a) d2;
                            if (aVar.b != null) {
                                throw new IllegalStateException("GestureHandler already initialized for root view " + aVar);
                            }
                            aVar.b = new com.swmansion.gesturehandler.react.g(aVar.a.getCurrentReactContext(), aVar);
                        }
                        synchronized (RNGestureHandlerModule.this.mEnqueuedRootViewInit) {
                            RNGestureHandlerModule.this.mEnqueuedRootViewInit.remove(Integer.valueOf(resolveRootTagFromReactTag));
                        }
                    }
                });
            }
        }
    }

    public void registerRootHelper(com.swmansion.gesturehandler.react.g gVar) {
        synchronized (this.mRoots) {
            if (this.mRoots.contains(gVar)) {
                throw new IllegalStateException("Root helper" + gVar + " already registered");
            }
            this.mRoots.add(gVar);
        }
    }

    public void unregisterRootHelper(com.swmansion.gesturehandler.react.g gVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(gVar);
        }
    }

    @Nullable
    private com.swmansion.gesturehandler.react.g findRootHelperForViewAncestor(int i) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag <= 0) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                com.swmansion.gesturehandler.react.g gVar = this.mRoots.get(i2);
                ViewGroup viewGroup = gVar.a;
                if ((viewGroup instanceof ReactRootView) && ((ReactRootView) viewGroup).getRootViewTag() == resolveRootTagFromReactTag) {
                    return gVar;
                }
            }
            return null;
        }
    }

    @Nullable
    private b findFactoryForHandler(com.swmansion.gesturehandler.b bVar) {
        for (int i = 0; i < this.mHandlerFactories.length; i++) {
            b bVar2 = this.mHandlerFactories[i];
            if (bVar2.a().equals(bVar.getClass())) {
                return bVar2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleHitSlopProperty(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (readableMap.getType(KEY_HIT_SLOP) == ReadableType.Number) {
            float a2 = w.a(readableMap.getDouble(KEY_HIT_SLOP));
            bVar.a(a2, a2, a2, a2, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(KEY_HIT_SLOP);
        if (map.hasKey(KEY_HIT_SLOP_HORIZONTAL)) {
            f2 = w.a(map.getDouble(KEY_HIT_SLOP_HORIZONTAL));
            f3 = f2;
        } else {
            f2 = Float.NaN;
            f3 = Float.NaN;
        }
        if (map.hasKey(KEY_HIT_SLOP_VERTICAL)) {
            f4 = w.a(map.getDouble(KEY_HIT_SLOP_VERTICAL));
            f5 = f4;
        } else {
            f4 = Float.NaN;
            f5 = Float.NaN;
        }
        if (map.hasKey("left")) {
            f2 = w.a(map.getDouble("left"));
        }
        float f6 = f2;
        if (map.hasKey("top")) {
            f4 = w.a(map.getDouble("top"));
        }
        float f7 = f4;
        if (map.hasKey("right")) {
            f3 = w.a(map.getDouble("right"));
        }
        float f8 = f3;
        if (map.hasKey("bottom")) {
            f5 = w.a(map.getDouble("bottom"));
        }
        bVar.a(f6, f7, f8, f5, map.hasKey("width") ? w.a(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? w.a(map.getDouble("height")) : Float.NaN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchEvent(com.swmansion.gesturehandler.b bVar, MotionEvent motionEvent) {
        if (bVar.e >= 0 && bVar.g == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().a(com.swmansion.gesturehandler.react.b.a(bVar, findFactoryForHandler(bVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStateChange(com.swmansion.gesturehandler.b bVar, int i, int i2) {
        if (bVar.e < 0) {
            return;
        }
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().a(i.a(bVar, i, i2, findFactoryForHandler(bVar)));
    }
}
