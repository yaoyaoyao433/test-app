package com.dianping.shield.component.widgets.container.delegate;

import android.content.Context;
import android.support.constraint.R;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.g;
import com.dianping.agentsdk.pagecontainer.b;
import com.dianping.shield.component.entity.ChildBgInfo;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BgMaskFuncDelegate extends PageContainerBaseDelegate<ViewGroup> implements IPageContainerBgMaskFunc, SectionBgViewMapCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<View, ContentOffsetListener> ContentOffsetListenerhashMap;
    private HashMap<g, ChildBgInfo> childBgInfoMap;
    private CommonPageContainer commonPageContainer;
    private HashMap<g, ChildBgInfo> lastChildBgInfoMap;
    private int pageBgColor;
    private View pageBgView;
    private FrameLayout pageBgViewContainer;
    private View pageContentContainer;
    private FrameLayout pageMaskContainer;
    private View pageMaskView;
    private int rvBgColor;
    private View rvBgView;
    private FrameLayout rvBgViewContainer;
    private RelativeLayout rvContentContainer;
    private FrameLayout rvMaskContainer;
    private View rvMaskView;

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a37f089f177bcafc25df06861abc0ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a37f089f177bcafc25df06861abc0ef3");
        }
    }

    public BgMaskFuncDelegate(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d2ecde3056d3f386c132d3d79c401d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d2ecde3056d3f386c132d3d79c401d8");
        } else {
            this.ContentOffsetListenerhashMap = new HashMap<>();
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfeee5e0430f14b3ea6aca897cae2991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfeee5e0430f14b3ea6aca897cae2991");
            return;
        }
        this.pageBgViewContainer = (FrameLayout) getRootView().findViewById(R.id.page_bg_layout);
        this.rvBgViewContainer = (FrameLayout) getRootView().findViewById(R.id.rv_bg_layout);
        this.pageMaskContainer = (FrameLayout) getRootView().findViewById(R.id.page_mask_layout);
        this.rvMaskContainer = (FrameLayout) getRootView().findViewById(R.id.rv_mask_layout);
        this.pageContentContainer = getRootView();
        this.rvContentContainer = (RelativeLayout) getRootView().findViewById(R.id.content_layout);
        this.pageBgViewContainer.setClickable(false);
        this.pageBgViewContainer.setFocusable(false);
        this.pageBgViewContainer.setEnabled(false);
        this.pageMaskContainer.setClickable(false);
        this.pageMaskContainer.setFocusable(false);
        this.pageMaskContainer.setEnabled(false);
        this.rvBgViewContainer.setClickable(false);
        this.rvBgViewContainer.setFocusable(false);
        this.rvBgViewContainer.setEnabled(false);
        this.rvMaskContainer.setClickable(false);
        this.rvMaskContainer.setFocusable(false);
        this.rvMaskContainer.setEnabled(false);
        if (this.pageBgColor != 0) {
            this.pageContentContainer.setBackgroundColor(this.pageBgColor);
        }
        if (this.rvBgColor != 0) {
            this.rvContentContainer.setBackgroundColor(this.rvBgColor);
        }
        if (this.pageBgViewContainer != null && this.pageBgView != null) {
            this.pageBgViewContainer.removeAllViews();
            this.pageBgViewContainer.addView(this.pageBgView);
            this.pageBgViewContainer.setVisibility(0);
        }
        if (this.pageMaskContainer != null && this.pageMaskView != null) {
            this.pageMaskContainer.removeAllViews();
            this.pageMaskContainer.addView(this.pageMaskView);
            this.pageMaskContainer.setVisibility(0);
        }
        if (this.rvBgViewContainer != null && this.rvBgView != null) {
            this.rvBgViewContainer.removeAllViews();
            this.rvBgViewContainer.addView(this.rvBgView);
            this.rvBgViewContainer.setVisibility(0);
        }
        if (this.rvMaskContainer == null || this.rvMaskView == null) {
            return;
        }
        this.rvMaskContainer.removeAllViews();
        this.rvMaskContainer.addView(this.rvMaskView);
        this.rvMaskContainer.setVisibility(0);
    }

    public void setCommonPageContainer(CommonPageContainer commonPageContainer) {
        this.commonPageContainer = commonPageContainer;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6067a17c8f6e1722dace64ba21942858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6067a17c8f6e1722dace64ba21942858");
            return;
        }
        this.rvBgColor = i;
        if (this.rvContentContainer != null) {
            this.rvContentContainer.setBackgroundColor(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setPageBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ad36a0d877a45836eb23193c0d4c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ad36a0d877a45836eb23193c0d4c6b");
            return;
        }
        this.pageBgColor = i;
        if (this.pageContentContainer != null) {
            this.pageContentContainer.setBackgroundColor(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setPageBackgroundView(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e5f2cd5449c34931f958d5181be109d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e5f2cd5449c34931f958d5181be109d");
        } else if (view == null) {
        } else {
            view.setLayoutParams(layoutParams);
            if (this.pageBgViewContainer != null) {
                this.pageBgViewContainer.removeAllViews();
                this.pageBgViewContainer.addView(view);
                this.pageBgViewContainer.setVisibility(0);
            }
            this.pageBgView = view;
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvBackgroundView(View view, final View view2, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, view2, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c82a37a05e41e090fe1b70dc71a593c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c82a37a05e41e090fe1b70dc71a593c");
        } else if (view == null) {
        } else {
            view.setLayoutParams(layoutParams);
            if (this.rvBgViewContainer != null) {
                this.rvBgViewContainer.removeAllViews();
                this.rvBgViewContainer.addView(view);
                this.rvBgViewContainer.setVisibility(0);
            }
            this.rvBgView = view;
            if (this.commonPageContainer != null) {
                this.commonPageContainer.addContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.component.widgets.container.delegate.BgMaskFuncDelegate.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                    public void offsetChanged(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "48f3c6c36d1cffe8bd919afdb8bc4a86", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "48f3c6c36d1cffe8bd919afdb8bc4a86");
                        } else if (view2 != null) {
                            view2.setTranslationY(-i2);
                        }
                    }
                });
            }
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvBackgroundViews(final View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66afe472c33e2a67a1da43f5285b3fdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66afe472c33e2a67a1da43f5285b3fdd");
        } else if (this.rvBgViewContainer == null) {
        } else {
            this.rvBgViewContainer.addView(view, layoutParams);
            this.rvBgViewContainer.setVisibility(0);
            if (this.commonPageContainer != null) {
                ContentOffsetListener contentOffsetListener = new ContentOffsetListener() { // from class: com.dianping.shield.component.widgets.container.delegate.BgMaskFuncDelegate.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                    public void offsetChanged(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "39679dfa0fc1ac13860aa922e9e929d3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "39679dfa0fc1ac13860aa922e9e929d3");
                        } else if (view != null) {
                            view.setTranslationY(-i2);
                        }
                    }
                };
                this.commonPageContainer.addContentOffsetListener(contentOffsetListener);
                this.ContentOffsetListenerhashMap.put(view, contentOffsetListener);
            }
        }
    }

    public void removeRvBackgroundViews(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57b372e41a7f342c6c8dc00203e00bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57b372e41a7f342c6c8dc00203e00bd1");
        } else if (this.rvBgViewContainer == null || view == null || !(this.rvBgViewContainer instanceof FrameLayout)) {
        } else {
            this.ContentOffsetListenerhashMap.remove(view);
            this.rvBgViewContainer.removeView(view);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setPageMaskView(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b172b4b2c54d9117a1394d7020f3d2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b172b4b2c54d9117a1394d7020f3d2c5");
        } else if (view == null) {
        } else {
            view.setLayoutParams(layoutParams);
            if (this.pageMaskContainer != null) {
                this.pageMaskContainer.removeAllViews();
                this.pageMaskContainer.addView(view);
                this.pageMaskContainer.setVisibility(0);
            }
            this.pageMaskView = view;
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvMaskView(View view, final View view2, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, view2, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bef44a4233b7a693399c4cbda195bb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bef44a4233b7a693399c4cbda195bb2");
        } else if (view == null) {
        } else {
            view.setLayoutParams(layoutParams);
            if (this.rvMaskContainer != null) {
                this.rvMaskContainer.removeAllViews();
                this.rvMaskContainer.addView(view);
                this.rvMaskContainer.setVisibility(0);
            }
            this.rvMaskView = view;
            if (this.commonPageContainer != null) {
                this.commonPageContainer.addContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.component.widgets.container.delegate.BgMaskFuncDelegate.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                    public void offsetChanged(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55aee0fafe355c36861a8dd4e3ab1ed7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55aee0fafe355c36861a8dd4e3ab1ed7");
                        } else if (view2 != null) {
                            view2.setTranslationY(-i2);
                        }
                    }
                });
            }
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback
    public void setSectionBgViewMap(@NotNull SparseArray<g> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acefda6615a9b7d7ac4a7fa81177aeac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acefda6615a9b7d7ac4a7fa81177aeac");
        } else if (this.commonPageContainer.getAgentContainerView() != null || (this.commonPageContainer.getAgentContainerView() instanceof PageContainerRecyclerView)) {
            if (sparseArray.size() == 0 && this.lastChildBgInfoMap == null) {
                return;
            }
            if (this.lastChildBgInfoMap == null) {
                this.lastChildBgInfoMap = new HashMap<>(2);
                ((PageContainerRecyclerView) this.commonPageContainer.getAgentContainerView()).addOnTopParamsChangeListener(new b() { // from class: com.dianping.shield.component.widgets.container.delegate.BgMaskFuncDelegate.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.agentsdk.pagecontainer.b
                    public void OnTopParamsChange(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3551d36af987f2ba66ad6199cdf877fc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3551d36af987f2ba66ad6199cdf877fc");
                        } else if (z) {
                            for (Map.Entry entry : BgMaskFuncDelegate.this.lastChildBgInfoMap.entrySet()) {
                                BgMaskFuncDelegate.this.updataLayoutParam((g) entry.getKey(), (ChildBgInfo) entry.getValue());
                            }
                        }
                    }
                });
            }
            processChildBgInfoArray(sparseArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updataLayoutParam(final g gVar, final ChildBgInfo childBgInfo) {
        Object[] objArr = {gVar, childBgInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb786b19749cb6a8a03d385598a21581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb786b19749cb6a8a03d385598a21581");
            return;
        }
        final FrameLayout.LayoutParams handleAnchorViewParam = handleAnchorViewParam(childBgInfo.anchorPosition, transformMarginParamToFrameParam(gVar.d, -1));
        gVar.b.post(new Runnable() { // from class: com.dianping.shield.component.widgets.container.delegate.BgMaskFuncDelegate.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60bca9fb8e0433ea8a412863d0275974", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60bca9fb8e0433ea8a412863d0275974");
                    return;
                }
                FrameLayout.LayoutParams layoutParams = handleAnchorViewParam;
                if (handleAnchorViewParam == null) {
                    layoutParams = new FrameLayout.LayoutParams(0, 0);
                }
                if (aq.a(childBgInfo.layoutParams, layoutParams)) {
                    gVar.b.setLayoutParams(layoutParams);
                }
                childBgInfo.layoutParams = layoutParams;
            }
        });
    }

    private void processChildBgInfoArray(@NotNull SparseArray<g> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63c3997a2006063b98f3811c28b912d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63c3997a2006063b98f3811c28b912d4");
            return;
        }
        if (this.childBgInfoMap == null) {
            this.childBgInfoMap = new HashMap<>(2);
        }
        this.childBgInfoMap.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            g valueAt = sparseArray.valueAt(i);
            if (valueAt != null && valueAt.b != null) {
                int keyAt = sparseArray.keyAt(i);
                ChildBgInfo remove = this.lastChildBgInfoMap.remove(valueAt);
                ChildBgInfo childBgInfo = new ChildBgInfo();
                childBgInfo.backgroundViewInfo = valueAt;
                childBgInfo.anchorPosition = keyAt;
                if (remove != null) {
                    childBgInfo.onChildAttachStateChangeListener = remove.onChildAttachStateChangeListener;
                    childBgInfo.layoutParams = remove.layoutParams;
                    if (remove.anchorPosition != childBgInfo.anchorPosition || aq.a(childBgInfo.backgroundViewInfo.d, remove.backgroundViewInfo.d)) {
                        updataLayoutParam(valueAt, childBgInfo);
                    }
                } else {
                    setRvBackgroundViews(valueAt.b, new FrameLayout.LayoutParams(0, 0));
                    updataLayoutParam(valueAt, childBgInfo);
                }
                this.childBgInfoMap.put(valueAt, childBgInfo);
            }
        }
        if (this.lastChildBgInfoMap.size() != 0) {
            for (g gVar : this.lastChildBgInfoMap.keySet()) {
                removeRvBackgroundViews(gVar.b);
            }
            this.lastChildBgInfoMap.clear();
        }
        HashMap<g, ChildBgInfo> hashMap = this.lastChildBgInfoMap;
        this.lastChildBgInfoMap = this.childBgInfoMap;
        this.childBgInfoMap = hashMap;
    }

    public FrameLayout.LayoutParams handleAnchorViewParam(int i, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b057bf25e4eb09660a9c22fc4d7072a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b057bf25e4eb09660a9c22fc4d7072a2");
        }
        if (i < 0 || this.commonPageContainer.getAgentContainerView() == null || !(this.commonPageContainer.getAgentContainerView() instanceof PageContainerRecyclerView)) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (layoutParams.gravity == -1) {
            layoutParams.gravity = 8388659;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, 0);
        int i2 = layoutParams.gravity & 112;
        int right = this.commonPageContainer.getAgentContainerView().getRight();
        int i3 = absoluteGravity & 7;
        if (i3 != 1) {
            if (i3 == 5) {
                if (layoutParams.width > 0) {
                    layoutParams2.leftMargin = (right - layoutParams.width) - layoutParams.rightMargin;
                }
            } else {
                layoutParams2.leftMargin = layoutParams.leftMargin + 0;
            }
        } else if (layoutParams.width > 0) {
            layoutParams2.leftMargin = (((((right - 0) - layoutParams.width) / 2) + 0) + layoutParams.leftMargin) - layoutParams.rightMargin;
        }
        Pair<Integer, Integer> viewTopBottom = ((PageContainerRecyclerView) this.commonPageContainer.getAgentContainerView()).getViewTopBottom(i);
        if (viewTopBottom == null || ((Integer) viewTopBottom.second).intValue() == 0) {
            return null;
        }
        int intValue = ((Integer) viewTopBottom.first).intValue();
        int intValue2 = ((Integer) viewTopBottom.second).intValue();
        if (i2 != 16) {
            if (i2 == 80) {
                if (layoutParams.height > 0) {
                    layoutParams2.topMargin = (intValue2 - layoutParams.height) - layoutParams.bottomMargin;
                }
            } else {
                layoutParams2.topMargin = intValue + layoutParams.topMargin;
            }
        } else if (layoutParams.height > 0) {
            layoutParams2.topMargin = ((intValue + (((intValue2 - intValue) - layoutParams.height) / 2)) + layoutParams.topMargin) - layoutParams.bottomMargin;
        }
        return layoutParams2;
    }

    private FrameLayout.LayoutParams transformMarginParamToFrameParam(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        FrameLayout.LayoutParams layoutParams;
        Object[] objArr = {marginLayoutParams, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4bb02341707bf0e9cc5e81d8974483f", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4bb02341707bf0e9cc5e81d8974483f");
        }
        if (marginLayoutParams != null) {
            layoutParams = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
            layoutParams.leftMargin = marginLayoutParams.leftMargin;
            layoutParams.rightMargin = marginLayoutParams.rightMargin;
            layoutParams.topMargin = marginLayoutParams.topMargin;
            layoutParams.bottomMargin = marginLayoutParams.bottomMargin;
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    public void clearPageBackgroundView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9e91dad4d1abd5bf32fe6241cff531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9e91dad4d1abd5bf32fe6241cff531");
        } else if (this.pageBgViewContainer != null) {
            this.pageBgViewContainer.removeAllViews();
            this.pageBgViewContainer.setVisibility(8);
        }
    }

    public void clearRvBackgroundView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5c9f032f366facce467c75f1c1bb1b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5c9f032f366facce467c75f1c1bb1b8");
        } else if (this.rvBgViewContainer != null) {
            this.rvBgViewContainer.removeAllViews();
            this.rvBgViewContainer.setVisibility(8);
        }
    }

    public void clearPageMaskView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b91ab3dbd2299a6c3ec81664b4df9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b91ab3dbd2299a6c3ec81664b4df9e1");
        } else if (this.pageMaskContainer != null) {
            this.pageMaskContainer.removeAllViews();
            this.pageMaskContainer.setVisibility(8);
        }
    }

    public void clearRvMaskView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "690925f1685026dab1b23e6a005317c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "690925f1685026dab1b23e6a005317c7");
        } else if (this.rvMaskContainer != null) {
            this.rvMaskContainer.removeAllViews();
            this.rvMaskContainer.setVisibility(8);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71ec25115ff1678bd5a103e61e9cee6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71ec25115ff1678bd5a103e61e9cee6e");
            return;
        }
        this.pageBgColor = 0;
        this.rvBgColor = 0;
        this.pageBgView = null;
        this.rvBgView = null;
        this.pageMaskView = null;
        this.rvMaskView = null;
        if (this.pageBgViewContainer != null) {
            this.pageBgViewContainer.removeAllViews();
            this.pageBgViewContainer.setVisibility(8);
        }
        if (this.rvBgViewContainer != null) {
            this.rvBgViewContainer.removeAllViews();
            this.rvBgViewContainer.setVisibility(8);
        }
        if (this.pageMaskContainer != null) {
            this.pageMaskContainer.removeAllViews();
            this.pageMaskContainer.setVisibility(8);
        }
        if (this.rvMaskContainer != null) {
            this.rvMaskContainer.removeAllViews();
            this.rvMaskContainer.setVisibility(8);
        }
        if (this.pageContentContainer != null) {
            this.pageContentContainer.setBackground(null);
        }
        if (this.rvContentContainer != null) {
            this.rvContentContainer.setBackground(null);
        }
        if (this.lastChildBgInfoMap != null) {
            this.lastChildBgInfoMap.clear();
            this.lastChildBgInfoMap = null;
        }
        if (this.childBgInfoMap != null) {
            this.childBgInfoMap.clear();
            this.childBgInfoMap = null;
        }
        if (this.ContentOffsetListenerhashMap != null) {
            this.ContentOffsetListenerhashMap.clear();
        } else {
            this.ContentOffsetListenerhashMap = new HashMap<>();
        }
        super.shieldRecycle();
        this.pageContentContainer = null;
        this.pageBgViewContainer = null;
        this.rvBgViewContainer = null;
        this.pageMaskContainer = null;
        this.rvMaskContainer = null;
        this.rvContentContainer = null;
    }
}
