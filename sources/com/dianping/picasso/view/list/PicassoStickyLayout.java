package com.dianping.picasso.view.list;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.ListModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.PicassoGroupView;
import com.dianping.picasso.view.list.PCSListAdapter;
import com.dianping.picasso.view.nest.PCSNestedRecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoStickyLayout extends FrameLayout implements PCSListAdapter.StickyItemManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PicassoListView listView;
    private PicassoView pcsView;
    private List<StickyModel> stickyModelList;

    public PicassoStickyLayout(@NonNull PicassoListView picassoListView) {
        super(picassoListView.getContext());
        Object[] objArr = {picassoListView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf963245900144dcd0000795ecdf6259", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf963245900144dcd0000795ecdf6259");
            return;
        }
        this.stickyModelList = new ArrayList();
        this.listView = picassoListView;
    }

    @Override // com.dianping.picasso.view.list.PCSListAdapter.StickyItemManager
    public void initStickyItems(PicassoView picassoView) {
        Object[] objArr = {picassoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bac81c19b12a9d49fb8bc91d9cdb4f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bac81c19b12a9d49fb8bc91d9cdb4f6");
            return;
        }
        this.pcsView = picassoView;
        removeStickyViews();
        updateStickyModels();
        createStickyViews(true);
    }

    @Override // com.dianping.picasso.view.list.PCSListAdapter.StickyItemManager
    public void updateStickyModels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a1af54b01b5145c5e6a0ab09126b120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a1af54b01b5145c5e6a0ab09126b120");
            return;
        }
        this.stickyModelList.clear();
        PCSListAdapter adapter = this.listView.getAdapter();
        for (int i = 0; i < this.listView.getCachedItems().size(); i++) {
            if (this.listView.getCachedItems().get(i) instanceof StickyTopInterface) {
                StickyTopInterface stickyTopInterface = (StickyTopInterface) this.listView.getCachedItems().get(i);
                if (stickyTopInterface.getStickyTop() != null) {
                    StickyModel stickyModel = new StickyModel();
                    stickyModel.pos = adapter.getHeaderCount() + i;
                    stickyModel.pModel = this.listView.getCachedItems().get(i);
                    stickyModel.stickyTop = stickyTopInterface.getStickyTop().intValue();
                    stickyModel.originalOffset = adapter.getItemOffset(stickyModel.pos);
                    this.stickyModelList.add(stickyModel);
                }
            }
        }
        calculateMaxPosition();
        for (int i2 = 0; i2 < this.stickyModelList.size(); i2++) {
            setStickyOffset(this.stickyModelList.get(i2));
        }
    }

    @Override // com.dianping.picasso.view.list.PCSListAdapter.StickyItemManager
    public void updateStickyViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d9435c651c8a581f64aa69c20676e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d9435c651c8a581f64aa69c20676e2");
            return;
        }
        removeStickyViews();
        createStickyViews(false);
    }

    @Override // com.dianping.picasso.view.list.PCSListAdapter.StickyItemManager
    public void bindStickyView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123a4d876e6ef4ba8a6d5908528217a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123a4d876e6ef4ba8a6d5908528217a6");
            return;
        }
        for (StickyModel stickyModel : this.stickyModelList) {
            if (stickyModel.pos == i) {
                createView(stickyModel);
                replaceStickyView(stickyModel);
            }
        }
    }

    @Override // com.dianping.picasso.view.list.PCSListAdapter.StickyItemManager
    public boolean hasStickyItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0afab5e11bb3fee8e5db72016fd8ed82", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0afab5e11bb3fee8e5db72016fd8ed82")).booleanValue() : !this.stickyModelList.isEmpty();
    }

    private void calculateMaxPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "582c3c00a252788da0050dc4db7e2cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "582c3c00a252788da0050dc4db7e2cdc");
            return;
        }
        for (int i = 0; i < this.stickyModelList.size(); i++) {
            StickyModel stickyModel = this.stickyModelList.get(i);
            StickyModel nextStickyModel = getNextStickyModel(i, stickyModel);
            if (nextStickyModel != null) {
                stickyModel.maxOffset = nextStickyModel.originalOffset - stickyModel.pModel.getViewParams().height;
            }
        }
    }

    private StickyModel getNextStickyModel(int i, StickyModel stickyModel) {
        Object[] objArr = {Integer.valueOf(i), stickyModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b8f38a1eced31cb0be3260851aa1131", RobustBitConfig.DEFAULT_VALUE)) {
            return (StickyModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b8f38a1eced31cb0be3260851aa1131");
        }
        if (i >= this.stickyModelList.size() - 1) {
            return null;
        }
        for (int i2 = i + 1; i2 < this.stickyModelList.size(); i2++) {
            StickyModel stickyModel2 = this.stickyModelList.get(i2);
            if ((stickyModel.stickyTop + stickyModel.pModel.getViewParams().height) - stickyModel2.stickyTop > 1) {
                return stickyModel2;
            }
        }
        return null;
    }

    private void removeStickyViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c180aa5be63a8134926b8d7655aeeee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c180aa5be63a8134926b8d7655aeeee9");
            return;
        }
        removeAllViews();
        for (StickyModel stickyModel : this.stickyModelList) {
            stickyModel.stickyView = null;
        }
    }

    private boolean stickyOnScreen(StickyModel stickyModel, int i) {
        Object[] objArr = {stickyModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bedc3c1c31125f853512e81949f6db8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bedc3c1c31125f853512e81949f6db8e")).booleanValue() : stickyModel.isSticky && stickyModel.offset > i - stickyModel.pModel.getViewParams().height;
    }

    private void createView(StickyModel stickyModel) {
        Object[] objArr = {stickyModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a31882747866e53ccf712350e316a586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a31882747866e53ccf712350e316a586");
        } else if (stickyModel.stickyView == null) {
            stickyModel.stickyView = new PicassoGroupView(getContext());
            refreshView(stickyModel.stickyView, stickyModel.pModel);
            stickyModel.stickyView.setTag(R.id.id_picasso_index, Integer.valueOf(stickyModel.pos));
        }
    }

    private void createStickyViews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "472f59569a4e65f6767650b76f12fe8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "472f59569a4e65f6767650b76f12fe8c");
            return;
        }
        int computeVerticalScrollOffset = ((PCSNestedRecyclerView) this.listView.getInnerView()).computeVerticalScrollOffset();
        for (StickyModel stickyModel : this.stickyModelList) {
            if (stickyOnScreen(stickyModel, computeVerticalScrollOffset)) {
                createView(stickyModel);
            }
            if (z) {
                addStickyView(stickyModel);
            } else {
                replaceStickyView(stickyModel);
            }
        }
        bringPreToFront();
    }

    private void refreshView(View view, PicassoModel picassoModel) {
        Object[] objArr = {view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b0123fc9c6b064b168f4bc0c3c7492c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b0123fc9c6b064b168f4bc0c3c7492c");
            return;
        }
        ListModel listModel = this.listView.getAdapter().getListModel();
        if (picassoModel.getViewParams().width == 0) {
            picassoModel.getViewParams().width = listModel.getViewParams().width;
        }
        picassoModel.hostId = listModel.hostId;
        picassoModel.parentId = listModel.viewId;
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
        if (viewWrapperByType != null) {
            viewWrapperByType.refreshView(view, picassoModel, this.pcsView);
        }
    }

    private void setOffset(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4e4439c0299714929feeebdafdaf917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4e4439c0299714929feeebdafdaf917");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public void onListScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71e886a10c613f7b999191b2ce9b5fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71e886a10c613f7b999191b2ce9b5fd6");
        } else if (i == 0 && i2 == 0) {
            post(new Runnable() { // from class: com.dianping.picasso.view.list.PicassoStickyLayout.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "51103fbb76bcb971f034256c89bf6675", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "51103fbb76bcb971f034256c89bf6675");
                    } else {
                        PicassoStickyLayout.this.onListScroll();
                    }
                }
            });
        } else {
            onListScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onListScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64fff7da0b3b6531806720118762701d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64fff7da0b3b6531806720118762701d");
            return;
        }
        for (int i = 0; i < this.stickyModelList.size(); i++) {
            setStickyOffset(this.stickyModelList.get(i));
        }
        createStickyViews(false);
    }

    private void setStickyOffset(StickyModel stickyModel) {
        Object[] objArr = {stickyModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f549e6ba97370ce6d465a59ff2adc9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f549e6ba97370ce6d465a59ff2adc9c");
            return;
        }
        int computeVerticalScrollOffset = ((PCSNestedRecyclerView) this.listView.getInnerView()).computeVerticalScrollOffset();
        stickyModel.offset = Math.min(stickyModel.maxOffset, Math.max(stickyModel.stickyTop + computeVerticalScrollOffset, stickyModel.originalOffset));
        stickyModel.isSticky = stickyModel.offset <= stickyModel.stickyTop + computeVerticalScrollOffset;
    }

    private void bringPreToFront() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc82465be2fa26619103db1736df9ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc82465be2fa26619103db1736df9ebd");
            return;
        }
        for (int size = this.stickyModelList.size() - 1; size >= 0; size--) {
            StickyModel stickyModel = this.stickyModelList.get(size);
            if (stickyModel.offset == stickyModel.maxOffset && size > 0) {
                bringChildToFront(this.stickyModelList.get(size - 1).stickyView);
            }
        }
    }

    private void addStickyView(StickyModel stickyModel) {
        Object[] objArr = {stickyModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "265b4b25a77d8832380affaafd7542cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "265b4b25a77d8832380affaafd7542cc");
            return;
        }
        View view = stickyModel.stickyView;
        if (view != null && stickyModel.isSticky) {
            if (indexOfChild(view) == -1) {
                addView(view);
            }
            setOffset(view, stickyModel.offset - ((PCSNestedRecyclerView) this.listView.getInnerView()).computeVerticalScrollOffset());
        }
    }

    private void replaceStickyView(StickyModel stickyModel) {
        Object[] objArr = {stickyModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84037a729231b15dee7f151ae8436de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84037a729231b15dee7f151ae8436de9");
            return;
        }
        ViewGroup listItemAt = getListItemAt(stickyModel.pos);
        View view = stickyModel.stickyView;
        if (view == null) {
            return;
        }
        if (view.getParent() != null && !(view.getParent() instanceof PicassoStickyLayout) && listItemAt != view.getParent()) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (stickyModel.isSticky) {
            if (listItemAt != null) {
                listItemAt.removeAllViews();
            }
            if (indexOfChild(view) == -1) {
                addView(view);
            }
            setOffset(view, stickyModel.offset - ((PCSNestedRecyclerView) this.listView.getInnerView()).computeVerticalScrollOffset());
            return;
        }
        removeView(view);
        if (listItemAt == null || listItemAt.indexOfChild(view) != -1) {
            return;
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(stickyModel.pModel.type));
        if (viewWrapperByType != null) {
            viewWrapperByType.updateFrame(view, stickyModel.pModel);
        }
        listItemAt.addView(view);
    }

    private ViewGroup getListItemAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f12e0b4f1afd894c34a3924a5dd0ce71", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f12e0b4f1afd894c34a3924a5dd0ce71");
        }
        ViewGroup viewGroup = (ViewGroup) ((PCSNestedRecyclerView) this.listView.getInnerView()).getLayoutManager().findViewByPosition(i);
        if (viewGroup == null) {
            return null;
        }
        return (ViewGroup) viewGroup.getChildAt(0);
    }
}
