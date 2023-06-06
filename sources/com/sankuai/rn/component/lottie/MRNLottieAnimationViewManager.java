package com.sankuai.rn.component.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.e;
import com.airbnb.lottie.n;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MRNLottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 2;
    private static final String REACT_CLASS = "MRNLottieAnimationView";
    private static final String TAG = "MRNLottieAnimationViewManager";
    private static final int VERSION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<LottieAnimationView, a> propManagersMap;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public MRNLottieAnimationViewManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c0e293bb97da582bd717c0f7f734396", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c0e293bb97da582bd717c0f7f734396");
        } else {
            this.propManagersMap = new WeakHashMap();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18eb2dc0f5d4f930e4d07222338f0f2c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18eb2dc0f5d4f930e4d07222338f0f2c") : com.facebook.react.common.c.b().a("VERSION", 1).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LottieAnimationView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bfc4cca154056145d0b405cd9acd91c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LottieAnimationView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bfc4cca154056145d0b405cd9acd91c");
        }
        final LottieAnimationView lottieAnimationView = new LottieAnimationView(aoVar);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lottieAnimationView.a(new Animator.AnimatorListener() { // from class: com.sankuai.rn.component.lottie.MRNLottieAnimationViewManager.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6eac8a26d1a669c882cfafffb08ed8ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6eac8a26d1a669c882cfafffb08ed8ca");
                } else {
                    MRNLottieAnimationViewManager.this.sendOnAnimationFinishEvent(lottieAnimationView, false);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a821a67faa0f547d5f9d7c1e066e8a84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a821a67faa0f547d5f9d7c1e066e8a84");
                } else {
                    MRNLottieAnimationViewManager.this.sendOnAnimationFinishEvent(lottieAnimationView, true);
                }
            }
        });
        return lottieAnimationView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnAnimationFinishEvent(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7487d54116eb56af2a65d77d85895458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7487d54116eb56af2a65d77d85895458");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", z);
        Context context = lottieAnimationView.getContext();
        ReactContext reactContext = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(lottieAnimationView.getId(), "animationFinish", createMap);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0b807156710ead4dadfe86f727a0834", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0b807156710ead4dadfe86f727a0834") : com.facebook.react.common.c.b().a("animationFinish", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onAnimationFinish"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "943c7ffb5e64bfa08d41529e576ddd2e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "943c7ffb5e64bfa08d41529e576ddd2e") : com.facebook.react.common.c.a("play", 1, "reset", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(final LottieAnimationView lottieAnimationView, int i, final ReadableArray readableArray) {
        Object[] objArr = {lottieAnimationView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea038b3350855eeb44359d2f8c83e7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea038b3350855eeb44359d2f8c83e7b7");
            return;
        }
        switch (i) {
            case 1:
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.rn.component.lottie.MRNLottieAnimationViewManager.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81721dcc3cc097427bc07466393d569e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81721dcc3cc097427bc07466393d569e");
                            return;
                        }
                        int i2 = readableArray.getInt(0);
                        int i3 = readableArray.getInt(1);
                        if (i2 != -1 && i3 != -1) {
                            if (i2 > i3) {
                                lottieAnimationView.a(i3, i2);
                                lottieAnimationView.b.b.d();
                            } else {
                                lottieAnimationView.a(i2, i3);
                            }
                        }
                        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
                            lottieAnimationView.setProgress(0.0f);
                            lottieAnimationView.a();
                            return;
                        }
                        lottieAnimationView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.rn.component.lottie.MRNLottieAnimationViewManager.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewAttachedToWindow(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "040e5c42cdde11fdf14f5540d7a69362", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "040e5c42cdde11fdf14f5540d7a69362");
                                    return;
                                }
                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view;
                                lottieAnimationView2.setProgress(0.0f);
                                lottieAnimationView2.a();
                                lottieAnimationView2.removeOnAttachStateChangeListener(this);
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewDetachedFromWindow(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4e1c12cc05be873601b7e4af5ec1ecf3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4e1c12cc05be873601b7e4af5ec1ecf3");
                                } else {
                                    lottieAnimationView.removeOnAttachStateChangeListener(this);
                                }
                            }
                        });
                    }
                });
                return;
            case 2:
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.rn.component.lottie.MRNLottieAnimationViewManager.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "843088323266d061ab59b93b439e24df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "843088323266d061ab59b93b439e24df");
                        } else if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
                            lottieAnimationView.e();
                            lottieAnimationView.setProgress(0.0f);
                        }
                    }
                });
                return;
            default:
                return;
        }
    }

    @ReactProp(name = "sourceName")
    public void setSourceName(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93cbea7b93712d92e52627052645fd87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93cbea7b93712d92e52627052645fd87");
            return;
        }
        if (!str.contains(CommonConstant.Symbol.DOT)) {
            str = str + ".json";
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        orCreatePropertyManager.h = str;
        orCreatePropertyManager.g = true;
    }

    @ReactProp(name = "sourceJson")
    public void setSourceJson(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcb765beb55b0217f6e5d69f63ca6ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcb765beb55b0217f6e5d69f63ca6ef1");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).c = str;
        }
    }

    @ReactProp(name = ResizeMode.LOWER_CASE_NAME)
    public void setResizeMode(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "262092fd9f05589c52c74c2bf4788950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "262092fd9f05589c52c74c2bf4788950");
            return;
        }
        ImageView.ScaleType scaleType = null;
        if (DynamicTitleParser.PARSER_VAL_STRETCH_COVER.equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if ("contain".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else if ("center".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER;
        }
        getOrCreatePropertyManager(lottieAnimationView).i = scaleType;
    }

    @ReactProp(name = NotificationCompat.CATEGORY_PROGRESS)
    public void setProgress(LottieAnimationView lottieAnimationView, float f) {
        Object[] objArr = {lottieAnimationView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64b4c182db539027e61d508ff2ac7b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64b4c182db539027e61d508ff2ac7b8a");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).d = Float.valueOf(f);
        }
    }

    @ReactProp(name = "speed")
    public void setSpeed(LottieAnimationView lottieAnimationView, double d) {
        Object[] objArr = {lottieAnimationView, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b168676f60406764d96f63957c4da9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b168676f60406764d96f63957c4da9d7");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        float f = (float) d;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "f520f3c5c40bdfda829dbd4708c78d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "f520f3c5c40bdfda829dbd4708c78d87");
        } else {
            orCreatePropertyManager.f = Float.valueOf(f);
        }
    }

    @ReactProp(name = "loop")
    public void setLoop(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "026c8ea121a635f3237bdb02049e871b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "026c8ea121a635f3237bdb02049e871b");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "a0582ebc91d95a7a86c9cde288760c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "a0582ebc91d95a7a86c9cde288760c1c");
        } else {
            orCreatePropertyManager.e = Boolean.valueOf(z);
        }
    }

    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f8e381163523f5fda7f2553b1414da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f8e381163523f5fda7f2553b1414da");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).j = str;
        }
    }

    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd98d7c6b0d4eb62ca70ef956e073b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd98d7c6b0d4eb62ca70ef956e073b6");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "3378def0a1cc10af48f1e8b8a54986fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "3378def0a1cc10af48f1e8b8a54986fd");
        } else {
            orCreatePropertyManager.k = Boolean.valueOf(z);
        }
    }

    @ReactProp(name = "colorFilters")
    public void setColorFilters(LottieAnimationView lottieAnimationView, ReadableArray readableArray) {
        Object[] objArr = {lottieAnimationView, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff26701fd13406a5d950d9184c378732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff26701fd13406a5d950d9184c378732");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).l = readableArray;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(LottieAnimationView lottieAnimationView) {
        byte[] bytes;
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aae13b4b88dea217f23e42d1b43900b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aae13b4b88dea217f23e42d1b43900b9");
            return;
        }
        super.onAfterUpdateTransaction((MRNLottieAnimationViewManager) lottieAnimationView);
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "806321fe6db27a10263d97b7b676af82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "806321fe6db27a10263d97b7b676af82");
            return;
        }
        LottieAnimationView lottieAnimationView2 = orCreatePropertyManager.b.get();
        if (lottieAnimationView2 != null) {
            if (orCreatePropertyManager.c != null) {
                String str = orCreatePropertyManager.c;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "406adfb4c2ed7816aec58c889766aaf1", RobustBitConfig.DEFAULT_VALUE)) {
                    bytes = (byte[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "406adfb4c2ed7816aec58c889766aaf1");
                } else {
                    bytes = str == null ? null : str.getBytes();
                }
                String a = bytes != null ? b.a(bytes) : null;
                if (TextUtils.isEmpty(a)) {
                    a = new Object().toString();
                }
                lottieAnimationView2.a(orCreatePropertyManager.c, a);
                orCreatePropertyManager.c = null;
            }
            if (orCreatePropertyManager.g) {
                lottieAnimationView2.setAnimation(orCreatePropertyManager.h);
                orCreatePropertyManager.g = false;
            }
            if (orCreatePropertyManager.d != null) {
                lottieAnimationView2.setProgress(orCreatePropertyManager.d.floatValue());
                orCreatePropertyManager.d = null;
            }
            if (orCreatePropertyManager.e != null) {
                lottieAnimationView2.setRepeatCount(orCreatePropertyManager.e.booleanValue() ? -1 : 0);
                orCreatePropertyManager.e = null;
            }
            if (orCreatePropertyManager.f != null) {
                lottieAnimationView2.setSpeed(orCreatePropertyManager.f.floatValue());
                orCreatePropertyManager.f = null;
            }
            if (orCreatePropertyManager.i != null) {
                lottieAnimationView2.setScaleType(orCreatePropertyManager.i);
                orCreatePropertyManager.i = null;
            }
            if (orCreatePropertyManager.j != null) {
                lottieAnimationView2.setImageAssetsFolder(orCreatePropertyManager.j);
                orCreatePropertyManager.j = null;
            }
            if (orCreatePropertyManager.k != null) {
                lottieAnimationView2.a(orCreatePropertyManager.k.booleanValue());
                orCreatePropertyManager.k = null;
            }
            if (orCreatePropertyManager.l == null || orCreatePropertyManager.l.size() <= 0) {
                return;
            }
            for (int i = 0; i < orCreatePropertyManager.l.size(); i++) {
                ReadableMap map = orCreatePropertyManager.l.getMap(i);
                String string = map.getString("color");
                try {
                    lottieAnimationView2.a(new e(map.getString("keypath"), "**"), i.x, new com.airbnb.lottie.value.c(new n(Color.parseColor(string))));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    private a getOrCreatePropertyManager(LottieAnimationView lottieAnimationView) {
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fdaf6318e8346e1cfb2f74e6eec10f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fdaf6318e8346e1cfb2f74e6eec10f1");
        }
        a aVar = this.propManagersMap.get(lottieAnimationView);
        if (aVar == null) {
            a aVar2 = new a(lottieAnimationView);
            this.propManagersMap.put(lottieAnimationView, aVar2);
            return aVar2;
        }
        return aVar;
    }
}
