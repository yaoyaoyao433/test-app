package com.dianping.picasso.creator;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.IndicatorModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.list.IndicatorView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class IndicatorWrapper extends BaseViewWrapper<IndicatorView, IndicatorModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public IndicatorView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b90bbc7c9ad4b8f184b66bcb5155c10d", RobustBitConfig.DEFAULT_VALUE) ? (IndicatorView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b90bbc7c9ad4b8f184b66bcb5155c10d") : new IndicatorView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateFrame(View view, PicassoModel picassoModel) {
        FrameLayout.LayoutParams layoutParams;
        Object[] objArr = {view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f35f7515725643727866b7651c3db37d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f35f7515725643727866b7651c3db37d");
            return;
        }
        if (view.getLayoutParams() == null) {
            layoutParams = new FrameLayout.LayoutParams(picassoModel.getViewParams().width, picassoModel.getViewParams().height);
        } else if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = picassoModel.getViewParams().width;
            layoutParams.height = picassoModel.getViewParams().height;
        } else {
            view.getLayoutParams().width = picassoModel.getViewParams().width;
            view.getLayoutParams().height = picassoModel.getViewParams().height;
            return;
        }
        layoutParams.leftMargin = picassoModel.getViewParams().x;
        layoutParams.topMargin = picassoModel.getViewParams().y;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(IndicatorView indicatorView, PicassoView picassoView, IndicatorModel indicatorModel, IndicatorModel indicatorModel2) {
        Object[] objArr = {indicatorView, picassoView, indicatorModel, indicatorModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09714b22d391ee7f06e5a2863ed72d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09714b22d391ee7f06e5a2863ed72d28");
            return;
        }
        if (indicatorModel2 == null || indicatorModel.style != indicatorModel2.style) {
            indicatorView.setStyle(indicatorModel.style);
        }
        if (TextUtils.isEmpty(indicatorModel.color)) {
            indicatorView.setColor(null);
        } else {
            try {
                indicatorView.setColor(Integer.valueOf(Color.parseColor(indicatorModel.color)));
            } catch (Exception e) {
                e.printStackTrace();
                indicatorView.setColor(null);
            }
        }
        indicatorView.apply();
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<IndicatorModel> getDecodingFactory() {
        return IndicatorModel.DECODER;
    }
}
