package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

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
import com.sankuai.waimai.bussiness.order.confirm.image.GrayBitmapTransformation;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.a;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMRNGrayImageViewManager extends SimpleViewManager<RoundedImageView> {
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
    public RoundedImageView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28975ae91761d352d1a4bd6eedda331a", RobustBitConfig.DEFAULT_VALUE)) {
            return (RoundedImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28975ae91761d352d1a4bd6eedda331a");
        }
        RoundedImageView roundedImageView = new RoundedImageView(aoVar);
        roundedImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return roundedImageView;
    }

    @ReactProp(name = "source")
    public void source(@Nullable final RoundedImageView roundedImageView, @Nullable ReadableMap readableMap) {
        Object[] objArr = {roundedImageView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1260601391869c2554aefdd82afc58b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1260601391869c2554aefdd82afc58b0");
        } else if (roundedImageView == null || readableMap == null) {
        } else {
            String string = readableMap.hasKey(PROP_WEB_URL) ? readableMap.getString(PROP_WEB_URL) : "";
            int a = readableMap.hasKey(PROP_CDN_WIDTH) ? g.a(roundedImageView.getContext(), readableMap.getInt(PROP_CDN_WIDTH)) : -1;
            int a2 = readableMap.hasKey(PROP_CDN_HEIGHT) ? g.a(roundedImageView.getContext(), readableMap.getInt(PROP_CDN_HEIGHT)) : -1;
            int a3 = readableMap.hasKey(PROP_CORNER_RADIUS) ? g.a(roundedImageView.getContext(), readableMap.getInt(PROP_CORNER_RADIUS)) : 0;
            roundedImageView.setCornerRadius(a3 < 0 ? 0.0f : a3);
            b.C0608b a4 = a.a();
            a4.b = roundedImageView.getContext();
            a4.c = string;
            a4.f = ImageQualityUtil.a(0);
            b.C0608b a5 = a4.a(new GrayBitmapTransformation());
            a5.h = new b.c() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.WMMRNGrayImageViewManager.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d5ab7bbdca4fe0271293a81ab15600ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d5ab7bbdca4fe0271293a81ab15600ee");
                    } else if (roundedImageView.getContext() instanceof ReactContext) {
                        ((RCTEventEmitter) ((ReactContext) roundedImageView.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(roundedImageView.getId(), "onLoad", null);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0ae6ab09e6c18960f9173c578893d05d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0ae6ab09e6c18960f9173c578893d05d");
                    } else if (roundedImageView.getContext() instanceof ReactContext) {
                        ((RCTEventEmitter) ((ReactContext) roundedImageView.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(roundedImageView.getId(), "onError", null);
                    }
                }
            };
            if (a > 0 && a2 <= 0) {
                a5 = a5.b(a);
            }
            if (a <= 0 && a2 > 0) {
                a5 = a5.a(a2);
            }
            if (a > 0 && a2 > 0) {
                a5 = a5.a(a, a2);
            }
            a5.a((ImageView) roundedImageView);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @javax.annotation.Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07cd3c65bc60f799cf7eaa7f908a95bf", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07cd3c65bc60f799cf7eaa7f908a95bf") : c.b().a("onError", c.a("phasedRegistrationNames", c.a("bubbled", "onError"))).a("onLoad", c.a("phasedRegistrationNames", c.a("bubbled", "onLoad"))).a();
    }
}
