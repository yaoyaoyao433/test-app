package com.dianping.gcmrnmodule.components.imageview;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.dianping.shield.entity.AgentScrollerParams;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = GCMRNImageViewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001aH\u0007J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\tH\u0007J\u001a\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0014H\u0007J\u001a\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010'\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u001a\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.H\u0007J\u001a\u0010/\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00102\u001a\u00020.H\u0007J\u001a\u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0011H\u0007¨\u00065"}, d2 = {"Lcom/dianping/gcmrnmodule/components/imageview/GCMRNImageViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/dianping/gcmrnmodule/components/imageview/GCMRNImageView;", "()V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onAfterUpdateTransaction", "", Constants.EventType.VIEW, "setBackground", "source", "Lcom/facebook/react/bridge/ReadableMap;", "setBorderColor", "borderColor", "", "(Lcom/dianping/gcmrnmodule/components/imageview/GCMRNImageView;Ljava/lang/Integer;)V", "setBorderRadius", "imageView", "index", BorderRadius.LOWER_CASE_NAME, "", "setBorderWidth", "borderWidth", "setCapInsets", "capInsets", "setDefaultSource", "defaultSource", "setDiskCacheStrategy", "diskCacheStrategy", "setError", "setFadeDuration", "durationMs", "setLoadingIndicatorSource", "setNinePatchSource", "sources", "Lcom/facebook/react/bridge/ReadableArray;", "setResizeMode", ResizeMode.LOWER_CASE_NAME, "setRoundAsCircle", "roundAsCircle", "", "setRoundedCornerRadius", "roundedCornerRadiusMap", "setSkipMemoryCache", "skipMemoryCache", "setSource", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class GCMRNImageViewManager extends SimpleViewManager<GCMRNImageView> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "GCMRNImageView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/components/imageview/GCMRNImageViewManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final GCMRNImageView createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00ece2dabe948d470618423a3080f05f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GCMRNImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00ece2dabe948d470618423a3080f05f");
        }
        h.b(aoVar, "context");
        return new GCMRNImageView(aoVar);
    }

    @ReactPropGroup(defaultFloat = AgentScrollerParams.DEFAULT_SPEED, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public final void setBorderRadius(@NotNull GCMRNImageView gCMRNImageView, int i, float f) {
        Object[] objArr = {gCMRNImageView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b602c54cf552da30a959acaac3ab22de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b602c54cf552da30a959acaac3ab22de");
            return;
        }
        h.b(gCMRNImageView, "imageView");
        float a2 = w.a(f);
        if (i == 0) {
            gCMRNImageView.setBorderRadius(a2);
        } else {
            gCMRNImageView.a(a2, (i - 1) * 2);
        }
    }

    @ReactProp(name = "source")
    public final void setSource(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {gCMRNImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "918232021cb50064e68935c7e4f13517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "918232021cb50064e68935c7e4f13517");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setSource(readableMap);
    }

    @ReactProp(name = "defaultSource")
    public final void setDefaultSource(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {gCMRNImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "765fb264e2fc3454bbc5b02966ad822a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "765fb264e2fc3454bbc5b02966ad822a");
            return;
        }
        h.b(gCMRNImageView, "imageView");
        gCMRNImageView.setDefaultSource(readableMap);
    }

    @ReactProp(name = "ninePatchSrc")
    public final void setNinePatchSource(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableArray readableArray) {
        Object[] objArr = {gCMRNImageView, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3475bf756fbe486c083cf47fc37b94c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3475bf756fbe486c083cf47fc37b94c");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setNinePatchSource(readableArray);
    }

    @ReactProp(name = "capInsets")
    public final void setCapInsets(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {gCMRNImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4362155b10a556cca51bebc04c516d6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4362155b10a556cca51bebc04c516d6c");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setCapInsets(readableMap);
    }

    @ReactProp(name = ResizeMode.LOWER_CASE_NAME)
    public final void setResizeMode(@NotNull GCMRNImageView gCMRNImageView, @Nullable String str) {
        Object[] objArr = {gCMRNImageView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fe7762a07a0e4cd33272ab49abdca32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fe7762a07a0e4cd33272ab49abdca32");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setScaleType(com.facebook.react.views.image.b.a(str));
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(@NotNull GCMRNImageView gCMRNImageView, @Nullable String str) {
        Object[] objArr = {gCMRNImageView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e837a65b2c523cea67ade259eb63766f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e837a65b2c523cea67ade259eb63766f");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gCMRNImageView.setLoadingIndicatorSource(str);
    }

    @ReactProp(name = "error")
    public final void setError(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {gCMRNImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4496814ad7c73b20715fe97699705987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4496814ad7c73b20715fe97699705987");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        if (readableMap == null || !readableMap.hasKey(com.meituan.metrics.common.Constants.TRAFFIC_URI)) {
            return;
        }
        String string = readableMap.getString(com.meituan.metrics.common.Constants.TRAFFIC_URI);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        gCMRNImageView.setError(string);
    }

    @ReactProp(defaultBoolean = true, name = "skipMemoryCache")
    public final void setSkipMemoryCache(@NotNull GCMRNImageView gCMRNImageView, boolean z) {
        Object[] objArr = {gCMRNImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a23d9a3d95f6d399778f54be8a963fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a23d9a3d95f6d399778f54be8a963fb");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.a(z);
    }

    @ReactProp(name = "diskCacheStrategy")
    public final void setDiskCacheStrategy(@NotNull GCMRNImageView gCMRNImageView, @NotNull String str) {
        Object[] objArr = {gCMRNImageView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f0f9a31f2d8a06aea74d6c94927de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f0f9a31f2d8a06aea74d6c94927de9");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        h.b(str, "diskCacheStrategy");
        String str2 = str;
        if (TextUtils.equals(str2, "all")) {
            gCMRNImageView.setDiskCacheStrategy(DiskCacheStrategy.ALL);
        } else if (TextUtils.equals(str2, "none")) {
            gCMRNImageView.setDiskCacheStrategy(DiskCacheStrategy.NONE);
        } else if (TextUtils.equals(str2, "source")) {
            gCMRNImageView.setDiskCacheStrategy(DiskCacheStrategy.SOURCE);
        } else if (TextUtils.equals(str2, "result")) {
            gCMRNImageView.setDiskCacheStrategy(DiskCacheStrategy.RESULT);
        }
    }

    @ReactProp(name = "background")
    public final void setBackground(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableMap readableMap) {
        Drawable b2;
        Object[] objArr = {gCMRNImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7591b62841dc89ed8e566d693ff47cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7591b62841dc89ed8e566d693ff47cb");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        if (readableMap == null || !readableMap.hasKey(com.meituan.metrics.common.Constants.TRAFFIC_URI)) {
            return;
        }
        String string = readableMap.getString(com.meituan.metrics.common.Constants.TRAFFIC_URI);
        if (TextUtils.isEmpty(string) || (b2 = com.facebook.react.views.imagehelper.a.a().b(gCMRNImageView.getContext(), string)) == null) {
            return;
        }
        gCMRNImageView.setBackground(b2);
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public final void setBorderColor(@NotNull GCMRNImageView gCMRNImageView, @Nullable Integer num) {
        Object[] objArr = {gCMRNImageView, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8609841a509d366e8a0e1dca9bb0f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8609841a509d366e8a0e1dca9bb0f6");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        if (num == null) {
            gCMRNImageView.setBorderColor(0);
        } else {
            gCMRNImageView.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "borderWidth")
    public final void setBorderWidth(@NotNull GCMRNImageView gCMRNImageView, float f) {
        Object[] objArr = {gCMRNImageView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "897d46f5fd072d2b0c987df82b705fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "897d46f5fd072d2b0c987df82b705fe7");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setBorderWidth(f);
    }

    @ReactProp(name = "roundAsCircle")
    public final void setRoundAsCircle(@NotNull GCMRNImageView gCMRNImageView, boolean z) {
        Object[] objArr = {gCMRNImageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acf99c575813d093b55ff5d4b8a433cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acf99c575813d093b55ff5d4b8a433cf");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setRoundAsCircle(z);
    }

    @ReactProp(name = "roundedCornerRadius")
    public final void setRoundedCornerRadius(@NotNull GCMRNImageView gCMRNImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {gCMRNImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3508da1715f0db9d4f56cea5a6c403bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3508da1715f0db9d4f56cea5a6c403bc");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("cornerRadius")) {
            float a2 = w.a(readableMap.getDouble("cornerRadius"));
            gCMRNImageView.a(a2, a2, a2, a2);
            return;
        }
        gCMRNImageView.a(readableMap.hasKey("cornerTopLeftRadius") ? w.a(readableMap.getDouble("cornerTopLeftRadius")) : 0.0f, readableMap.hasKey("cornerTopRightRadius") ? w.a(readableMap.getDouble("cornerTopRightRadius")) : 0.0f, readableMap.hasKey("cornerBottomRightRadius") ? w.a(readableMap.getDouble("cornerBottomRightRadius")) : 0.0f, readableMap.hasKey("cornerBottomLeftRadius") ? w.a(readableMap.getDouble("cornerBottomLeftRadius")) : 0.0f);
    }

    @ReactProp(name = "fadeDuration")
    public final void setFadeDuration(@NotNull GCMRNImageView gCMRNImageView, int i) {
        Object[] objArr = {gCMRNImageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60b65cc1b7ac52c59e0160997197560d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60b65cc1b7ac52c59e0160997197560d");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        gCMRNImageView.setFadeDuration(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb99d195331b32cb9a2f1f293a99c527", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb99d195331b32cb9a2f1f293a99c527") : c.a(com.facebook.react.views.image.a.b(4), c.a("registrationName", "onLoadStart"), com.facebook.react.views.image.a.b(2), c.a("registrationName", "onLoad"), com.facebook.react.views.image.a.b(1), c.a("registrationName", "onError"), com.facebook.react.views.image.a.b(3), c.a("registrationName", "onLoadEnd"));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public final void onAfterUpdateTransaction(@NotNull GCMRNImageView gCMRNImageView) {
        Object[] objArr = {gCMRNImageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49f1c3f45ee2adef8d6e2cf681a08151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49f1c3f45ee2adef8d6e2cf681a08151");
            return;
        }
        h.b(gCMRNImageView, Constants.EventType.VIEW);
        if (UiThreadUtil.isOnUiThread()) {
            gCMRNImageView.a();
        } else {
            new Handler(Looper.getMainLooper()).post(new b(gCMRNImageView));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ GCMRNImageView b;

        public b(GCMRNImageView gCMRNImageView) {
            this.b = gCMRNImageView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39cbab61ad8103990cf00b1b570c9035", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39cbab61ad8103990cf00b1b570c9035");
            } else {
                this.b.a();
            }
        }
    }
}
