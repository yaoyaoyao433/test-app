package com.meituan.msc.views.image;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.views.image.RCTImageManager;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.uimanager.RNSimpleViewManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = RCTImageManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNRCTImageManager extends RNSimpleViewManager<RCTRoundImageView> {
    public static ChangeQuickRedirect c;
    private final WeakHashMap<RCTRoundImageView, Void> d;
    private float e;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final Context l;
    private final IFileModule m;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return RCTImageManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ae3cc0345e4000aa5680dd872b12a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (RCTRoundImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ae3cc0345e4000aa5680dd872b12a9");
        }
        RCTRoundImageView rCTRoundImageView = new RCTRoundImageView(themedReactContext);
        rCTRoundImageView.setFileModule(this.m);
        this.d.put(rCTRoundImageView, null);
        rCTRoundImageView.setShrinkRatio(this.e);
        rCTRoundImageView.setTransformToWebp(this.i);
        rCTRoundImageView.setShrinkGif(this.j);
        rCTRoundImageView.setEnableShrink(this.k);
        return rCTRoundImageView;
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view) {
        final RCTRoundImageView rCTRoundImageView = (RCTRoundImageView) view;
        Object[] objArr = {rCTRoundImageView};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5baf004cd3190e6bc39b4519741f0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5baf004cd3190e6bc39b4519741f0e");
        } else if (UiThreadUtil.isOnUiThread()) {
            rCTRoundImageView.maybeUpdateView();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.msc.views.image.RNRCTImageManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "913ce6705fc3e9700eba43624180610a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "913ce6705fc3e9700eba43624180610a");
                    } else {
                        rCTRoundImageView.maybeUpdateView();
                    }
                }
            });
        }
    }

    public RNRCTImageManager(Context context, boolean z, float f, boolean z2, boolean z3, IFileModule iFileModule) {
        Object[] objArr = {context, (byte) 0, Float.valueOf(2.0f), (byte) 1, (byte) 0, iFileModule};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9d6c9fd02cda9d782c14c052f7f378", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9d6c9fd02cda9d782c14c052f7f378");
            return;
        }
        this.d = new WeakHashMap<>();
        com.meituan.android.picassohelper.c.a(context);
        this.e = 2.0f;
        this.j = true;
        this.i = false;
        this.k = false;
        this.l = context;
        this.m = iFileModule;
    }

    @ReactProp(name = RaptorUploaderImpl.SRC)
    public void setSource(RCTRoundImageView rCTRoundImageView, @Nullable ReadableArray readableArray) {
        Object[] objArr = {rCTRoundImageView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667f9b88019405f5e3a6d7b7ff51deb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667f9b88019405f5e3a6d7b7ff51deb1");
        } else {
            rCTRoundImageView.setSource(readableArray);
        }
    }

    @ReactProp(name = "transformToWebp")
    public void setTransformToWebp(RCTRoundImageView rCTRoundImageView, @Nullable boolean z) {
        Object[] objArr = {rCTRoundImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bac0f104c2a044ad0ca48a3d39e28fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bac0f104c2a044ad0ca48a3d39e28fa");
        } else {
            rCTRoundImageView.setTransformToWebp(z);
        }
    }

    @ReactProp(name = "height")
    public void setHeight(RCTRoundImageView rCTRoundImageView, Dynamic dynamic) {
        Object[] objArr = {rCTRoundImageView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c252bb52d5c8f6cd22836824c341fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c252bb52d5c8f6cd22836824c341fa");
        } else if (dynamic.getType() == ReadableType.Number) {
            rCTRoundImageView.setHeight(s.a((float) dynamic.asDouble()));
        } else {
            rCTRoundImageView.setHeight(-1.0f);
        }
    }

    @ReactProp(name = "width")
    public void setWidth(RCTRoundImageView rCTRoundImageView, Dynamic dynamic) {
        Object[] objArr = {rCTRoundImageView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eccedc2b5cb450786c7024dd4e873717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eccedc2b5cb450786c7024dd4e873717");
        } else if (dynamic.getType() == ReadableType.Number) {
            rCTRoundImageView.setWidth(s.a((float) dynamic.asDouble()));
        } else {
            rCTRoundImageView.setWidth(-1.0f);
        }
    }

    @ReactProp(name = "ninePatchSrc")
    public void setNinePatchSource(RCTRoundImageView rCTRoundImageView, @Nullable ReadableArray readableArray) {
        Object[] objArr = {rCTRoundImageView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0be1ec2da8f7b4f8ac14cf43ce3b11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0be1ec2da8f7b4f8ac14cf43ce3b11a");
        } else {
            rCTRoundImageView.setNinePatchSource(readableArray);
        }
    }

    @ReactProp(name = "capInsets")
    public void setCapInsets(RCTRoundImageView rCTRoundImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {rCTRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a40fddc1e89aaa996c5fbbd7da509a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a40fddc1e89aaa996c5fbbd7da509a");
        } else {
            rCTRoundImageView.setCapInsets(readableMap);
        }
    }

    @ReactProp(name = ResizeMode.LOWER_CASE_NAME)
    public void setResizeMode(RCTRoundImageView rCTRoundImageView, @Nullable String str) {
        ImageView.ScaleType scaleType;
        Object[] objArr = {rCTRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0a41b4e7551d1ca539530e3151133d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0a41b4e7551d1ca539530e3151133d6");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c490d761e674f86bf633624d7c261cbd", RobustBitConfig.DEFAULT_VALUE)) {
            scaleType = (ImageView.ScaleType) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c490d761e674f86bf633624d7c261cbd");
        } else if ("contain".equals(str)) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            if (!DynamicTitleParser.PARSER_VAL_STRETCH_COVER.equals(str)) {
                if (DynamicTitleParser.PARSER_KEY_STRETCH.equals(str)) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                } else if ("center".equals(str)) {
                    scaleType = ImageView.ScaleType.CENTER_INSIDE;
                }
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        rCTRoundImageView.setScaleType(scaleType);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(RCTRoundImageView rCTRoundImageView, @Nullable String str) {
        Object[] objArr = {rCTRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271c998dbf3851cc0bb014e32a3f7b21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271c998dbf3851cc0bb014e32a3f7b21");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            rCTRoundImageView.setLoadingIndicatorSource(str);
        }
    }

    @ReactProp(name = "defaultSrc")
    public void setPlaceHolder(RCTRoundImageView rCTRoundImageView, String str) {
        Object[] objArr = {rCTRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5abee2ece32a54cbcdad3fda916dfdc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5abee2ece32a54cbcdad3fda916dfdc3");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putString(Constants.TRAFFIC_URI, str);
            createMap.putString("sceneToken", "");
            setPlaceHolderForPrivacy(rCTRoundImageView, createMap);
        }
    }

    @ReactProp(name = "defaultSrcForPrivacy")
    public void setPlaceHolderForPrivacy(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        Object[] objArr = {rCTRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87a2a6df9e7403e8e37aeb1b0eddb7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87a2a6df9e7403e8e37aeb1b0eddb7a");
        } else if (readableMap == null) {
        } else {
            String string = readableMap.hasKey(Constants.TRAFFIC_URI) ? readableMap.getString(Constants.TRAFFIC_URI) : "";
            String string2 = readableMap.hasKey("sceneToken") ? readableMap.getString("sceneToken") : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            rCTRoundImageView.setPlaceHolder(string, string2);
        }
    }

    @ReactProp(customType = "Color", name = TintColor.LOWER_CASE_NAME)
    public void setTintColor(RCTRoundImageView rCTRoundImageView, Integer num) {
        Object[] objArr = {rCTRoundImageView, num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59e5629e013bf93e5fbee4733c8b499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59e5629e013bf93e5fbee4733c8b499");
        } else if (num == null) {
            rCTRoundImageView.clearColorFilter();
        } else {
            rCTRoundImageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(name = "error")
    public void setError(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        Object[] objArr = {rCTRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea54bbda0cf6f38ae0c915e749e4f95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea54bbda0cf6f38ae0c915e749e4f95");
        } else if (readableMap == null || !readableMap.hasKey(Constants.TRAFFIC_URI)) {
        } else {
            String string = readableMap.getString(Constants.TRAFFIC_URI);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            rCTRoundImageView.setError(string);
        }
    }

    @ReactProp(defaultBoolean = true, name = "skipMemoryCache")
    public void setSkipMemoryCache(RCTRoundImageView rCTRoundImageView, boolean z) {
        Object[] objArr = {rCTRoundImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee994d8fbbe0a05c763ee28ea4b8b39c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee994d8fbbe0a05c763ee28ea4b8b39c");
        } else {
            rCTRoundImageView.skipMemoryCache(z);
        }
    }

    @ReactProp(name = "diskCacheStrategy")
    public void setDiskCacheStrategy(RCTRoundImageView rCTRoundImageView, String str) {
        Object[] objArr = {rCTRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d71c43cb32f6fae43511bda6f31b17e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d71c43cb32f6fae43511bda6f31b17e9");
        } else if (TextUtils.equals(str, "all")) {
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
        Drawable drawable;
        Object[] objArr = {rCTRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a647a1be349b88a3e5238fbb1061628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a647a1be349b88a3e5238fbb1061628");
        } else if (readableMap == null || !readableMap.hasKey(Constants.TRAFFIC_URI)) {
        } else {
            String string = readableMap.getString(Constants.TRAFFIC_URI);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            com.meituan.msc.views.imagehelper.b a = com.meituan.msc.views.imagehelper.b.a();
            Context context = rCTRoundImageView.getContext();
            Object[] objArr2 = {context, string};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.views.imagehelper.b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "48c7a74f99dd18cba441e4945fc7b713", RobustBitConfig.DEFAULT_VALUE)) {
                drawable = (Drawable) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "48c7a74f99dd18cba441e4945fc7b713");
            } else {
                int a2 = a.a(context, string);
                drawable = a2 > 0 ? context.getResources().getDrawable(a2) : null;
            }
            if (drawable != null) {
                rCTRoundImageView.setBackground(drawable);
            }
        }
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(RCTRoundImageView rCTRoundImageView, @Nullable Integer num) {
        Object[] objArr = {rCTRoundImageView, num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54401c7541493634aac975eabc6e9ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54401c7541493634aac975eabc6e9ab");
        } else if (num == null) {
            rCTRoundImageView.setBorderColor(0);
        } else {
            rCTRoundImageView.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "borderWidth")
    public void setBorderWidth(RCTRoundImageView rCTRoundImageView, float f) {
        Object[] objArr = {rCTRoundImageView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5856616ae234b2d92517c812e225a935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5856616ae234b2d92517c812e225a935");
        } else {
            rCTRoundImageView.setBorderWidth(f);
        }
    }

    @ReactProp(name = "roundAsCircle")
    public void setRoundAsCircle(RCTRoundImageView rCTRoundImageView, boolean z) {
        Object[] objArr = {rCTRoundImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70f7077cd0ea214b2ecee5826133236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70f7077cd0ea214b2ecee5826133236");
        } else {
            rCTRoundImageView.setRoundAsCircle(z);
        }
    }

    @ReactProp(name = "roundedCornerRadius")
    public void setRoundedCornerRadius(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        Object[] objArr = {rCTRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e6da2e97612eb9fb85d5bef0da9586a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e6da2e97612eb9fb85d5bef0da9586a");
        } else if (readableMap == null) {
        } else {
            if (readableMap.hasKey("cornerRadius")) {
                float a = s.a(readableMap.getDouble("cornerRadius"));
                rCTRoundImageView.setRoundedCornerRadius(a, a, a, a);
                return;
            }
            rCTRoundImageView.setRoundedCornerRadius(readableMap.hasKey("cornerTopLeftRadius") ? s.a(readableMap.getDouble("cornerTopLeftRadius")) : 0.0f, readableMap.hasKey("cornerTopRightRadius") ? s.a(readableMap.getDouble("cornerTopRightRadius")) : 0.0f, readableMap.hasKey("cornerBottomRightRadius") ? s.a(readableMap.getDouble("cornerBottomRightRadius")) : 0.0f, readableMap.hasKey("cornerBottomLeftRadius") ? s.a(readableMap.getDouble("cornerBottomLeftRadius")) : 0.0f);
        }
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(RCTRoundImageView rCTRoundImageView, int i) {
        Object[] objArr = {rCTRoundImageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0daef0c49fb344bd1a103bb102face", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0daef0c49fb344bd1a103bb102face");
        } else {
            rCTRoundImageView.setFadeDuration(i);
        }
    }

    @ReactProp(name = "headers")
    public void setHeaders(RCTRoundImageView rCTRoundImageView, ReadableMap readableMap) {
        Object[] objArr = {rCTRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2777bfa86f716ff2412e760fd36394cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2777bfa86f716ff2412e760fd36394cb");
        } else {
            rCTRoundImageView.setHeaders(readableMap);
        }
    }

    @ReactProp(name = "method")
    public void setRequestMethod(RCTRoundImageView rCTRoundImageView, String str) {
        Object[] objArr = {rCTRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "809f67aa636cfe150af81bcdd5f7fcac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "809f67aa636cfe150af81bcdd5f7fcac");
        } else {
            rCTRoundImageView.setMethod(str);
        }
    }

    @ReactProp(name = "blurRadius")
    public void setBlurRadius(RCTRoundImageView rCTRoundImageView, float f) {
        Object[] objArr = {rCTRoundImageView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7db6934f8e811b634cb429d3418e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7db6934f8e811b634cb429d3418e49");
        } else {
            rCTRoundImageView.setBlurRadius(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b9086077962d3cb73a1027deacf0d9", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b9086077962d3cb73a1027deacf0d9") : com.meituan.msc.jse.common.a.a(a.a(4), com.meituan.msc.jse.common.a.a("registrationName", "onLoadStart"), a.a(2), com.meituan.msc.jse.common.a.a("registrationName", "onLoad"), a.a(1), com.meituan.msc.jse.common.a.a("registrationName", "onError"), a.a(3), com.meituan.msc.jse.common.a.a("registrationName", "onLoadEnd"));
    }
}
