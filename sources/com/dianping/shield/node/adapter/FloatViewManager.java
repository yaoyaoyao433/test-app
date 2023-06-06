package com.dianping.shield.node.adapter;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.agentsdk.framework.e;
import com.dianping.shield.layoutcontrol.IHoverLayout;
import com.dianping.shield.layoutcontrol.ZLayoutChildInfo;
import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FloatViewManager implements ShieldPreloadInterface {
    private static final int DEFAULT_GRAVITY = 8388659;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InnerHoverInfo.HoverType TYPE;
    private Context context;
    private HashMap<DisplayNodeContainer, ZLayoutChildInfo> floatViewAddInlayoutControlMap;
    private int floatViewLoopIndex;
    private HashSet<ShieldFloatViewDisplayNode> floatViewNodeSet;
    private HashSet<ShieldFloatViewDisplayNode> lastFloatViewNodeSet;
    private IHoverLayout layoutControl;
    private LayoutParamCalAndContentYCallback layoutParamCalAndContentYCallback;
    private Runnable processRunnable;

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public FloatViewManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21f72b7c165ffc043b0069b44ffe6cba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21f72b7c165ffc043b0069b44ffe6cba");
            return;
        }
        this.TYPE = InnerHoverInfo.HoverType.HOVER_NORMAL;
        this.floatViewLoopIndex = 0;
        this.processRunnable = new Runnable() { // from class: com.dianping.shield.node.adapter.FloatViewManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8fae10359fb8e92ec0115e37492424d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8fae10359fb8e92ec0115e37492424d7");
                } else {
                    FloatViewManager.this.updateFloatViews();
                }
            }
        };
        this.context = context;
        this.floatViewNodeSet = new HashSet<>(2);
        this.lastFloatViewNodeSet = new HashSet<>(2);
        this.floatViewAddInlayoutControlMap = new HashMap<>(2);
    }

    public void setHoverLayoutControl(IHoverLayout iHoverLayout) {
        this.layoutControl = iHoverLayout;
    }

    public void setLayoutParamCalAndContentYCallback(LayoutParamCalAndContentYCallback layoutParamCalAndContentYCallback) {
        Object[] objArr = {layoutParamCalAndContentYCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944b13cce065880e8b99788a89441e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944b13cce065880e8b99788a89441e01");
            return;
        }
        this.layoutParamCalAndContentYCallback = layoutParamCalAndContentYCallback;
        layoutParamCalAndContentYCallback.addContentScrollOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.node.adapter.FloatViewManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
            public void offsetChanged(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c100a1d10cca3348c1de065edc4f89a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c100a1d10cca3348c1de065edc4f89a5");
                    return;
                }
                Iterator it = FloatViewManager.this.lastFloatViewNodeSet.iterator();
                while (it.hasNext()) {
                    ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = (ShieldFloatViewDisplayNode) it.next();
                    if (shieldFloatViewDisplayNode != null && (shieldFloatViewDisplayNode.rowParent != null || shieldFloatViewDisplayNode.needFollowScroll)) {
                        DisplayNodeContainer displayNodeContainer = shieldFloatViewDisplayNode.containerView;
                        if (displayNodeContainer != null) {
                            ZLayoutChildInfo childInfoByItem = FloatViewManager.this.getChildInfoByItem(shieldFloatViewDisplayNode, ((ZLayoutChildInfo) FloatViewManager.this.floatViewAddInlayoutControlMap.get(displayNodeContainer)).zPosition);
                            childInfoByItem.translationY = -i2;
                            if (shieldFloatViewDisplayNode.anchorPosition >= 0) {
                                childInfoByItem.gravity = FloatViewManager.DEFAULT_GRAVITY;
                            }
                            FloatViewManager.this.layoutControl.updateView(displayNodeContainer, childInfoByItem);
                        }
                    }
                }
            }
        });
    }

    public void setFloatData(@NonNull HashSet<ShieldFloatViewDisplayNode> hashSet) {
        Object[] objArr = {hashSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c86cb939b8549edd7953999030affbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c86cb939b8549edd7953999030affbb");
        } else if (hashSet.size() > 0 || this.lastFloatViewNodeSet.size() > 0) {
            this.floatViewNodeSet.clear();
            if (hashSet.size() > 0) {
                this.floatViewNodeSet.addAll(hashSet);
            }
            processData();
        }
    }

    private void processData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7cb0159104f5509317be16c4e6074e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7cb0159104f5509317be16c4e6074e6");
            return;
        }
        this.layoutControl.getContainer().removeCallbacks(this.processRunnable);
        this.layoutControl.getContainer().post(this.processRunnable);
    }

    public void destory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e71689a1e99295e64138b573234c3e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e71689a1e99295e64138b573234c3e2");
        } else if (this.layoutControl != null) {
            this.layoutControl.getContainer().removeCallbacks(this.processRunnable);
        }
    }

    private void updateData() {
        HashSet<ShieldFloatViewDisplayNode> hashSet = this.lastFloatViewNodeSet;
        this.lastFloatViewNodeSet = this.floatViewNodeSet;
        this.floatViewNodeSet = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFloatViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a4bf485b4612f9c477f2bf277c811a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a4bf485b4612f9c477f2bf277c811a1");
            return;
        }
        Iterator<ShieldFloatViewDisplayNode> it = this.floatViewNodeSet.iterator();
        while (it.hasNext()) {
            ShieldFloatViewDisplayNode next = it.next();
            if (next != null) {
                if (this.lastFloatViewNodeSet.remove(next)) {
                    updateFloatView(next);
                } else {
                    if (next.onFloatStateChangeListener != null) {
                        next.onFloatStateChangeListener.onFloatStatusChanged(true);
                    }
                    int i = this.floatViewLoopIndex;
                    this.floatViewLoopIndex = i + 1;
                    addFloatViewToContainer(next, i);
                }
            }
        }
        removeDisappearViews();
        updateData();
    }

    private void addFloatViewToContainer(ShieldFloatViewDisplayNode shieldFloatViewDisplayNode, int i) {
        Object[] objArr = {shieldFloatViewDisplayNode, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ac1da41c533706ae4b35afd618cc858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ac1da41c533706ae4b35afd618cc858");
        } else if (shieldFloatViewDisplayNode.viewPaintingCallback == null) {
        } else {
            shieldFloatViewDisplayNode.createNodeView(this.context, null);
            shieldFloatViewDisplayNode.updateNodeView();
            if (shieldFloatViewDisplayNode.viewHolder == null || shieldFloatViewDisplayNode.viewHolder.itemView == null) {
                return;
            }
            shieldFloatViewDisplayNode.viewHolder.itemView.setLayoutParams(new FrameLayout.LayoutParams(shieldFloatViewDisplayNode.layoutParams.width, shieldFloatViewDisplayNode.layoutParams.height));
            shieldFloatViewDisplayNode.containerView.setLayoutParams(shieldFloatViewDisplayNode.layoutParams);
            ZLayoutChildInfo childInfoByItem = getChildInfoByItem(shieldFloatViewDisplayNode, i);
            if (this.layoutControl.addView(shieldFloatViewDisplayNode.containerView, childInfoByItem)) {
                shieldFloatViewDisplayNode.containerView.removeAllViews();
                shieldFloatViewDisplayNode.containerView.setLayoutTransition(createLayoutTransition(shieldFloatViewDisplayNode));
                shieldFloatViewDisplayNode.containerView.setSubView(shieldFloatViewDisplayNode.viewHolder.itemView);
                if (shieldFloatViewDisplayNode.viewHolder.itemView.getMeasuredHeight() != shieldFloatViewDisplayNode.viewHolder.itemView.getHeight()) {
                    this.layoutControl.requestLayout();
                }
            }
            if (shieldFloatViewDisplayNode.anchorPosition >= 0 && shieldFloatViewDisplayNode.onLayoutParamCalFinishListener == null) {
                shieldFloatViewDisplayNode.onLayoutParamCalFinishListener = new e.a() { // from class: com.dianping.shield.node.adapter.FloatViewManager.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.agentsdk.framework.e.a
                    public void onLayoutParamCalFinish(final DisplayNodeContainer displayNodeContainer, final FrameLayout.LayoutParams layoutParams) {
                        Object[] objArr2 = {displayNodeContainer, layoutParams};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67abee9b0febe54f535b1c361906c659", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67abee9b0febe54f535b1c361906c659");
                            return;
                        }
                        if (layoutParams == null) {
                            layoutParams = new FrameLayout.LayoutParams(0, 0);
                        }
                        if (displayNodeContainer == null || !FloatViewManager.this.checkLayoutParamChange((FrameLayout.LayoutParams) displayNodeContainer.getLayoutParams(), layoutParams)) {
                            return;
                        }
                        displayNodeContainer.post(new Runnable() { // from class: com.dianping.shield.node.adapter.FloatViewManager.3.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "52c8acffcae9419f0f30cf677f2a920f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "52c8acffcae9419f0f30cf677f2a920f");
                                    return;
                                }
                                FrameLayout.LayoutParams layoutParams2 = layoutParams;
                                displayNodeContainer.getNode().viewHolder.itemView.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height));
                                displayNodeContainer.setLayoutParams(layoutParams2);
                            }
                        });
                    }
                };
                setlayoutParamCalback(shieldFloatViewDisplayNode);
            }
            this.floatViewAddInlayoutControlMap.put(shieldFloatViewDisplayNode.containerView, childInfoByItem);
        }
    }

    private void removeDisappearViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d920be7fedbef3f3ed82f9744cf48e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d920be7fedbef3f3ed82f9744cf48e69");
            return;
        }
        Iterator<ShieldFloatViewDisplayNode> it = this.lastFloatViewNodeSet.iterator();
        while (it.hasNext()) {
            ShieldFloatViewDisplayNode next = it.next();
            ShieldViewHolder shieldViewHolder = next.viewHolder;
            if (shieldViewHolder != null) {
                if (next.containerView instanceof ViewGroup) {
                    View view = shieldViewHolder.itemView;
                    view.addOnAttachStateChangeListener(new InternalOnAttachStateChangeListener(next.containerView));
                    next.containerView.removeView(view);
                    this.floatViewAddInlayoutControlMap.remove(next.containerView);
                }
                if (next.anchorPosition >= 0 && next.onLayoutParamCalFinishListener != null) {
                    this.layoutParamCalAndContentYCallback.removeLayoutParamCalFinishCallBack(next.onLayoutParamCalFinishListener);
                }
            }
            if (next.onFloatStateChangeListener != null) {
                next.onFloatStateChangeListener.onFloatStatusChanged(false);
            }
        }
    }

    private void updateFloatView(@NonNull ShieldFloatViewDisplayNode shieldFloatViewDisplayNode) {
        Object[] objArr = {shieldFloatViewDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6c475cbf11d09ba1588bd723cb0e569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6c475cbf11d09ba1588bd723cb0e569");
            return;
        }
        for (Map.Entry<DisplayNodeContainer, ZLayoutChildInfo> entry : this.floatViewAddInlayoutControlMap.entrySet()) {
            DisplayNodeContainer key = entry.getKey();
            ShieldDisplayNode node = key.getNode();
            if (node.equals(shieldFloatViewDisplayNode)) {
                ShieldFloatViewDisplayNode shieldFloatViewDisplayNode2 = (ShieldFloatViewDisplayNode) node;
                if (shieldFloatViewDisplayNode2 != null) {
                    shieldFloatViewDisplayNode2.containerView = null;
                }
                key.setNode(shieldFloatViewDisplayNode);
                shieldFloatViewDisplayNode.containerView = key;
                shieldFloatViewDisplayNode.viewHolder = key.getViewHolder();
                shieldFloatViewDisplayNode.onLayoutParamCalFinishListener = shieldFloatViewDisplayNode2.onLayoutParamCalFinishListener;
                shieldFloatViewDisplayNode.updateNodeView();
                checkAndUpdateAnimatorChange(key, shieldFloatViewDisplayNode);
                if (shieldFloatViewDisplayNode.anchorPosition >= 0) {
                    setlayoutParamCalback(shieldFloatViewDisplayNode);
                    return;
                } else {
                    checkAndUpdateLayoutParamsChange(key, shieldFloatViewDisplayNode);
                    return;
                }
            }
        }
    }

    private void setlayoutParamCalback(@NonNull ShieldFloatViewDisplayNode shieldFloatViewDisplayNode) {
        Object[] objArr = {shieldFloatViewDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "624fc926783f97fef0f4ea292c061024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "624fc926783f97fef0f4ea292c061024");
        } else {
            this.layoutParamCalAndContentYCallback.addLayoutParamCalFinishCallBack(new e(shieldFloatViewDisplayNode.containerView, shieldFloatViewDisplayNode.layoutParams, shieldFloatViewDisplayNode.anchorPosition, shieldFloatViewDisplayNode.onLayoutParamCalFinishListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ZLayoutChildInfo getChildInfoByItem(@NonNull ShieldFloatViewDisplayNode shieldFloatViewDisplayNode, int i) {
        Object[] objArr = {shieldFloatViewDisplayNode, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98c3d21c02f501f34755eaaba98657b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ZLayoutChildInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98c3d21c02f501f34755eaaba98657b0");
        }
        ZLayoutChildInfo zLayoutChildInfo = new ZLayoutChildInfo();
        zLayoutChildInfo.gravity = shieldFloatViewDisplayNode.gravity;
        zLayoutChildInfo.type = this.TYPE;
        zLayoutChildInfo.zPosition = 0;
        zLayoutChildInfo.hoverLayer = ZLayoutChildInfo.HoverLayer.NORMAL_FLOATVIEW_LAYER;
        zLayoutChildInfo.node = shieldFloatViewDisplayNode;
        if (shieldFloatViewDisplayNode.rowParent != null || shieldFloatViewDisplayNode.needFollowScroll) {
            zLayoutChildInfo.zPosition = i;
            zLayoutChildInfo.hoverLayer = ZLayoutChildInfo.HoverLayer.SCROLL_FLOATVIEW_LAYER;
        }
        return zLayoutChildInfo;
    }

    private void checkAndUpdateAnimatorChange(@NonNull DisplayNodeContainer displayNodeContainer, @NonNull ShieldFloatViewDisplayNode shieldFloatViewDisplayNode) {
        DisplayNodeContainer displayNodeContainer2;
        Object[] objArr = {displayNodeContainer, shieldFloatViewDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b48cea0c73e27fb42786dea55ebbc7d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b48cea0c73e27fb42786dea55ebbc7d4");
        } else if (displayNodeContainer.getLayoutTransition() == null) {
        } else {
            Animator animator = displayNodeContainer.getLayoutTransition().getAnimator(2);
            Animator animator2 = displayNodeContainer.getLayoutTransition().getAnimator(3);
            if ((animator == shieldFloatViewDisplayNode.appearingAnimator && animator2 == shieldFloatViewDisplayNode.disappearingAnimator) || !(shieldFloatViewDisplayNode.containerView instanceof ViewGroup) || (displayNodeContainer2 = shieldFloatViewDisplayNode.containerView) == null) {
                return;
            }
            displayNodeContainer2.setLayoutTransition(createLayoutTransition(shieldFloatViewDisplayNode));
        }
    }

    private void checkAndUpdateLayoutParamsChange(@NonNull DisplayNodeContainer displayNodeContainer, @NonNull ShieldFloatViewDisplayNode shieldFloatViewDisplayNode) {
        ShieldViewHolder shieldViewHolder;
        Object[] objArr = {displayNodeContainer, shieldFloatViewDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cb294ab1ad80ef75ab16b4afed6cb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cb294ab1ad80ef75ab16b4afed6cb96");
        } else if ((displayNodeContainer.getLayoutParams() instanceof FrameLayout.LayoutParams) && checkLayoutParamChange((FrameLayout.LayoutParams) displayNodeContainer.getLayoutParams(), shieldFloatViewDisplayNode.layoutParams) && (shieldViewHolder = shieldFloatViewDisplayNode.viewHolder) != null) {
            shieldViewHolder.itemView.setLayoutParams(new FrameLayout.LayoutParams(shieldFloatViewDisplayNode.layoutParams.width, shieldFloatViewDisplayNode.layoutParams.height));
            shieldFloatViewDisplayNode.containerView.setLayoutParams(shieldFloatViewDisplayNode.layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkLayoutParamChange(FrameLayout.LayoutParams layoutParams, FrameLayout.LayoutParams layoutParams2) {
        Object[] objArr = {layoutParams, layoutParams2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "182e211afb96a9d720cbba24810e6e49", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "182e211afb96a9d720cbba24810e6e49")).booleanValue() : ((layoutParams == null && layoutParams == layoutParams2) || (layoutParams.gravity == layoutParams2.gravity && layoutParams.topMargin == layoutParams2.topMargin && layoutParams.leftMargin == layoutParams2.leftMargin && layoutParams.rightMargin == layoutParams2.rightMargin && layoutParams.bottomMargin == layoutParams2.bottomMargin && layoutParams.width == layoutParams2.width && layoutParams.height == layoutParams2.height)) ? false : true;
    }

    private LayoutTransition createLayoutTransition(@NonNull ShieldFloatViewDisplayNode shieldFloatViewDisplayNode) {
        Object[] objArr = {shieldFloatViewDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdcebfaa8d479acc90e527869685d619", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutTransition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdcebfaa8d479acc90e527869685d619");
        }
        if (shieldFloatViewDisplayNode.appearingAnimator == null && shieldFloatViewDisplayNode.disappearingAnimator == null) {
            return null;
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(4);
        if (shieldFloatViewDisplayNode.appearingAnimator != null) {
            setAnimatorToLayoutTransition(2, shieldFloatViewDisplayNode.appearingAnimator, layoutTransition);
        } else {
            layoutTransition.disableTransitionType(2);
        }
        if (shieldFloatViewDisplayNode.disappearingAnimator != null) {
            setAnimatorToLayoutTransition(3, shieldFloatViewDisplayNode.disappearingAnimator, layoutTransition);
        } else {
            layoutTransition.disableTransitionType(3);
        }
        return layoutTransition;
    }

    private void setAnimatorToLayoutTransition(int i, @NonNull Animator animator, @NonNull LayoutTransition layoutTransition) {
        Object[] objArr = {Integer.valueOf(i), animator, layoutTransition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35e79167a97c4f4389bbb35b0eb2ec05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35e79167a97c4f4389bbb35b0eb2ec05");
            return;
        }
        layoutTransition.enableTransitionType(i);
        layoutTransition.setDuration(i, animator.getDuration());
        if (Build.VERSION.SDK_INT >= 18) {
            layoutTransition.setInterpolator(i, animator.getInterpolator());
        }
        layoutTransition.setStartDelay(i, animator.getStartDelay());
        layoutTransition.setAnimator(i, animator);
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "160dbfc6ff26f0d343afd4590c36c64c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "160dbfc6ff26f0d343afd4590c36c64c");
            return;
        }
        this.floatViewNodeSet.clear();
        this.lastFloatViewNodeSet.clear();
        this.floatViewAddInlayoutControlMap.clear();
        this.layoutParamCalAndContentYCallback = null;
        if (this.layoutControl != null && this.layoutControl.getContainer() != null) {
            this.layoutControl.getContainer().removeCallbacks(this.processRunnable);
        }
        this.layoutControl = null;
        this.floatViewLoopIndex = 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class InternalOnAttachStateChangeListener implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ViewGroup parent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        public InternalOnAttachStateChangeListener(ViewGroup viewGroup) {
            Object[] objArr = {FloatViewManager.this, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c54af45754da0dc9655913058aa2e07", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c54af45754da0dc9655913058aa2e07");
            } else {
                this.parent = viewGroup;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6dca8088ecfc456e972a6c341fbb72a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6dca8088ecfc456e972a6c341fbb72a");
                return;
            }
            view.removeOnAttachStateChangeListener(this);
            while (!FloatViewManager.this.layoutControl.isChild(this.parent)) {
                this.parent = (ViewGroup) this.parent.getParent();
            }
            FloatViewManager.this.layoutControl.getContainer().post(new Runnable() { // from class: com.dianping.shield.node.adapter.FloatViewManager.InternalOnAttachStateChangeListener.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea1fb69a3412a79f1d20a2f57cef49a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea1fb69a3412a79f1d20a2f57cef49a3");
                    } else if (FloatViewManager.this.layoutControl != null) {
                        FloatViewManager.this.layoutControl.removeView(InternalOnAttachStateChangeListener.this.parent);
                    }
                }
            });
        }
    }
}
