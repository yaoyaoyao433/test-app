package com.dianping.picasso.creator;

import android.content.Context;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoRenderEngine;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.GroupModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.PicassoGroupView;
import com.dianping.picasso.view.gesturehandler.PicassoGestureHandlerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GroupViewWrapper extends BaseViewWrapper<PicassoGroupView, GroupModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(PicassoGroupView picassoGroupView, GroupModel groupModel, String str) {
        return true;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoGroupView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bcf9cb18cb9b92052f2fa03275d2ccb", RobustBitConfig.DEFAULT_VALUE) ? (PicassoGroupView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bcf9cb18cb9b92052f2fa03275d2ccb") : new PicassoGroupView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoGroupView picassoGroupView, PicassoView picassoView, GroupModel groupModel, GroupModel groupModel2) {
        Object[] objArr = {picassoGroupView, picassoView, groupModel, groupModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8f6800397b7ccfcfff9dc55dfd8210b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8f6800397b7ccfcfff9dc55dfd8210b");
        } else {
            PicassoRenderEngine.updateViewTree(picassoView, groupModel, picassoGroupView);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<GroupModel> getDecodingFactory() {
        return GroupModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoModel[] getSubModels(GroupModel groupModel) {
        return groupModel.subviews;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void bindActions(PicassoGroupView picassoGroupView, GroupModel groupModel) {
        Object[] objArr = {picassoGroupView, groupModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "093a3974a826e04f20384a549427d4f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "093a3974a826e04f20384a549427d4f5");
            return;
        }
        super.bindActions((GroupViewWrapper) picassoGroupView, (PicassoGroupView) groupModel);
        if (groupModel.actions != null) {
            PicassoGestureHandlerManager.attachGestureHandlerToViewByAction(groupModel.hostId, picassoGroupView, groupModel.viewId, groupModel.actions);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoGroupView picassoGroupView, GroupModel groupModel) {
        Object[] objArr = {picassoGroupView, groupModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39153983c49b8faed8efd04130d536ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39153983c49b8faed8efd04130d536ce");
        } else {
            PicassoGestureHandlerManager.detachViewGestureHandler(picassoGroupView);
        }
    }
}
