package com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.cube.pga.action.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.scroll.c;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollCoordinatorLayout;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPNestedContainerComponent extends a<SmoothNestedScrollCoordinatorLayout> {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;
    private MPExpandableHeaderBehavior e;
    private ExpandableHeaderBehavior.c f;
    private boolean g;

    public static /* synthetic */ void a(MPNestedContainerComponent mPNestedContainerComponent, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPNestedContainerComponent, changeQuickRedirect, false, "5150931f3b63dbbaa0296d1c1f84675a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPNestedContainerComponent, changeQuickRedirect, false, "5150931f3b63dbbaa0296d1c1f84675a");
            return;
        }
        MachArray machArray = new MachArray();
        machArray.add(Integer.valueOf(g.c(mPNestedContainerComponent.mMachContext.getContext(), i)));
        mPNestedContainerComponent.dispatchEvent("contentOffsetChange", machArray);
    }

    public static /* synthetic */ void d(MPNestedContainerComponent mPNestedContainerComponent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPNestedContainerComponent, changeQuickRedirect, false, "0aadc0b59fd2cf600a5967c3700d698d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPNestedContainerComponent, changeQuickRedirect, false, "0aadc0b59fd2cf600a5967c3700d698d");
        } else {
            mPNestedContainerComponent.dispatchEvent("expandDragEnd", new MachArray());
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ View createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738dd772f2e7287ed03ca147db33c6c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SmoothNestedScrollCoordinatorLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738dd772f2e7287ed03ca147db33c6c0");
        }
        SmoothNestedScrollCoordinatorLayout smoothNestedScrollCoordinatorLayout = new SmoothNestedScrollCoordinatorLayout(this.mMachContext.getContext());
        smoothNestedScrollCoordinatorLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        return smoothNestedScrollCoordinatorLayout;
    }

    public MPNestedContainerComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7140c3b72f69111419792b2a967c3ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7140c3b72f69111419792b2a967c3ab");
            return;
        }
        this.b = false;
        this.c = false;
        this.g = false;
        Object[] objArr2 = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8fbc2c6cfd75e4a74ae76a2d155b77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8fbc2c6cfd75e4a74ae76a2d155b77d");
        } else if (mPContext != null) {
            Context context = mPContext.getContext();
            if (context instanceof WMRestaurantActivity) {
                ((WMRestaurantActivity) context).e.H.c.a(new b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Boolean bool) {
                        Object[] objArr3 = {bool};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7eceed8507efc784391cd67bb0ac7177", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7eceed8507efc784391cd67bb0ac7177");
                        } else {
                            MPNestedContainerComponent.this.expandBackground();
                        }
                    }
                }).a(a());
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a88a2374d9303da2b59fded86a11f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a88a2374d9303da2b59fded86a11f90");
            return;
        }
        super.updateAttribute(str, obj);
        if ("defaultContentOffset".equalsIgnoreCase(str)) {
            double a2 = g.a(this.mMachContext.getContext(), com.sankuai.waimai.machpro.util.b.b(obj));
            Object[] objArr2 = {Double.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e82622040f5130071f907c8efd7ae2d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e82622040f5130071f907c8efd7ae2d4");
            } else {
                StringBuilder sb = new StringBuilder("setDefaultContentOffset() called with: defaultContentOffset = [");
                sb.append(a2);
                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                this.e.setDefaultPosition((int) a2);
            }
        } else if ("stickyTopOffset".equalsIgnoreCase(str)) {
            double a3 = g.a(this.mMachContext.getContext(), com.sankuai.waimai.machpro.util.b.b(obj));
            Object[] objArr3 = {Double.valueOf(a3)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53cd17f19c388948a28be9e099277a30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53cd17f19c388948a28be9e099277a30");
            } else {
                StringBuilder sb2 = new StringBuilder("setStickyTopOffset() called with: stickyTopOffset = [");
                sb2.append(a3);
                sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                this.e.setMinPosition((int) a3);
            }
        } else if ("enableExpand".equalsIgnoreCase(str)) {
            final boolean d = com.sankuai.waimai.machpro.util.b.d(obj);
            Object[] objArr4 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1cf86052d63580ed0f51723c395a5a11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1cf86052d63580ed0f51723c395a5a11");
            } else {
                StringBuilder sb3 = new StringBuilder("setEnableExpand() called with: enableExpand = [");
                sb3.append(d);
                sb3.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                this.e.setMaxPosition(new ExpandableHeaderBehavior.e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.e
                    public final int a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f199345ac0529890ce03068823c1732f", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f199345ac0529890ce03068823c1732f")).intValue();
                        }
                        if (!d) {
                            return MPNestedContainerComponent.this.e.getDefaultPosition();
                        }
                        return ((SmoothNestedScrollCoordinatorLayout) MPNestedContainerComponent.this.getView()).getHeight();
                    }
                });
            }
        } else if ("expandOffset".equalsIgnoreCase(str)) {
            double a4 = g.a(this.mMachContext.getContext(), com.sankuai.waimai.machpro.util.b.b(obj));
            Object[] objArr5 = {Double.valueOf(a4)};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fc1b7e0eb4e0acfc64793d339d89d930", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fc1b7e0eb4e0acfc64793d339d89d930");
            } else {
                StringBuilder sb4 = new StringBuilder("setExpandOffset() called with: expandOffset = [");
                sb4.append(a4);
                sb4.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
        } else if ("disableNestedScroll".equalsIgnoreCase(str)) {
            boolean d2 = com.sankuai.waimai.machpro.util.b.d(obj);
            Object[] objArr6 = {Byte.valueOf(d2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d83a8a1efb310952221f20975a7b0c96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d83a8a1efb310952221f20975a7b0c96");
            } else {
                StringBuilder sb5 = new StringBuilder("setDisableNestedScroll() called with: disableNestedScroll = [");
                sb5.append(d2);
                sb5.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
        }
        requestLayout();
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d74f9b3f10a3d406bf931e98781cfce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d74f9b3f10a3d406bf931e98781cfce");
            return;
        }
        super.addEventListener(str);
        if ("contentOffsetChange".equalsIgnoreCase(str)) {
            this.b = true;
        } else if ("expandDragEnd".equalsIgnoreCase(str)) {
            this.c = true;
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(final MPComponent mPComponent, MPComponent mPComponent2) {
        int dimensionPixelSize;
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a046f889007911c9e8fd409bd949eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a046f889007911c9e8fd409bd949eb8");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        CoordinatorLayout.c cVar = new CoordinatorLayout.c(-1, -1);
        Map<String, Object> dataAttributes = mPComponent.getDataAttributes();
        if (dataAttributes == null || !dataAttributes.containsKey("data-container-type")) {
            return;
        }
        String str = (String) dataAttributes.get("data-container-type");
        if ("contentContainer".equals(str)) {
            MPExpandableScrollingBehavior mPExpandableScrollingBehavior = new MPExpandableScrollingBehavior();
            mPExpandableScrollingBehavior.setComponent(this);
            cVar.a(mPExpandableScrollingBehavior);
        } else if ("backgroundContainer".equals(str)) {
            this.e = new MPExpandableHeaderBehavior();
            this.e.setPageInfoKeyForListener("ContainerComponent");
            cVar.a(this.e);
            this.e.setScrollHeader(true);
            MPExpandableHeaderBehavior mPExpandableHeaderBehavior = this.e;
            Object[] objArr2 = {mPExpandableHeaderBehavior};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c023914d85a2203590cf5c29b44bca3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c023914d85a2203590cf5c29b44bca3");
            } else {
                mPExpandableHeaderBehavior.setEventListener(new ExpandableHeaderBehavior.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.b
                    public final void a(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7f3450db9588ef69b6dce4b6bbd527f7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7f3450db9588ef69b6dce4b6bbd527f7");
                        } else if (MPNestedContainerComponent.this.c) {
                            MPNestedContainerComponent.d(MPNestedContainerComponent.this);
                        }
                    }
                });
            }
            if ((((SmoothNestedScrollCoordinatorLayout) getView()).getContext() instanceof Activity) && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) ((SmoothNestedScrollCoordinatorLayout) getView()).getContext())) {
                dimensionPixelSize = ((SmoothNestedScrollCoordinatorLayout) getView()).getContext().getResources().getDimensionPixelSize(R.dimen.wm_restaurant_scroll_top_max_height_with_no_immerse) + g.e(((SmoothNestedScrollCoordinatorLayout) getView()).getContext());
            } else {
                dimensionPixelSize = ((SmoothNestedScrollCoordinatorLayout) getView()).getContext().getResources().getDimensionPixelSize(R.dimen.wm_restaurant_scroll_top_max_height_with_no_immerse);
            }
            int a2 = g.a(((SmoothNestedScrollCoordinatorLayout) getView()).getContext(), 300.0f);
            this.e.setMinPosition(dimensionPixelSize);
            this.e.setDefaultPosition(a2);
            this.e.setMaxPosition(new ExpandableHeaderBehavior.e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.e
                public final int a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8636e29185a09e639a807e26e59c9e22", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8636e29185a09e639a807e26e59c9e22")).intValue();
                    }
                    com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("ContainerComponentmaxHeight:" + ((SmoothNestedScrollCoordinatorLayout) MPNestedContainerComponent.this.getView()).getHeight());
                    return ((SmoothNestedScrollCoordinatorLayout) MPNestedContainerComponent.this.getView()).getHeight();
                }
            });
            com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("ContainerComponentminHeight:" + dimensionPixelSize);
            ((SmoothNestedScrollCoordinatorLayout) getView()).postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbb8b83417507ebafa73554bf808f9cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbb8b83417507ebafa73554bf808f9cf");
                        return;
                    }
                    MPNestedContainerComponent.this.e.scrollToDefaultPosition((CoordinatorLayout) MPNestedContainerComponent.this.getView());
                    final ViewGroup viewGroup = (ViewGroup) mPComponent.getView();
                    MPNestedContainerComponent.this.b(viewGroup);
                    View a3 = MPNestedContainerComponent.this.a(viewGroup);
                    if (a3 == null) {
                        return;
                    }
                    a3.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.3.1
                        public static ChangeQuickRedirect a;
                        public int b;
                        public int c;
                        public final int d;

                        {
                            this.d = g.a(((SmoothNestedScrollCoordinatorLayout) MPNestedContainerComponent.this.getView()).getContext(), 15.0f);
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Object[] objArr4 = {view, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ba16c4ef9cc974cc49295df2f7a61964", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ba16c4ef9cc974cc49295df2f7a61964")).booleanValue();
                            }
                            switch (motionEvent.getAction()) {
                                case 0:
                                    this.b = (int) motionEvent.getRawY();
                                    this.c = view.getScrollY();
                                    break;
                                case 1:
                                    this.b = 0;
                                    this.c = 0;
                                    break;
                                case 2:
                                    int rawY = this.b - ((int) motionEvent.getRawY());
                                    int scrollY = view.getScrollY();
                                    int bottom = viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom() - (view.getHeight() + scrollY);
                                    if (rawY > 0 && MPNestedContainerComponent.this.g && scrollY == this.c) {
                                        if (scrollY == 0) {
                                            if (bottom <= 0 && rawY > this.d) {
                                                MPNestedContainerComponent.this.foldBackground();
                                                MPNestedContainerComponent.this.g = false;
                                                break;
                                            }
                                        } else if (rawY > this.d) {
                                            MPNestedContainerComponent.this.foldBackground();
                                            MPNestedContainerComponent.this.g = false;
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return false;
                        }
                    });
                }
            }, 1000L);
        }
        frameLayout.setLayoutParams(cVar);
        frameLayout.addView(mPComponent.getView());
        ((SmoothNestedScrollCoordinatorLayout) this.mView).addView(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View a(ViewGroup viewGroup) {
        View a2;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73aa6ac11e186b23e3b44003bfba61b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73aa6ac11e186b23e3b44003bfba61b9");
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof c) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c884933c0a8a9a41db946f97e20256d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c884933c0a8a9a41db946f97e20256d9");
        } else if (viewGroup != null) {
            final GestureDetector gestureDetector = new GestureDetector(this.mMachContext.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.4
                public static ChangeQuickRedirect a;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d84c4f700f4f0d3e32bd96b42435847", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d84c4f700f4f0d3e32bd96b42435847")).booleanValue();
                    }
                    if (Math.abs(f2) > Math.abs(f) && f2 > 0.0f) {
                        MPNestedContainerComponent.this.scrollContentToTop();
                    }
                    return super.onScroll(motionEvent, motionEvent2, f, f2);
                }
            });
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr2 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c28bb9c9ddf070f9d9ea6e898fdc72bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c28bb9c9ddf070f9d9ea6e898fdc72bf")).booleanValue() : gestureDetector.onTouchEvent(motionEvent);
                }
            });
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && (childAt instanceof ViewGroup)) {
                    b((ViewGroup) childAt);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "022091a9a802d317580611e478772a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "022091a9a802d317580611e478772a20");
            return;
        }
        super.onAttachToParent();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e0014238967ef9f2fbf532b2be0c940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e0014238967ef9f2fbf532b2be0c940");
            return;
        }
        this.f = new ExpandableHeaderBehavior.c() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.c
            public final void a(int i, int i2, int i3, int i4, int i5) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3909a911ccbc3b8401f2aa75d66e2e4f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3909a911ccbc3b8401f2aa75d66e2e4f");
                    return;
                }
                MPNestedContainerComponent.this.g = i >= i5 - 1;
                if (MPNestedContainerComponent.this.b) {
                    MPNestedContainerComponent.a(MPNestedContainerComponent.this, i);
                }
            }
        };
        com.sankuai.waimai.platform.widget.coordinator.b.a("ContainerComponent", this.f);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09875947e190f75679cae3e093dde20c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09875947e190f75679cae3e093dde20c");
            return;
        }
        super.onDetachFromParent();
        com.sankuai.waimai.platform.widget.coordinator.b.b("ContainerComponent", this.f);
        this.f = null;
    }

    @JSMethod(methodName = "backToTop")
    @Keep
    public void backToTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9386fb9082601b9302b506e2d9a9d77e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9386fb9082601b9302b506e2d9a9d77e");
            return;
        }
        MPExpandableHeaderBehavior mPExpandableHeaderBehavior = this.e;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getView();
        if (mPExpandableHeaderBehavior == null || coordinatorLayout == null) {
            return;
        }
        mPExpandableHeaderBehavior.smoothScrollToDefaultPosition(coordinatorLayout);
    }

    @JSMethod(methodName = "expandBackground")
    @Keep
    public void expandBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a35a70924678135965d2501274cbac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a35a70924678135965d2501274cbac");
            return;
        }
        MPExpandableHeaderBehavior mPExpandableHeaderBehavior = this.e;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getView();
        if (mPExpandableHeaderBehavior == null || coordinatorLayout == null) {
            return;
        }
        mPExpandableHeaderBehavior.smoothScrollToMaxPosition(coordinatorLayout);
    }

    @JSMethod(methodName = "foldBackground")
    @Keep
    public void foldBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523692cc877f62d3069e9db49237c6d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523692cc877f62d3069e9db49237c6d6");
            return;
        }
        MPExpandableHeaderBehavior mPExpandableHeaderBehavior = this.e;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getView();
        if (mPExpandableHeaderBehavior == null || coordinatorLayout == null) {
            return;
        }
        mPExpandableHeaderBehavior.smoothScrollToDefaultPosition(coordinatorLayout);
    }

    @JSMethod(methodName = "scrollContentToTop")
    @Keep
    public void scrollContentToTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "337329e177844cece3c76c50e9887116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "337329e177844cece3c76c50e9887116");
            return;
        }
        MPExpandableHeaderBehavior mPExpandableHeaderBehavior = this.e;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getView();
        if (mPExpandableHeaderBehavior == null || coordinatorLayout == null) {
            return;
        }
        mPExpandableHeaderBehavior.smoothScrollToMinPosition(coordinatorLayout);
    }
}
