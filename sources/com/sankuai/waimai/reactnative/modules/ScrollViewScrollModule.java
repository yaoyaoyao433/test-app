package com.sankuai.waimai.reactnative.modules;

import android.support.annotation.Keep;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ScrollViewScrollModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewTreeObserver.OnScrollChangedListener mOnScrollChangeListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ScrollViewScrollModule";
    }

    public ScrollViewScrollModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "135206b5d4c4593e4e640d4afff10153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "135206b5d4c4593e4e640d4afff10153");
        }
    }

    @ReactMethod
    public void initScrollParams(String str, String str2, final int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0ea8af062f51a60021f559f15d296c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0ea8af062f51a60021f559f15d296c3");
        } else if (getCurrentActivity() != null) {
            final View a = com.sankuai.waimai.reactnative.utils.a.a(getCurrentActivity().getWindow().getDecorView(), str);
            final View a2 = com.sankuai.waimai.reactnative.utils.a.a(getCurrentActivity().getWindow().getDecorView(), str2);
            if ((a2 instanceof ScrollView) && (a instanceof ScrollView)) {
                this.mOnScrollChangeListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.sankuai.waimai.reactnative.modules.ScrollViewScrollModule.1
                    public static ChangeQuickRedirect a;
                    public int b = 0;

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c88310653f69323f8974a5edb452be79", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c88310653f69323f8974a5edb452be79");
                            return;
                        }
                        int a3 = g.a(com.meituan.android.singleton.b.a, i);
                        ((ScrollView) a2).scrollTo(0, a.getScrollY() - a3 >= 0 ? a.getScrollY() - a3 : 0);
                        if (this.b == a.getScrollY() && a.getScrollY() - a3 > 0 && ScrollViewScrollModule.this.getReactApplicationContext() != null) {
                            com.sankuai.waimai.reactnative.utils.a.a(ScrollViewScrollModule.this.getReactApplicationContext(), "ScrollViewFinish", Arguments.createMap());
                        }
                        this.b = a.getScrollY();
                    }
                };
                ((ScrollView) a).getViewTreeObserver().addOnScrollChangedListener(this.mOnScrollChangeListener);
            }
        }
    }

    @ReactMethod
    public void removeScrollChangedListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d77549a17e0506d1e4af23002b00dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d77549a17e0506d1e4af23002b00dfe");
        } else if (getCurrentActivity() != null) {
            View a = com.sankuai.waimai.reactnative.utils.a.a(getCurrentActivity().getWindow().getDecorView(), str);
            if (a instanceof ScrollView) {
                ((ScrollView) a).getViewTreeObserver().removeOnScrollChangedListener(this.mOnScrollChangeListener);
            }
        }
    }
}
