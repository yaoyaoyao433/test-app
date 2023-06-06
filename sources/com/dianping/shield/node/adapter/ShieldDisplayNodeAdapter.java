package com.dianping.shield.node.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.agentsdk.sectionrecycler.a;
import com.dianping.agentsdk.sectionrecycler.divider.b;
import com.dianping.agentsdk.sectionrecycler.divider.c;
import com.dianping.shield.adapter.MergeAdapterTypeRefreshListener;
import com.dianping.shield.bridge.feature.HoverPosControlObserver;
import com.dianping.shield.debug.PerformanceManager;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSection;
import com.dianping.shield.feature.HotZoneItemStatusInterface;
import com.dianping.shield.feature.HotZoneStatusInterface;
import com.dianping.shield.layoutcontrol.IHoverLayout;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMetricsMonitorUtil;
import com.dianping.shield.node.StaggeredGridThemePackage;
import com.dianping.shield.node.adapter.AttachStatusManager;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.ElementContainerCommonInterface;
import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.adapter.status.ICollectionWithExposeElement;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.CardConfigInfo;
import com.dianping.shield.node.cellnode.DividerConfigInfo;
import com.dianping.shield.node.cellnode.ReuseInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.cellnode.ViewAttachDetachInterface;
import com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.prefetch.AttachStatusWithPrefetchManager;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration;
import com.dianping.shield.utils.IndexMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShieldDisplayNodeAdapter extends RecyclerView.a<DNViewHolder> implements e, b, ListObserver, ElementContainerCommonInterface, IScreenVisibleExposeEdge, ShieldPreloadInterface, StaggeredGridSpaceDecoration.GapProvider {
    private static final boolean DEBUG = ShieldEnvironment.INSTANCE.isDebug();
    protected static final int DEFAULT_REUSE_POOL_SIZE = 15;
    public static final String FILE_NAME = "MergeSharedPerferance";
    public static final String NEED_BOUNDS_KEY = "NeedBounds";
    public static final String NEED_PERFORMANCE_KEY = "NeedPerformance";
    public static ChangeQuickRedirect changeQuickRedirect;
    private AttachStatusCollection attachStatusCollection;
    private Context context;
    private boolean disableDecoration;
    private HashMap<String, ICollectionWithExposeElement<ShieldDisplayNode>> extraVisibleNodeExposeInterfaceMap;
    private FloatViewManager floatViewManager;
    private VerticalAttachStatusManager fullScreenAttachManager;
    private IScreenVisibleExposeEdge globalScreenVisibleEdgeProxy;
    private a groupBorderDecoration;
    private a.InterfaceC0052a groupInfoProvider;
    private HashMap<HotZoneItemStatusInterface, HotZoneItemManager> hotZoneItemStatusInterfaceHashMap;
    private HashMap<HotZoneStatusInterface, HotZoneAgentManager> hotZoneStatusInterfaceHashMap;
    private IHoverLayout hoverLayoutControl;
    protected boolean isOnBind;
    private c mHorDividerDecoration;
    private IndexMap<Object> nodeIdIndex;
    private NodeList nodeList;
    private IndexMap<Object> nodeTypeIndex;
    protected View.OnLayoutChangeListener onLayoutChangeListener;
    private RecyclerView.k onScrollListener;
    private String pageName;
    private PerformanceManager performanceManager;
    private AttachStatusWithPrefetchManager<ShieldDisplayNode> prefetchManager;
    private SparseArray<ShieldDisplayNode> preloadNodeArray;
    private ProcessorHolder processorHolder;
    private RecyclerView recyclerView;
    private StaggeredGridSpaceDecoration staggeredGridSpaceDecoration;
    private StaggeredGridThemePackage staggeredGridThemePackage;
    private TopBottomLocationManager topBottomLocationManager;
    private HashMap<String, ReuseInfo> typeDisplayNodeMap;
    private MergeAdapterTypeRefreshListener typeRefreshListener;

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public boolean hasBottomDividerVerticalOffset(int i) {
        return false;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public boolean hasTopDividerVerticalOffset(int i) {
        return false;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public ShieldDisplayNodeAdapter(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6da85d901d4a82953570d7cb5211dfea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6da85d901d4a82953570d7cb5211dfea");
            return;
        }
        this.isOnBind = false;
        this.nodeTypeIndex = new IndexMap<>();
        this.typeDisplayNodeMap = new HashMap<>();
        this.nodeIdIndex = new IndexMap<>();
        this.preloadNodeArray = new SparseArray<>();
        this.onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2081ab583f8ba2f975d6d63ce85beae3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2081ab583f8ba2f975d6d63ce85beae3");
                } else {
                    ShieldDisplayNodeAdapter.this.updateStatus(ShieldDisplayNodeAdapter.this.recyclerView, ScrollDirection.STATIC);
                }
            }
        };
        this.hotZoneStatusInterfaceHashMap = new HashMap<>();
        this.hotZoneItemStatusInterfaceHashMap = new HashMap<>();
        this.disableDecoration = false;
        this.onScrollListener = new RecyclerView.k() { // from class: com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcfa44556f5b4143ab08ae9991c782c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcfa44556f5b4143ab08ae9991c782c6");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    ShieldDisplayNodeAdapter.this.updateStatus(recyclerView, ScrollDirection.STATIC);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74d52fa3a2c15829e1decd8259f1806c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74d52fa3a2c15829e1decd8259f1806c");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                ShieldDisplayNodeAdapter.this.updateStatus(recyclerView, ShieldDisplayNodeAdapter.this.getScrollDirection(i2));
            }
        };
        this.context = context;
        this.mHorDividerDecoration = new c(this);
        this.attachStatusCollection = new AttachStatusCollection();
        this.extraVisibleNodeExposeInterfaceMap = new HashMap<>();
        this.prefetchManager = new AttachStatusWithPrefetchManager<>(new FullScreenLocationRect(this));
        this.prefetchManager.setExtraPrefetchCount(10);
        this.prefetchManager.addTargetDispatcher(new ElementStatusEventListener<ShieldDisplayNode>() { // from class: com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.adapter.status.ElementStatusEventListener
            public void onElementStatusChanged(@NotNull AppearanceDispatchData<ShieldDisplayNode> appearanceDispatchData) {
                Object[] objArr2 = {appearanceDispatchData};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d852c8e572d9db76b04778664177d9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d852c8e572d9db76b04778664177d9d");
                } else {
                    appearanceDispatchData.element.onPrefetchStatusChanged(appearanceDispatchData.newStatus, appearanceDispatchData.scrollDirection);
                }
            }
        });
        this.attachStatusCollection.addAttStatusManager(this.prefetchManager);
        this.fullScreenAttachManager = new VerticalAttachStatusManager(new FullScreenLocationRect(this));
        this.fullScreenAttachManager.setScreenVisibleExposeEdge(this);
        this.attachStatusCollection.addAttStatusManager(this.fullScreenAttachManager);
        this.topBottomLocationManager = new TopBottomLocationManager(new FullScreenLocationRect(this));
        this.attachStatusCollection.addAttStatusManager(this.topBottomLocationManager);
        this.floatViewManager = new FloatViewManager(context);
        this.attachStatusCollection.setElementContainerCommonFeature(this);
    }

    public void setLayoutParamCalFinishCallback(LayoutParamCalAndContentYCallback layoutParamCalAndContentYCallback) {
        Object[] objArr = {layoutParamCalAndContentYCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90416e910978e0fb13575595280798e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90416e910978e0fb13575595280798e0");
        } else {
            this.floatViewManager.setLayoutParamCalAndContentYCallback(layoutParamCalAndContentYCallback);
        }
    }

    @Override // com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge
    public void onShieldExtraVisibleNodeChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dffaac871e6e2b2906c39b389500f3d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dffaac871e6e2b2906c39b389500f3d3");
        } else {
            callExtraVisibleNodeExpose();
        }
    }

    private void callExtraVisibleNodeExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49178e0e905afaef287107bde4a93e03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49178e0e905afaef287107bde4a93e03");
        } else if (this.extraVisibleNodeExposeInterfaceMap != null) {
            SparseArray sparseArray = new SparseArray();
            for (Map.Entry<String, ICollectionWithExposeElement<ShieldDisplayNode>> entry : this.extraVisibleNodeExposeInterfaceMap.entrySet()) {
                List<Pair<ShieldDisplayNode, ViewExtraInfo>> currentElementAndViewExtraInfoList = entry.getValue().getCurrentElementAndViewExtraInfoList();
                for (int i = 0; i < currentElementAndViewExtraInfoList.size(); i++) {
                    sparseArray.put(i, currentElementAndViewExtraInfoList.get(i));
                }
            }
            this.fullScreenAttachManager.setExtraVisibleElementList(sparseArray);
            this.fullScreenAttachManager.onViewLocationChanged(ScrollDirection.STATIC);
        }
    }

    public static boolean needOffset(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18b39e6edfcd923ab1ece726e9ba85b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18b39e6edfcd923ab1ece726e9ba85b4")).booleanValue() : (recyclerView instanceof ShieldRecyclerViewInterface) || !(recyclerView == null || recyclerView.getAdapter() == null || !"HeaderViewRecyclerAdapter".equals(recyclerView.getAdapter().getClass().getSimpleName()));
    }

    public static int getOffset(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a3c43057fce53c397bf85b6e76e4447", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a3c43057fce53c397bf85b6e76e4447")).intValue();
        }
        if (recyclerView instanceof ShieldRecyclerViewInterface) {
            return ((ShieldRecyclerViewInterface) recyclerView).getHeaderCount();
        }
        return 1;
    }

    public void dispatchDestoryAgentStatus(ArrayList<ShieldViewCell> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a4357894e0a9346a7090593afce25a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a4357894e0a9346a7090593afce25a6");
        } else {
            this.fullScreenAttachManager.dispatchDestoryAgentStatus(arrayList);
        }
    }

    public void changeUpdateStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27baf8d931b6024ee8170450dd6da9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27baf8d931b6024ee8170450dd6da9e");
        } else {
            this.fullScreenAttachManager.setNeedUpdateStatus(z);
        }
    }

    public void addHotZoneLocationManager(HotZoneStatusInterface hotZoneStatusInterface, String str, boolean z, boolean z2) {
        Object[] objArr = {hotZoneStatusInterface, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90ea64e0f41e650335d92a10dd9c8911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90ea64e0f41e650335d92a10dd9c8911");
            return;
        }
        HotZoneAgentManager hotZoneAgentManager = new HotZoneAgentManager(new HotZoneLocationRect(hotZoneStatusInterface, z, this));
        hotZoneAgentManager.setHotZoneStatusInterface(hotZoneStatusInterface, str);
        hotZoneAgentManager.setReverseRange(z);
        hotZoneAgentManager.setOnlyObserverInHotZone(z2);
        hotZoneAgentManager.setNodeList(this.nodeList);
        this.hotZoneStatusInterfaceHashMap.put(hotZoneStatusInterface, hotZoneAgentManager);
        this.attachStatusCollection.addAttStatusManager(hotZoneAgentManager);
    }

    public void removeHotZoneLocationManager(HotZoneStatusInterface hotZoneStatusInterface) {
        Object[] objArr = {hotZoneStatusInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "888dd622df4f9be7979d79fe667a27db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "888dd622df4f9be7979d79fe667a27db");
            return;
        }
        this.attachStatusCollection.removeAttStatusManager(this.hotZoneStatusInterfaceHashMap.get(hotZoneStatusInterface));
        this.hotZoneStatusInterfaceHashMap.remove(hotZoneStatusInterface);
    }

    public HashMap<HotZoneStatusInterface, HotZoneAgentManager> getHotZoneStatusInterfaceHashMap() {
        return this.hotZoneStatusInterfaceHashMap;
    }

    public HashMap<HotZoneItemStatusInterface, HotZoneItemManager> getHotZoneItemStatusInterfaceHashMap() {
        return this.hotZoneItemStatusInterfaceHashMap;
    }

    public void addHotZoneItemLocationManager(HotZoneItemStatusInterface hotZoneItemStatusInterface, boolean z, boolean z2) {
        Object[] objArr = {hotZoneItemStatusInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fadd28e057e1881adb461afd2a467800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fadd28e057e1881adb461afd2a467800");
            return;
        }
        HotZoneItemManager hotZoneItemManager = new HotZoneItemManager(new HotZoneItemLocationRect(hotZoneItemStatusInterface, z, this));
        hotZoneItemManager.setHotZoneItemStatusInterface(hotZoneItemStatusInterface);
        hotZoneItemManager.setReverseRange(z);
        hotZoneItemManager.setOnlyObserverInHotZone(z2);
        hotZoneItemManager.setNodeList(this.nodeList);
        this.hotZoneItemStatusInterfaceHashMap.put(hotZoneItemStatusInterface, hotZoneItemManager);
        this.attachStatusCollection.addAttStatusManager(hotZoneItemManager);
    }

    public void removeHotZoneItemLocationManager(HotZoneItemStatusInterface hotZoneItemStatusInterface) {
        Object[] objArr = {hotZoneItemStatusInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a20309363837ed953d551b0f9664c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a20309363837ed953d551b0f9664c8a");
            return;
        }
        this.attachStatusCollection.removeAttStatusManager(this.hotZoneItemStatusInterfaceHashMap.get(hotZoneItemStatusInterface));
        this.hotZoneItemStatusInterfaceHashMap.remove(hotZoneItemStatusInterface);
    }

    public void setTypeRefreshListener(MergeAdapterTypeRefreshListener mergeAdapterTypeRefreshListener) {
        this.typeRefreshListener = mergeAdapterTypeRefreshListener;
    }

    public void setDisableDecoration(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14bb2826ffa4c191291b6cf57e7fff73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14bb2826ffa4c191291b6cf57e7fff73");
            return;
        }
        this.disableDecoration = z;
        if (this.recyclerView == null || this.mHorDividerDecoration == null || !z) {
            return;
        }
        this.recyclerView.removeItemDecoration(this.mHorDividerDecoration);
    }

    public void storeCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d938d780cd6784afd0c31bbfb3d76d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d938d780cd6784afd0c31bbfb3d76d1");
        } else {
            this.fullScreenAttachManager.storeCurrentInfo();
        }
    }

    public void setNeedLoadStore(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5f9e92f4563622972d25572b468d9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5f9e92f4563622972d25572b468d9f7");
        } else {
            this.fullScreenAttachManager.setNeedLoadStore(z);
        }
    }

    public HoverPosControlObserver getHoverPosControlObserver() {
        return this.topBottomLocationManager;
    }

    public void clearStoredInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c30203ad4ebd92809e9e36ac628fdeb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c30203ad4ebd92809e9e36ac628fdeb3");
        } else {
            this.fullScreenAttachManager.clearStoredPositionInfo();
        }
    }

    public void loadCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32aaa3558bd640f5518cb87bf4028631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32aaa3558bd640f5518cb87bf4028631");
        } else {
            this.fullScreenAttachManager.loadCurrentInfo();
        }
    }

    public void clearCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce59c21df62a56402ce35ad7760a1463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce59c21df62a56402ce35ad7760a1463");
        } else {
            this.fullScreenAttachManager.clearCurrentInfo();
        }
    }

    public void clearAttachStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "512acd2de81b644dfdb861bb05e891b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "512acd2de81b644dfdb861bb05e891b1");
        } else {
            this.fullScreenAttachManager.clear();
        }
    }

    public void forceUpdateAttachStatus(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4213d7424208ea4825a361d2a625f116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4213d7424208ea4825a361d2a625f116");
            return;
        }
        setCalculateAppearDisappearAction(AttachStatusManager.Action.ACT_RESUME);
        this.fullScreenAttachManager.onViewLocationChanged(scrollDirection);
    }

    public void updateStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0050e97725a12c8d412e5ffae3e2af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0050e97725a12c8d412e5ffae3e2af0");
        } else {
            updateStatus(ScrollDirection.STATIC);
        }
    }

    public void updateStatus(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb2bc1f5a2ace8d616213bc2011412c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb2bc1f5a2ace8d616213bc2011412c");
        } else {
            updateStatus(this.recyclerView, scrollDirection);
        }
    }

    public StaggeredGridSpaceDecoration getStaggeredGridSpaceDecoration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da6dc974c81aff67d044a9d89b94b572", RobustBitConfig.DEFAULT_VALUE)) {
            return (StaggeredGridSpaceDecoration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da6dc974c81aff67d044a9d89b94b572");
        }
        if (this.staggeredGridSpaceDecoration == null) {
            this.staggeredGridSpaceDecoration = new StaggeredGridSpaceDecoration();
        }
        return this.staggeredGridSpaceDecoration;
    }

    public void setStaggeredGridThemePackage(StaggeredGridThemePackage staggeredGridThemePackage) {
        Object[] objArr = {staggeredGridThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "463247e4dc39b87b0d77204cd4bce8fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "463247e4dc39b87b0d77204cd4bce8fb");
            return;
        }
        this.staggeredGridThemePackage = staggeredGridThemePackage;
        if (this.staggeredGridSpaceDecoration != null) {
            this.staggeredGridSpaceDecoration.setStaggeredGridThemePackage(staggeredGridThemePackage);
        }
    }

    public void setCalculateAppearDisappearAction(AttachStatusManager.Action action) {
        Object[] objArr = {action};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "634f0fe32c7393f28fd5dd3a0d0adebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "634f0fe32c7393f28fd5dd3a0d0adebe");
        } else {
            this.fullScreenAttachManager.setAction(action);
        }
    }

    public AttachStatusManager.State getAppearDisappearState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b09ef6f094bea04aaf490c0c1cdf497", RobustBitConfig.DEFAULT_VALUE) ? (AttachStatusManager.State) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b09ef6f094bea04aaf490c0c1cdf497") : this.fullScreenAttachManager.getCurrentState();
    }

    public void setGroupInfoProvider(a.InterfaceC0052a interfaceC0052a) {
        this.groupInfoProvider = interfaceC0052a;
    }

    public void setProcessorHolder(ProcessorHolder processorHolder) {
        this.processorHolder = processorHolder;
    }

    public int getMaxTopViewY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6126b9c21e542fc86cdc02e90b1e8d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6126b9c21e542fc86cdc02e90b1e8d1")).intValue() : this.topBottomLocationManager.getCurrentHoverInfo().maxTopViewY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public ScrollDirection getScrollDirection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47ac3d079e3a6b7ebac7deec272197c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollDirection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47ac3d079e3a6b7ebac7deec272197c5");
        }
        ScrollDirection scrollDirection = ScrollDirection.STATIC;
        if (i > 0) {
            return ScrollDirection.UP;
        }
        return i < 0 ? ScrollDirection.DOWN : scrollDirection;
    }

    public void updateStatus(RecyclerView recyclerView, ScrollDirection scrollDirection) {
        Object[] objArr = {recyclerView, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f14f95eea16ec89eb9f0915c7fa07203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f14f95eea16ec89eb9f0915c7fa07203");
            return;
        }
        int i = needOffset(recyclerView) ? -getOffset(recyclerView) : 0;
        if (recyclerView == null) {
            return;
        }
        this.attachStatusCollection.updateFistLastPositionInfo(i, HotZoneLocation.ScrollOrientation.VERTICAL, scrollDirection);
    }

    public void setHoverLayoutControl(@NonNull IHoverLayout iHoverLayout) {
        Object[] objArr = {iHoverLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddd59e0111024f2cfae54ab2b714d29c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddd59e0111024f2cfae54ab2b714d29c");
            return;
        }
        iHoverLayout.setGlobalExtraNodeExposeInterface(this);
        this.hoverLayoutControl = iHoverLayout;
        this.extraVisibleNodeExposeInterfaceMap.put("HoverLayout", iHoverLayout);
        this.topBottomLocationManager.setHoverLayoutControl(iHoverLayout);
        this.floatViewManager.setHoverLayoutControl(iHoverLayout);
    }

    public void setHoverList(SparseArray<ShieldDisplayNode> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68ae6d7a5f957ef8ebb6ab3169b67ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68ae6d7a5f957ef8ebb6ab3169b67ec9");
        } else {
            this.topBottomLocationManager.setHoverList(sparseArray);
        }
    }

    public void setNodeList(NodeList nodeList) {
        Object[] objArr = {nodeList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c815689e2db6a8fed444b3883d46ab5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c815689e2db6a8fed444b3883d46ab5d");
            return;
        }
        this.nodeList = nodeList;
        this.nodeList.registerObserver(this);
        this.fullScreenAttachManager.setElementList(nodeList);
        this.prefetchManager.setElementList(nodeList);
        notifyNodeChanged();
    }

    public void setFloatList(@NonNull HashSet<ShieldFloatViewDisplayNode> hashSet) {
        Object[] objArr = {hashSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "762dd9c853c7a8c23010da2d18826c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "762dd9c853c7a8c23010da2d18826c72");
        } else {
            this.floatViewManager.setFloatData(hashSet);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public DNViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ReuseInfo reuseInfo;
        ViewPaintingCallback<?> viewPaintingCallback;
        ShieldMetricsData data;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "999b833f24c4cc23177b392aa1120a94", RobustBitConfig.DEFAULT_VALUE)) {
            return (DNViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "999b833f24c4cc23177b392aa1120a94");
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        Object value = this.nodeTypeIndex.getValue(i);
        if (value instanceof String) {
            reuseInfo = this.typeDisplayNodeMap.get((String) value);
            viewPaintingCallback = (reuseInfo == null || reuseInfo.viewPaintingCallback == null) ? null : reuseInfo.viewPaintingCallback;
        } else if (value instanceof ReuseInfo) {
            reuseInfo = (ReuseInfo) value;
            viewPaintingCallback = reuseInfo.viewPaintingCallback;
        } else {
            reuseInfo = null;
            viewPaintingCallback = null;
        }
        if (viewPaintingCallback != null) {
            if (this.performanceManager != null) {
                AgentInterface agentInterface = reuseInfo.rowParent.sectionParent.cellParent.owner;
                String canonicalName = agentInterface.getClass().getCanonicalName();
                String hostName = agentInterface.getHostName();
                String str = reuseInfo.rowParent.sectionParent.cellParent.name;
                StringBuilder sb = new StringBuilder();
                sb.append(agentInterface.hashCode());
                String sb2 = sb.toString();
                Date date = new Date();
                DNViewHolder onCreateViewHolder = onCreateViewHolder(viewGroup, viewPaintingCallback, reuseInfo);
                this.performanceManager.insertPerformanceRecord(this.pageName, hostName, canonicalName, sb2, str, "createViewHolder", date.getTime(), new Date().getTime());
                return onCreateViewHolder;
            }
            DNViewHolder onCreateViewHolder2 = onCreateViewHolder(viewGroup, viewPaintingCallback, reuseInfo);
            long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
            if (this.pageName != null && (data = ShieldMetricsMonitorUtil.INSTANCE.getData(this.pageName)) != null) {
                data.plusValues("Shield_CreateViewHolder", Arrays.asList(Float.valueOf(((float) (currentThreadTimeMillis2 - currentThreadTimeMillis)) * 1.0f)));
            }
            return onCreateViewHolder2;
        }
        return new DNViewHolder(null);
    }

    private DNViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, @NonNull ViewPaintingCallback viewPaintingCallback, @NonNull ReuseInfo reuseInfo) {
        Object[] objArr = {viewGroup, viewPaintingCallback, reuseInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a7e0a215dcd429b724628d0a38ad24c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DNViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a7e0a215dcd429b724628d0a38ad24c");
        }
        ShieldViewHolder shieldViewHolderByReuseInfo = this.topBottomLocationManager.getShieldViewHolderByReuseInfo(reuseInfo);
        DisplayNodeContainer displayNodeContainer = new DisplayNodeContainer(this.context);
        if (shieldViewHolderByReuseInfo == null) {
            shieldViewHolderByReuseInfo = viewPaintingCallback.createViewHolder(reuseInfo == null ? null : reuseInfo.context, viewGroup, reuseInfo.viewType);
            if (shieldViewHolderByReuseInfo.itemView.getParent() instanceof ViewGroup) {
                ((ViewGroup) shieldViewHolderByReuseInfo.itemView.getParent()).removeView(shieldViewHolderByReuseInfo.itemView);
            }
        }
        displayNodeContainer.setViewHolder(shieldViewHolderByReuseInfo);
        StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(-1, -2);
        bVar.b = true;
        displayNodeContainer.setLayoutParams(bVar);
        return new DNViewHolder(displayNodeContainer);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(@NonNull DNViewHolder dNViewHolder, int i) {
        ShieldMetricsData data;
        Object[] objArr = {dNViewHolder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33abceecb2dad969ab90ca9c49f48596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33abceecb2dad969ab90ca9c49f48596");
            return;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (this.performanceManager != null) {
            AgentInterface agentInterface = displayNode.rowParent.sectionParent.cellParent.owner;
            String canonicalName = agentInterface.getClass().getCanonicalName();
            String hostName = agentInterface.getHostName();
            String str = displayNode.rowParent.sectionParent.cellParent.name;
            StringBuilder sb = new StringBuilder();
            sb.append(agentInterface.hashCode());
            String sb2 = sb.toString();
            Date date = new Date();
            onBindViewHolder(dNViewHolder, i, displayNode);
            this.performanceManager.insertPerformanceRecord(this.pageName, hostName, canonicalName, sb2, str, "createViewHolder", date.getTime(), new Date().getTime());
        } else {
            onBindViewHolder(dNViewHolder, i, displayNode);
        }
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        if (this.pageName == null || (data = ShieldMetricsMonitorUtil.INSTANCE.getData(this.pageName)) == null) {
            return;
        }
        data.plusValues("Shield_BindViewHolder", Arrays.asList(Float.valueOf(((float) (currentThreadTimeMillis2 - currentThreadTimeMillis)) * 1.0f)));
    }

    private void onBindViewHolder(@NonNull DNViewHolder dNViewHolder, int i, @NonNull ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {dNViewHolder, Integer.valueOf(i), shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb629fb97f7334a19677522018fe25fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb629fb97f7334a19677522018fe25fb");
            return;
        }
        this.isOnBind = true;
        if (dNViewHolder.itemView instanceof DisplayNodeContainer) {
            DisplayNodeContainer displayNodeContainer = (DisplayNodeContainer) dNViewHolder.itemView;
            ShieldDisplayNode node = displayNodeContainer.getNode();
            if (node != null) {
                node.containerView = null;
            }
            displayNodeContainer.setNode(shieldDisplayNode);
            shieldDisplayNode.containerView = displayNodeContainer;
            shieldDisplayNode.viewHolder = displayNodeContainer.getViewHolder();
            if (node != null && node.isUnique()) {
                node.containerView = displayNodeContainer;
            }
            shieldDisplayNode.updateNodeView();
            dNViewHolder.displayNode = shieldDisplayNode;
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) shieldDisplayNode.containerView.getLayoutParams();
            if (shieldDisplayNode.rowParent != null && (shieldDisplayNode.rowParent.sectionParent instanceof StaggeredGridSection) && shieldDisplayNode.getPath() != null && (shieldDisplayNode.getPath().cellType == CellType.NORMAL || shieldDisplayNode.getPath().cellType == CellType.LOADING_MORE)) {
                bVar.b = false;
            } else {
                bVar.b = true;
            }
            shieldDisplayNode.containerView.setLayoutParams(bVar);
        } else {
            shieldDisplayNode.containerView = null;
            shieldDisplayNode.viewHolder = null;
        }
        this.isOnBind = false;
    }

    public boolean isOnBind() {
        return this.isOnBind;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7831df624ee8dbe429eb53072388f8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7831df624ee8dbe429eb53072388f8b")).intValue();
        }
        if (this.nodeList != null) {
            return this.nodeList.size();
        }
        return 0;
    }

    public ShieldDisplayNode getDisplayNode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb7fce6bdd6d73a9ce7e78b2421cb364", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb7fce6bdd6d73a9ce7e78b2421cb364");
        }
        if (i < 0 || i >= this.nodeList.size()) {
            return null;
        }
        return this.nodeList.getDisplayElement(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e36f8b232e3d31ffb70fa21694331c62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e36f8b232e3d31ffb70fa21694331c62")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode != null) {
            String viewTypeWithTopInfo = displayNode.getViewTypeWithTopInfo();
            ReuseInfo reuseInfo = displayNode.getReuseInfo();
            if (viewTypeWithTopInfo != null) {
                if (!this.nodeTypeIndex.containsValue(viewTypeWithTopInfo)) {
                    this.nodeTypeIndex.putValue((IndexMap<Object>) viewTypeWithTopInfo);
                    this.recyclerView.getRecycledViewPool().a(this.nodeTypeIndex.getIndex(viewTypeWithTopInfo), 15);
                }
                if (!this.typeDisplayNodeMap.containsValue(reuseInfo)) {
                    this.typeDisplayNodeMap.put(viewTypeWithTopInfo, reuseInfo);
                }
                return this.nodeTypeIndex.getIndex(viewTypeWithTopInfo);
            }
            if (!this.nodeTypeIndex.containsValue(reuseInfo)) {
                this.nodeTypeIndex.putValue((IndexMap<Object>) reuseInfo);
            }
            return this.nodeTypeIndex.getIndex(reuseInfo);
        }
        return -1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewRecycled(DNViewHolder dNViewHolder) {
        Object[] objArr = {dNViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c646c3855e24946e617fcefd15447e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c646c3855e24946e617fcefd15447e6");
            return;
        }
        StringBuilder sb = new StringBuilder("onViewRecycled: ");
        sb.append(dNViewHolder);
        sb.append("\n node: ");
        sb.append(dNViewHolder.displayNode);
        if (dNViewHolder.displayNode != null && !dNViewHolder.displayNode.isUnique()) {
            dNViewHolder.displayNode.onNodeRecycled();
            dNViewHolder.displayNode.containerView = null;
            dNViewHolder.displayNode.viewHolder = null;
            dNViewHolder.displayNode = null;
        }
        super.onViewRecycled((ShieldDisplayNodeAdapter) dNViewHolder);
    }

    public int getGlobalType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2adb9b10bc914148e362db169874cf22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2adb9b10bc914148e362db169874cf22")).intValue();
        }
        if (!this.nodeTypeIndex.containsValue(str)) {
            this.nodeTypeIndex.putValue((IndexMap<Object>) str);
        }
        return this.nodeTypeIndex.getIndex(str);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aa4ac5773379229b6280a78f4d5b366", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aa4ac5773379229b6280a78f4d5b366")).longValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.stableid == null) {
            return -1L;
        }
        if (this.nodeIdIndex.containsValue(displayNode.stableid)) {
            return this.nodeIdIndex.getIndex(displayNode.stableid);
        }
        this.nodeIdIndex.putValue((IndexMap<Object>) displayNode.stableid);
        return this.nodeIdIndex.getIndex(displayNode.stableid);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewAttachedToWindow(@NonNull DNViewHolder dNViewHolder) {
        Object[] objArr = {dNViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68124abcdb1f028476c34c45996a5d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68124abcdb1f028476c34c45996a5d41");
            return;
        }
        super.onViewAttachedToWindow((ShieldDisplayNodeAdapter) dNViewHolder);
        ShieldDisplayNode shieldDisplayNode = dNViewHolder.displayNode;
        if (shieldDisplayNode == null || shieldDisplayNode.attachDetachInterfaceArrayList == null || shieldDisplayNode.attachDetachInterfaceArrayList.isEmpty()) {
            return;
        }
        Iterator<ViewAttachDetachInterface> it = shieldDisplayNode.attachDetachInterfaceArrayList.iterator();
        while (it.hasNext()) {
            it.next().onViewAttachedToWindow(shieldDisplayNode.viewHolder, dNViewHolder.getAdapterPosition(), shieldDisplayNode);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewDetachedFromWindow(@NonNull DNViewHolder dNViewHolder) {
        Object[] objArr = {dNViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfee392013efe713558ae0f477cf2607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfee392013efe713558ae0f477cf2607");
            return;
        }
        super.onViewDetachedFromWindow((ShieldDisplayNodeAdapter) dNViewHolder);
        ShieldDisplayNode shieldDisplayNode = dNViewHolder.displayNode;
        if (shieldDisplayNode == null || shieldDisplayNode.attachDetachInterfaceArrayList == null || shieldDisplayNode.attachDetachInterfaceArrayList.isEmpty()) {
            return;
        }
        Iterator<ViewAttachDetachInterface> it = shieldDisplayNode.attachDetachInterfaceArrayList.iterator();
        while (it.hasNext()) {
            it.next().onViewDetachedFromWindow(shieldDisplayNode.viewHolder, dNViewHolder.getAdapterPosition(), shieldDisplayNode);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76741a5f4f385b8d63a508b0cec0f4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76741a5f4f385b8d63a508b0cec0f4ff");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
        this.recyclerView.addOnScrollListener(this.onScrollListener);
        this.recyclerView.addOnLayoutChangeListener(this.onLayoutChangeListener);
        if (recyclerView != null && !this.disableDecoration) {
            recyclerView.addItemDecoration(this.mHorDividerDecoration);
        }
        this.topBottomLocationManager.setRecyclerView(recyclerView);
        if (recyclerView != null && needBounds()) {
            this.groupBorderDecoration = new a(this.groupInfoProvider);
            recyclerView.addItemDecoration(this.groupBorderDecoration);
        }
        if (needPerformance()) {
            this.performanceManager = new PerformanceManager(this.context);
        }
        setStaggerDecoration();
    }

    public void setStaggerDecoration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee2f58f6924cdd109ecff3be328ab21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee2f58f6924cdd109ecff3be328ab21c");
        } else if (this.recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            if (this.staggeredGridSpaceDecoration == null) {
                this.staggeredGridSpaceDecoration = new StaggeredGridSpaceDecoration();
                this.staggeredGridSpaceDecoration.setGapProvider(this);
                this.staggeredGridSpaceDecoration.setStaggeredGridThemePackage(this.staggeredGridThemePackage);
            }
            this.recyclerView.addItemDecoration(this.staggeredGridSpaceDecoration);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbe32ed947577b254e2143f408eb44d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbe32ed947577b254e2143f408eb44d5");
            return;
        }
        this.floatViewManager.destory();
        this.topBottomLocationManager.setRecyclerView(null);
        if (recyclerView != null && this.mHorDividerDecoration != null && !this.disableDecoration) {
            recyclerView.removeItemDecoration(this.mHorDividerDecoration);
        }
        if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            recyclerView.removeItemDecoration(this.staggeredGridSpaceDecoration);
        }
        if (recyclerView != null && this.groupBorderDecoration != null) {
            recyclerView.removeItemDecoration(this.groupBorderDecoration);
        }
        this.recyclerView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        this.recyclerView.removeOnScrollListener(this.onScrollListener);
        this.recyclerView = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean needBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ba5a98383635f94dc1d9c50dd18805", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ba5a98383635f94dc1d9c50dd18805")).booleanValue();
        }
        if (ShieldEnvironment.INSTANCE.getNeedBounds() == null) {
            ShieldEnvironment.INSTANCE.setNeedBounds(Boolean.valueOf(ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(this.context.getApplicationContext(), "MergeSharedPerferance").getBoolean("NeedBounds", false)));
        }
        return ShieldEnvironment.INSTANCE.getNeedBounds().booleanValue();
    }

    public boolean needPerformance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "671313382c8e9d6ed5f03e5f1adcea58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "671313382c8e9d6ed5f03e5f1adcea58")).booleanValue();
        }
        if (ShieldEnvironment.INSTANCE.getNeedPerformance() == null) {
            ShieldEnvironment.INSTANCE.setNeedPerformance(Boolean.valueOf(ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(this.context.getApplicationContext(), "MergeSharedPerferance").getBoolean("NeedPerformance", false)));
        }
        return ShieldEnvironment.INSTANCE.getNeedPerformance().booleanValue();
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public DividerConfigInfo getDividerInfo(ShieldDisplayNode shieldDisplayNode) {
        if (shieldDisplayNode != null) {
            return shieldDisplayNode.dividerInfo;
        }
        return null;
    }

    public CardConfigInfo getCardInfo(ShieldDisplayNode shieldDisplayNode) {
        if (shieldDisplayNode != null) {
            return shieldDisplayNode.cardInfo;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public float getHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92f0248e43389255d7c88ee8dfb05a7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92f0248e43389255d7c88ee8dfb05a7f")).floatValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        DividerConfigInfo dividerInfo = getDividerInfo(displayNode);
        int i2 = dividerInfo != null ? dividerInfo.headerGapHeight : 0;
        if (displayNode != null && displayNode.rowParent != null) {
            ShieldSection shieldSection = displayNode.rowParent.sectionParent;
            if ((shieldSection instanceof StaggeredGridSection) && !shieldSection.hasHeaderCell) {
                if (displayNode.isStaggeredGridFirstRow && this.processorHolder != null && this.processorHolder.getDividerThemePackage().needAddFirstHeader) {
                    int i3 = this.processorHolder.getDividerThemePackage().firstHeaderExtraHeight + i2;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    return aq.a(this.context, i3);
                }
                return 0.0f;
            }
        }
        if (i == 0 && this.processorHolder != null) {
            if (this.processorHolder.getDividerThemePackage().needAddFirstHeader) {
                int i4 = this.processorHolder.getDividerThemePackage().firstHeaderExtraHeight + i2;
                if (i4 < 0) {
                    i4 = 0;
                }
                return aq.a(this.context, i4);
            }
            return 0.0f;
        }
        return aq.a(this.context, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getHeaderDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6660f6ace4be724c7e2c14ab72d6c699", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6660f6ace4be724c7e2c14ab72d6c699");
        }
        DividerConfigInfo dividerInfo = getDividerInfo(getDisplayNode(i));
        if (dividerInfo != null) {
            return dividerInfo.headerGapDrawable;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public float getFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb62d24a45a4aff55aaee3cf7cd2434e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb62d24a45a4aff55aaee3cf7cd2434e")).floatValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        DividerConfigInfo dividerInfo = getDividerInfo(displayNode);
        int i2 = dividerInfo != null ? dividerInfo.footerGapHeight : 0;
        if (displayNode != null && displayNode.rowParent != null) {
            ShieldSection shieldSection = displayNode.rowParent.sectionParent;
            if ((shieldSection instanceof StaggeredGridSection) && !shieldSection.hasFooterCell) {
                if (displayNode.isStaggeredGridLastRow && this.processorHolder != null && this.processorHolder.getDividerThemePackage().needAddLastFooter) {
                    int i3 = this.processorHolder.getDividerThemePackage().lastFooterExtraHeight + i2;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    return aq.a(this.context, i3);
                }
                return 0.0f;
            }
        }
        if (i == this.nodeList.size() - 1 && this.processorHolder != null) {
            if (this.processorHolder.getDividerThemePackage().needAddLastFooter) {
                int i4 = this.processorHolder.getDividerThemePackage().lastFooterExtraHeight + i2;
                if (i4 < 0) {
                    i4 = 0;
                }
                return aq.a(this.context, i4);
            }
            return 0.0f;
        }
        return aq.a(this.context, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getFooterDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26e0a47026414af314f0956d52f0bb4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26e0a47026414af314f0956d52f0bb4d");
        }
        DividerConfigInfo dividerInfo = getDividerInfo(getDisplayNode(i));
        if (dividerInfo != null) {
            return dividerInfo.footerGapDrawable;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getTopDivider(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a91f93a39d2d4ead435008f5dd82f98e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a91f93a39d2d4ead435008f5dd82f98e");
        }
        DividerConfigInfo dividerInfo = getDividerInfo(getDisplayNode(i));
        if (dividerInfo != null) {
            return dividerInfo.cellTopLineDrawable;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getBottomDivider(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbca956bb1de0adf16e2d5ab2a708a06", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbca956bb1de0adf16e2d5ab2a708a06");
        }
        DividerConfigInfo dividerInfo = getDividerInfo(getDisplayNode(i));
        if (dividerInfo != null) {
            return dividerInfo.cellBottomLineDrawable;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Rect topDividerOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea7f24f22a16bc2ba3e9db3f7e4b8020", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea7f24f22a16bc2ba3e9db3f7e4b8020");
        }
        DividerConfigInfo dividerInfo = getDividerInfo(getDisplayNode(i));
        if (dividerInfo != null) {
            return dividerInfo.cellTopLineOffset;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Rect bottomDividerOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edf28218f8f0b662a988fb5ad125a676", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edf28218f8f0b662a988fb5ad125a676");
        }
        DividerConfigInfo dividerInfo = getDividerInfo(getDisplayNode(i));
        if (dividerInfo != null) {
            return dividerInfo.cellBottomLineOffset;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public ShieldDisplayNode getNode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cad3d6c45d5a1161b365c61076b9720e", RobustBitConfig.DEFAULT_VALUE) ? (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cad3d6c45d5a1161b365c61076b9720e") : getDisplayNode(i);
    }

    public boolean getNeedDrawCard(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23253073e54d3579f1aecea73f4f5791", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23253073e54d3579f1aecea73f4f5791")).booleanValue();
        }
        CardConfigInfo cardInfo = getCardInfo(getDisplayNode(i));
        if (cardInfo != null) {
            return cardInfo.needDrawCard;
        }
        return false;
    }

    public void onNodeChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bfbf883e0bc93a26a71d06e14bb46b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bfbf883e0bc93a26a71d06e14bb46b8");
        } else {
            invalidateStaggeredDecorations();
        }
    }

    public void notifyNodeChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51ab2ac6ae15131301b635f97c17b4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51ab2ac6ae15131301b635f97c17b4fe");
            return;
        }
        if (this.typeRefreshListener != null) {
            this.typeRefreshListener.onMergedTypeRefresh();
        }
        notifyDataSetChanged();
        onNodeChanged();
    }

    public void notifyNodeRangeChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e8bba515453ce6e082f0a381489c40c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e8bba515453ce6e082f0a381489c40c");
            return;
        }
        if (this.typeRefreshListener != null) {
            this.typeRefreshListener.onMergedTypeRefresh();
        }
        notifyItemRangeChanged(i, i2);
        onNodeChanged();
    }

    public void notifyNodeRangeInserted(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98cd1845d3cef9ea8bb13132a6a97c5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98cd1845d3cef9ea8bb13132a6a97c5e");
            return;
        }
        if (this.typeRefreshListener != null) {
            this.typeRefreshListener.onMergedTypeRefresh();
        }
        notifyItemRangeInserted(i, i2);
        onNodeChanged();
    }

    public void notifyNodeRangeRemoved(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93c2bcd10b6f911ecc929b5e478e7547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93c2bcd10b6f911ecc929b5e478e7547");
            return;
        }
        if (this.typeRefreshListener != null) {
            this.typeRefreshListener.onMergedTypeRefresh();
        }
        notifyItemRangeRemoved(i, i2);
        onNodeChanged();
    }

    public void notifyNodeMoved(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bd4617f1ae18cb0f7846de2eac3032c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bd4617f1ae18cb0f7846de2eac3032c");
            return;
        }
        if (this.typeRefreshListener != null) {
            this.typeRefreshListener.onMergedTypeRefresh();
        }
        notifyItemMoved(i, i2);
        onNodeChanged();
    }

    @Override // com.dianping.shield.node.adapter.ListObserver
    public void onChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0341b10ca1978bcbedba2aafae1041b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0341b10ca1978bcbedba2aafae1041b3");
        } else if (assertInBindOrLayout()) {
        } else {
            notifyNodeChanged();
        }
    }

    @Override // com.dianping.shield.node.adapter.ListObserver
    public void onItemRangeChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d162b98d5a33768bc1d8deb3f9fd25b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d162b98d5a33768bc1d8deb3f9fd25b2");
        } else if (assertInBindOrLayout()) {
        } else {
            notifyNodeRangeChanged(i, i2);
        }
    }

    @Override // com.dianping.shield.node.adapter.ListObserver
    public void onItemRangeInserted(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aabaedb7b3da0dc931a04019be92d7b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aabaedb7b3da0dc931a04019be92d7b5");
        } else if (assertInBindOrLayout()) {
        } else {
            notifyNodeRangeInserted(i, i2);
        }
    }

    @Override // com.dianping.shield.node.adapter.ListObserver
    public void onItemRangeRemoved(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8585b906049226291e1db0a16747dd6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8585b906049226291e1db0a16747dd6b");
        } else if (assertInBindOrLayout()) {
        } else {
            notifyNodeRangeRemoved(i, i2);
        }
    }

    @Override // com.dianping.shield.node.adapter.ListObserver
    public void onItemRangeMoved(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28ee9d8b1a16f099811b90cacd59b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28ee9d8b1a16f099811b90cacd59b20");
        } else if (assertInBindOrLayout()) {
        } else {
            notifyNodeMoved(i, i2);
        }
    }

    public boolean assertInBindOrLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e03c30bc713021dd7829f4f9152f4b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e03c30bc713021dd7829f4f9152f4b2f")).booleanValue();
        }
        if (this.isOnBind) {
            return true;
        }
        return this.recyclerView != null && this.recyclerView.isComputingLayout();
    }

    @Override // com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration.GapProvider
    public int getXGap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c59a45678b0b50dc408f0da13bbe7a0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c59a45678b0b50dc408f0da13bbe7a0e")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.staggeredGridXGap == null) {
            return 0;
        }
        return displayNode.staggeredGridXGap.intValue();
    }

    @Override // com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration.GapProvider
    public int getYGap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71837c7e5ebf45c3b4d637b8ab1ea5bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71837c7e5ebf45c3b4d637b8ab1ea5bd")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.staggeredGridYGap == null) {
            return 0;
        }
        return displayNode.staggeredGridYGap.intValue();
    }

    @Override // com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration.GapProvider
    public int getLeftMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac1f56616659fe2a209c6fa33cecadcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac1f56616659fe2a209c6fa33cecadcc")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.staggeredGridLeftMargin == null) {
            return 0;
        }
        return displayNode.staggeredGridLeftMargin.intValue();
    }

    @Override // com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration.GapProvider
    public int getRightMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f63b9f89622dfa0b4beb5de3945874e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f63b9f89622dfa0b4beb5de3945874e")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.staggeredGridRightMargin == null) {
            return 0;
        }
        return displayNode.staggeredGridRightMargin.intValue();
    }

    @Override // com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration.GapProvider
    public int getTopMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e93252bbc2fa4a5e5eea7ab964f0b92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e93252bbc2fa4a5e5eea7ab964f0b92")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.staggeredGridTopMargin == null) {
            return 0;
        }
        return displayNode.staggeredGridTopMargin.intValue();
    }

    @Override // com.dianping.shield.sectionrecycler.itemdecoration.StaggeredGridSpaceDecoration.GapProvider
    public int getBottomMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bfe71ad42bf2367368328c6916e491f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bfe71ad42bf2367368328c6916e491f")).intValue();
        }
        ShieldDisplayNode displayNode = getDisplayNode(i);
        if (displayNode == null || displayNode.staggeredGridBottomMargin == null) {
            return 0;
        }
        return displayNode.staggeredGridBottomMargin.intValue();
    }

    private void invalidateStaggeredDecorations() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56e975eaab0ebd5f676f2b342463f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56e975eaab0ebd5f676f2b342463f6f");
        } else if (this.recyclerView == null || this.recyclerView.getLayoutManager() == null || !(this.recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
        } else {
            this.recyclerView.invalidateItemDecorations();
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "853ce00e0b47b13f3e680738f35b4570", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "853ce00e0b47b13f3e680738f35b4570")).intValue();
        }
        if (this.topBottomLocationManager != null) {
            return this.topBottomLocationManager.getAutoOffset();
        }
        return 0;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5111d15932b46b37e0f7308e675b7b12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5111d15932b46b37e0f7308e675b7b12");
        } else if (this.topBottomLocationManager != null) {
            this.topBottomLocationManager.setAutoOffset(i);
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getContainerSpanCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e2a6f7b3ef97be84d6a9529c110187", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e2a6f7b3ef97be84d6a9529c110187")).intValue();
        }
        if (this.recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            }
            return 1;
        }
        return 1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e3ce0086218a7e35dc99700ec4a75cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e3ce0086218a7e35dc99700ec4a75cf")).intValue();
        }
        if (this.recyclerView == null) {
            return 0;
        }
        return this.recyclerView.getChildCount();
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public View getElementChildView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3461ef7fb8b63b40e539b610a8306cd2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3461ef7fb8b63b40e539b610a8306cd2") : this.recyclerView == null ? new View(this.context) : this.recyclerView.getChildAt(i);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildLayoutPosition(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7a91a457fb71ceeb2b2d5498ab1f265", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7a91a457fb71ceeb2b2d5498ab1f265")).intValue();
        }
        if (this.recyclerView == null) {
            return 0;
        }
        return this.recyclerView.getChildLayoutPosition(view);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public Rect getContainerEdgeRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "032359d9b565fc1327da75cf84d9afb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "032359d9b565fc1327da75cf84d9afb1");
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        if (this.recyclerView != null) {
            this.recyclerView.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = iArr[0] + this.recyclerView.getWidth();
            rect.bottom = iArr[1] + this.recyclerView.getHeight();
        }
        return rect;
    }

    @Override // com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge
    @NotNull
    public ArrayList<Rect> getScreenInvisibleEdge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84b087fa46ebb9b8d909743640095c45", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84b087fa46ebb9b8d909743640095c45");
        }
        if (this.globalScreenVisibleEdgeProxy != null) {
            return this.globalScreenVisibleEdgeProxy.getScreenInvisibleEdge();
        }
        ArrayList<Rect> arrayList = new ArrayList<>();
        if (this.hoverLayoutControl != null) {
            for (View view : this.hoverLayoutControl.getCurrentHoverView()) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                arrayList.add(new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight()));
            }
        }
        return arrayList;
    }

    @Override // com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge
    @NotNull
    public Rect getScreenVisibleEdge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3557b8017c286373725e03963dbf8a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3557b8017c286373725e03963dbf8a8");
        }
        if (this.globalScreenVisibleEdgeProxy != null) {
            return this.globalScreenVisibleEdgeProxy.getScreenVisibleEdge();
        }
        return getContainerEdgeRect();
    }

    public void setGlobalScreenVisibleEdgeProxy(@Nullable IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        this.globalScreenVisibleEdgeProxy = iScreenVisibleExposeEdge;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18ecc87b0473473d0fee6c65b291e080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18ecc87b0473473d0fee6c65b291e080");
            return;
        }
        this.isOnBind = false;
        this.disableDecoration = false;
        this.nodeList = null;
        this.processorHolder = null;
        this.pageName = null;
        this.performanceManager = null;
        this.groupInfoProvider = null;
        this.typeRefreshListener = null;
        this.globalScreenVisibleEdgeProxy = null;
        if (this.hoverLayoutControl != null) {
            this.hoverLayoutControl.setGlobalExtraNodeExposeInterface(null);
            this.hoverLayoutControl = null;
        }
        this.nodeTypeIndex.clear();
        this.typeDisplayNodeMap.clear();
        this.nodeIdIndex.clear();
        this.preloadNodeArray.clear();
        this.hotZoneStatusInterfaceHashMap.clear();
        this.hotZoneItemStatusInterfaceHashMap.clear();
        if (this.extraVisibleNodeExposeInterfaceMap != null) {
            this.extraVisibleNodeExposeInterfaceMap.clear();
        }
        if (this.mHorDividerDecoration != null) {
            this.mHorDividerDecoration.shieldRecycle();
        } else {
            this.mHorDividerDecoration = new c(this);
        }
        if (this.staggeredGridSpaceDecoration != null) {
            this.staggeredGridSpaceDecoration.shieldRecycle();
            this.staggeredGridSpaceDecoration = null;
        }
        this.attachStatusCollection.shieldRecycle();
        this.prefetchManager.shieldRecycle();
        this.fullScreenAttachManager.shieldRecycle();
        this.floatViewManager.shieldRecycle();
        this.topBottomLocationManager.shieldRecycle();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class DNViewHolder extends RecyclerView.s {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer dataHash;
        public ShieldDisplayNode displayNode;

        public DNViewHolder(View view) {
            super(view);
        }
    }
}
