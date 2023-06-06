package com.dianping.picasso.creator;

import android.content.Context;
import android.view.View;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.RefreshViewModel;
import com.dianping.picassocontroller.widget.CircleProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RefreshViewWrapper extends BaseViewWrapper<CircleProgressBar, RefreshViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateFrame(View view, PicassoModel picassoModel) {
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(CircleProgressBar circleProgressBar, PicassoView picassoView, RefreshViewModel refreshViewModel, RefreshViewModel refreshViewModel2) {
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public CircleProgressBar createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "621d496faaea59f5a0e64fe318827a40", RobustBitConfig.DEFAULT_VALUE) ? (CircleProgressBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "621d496faaea59f5a0e64fe318827a40") : new CircleProgressBar(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<RefreshViewModel> getDecodingFactory() {
        return RefreshViewModel.PICASSO_DECODER;
    }
}
