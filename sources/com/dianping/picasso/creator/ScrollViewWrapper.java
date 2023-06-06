package com.dianping.picasso.creator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoAction;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoRenderEngine;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.ScrollViewModel;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.command.CommandViewInterface;
import com.dianping.picasso.view.command.ScrollViewCommandModel;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.dianping.picasso.view.scroller.PicassoScrollView;
import com.dianping.picassocontroller.widget.PCSSwipeLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollViewWrapper extends BaseViewWrapper<PicassoScrollView, ScrollViewModel> implements CommandViewInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoScrollView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "013eb2e5df820c046e55c6ca07843f49", RobustBitConfig.DEFAULT_VALUE) ? (PicassoScrollView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "013eb2e5df820c046e55c6ca07843f49") : new PicassoScrollView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoScrollView picassoScrollView, PicassoView picassoView, ScrollViewModel scrollViewModel, ScrollViewModel scrollViewModel2) {
        Object[] objArr = {picassoScrollView, picassoView, scrollViewModel, scrollViewModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99677294231b2effeed72e491052a338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99677294231b2effeed72e491052a338");
            return;
        }
        if (scrollViewModel2 == null || scrollViewModel2.showScrollIndicator != scrollViewModel.showScrollIndicator) {
            picassoScrollView.getInnerView().showIndicator(scrollViewModel.showScrollIndicator);
        }
        PicassoRenderEngine.updateViewTree(picassoView, scrollViewModel, picassoScrollView.getInnerView().getChildFrame());
        if ("loading".equals(scrollViewModel.refreshStatus)) {
            if (!picassoScrollView.isRefreshing()) {
                picassoScrollView.startRefresh();
            }
        } else if (picassoScrollView.isRefreshing() && !picassoScrollView.isStoppingRefresh()) {
            picassoScrollView.stopRefresh();
        }
        picassoScrollView.getInnerView().setOverScrollMode(scrollViewModel.overScrollMode);
        picassoScrollView.getInnerView().setScrollEnable(scrollViewModel.scrollEnabled);
        picassoScrollView.getInnerView().setContentOffset(scrollViewModel.contentOffsetX != null ? PicassoUtils.dp2px(picassoScrollView.getContext(), scrollViewModel.contentOffsetX.floatValue()) : -1, scrollViewModel.contentOffsetY != null ? PicassoUtils.dp2px(picassoScrollView.getContext(), scrollViewModel.contentOffsetY.floatValue()) : -1, scrollViewModel.animateToOffset);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<ScrollViewModel> getDecodingFactory() {
        return ScrollViewModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public DecodingFactory getCommandViewDecodingFactory() {
        return ScrollViewCommandModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        int i;
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaa134c387212984dd2b8c33b2a65763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaa134c387212984dd2b8c33b2a65763");
            return;
        }
        super.handleCommandView(view, baseViewCommandModel, picassoModel);
        if ((baseViewCommandModel instanceof ScrollViewCommandModel) && (picassoModel instanceof ScrollViewModel)) {
            Context context = view != null ? view.getContext() : PicassoEnvironment.globalContext;
            ScrollViewCommandModel scrollViewCommandModel = (ScrollViewCommandModel) baseViewCommandModel;
            ScrollViewModel scrollViewModel = (ScrollViewModel) picassoModel;
            if (scrollViewCommandModel.contentOffsetModel == null) {
                return;
            }
            boolean booleanValue = scrollViewCommandModel.contentOffsetModel.animate != null ? scrollViewCommandModel.contentOffsetModel.animate.booleanValue() : false;
            int i2 = -1;
            if (scrollViewCommandModel.contentOffsetModel.x != null) {
                if (scrollViewModel.contentOffsetX != null) {
                    scrollViewModel.contentOffsetX = scrollViewCommandModel.contentOffsetModel.x;
                }
                i = PicassoUtils.dp2px(context, scrollViewCommandModel.contentOffsetModel.x.floatValue());
            } else {
                i = -1;
            }
            if (scrollViewCommandModel.contentOffsetModel.y != null) {
                if (scrollViewModel.contentOffsetY != null) {
                    scrollViewModel.contentOffsetY = scrollViewCommandModel.contentOffsetModel.y;
                }
                i2 = PicassoUtils.dp2px(context, scrollViewCommandModel.contentOffsetModel.y.floatValue());
            }
            if (view instanceof PicassoScrollView) {
                PicassoScrollView picassoScrollView = (PicassoScrollView) view;
                picassoScrollView.getInnerView().fling(0, 0);
                picassoScrollView.getInnerView().setContentOffset(i, i2, booleanValue);
            }
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoModel[] getSubModels(ScrollViewModel scrollViewModel) {
        return scrollViewModel.subviews;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void bindActions(PicassoScrollView picassoScrollView, final ScrollViewModel scrollViewModel) {
        Object[] objArr = {picassoScrollView, scrollViewModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32b5526f76196f565850572eb8df8609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32b5526f76196f565850572eb8df8609");
            return;
        }
        super.bindActions((ScrollViewWrapper) picassoScrollView, (PicassoScrollView) scrollViewModel);
        picassoScrollView.getInnerView().setScrollChangeListener(new CustomizedScrollView.OnScrollChangeListener() { // from class: com.dianping.picasso.creator.ScrollViewWrapper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picasso.view.scroller.CustomizedScrollView.OnScrollChangeListener
            public void onScrollChange(CustomizedScrollView customizedScrollView, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {customizedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "31e6971db8e2e0013e5a1f932f378a8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "31e6971db8e2e0013e5a1f932f378a8e");
                    return;
                }
                float px2dp = PicassoUtils.px2dp(PicassoEnvironment.globalContext, i);
                float px2dp2 = PicassoUtils.px2dp(PicassoEnvironment.globalContext, i2);
                float px2dp3 = PicassoUtils.px2dp(PicassoEnvironment.globalContext, i3);
                float px2dp4 = PicassoUtils.px2dp(PicassoEnvironment.globalContext, i4);
                if (scrollViewModel.contentOffsetX != null) {
                    scrollViewModel.contentOffsetX = Float.valueOf(px2dp);
                }
                if (scrollViewModel.contentOffsetY != null) {
                    scrollViewModel.contentOffsetY = Float.valueOf(px2dp2);
                }
                if (ScrollViewWrapper.this.hasAction(scrollViewModel, "onScroll")) {
                    ScrollViewWrapper.this.callAction(scrollViewModel, "onScroll", new JSONBuilder().put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(px2dp)).put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(px2dp2)).put("oldX", Float.valueOf(px2dp3)).put("oldY", Float.valueOf(px2dp4)).toJSONObject());
                }
            }
        });
        picassoScrollView.getInnerView().setScrollEndListener(new CustomizedScrollView.OnScrollEndListener() { // from class: com.dianping.picasso.creator.ScrollViewWrapper.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picasso.view.scroller.CustomizedScrollView.OnScrollEndListener
            public void onScrollEnd(CustomizedScrollView customizedScrollView, int i, int i2) {
                Object[] objArr2 = {customizedScrollView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33410bdc43a29eae90ea41a869847896", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33410bdc43a29eae90ea41a869847896");
                    return;
                }
                float px2dp = PicassoUtils.px2dp(PicassoEnvironment.globalContext, i);
                float px2dp2 = PicassoUtils.px2dp(PicassoEnvironment.globalContext, i2);
                if (scrollViewModel.contentOffsetX != null) {
                    scrollViewModel.contentOffsetX = Float.valueOf(px2dp);
                }
                if (scrollViewModel.contentOffsetY != null) {
                    scrollViewModel.contentOffsetY = Float.valueOf(px2dp2);
                }
                if (ScrollViewWrapper.this.hasAction(scrollViewModel, PicassoAction.ON_SCROLL_END)) {
                    ScrollViewWrapper.this.callAction(scrollViewModel, PicassoAction.ON_SCROLL_END, new JSONBuilder().put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(px2dp)).put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(px2dp2)).toJSONObject());
                }
            }
        });
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(PicassoScrollView picassoScrollView, final ScrollViewModel scrollViewModel, final String str) {
        Object[] objArr = {picassoScrollView, scrollViewModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd72e079f17780b4326143c0da6417a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd72e079f17780b4326143c0da6417a5")).booleanValue();
        }
        if (bindClickAction(picassoScrollView, scrollViewModel, str)) {
            return true;
        }
        if (PicassoAction.ON_PULL_DOWN.equals(str)) {
            picassoScrollView.setOnRefreshListener(new PCSSwipeLayout.a() { // from class: com.dianping.picasso.creator.ScrollViewWrapper.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picassocontroller.widget.PCSSwipeLayout.a
                public void onPullingDown(float f, int i, float f2) {
                }

                @Override // com.dianping.picassocontroller.widget.PCSSwipeLayout.a
                public void onRefresh() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6499d4fa7584b4734a492f19c99b96cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6499d4fa7584b4734a492f19c99b96cc");
                    } else {
                        ScrollViewWrapper.this.callAction(scrollViewModel, str, null);
                    }
                }
            });
            if (scrollViewModel.refreshView != null) {
                picassoScrollView.setHeaderViewModel(scrollViewModel.refreshView);
            }
            return true;
        }
        return super.bindAction((ScrollViewWrapper) picassoScrollView, (PicassoScrollView) scrollViewModel, str);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindClickAction(PicassoScrollView picassoScrollView, final ScrollViewModel scrollViewModel, final String str) {
        Object[] objArr = {picassoScrollView, scrollViewModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d44eadb076859b18ffa50571bf58b11d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d44eadb076859b18ffa50571bf58b11d")).booleanValue();
        }
        if (!"click".equals(str) || picassoScrollView == null || picassoScrollView.getInnerView() == null || picassoScrollView.getInnerView().getChildFrame() == null) {
            return false;
        }
        picassoScrollView.getInnerView().getChildFrame().setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picasso.creator.ScrollViewWrapper.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "596e1ab8164ca849ae03ac3bb7825972", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "596e1ab8164ca849ae03ac3bb7825972");
                } else {
                    ScrollViewWrapper.this.callAction(scrollViewModel, str, null);
                }
            }
        });
        picassoScrollView.setClickable(true);
        return true;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoScrollView picassoScrollView, ScrollViewModel scrollViewModel) {
        Object[] objArr = {picassoScrollView, scrollViewModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e447bd3fc68c2134d96b6fcf40ee8b9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e447bd3fc68c2134d96b6fcf40ee8b9a");
            return;
        }
        picassoScrollView.setLongClickable(false);
        picassoScrollView.setClickable(false);
        picassoScrollView.setRefreshEnable(false);
        picassoScrollView.getInnerView().setScrollChangeListener(null);
        picassoScrollView.getInnerView().setScrollEndListener(null);
    }
}
