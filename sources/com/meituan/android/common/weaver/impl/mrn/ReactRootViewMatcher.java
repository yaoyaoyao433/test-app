package com.meituan.android.common.weaver.impl.mrn;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.MRNRootView;
import com.meituan.android.common.weaver.impl.IMRNFinder;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import com.meituan.android.mrn.container.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ReactRootViewMatcher extends AbstractViewMatcher implements IMRNFinder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mrnFound;
    public MRNRootView mrnRootView;

    public ReactRootViewMatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae91e88dd3d4e569dce321002b0920b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae91e88dd3d4e569dce321002b0920b5");
        } else {
            this.mrnFound = false;
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher
    public boolean match(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03d9ebe168a4b4016fe24dd096a2d729", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03d9ebe168a4b4016fe24dd096a2d729")).booleanValue();
        }
        if (view instanceof MRNRootView) {
            if (this.mrnFound && this.mrnRootView != view) {
                this.mrnRootView = null;
            } else if (!this.mrnFound) {
                this.mrnRootView = (MRNRootView) view;
                this.mrnFound = true;
            }
        }
        return false;
    }

    public void reset() {
        this.mrnFound = false;
        this.mrnRootView = null;
    }

    @Override // com.meituan.android.common.weaver.impl.IMRNFinder
    @Nullable
    public String[] getMRNInfo() {
        b mRNScene;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e5edae4d1e27c4ba88077760f1c34b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e5edae4d1e27c4ba88077760f1c34b");
        }
        if (this.mrnRootView == null || (mRNScene = this.mrnRootView.getMRNScene()) == null) {
            return null;
        }
        String[] strArr = new String[3];
        strArr[2] = mRNScene.c();
        String a = mRNScene.a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        String[] split = a.split(CommonConstant.Symbol.UNDERLINE);
        if (split.length == 3 && !"flashbuy-shopcart-page".equals(split[2])) {
            strArr[0] = split[1];
            strArr[1] = split[2];
            return strArr;
        }
        return null;
    }
}
