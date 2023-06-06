package com.meituan.msc.mmpviews.image;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.precreate.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = "MSCImage")
/* loaded from: classes3.dex */
public class MPImageManager extends MPShellDelegateViewManager<MPRoundImageView, MPLayoutShadowNode> {
    public static ChangeQuickRedirect a;
    private static final Pattern i = Pattern.compile("^[\\w]+://");
    private final WeakHashMap<MPRoundImageView, Void> b;
    private final Context c;
    private final IFileModule e;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCImage";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f020e79dc864d408b4586643afc6560b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPRoundImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f020e79dc864d408b4586643afc6560b");
        }
        long nanoTime = System.nanoTime();
        MPRoundImageView tryGetMPImageView = themedReactContext.getRuntimeDelegate().tryGetMPImageView(themedReactContext);
        tryGetMPImageView.setFileModule(this.e);
        this.b.put(tryGetMPImageView, null);
        c.f++;
        c.B += System.nanoTime() - nanoTime;
        return tryGetMPImageView;
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view) {
        final MPRoundImageView mPRoundImageView = (MPRoundImageView) view;
        Object[] objArr = {mPRoundImageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1524c17f77dfb2ca99228274463ed8e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1524c17f77dfb2ca99228274463ed8e3");
            return;
        }
        super.a((MPImageManager) mPRoundImageView);
        if (UiThreadUtil.isOnUiThread()) {
            mPRoundImageView.a();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.msc.mmpviews.image.MPImageManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fd1c333120fd150f8bb5256978a8223", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fd1c333120fd150f8bb5256978a8223");
                    } else {
                        mPRoundImageView.a();
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, Object obj) {
        MPRoundImageView mPRoundImageView = (MPRoundImageView) view;
        Object[] objArr = {mPRoundImageView, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d39204e653a0db317d9e684f891fb10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d39204e653a0db317d9e684f891fb10");
        } else {
            super.a((MPImageManager) mPRoundImageView, obj);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ aa d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10c243eeb234b0b651565f2f44f6f1a", RobustBitConfig.DEFAULT_VALUE) ? (MPLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10c243eeb234b0b651565f2f44f6f1a") : new MPLayoutShadowNode();
    }

    public MPImageManager(Context context, IFileModule iFileModule) {
        Object[] objArr = {context, iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e662cf6452142a82d5aece94bc79787b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e662cf6452142a82d5aece94bc79787b");
            return;
        }
        this.b = new WeakHashMap<>();
        com.meituan.android.picassohelper.c.a(context);
        this.c = context;
        this.e = iFileModule;
    }

    @ReactProp(name = RaptorUploaderImpl.SRC)
    public void setSource(MPRoundImageView mPRoundImageView, @Nullable String str) {
        Object[] objArr = {mPRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff7c63bc382bf953556e22b61831acac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff7c63bc382bf953556e22b61831acac");
        } else {
            mPRoundImageView.setSource(a(mPRoundImageView.getContext(), str));
        }
    }

    @ReactProp(name = JsBridgeResult.ARG_KEY_LOCATION_MODE)
    public void setMode(MPRoundImageView mPRoundImageView, @Nullable String str) {
        Object[] objArr = {mPRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4280e3a4b9104f6ce78ab0c5ebeb224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4280e3a4b9104f6ce78ab0c5ebeb224");
        } else if (str == null) {
        } else {
            mPRoundImageView.setMode(b.a(str.replaceAll(StringUtil.SPACE, "")));
        }
    }

    @ReactProp(name = "lazy-load")
    public void setLazyLoad(MPRoundImageView mPRoundImageView, @Nullable boolean z) {
        Object[] objArr = {mPRoundImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360f173e3584887445545f48dd079ddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360f173e3584887445545f48dd079ddc");
        } else {
            mPRoundImageView.setIsLazyLoad(z);
        }
    }

    @ReactProp(name = "webp")
    public void setTransformToWebp(MPRoundImageView mPRoundImageView, @Nullable Dynamic dynamic) {
        Object[] objArr = {mPRoundImageView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c12a0e77b627343c524ada5d23afcab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c12a0e77b627343c524ada5d23afcab7");
        } else if (dynamic == null) {
        } else {
            mPRoundImageView.setTransformToWebp(com.meituan.msc.mmpviews.util.b.a(dynamic));
        }
    }

    @ReactProp(name = "capInsets")
    public void setCapInsets(MPRoundImageView mPRoundImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {mPRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a42430d140eb63891184645135dd64f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a42430d140eb63891184645135dd64f");
        } else {
            mPRoundImageView.setCapInsets(readableMap);
        }
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(MPRoundImageView mPRoundImageView, @Nullable String str) {
        Object[] objArr = {mPRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e290142055ce26b121bd5f988f50decf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e290142055ce26b121bd5f988f50decf");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            mPRoundImageView.setLoadingIndicatorSource(str);
        }
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceHolder(MPRoundImageView mPRoundImageView, String str) {
        Object[] objArr = {mPRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8dd177e36c264f7ac62ffa9a97d794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8dd177e36c264f7ac62ffa9a97d794");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            mPRoundImageView.setPlaceHolder(a(mPRoundImageView.getContext(), str));
        }
    }

    @ReactProp(customType = "Color", name = TintColor.LOWER_CASE_NAME)
    public void setTintColor(MPRoundImageView mPRoundImageView, Integer num) {
        Object[] objArr = {mPRoundImageView, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "539418f84b6303dcdb1027b2979db02e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "539418f84b6303dcdb1027b2979db02e");
        } else if (num == null) {
            mPRoundImageView.clearColorFilter();
        } else {
            mPRoundImageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(name = "error")
    public void setError(MPRoundImageView mPRoundImageView, ReadableMap readableMap) {
        Object[] objArr = {mPRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7959f9bc86e4d5fcfcd3a7ca850e3649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7959f9bc86e4d5fcfcd3a7ca850e3649");
        } else if (readableMap == null || !readableMap.hasKey(Constants.TRAFFIC_URI)) {
        } else {
            String string = readableMap.getString(Constants.TRAFFIC_URI);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            mPRoundImageView.setError(string);
        }
    }

    @ReactProp(name = "diskCacheStrategy")
    public void setDiskCacheStrategy(MPRoundImageView mPRoundImageView, String str) {
        Object[] objArr = {mPRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874cf1104c3a77305d79a41c2633af73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874cf1104c3a77305d79a41c2633af73");
        } else if (TextUtils.equals(str, "all")) {
            mPRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.ALL);
        } else if (TextUtils.equals(str, "none")) {
            mPRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.NONE);
        } else if (TextUtils.equals(str, "source")) {
            mPRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.SOURCE);
        } else if (TextUtils.equals(str, "result")) {
            mPRoundImageView.setDiskCacheStrategy(DiskCacheStrategy.RESULT);
        }
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(MPRoundImageView mPRoundImageView, int i2) {
        Object[] objArr = {mPRoundImageView, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5a3e0f0897809e05e015dfc910e251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5a3e0f0897809e05e015dfc910e251");
        } else {
            mPRoundImageView.setFadeDuration(i2);
        }
    }

    @ReactProp(name = "headers")
    public void setHeaders(MPRoundImageView mPRoundImageView, ReadableMap readableMap) {
        Object[] objArr = {mPRoundImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9484bf91367d231ca665629164fbe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9484bf91367d231ca665629164fbe9");
        } else {
            mPRoundImageView.setHeaders(readableMap);
        }
    }

    @ReactProp(name = "method")
    public void setRequestMethod(MPRoundImageView mPRoundImageView, String str) {
        Object[] objArr = {mPRoundImageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc5edae36d4832c25d910b6eb07d1bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc5edae36d4832c25d910b6eb07d1bf");
        } else {
            mPRoundImageView.setMethod(str);
        }
    }

    @ReactProp(name = "blurRadius")
    public void setBlurRadius(MPRoundImageView mPRoundImageView, float f) {
        Object[] objArr = {mPRoundImageView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ac4a45d66a0ba23c6e057494377d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ac4a45d66a0ba23c6e057494377d6d");
        } else {
            mPRoundImageView.setBlurRadius(f);
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b33de8940af6be1bfcb369e8d720473", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b33de8940af6be1bfcb369e8d720473") : com.meituan.msc.jse.common.a.a(a.a(2), com.meituan.msc.jse.common.a.a("registrationName", "bindload"), a.a(1), com.meituan.msc.jse.common.a.a("registrationName", "binderror"));
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<MPLayoutShadowNode> c() {
        return MPLayoutShadowNode.class;
    }

    private String a(Context context, String str) {
        ReactApplicationContext a2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02a33a8b73fb715c50541f859f354fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02a33a8b73fb715c50541f859f354fa");
        }
        if (!(context instanceof ThemedReactContext) || TextUtils.isEmpty(str) || i.matcher(str).find() || (a2 = ((ThemedReactContext) context).a()) == null) {
            return str;
        }
        return "mscfile://msc_" + a2.getRuntimeDelegate().getAppId() + str;
    }

    @ReactProp(defaultBoolean = true, name = "skipMemoryCache")
    public void setSkipMemoryCache(MPRoundImageView mPRoundImageView, boolean z) {
        Object[] objArr = {mPRoundImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7cc366b3680202f75557258d9024a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7cc366b3680202f75557258d9024a1");
        } else {
            mPRoundImageView.b = z;
        }
    }
}
