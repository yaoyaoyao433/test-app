package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.mrn.util.a;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.metrics.common.Constants;
import com.squareup.picasso.DiskCacheStrategy;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = RCTImageManager.REACT_CLASS)
/* loaded from: classes.dex */
public class RCTImageManager extends SimpleViewManager<RCTRoundImageView> {
    public static final String REACT_CLASS = "RCTImageView";
    private final WeakHashMap<RCTRoundImageView, Void> mAllViewInstances = new WeakHashMap<>();
    private final Context mContext;
    private final boolean mEnableShrink;
    private final boolean mShrinkGif;
    private float mShrinkRatio;
    private final boolean mTransformToWebp;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public RCTImageManager(Context context, boolean z, float f, boolean z2, boolean z3) {
        com.meituan.android.picassohelper.c.a(context);
        this.mShrinkRatio = f;
        this.mShrinkGif = z2;
        this.mTransformToWebp = z3;
        this.mEnableShrink = z;
        this.mContext = context;
    }

    public Collection<RCTRoundImageView> getAllViewInstances() {
        return this.mAllViewInstances.keySet();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RCTRoundImageView createViewInstance(ao aoVar) {
        RCTRoundImageView rCTRoundImageView = new RCTRoundImageView(aoVar);
        this.mAllViewInstances.put(rCTRoundImageView, null);
        rCTRoundImageView.setShrinkRatio(this.mShrinkRatio);
        rCTRoundImageView.setTransformToWebp(this.mTransformToWebp);
        rCTRoundImageView.setShrinkGif(this.mShrinkGif);
        rCTRoundImageView.setEnableShrink(this.mEnableShrink);
        return rCTRoundImageView;
    }

    @ReactProp(name = RaptorUploaderImpl.SRC)
    public void setSource(RCTRoundImageView rCTRoundImageView, @Nullable ReadableArray readableArray) {
        rCTRoundImageView.setSource(readableArray);
    }

    @ReactProp(name = "transformToWebp")
    public void setTransformToWebp(RCTRoundImageView rCTRoundImageView, @Nullable boolean z) {
        rCTRoundImageView.setTransformToWebp(z);
    }

    @ReactProp(name = "height")
    public void setHeight(RCTRoundImageView rCTRoundImageView, Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            rCTRoundImageView.setHeight(w.a((float) dynamic.asDouble()));
        } else {
            rCTRoundImageView.setHeight(-1.0f);
        }
    }

