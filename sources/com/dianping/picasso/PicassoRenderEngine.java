package com.dianping.picasso;

import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.GroupModel;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoRenderEngine {
    public static ChangeQuickRedirect changeQuickRedirect;

    @UiThread
    public static void render(PicassoView picassoView, PicassoModel picassoModel) {
        Object[] objArr = {picassoView, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4f4c275ef58e82ac3a13bb554f47489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4f4c275ef58e82ac3a13bb554f47489");
        } else {
            renderView(picassoView, picassoModel, picassoView);
        }
    }

    @UiThread
    public static void renderView(PicassoView picassoView, PicassoModel picassoModel, View view) {
        Object[] objArr = {picassoView, picassoModel, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44c040519604dbb2e315d383d6d49247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44c040519604dbb2e315d383d6d49247");
            return;
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
        if (viewWrapperByType == null) {
            return;
        }
        viewWrapperByType.refreshView(view, picassoModel, picassoView);
    }

    public static void updateViewTree(PicassoView picassoView, GroupModel groupModel, ViewGroup viewGroup) {
        Object[] objArr = {picassoView, groupModel, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4881519e2c9db0343d8407df8cf842b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4881519e2c9db0343d8407df8cf842b8");
        } else if (groupModel instanceof GroupModel) {
            PicassoModel[] picassoModelArr = groupModel.subviews;
            if (picassoModelArr != null && picassoModelArr.length > 0) {
                for (int i = 0; i < picassoModelArr.length; i++) {
                    PicassoModel picassoModel = picassoModelArr[i];
                    if (picassoModel != null) {
                        if (i < viewGroup.getChildCount()) {
                            View childAt = viewGroup.getChildAt(i);
                            if (isSameViewType(childAt, picassoModel.type)) {
                                renderView(picassoView, picassoModel, childAt);
                            } else {
                                viewGroup.removeViewAt(i);
                                addView(picassoView, picassoModel, viewGroup, i);
                            }
                        } else {
                            addView(picassoView, picassoModel, viewGroup, i);
                        }
                    }
                }
            }
            int length = picassoModelArr != null ? picassoModelArr.length : 0;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= length; childCount--) {
                viewGroup.removeViewAt(childCount);
            }
        }
    }

    private static void addView(PicassoView picassoView, PicassoModel picassoModel, ViewGroup viewGroup, int i) {
        Object[] objArr = {picassoView, picassoModel, viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6bf78c89588b896ad8ae6d4393d2b347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6bf78c89588b896ad8ae6d4393d2b347");
            return;
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
        if (viewWrapperByType == null) {
            return;
        }
        View initView = viewWrapperByType.initView(viewGroup.getContext(), picassoModel, picassoView);
        if (i >= viewGroup.getChildCount()) {
            viewGroup.addView(initView);
        } else {
            viewGroup.addView(initView, i);
        }
        viewWrapperByType.refreshView(initView, picassoModel, picassoView);
    }

    private static boolean isSameViewType(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c2c12c1781706dadb5598e314ad84d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c2c12c1781706dadb5598e314ad84d3")).booleanValue();
        }
        Object tag = view.getTag(R.id.id_picasso_model);
        return (tag instanceof PicassoModel) && ((PicassoModel) tag).type == i;
    }
}
