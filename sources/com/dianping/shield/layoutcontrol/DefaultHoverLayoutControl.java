package com.dianping.shield.layoutcontrol;

import android.animation.LayoutTransition;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.layoutcontrol.IHoverLayout;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DefaultHoverLayoutControl implements IHoverLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinkedList<IHoverLayout.OnChildHeightChangeListener> childHeightChangeListenerList;
    private View.OnLayoutChangeListener childLayoutChangeListener;
    private Map<View, ZLayoutChildInfo> childsInfoMap;
    private Map<InnerHoverInfo.HoverType, List<View>> childsMap;
    private IDrawChildViewForeground drawViewForeground;
    private IScreenVisibleExposeEdge globalExtraNodeExposeInterface;
    private IZViewContainer zContainer;
    private ViewGroup zFrameLayout;

    public DefaultHoverLayoutControl(@NonNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49f407a66df490fe68409c10a678b47a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49f407a66df490fe68409c10a678b47a");
            return;
        }
        this.childsMap = new HashMap(2);
        this.childsInfoMap = new HashMap(2);
        this.childLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.dianping.shield.layoutcontrol.DefaultHoverLayoutControl.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b7d7eceb1ce5d808b322c1bfc9848c96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b7d7eceb1ce5d808b322c1bfc9848c96");
                } else if (view == null || i4 - i2 == i8 - i6) {
                } else {
                    if (DefaultHoverLayoutControl.this.childHeightChangeListenerList != null && DefaultHoverLayoutControl.this.childHeightChangeListenerList.size() > 0) {
                        Iterator it = DefaultHoverLayoutControl.this.childHeightChangeListenerList.iterator();
                        while (it.hasNext()) {
                            ((IHoverLayout.OnChildHeightChangeListener) it.next()).onChildHeightChangeListener(view, i2, i4, i6, i8);
                        }
                    }
                    DefaultHoverLayoutControl.this.callScreenExtraVisibleNodeExpose();
                }
            }
        };
        this.drawViewForeground = new IDrawChildViewForeground() { // from class: com.dianping.shield.layoutcontrol.DefaultHoverLayoutControl.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.layoutcontrol.IDrawChildViewForeground
            public void onDraw(Canvas canvas, View view, View view2) {
                Object[] objArr2 = {canvas, view, view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "796a42382d84ceef3b7f3c2380691e5d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "796a42382d84ceef3b7f3c2380691e5d");
                    return;
                }
                ZLayoutChildInfo zLayoutChildInfo = (ZLayoutChildInfo) DefaultHoverLayoutControl.this.childsInfoMap.get(view2);
                if (zLayoutChildInfo != null) {
                    if (zLayoutChildInfo.topDrawable != null) {
                        int floor = (int) Math.floor(view2.getY());
                        zLayoutChildInfo.topDrawable.setBounds(view2.getLeft(), floor, view2.getRight(), floor + 1);
                        zLayoutChildInfo.topDrawable.setAlpha((int) (view2.getAlpha() * 255.0f));
                        zLayoutChildInfo.topDrawable.draw(canvas);
                    }
                    if (zLayoutChildInfo.bottomDrawable != null) {
                        int floor2 = (((int) Math.floor(view2.getY())) + view2.getHeight()) - 1;
                        zLayoutChildInfo.bottomDrawable.setBounds(view2.getLeft(), floor2, view2.getRight(), floor2 + 1);
                        zLayoutChildInfo.bottomDrawable.setAlpha((int) (view2.getAlpha() * 255.0f));
                        zLayoutChildInfo.bottomDrawable.draw(canvas);
                    }
                }
            }
        };
        if (viewGroup instanceof IZViewContainer) {
            this.zContainer = (IZViewContainer) viewGroup;
            this.zFrameLayout = viewGroup;
        } else {
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            this.zFrameLayout = new ZFrameLayout(viewGroup.getContext());
            this.zContainer = (IZViewContainer) this.zFrameLayout;
            viewGroup.addView(this.zFrameLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        this.zContainer.setPrivateHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.dianping.shield.layoutcontrol.DefaultHoverLayoutControl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                Object[] objArr2 = {view, view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88f79dc11229636e612476626cfffd6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88f79dc11229636e612476626cfffd6f");
                    return;
                }
                ZLayoutChildInfo zLayoutChildInfo = (ZLayoutChildInfo) view2.getTag(R.id.hover_type_tag_id);
                if (zLayoutChildInfo != null) {
                    DefaultHoverLayoutControl.this.addChildToMap(view2, zLayoutChildInfo);
                    view2.setTag(R.id.hover_type_tag_id, null);
                }
                view2.addOnLayoutChangeListener(DefaultHoverLayoutControl.this.childLayoutChangeListener);
                DefaultHoverLayoutControl.this.callScreenExtraVisibleNodeExpose();
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                Object[] objArr2 = {view, view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3dc34450edff37763e743410fb57e276", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3dc34450edff37763e743410fb57e276");
                    return;
                }
                ZLayoutChildInfo zLayoutChildInfo = (ZLayoutChildInfo) DefaultHoverLayoutControl.this.childsInfoMap.get(view2);
                if (zLayoutChildInfo != null) {
                    DefaultHoverLayoutControl.this.removeChildFromMap(view2, zLayoutChildInfo);
                }
                view2.removeOnLayoutChangeListener(DefaultHoverLayoutControl.this.childLayoutChangeListener);
                DefaultHoverLayoutControl.this.childsInfoMap.remove(view2);
                DefaultHoverLayoutControl.this.callScreenExtraVisibleNodeExpose();
            }
        });
        this.zContainer.setDrawViewForeground(this.drawViewForeground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildToMap(View view, ZLayoutChildInfo zLayoutChildInfo) {
        Object[] objArr = {view, zLayoutChildInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed93c3c9c4e9c3efcd6e5b79268dc3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed93c3c9c4e9c3efcd6e5b79268dc3d0");
            return;
        }
        List<View> list = this.childsMap.get(zLayoutChildInfo.type);
        if (list == null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(view);
            this.childsMap.put(zLayoutChildInfo.type, linkedList);
        } else if (!list.contains(view)) {
            list.add(view);
        }
        this.childsInfoMap.put(view, zLayoutChildInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildFromMap(View view, ZLayoutChildInfo zLayoutChildInfo) {
        int indexOf;
        Object[] objArr = {view, zLayoutChildInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "395bd5a553f844660575ddd510b2c359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "395bd5a553f844660575ddd510b2c359");
            return;
        }
        List<View> list = this.childsMap.get(zLayoutChildInfo.type);
        if (list != null && (indexOf = list.indexOf(view)) >= 0) {
            list.remove(indexOf);
        }
        this.childsInfoMap.remove(view);
    }

    private List<View> getChildsFromMapByType(InnerHoverInfo.HoverType hoverType) {
        Object[] objArr = {hoverType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5ee424a652959994f7e81ad8f78c9c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5ee424a652959994f7e81ad8f78c9c7");
        }
        List<View> list = this.childsMap.get(hoverType);
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            linkedList.addAll(list);
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callScreenExtraVisibleNodeExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5373d02326d93a90c6acfb3b0ceab05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5373d02326d93a90c6acfb3b0ceab05");
        } else if (this.globalExtraNodeExposeInterface != null) {
            this.globalExtraNodeExposeInterface.onShieldExtraVisibleNodeChange();
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public boolean removeView(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9347c9ff771ed737ca4384af7b0903b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9347c9ff771ed737ca4384af7b0903b0")).booleanValue();
        }
        if (isChild(view)) {
            getContainer().removeView(view);
            return true;
        }
        return false;
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public boolean removeView(@NonNull View view, InnerHoverInfo.HoverType hoverType) {
        List<View> list;
        Object[] objArr = {view, hoverType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c23080d04fc81416a8125de20c2ac906", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c23080d04fc81416a8125de20c2ac906")).booleanValue();
        }
        if (isChild(view) && (list = this.childsMap.get(hoverType)) != null && list.contains(view)) {
            getContainer().removeView(view);
            return true;
        }
        return false;
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public boolean addView(@NonNull View view, @NonNull ZLayoutChildInfo zLayoutChildInfo) {
        FrameLayout.LayoutParams layoutParams;
        Object[] objArr = {view, zLayoutChildInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d7885e76ded6e705dab3218d97e8432", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d7885e76ded6e705dab3218d97e8432")).booleanValue();
        }
        boolean hasFocus = view.hasFocus();
        if (view.getParent() != getContainer() && view.getParent() != null) {
            try {
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception e) {
                ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(DefaultHoverLayoutControl.class, e.getMessage(), "NPE_childNull");
            }
        }
        if (view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    layoutParams3.leftMargin = marginLayoutParams.leftMargin;
                    layoutParams3.rightMargin = marginLayoutParams.rightMargin;
                    layoutParams3.topMargin = marginLayoutParams.topMargin;
                    layoutParams3.bottomMargin = marginLayoutParams.bottomMargin;
                }
                layoutParams = layoutParams3;
            }
            layoutParams.gravity = zLayoutChildInfo.gravity;
            view.setTag(R.id.hover_type_tag_id, zLayoutChildInfo);
            if (this.zContainer != null) {
                this.zContainer.addView(view, layoutParams, zLayoutChildInfo.hoverLayer.value() + zLayoutChildInfo.zPosition);
            } else {
                getContainer().addView(view, layoutParams);
            }
            if (hasFocus) {
                view.requestFocus();
            }
            return true;
        }
        return false;
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void updateView(@NonNull View view, @NonNull ZLayoutChildInfo zLayoutChildInfo) {
        boolean z = false;
        Object[] objArr = {view, zLayoutChildInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec527e3f7ee80e8bed1e026f6e799a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec527e3f7ee80e8bed1e026f6e799a79");
        } else if (isChild(view)) {
            ZLayoutChildInfo zLayoutChildInfo2 = this.childsInfoMap.get(view);
            if (zLayoutChildInfo2 == null || zLayoutChildInfo2.translationY != zLayoutChildInfo.translationY) {
                view.setTranslationY(zLayoutChildInfo.translationY);
                z = true;
            }
            if (zLayoutChildInfo.translationY != zLayoutChildInfo.baseY && (zLayoutChildInfo.topDrawable != null || zLayoutChildInfo.bottomDrawable != null || ((zLayoutChildInfo2 != null && zLayoutChildInfo2.topDrawable != null) || (zLayoutChildInfo2 != null && zLayoutChildInfo2.bottomDrawable != null)))) {
                int floor = (int) Math.floor(view.getY());
                invalidate(view.getLeft(), floor, view.getRight(), view.getMeasuredHeight() + floor);
                z = true;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams != null && layoutParams.gravity != zLayoutChildInfo.gravity) {
                layoutParams.gravity = zLayoutChildInfo.gravity;
                view.setLayoutParams(layoutParams);
                z = true;
            }
            if (zLayoutChildInfo2 != null && zLayoutChildInfo.type != zLayoutChildInfo2.type) {
                removeChildFromMap(view, zLayoutChildInfo2);
                zLayoutChildInfo2.type = zLayoutChildInfo.type;
                addChildToMap(view, zLayoutChildInfo2);
            }
            if (zLayoutChildInfo2 != null && (zLayoutChildInfo.zPosition != zLayoutChildInfo2.zPosition || zLayoutChildInfo.hoverLayer != zLayoutChildInfo2.hoverLayer)) {
                this.zContainer.updateView(view, zLayoutChildInfo.hoverLayer.value() + zLayoutChildInfo.zPosition);
            }
            this.childsInfoMap.put(view, zLayoutChildInfo);
            if (z) {
                callScreenExtraVisibleNodeExpose();
            }
        }
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68b87a31fd3724b35170a0a70d3ee23c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68b87a31fd3724b35170a0a70d3ee23c");
        } else {
            getContainer().invalidate(i, i2, i3, i4);
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public boolean isChild(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3fc34a709b08abd5526c51dd902a924", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3fc34a709b08abd5526c51dd902a924")).booleanValue() : view.getParent() == getContainer();
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    @NonNull
    public List<View> getChildsByType(InnerHoverInfo.HoverType hoverType) {
        Object[] objArr = {hoverType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e368caed4cc8a41655cb40b7afcaf8a0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e368caed4cc8a41655cb40b7afcaf8a0") : getChildsFromMapByType(hoverType);
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public View getFocusedChild() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d91ae479e31ae71460e6c06b64e5b975", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d91ae479e31ae71460e6c06b64e5b975") : getContainer().getFocusedChild();
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void clearFocus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31284dbbed0108b9c2e3de1548b74abd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31284dbbed0108b9c2e3de1548b74abd");
        } else {
            getContainer().clearFocus();
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f82da92778b801f965ef9099aa9d64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f82da92778b801f965ef9099aa9d64d");
        } else {
            getContainer().post(new Runnable() { // from class: com.dianping.shield.layoutcontrol.DefaultHoverLayoutControl.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00f05ce7a37e28d475331efc2b37d0be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00f05ce7a37e28d475331efc2b37d0be");
                    } else {
                        DefaultHoverLayoutControl.this.getContainer().requestLayout();
                    }
                }
            });
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void forceMeasure() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "160e99e7c54615a53fc4d0baa56b6663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "160e99e7c54615a53fc4d0baa56b6663");
        } else {
            this.zContainer.forceMeasure();
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public ViewGroup.LayoutParams getLayoutParam(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        Object[] objArr = {marginLayoutParams, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e655ae3a8028e9ab624a841cb2185e47", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e655ae3a8028e9ab624a841cb2185e47");
        }
        if (marginLayoutParams == null) {
            marginLayoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
        layoutParams.leftMargin = marginLayoutParams.leftMargin;
        layoutParams.rightMargin = marginLayoutParams.rightMargin;
        layoutParams.topMargin = marginLayoutParams.topMargin;
        layoutParams.bottomMargin = marginLayoutParams.bottomMargin;
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public int getMeasuredHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41f779f2f426bb12394743d9816fa12e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41f779f2f426bb12394743d9816fa12e")).intValue() : getContainer().getMeasuredHeight();
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public int getMeasuredWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dac6fc484bfa13a3080481da0597591a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dac6fc484bfa13a3080481da0597591a")).intValue() : getContainer().getMeasuredWidth();
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public ViewGroup getContainer() {
        return this.zFrameLayout;
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        Object[] objArr = {layoutTransition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa22666183c2427e840f46fa0ec3ca2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa22666183c2427e840f46fa0ec3ca2f");
        } else {
            getContainer().setLayoutTransition(layoutTransition);
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void addChildHeightChangeListener(IHoverLayout.OnChildHeightChangeListener onChildHeightChangeListener) {
        Object[] objArr = {onChildHeightChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5132f4ca80650e96cb3e14bd47919c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5132f4ca80650e96cb3e14bd47919c6c");
            return;
        }
        if (this.childHeightChangeListenerList == null) {
            this.childHeightChangeListenerList = new LinkedList<>();
        }
        if (this.childHeightChangeListenerList.contains(onChildHeightChangeListener)) {
            return;
        }
        this.childHeightChangeListenerList.add(onChildHeightChangeListener);
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void removeChildHeightChangeListener(IHoverLayout.OnChildHeightChangeListener onChildHeightChangeListener) {
        Object[] objArr = {onChildHeightChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf9e5518139a43014eb375e18a221159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf9e5518139a43014eb375e18a221159");
        } else if (this.childHeightChangeListenerList != null) {
            this.childHeightChangeListenerList.remove(onChildHeightChangeListener);
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public void setGlobalExtraNodeExposeInterface(IScreenVisibleExposeEdge iScreenVisibleExposeEdge) {
        this.globalExtraNodeExposeInterface = iScreenVisibleExposeEdge;
    }

    @Override // com.dianping.shield.node.adapter.status.ICollectionWithExposeElement
    @NotNull
    public List<Pair<ShieldDisplayNode, ViewExtraInfo>> getCurrentElementAndViewExtraInfoList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "668e1a88c78c80a596234cc92b2cc002", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "668e1a88c78c80a596234cc92b2cc002");
        }
        ArrayList arrayList = new ArrayList();
        if (this.globalExtraNodeExposeInterface != null) {
            for (Map.Entry<View, ZLayoutChildInfo> entry : this.childsInfoMap.entrySet()) {
                View key = entry.getKey();
                int[] iArr = new int[2];
                key.getLocationOnScreen(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + key.getWidth(), iArr[1] + key.getHeight());
                ViewExtraInfo viewExtraInfo = new ViewExtraInfo();
                viewExtraInfo.offsetPos = -1;
                viewExtraInfo.spanIndex = 0;
                viewExtraInfo.width = rect.width();
                viewExtraInfo.height = rect.height();
                viewExtraInfo.viewRect = rect;
                if (this.globalExtraNodeExposeInterface.getScreenVisibleEdge().intersect(rect)) {
                    arrayList.add(new Pair(entry.getValue().node, viewExtraInfo));
                }
            }
        }
        return arrayList;
    }

    @Override // com.dianping.shield.layoutcontrol.IHoverLayout
    public List<View> getCurrentHoverView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b01a2034dec3e76977dfe7ea4644a315", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b01a2034dec3e76977dfe7ea4644a315") : new ArrayList(this.childsInfoMap.keySet());
    }
}
