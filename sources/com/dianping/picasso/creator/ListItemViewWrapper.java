package com.dianping.picasso.creator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoRenderEngine;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.ListItemModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.PicassoGroupView;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.component.ContainerItemInterface;
import com.dianping.picasso.view.list.PCSListAdapter;
import com.dianping.picasso.view.list.PicassoListView;
import com.dianping.picasso.view.list.SlideMenuLayout;
import com.dianping.picasso.view.nest.PCSNestedRecyclerView;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListItemViewWrapper extends BaseViewWrapper<PicassoGroupView, ListItemModel> implements ContainerItemInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoGroupView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c17fa24de1c36a8b01679aa6fc6523", RobustBitConfig.DEFAULT_VALUE) ? (PicassoGroupView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c17fa24de1c36a8b01679aa6fc6523") : new PicassoGroupView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoGroupView picassoGroupView, PicassoView picassoView, ListItemModel listItemModel, ListItemModel listItemModel2) {
        Object[] objArr = {picassoGroupView, picassoView, listItemModel, listItemModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3991a475d6cc0e3e0ba1fc2f01a95800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3991a475d6cc0e3e0ba1fc2f01a95800");
        } else {
            PicassoRenderEngine.updateViewTree(picassoView, listItemModel, picassoGroupView);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<ListItemModel> getDecodingFactory() {
        return ListItemModel.DeCODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoModel[] getSubModels(ListItemModel listItemModel) {
        return listItemModel.subviews;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(PicassoGroupView picassoGroupView, ListItemModel listItemModel, String str) {
        Object[] objArr = {picassoGroupView, listItemModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a72226477454c6ab3047da7c45f51cc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a72226477454c6ab3047da7c45f51cc2")).booleanValue();
        }
        if (bindClickAction(picassoGroupView, listItemModel, str)) {
            return true;
        }
        return super.bindAction((ListItemViewWrapper) picassoGroupView, (PicassoGroupView) listItemModel, str);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoGroupView picassoGroupView, ListItemModel listItemModel) {
        Object[] objArr = {picassoGroupView, listItemModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a43187111c00a52148a6e8c2f196f3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a43187111c00a52148a6e8c2f196f3f");
            return;
        }
        picassoGroupView.setLongClickable(false);
        picassoGroupView.setClickable(false);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        int position;
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d171bd00f42a39b2655de2366cc01e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d171bd00f42a39b2655de2366cc01e54");
            return;
        }
        super.handleCommandView(view, baseViewCommandModel, picassoModel);
        if (view == null || view.getParent() == null || baseViewCommandModel == null || baseViewCommandModel.height == null || (position = getPosition(view, picassoModel)) < 0) {
            return;
        }
        ViewParent recyclerView = getRecyclerView(view.getParent(), picassoModel);
        if (recyclerView instanceof RecyclerView) {
            ((RecyclerView) recyclerView).getAdapter().notifyItemChanged(position);
        }
        RecyclerView recyclerView2 = (RecyclerView) recyclerView;
        if (recyclerView2.getAdapter() instanceof PCSListAdapter) {
            int[] realPosition2IndexPath = ((PCSListAdapter) recyclerView2.getAdapter()).realPosition2IndexPath(position);
            ((PCSListAdapter) recyclerView2.getAdapter()).updateItemPModel(realPosition2IndexPath[1], realPosition2IndexPath[0], picassoModel);
            ((PCSListAdapter) recyclerView2.getAdapter()).updateStickyView();
        }
    }

    @Override // com.dianping.picasso.view.component.ContainerItemInterface
    public void updateItem(PicassoView picassoView, View view, PicassoModel picassoModel) {
        int position;
        Object[] objArr = {picassoView, view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58cd17b4fa960fb4ef73eef51a09d93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58cd17b4fa960fb4ef73eef51a09d93e");
        } else if (view == null) {
        } else {
            ViewParent recyclerView = getRecyclerView(view.getParent(), picassoModel);
            if ((recyclerView instanceof RecyclerView) && (position = getPosition(view, picassoModel)) >= 0) {
                RecyclerView recyclerView2 = (RecyclerView) recyclerView;
                if (view.getHeight() != picassoModel.getViewParams().height) {
                    recyclerView2.getAdapter().notifyItemChanged(position);
                } else if ((view instanceof PicassoGroupView) && (picassoModel instanceof ListItemModel)) {
                    refreshView((PicassoGroupView) view, (ListItemModel) picassoModel, picassoView);
                }
                if (recyclerView2.getAdapter() instanceof PCSListAdapter) {
                    ((PCSListAdapter) recyclerView2.getAdapter()).updateStickyView();
                }
            }
        }
    }

    private int getPosition(View view, PicassoModel picassoModel) {
        Object[] objArr = {view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0f3ebdb68a1298618ae78f341b40097", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0f3ebdb68a1298618ae78f341b40097")).intValue();
        }
        int findSlideMenuLayoutPosition = findSlideMenuLayoutPosition(view, picassoModel);
        if (findSlideMenuLayoutPosition < 0) {
            if (view.getTag(R.id.id_picasso_index) == null) {
                return -1;
            }
            return ((Integer) view.getTag(R.id.id_picasso_index)).intValue();
        }
        return findSlideMenuLayoutPosition;
    }

    private ViewParent getListItem(ViewParent viewParent) {
        while (true) {
            Object[] objArr = {viewParent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0438dae58d09edf6640dfe84db5c2cf", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewParent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0438dae58d09edf6640dfe84db5c2cf");
            }
            if (viewParent == null) {
                return null;
            }
            if (viewParent instanceof SlideMenuLayout) {
                return viewParent;
            }
            viewParent = viewParent.getParent();
        }
    }

    private ViewParent getRecyclerView(ViewParent viewParent) {
        while (true) {
            Object[] objArr = {viewParent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c17e81d4d540ea44757d83071af99365", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewParent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c17e81d4d540ea44757d83071af99365");
            }
            if (viewParent == null) {
                return null;
            }
            if (viewParent instanceof PCSNestedRecyclerView) {
                return viewParent;
            }
            viewParent = viewParent.getParent();
        }
    }

    private ViewParent getRecyclerView(ViewParent viewParent, PicassoModel picassoModel) {
        Object[] objArr = {viewParent, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d930f57e5e66274ffc42abd4f7cf33d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewParent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d930f57e5e66274ffc42abd4f7cf33d7");
        }
        ViewParent recyclerView = getRecyclerView(viewParent.getParent());
        if (recyclerView != null || picassoModel == null) {
            return recyclerView;
        }
        b a = c.a(picassoModel.hostId);
        if (a instanceof g) {
            View a2 = ((g) a).a(picassoModel.parentId);
            return a2 instanceof PicassoListView ? (ViewParent) ((PicassoListView) a2).getInnerView() : recyclerView;
        }
        return recyclerView;
    }

    private int findSlideMenuLayoutPosition(View view, PicassoModel picassoModel) {
        Object[] objArr = {view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "014780907ef7316940566bff79d8c5ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "014780907ef7316940566bff79d8c5ea")).intValue();
        }
        if (view == null || view.getParent() == null) {
            return -1;
        }
        ViewParent recyclerView = getRecyclerView(view.getParent(), picassoModel);
        ViewParent listItem = getListItem(view.getParent());
        if ((recyclerView instanceof RecyclerView) && (listItem instanceof SlideMenuLayout)) {
            return ((RecyclerView) recyclerView).getChildLayoutPosition((SlideMenuLayout) listItem);
        }
        return -1;
    }
}
