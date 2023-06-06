package com.dianping.picasso.view.list;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.GroupModel;
import com.dianping.picasso.model.ListItemActionConfig;
import com.dianping.picasso.model.ListItemModel;
import com.dianping.picasso.model.ListModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.params.ListViewParams;
import com.dianping.picasso.view.list.PicassoListView;
import com.dianping.picasso.view.list.SlideMenuLayout;
import com.dianping.picasso.view.nest.PCSNestedRecyclerView;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PCSListAdapter extends RecyclerView.a<BasicViewHolder> implements SectionIndexer {
    private static final String TAG = "PCSListAdapter";
    private static final int TYPE_FOOTER = 65531;
    private static final int TYPE_HEADER = 65532;
    private static final int TYPE_LOAD_MORE = 65535;
    private static final int TYPE_NULL_VIEW = 65534;
    private static final int TYPE_OFFSET = 65533;
    private static final int TYPE_STICKY = "PicassoStickyItemReuseId".hashCode();
    public static ChangeQuickRedirect changeQuickRedirect;
    private int footerCount;
    private int headerCount;
    private SparseIntArray indexMaps;
    private ArrayList<String> indexSections;
    private List<Integer> itemOffset;
    private ListModel listModel;
    private SlideMenuLayout menuOpenedItem;
    public RecyclerView.k onScrollListener;
    private g pcsHost;
    private PicassoView pcsView;
    private StickyItemManager stickyItemManager;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface StickyItemManager {
        void bindStickyView(int i);

        boolean hasStickyItem();

        void initStickyItems(PicassoView picassoView);

        void updateStickyModels();

        void updateStickyViews();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.SectionIndexer
    public String[] getSections() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca8e6fa81fa410a8d4afb7d4fc607f8d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca8e6fa81fa410a8d4afb7d4fc607f8d") : (String[]) this.indexSections.toArray(new String[this.indexSections.size()]);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7f5cd73d294b10135876e078d62dfa6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7f5cd73d294b10135876e078d62dfa6")).intValue() : indexPath2Position(new int[]{-1, this.indexMaps.get(i)}) + this.headerCount;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ee371648fa8025d650736dbd6c7ef6f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ee371648fa8025d650736dbd6c7ef6f")).intValue() : realPosition2IndexPath(i)[1];
    }

    private void dealSectionIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f537eba766c17572c383c11a447ede5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f537eba766c17572c383c11a447ede5");
            return;
        }
        this.indexSections.clear();
        this.indexMaps.clear();
        if (this.listModel.indexTitles != null) {
            for (int i = 0; i < this.listModel.indexTitles.length; i++) {
                String str = this.listModel.indexTitles[i];
                if (!TextUtils.isEmpty(str)) {
                    this.indexSections.add(str);
                    this.indexMaps.append(this.indexSections.size() - 1, i);
                }
            }
        }
    }

    public PCSListAdapter(g gVar, PicassoView picassoView, ListModel listModel) {
        Object[] objArr = {gVar, picassoView, listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c1f94a28e20189dd919e75d5a5a9acf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c1f94a28e20189dd919e75d5a5a9acf");
            return;
        }
        this.indexMaps = new SparseIntArray();
        this.indexSections = new ArrayList<>();
        this.headerCount = 0;
        this.footerCount = 0;
        this.itemOffset = new ArrayList();
        this.onScrollListener = new RecyclerView.k() { // from class: com.dianping.picasso.view.list.PCSListAdapter.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "894955c1b3bf3c90cf5a5176ffe291dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "894955c1b3bf3c90cf5a5176ffe291dc");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                RecyclerView recyclerView2 = recyclerView;
                while (!(recyclerView2 instanceof PicassoListView) && recyclerView2 != null) {
                    recyclerView2 = recyclerView2.getParent();
                }
                if (recyclerView2 == null) {
                    return;
                }
                PicassoListView picassoListView = (PicassoListView) recyclerView2;
                picassoListView.getPicassoStickyLayout().onListScroll(i, i2);
                PCSListAdapter.this.updateStickySectionHeader(picassoListView, i2);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab8f591dac798d334e91026e1f34dc32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab8f591dac798d334e91026e1f34dc32");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    PCSListAdapter.this.closeItemMenu();
                }
            }
        };
        updateModel(gVar, picassoView, listModel);
    }

    @UiThread
    public void updateModel(g gVar, PicassoView picassoView, ListModel listModel) {
        Object[] objArr = {gVar, picassoView, listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48b77c83cbc80900873653b95647f087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48b77c83cbc80900873653b95647f087");
            return;
        }
        this.pcsHost = gVar;
        this.listModel = listModel;
        this.pcsView = picassoView;
        handleData();
        dealSectionIndex();
        pushToItemCache(listModel);
        updateItemOffset(listModel);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public BasicViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f0a579902bb10cb28e9bfa9141ce130", RobustBitConfig.DEFAULT_VALUE) ? (BasicViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f0a579902bb10cb28e9bfa9141ce130") : new BasicViewHolder((SlideMenuLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pcs_list_item, (ViewGroup) null));
    }

    private void handleData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eefa93550308f4ae15d378fb14d8145c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eefa93550308f4ae15d378fb14d8145c");
            return;
        }
        this.headerCount = 0;
        this.footerCount = 0;
        if (this.listModel.offset > 0.0f) {
            this.headerCount++;
        }
        if (this.listModel.listHeaderView != null && !this.listModel.listHeaderView.isNull()) {
            this.headerCount++;
        }
        if (this.listModel.listFooterView != null && !this.listModel.listFooterView.isNull()) {
            this.footerCount++;
        }
        if (this.listModel.loadingView != null) {
            this.footerCount++;
        }
    }

    private void updateItemOffset(ListModel listModel) {
        int i;
        Object[] objArr = {listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c59a37291f0c995a55d1b6f6f057bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c59a37291f0c995a55d1b6f6f057bb");
            return;
        }
        this.itemOffset.clear();
        if (getCachedItem().size() == 0) {
            return;
        }
        if (listModel.offset > 0.0f) {
            i = (int) (listModel.offset + 0.0f);
            this.itemOffset.add(Integer.valueOf(i));
        } else {
            i = 0;
        }
        if (listModel.listHeaderView != null) {
            i += listModel.listHeaderView.getViewParams().height;
            this.itemOffset.add(Integer.valueOf(i));
        }
        for (int i2 = 0; i2 < getCachedItem().size(); i2++) {
            this.itemOffset.add(Integer.valueOf(i));
            if (getItemModel(i2) != null) {
                i += getItemModel(i2).getViewParams().height;
            }
        }
    }

    public int getItemOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22be8ca99031c7f7d61359a86e63b0cf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22be8ca99031c7f7d61359a86e63b0cf")).intValue() : this.itemOffset.get(i).intValue();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b834e55f73a92bd313513ed26540042d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b834e55f73a92bd313513ed26540042d")).intValue();
        }
        if (this.headerCount > i) {
            return (this.listModel.offset <= 0.0f || i != 0) ? TYPE_HEADER : TYPE_OFFSET;
        }
        int i2 = i - this.headerCount;
        if (i2 >= getListItemCount()) {
            if (this.listModel.loadingView == null || i2 != getListItemCount()) {
                return TYPE_FOOTER;
            }
            return 65535;
        }
        PicassoModel itemModel = getItemModel(i2);
        if (isStickyItem(itemModel)) {
            return TYPE_STICKY + i2;
        }
        if (itemModel instanceof ListItemModel) {
            ListItemModel listItemModel = (ListItemModel) itemModel;
            if (listItemModel.uniqueId != 0) {
                return listItemModel.uniqueId;
            }
            return listItemModel.reuseId;
        } else if (itemModel == null || itemModel.isNull()) {
            return TYPE_NULL_VIEW;
        } else {
            return 0;
        }
    }

    private PicassoListView.OnLoadMoreListener getOnLoadMoreListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22abc96161ccd54fb6379ce9f271adde", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoListView.OnLoadMoreListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22abc96161ccd54fb6379ce9f271adde");
        }
        View a = this.pcsHost.a(this.listModel.viewId);
        if (a instanceof PicassoListView) {
            return ((PicassoListView) a).getOnLoadMoreListener();
        }
        return null;
    }

    private void clearOnLoadMoreListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c769c28164d01591cbe665c6151c2566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c769c28164d01591cbe665c6151c2566");
            return;
        }
        View a = this.pcsHost.a(this.listModel.viewId);
        if (a instanceof PicassoListView) {
            ((PicassoListView) a).setOnLoadMoreListener(null);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(BasicViewHolder basicViewHolder, int i) {
        RecyclerView.g gVar;
        Object[] objArr = {basicViewHolder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0207885561380c16cab4b7a2bcc9150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0207885561380c16cab4b7a2bcc9150");
            return;
        }
        int itemViewType = getItemViewType(i);
        int i2 = i - this.headerCount;
        if (itemViewType != TYPE_OFFSET) {
            PicassoModel picassoModel = null;
            if (itemViewType == 65535) {
                picassoModel = this.listModel.loadingView;
                PicassoListView.OnLoadMoreListener onLoadMoreListener = getOnLoadMoreListener();
                if (onLoadMoreListener != null) {
                    onLoadMoreListener.onLoadMore();
                    clearOnLoadMoreListener();
                }
            } else if (itemViewType == TYPE_FOOTER) {
                picassoModel = this.listModel.listFooterView;
            } else if (itemViewType == TYPE_HEADER) {
                picassoModel = this.listModel.listHeaderView;
            } else if (itemViewType != TYPE_NULL_VIEW) {
                if (i2 < getListItemCount()) {
                    picassoModel = getItemModel(i2);
                }
            } else {
                basicViewHolder.listItemView.removeAllViews();
            }
            renderItem(basicViewHolder, picassoModel, i);
            if (i2 >= getListItemCount() || this.listModel.itemActionConfigs == null || this.listModel.itemActionConfigs.size() <= 0 || isStickyItem(picassoModel)) {
                basicViewHolder.listItemLayout.setEnableMenu(false);
                basicViewHolder.hideMenuFrom(0);
                return;
            }
            basicViewHolder.listItemLayout.setEnableMenu(true);
            renderItemMenu(basicViewHolder, this.listModel, i2);
            return;
        }
        SlideMenuLayout slideMenuLayout = basicViewHolder.listItemLayout;
        if (slideMenuLayout.getLayoutParams() instanceof RecyclerView.g) {
            gVar = (RecyclerView.g) slideMenuLayout.getLayoutParams();
        } else {
            gVar = new RecyclerView.g(-1, -2);
        }
        gVar.width = -1;
        gVar.height = PicassoUtils.dp2px(PicassoEnvironment.globalContext, this.listModel.offset);
        slideMenuLayout.setLayoutParams(gVar);
    }

    private void renderItem(BasicViewHolder basicViewHolder, PicassoModel picassoModel, final int i) {
        Object[] objArr = {basicViewHolder, picassoModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e76cb8f2efb0c619bf89724c8448d7f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e76cb8f2efb0c619bf89724c8448d7f5");
        } else if (picassoModel == null || picassoModel.isNull() || !(picassoModel instanceof GroupModel)) {
            String str = TAG;
            Log.e(str, "Render NullView in position:" + basicViewHolder.getAdapterPosition());
        } else {
            if (picassoModel.getViewParams().width == 0) {
                picassoModel.getViewParams().width = this.listModel.getViewParams().width;
            }
            picassoModel.hostId = this.listModel.hostId;
            BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
            if (viewWrapperByType != null) {
                if (!(picassoModel instanceof StickyTopInterface) || ((StickyTopInterface) picassoModel).getStickyTop() == null) {
                    viewWrapperByType.refreshView(basicViewHolder.listItemView, picassoModel, this.pcsView);
                } else {
                    viewWrapperByType.updateFrame(basicViewHolder.listItemView, picassoModel);
                    this.pcsView.post(new Runnable() { // from class: com.dianping.picasso.view.list.PCSListAdapter.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3276d768ceec7bfd1f49df8502a8243a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3276d768ceec7bfd1f49df8502a8243a");
                            } else if (PCSListAdapter.this.stickyItemManager != null) {
                                PCSListAdapter.this.stickyItemManager.bindStickyView(i);
                            }
                        }
                    });
                }
            }
            if (picassoModel.hidden) {
                basicViewHolder.listItemLayout.setVisibility(8);
                return;
            }
            basicViewHolder.listItemLayout.setVisibility(0);
            basicViewHolder.listItemLayout.setLayoutParams(new RecyclerView.g(basicViewHolder.listItemView.getLayoutParams()));
        }
    }

    private void renderItemMenu(BasicViewHolder basicViewHolder, ListModel listModel, int i) {
        Object[] objArr = {basicViewHolder, listModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c88c0ffe58002015bfe91b654a803ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c88c0ffe58002015bfe91b654a803ed7");
            return;
        }
        basicViewHolder.listItemLayout.resetScroll();
        int[] position2IndexPath = position2IndexPath(i);
        ArrayList<ListItemActionConfig> arrayList = null;
        ArrayList<ArrayList<ListItemActionConfig>> arrayList2 = listModel.itemActionConfigs.get(position2IndexPath[1]);
        if (arrayList2 != null && arrayList2.size() > 0 && position2IndexPath[0] >= 0) {
            arrayList = arrayList2.get(position2IndexPath[0]);
        }
        basicViewHolder.bindItemActions(arrayList, position2IndexPath[0], position2IndexPath[1]);
    }

    public int getListItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d14a9037b98cd09ddefa0469fa0f6903", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d14a9037b98cd09ddefa0469fa0f6903")).intValue() : ((ListViewParams) this.listModel.getViewParams()).itemCount;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a311741103facebe4de18c03e3debba", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a311741103facebe4de18c03e3debba")).intValue() : getListItemCount() + this.headerCount + this.footerCount;
    }

    public int[] position2IndexPath(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1210c33ec04c8630a86b0c34ede94b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1210c33ec04c8630a86b0c34ede94b2");
        }
        int sectionItemCount = getSectionItemCount(0);
        int i2 = 0;
        while (i >= sectionItemCount && i2 < this.listModel.sectionItemCounts.length - 1) {
            i2++;
            sectionItemCount += getSectionItemCount(i2);
        }
        return (this.listModel.sectionItemCounts == null || this.listModel.sectionItemCounts.length <= 0) ? new int[]{i - sectionItemCount, i2} : new int[]{(i + this.listModel.sectionItemCounts[i2]) - sectionItemCount, i2};
    }

    public int[] realPosition2IndexPath(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "928d5230ecaba34758dee2ba9930feb3", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "928d5230ecaba34758dee2ba9930feb3") : position2IndexPath(i - this.headerCount);
    }

    public boolean checkIsPicassoItem(int i) {
        PicassoModel itemModel;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e71d53e682f2420a3c50c4dbd857d944", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e71d53e682f2420a3c50c4dbd857d944")).booleanValue() : this.headerCount <= i && i - this.headerCount < getListItemCount() && (itemModel = getItemModel(i - this.headerCount)) != null && !itemModel.isNull() && (itemModel instanceof ListItemModel);
    }

    private int getSectionItemCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a3c4b0fd454961928a9eff4241921bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a3c4b0fd454961928a9eff4241921bb")).intValue();
        }
        if (i >= this.listModel.sectionItemCounts.length || i < 0) {
            return 0;
        }
        return this.listModel.sectionItemCounts[i] + (sectionHeaderExist(i) ? 1 : 0);
    }

    private boolean sectionHeaderExist(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6aa9e24e50aaf5ee9ea4fecb50ea654", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6aa9e24e50aaf5ee9ea4fecb50ea654")).booleanValue() : (this.listModel.sectionHeaders == null || this.listModel.sectionHeaders.length <= i || this.listModel.sectionHeaders[i].isNull()) ? false : true;
    }

    private int indexPath2Position(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aaba14e8ea873d294ca0399fde02593", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aaba14e8ea873d294ca0399fde02593")).intValue() : indexPath2Position(iArr[1], iArr[0]);
    }

    public int indexPath2Position(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b3cc005d7f9c8c9caa9a584bf198225", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b3cc005d7f9c8c9caa9a584bf198225")).intValue();
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += getSectionItemCount(i4);
        }
        return i3 + (sectionHeaderExist(i) ? 1 : 0) + i2;
    }

    public int indexPath2RealPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "799b5d91d3bf99f8918444c56aa1da66", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "799b5d91d3bf99f8918444c56aa1da66")).intValue() : indexPath2Position(i, i2) + this.headerCount;
    }

    private PicassoModel getItemModel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1835315918de0f1ff8214980aad17a7", RobustBitConfig.DEFAULT_VALUE) ? (PicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1835315918de0f1ff8214980aad17a7") : getCachedItem().get(i);
    }

    private void pushToItemCache(ListModel listModel) {
        Object[] objArr = {listModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e4f6e8df75aed10768782c6df7fad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e4f6e8df75aed10768782c6df7fad8");
            return;
        }
        if (listModel.sectionHeaders != null) {
            for (int i = 0; i < listModel.sectionHeaders.length; i++) {
                getCachedItem().put(indexPath2Position(i, -1), listModel.sectionHeaders[i]);
            }
        }
        if (listModel.items != null) {
            for (int i2 = 0; i2 < listModel.items.size(); i2++) {
                ArrayList<PicassoModel> arrayList = listModel.items.get(i2);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    getCachedItem().put(indexPath2Position(i2, i3), arrayList.get(i3));
                }
            }
        }
    }

    public int getDistanceFromTwoPos(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "221179465b38a699832e5b2eebcd5b34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "221179465b38a699832e5b2eebcd5b34")).intValue();
        }
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        while (i < i2) {
            PicassoModel itemModel = getItemModel(i);
            if (itemModel != null) {
                i3 += itemModel.getViewParams().height;
            }
            i++;
        }
        return i3;
    }

    @NonNull
    private SparseArray<PicassoModel> getCachedItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b083ee864c56969cd61580703358678f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b083ee864c56969cd61580703358678f");
        }
        View a = this.pcsHost.a(this.listModel.viewId);
        if (a == null || !(a instanceof PicassoListView)) {
            return new SparseArray<>();
        }
        return ((PicassoListView) a).getCachedItems();
    }

    public void updateItemPModel(int i, int i2, @NonNull PicassoModel picassoModel) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ee8d53f8806d8e26c0df1eec3adc550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ee8d53f8806d8e26c0df1eec3adc550");
            return;
        }
        getCachedItem().put(indexPath2Position(i, i2), picassoModel);
        updateItemOffset(this.listModel);
        if (this.stickyItemManager != null) {
            this.stickyItemManager.updateStickyModels();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class BasicViewHolder extends RecyclerView.s {
        public static ChangeQuickRedirect changeQuickRedirect;
        private SlideMenuLayout listItemLayout;
        private FrameLayout listItemView;
        private List<View> menus;

        public BasicViewHolder(SlideMenuLayout slideMenuLayout) {
            super(slideMenuLayout);
            Object[] objArr = {PCSListAdapter.this, slideMenuLayout};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b993c3ac00b32f896a3ff729f3e4b18c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b993c3ac00b32f896a3ff729f3e4b18c");
                return;
            }
            this.menus = new ArrayList();
            this.listItemLayout = slideMenuLayout;
            this.listItemView = (FrameLayout) slideMenuLayout.findViewById(R.id.list_item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bindItemActions(final List<ListItemActionConfig> list, final int i, final int i2) {
            Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "669f757d7140ec1e3b8125f3b40b41b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "669f757d7140ec1e3b8125f3b40b41b0");
            } else if (list == null || list.size() == 0) {
                hideMenuFrom(0);
            } else {
                if (list.size() > this.menus.size()) {
                    createMenus(list.size() - this.menus.size());
                }
                for (int i3 = 0; i3 < list.size(); i3++) {
                    View view = this.menus.get((list.size() - 1) - i3);
                    bindItemAction(view, list.get(i3));
                    final int i4 = i3;
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picasso.view.list.PCSListAdapter.BasicViewHolder.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            Object[] objArr2 = {view2};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffbb4dfacac0655244a6fa8f72778bf7", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffbb4dfacac0655244a6fa8f72778bf7");
                                return;
                            }
                            ListItemActionConfig listItemActionConfig = (ListItemActionConfig) list.get(i4);
                            if (listItemActionConfig != null && listItemActionConfig.shouldCollapse) {
                                BasicViewHolder.this.listItemLayout.close(200);
                            }
                            PCSListAdapter.this.pcsHost.a(PCSListAdapter.this.listModel.viewId, "onItemAction", new JSONBuilder().put("itemIndex", Integer.valueOf(i)).put("sectionIndex", Integer.valueOf(i2)).put("actionIndex", Integer.valueOf(i4)).toJSONObject());
                        }
                    });
                }
                this.listItemLayout.setSlideMenuListener(new SlideMenuLayout.SlideMenuListener() { // from class: com.dianping.picasso.view.list.PCSListAdapter.BasicViewHolder.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.picasso.view.list.SlideMenuLayout.SlideMenuListener
                    public void onOpenChanged(SlideMenuLayout slideMenuLayout, boolean z) {
                        Object[] objArr2 = {slideMenuLayout, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91e4dfc5d6ce60826587f12ea174bbf6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91e4dfc5d6ce60826587f12ea174bbf6");
                        } else if (z) {
                            PCSListAdapter.this.pcsHost.a(PCSListAdapter.this.listModel.viewId, "willBeginEditing", new JSONBuilder().put("row", Integer.valueOf(i)).put("section", Integer.valueOf(i2)).toJSONObject());
                            PCSListAdapter.this.menuOpenedItem = slideMenuLayout;
                        } else {
                            PCSListAdapter.this.pcsHost.a(PCSListAdapter.this.listModel.viewId, "didEndEditing", new JSONBuilder().put("row", Integer.valueOf(i)).put("section", Integer.valueOf(i2)).toJSONObject());
                            PCSListAdapter.this.menuOpenedItem = null;
                        }
                    }

                    @Override // com.dianping.picasso.view.list.SlideMenuLayout.SlideMenuListener
                    public void onStateChanged(SlideMenuLayout slideMenuLayout, int i5) {
                        Object[] objArr2 = {slideMenuLayout, Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2bf868ab19e8185462eb224a9eec83b3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2bf868ab19e8185462eb224a9eec83b3");
                        } else if (i5 == 0 || PCSListAdapter.this.menuOpenedItem == slideMenuLayout) {
                        } else {
                            PCSListAdapter.this.closeItemMenu();
                        }
                    }
                });
                hideMenuFrom(list.size());
            }
        }

        private void bindItemAction(View view, ListItemActionConfig listItemActionConfig) {
            Object[] objArr = {view, listItemActionConfig};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "911d11e82aaaa373f6ac797c80061a8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "911d11e82aaaa373f6ac797c80061a8c");
                return;
            }
            view.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.menu_icon);
            TextView textView = (TextView) view.findViewById(R.id.menu_title);
            view.setBackgroundColor(Color.parseColor(TextUtils.isEmpty(listItemActionConfig.color) ? "#C8C7CD" : listItemActionConfig.color));
            int resourcesId = !TextUtils.isEmpty(listItemActionConfig.image) ? PicassoUtils.getResourcesId(PicassoEnvironment.globalContext, listItemActionConfig.image) : 0;
            imageView.setVisibility(resourcesId == 0 ? 8 : 0);
            imageView.setImageResource(resourcesId);
            textView.setVisibility(TextUtils.isEmpty(listItemActionConfig.title) ? 8 : 0);
            textView.setText(listItemActionConfig.title);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hideMenuFrom(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1799d7eebdc24774f96b60bfce222e55", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1799d7eebdc24774f96b60bfce222e55");
            } else if (i < 0) {
            } else {
                while (i < this.menus.size()) {
                    this.menus.get(i).setVisibility(8);
                    i++;
                }
            }
        }

        private void createMenus(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dab9de2550260fd577ddb17f2921065", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dab9de2550260fd577ddb17f2921065");
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                View inflate = LayoutInflater.from(this.listItemLayout.getContext()).inflate(R.layout.pcs_item_menu, (ViewGroup) null);
                this.menus.add(inflate);
                this.listItemLayout.addView(inflate, new ViewGroup.LayoutParams(PicassoUtils.dp2px(this.listItemLayout.getContext(), 70.0f), -1));
            }
        }
    }

    public void bindScrollListener(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a3ad20be861904f1b3610bc1ddcf71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a3ad20be861904f1b3610bc1ddcf71c");
            return;
        }
        recyclerView.removeOnScrollListener(this.onScrollListener);
        recyclerView.addOnScrollListener(this.onScrollListener);
    }

    public void closeItemMenu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "415b3b4ef2fe74fbd8f6c3bf8bd914b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "415b3b4ef2fe74fbd8f6c3bf8bd914b6");
        } else if (this.menuOpenedItem != null) {
            this.menuOpenedItem.close();
            this.menuOpenedItem = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStickySectionHeader(PicassoListView picassoListView, int i) {
        Object[] objArr = {picassoListView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "962378ba56a1a9f2d8c38525c195fc1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "962378ba56a1a9f2d8c38525c195fc1f");
        } else if (this.listModel.sectionHeaders == null || this.listModel.sectionHeaders.length == 0) {
        } else {
            FrameLayout stickyLayout = picassoListView.getStickyLayout();
            if (stickyLayout.getVisibility() != 0) {
                return;
            }
            Integer valueOf = Integer.valueOf(getSectionForPosition(((LinearLayoutManager) ((PCSNestedRecyclerView) picassoListView.getInnerView()).getLayoutManager()).findFirstVisibleItemPosition()));
            if (stickyLayout.getTag(R.id.id_picasso_index) != null && stickyLayout.getTag(R.id.id_picasso_index).equals(valueOf)) {
                if (valueOf.intValue() < this.listModel.sectionItemCounts.length - 1) {
                    View findViewByPosition = ((PCSNestedRecyclerView) picassoListView.getInnerView()).getLayoutManager().findViewByPosition(indexPath2RealPosition(valueOf.intValue() + 1, -1));
                    if (findViewByPosition != null && findViewByPosition.getTop() >= 0 && findViewByPosition.getTop() <= stickyLayout.getHeight()) {
                        ((FrameLayout.LayoutParams) stickyLayout.getLayoutParams()).topMargin = findViewByPosition.getTop() - stickyLayout.getMeasuredHeight();
                    } else {
                        ((FrameLayout.LayoutParams) stickyLayout.getLayoutParams()).topMargin = 0;
                    }
                    stickyLayout.setLayoutParams(stickyLayout.getLayoutParams());
                }
            } else if (this.listModel.sectionHeaders == null || this.listModel.sectionHeaders.length <= valueOf.intValue()) {
            } else {
                PicassoModel picassoModel = this.listModel.sectionHeaders[valueOf.intValue()];
                if (picassoModel == null || picassoModel.isNull() || !(picassoModel instanceof GroupModel)) {
                    String str = TAG;
                    Log.e(str, "Render NullView for stickyView section:" + valueOf);
                    return;
                }
                if (picassoModel.getViewParams().width == 0) {
                    picassoModel.getViewParams().width = this.listModel.getViewParams().width;
                }
                picassoModel.hostId = this.listModel.hostId;
                BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
                if (viewWrapperByType != null) {
                    viewWrapperByType.refreshView(stickyLayout, picassoModel, this.pcsView);
                    stickyLayout.setTag(R.id.id_picasso_index, valueOf);
                }
                ((FrameLayout.LayoutParams) stickyLayout.getLayoutParams()).topMargin = i < 0 ? -picassoModel.getViewParams().height : 0;
            }
        }
    }

    @UiThread
    public void updateStickLayout(final PicassoListView picassoListView) {
        Object[] objArr = {picassoListView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ff2b494c425911988c871e24fded5d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ff2b494c425911988c871e24fded5d6");
        } else if (picassoListView == null || this.listModel.sectionHeaders == null || this.listModel.sectionHeaders.length == 0) {
        } else {
            final FrameLayout stickyLayout = picassoListView.getStickyLayout();
            stickyLayout.setVisibility(this.listModel.stickySectionHeader ? 0 : 8);
            if (stickyLayout.getVisibility() != 0) {
                return;
            }
            picassoListView.post(new Runnable() { // from class: com.dianping.picasso.view.list.PCSListAdapter.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3a1d92382a3378b6075bc09062cddbca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3a1d92382a3378b6075bc09062cddbca");
                        return;
                    }
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) ((PCSNestedRecyclerView) picassoListView.getInnerView()).getLayoutManager()).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition == -1) {
                        return;
                    }
                    Integer valueOf = Integer.valueOf(PCSListAdapter.this.getSectionForPosition(findFirstVisibleItemPosition));
                    if (PCSListAdapter.this.listModel.sectionHeaders.length <= valueOf.intValue()) {
                        return;
                    }
                    PicassoModel picassoModel = PCSListAdapter.this.listModel.sectionHeaders[valueOf.intValue()];
                    if (picassoModel == null || picassoModel.isNull() || !(picassoModel instanceof GroupModel)) {
                        String str = PCSListAdapter.TAG;
                        Log.e(str, "Render NullView for stickyView section:" + valueOf);
                        return;
                    }
                    if (picassoModel.getViewParams().width == 0) {
                        picassoModel.getViewParams().width = PCSListAdapter.this.listModel.getViewParams().width;
                    }
                    picassoModel.hostId = PCSListAdapter.this.listModel.hostId;
                    BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
                    if (viewWrapperByType != null) {
                        viewWrapperByType.refreshView(stickyLayout, picassoModel, PCSListAdapter.this.pcsView);
                        stickyLayout.setClickable(true);
                    }
                }
            });
        }
    }

    public void updateStickyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "213b30e0a558de7f1f02e954d2178d14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "213b30e0a558de7f1f02e954d2178d14");
        } else if (this.stickyItemManager != null) {
            this.stickyItemManager.updateStickyViews();
        }
    }

    public ListModel getListModel() {
        return this.listModel;
    }

    public int getHeaderCount() {
        return this.headerCount;
    }

    public boolean hasStickyItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc5e0dae1f953c1b24e372d595534897", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc5e0dae1f953c1b24e372d595534897")).booleanValue();
        }
        if (this.stickyItemManager == null) {
            return false;
        }
        return this.stickyItemManager.hasStickyItem();
    }

    public void initStickyItemManager(StickyItemManager stickyItemManager) {
        Object[] objArr = {stickyItemManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a16c1d3c1db1df9795817e2b539a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a16c1d3c1db1df9795817e2b539a0f");
            return;
        }
        this.stickyItemManager = stickyItemManager;
        this.stickyItemManager.initStickyItems(this.pcsView);
    }

    private boolean isStickyItem(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3f59a0099d2ace354d81b2553445ef9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3f59a0099d2ace354d81b2553445ef9")).booleanValue() : (picassoModel instanceof StickyTopInterface) && ((StickyTopInterface) picassoModel).getStickyTop() != null;
    }
}
