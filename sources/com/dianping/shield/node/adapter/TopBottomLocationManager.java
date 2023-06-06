package com.dianping.shield.node.adapter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.bridge.feature.HoverPosControlObserver;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.layoutcontrol.IHoverLayout;
import com.dianping.shield.layoutcontrol.ZLayoutChildInfo;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.cellnode.ReuseInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.HoveredViewsInfo;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TopBottomLocationManager extends ViewLocationChangeProcessor<ShieldDisplayNode> implements e, HoverPosControlObserver, IHoverLayout.OnChildHeightChangeListener {
    private static final int BOTTOM_LINE = 1;
    protected static final boolean DEBUG = ShieldEnvironment.INSTANCE.isDebug();
    private static final int MAX_VALUE = 1073741823;
    private static final int MIN_VALUE = -1073741824;
    private static final int TOP_LINE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int actualBottom;
    public int actualTop;
    private SparseArray<ShieldDisplayNode> backupNodeArray;
    private int bottomHoverTranslateY;
    public HashSet<ShieldDisplayNode> dirtyNodesSet;
    public HoverNodes hoverNodes;
    private IHoverLayout layoutControl;
    protected Handler mHandler;
    private boolean needUpdateNodeList;
    private boolean nodesHandling;
    protected int offsetHeaderPosition;
    protected RecyclerView recyclerView;
    private int topHoverTranslateY;
    protected int topOffset;

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public TopBottomLocationManager(ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a1edc141daa70f1a571500ef5467339", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a1edc141daa70f1a571500ef5467339");
            return;
        }
        this.mHandler = new Handler(Looper.getMainLooper());
        this.hoverNodes = new TopHoverNodes();
        this.hoverNodes.setNext(new BottomHoverNodes());
        this.backupNodeArray = new SparseArray<>();
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "571976819f019363b050efd9d424d037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "571976819f019363b050efd9d424d037");
            return;
        }
        this.recyclerView = recyclerView;
        if (this.recyclerView != null) {
            this.recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.dianping.shield.node.adapter.TopBottomLocationManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79d7ae3dce0b9dc3d5a3786f70e75402", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79d7ae3dce0b9dc3d5a3786f70e75402");
                    } else {
                        TopBottomLocationManager.this.mHandler.removeCallbacksAndMessages(null);
                    }
                }
            });
        }
    }

    public void clearHovers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "559659efc60870833f51368eb6dee8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "559659efc60870833f51368eb6dee8b0");
        } else {
            this.hoverNodes.clear();
        }
    }

    private void setDirtyNodes(SparseArray<ShieldDisplayNode> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99294e70ca53ede7d0ee73c6de1e71d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99294e70ca53ede7d0ee73c6de1e71d6");
        } else if (sparseArray != null && sparseArray.size() > 0) {
            if (this.dirtyNodesSet == null) {
                this.dirtyNodesSet = new HashSet<>();
            } else {
                this.dirtyNodesSet.clear();
            }
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                ShieldDisplayNode valueAt = sparseArray.valueAt(i);
                if (valueAt != null && (valueAt.innerTopInfo != null || valueAt.innerBottomInfo != null)) {
                    this.dirtyNodesSet.add(valueAt);
                }
            }
        }
    }

    private void clearDirtyNodes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90fd9e571bdb4eeef22b8f0f1c9b232b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90fd9e571bdb4eeef22b8f0f1c9b232b");
        } else if (this.dirtyNodesSet == null || this.dirtyNodesSet.size() <= 0) {
        } else {
            this.dirtyNodesSet.clear();
        }
    }

    public void setHoverList(@NonNull SparseArray<ShieldDisplayNode> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b53bab29c472b0c4778bd6c05132fdeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b53bab29c472b0c4778bd6c05132fdeb");
            return;
        }
        this.needUpdateNodeList = true;
        this.backupNodeArray = sparseArray.clone();
    }

    private void setHoverListInternal(SparseArray<ShieldDisplayNode> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41c5d4f0c68074cb5b8cef9db86c5ba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41c5d4f0c68074cb5b8cef9db86c5ba8");
            return;
        }
        this.hoverNodes.initDatas(sparseArray);
        if (ShieldDisplayNodeAdapter.needOffset(this.recyclerView)) {
            this.offsetHeaderPosition = ShieldDisplayNodeAdapter.getOffset(this.recyclerView);
        } else {
            this.offsetHeaderPosition = 0;
        }
        setDirtyNodes(sparseArray);
    }

    private void beforeNodesHandle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28ef4258b5eddfa55a6a18c7571ebfbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28ef4258b5eddfa55a6a18c7571ebfbe");
            return;
        }
        this.actualBottom = this.viewLocationRectInterface.getActualRect().bottom;
        if (this.needUpdateNodeList) {
            setHoverListInternal(this.backupNodeArray);
            this.needUpdateNodeList = false;
        }
    }

    private void performNodesHandle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c87c0d0237578f3af22f06750c02b45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c87c0d0237578f3af22f06750c02b45a");
            return;
        }
        this.nodesHandling = true;
        this.hoverNodes.handle();
        this.nodesHandling = false;
    }

    private void afterNodesHandle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51963924f540e1a029063c332f0586de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51963924f540e1a029063c332f0586de");
        } else {
            clearDirtyNodes();
        }
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    public void onViewLocationChanged(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ad9db522d4d26c7427e1e6ae80591a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ad9db522d4d26c7427e1e6ae80591a1");
            return;
        }
        beforeNodesHandle();
        performNodesHandle();
        afterNodesHandle();
    }

    private void reuseViewHolderIfNeed(ShieldDisplayNode shieldDisplayNode, Map<ShieldDisplayNode, HoverNodeInfo> map) {
        Object[] objArr = {shieldDisplayNode, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c10782fd9eae2b1aec69df497fb04da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c10782fd9eae2b1aec69df497fb04da");
            return;
        }
        HoverNodeInfo hoverNodeInfo = map.get(shieldDisplayNode);
        if (hoverNodeInfo == null || hoverNodeInfo.hoverViewHolder == null || shieldDisplayNode.viewHolder == hoverNodeInfo.hoverViewHolder) {
            return;
        }
        if (shieldDisplayNode.containerView != null) {
            shieldDisplayNode.containerView.setViewHolder(hoverNodeInfo.hoverViewHolder);
        } else {
            Iterator<ShieldDisplayNode> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ShieldDisplayNode next = it.next();
                if (next.equals(shieldDisplayNode)) {
                    shieldDisplayNode.containerView = next.containerView;
                    break;
                }
            }
        }
        shieldDisplayNode.viewHolder = hoverNodeInfo.hoverViewHolder;
    }

    private int getItemViewMeasureHeight(ShieldDisplayNode shieldDisplayNode, IHoverLayout iHoverLayout) {
        Object[] objArr = {shieldDisplayNode, iHoverLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d75f915820e0785b6298c48f62b8b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d75f915820e0785b6298c48f62b8b9")).intValue();
        }
        Integer num = null;
        if (shieldDisplayNode.viewHolder == null) {
            invalidateView(shieldDisplayNode, iHoverLayout);
            if (shieldDisplayNode.viewHolder != null) {
                measureViewWithMargin(shieldDisplayNode, iHoverLayout);
                num = Integer.valueOf(shieldDisplayNode.viewHolder.itemView.getMeasuredHeight());
            }
        } else if (this.dirtyNodesSet != null && this.dirtyNodesSet.size() > 0 && this.dirtyNodesSet.contains(shieldDisplayNode)) {
            invalidateView(shieldDisplayNode, iHoverLayout);
            measureViewWithMargin(shieldDisplayNode, iHoverLayout);
            num = Integer.valueOf(shieldDisplayNode.viewHolder.itemView.getMeasuredHeight());
        }
        if (num == null && shieldDisplayNode.viewHolder != null && shieldDisplayNode.viewHolder.itemView.getMeasuredHeight() == 0) {
            invalidateView(shieldDisplayNode, iHoverLayout);
            measureViewWithMargin(shieldDisplayNode, iHoverLayout);
        }
        return shieldDisplayNode.viewHolder.itemView.getMeasuredHeight();
    }

    @NonNull
    private HoverNodeInfo updateNodeInfo(@NonNull HoverNodes hoverNodes, @NonNull ShieldDisplayNode shieldDisplayNode, int i, int i2, int i3) {
        Object[] objArr = {hoverNodes, shieldDisplayNode, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4f13a0e9fb256b2a8260c5c7febbdf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoverNodeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4f13a0e9fb256b2a8260c5c7febbdf4");
        }
        HoverNodeInfo hoverNodeInfo = hoverNodes.nodeInfoMap.get(shieldDisplayNode);
        if (hoverNodeInfo == null) {
            hoverNodeInfo = new HoverNodeInfo(i, i2, i3);
            hoverNodes.nodeInfoMap.put(shieldDisplayNode, hoverNodeInfo);
        }
        hoverNodeInfo.baseHoverLine = i2;
        hoverNodeInfo.endPositionViewBottom = i3;
        hoverNodeInfo.zPosition = i;
        hoverNodeInfo.nodeMeasureHeight = shieldDisplayNode.viewHolder == null ? 0 : shieldDisplayNode.viewHolder.itemView.getMeasuredHeight();
        InnerHoverInfo hoverInfoByNode = hoverNodes.getHoverInfoByNode(shieldDisplayNode);
        hoverNodeInfo.topDrawable = hoverInfoByNode.topDrawable;
        hoverNodeInfo.bottomDrawable = hoverInfoByNode.bottomDrawable;
        return hoverNodeInfo;
    }

    private void setNodeInfoState(@NonNull HoverNodes hoverNodes, ShieldDisplayNode shieldDisplayNode, HoverNodeInfo hoverNodeInfo, InnerHoverInfo.HoverState hoverState) {
        Object[] objArr = {hoverNodes, shieldDisplayNode, hoverNodeInfo, hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7bce365786c70ce45828bcfd17bcc0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7bce365786c70ce45828bcfd17bcc0b");
        } else if (hoverNodeInfo.state != hoverState) {
            hoverNodeInfo.state = hoverState;
            notifyHoverStateChanged(hoverNodes, shieldDisplayNode, hoverState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleHoverNodes(HoverNodes hoverNodes, List<ShieldDisplayNode> list) {
        InnerHoverInfo hoverInfoByNode;
        int i = 0;
        Object[] objArr = {hoverNodes, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44c6bfc1ffcaf152b9e59fe2535361ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44c6bfc1ffcaf152b9e59fe2535361ea");
            return;
        }
        list.clear();
        if (this.firstLastPositionInfo == null || this.firstLastPositionInfo.isEmpty()) {
            return;
        }
        for (ShieldDisplayNode shieldDisplayNode : new LinkedList(hoverNodes.hoverNodeList.values())) {
            if (shieldDisplayNode != null && (hoverInfoByNode = hoverNodes.getHoverInfoByNode(shieldDisplayNode)) != null) {
                int baseLine = hoverInfoByNode.getBaseLine(this.actualBottom, i);
                if (hoverInfoByNode.needAutoOffset) {
                    baseLine += getAutoOffset();
                }
                int i2 = baseLine;
                int hoverTop = hoverNodes.getHoverTop(hoverInfoByNode);
                int hoverBottom = hoverNodes.getHoverBottom(hoverInfoByNode);
                if (hoverInfoByNode.isHover(i2, hoverTop, hoverBottom)) {
                    reuseViewHolderIfNeed(shieldDisplayNode, hoverNodes.nodeInfoMap);
                    i += getItemViewMeasureHeight(shieldDisplayNode, hoverNodes.container);
                    updateNodeInfo(hoverNodes, shieldDisplayNode, hoverInfoByNode.zPosition, i2, hoverBottom);
                    list.add(shieldDisplayNode);
                } else {
                    HoverNodeInfo updateNodeInfo = updateNodeInfo(hoverNodes, shieldDisplayNode, hoverInfoByNode.zPosition, i2, hoverBottom);
                    if (hoverInfoByNode.isEndHover(i2, hoverTop, hoverBottom)) {
                        setNodeInfoState(hoverNodes, shieldDisplayNode, updateNodeInfo, InnerHoverInfo.HoverState.END);
                    } else {
                        setNodeInfoState(hoverNodes, shieldDisplayNode, updateNodeInfo, InnerHoverInfo.HoverState.NORMAL);
                    }
                }
            }
        }
    }

    public void filterNormalAndNewHoverNodes(List<ShieldDisplayNode> list, List<ShieldDisplayNode> list2, List<ShieldDisplayNode> list3) {
        Object[] objArr = {list, list2, list3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26dbc4ed04a4a8703fec32dd4c7bcb8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26dbc4ed04a4a8703fec32dd4c7bcb8e");
            return;
        }
        list3.clear();
        for (ShieldDisplayNode shieldDisplayNode : list) {
            if (shieldDisplayNode != null && !list2.remove(shieldDisplayNode)) {
                list3.add(shieldDisplayNode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreHoverNodesToNormalNodes(HoverNodes hoverNodes, List<ShieldDisplayNode> list) {
        HoverNodeInfo hoverNodeInfo;
        Object[] objArr = {hoverNodes, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9943a8f43175da7146514e4e513e89d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9943a8f43175da7146514e4e513e89d7");
        } else if (!list.isEmpty()) {
            for (ShieldDisplayNode shieldDisplayNode : list) {
                if (shieldDisplayNode != null && (hoverNodeInfo = hoverNodes.nodeInfoMap.get(shieldDisplayNode)) != null) {
                    boolean maybeRestoreToNodeContainerView = maybeRestoreToNodeContainerView(shieldDisplayNode, hoverNodeInfo.hoverViewHolder, hoverNodes.container, hoverNodes.type);
                    if (hoverNodeInfo.state == InnerHoverInfo.HoverState.HOVER) {
                        setNodeInfoState(hoverNodes, shieldDisplayNode, hoverNodeInfo, InnerHoverInfo.HoverState.NORMAL);
                    }
                    if (!maybeRestoreToNodeContainerView && shieldDisplayNode.getPath() != null) {
                        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                        shieldLogger.codeLogError(TopBottomLocationManager.class, "path:" + shieldDisplayNode.getPath().toString() + " context:" + this.recyclerView.getContext(), "restoreNodeContainer");
                    }
                }
            }
        }
    }

    public boolean maybeRestoreToNodeContainerView(ShieldDisplayNode shieldDisplayNode, ShieldViewHolder shieldViewHolder, IHoverLayout iHoverLayout, InnerHoverInfo.HoverType hoverType) {
        boolean z = false;
        Object[] objArr = {shieldDisplayNode, shieldViewHolder, iHoverLayout, hoverType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9eaddbc744e28eba3d2d7b26a964afa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9eaddbc744e28eba3d2d7b26a964afa")).booleanValue();
        }
        if (iHoverLayout != null && shieldViewHolder != null) {
            z = iHoverLayout.removeView(shieldViewHolder.itemView, hoverType);
            if (shieldDisplayNode.containerView != null && shieldViewHolder.itemView.getParent() == null) {
                shieldDisplayNode.containerView.setViewHolder(shieldDisplayNode.viewHolder);
            } else if (shieldDisplayNode.containerView == null && shieldDisplayNode.viewHolder != null && this.hoverNodes != null && this.hoverNodes.nodeInfoMap != null) {
                Iterator<ShieldDisplayNode> it = this.hoverNodes.nodeInfoMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShieldDisplayNode next = it.next();
                    if (next.equals(shieldDisplayNode)) {
                        if (next.containerView == null && this.hoverNodes.nodeInfoMap.get(next) != null) {
                            next.containerView = this.hoverNodes.nodeInfoMap.get(next).hoverViewContainer;
                        }
                        if (next.containerView != null) {
                            next.containerView.setViewHolder(shieldDisplayNode.viewHolder);
                            next.viewHolder = shieldDisplayNode.viewHolder;
                            break;
                        }
                    }
                }
                ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(TopBottomLocationManager.class, "node.containerView为null，但是node 能equals成功");
            }
            shieldViewHolder.itemView.setTranslationY(0.0f);
        }
        return z;
    }

    public void layoutToHoverContainer(IHoverLayout iHoverLayout, ShieldDisplayNode shieldDisplayNode, HoverNodeInfo hoverNodeInfo, InnerHoverInfo.HoverType hoverType) {
        Object[] objArr = {iHoverLayout, shieldDisplayNode, hoverNodeInfo, hoverType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71dc6d8f78fd3727751a4456cc219ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71dc6d8f78fd3727751a4456cc219ef0");
        } else if (iHoverLayout == null || shieldDisplayNode == null || shieldDisplayNode.viewHolder == null) {
        } else {
            View view = shieldDisplayNode.viewHolder.itemView;
            ZLayoutChildInfo zLayoutChildInfo = new ZLayoutChildInfo();
            zLayoutChildInfo.type = hoverType;
            zLayoutChildInfo.gravity = hoverType == InnerHoverInfo.HoverType.HOVER_BOTTOM ? 80 : 48;
            zLayoutChildInfo.zPosition = hoverNodeInfo.zPosition;
            zLayoutChildInfo.topDrawable = hoverNodeInfo.topDrawable;
            zLayoutChildInfo.bottomDrawable = hoverNodeInfo.bottomDrawable;
            zLayoutChildInfo.node = shieldDisplayNode;
            if (iHoverLayout.addView(view, zLayoutChildInfo) && hoverNodeInfo.nodeMeasureHeight != view.getHeight()) {
                iHoverLayout.requestLayout();
            }
            saveHoverNodeInfo(view, shieldDisplayNode);
        }
    }

    private void saveHoverNodeInfo(View view, ShieldDisplayNode shieldDisplayNode) {
        int childAdapterPosition;
        Object[] objArr = {view, shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "762bfbee52b5ae9b9a710c02cc184596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "762bfbee52b5ae9b9a710c02cc184596");
        } else if (view == null || shieldDisplayNode == null || shieldDisplayNode.containerView == null || this.recyclerView == null || shieldDisplayNode.containerView.getLayoutParams() == null || (childAdapterPosition = this.recyclerView.getChildAdapterPosition(shieldDisplayNode.containerView)) == -1) {
        } else {
            view.setTag(R.id.hover_view_pos_tag_id, Integer.valueOf(childAdapterPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNewHoverNodesToLayout(HoverNodes hoverNodes, List<ShieldDisplayNode> list) {
        Object[] objArr = {hoverNodes, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02ace2c30f00efdcda6c1debd7ae1d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02ace2c30f00efdcda6c1debd7ae1d0e");
        } else if (hoverNodes != null && hoverNodes.container != null) {
            IHoverLayout iHoverLayout = hoverNodes.container;
            if (list != null) {
                for (ShieldDisplayNode shieldDisplayNode : list) {
                    if (shieldDisplayNode != null && shieldDisplayNode.viewHolder != null) {
                        HoverNodeInfo hoverNodeInfo = hoverNodes.nodeInfoMap.get(shieldDisplayNode);
                        layoutToHoverContainer(iHoverLayout, shieldDisplayNode, hoverNodeInfo, hoverNodes.type);
                        setNodeInfoState(hoverNodes, shieldDisplayNode, hoverNodeInfo, InnerHoverInfo.HoverState.HOVER);
                    }
                }
                iHoverLayout.forceMeasure();
            }
        }
    }

    public void updateCurrentHoverViews(HoverNodes hoverNodes, List<ShieldDisplayNode> list) {
        Object[] objArr = {hoverNodes, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8e7567ef638243fd17c8f73573c4672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8e7567ef638243fd17c8f73573c4672");
        } else if (hoverNodes != null && hoverNodes.container != null) {
            IHoverLayout iHoverLayout = hoverNodes.container;
            List<View> childsByType = iHoverLayout.getChildsByType(hoverNodes.type);
            if (list != null) {
                for (ShieldDisplayNode shieldDisplayNode : list) {
                    if (shieldDisplayNode != null && shieldDisplayNode.viewHolder != null) {
                        View view = shieldDisplayNode.viewHolder.itemView;
                        HoverNodeInfo hoverNodeInfo = hoverNodes.nodeInfoMap.get(shieldDisplayNode);
                        ZLayoutChildInfo zLayoutChildInfo = new ZLayoutChildInfo();
                        zLayoutChildInfo.type = hoverNodes.type;
                        zLayoutChildInfo.gravity = hoverNodes.type == InnerHoverInfo.HoverType.HOVER_BOTTOM ? 80 : 48;
                        zLayoutChildInfo.zPosition = hoverNodeInfo.zPosition;
                        zLayoutChildInfo.topDrawable = hoverNodeInfo.topDrawable;
                        zLayoutChildInfo.bottomDrawable = hoverNodeInfo.bottomDrawable;
                        zLayoutChildInfo.baseY = hoverNodeInfo.baseHoverLine;
                        zLayoutChildInfo.translationY = hoverNodeInfo.getTranslationY(shieldDisplayNode, hoverNodes.type);
                        zLayoutChildInfo.node = shieldDisplayNode;
                        iHoverLayout.updateView(view, zLayoutChildInfo);
                        childsByType.remove(view);
                    }
                }
            }
            if (!childsByType.isEmpty()) {
                for (int i = 0; i < childsByType.size(); i++) {
                    iHoverLayout.removeView(childsByType.get(i), hoverNodes.type);
                }
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                shieldLogger.codeLogError(TopBottomLocationManager.class, "context: " + this.recyclerView.getContext(), "restoreNodeContainer");
            }
            if (iHoverLayout.getFocusedChild() == null) {
                iHoverLayout.clearFocus();
            }
        }
    }

    private void notifyHoverStateChanged(HoverNodes hoverNodes, ShieldDisplayNode shieldDisplayNode, InnerHoverInfo.HoverState hoverState) {
        Object[] objArr = {hoverNodes, shieldDisplayNode, hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5c628079cd23c4894caa0a115f5a759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5c628079cd23c4894caa0a115f5a759");
            return;
        }
        InnerHoverInfo hoverInfoByNode = hoverNodes.getHoverInfoByNode(shieldDisplayNode);
        if (hoverInfoByNode == null || hoverInfoByNode.listener == null) {
            return;
        }
        postOnStateChanged(hoverInfoByNode.listener, shieldDisplayNode, hoverState);
    }

    private void postOnStateChanged(@NonNull final InnerHoverInfo.HoverStateChangeListener hoverStateChangeListener, @NonNull final ShieldDisplayNode shieldDisplayNode, @NonNull final InnerHoverInfo.HoverState hoverState) {
        Object[] objArr = {hoverStateChangeListener, shieldDisplayNode, hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e516cac472b219ab531d93ccbea3b903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e516cac472b219ab531d93ccbea3b903");
        } else if (this.mHandler != null) {
            this.mHandler.post(new Runnable() { // from class: com.dianping.shield.node.adapter.TopBottomLocationManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be3b76b52e52a92f8906d675510eb0df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be3b76b52e52a92f8906d675510eb0df");
                    } else {
                        hoverStateChangeListener.onStateChanged(shieldDisplayNode, hoverState);
                    }
                }
            });
        } else {
            hoverStateChangeListener.onStateChanged(shieldDisplayNode, hoverState);
            if (this.recyclerView != null) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                shieldLogger.codeLogError(TopBottomLocationManager.class, " context:" + this.recyclerView.getContext(), "postOnStateChanged don't run here！");
            }
        }
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e95b2b53cbbed0586c3d8c90084c22b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e95b2b53cbbed0586c3d8c90084c22b3");
            return;
        }
        super.clear();
        clearHovers();
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
        }
        if (this.recyclerView != null) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.codeLogError(TopBottomLocationManager.class, "clear: " + Log.getStackTraceString(new Throwable()), KNBConfig.CONFIG_CLEAR_CACHE);
        }
    }

    public int getTopOrBottomPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5668a7a8cbe5bf85b03bac3d15ffcee5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5668a7a8cbe5bf85b03bac3d15ffcee5")).intValue();
        }
        if (this.firstLastPositionInfo != null && i2 >= 0) {
            if (i2 == Integer.MAX_VALUE) {
                return MAX_VALUE;
            }
            Integer num = -1;
            for (int i3 = 0; i3 < this.firstLastPositionInfo.firstVisibleItemPositions.size(); i3++) {
                num = Integer.valueOf(Math.min(num.intValue(), this.firstLastPositionInfo.firstVisibleItemPositions.get(i3).offsetPos));
            }
            if (num.intValue() < 0 || i2 >= num.intValue()) {
                Integer num2 = -1;
                for (int i4 = 0; i4 < this.firstLastPositionInfo.lastVisibleItemPositions.size(); i4++) {
                    num2 = Integer.valueOf(Math.max(num2.intValue(), this.firstLastPositionInfo.lastVisibleItemPositions.get(i4).offsetPos));
                }
                if (num2.intValue() < 0 || i2 <= num2.intValue()) {
                    RecyclerView.s findViewHolderForLayoutPosition = this.recyclerView.findViewHolderForLayoutPosition(i2 + this.offsetHeaderPosition);
                    View view = findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.itemView : null;
                    if (view != null) {
                        if (i == 0) {
                            return view.getTop();
                        }
                        if (i == 1) {
                            return view.getBottom();
                        }
                    }
                    return -1073741824;
                }
                return MAX_VALUE;
            }
            return -1073741824;
        }
        return -1073741824;
    }

    private void invalidateView(ShieldDisplayNode shieldDisplayNode, IHoverLayout iHoverLayout) {
        Object[] objArr = {shieldDisplayNode, iHoverLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1425a15e6160901b8175d01d2fba4eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1425a15e6160901b8175d01d2fba4eab");
            return;
        }
        if (shieldDisplayNode.viewHolder == null) {
            shieldDisplayNode.createNodeView(this.recyclerView.getContext(), iHoverLayout.getContainer());
        }
        shieldDisplayNode.updateNodeView();
        if (this.dirtyNodesSet == null || this.dirtyNodesSet.size() <= 0) {
            return;
        }
        this.dirtyNodesSet.remove(shieldDisplayNode);
    }

    private void measureViewWithMargin(ShieldDisplayNode shieldDisplayNode, IHoverLayout iHoverLayout) {
        Object[] objArr = {shieldDisplayNode, iHoverLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eafbea66f9f22ef454efc793d39ba744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eafbea66f9f22ef454efc793d39ba744");
        } else if (iHoverLayout == null || shieldDisplayNode.viewHolder == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = shieldDisplayNode.viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
                shieldDisplayNode.viewHolder.itemView.setLayoutParams(layoutParams);
            }
            shieldDisplayNode.viewHolder.itemView.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(iHoverLayout.getMeasuredWidth(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(iHoverLayout.getMeasuredHeight(), 0), 0, layoutParams.height));
            final DisplayNodeContainer displayNodeContainer = shieldDisplayNode.containerView;
            if (displayNodeContainer != null) {
                displayNodeContainer.post(new Runnable() { // from class: com.dianping.shield.node.adapter.TopBottomLocationManager.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db985a8cbb38288950b4350320c7a26b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db985a8cbb38288950b4350320c7a26b");
                        } else {
                            displayNodeContainer.requestLayout();
                        }
                    }
                });
            }
        }
    }

    public void setHoverLayoutControl(IHoverLayout iHoverLayout) {
        Object[] objArr = {iHoverLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3541a0d04c04aa17852cc955c340c547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3541a0d04c04aa17852cc955c340c547");
            return;
        }
        this.layoutControl = iHoverLayout;
        this.hoverNodes.setHoverLayout(iHoverLayout);
        if (iHoverLayout != null) {
            iHoverLayout.addChildHeightChangeListener(this);
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout.OnChildHeightChangeListener
    public void onChildHeightChangeListener(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04b54d7120d1a596cf2449699516adc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04b54d7120d1a596cf2449699516adc0");
        } else if (i4 - i3 != 0) {
            onViewLocationChanged(ScrollDirection.STATIC);
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        return this.topOffset;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        this.topOffset = i;
    }

    public HoveredViewsInfo getCurrentHoverInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18327d120da763154e8bd98b18b3ab69", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoveredViewsInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18327d120da763154e8bd98b18b3ab69");
        }
        HoveredViewsInfo hoveredViewsInfo = new HoveredViewsInfo();
        if (this.recyclerView != null) {
            hoveredViewsInfo.minBottomViewY = this.recyclerView.getBottom();
        }
        HoverNodes hoverNodes = this.hoverNodes;
        getCurrentHoverInfoInternal(hoverNodes, hoveredViewsInfo);
        while (hoverNodes.next != null) {
            hoverNodes = hoverNodes.next;
            getCurrentHoverInfoInternal(hoverNodes, hoveredViewsInfo);
        }
        return hoveredViewsInfo;
    }

    private void getCurrentHoverInfoInternal(@NonNull HoverNodes hoverNodes, @NonNull HoveredViewsInfo hoveredViewsInfo) {
        Object[] objArr = {hoverNodes, hoveredViewsInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "993996b78ab461d8ff57cbc1be995b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "993996b78ab461d8ff57cbc1be995b03");
            return;
        }
        for (ShieldDisplayNode shieldDisplayNode : hoverNodes.lastHoverNodeList) {
            HoverNodeInfo hoverNodeInfo = hoverNodes.nodeInfoMap.get(shieldDisplayNode);
            if (hoverNodeInfo != null) {
                HoveredViewsInfo.ViewInfo viewInfo = new HoveredViewsInfo.ViewInfo();
                int[] iArr = new int[2];
                hoverNodeInfo.hoverViewHolder.itemView.getLocationOnScreen(iArr);
                viewInfo.top = (int) hoverNodeInfo.hoverViewHolder.itemView.getY();
                viewInfo.bottom = viewInfo.top + hoverNodeInfo.nodeMeasureHeight;
                viewInfo.locationWindowTop = iArr[1];
                viewInfo.locationWindowBottom = iArr[1] + hoverNodeInfo.nodeMeasureHeight;
                viewInfo.zIndex = hoverNodeInfo.zPosition;
                if (hoverNodes.type == InnerHoverInfo.HoverType.HOVER_BOTTOM) {
                    hoveredViewsInfo.bottomViewListInfo.add(viewInfo);
                    hoveredViewsInfo.minBottomViewY = Math.min(hoveredViewsInfo.minBottomViewY, viewInfo.top);
                } else if (hoverNodes.type == InnerHoverInfo.HoverType.HOVER_TOP) {
                    hoveredViewsInfo.topViewListInfo.add(viewInfo);
                    hoveredViewsInfo.maxTopViewY = Math.max(hoveredViewsInfo.maxTopViewY, viewInfo.bottom);
                }
                if (!hoveredViewsInfo.nodeList.contains(shieldDisplayNode)) {
                    hoveredViewsInfo.nodeList.add(shieldDisplayNode);
                }
            }
        }
    }

    public ShieldViewHolder getShieldViewHolderByReuseInfo(ReuseInfo reuseInfo) {
        Object[] objArr = {reuseInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "276af3f70784ad4006f6f2bf764abf86", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "276af3f70784ad4006f6f2bf764abf86");
        }
        if (reuseInfo == null || reuseInfo.rowParent == null) {
            return null;
        }
        if (reuseInfo.rowParent.getBottomInfo() == null && reuseInfo.rowParent.getTopInfo() == null) {
            return null;
        }
        for (HoverNodes hoverNodes = this.hoverNodes; hoverNodes != null; hoverNodes = hoverNodes.next) {
            for (ShieldDisplayNode shieldDisplayNode : hoverNodes.lastHoverNodeList) {
                if (shieldDisplayNode.viewItem.equals(reuseInfo.viewItem)) {
                    return shieldDisplayNode.viewHolder;
                }
            }
        }
        for (HoverNodes hoverNodes2 = this.hoverNodes; hoverNodes2 != null; hoverNodes2 = hoverNodes2.next) {
            for (ShieldDisplayNode shieldDisplayNode2 : hoverNodes2.nodeInfoMap.keySet()) {
                if (shieldDisplayNode2.viewItem.equals(reuseInfo.viewItem)) {
                    ShieldViewHolder shieldViewHolder = hoverNodes2.nodeInfoMap.get(shieldDisplayNode2).hoverViewHolder;
                    if (shieldViewHolder != null) {
                        ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(TopBottomLocationManager.class, "It's in here!!!", "getShieldViewHolderByReuseInfo");
                    }
                    return shieldViewHolder;
                }
            }
        }
        return null;
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "535c2bff49e9b0731c92dc99feab0efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "535c2bff49e9b0731c92dc99feab0efb");
            return;
        }
        super.shieldRecycle();
        this.topOffset = 0;
        this.recyclerView = null;
        this.offsetHeaderPosition = 0;
        this.actualBottom = 0;
        this.actualTop = 0;
        this.bottomHoverTranslateY = 0;
        this.topHoverTranslateY = 0;
        if (this.dirtyNodesSet != null) {
            this.dirtyNodesSet.clear();
        }
        this.nodesHandling = false;
        if (this.backupNodeArray != null) {
            this.backupNodeArray.clear();
        }
        this.needUpdateNodeList = false;
        for (HoverNodes hoverNodes = this.hoverNodes; hoverNodes != null; hoverNodes = hoverNodes.next) {
            hoverNodes.shieldRecycle();
        }
        if (this.layoutControl != null) {
            this.layoutControl.removeChildHeightChangeListener(this);
            this.layoutControl = null;
        }
    }

    @Override // com.dianping.shield.bridge.feature.HoverPosControlObserver
    public void setBottomTranslateY(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdd97ab32296d79e5079ef5906dcf76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdd97ab32296d79e5079ef5906dcf76c");
            return;
        }
        this.bottomHoverTranslateY = i;
        updateHoverTranslateY();
    }

    @Override // com.dianping.shield.bridge.feature.HoverPosControlObserver
    public void setTopTranslateY(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e9d50a9f6ee2d668909882c7fa1d8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e9d50a9f6ee2d668909882c7fa1d8b1");
            return;
        }
        this.topHoverTranslateY = i;
        updateHoverTranslateY();
    }

    private void updateHoverTranslateY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3c121a6530afb1d058486a8c22143b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3c121a6530afb1d058486a8c22143b4");
            return;
        }
        for (HoverNodes hoverNodes = this.hoverNodes; hoverNodes != null; hoverNodes = hoverNodes.next) {
            updateCurrentHoverViews(hoverNodes, hoverNodes.lastHoverNodeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class HoverNodeInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int baseHoverLine;
        public Drawable bottomDrawable;
        public int endPositionViewBottom;
        public DisplayNodeContainer hoverViewContainer;
        public ShieldViewHolder hoverViewHolder;
        public int nodeMeasureHeight;
        public InnerHoverInfo.HoverState state;
        public Drawable topDrawable;
        public int zPosition;

        public HoverNodeInfo(int i, int i2, int i3) {
            Object[] objArr = {TopBottomLocationManager.this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "804a67dc9cd1bec10fb86049c99a1716", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "804a67dc9cd1bec10fb86049c99a1716");
                return;
            }
            this.state = InnerHoverInfo.HoverState.NORMAL;
            this.zPosition = i;
            this.baseHoverLine = i2;
            this.endPositionViewBottom = i3;
        }

        public int getTranslationY(ShieldDisplayNode shieldDisplayNode, InnerHoverInfo.HoverType hoverType) {
            Object[] objArr = {shieldDisplayNode, hoverType};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83d0dd49917e0ada5bf848067a21f0c0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83d0dd49917e0ada5bf848067a21f0c0")).intValue();
            }
            if (hoverType == InnerHoverInfo.HoverType.HOVER_TOP) {
                int min = Math.min(this.baseHoverLine, this.endPositionViewBottom - this.nodeMeasureHeight);
                return (shieldDisplayNode == null || shieldDisplayNode.innerTopInfo == null || shieldDisplayNode.innerTopInfo.topInfo == null) ? min : min + TopBottomLocationManager.this.topHoverTranslateY;
            } else if (hoverType == InnerHoverInfo.HoverType.HOVER_BOTTOM) {
                int max = Math.max(this.baseHoverLine, this.endPositionViewBottom + this.nodeMeasureHeight) - TopBottomLocationManager.this.actualBottom;
                return (shieldDisplayNode == null || shieldDisplayNode.innerBottomInfo == null || shieldDisplayNode.innerBottomInfo.bottomInfo == null || shieldDisplayNode.innerBottomInfo.bottomInfo.startType != BottomInfo.StartType.ALWAYS) ? max : max + TopBottomLocationManager.this.bottomHoverTranslateY;
            } else {
                return 0;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public abstract class HoverNodes implements ShieldPreloadInterface {
        public static ChangeQuickRedirect changeQuickRedirect;
        public IHoverLayout container;
        public final LinkedHashMap<Integer, ShieldDisplayNode> hoverNodeList;
        public List<ShieldDisplayNode> lastHoverNodeList;
        public List<ShieldDisplayNode> needHoverNodeList;
        public List<ShieldDisplayNode> newHoverList;
        public HoverNodes next;
        public HashMap<ShieldDisplayNode, HoverNodeInfo> nodeInfoMap;
        public InnerHoverInfo.HoverType type;

        public abstract void fillHoverNodeList(SparseArray<ShieldDisplayNode> sparseArray);

        public abstract int getHoverBottom(@NonNull InnerHoverInfo innerHoverInfo);

        public abstract InnerHoverInfo getHoverInfoByNode(@NonNull ShieldDisplayNode shieldDisplayNode);

        public abstract int getHoverTop(@NonNull InnerHoverInfo innerHoverInfo);

        @Override // com.dianping.shield.preload.ShieldPreloadInterface
        public void shieldPreload() {
        }

        public HoverNodes() {
            Object[] objArr = {TopBottomLocationManager.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99b67f84b19ddbce73735fa8fb939b4a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99b67f84b19ddbce73735fa8fb939b4a");
                return;
            }
            this.hoverNodeList = new LinkedHashMap<>(2);
            this.nodeInfoMap = new HashMap<>();
            this.needHoverNodeList = new LinkedList();
            this.lastHoverNodeList = new LinkedList();
            this.newHoverList = new LinkedList();
        }

        public void setNext(HoverNodes hoverNodes) {
            this.next = hoverNodes;
        }

        public void initDatas(SparseArray<ShieldDisplayNode> sparseArray) {
            Object[] objArr = {sparseArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27d2d9f995d9206c8036bb78e4ec4e2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27d2d9f995d9206c8036bb78e4ec4e2f");
                return;
            }
            this.hoverNodeList.clear();
            fillHoverNodeList(sparseArray);
            if (this.next != null) {
                this.next.initDatas(sparseArray);
            }
        }

        public void handle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869d37e47f7fd4e069dd6a7220a1723a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869d37e47f7fd4e069dd6a7220a1723a");
                return;
            }
            if (this.container != null && (this.hoverNodeList.size() > 0 || this.lastHoverNodeList.size() > 0)) {
                TopBottomLocationManager.this.handleHoverNodes(this, this.needHoverNodeList);
                TopBottomLocationManager.this.filterNormalAndNewHoverNodes(this.needHoverNodeList, this.lastHoverNodeList, this.newHoverList);
                TopBottomLocationManager.this.restoreHoverNodesToNormalNodes(this, this.lastHoverNodeList);
                TopBottomLocationManager.this.addNewHoverNodesToLayout(this, this.newHoverList);
                TopBottomLocationManager.this.updateCurrentHoverViews(this, this.needHoverNodeList);
                updateLastHoverNodes();
                updateNodeInfoMap();
            }
            if (this.next != null) {
                this.next.handle();
            }
        }

        public void updateLastHoverNodes() {
            List<ShieldDisplayNode> list = this.lastHoverNodeList;
            this.lastHoverNodeList = this.needHoverNodeList;
            this.needHoverNodeList = list;
        }

        public void updateNodeInfoMap() {
            HoverNodeInfo hoverNodeInfo;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6cd34bc78af2ab17e465672f76817db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6cd34bc78af2ab17e465672f76817db");
                return;
            }
            HashMap<ShieldDisplayNode, HoverNodeInfo> hashMap = new HashMap<>();
            for (Map.Entry<Integer, ShieldDisplayNode> entry : this.hoverNodeList.entrySet()) {
                ShieldDisplayNode value = entry.getValue();
                if (value != null && (hoverNodeInfo = this.nodeInfoMap.get(value)) != null) {
                    hoverNodeInfo.hoverViewHolder = value.viewHolder;
                    if (value.containerView != null) {
                        hoverNodeInfo.hoverViewContainer = value.containerView;
                    }
                    hashMap.put(value, hoverNodeInfo);
                }
            }
            this.nodeInfoMap = hashMap;
        }

        public void setHoverLayout(IHoverLayout iHoverLayout) {
            Object[] objArr = {iHoverLayout};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b99f6b13806ac6ab95a2d4c85c892d03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b99f6b13806ac6ab95a2d4c85c892d03");
                return;
            }
            this.container = iHoverLayout;
            if (this.next != null) {
                this.next.setHoverLayout(iHoverLayout);
            }
        }

        public void clear() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdfedb0a43d01042aa3c97fc7a35b1e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdfedb0a43d01042aa3c97fc7a35b1e8");
                return;
            }
            this.hoverNodeList.clear();
            if (this.next != null) {
                this.next.clear();
            }
        }

        @Override // com.dianping.shield.preload.ShieldPreloadInterface
        public void shieldRecycle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7dbcb25cbbf8da2e0d80106032c304d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7dbcb25cbbf8da2e0d80106032c304d");
                return;
            }
            this.hoverNodeList.clear();
            this.nodeInfoMap.clear();
            this.needHoverNodeList.clear();
            this.lastHoverNodeList.clear();
            this.newHoverList.clear();
            this.container = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class TopHoverNodes extends HoverNodes {
        public static ChangeQuickRedirect changeQuickRedirect;

        public TopHoverNodes() {
            super();
            Object[] objArr = {TopBottomLocationManager.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f65803071891a76ba3a39eee21dc222", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f65803071891a76ba3a39eee21dc222");
            } else {
                this.type = InnerHoverInfo.HoverType.HOVER_TOP;
            }
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public void fillHoverNodeList(SparseArray<ShieldDisplayNode> sparseArray) {
            Object[] objArr = {sparseArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f85472e10df18ffa9d48b0adcce2be4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f85472e10df18ffa9d48b0adcce2be4");
            } else if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ShieldDisplayNode valueAt = sparseArray.valueAt(i);
                    if (valueAt != null && valueAt.innerTopInfo != null) {
                        this.hoverNodeList.put(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
                    }
                }
            }
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public InnerHoverInfo getHoverInfoByNode(@NonNull ShieldDisplayNode shieldDisplayNode) {
            return shieldDisplayNode.innerTopInfo;
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public int getHoverTop(@NonNull InnerHoverInfo innerHoverInfo) {
            Object[] objArr = {innerHoverInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7653a8d83de9d426ec410029dcca1082", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7653a8d83de9d426ec410029dcca1082")).intValue() : TopBottomLocationManager.this.getTopOrBottomPosition(0, innerHoverInfo.startPos);
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public int getHoverBottom(@NonNull InnerHoverInfo innerHoverInfo) {
            Object[] objArr = {innerHoverInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c76b5add7def97dd4b89c79096ad3f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c76b5add7def97dd4b89c79096ad3f1")).intValue() : TopBottomLocationManager.this.getTopOrBottomPosition(1, innerHoverInfo.endPos);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class BottomHoverNodes extends HoverNodes {
        public static ChangeQuickRedirect changeQuickRedirect;

        public BottomHoverNodes() {
            super();
            Object[] objArr = {TopBottomLocationManager.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52d750a70726d61f9af83b7e2c56ea45", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52d750a70726d61f9af83b7e2c56ea45");
            } else {
                this.type = InnerHoverInfo.HoverType.HOVER_BOTTOM;
            }
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public void fillHoverNodeList(SparseArray<ShieldDisplayNode> sparseArray) {
            Object[] objArr = {sparseArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c38816db2d607bef11e159bb3e428d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c38816db2d607bef11e159bb3e428d8");
            } else if (sparseArray != null) {
                for (int size = sparseArray.size() - 1; size >= 0; size--) {
                    ShieldDisplayNode valueAt = sparseArray.valueAt(size);
                    if (valueAt != null && valueAt.innerBottomInfo != null) {
                        this.hoverNodeList.put(Integer.valueOf(sparseArray.keyAt(size)), sparseArray.valueAt(size));
                    }
                }
            }
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public InnerHoverInfo getHoverInfoByNode(@NonNull ShieldDisplayNode shieldDisplayNode) {
            return shieldDisplayNode.innerBottomInfo;
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public int getHoverTop(@NonNull InnerHoverInfo innerHoverInfo) {
            Object[] objArr = {innerHoverInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c66e1fcd81a222df9f6ebc91ba629bc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c66e1fcd81a222df9f6ebc91ba629bc")).intValue() : TopBottomLocationManager.this.getTopOrBottomPosition(1, innerHoverInfo.startPos);
        }

        @Override // com.dianping.shield.node.adapter.TopBottomLocationManager.HoverNodes
        public int getHoverBottom(@NonNull InnerHoverInfo innerHoverInfo) {
            Object[] objArr = {innerHoverInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29299bb4a324e1c7d717d5f8aea32e05", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29299bb4a324e1c7d717d5f8aea32e05")).intValue() : TopBottomLocationManager.this.getTopOrBottomPosition(0, innerHoverInfo.endPos);
        }
    }
}
