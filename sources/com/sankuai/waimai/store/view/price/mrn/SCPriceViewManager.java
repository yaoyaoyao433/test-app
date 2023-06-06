package com.sankuai.waimai.store.view.price.mrn;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.google.gson.Gson;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.view.price.SCPriceView;
import com.sankuai.waimai.store.view.price.bean.UnifyPrice;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPriceViewManager extends SimpleViewManager<SCPriceView> {
    private static final String REACT_CLASS = "SMMRNUnifyPrice";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mFontSize;
    private int mInnerPadding;
    private int mScene;
    private boolean mSoldOut;
    private UnifyPrice mUnifyPrice;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    public SCPriceViewManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2ee78b01955068a23b5b31cce8dca45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2ee78b01955068a23b5b31cce8dca45");
        } else {
            this.mInnerPadding = -1;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public SCPriceView createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d83772ebd9586e2e396003dfe3d2f2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCPriceView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d83772ebd9586e2e396003dfe3d2f2f");
        }
        SCPriceView sCPriceView = new SCPriceView(aoVar);
        sCPriceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return sCPriceView;
    }

    @ReactProp(name = KnbConstants.PARAMS_SCENE)
    public void setScene(SCPriceView sCPriceView, int i) {
        this.mScene = i;
    }

    @ReactProp(name = "unifyPrice")
    public void setUnifyPrice(SCPriceView sCPriceView, ReadableMap readableMap) {
        Object[] objArr = {sCPriceView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3512b2ee22416c44b370513d421ca0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3512b2ee22416c44b370513d421ca0fa");
            return;
        }
        Gson a = i.a();
        try {
            this.mUnifyPrice = (UnifyPrice) a.fromJson(a.toJson(g.a(readableMap)), (Class<Object>) UnifyPrice.class);
        } catch (Exception e) {
            a.a(e);
        }
    }

    @ReactProp(name = JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
    public void setFontSize(SCPriceView sCPriceView, String str) {
        Object[] objArr = {sCPriceView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc47ffc4a4ad2b2a28a23a8d8c86e688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc47ffc4a4ad2b2a28a23a8d8c86e688");
        } else {
            this.mFontSize = t.a(str) ? 0 : Integer.parseInt(str.replace("f", ""));
        }
    }

    @ReactProp(name = "soldOut")
    public void setSoldOut(SCPriceView sCPriceView, boolean z) {
        this.mSoldOut = z;
    }

    @ReactProp(name = "innerPadding")
    public void setInnerPadding(SCPriceView sCPriceView, int i) {
        this.mInnerPadding = i;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull final SCPriceView sCPriceView) {
        Object[] objArr = {sCPriceView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cccda5931715bbec6e71db3d0e54f76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cccda5931715bbec6e71db3d0e54f76");
            return;
        }
        super.onAfterUpdateTransaction((SCPriceViewManager) sCPriceView);
        sCPriceView.a(this.mScene, this.mUnifyPrice, this.mFontSize, this.mSoldOut, this.mInnerPadding);
        sCPriceView.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        sCPriceView.requestLayout();
        final ao aoVar = (ao) sCPriceView.getContext();
        aoVar.runOnNativeModulesQueueThread(new GuardedRunnable(aoVar.getExceptionHandler()) { // from class: com.sankuai.waimai.store.view.price.mrn.SCPriceViewManager.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.GuardedRunnable
            public final void runGuarded() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9376984db73a9cf01a2a7c21fe10de1c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9376984db73a9cf01a2a7c21fe10de1c");
                } else {
                    ((UIManagerModule) aoVar.getNativeModule(UIManagerModule.class)).updateNodeSize(sCPriceView.getId(), sCPriceView.getMeasuredWidth(), sCPriceView.getMeasuredHeight());
                }
            }
        });
    }
}
