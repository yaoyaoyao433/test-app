package com.dianping.picasso.creator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoAction;
import com.dianping.picasso.PicassoRecyclerViewScrollListener;
import com.dianping.picasso.PicassoUpdateIndexPathHelper;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.ListModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.command.CommandViewInterface;
import com.dianping.picasso.view.command.ListViewCommandModel;
import com.dianping.picasso.view.list.PCSListAdapter;
import com.dianping.picasso.view.list.PicassoListView;
import com.dianping.picasso.view.nest.PCSNestedRecyclerView;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.dianping.picassocontroller.widget.PCSSwipeLayout;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListViewWrapper extends BaseViewWrapper<PicassoListView, ListModel> implements CommandViewInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoListView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2cec995141986332b848b825c2b2043", RobustBitConfig.DEFAULT_VALUE) ? (PicassoListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2cec995141986332b848b825c2b2043") : new PicassoListView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(final PicassoListView picassoListView, PicassoView picassoView, final ListModel listModel, ListModel listModel2) {
        Object[] objArr = {picassoListView, picassoView, listModel, listModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bf9ac297e819e59a3fcb6b612d4e7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bf9ac297e819e59a3fcb6b612d4e7ed");
            return;
        }
        b a = c.a(listModel.hostId);
        if (a == null || !(a instanceof g)) {
            Log.e("ListViewWrapper", "Cannot find host");
            return;
        }
        picassoListView.getCachedItems().clear();
        g gVar = (g) a;
        String str = listModel.viewId;
        Object[] objArr2 = {picassoListView, str};
        ChangeQuickRedirect changeQuickRedirect3 = g.m;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "ba6b63dadc4959a05587627f6bb09294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "ba6b63dadc4959a05587627f6bb09294");
        } else {
            gVar.n.put(str, new WeakReference<>(picassoListView));
        }
        if (listModel2 == null || listModel2.adapter == null) {
            ((PCSNestedRecyclerView) picassoListView.getInnerView()).setItemAnimator(null);
            listModel.adapter = new PCSListAdapter(gVar, picassoView, listModel);
            picassoListView.setAdapter(listModel.adapter);
            listModel.adapter.initStickyItemManager(picassoListView.getPicassoStickyLayout());
        } else {
            listModel.adapter = listModel2.adapter;
            listModel.adapter.updateModel(gVar, picassoView, listModel);
            listModel.adapter.initStickyItemManager(picassoListView.getPicassoStickyLayout());
            if (listModel.updateIndexPathModels != null && !TextUtils.isEmpty(listModel.updateAction)) {
                new PicassoUpdateIndexPathHelper((RecyclerView) picassoListView.getInnerView(), listModel.updateAction, listModel.updateIndexPathModels) { // from class: com.dianping.picasso.creator.ListViewWrapper.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picasso.PicassoUpdateIndexPathHelper
                    public int indexPathToPosition(int i, int i2) {
                        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8d47a0dfb683461345b19f28b381d5e9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8d47a0dfb683461345b19f28b381d5e9")).intValue() : listModel.adapter.indexPath2Position(i, i2);
                    }

                    @Override // com.dianping.picasso.PicassoUpdateIndexPathHelper
                    public int getItemCount() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b86824c8b5a203d416a55d6b02e92599", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b86824c8b5a203d416a55d6b02e92599")).intValue() : listModel.adapter.getListItemCount();
                    }
                }.postUpdateItems(new PicassoUpdateIndexPathHelper.onUpdateListener() { // from class: com.dianping.picasso.creator.ListViewWrapper.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picasso.PicassoUpdateIndexPathHelper.onUpdateListener
                    public void onUpdate(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2edbac9591ec8b208d9fa53c554683e5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2edbac9591ec8b208d9fa53c554683e5");
                        } else if (z) {
                        } else {
                            ((PCSNestedRecyclerView) picassoListView.getInnerView()).setItemAnimator(null);
                            listModel.adapter.notifyDataSetChanged();
                        }
                    }
                });
            } else {
                ((PCSNestedRecyclerView) picassoListView.getInnerView()).setItemAnimator(null);
                listModel.adapter.notifyDataSetChanged();
            }
        }
        listModel.adapter.bindScrollListener((RecyclerView) picassoListView.getInnerView());
        listModel.adapter.closeItemMenu();
        picassoListView.setSectionIndicator(listModel.adapter);
        if (listModel.adapter.hasStickyItem()) {
            listModel.stickySectionHeader = false;
        }
        listModel.adapter.updateStickLayout(picassoListView);
        if (!TextUtils.isEmpty(listModel.indexColor)) {
            picassoListView.setIndicatorColor(listModel.indexColor);
        }
        if (listModel.initIndex >= 0) {
            picassoListView.moveToPosition(listModel.initIndex, false);
        }
        if ("loading".equals(listModel.refreshStatus)) {
            if (!picassoListView.isRefreshing()) {
                picassoListView.setAdapter(listModel.adapter);
                picassoListView.startRefresh();
            }
        } else if (picassoListView.isRefreshing() && !picassoListView.isStoppingRefresh()) {
            picassoListView.stopRefresh();
        }
        if (listModel.needStopScroll) {
            ((PCSNestedRecyclerView) picassoListView.getInnerView()).stopScroll();
        }
        if (listModel.initSection >= 0 && listModel.initItem >= 0 && listModel.sectionItemCounts.length > listModel.initSection && listModel.sectionItemCounts[listModel.initSection] > listModel.initItem) {
            int indexPath2RealPosition = listModel.adapter.indexPath2RealPosition(listModel.initSection, listModel.initItem);
            ((PCSNestedRecyclerView) picassoListView.getInnerView()).stopScroll();
            picassoListView.moveToPosition(indexPath2RealPosition, listModel.animationToIndexPath);
        }
        if (listModel.toOffsetY != null) {
            ((PCSNestedRecyclerView) picassoListView.getInnerView()).stopScroll();
            if (listModel.animationToOffset) {
                picassoListView.smoothScrollTo(PicassoUtils.dp2px(picassoListView.getContext(), listModel.toOffsetX.floatValue()), PicassoUtils.dp2px(picassoListView.getContext(), listModel.toOffsetY.floatValue()));
            } else {
                picassoListView.scrollTo(PicassoUtils.dp2px(picassoListView.getContext(), listModel.toOffsetX.floatValue()), PicassoUtils.dp2px(picassoListView.getContext(), listModel.toOffsetY.floatValue()));
            }
        }
        if (listModel2 == null || listModel2.showScrollIndicator != listModel.showScrollIndicator) {
            picassoListView.setHorizontalScrollBarEnabled(listModel.showScrollIndicator);
            picassoListView.setVerticalScrollBarEnabled(listModel.showScrollIndicator);
        }
        picassoListView.setScrollEnabled(listModel.scrollEnable);
        picassoListView.setNestScrollType(listModel.nestScrollType);
        picassoListView.setCaptureResponderOffset(PicassoUtils.dip2px(picassoListView.getContext(), listModel.captureResponderOffset));
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).setCaptureNestFling(listModel.captureNestFling);
        picassoListView.setScrollBounce(listModel.scrollBounce);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoListView picassoListView, ListModel listModel) {
        Object[] objArr = {picassoListView, listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d93a5da6aefa45b9e4fd355e0a548b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d93a5da6aefa45b9e4fd355e0a548b4");
            return;
        }
        picassoListView.setOnRefreshListener(null);
        picassoListView.setOnLoadMoreListener(null);
        picassoListView.setRefreshEnable(false);
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).setOnFlingListener(null);
        List<RecyclerView.k> list = picassoListView.onScrollListeners;
        for (RecyclerView.k kVar : list) {
            ((PCSNestedRecyclerView) picassoListView.getInnerView()).removeOnScrollListener(kVar);
        }
        list.clear();
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).clearOnChildAttachStateChangeListeners();
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<ListModel> getDecodingFactory() {
        return ListModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public DecodingFactory getCommandViewDecodingFactory() {
        return ListViewCommandModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2826fa0a234520313117bc2860ac877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2826fa0a234520313117bc2860ac877");
            return;
        }
        super.handleCommandView(view, baseViewCommandModel, picassoModel);
        if ((baseViewCommandModel instanceof ListViewCommandModel) && (picassoModel instanceof ListModel)) {
            ListViewCommandModel listViewCommandModel = (ListViewCommandModel) baseViewCommandModel;
            ListModel listModel = (ListModel) picassoModel;
            syncUpdatePmodel(listViewCommandModel, listModel);
            handleView(view, listViewCommandModel, listModel);
        }
    }

    private void syncUpdatePmodel(@NonNull ListViewCommandModel listViewCommandModel, @NonNull ListModel listModel) {
        Object[] objArr = {listViewCommandModel, listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aed8c9833c0261ce45c9ab0555e20b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aed8c9833c0261ce45c9ab0555e20b9");
            return;
        }
        if (listViewCommandModel.contentOffsetModel != null) {
            if (listViewCommandModel.contentOffsetModel.x != null && listModel.toOffsetX != null) {
                listModel.toOffsetX = listViewCommandModel.contentOffsetModel.x;
            }
            if (listViewCommandModel.contentOffsetModel.y != null && listModel.toOffsetY != null) {
                listModel.toOffsetY = listViewCommandModel.contentOffsetModel.y;
            }
        }
        if (listViewCommandModel.scrollToIndexPath != null && listViewCommandModel.scrollToIndexPath.itemIndex != null && listViewCommandModel.scrollToIndexPath.sectionIndex != null) {
            int intValue = listViewCommandModel.scrollToIndexPath.sectionIndex.intValue();
            int intValue2 = listViewCommandModel.scrollToIndexPath.itemIndex.intValue();
            if (intValue >= 0 && listModel.sectionItemCounts != null && listModel.sectionItemCounts.length > intValue && listModel.sectionItemCounts[intValue] > intValue2 && listModel.initItem >= 0 && listModel.initSection >= 0) {
                listModel.initItem = intValue2;
                listModel.initSection = intValue;
            }
        }
        if (listViewCommandModel.scrollEnable != null) {
            listModel.scrollEnable = listViewCommandModel.scrollEnable.booleanValue();
        }
    }

    private void handleView(View view, @NonNull ListViewCommandModel listViewCommandModel, @NonNull ListModel listModel) {
        Object[] objArr = {view, listViewCommandModel, listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1c375eedd147df3f51d3abb849a84c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1c375eedd147df3f51d3abb849a84c8");
        } else if (view instanceof PicassoListView) {
            PicassoListView picassoListView = (PicassoListView) view;
            if (listViewCommandModel.contentOffsetModel != null && (listViewCommandModel.contentOffsetModel.x != null || listViewCommandModel.contentOffsetModel.y != null)) {
                picassoListView.scrollTo(listViewCommandModel.contentOffsetModel.x == null ? 0 : PicassoUtils.dp2px(view.getContext(), listViewCommandModel.contentOffsetModel.x.floatValue()), listViewCommandModel.contentOffsetModel.y == null ? 0 : PicassoUtils.dp2px(view.getContext(), listViewCommandModel.contentOffsetModel.y.floatValue()), listViewCommandModel.contentOffsetModel.animate == null ? false : listViewCommandModel.contentOffsetModel.animate.booleanValue());
            }
            if (listViewCommandModel.scrollToIndexPath != null && listViewCommandModel.scrollToIndexPath.itemIndex != null && listViewCommandModel.scrollToIndexPath.sectionIndex != null) {
                int intValue = listViewCommandModel.scrollToIndexPath.sectionIndex.intValue();
                int intValue2 = listViewCommandModel.scrollToIndexPath.itemIndex.intValue();
                boolean booleanValue = listViewCommandModel.scrollToIndexPath.animate != null ? listViewCommandModel.scrollToIndexPath.animate.booleanValue() : false;
                if (intValue >= 0 && listModel.sectionItemCounts != null && listModel.sectionItemCounts.length > intValue && listModel.sectionItemCounts[intValue] > intValue2 && listModel.adapter != null) {
                    int indexPath2RealPosition = listModel.adapter.indexPath2RealPosition(intValue, intValue2);
                    ((PCSNestedRecyclerView) picassoListView.getInnerView()).stopScroll();
                    picassoListView.moveToPosition(indexPath2RealPosition, booleanValue);
                }
            }
            if (listViewCommandModel.needStopScroll != null) {
                ((PCSNestedRecyclerView) picassoListView.getInnerView()).stopScroll();
            }
            if (listViewCommandModel.scrollEnable != null) {
                picassoListView.setScrollEnabled(listViewCommandModel.scrollEnable.booleanValue());
            }
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(final PicassoListView picassoListView, final ListModel listModel, final String str) {
        Object[] objArr = {picassoListView, listModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fe2eaca5fec28d186f92e74f3470377", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fe2eaca5fec28d186f92e74f3470377")).booleanValue();
        }
        if (PicassoAction.ON_PULL_DOWN.equals(str)) {
            picassoListView.setOnRefreshListener(new PCSSwipeLayout.a() { // from class: com.dianping.picasso.creator.ListViewWrapper.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picassocontroller.widget.PCSSwipeLayout.a
                public void onRefresh() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3f8177da0bbc08f38fe24064889cd8db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3f8177da0bbc08f38fe24064889cd8db");
                    } else {
                        ListViewWrapper.this.callAction(listModel, str, null);
                    }
                }

                @Override // com.dianping.picassocontroller.widget.PCSSwipeLayout.a
                public void onPullingDown(float f, int i, float f2) {
                    Object[] objArr2 = {Float.valueOf(f), Integer.valueOf(i), Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60120c5bcb135c84a25f061496a1afaa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60120c5bcb135c84a25f061496a1afaa");
                    } else {
                        picassoListView.setPullOutDistance(i);
                    }
                }
            });
            if (listModel.refreshView != null) {
                picassoListView.setHeaderViewModel(listModel.refreshView);
            }
            return true;
        } else if (PicassoAction.ON_LOAD_MORE.equals(str)) {
            picassoListView.setOnLoadMoreListener(new PicassoListView.OnLoadMoreListener() { // from class: com.dianping.picasso.creator.ListViewWrapper.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.view.list.PicassoListView.OnLoadMoreListener
                public void onLoadMore() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f1214abe03ee210053a97524a8c9567", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f1214abe03ee210053a97524a8c9567");
                    } else {
                        ListViewWrapper.this.callAction(listModel, str, null);
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void bindActions(final PicassoListView picassoListView, final ListModel listModel) {
        Object[] objArr = {picassoListView, listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad4f488e97c0d819e4f64860284da36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad4f488e97c0d819e4f64860284da36b");
            return;
        }
        super.bindActions((ListViewWrapper) picassoListView, (PicassoListView) listModel);
        if (picassoListView == null) {
            return;
        }
        PicassoRecyclerViewScrollListener picassoRecyclerViewScrollListener = new PicassoRecyclerViewScrollListener(listModel) { // from class: com.dianping.picasso.creator.ListViewWrapper.5
            public static ChangeQuickRedirect changeQuickRedirect;
            private String direction = "";
            private int preDy = 0;
            private int state = 0;

            @Override // com.dianping.picasso.PicassoRecyclerViewScrollListener
            public PicassoRecyclerViewScrollListener.VisibleItemsInfo getVisibleItems() throws JSONException {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bdc3f77044f4add7d2a753878d58e50b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PicassoRecyclerViewScrollListener.VisibleItemsInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bdc3f77044f4add7d2a753878d58e50b");
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((PCSNestedRecyclerView) picassoListView.getInnerView()).getLayoutManager();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                JSONArray jSONArray = new JSONArray();
                for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition < findFirstCompletelyVisibleItemPosition; findFirstVisibleItemPosition++) {
                    JSONObject indexPathInfo = picassoListView.getIndexPathInfo(findFirstVisibleItemPosition);
                    if (indexPathInfo != null) {
                        jSONArray.put(indexPathInfo);
                    }
                }
                for (int i = findLastCompletelyVisibleItemPosition + 1; i <= findLastVisibleItemPosition; i++) {
                    JSONObject indexPathInfo2 = picassoListView.getIndexPathInfo(i);
                    if (indexPathInfo2 != null) {
                        jSONArray.put(indexPathInfo2);
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                while (findFirstCompletelyVisibleItemPosition <= findLastCompletelyVisibleItemPosition) {
                    JSONObject indexPathInfo3 = picassoListView.getIndexPathInfo(findFirstCompletelyVisibleItemPosition);
                    if (indexPathInfo3 != null) {
                        jSONArray2.put(indexPathInfo3);
                    }
                    findFirstCompletelyVisibleItemPosition++;
                }
                return new PicassoRecyclerViewScrollListener.VisibleItemsInfo(jSONArray, jSONArray2);
            }

            @Override // com.dianping.picasso.PicassoRecyclerViewScrollListener, android.support.v7.widget.RecyclerView.k
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a6c241267e9ec98afe6d99e50a99edea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a6c241267e9ec98afe6d99e50a99edea");
                    return;
                }
                initState(i);
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // com.dianping.picasso.PicassoRecyclerViewScrollListener, android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb83ccfa86a1401ac33183697d12e262", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb83ccfa86a1401ac33183697d12e262");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                onDirectionChangeEvent(i, i2);
            }

            @Override // com.dianping.picasso.PicassoRecyclerViewScrollListener
            public void onScrollEvent(RecyclerView recyclerView, float f, float f2) {
                Object[] objArr2 = {recyclerView, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eeaccf5f3c8c1f6042decf213f44ba47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eeaccf5f3c8c1f6042decf213f44ba47");
                    return;
                }
                super.onScrollEvent(recyclerView, f, f2);
                if (listModel.toOffsetX != null) {
                    listModel.toOffsetX = Float.valueOf(f);
                }
                if (listModel.toOffsetY != null) {
                    listModel.toOffsetY = Float.valueOf(f2);
                }
            }

            private void initState(int i) {
                this.state = i;
                if (i != 1) {
                    this.direction = "";
                }
            }

            private void onDirectionChangeEvent(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ada5761bb4b32525392c1a39649589a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ada5761bb4b32525392c1a39649589a8");
                } else if (this.state != 1) {
                } else {
                    String str = "";
                    if (i2 > 0 && this.preDy > 0) {
                        str = TraceSQLHelper.KEY_UP;
                    } else if (i2 < 0 && this.preDy < 0) {
                        str = TraceSQLHelper.KEY_DOWN;
                    }
                    this.preDy = i2;
                    if (!TextUtils.isEmpty(str) && !str.equals(this.direction) && PicassoAction.hasAction(listModel, PicassoAction.ON_DIRECTION_CHANGE)) {
                        PicassoAction.callAction(listModel, PicassoAction.ON_DIRECTION_CHANGE, new JSONBuilder().put("direction", str).toJSONObject());
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    this.direction = str;
                }
            }
        };
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).addOnScrollListener(picassoRecyclerViewScrollListener);
        picassoListView.onScrollListeners.add(picassoRecyclerViewScrollListener);
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).setOnFlingListener(new RecyclerView.i() { // from class: com.dianping.picasso.creator.ListViewWrapper.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.i
            public boolean onFling(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1025c098df99bf51e1edff8ac2d3f932", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1025c098df99bf51e1edff8ac2d3f932")).booleanValue();
                }
                if (ListViewWrapper.this.hasAction(listModel, PicassoAction.ON_END_DRAGGING)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(Constants.GestureMoveEvent.KEY_X, -PicassoUtils.px2dp(picassoListView.getContext(), i));
                        jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, -PicassoUtils.px2dp(picassoListView.getContext(), i2));
                        jSONObject.put(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, jSONObject2);
                        jSONObject.put(Constants.GestureMoveEvent.KEY_X, PicassoUtils.px2dp(picassoListView.getContext(), ((PCSNestedRecyclerView) picassoListView.getInnerView()).computeHorizontalScrollOffset()));
                        jSONObject.put(Constants.GestureMoveEvent.KEY_Y, PicassoUtils.px2dp(picassoListView.getContext(), ((PCSNestedRecyclerView) picassoListView.getInnerView()).computeVerticalScrollOffset()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ListViewWrapper.this.callAction(listModel, PicassoAction.ON_END_DRAGGING, jSONObject);
                }
                return false;
            }
        });
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).setOnStopNestedScrollListener(new PCSNestedRecyclerView.OnStopNestedScrollListener() { // from class: com.dianping.picasso.creator.ListViewWrapper.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picasso.view.nest.PCSNestedRecyclerView.OnStopNestedScrollListener
            public void onStopNestedScroll(int i, float f, float f2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2d9379313c0b19691799d1a7afda7848", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2d9379313c0b19691799d1a7afda7848");
                } else if (ListViewWrapper.this.hasAction(listModel, PicassoAction.ON_END_DRAGGING) && i == 0) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(Constants.GestureMoveEvent.KEY_X, -PicassoUtils.px2dp(picassoListView.getContext(), f));
                        jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, -PicassoUtils.px2dp(picassoListView.getContext(), f2));
                        jSONObject.put(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, jSONObject2);
                        jSONObject.put(Constants.GestureMoveEvent.KEY_X, PicassoUtils.px2dp(picassoListView.getContext(), ((PCSNestedRecyclerView) picassoListView.getInnerView()).computeHorizontalScrollOffset()));
                        jSONObject.put(Constants.GestureMoveEvent.KEY_Y, PicassoUtils.px2dp(picassoListView.getContext(), ((PCSNestedRecyclerView) picassoListView.getInnerView()).computeVerticalScrollOffset()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ListViewWrapper.this.callAction(listModel, PicassoAction.ON_END_DRAGGING, jSONObject);
                }
            }
        });
        ((PCSNestedRecyclerView) picassoListView.getInnerView()).addOnChildAttachStateChangeListener(new RecyclerView.h() { // from class: com.dianping.picasso.creator.ListViewWrapper.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.h
            public void onChildViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d7fe1c6ddcd0652bb1a5193b4afe76a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d7fe1c6ddcd0652bb1a5193b4afe76a");
                } else if (ListViewWrapper.this.hasAction(listModel, PicassoAction.ON_ITEM_APPEAR)) {
                    onChildViewAttachedOrDetachedToWindow((RecyclerView) picassoListView.getInnerView(), view, listModel, PicassoAction.ON_ITEM_APPEAR);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.h
            public void onChildViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "14d88d4c72cb9376095705f35b8f22fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "14d88d4c72cb9376095705f35b8f22fb");
                } else if (ListViewWrapper.this.hasAction(listModel, PicassoAction.ON_ITEM_DISAPPEAR)) {
                    onChildViewAttachedOrDetachedToWindow((RecyclerView) picassoListView.getInnerView(), view, listModel, PicassoAction.ON_ITEM_DISAPPEAR);
                }
            }

            private void onChildViewAttachedOrDetachedToWindow(RecyclerView recyclerView, View view, PicassoModel picassoModel, String str) {
                Object[] objArr2 = {recyclerView, view, picassoModel, str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "08146c0b53c36c26481b5b03369c7dc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "08146c0b53c36c26481b5b03369c7dc2");
                } else if (recyclerView == null || recyclerView.getAdapter() == null) {
                } else {
                    PCSListAdapter pCSListAdapter = (PCSListAdapter) recyclerView.getAdapter();
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (pCSListAdapter.checkIsPicassoItem(childAdapterPosition)) {
                        int[] realPosition2IndexPath = pCSListAdapter.realPosition2IndexPath(childAdapterPosition);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("itemIndex", realPosition2IndexPath[0]);
                            jSONObject.put("sectionIndex", realPosition2IndexPath[1]);
                            ListViewWrapper.this.callAction(picassoModel, str, jSONObject);
                        } catch (Exception e) {
                            com.dianping.codelog.b.b(ListViewWrapper.class, e.getMessage());
                        }
                    }
                }
            }
        });
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoModel[] getSubModels(ListModel listModel) {
        Object[] objArr = {listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "767664a529d4cad1649587c41c3aa265", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "767664a529d4cad1649587c41c3aa265");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(listModel.loadingView);
        arrayList.add(listModel.refreshView);
        arrayList.add(listModel.listHeaderView);
        arrayList.add(listModel.listFooterView);
        Collections.addAll(arrayList, listModel.sectionHeaders);
        if (listModel.items != null) {
            Iterator<ArrayList<PicassoModel>> it = listModel.items.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next());
            }
        }
        return (PicassoModel[]) arrayList.toArray(new PicassoModel[arrayList.size()]);
    }
}