    @ReactProp(name = "width")
    public void setWidth(RCTRoundImageView rCTRoundImageView, Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            rCTRoundImageView.setWidth(w.a((float) dynamic.asDouble()));
        } else {
            rCTRoundImageView.setWidth(-1.0f);
        }
    }

    public void setShrinkRatio(float f) {
        this.mShrinkRatio = f;
    }

    @ReactProp(name = "ninePatchSrc")
    public void setNinePatchSource(RCTRoundImageView rCTRoundImageView, @Nullable ReadableArray readableArray) {
        rCTRoundImageView.setNinePatchSource(readableArray);
    }

    @ReactProp(name = "capInsets")
    public void setCapInsets(RCTRoundImageView rCTRoundImageView, @Nullable ReadableMap readableMap) {
        rCTRoundImageView.setCapInsets(readableMap);
    }

    @ReactProp(name = ResizeMode.LOWER_CASE_NAME)
    public void setResizeMode(RCTRoundImageView rCTRoundImageView, @Nullable String str) {
        rCTRoundImageView.setScaleType(b.a(str));
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(RCTRoundImageView rCTRoundImageView, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        rCTRoundImageView.setLoadingIndicatorSource(str);
    }

    @ReactProp(name = "defaultSrc")
    public void setPlaceHolder(RCTRoundImageView rCTRoundImageView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Constants.TRAFFIC_URI, str);
        createMap.putString("sceneToken", "");
        setPlaceHolderForPrivacy(rCTRoundImageView, createMap);
    }

    @ReactProp(name = "defaultSrcForPrivacy")
    public void setPlaceHolderForPrivacy(final RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        final String string = readableMap.hasKey(Constants.TRAFFIC_URI) ? readableMap.getString(Constants.TRAFFIC_URI) : "";
        final String string2 = readableMap.hasKey("sceneToken") ? readableMap.getString("sceneToken") : "";
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.meituan.android.mrn.util.a.a(this, this.mContext, "defaultSource", new a.InterfaceC0293a() { // from class: com.facebook.react.views.image.RCTImageManager.1
            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a(String str) {
            }

            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a() {
                rCTRoundImageView.setPlaceHolder(string, string2);
            }
        });
    }

    @ReactProp(customType = "Color", name = TintColor.LOWER_CASE_NAME)
    public void setTintColor(RCTRoundImageView rCTRoundImageView, Integer num) {
        if (num == null) {
            rCTRoundImageView.clearColorFilter();
        } else {
            rCTRoundImageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(name = "error")
    public void setError(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey(Constants.TRAFFIC_URI)) {
            return;
        }
        String string = readableMap.getString(Constants.TRAFFIC_URI);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        rCTRoundImageView.setError(string);
    }

    @ReactProp(defaultBoolean = true, name = "skipMemoryCache")
    public void setSkipMemoryCache(RCTRoundImageView rCTRoundImageView, boolean z) {
        rCTRoundImageView.skipMemoryCache(z);
    }

    @ReactProp(name = "diskCacheStrategy")
    public void setDiskCacheStrategy(RCTRoundImageView rCTRoundImageView, String str) {
        if (TextUtils.equals(str, "all")) {
            rCTRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.ALL);
        } else if (TextUtils.equals(str, "none")) {
            rCTRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.NONE);
        } else if (TextUtils.equals(str, "source")) {
            rCTRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.SOURCE);
        } else if (TextUtils.equals(str, "result")) {
            rCTRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.RESULT);
        }
    }

    @ReactProp(name = "background")
    public void setBackground(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        Drawable b;
        if (readableMap == null || !readableMap.hasKey(Constants.TRAFFIC_URI)) {
            return;
        }
        String string = readableMap.getString(Constants.TRAFFIC_URI);
        if (TextUtils.isEmpty(string) || (b = com.facebook.react.views.imagehelper.a.a().b(rCTRoundImageView.getContext(), string)) == null) {
            return;
        }
        rCTRoundImageView.setBackground(b);
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(RCTRoundImageView rCTRoundImageView, @Nullable Integer num) {
        if (num == null) {
            rCTRoundImageView.setBorderColor(0);
        } else {
            rCTRoundImageView.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "borderWidth")
    public void setBorderWidth(RCTRoundImageView rCTRoundImageView, float f) {
        rCTRoundImageView.setBorderWidth(f);
    }

    @ReactProp(name = "roundAsCircle")
    public void setRoundAsCircle(RCTRoundImageView rCTRoundImageView, boolean z) {
        rCTRoundImageView.setRoundAsCircle(z);
    }

    @ReactProp(name = "roundedCornerRadius")
    public void setRoundedCornerRadius(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("cornerRadius")) {
            float a = w.a(readableMap.getDouble("cornerRadius"));
            rCTRoundImageView.setRoundedCornerRadius(a, a, a, a);
            return;
        }
        rCTRoundImageView.setRoundedCornerRadius(readableMap.hasKey("cornerTopLeftRadius") ? w.a(readableMap.getDouble("cornerTopLeftRadius")) : 0.0f, readableMap.hasKey("cornerTopRightRadius") ? w.a(readableMap.getDouble("cornerTopRightRadius")) : 0.0f, readableMap.hasKey("cornerBottomRightRadius") ? w.a(readableMap.getDouble("cornerBottomRightRadius")) : 0.0f, readableMap.hasKey("cornerBottomLeftRadius") ? w.a(readableMap.getDouble("cornerBottomLeftRadius")) : 0.0f);
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(RCTRoundImageView rCTRoundImageView, int i) {
        rCTRoundImageView.setFadeDuration(i);
    }

    @ReactProp(name = "headers")
    public void setHeaders(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        rCTRoundImageView.setHeaders(readableMap);
    }

    @ReactProp(name = "method")
    public void setRequestMethod(RCTRoundImageView rCTRoundImageView, String str) {
        rCTRoundImageView.setMethod(str);
    }

    @ReactProp(name = "blurRadius")
    public void setBlurRadius(RCTRoundImageView rCTRoundImageView, float f) {
        rCTRoundImageView.setBlurRadius(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.a(a.b(4), com.facebook.react.common.c.a("registrationName", "onLoadStart"), a.b(2), com.facebook.react.common.c.a("registrationName", "onLoad"), a.b(1), com.facebook.react.common.c.a("registrationName", "onError"), a.b(3), com.facebook.react.common.c.a("registrationName", "onLoadEnd"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(final RCTRoundImageView rCTRoundImageView) {
        if (UiThreadUtil.isOnUiThread()) {
            rCTRoundImageView.maybeUpdateView();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.react.views.image.RCTImageManager.2
                @Override // java.lang.Runnable
                public final void run() {
                    rCTRoundImageView.maybeUpdateView();
                }
            });
        }
    }
}
