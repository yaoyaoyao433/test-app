package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SvgViewModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNSVGSvgViewManager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.horcrux.svg.SvgViewModule$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 implements Runnable {
        final /* synthetic */ int val$attempt;
        final /* synthetic */ ReadableMap val$options;
        final /* synthetic */ Callback val$successCallback;
        final /* synthetic */ int val$tag;

        AnonymousClass1(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.val$tag = i;
            this.val$options = readableMap;
            this.val$successCallback = callback;
            this.val$attempt = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.val$tag);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.val$tag, new Runnable() { // from class: com.horcrux.svg.SvgViewModule.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SvgView svgViewByTag2 = SvgViewManager.getSvgViewByTag(AnonymousClass1.this.val$tag);
                        if (svgViewByTag2 == null) {
                            return;
                        }
                        svgViewByTag2.setToDataUrlTask(new Runnable() { // from class: com.horcrux.svg.SvgViewModule.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                SvgViewModule.toDataURL(AnonymousClass1.this.val$tag, AnonymousClass1.this.val$options, AnonymousClass1.this.val$successCallback, AnonymousClass1.this.val$attempt + 1);
                            }
                        });
                    }
                });
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new Runnable() { // from class: com.horcrux.svg.SvgViewModule.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SvgViewModule.toDataURL(AnonymousClass1.this.val$tag, AnonymousClass1.this.val$options, AnonymousClass1.this.val$successCallback, AnonymousClass1.this.val$attempt + 1);
                    }
                });
            } else if (this.val$options != null) {
                this.val$successCallback.invoke(svgViewByTag.toDataURL(this.val$options.getInt("width"), this.val$options.getInt("height")));
            } else {
                this.val$successCallback.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new AnonymousClass1(i, readableMap, callback, i2));
    }

    @ReactMethod
    public void toDataURL(int i, ReadableMap readableMap, Callback callback) {
        toDataURL(i, readableMap, callback, 0);
    }
}
