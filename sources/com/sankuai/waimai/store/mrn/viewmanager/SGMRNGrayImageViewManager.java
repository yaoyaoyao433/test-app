package com.sankuai.waimai.store.mrn.viewmanager;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.a;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNGrayImageViewManager extends SimpleViewManager<UniversalImageView> {
    private static final String PROP_CDN_HEIGHT = "cdnHeight";
    private static final String PROP_CDN_WIDTH = "cdnWidth";
    private static final String PROP_CORNER_RADIUS = "cornerRadius";
    private static final String PROP_WEB_URL = "webUrl";
    private static final String REACT_CLASS = "WMMRNGrayImageView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public UniversalImageView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d8d205cb016c2e99c186de3d33ae3f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (UniversalImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d8d205cb016c2e99c186de3d33ae3f0");
        }
        UniversalImageView universalImageView = new UniversalImageView(aoVar);
        universalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return universalImageView;
    }

    @ReactProp(name = "source")
    public void source(@Nullable final UniversalImageView universalImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {universalImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa8455a113b4fa6d7dbbbb15f2d9b888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa8455a113b4fa6d7dbbbb15f2d9b888");
        } else if (universalImageView == null || readableMap == null) {
        } else {
            String string = readableMap.hasKey(PROP_WEB_URL) ? readableMap.getString(PROP_WEB_URL) : "";
            int a = readableMap.hasKey(PROP_CDN_WIDTH) ? g.a(universalImageView.getContext(), readableMap.getInt(PROP_CDN_WIDTH)) : -1;
            int a2 = readableMap.hasKey(PROP_CDN_HEIGHT) ? g.a(universalImageView.getContext(), readableMap.getInt(PROP_CDN_HEIGHT)) : -1;
            int a3 = readableMap.hasKey(PROP_CORNER_RADIUS) ? g.a(universalImageView.getContext(), readableMap.getInt(PROP_CORNER_RADIUS)) : 0;
            universalImageView.setCornerRadius(a3 < 0 ? 0.0f : a3);
            b.C0608b a4 = a.a();
            a4.b = universalImageView.getContext();
            a4.c = string;
            a4.f = ImageQualityUtil.a(0);
            b.C0608b a5 = a4.a(new GrayBitmapTransformation()).a(new b.d() { // from class: com.sankuai.waimai.store.mrn.viewmanager.SGMRNGrayImageViewManager.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ebd3c1aa04eead8845005b0a4e2cacb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ebd3c1aa04eead8845005b0a4e2cacb8");
                    } else if (universalImageView.getContext() instanceof ReactContext) {
                        ((RCTEventEmitter) ((ReactContext) universalImageView.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(universalImageView.getId(), "onLoad", null);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dde85ae30239cc25c5e396dbe0056674", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dde85ae30239cc25c5e396dbe0056674");
                    } else if (universalImageView.getContext() instanceof ReactContext) {
                        ((RCTEventEmitter) ((ReactContext) universalImageView.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(universalImageView.getId(), "onError", null);
                    }
                }
            });
            if (a > 0 && a2 <= 0) {
                a5 = a5.b(a);
            }
            if (a <= 0 && a2 > 0) {
                a5 = a5.a(a2);
            }
            if (a > 0 && a2 > 0) {
                a5 = a5.a(a, a2);
            }
            a5.a((ImageView) universalImageView);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @javax.annotation.Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2807c973ba68bc4231b06b5055cb9950", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2807c973ba68bc4231b06b5055cb9950") : c.b().a("onError", c.a("phasedRegistrationNames", c.a("bubbled", "onError"))).a("onLoad", c.a("phasedRegistrationNames", c.a("bubbled", "onLoad"))).a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GrayBitmapTransformation implements BitmapTransformation {
        public static ChangeQuickRedirect a;

        public GrayBitmapTransformation() {
        }

        @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
        public Bitmap transform(Bitmap bitmap, int i, int i2) {
            Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0194fe768d6d224ac3760f4f0fbe1677", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0194fe768d6d224ac3760f4f0fbe1677");
            }
            Object[] objArr2 = {bitmap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31e3d995b0dd575cf24bc410cb09c771", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31e3d995b0dd575cf24bc410cb09c771");
            }
            if (bitmap != null) {
                Paint paint = new Paint();
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return createBitmap;
            }
            return bitmap;
        }
    }
}
