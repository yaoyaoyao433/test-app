package com.sankuai.waimai.reactnative.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.ViewCompat;
import android.util.JsonReader;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.StringReader;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 2;
    private static final String REACT_CLASS = "WMLottieAnimationView";
    private static final String TAG = "LottieAnimationViewManager";
    private static final int VERSION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<LottieAnimationView, a> propManagersMap;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public LottieAnimationViewManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa83e4af3bdb7040fea1704f129bb5b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa83e4af3bdb7040fea1704f129bb5b8");
        } else {
            this.propManagersMap = new WeakHashMap();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d62e8f5a64a86cc4f4e4178c880e97fd", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d62e8f5a64a86cc4f4e4178c880e97fd") : c.b().a("VERSION", 1).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LottieAnimationView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dfe5de2fa2462afe0e7cc3090704876", RobustBitConfig.DEFAULT_VALUE)) {
            return (LottieAnimationView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dfe5de2fa2462afe0e7cc3090704876");
        }
        final LottieAnimationView lottieAnimationView = new LottieAnimationView(aoVar);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lottieAnimationView.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.reactnative.lottie.LottieAnimationViewManager.1
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cfd34a14a715db4e515bd0808c43f086", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cfd34a14a715db4e515bd0808c43f086");
                } else {
                    LottieAnimationViewManager.this.sendOnAnimationFinishEvent(lottieAnimationView, false);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f361a4875de2aae593556b7739deef9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f361a4875de2aae593556b7739deef9");
                } else {
                    LottieAnimationViewManager.this.sendOnAnimationFinishEvent(lottieAnimationView, true);
                }
            }
        });
        return lottieAnimationView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnAnimationFinishEvent(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d69e34e507df121f04e2dfe0b4beb40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d69e34e507df121f04e2dfe0b4beb40");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92ea8c9cb4270169e49c9350bd71f05e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92ea8c9cb4270169e49c9350bd71f05e") : c.b().a("animationFinish", c.a("phasedRegistrationNames", c.a("bubbled", "onAnimationFinish"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4533a3d2f12a65d5ee6e63105427c58", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4533a3d2f12a65d5ee6e63105427c58") : c.a("play", 1, "reset", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(final LottieAnimationView lottieAnimationView, int i, final ReadableArray readableArray) {
        Object[] objArr = {lottieAnimationView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdd2169cbc50e92ff4a6584ebcdc3be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdd2169cbc50e92ff4a6584ebcdc3be8");
            return;
        }
        switch (i) {
            case 1:
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.reactnative.lottie.LottieAnimationViewManager.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ebf9dbdf584ff4c69fe983e115e47a53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ebf9dbdf584ff4c69fe983e115e47a53");
                            return;
                        }
                        int i2 = readableArray.getInt(0);
                        int i3 = readableArray.getInt(1);
                        if (i2 != -1 && i3 != -1) {
                            lottieAnimationView.a(readableArray.getInt(0), readableArray.getInt(1));
                        }
                        if (ViewCompat.isAttachedToWindow(lottieAnimationView)) {
                            lottieAnimationView.setProgress(0.0f);
                            lottieAnimationView.a();
                            return;
                        }
                        lottieAnimationView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.reactnative.lottie.LottieAnimationViewManager.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewAttachedToWindow(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bf96f21a4ec7cbdfee9c5c0328851dac", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bf96f21a4ec7cbdfee9c5c0328851dac");
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
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2b3c20f71a585f3adc93840835df21ab", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2b3c20f71a585f3adc93840835df21ab");
                                } else {
                                    lottieAnimationView.removeOnAttachStateChangeListener(this);
                                }
                            }
                        });
                    }
                });
                return;
            case 2:
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.reactnative.lottie.LottieAnimationViewManager.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "761c85180931d38e8b4a29c68e056364", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "761c85180931d38e8b4a29c68e056364");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "910914fa28e3c7dbbcacb3ffea1c1ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "910914fa28e3c7dbbcacb3ffea1c1ac8");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        orCreatePropertyManager.h = str;
        orCreatePropertyManager.g = true;
    }

    @ReactProp(name = "sourceJson")
    public void setSourceJson(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d318521ea4b41f6fcc39f31741dfc24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d318521ea4b41f6fcc39f31741dfc24");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).c = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r15.equals("strong") != false) goto L16;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "cacheStrategy")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCacheStrategy(com.airbnb.lottie.LottieAnimationView r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.reactnative.lottie.LottieAnimationViewManager.changeQuickRedirect
            java.lang.String r12 = "d440dc244a33682651438611a5f65427"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            if (r15 == 0) goto L6c
            com.airbnb.lottie.LottieAnimationView$a r1 = com.airbnb.lottie.LottieAnimationView.a
            r2 = -1
            int r3 = r15.hashCode()
            r4 = -891980137(0xffffffffcad57697, float:-6994763.5)
            if (r3 == r4) goto L4d
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r3 == r0) goto L42
            r0 = 3645304(0x379f78, float:5.108159E-39)
            if (r3 == r0) goto L37
            goto L57
        L37:
            java.lang.String r0 = "weak"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L57
            r0 = 1
            goto L58
        L42:
            java.lang.String r0 = "none"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L57
            r0 = 0
            goto L58
        L4d:
            java.lang.String r3 = "strong"
            boolean r15 = r15.equals(r3)
            if (r15 == 0) goto L57
            goto L58
        L57:
            r0 = -1
        L58:
            switch(r0) {
                case 0: goto L62;
                case 1: goto L5f;
                case 2: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L64
        L5c:
            com.airbnb.lottie.LottieAnimationView$a r1 = com.airbnb.lottie.LottieAnimationView.a.Strong
            goto L64
        L5f:
            com.airbnb.lottie.LottieAnimationView$a r1 = com.airbnb.lottie.LottieAnimationView.a.Weak
            goto L64
        L62:
            com.airbnb.lottie.LottieAnimationView$a r1 = com.airbnb.lottie.LottieAnimationView.a.None
        L64:
            com.sankuai.waimai.reactnative.lottie.a r14 = r13.getOrCreatePropertyManager(r14)
            r14.i = r1
            r14.g = r10
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.reactnative.lottie.LottieAnimationViewManager.setCacheStrategy(com.airbnb.lottie.LottieAnimationView, java.lang.String):void");
    }

    @ReactProp(name = ResizeMode.LOWER_CASE_NAME)
    public void setResizeMode(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa128987769d14706c6bed2571ee90a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa128987769d14706c6bed2571ee90a9");
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
        getOrCreatePropertyManager(lottieAnimationView).k = scaleType;
    }

    @ReactProp(name = NotificationCompat.CATEGORY_PROGRESS)
    public void setProgress(LottieAnimationView lottieAnimationView, float f) {
        Object[] objArr = {lottieAnimationView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e16b416f80578f96047ccab164e1793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e16b416f80578f96047ccab164e1793");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).d = Float.valueOf(f);
        }
    }

    @ReactProp(name = "speed")
    public void setSpeed(LottieAnimationView lottieAnimationView, double d) {
        Object[] objArr = {lottieAnimationView, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c74bf6a8fe96fae2bf6a8ee27217ae1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c74bf6a8fe96fae2bf6a8ee27217ae1f");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        float f = (float) d;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "82113cc6350beea2f103326ef73b81fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "82113cc6350beea2f103326ef73b81fa");
        } else {
            orCreatePropertyManager.f = Float.valueOf(f);
        }
    }

    @ReactProp(name = "loop")
    public void setLoop(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "974d691ee16d4a1044ddf30df525cc81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "974d691ee16d4a1044ddf30df525cc81");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "1f211d51e43e5a50b5c195cefccbbb6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "1f211d51e43e5a50b5c195cefccbbb6b");
        } else {
            orCreatePropertyManager.e = Boolean.valueOf(z);
        }
    }

    @ReactProp(name = "hardwareAccelerationAndroid")
    public void setHardwareAcceleration(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f3d702231c31fb203f97ac28d41f66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f3d702231c31fb203f97ac28d41f66b");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "8eb3a7cd7547dc5c43ca93f784a645b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "8eb3a7cd7547dc5c43ca93f784a645b9");
        } else {
            orCreatePropertyManager.j = Boolean.valueOf(z);
        }
    }

    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(LottieAnimationView lottieAnimationView, String str) {
        Object[] objArr = {lottieAnimationView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea0c8f00d1864383381c2262ba53698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea0c8f00d1864383381c2262ba53698");
        } else {
            getOrCreatePropertyManager(lottieAnimationView).l = str;
        }
    }

    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(LottieAnimationView lottieAnimationView, boolean z) {
        Object[] objArr = {lottieAnimationView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8c665fe03d6caa2b17b1fa8f8742695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8c665fe03d6caa2b17b1fa8f8742695");
            return;
        }
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "9fe5a187717b3f41f62e06d5b0f338d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "9fe5a187717b3f41f62e06d5b0f338d2");
        } else {
            orCreatePropertyManager.m = Boolean.valueOf(z);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(LottieAnimationView lottieAnimationView) {
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b396b5191317a0acf58e96184bbb94b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b396b5191317a0acf58e96184bbb94b8");
            return;
        }
        super.onAfterUpdateTransaction((LottieAnimationViewManager) lottieAnimationView);
        a orCreatePropertyManager = getOrCreatePropertyManager(lottieAnimationView);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "572afb8f78ae2547a9fee3cbf9b99e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "572afb8f78ae2547a9fee3cbf9b99e79");
            return;
        }
        LottieAnimationView lottieAnimationView2 = orCreatePropertyManager.b.get();
        if (lottieAnimationView2 != null) {
            if (orCreatePropertyManager.c != null) {
                lottieAnimationView2.setAnimation(new JsonReader(new StringReader(orCreatePropertyManager.c)));
                orCreatePropertyManager.c = null;
            }
            if (orCreatePropertyManager.g) {
                String str = orCreatePropertyManager.h;
                LottieAnimationView.a aVar = orCreatePropertyManager.i;
                lottieAnimationView2.setAnimation(str);
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
            if (orCreatePropertyManager.j != null) {
                lottieAnimationView2.b(orCreatePropertyManager.j.booleanValue());
                orCreatePropertyManager.j = null;
            }
            if (orCreatePropertyManager.k != null) {
                lottieAnimationView2.setScaleType(orCreatePropertyManager.k);
                orCreatePropertyManager.k = null;
            }
            if (orCreatePropertyManager.l != null) {
                lottieAnimationView2.setImageAssetsFolder(orCreatePropertyManager.l);
                orCreatePropertyManager.l = null;
            }
            if (orCreatePropertyManager.m != null) {
                lottieAnimationView2.a(orCreatePropertyManager.m.booleanValue());
                orCreatePropertyManager.m = null;
            }
        }
    }

    private a getOrCreatePropertyManager(LottieAnimationView lottieAnimationView) {
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c8544cd7a6b6e4de70ea46bf03c3a22", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c8544cd7a6b6e4de70ea46bf03c3a22");
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
