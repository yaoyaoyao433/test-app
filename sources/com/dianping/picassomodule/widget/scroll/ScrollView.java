package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.scroll.e;
import com.dianping.shield.component.extensions.scroll.ScrollDataSource;
import com.dianping.shield.component.extensions.scroll.ScrollRow;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.AttachStatusCollection;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollView extends SmartScrollRecyclerView implements ComponentScrollEventHelper.IScrollRange, IElementContainerExpose {
    public static ChangeQuickRedirect a;
    private boolean A;
    private ScrollDataSource B;
    private RecyclerView.k C;
    private View.OnTouchListener D;
    public ComponentScrollEventHelper.IEventDispatcherProvider b;
    private ComponentScrollEventHelper d;
    private com.dianping.picassomodule.widget.scroll.e e;
    private OnDidInterceptTouchListener f;
    private boolean g;
    private boolean h;
    private boolean i;
    private LinearLayout j;
    private View k;
    private View l;
    private int m;
    private a n;
    private AttachStatusCollection o;
    private d p;
    private e q;
    private c r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private SparseIntArray y;
    private SparseIntArray z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        void attachedStatusChanged(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        void footerAction();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface f {
        int a();

        View a(int i);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getContainerSpanCount() {
        return 1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildLayoutPosition(@NotNull View view) {
        return -1;
    }

    public static /* synthetic */ void a(ScrollView scrollView) {
        int intValue;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, scrollView, changeQuickRedirect, false, "83441364ddca6060e80b1ba7be341376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, scrollView, changeQuickRedirect, false, "83441364ddca6060e80b1ba7be341376");
            return;
        }
        for (int i = 0; i < scrollView.getChildCount(); i++) {
            View childAt = scrollView.getChildAt(i);
            int childLayoutPosition = scrollView.getChildLayoutPosition(childAt);
            if (childAt.getWidth() != scrollView.y.get(childLayoutPosition)) {
                scrollView.y.put(childLayoutPosition, childAt.getWidth());
            }
            if (childLayoutPosition == 0) {
                intValue = scrollView.m;
            } else {
                com.dianping.picassomodule.widget.scroll.e eVar = scrollView.e;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
                intValue = PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "489fc4c5acee6043482300b2add95357", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "489fc4c5acee6043482300b2add95357")).intValue() : eVar.d.c();
            }
            if (intValue != scrollView.z.get(childLayoutPosition)) {
                scrollView.z.put(childLayoutPosition, intValue);
            }
        }
    }

    public static /* synthetic */ void a(ScrollView scrollView, ScrollDirection scrollDirection, Object obj) {
        Object[] objArr = {scrollDirection, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, scrollView, changeQuickRedirect, false, "1a3a903c9902dbaa5318b5e9ac4cbcf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, scrollView, changeQuickRedirect, false, "1a3a903c9902dbaa5318b5e9ac4cbcf7");
        } else {
            com.dianping.picassomodule.utils.a.a(scrollView.o, scrollDirection);
        }
    }

    public static /* synthetic */ boolean b(ScrollView scrollView, boolean z) {
        scrollView.i = false;
        return false;
    }

    public static /* synthetic */ void c(ScrollView scrollView) {
        RecyclerView.s findViewHolderForAdapterPosition;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, scrollView, changeQuickRedirect, false, "6702aeb7afae8cf1fa67b0550055b04c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, scrollView, changeQuickRedirect, false, "6702aeb7afae8cf1fa67b0550055b04c");
        } else if (scrollView.t == -1 || scrollView.u == -1 || !(scrollView.getLayoutManager() instanceof LinearLayoutManager) || (findViewHolderForAdapterPosition = scrollView.findViewHolderForAdapterPosition(((LinearLayoutManager) scrollView.getLayoutManager()).findLastVisibleItemPosition())) == null || findViewHolderForAdapterPosition.itemView != scrollView.j || scrollView.a(findViewHolderForAdapterPosition.itemView) >= 0) {
        } else {
            scrollView.g = false;
            scrollView.getAdapter().notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void q(ScrollView scrollView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, scrollView, changeQuickRedirect, false, "e352410ed9c8c2b1e60d7a2a9513bbd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, scrollView, changeQuickRedirect, false, "e352410ed9c8c2b1e60d7a2a9513bbd9");
        } else if (scrollView.l != null) {
            scrollView.j.removeAllViews();
            scrollView.j.addView(scrollView.l);
        }
    }

    public ScrollView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c83c8fc87a640fe26f054f7998e2c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c83c8fc87a640fe26f054f7998e2c5");
        }
    }

    private ScrollView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0b5b0c4335a001ee19a6e78703b87e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0b5b0c4335a001ee19a6e78703b87e");
        }
    }

    public ScrollView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b02311371269b4347578eae8df6d9fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b02311371269b4347578eae8df6d9fc");
            return;
        }
        this.g = false;
        this.h = false;
        this.i = true;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = new SparseIntArray();
        this.z = new SparseIntArray();
        this.A = false;
        this.C = new RecyclerView.k() { // from class: com.dianping.picassomodule.widget.scroll.ScrollView.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                ScrollDirection scrollDirection;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "939c42f75e7671b73d370af69c0592db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "939c42f75e7671b73d370af69c0592db");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                Object[] objArr3 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "43400b2abbc2c896558ae6d5cf39c244", RobustBitConfig.DEFAULT_VALUE)) {
                    scrollDirection = (ScrollDirection) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "43400b2abbc2c896558ae6d5cf39c244");
                } else {
                    scrollDirection = ScrollDirection.STATIC;
                    if (i2 > 0) {
                        scrollDirection = ScrollDirection.LEFT;
                    } else if (i2 < 0) {
                        scrollDirection = ScrollDirection.RIGHT;
                    }
                }
                ScrollView.a(ScrollView.this, scrollDirection, (Object) null);
                ScrollView.a(ScrollView.this);
                if (ScrollView.this.d == null || !ScrollView.this.d.needScrollEvent()) {
                    return;
                }
                ScrollView.this.d.handleScrollEvent(ScrollView.this.getContentOffset(), i3);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                int a2;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d835cc4cf806dccf2409485515cc396", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d835cc4cf806dccf2409485515cc396");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                ScrollView.this.getPositionAndOffset();
                if (i2 == 1 && ScrollView.this.d != null && ScrollView.this.d.needDragEvent()) {
                    ScrollView.this.d.handleBeginDrag();
                }
                if (ScrollView.this.g) {
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int itemCount = linearLayoutManager.getItemCount() - 1;
                    if (findLastVisibleItemPosition != itemCount || (a2 = ScrollView.this.a(recyclerView.findViewHolderForAdapterPosition(itemCount).itemView)) >= 0) {
                        return;
                    }
                    recyclerView.smoothScrollBy(a2, 0);
                    if (!ScrollView.this.v || ScrollView.this.p == null) {
                        return;
                    }
                    ScrollView.this.p.footerAction();
                    ScrollView.this.v = false;
                    ScrollView.this.a();
                    if (ScrollView.this.r != null) {
                        ScrollView.this.r.attachedStatusChanged(false);
                    }
                }
            }
        };
        this.D = new View.OnTouchListener() { // from class: com.dianping.picassomodule.widget.scroll.ScrollView.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1c129b8ac4775ba9c5d52dbf38c2607", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1c129b8ac4775ba9c5d52dbf38c2607")).booleanValue();
                }
                if (ScrollView.this.g && (view instanceof RecyclerView)) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    if (motionEvent.getAction() == 2) {
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        int itemCount = linearLayoutManager.getItemCount() - 1;
                        if (findLastVisibleItemPosition == itemCount) {
                            View view2 = recyclerView.findViewHolderForAdapterPosition(itemCount).itemView;
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            int a2 = iArr[0] - (aq.a(ScrollView.this.getContext()) - ScrollView.this.getPaddingRight());
                            int width = view2.getWidth();
                            if (ScrollView.this.q != null) {
                                e unused = ScrollView.this.q;
                                Math.abs(a2);
                            }
                            boolean z = ((double) Math.abs(a2)) > (ScrollView.this.s < 0 ? ((double) width) * 0.8d : (double) ScrollView.this.s);
                            ScrollView.this.v = z;
                            if (!z) {
                                ScrollView.this.a();
                            } else {
                                ScrollView.q(ScrollView.this);
                            }
                            if (ScrollView.this.r != null && (ScrollView.this.h != z || (ScrollView.this.i && z))) {
                                ScrollView.this.r.attachedStatusChanged(z);
                                ScrollView.b(ScrollView.this, false);
                            }
                            ScrollView.this.h = z;
                        }
                    }
                }
                return false;
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66bb5d8981a3526735a00a79aee0d06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66bb5d8981a3526735a00a79aee0d06b");
        } else {
            this.j = new LinearLayout(getContext());
            setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.dianping.picassomodule.widget.scroll.ScrollView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d68ff177409038c685cedc53da2b553", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d68ff177409038c685cedc53da2b553");
                    } else {
                        ScrollView.a(ScrollView.this);
                    }
                }
            });
        }
        this.d = new ComponentScrollEventHelper(context, this, this);
        this.e = new com.dianping.picassomodule.widget.scroll.e(getContext(), this);
        addOnScrollListener(this.C);
        setOnTouchListener(this.D);
    }

    public final void a(e.a aVar, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4888883a88927351972d90ac92b2b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4888883a88927351972d90ac92b2b3a");
            return;
        }
        this.A = z2;
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "3cd49a9b79a46d90e52b1b992103d086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "3cd49a9b79a46d90e52b1b992103d086");
            return;
        }
        if (aVar == e.a.NORMAL) {
            if (eVar.e != e.a.NORMAL) {
                eVar.d = new com.dianping.picassomodule.widget.scroll.a(eVar.b, eVar.c);
                eVar.c.setLayoutManager(new LinearLayoutManager(eVar.b, 0, false));
            }
        } else {
            if (eVar.e != e.a.PAGE) {
                eVar.d = new com.dianping.picassomodule.widget.scroll.c(eVar.b, eVar.c);
            }
            eVar.d.c(z3);
            eVar.d.d(z2);
            eVar.d.e(z);
        }
        eVar.e = aVar;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200f4c4713b63057d0b817c68ce3aff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200f4c4713b63057d0b817c68ce3aff9");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "ca170aa09ebf864c4e858e729030ae97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "ca170aa09ebf864c4e858e729030ae97");
        } else {
            eVar.d.a(i, i2);
        }
    }

    public void setScrollEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca349c16ffa3b9ceb283ef4066a1a146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca349c16ffa3b9ceb283ef4066a1a146");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "aba833354812b59ac7e0343a54e5b11d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "aba833354812b59ac7e0343a54e5b11d");
        } else {
            eVar.d.b(z);
        }
    }

    public void setSelectedIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8493aaf7ec7158dddc8811e4116a026a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8493aaf7ec7158dddc8811e4116a026a");
        } else if (i >= 0) {
            com.dianping.picassomodule.widget.scroll.e eVar = this.e;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "ddfa29cdfa235b8b244682fb01d33f5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "ddfa29cdfa235b8b244682fb01d33f5d");
            } else {
                eVar.d.b(i);
            }
        }
    }

    public void setOnPageSelectedListener(com.dianping.picassomodule.widget.scroll.pager.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2093ec79a5ac04088a8c62517522065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2093ec79a5ac04088a8c62517522065");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b3225603acfecb8fbf67931166d01604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b3225603acfecb8fbf67931166d01604");
        } else {
            eVar.d.a(bVar);
        }
    }

    public final void a(boolean z, @Nullable List<Integer> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91cf5d0950e87c3b321440224a5ed032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91cf5d0950e87c3b321440224a5ed032");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a9b4118094662b5851a4161db665fe79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a9b4118094662b5851a4161db665fe79");
        } else {
            eVar.d.a(z, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65c1ea0199b1767372b6b474e8dc31c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65c1ea0199b1767372b6b474e8dc31c")).intValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0] - aq.a(getContext());
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecbd5e5d92fe3c2de223c510b0533aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecbd5e5d92fe3c2de223c510b0533aaa");
        } else {
            a(i, i2, 0, 0);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e8a739e0e0314ea552ae3310581a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e8a739e0e0314ea552ae3310581a76");
            return;
        }
        this.m = i;
        this.e.a(i, i2, i3, i4);
    }

    public final void b(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6174c7a8cb986556091163c703c2e390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6174c7a8cb986556091163c703c2e390");
        } else if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).setMargins(i, i2, i3, i4);
        }
    }

    public void setGap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6e59e9b28ed6e6e92508473ad69c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6e59e9b28ed6e6e92508473ad69c35");
        } else {
            c(i, 0);
        }
    }

    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05fb9145338b41d00af2ef27e376e336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05fb9145338b41d00af2ef27e376e336");
        } else {
            this.e.a(i, i2);
        }
    }

    public void setGalleryGap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9623ead315e3b8610e41179df2c677dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9623ead315e3b8610e41179df2c677dd");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "c817ce8846328943c9de9626dea0141f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "c817ce8846328943c9de9626dea0141f");
        } else {
            eVar.d.e(i);
        }
    }

    public final void a(boolean z, int i) {
        Object[] objArr = {(byte) 1, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a6ba7cb2d2523e98e4cc2fbd85c6ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a6ba7cb2d2523e98e4cc2fbd85c6ec");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {(byte) 1, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "96d1bd9e4c5c727fa2939c608dbac5bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "96d1bd9e4c5c727fa2939c608dbac5bd");
        } else {
            eVar.d.a(true, i);
        }
    }

    public void setAdapter(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe3aa656b2699c1d840451c10de73b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe3aa656b2699c1d840451c10de73b6");
        } else {
            a(fVar, (View) null, (View) null);
        }
    }

    public void setScrollEventDispatcher(ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b20c861bdbbeb63ea83d51efdc3ada6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b20c861bdbbeb63ea83d51efdc3ada6");
            return;
        }
        this.b = iEventDispatcherProvider;
        this.d.setEventDispatcher(iEventDispatcherProvider);
    }

    public void setOnDidInterceptTouchListener(OnDidInterceptTouchListener onDidInterceptTouchListener) {
        this.f = onDidInterceptTouchListener;
    }

    public void setAttachTriggerDistance(int i) {
        this.s = i;
    }

    public void setScrollRow(@NotNull ScrollRow scrollRow) {
        Object[] objArr = {scrollRow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ebe8fe4fcda5960ff80104a6234dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ebe8fe4fcda5960ff80104a6234dc3");
            return;
        }
        if (this.B == null) {
            this.B = new ScrollDataSource();
        }
        this.B.setShieldRow(scrollRow);
        this.B.setParentView(this);
        this.B.setContext(getContext());
        this.B.setLoop(this.A);
        a(new f() { // from class: com.dianping.picassomodule.widget.scroll.ScrollView.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.picassomodule.widget.scroll.ScrollView.f
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a89ab06efdcd5b7d2f5dafbbee22a49", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a89ab06efdcd5b7d2f5dafbbee22a49")).intValue() : ScrollView.this.B.getSize();
            }

            @Override // com.dianping.picassomodule.widget.scroll.ScrollView.f
            public final View a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7af00276176d67f9cdaf84366276485d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7af00276176d67f9cdaf84366276485d") : ScrollView.this.B.getView(i);
            }
        }, this.B.getBouncyView(scrollRow.normalAttachView), this.B.getBouncyView(scrollRow.triggeredAttachView));
    }

    private void a(f fVar, @Nullable View view, @Nullable View view2) {
        boolean z = false;
        Object[] objArr = {fVar, view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b1f370d65d1f7c3bb004f04552ce2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b1f370d65d1f7c3bb004f04552ce2e");
            return;
        }
        if (view != null && a(fVar)) {
            z = true;
        }
        this.g = z;
        this.k = view;
        this.l = view2;
        a();
        this.e.a(this.g);
        this.e.a(fVar);
        this.n = new a(fVar);
        this.o = new AttachStatusCollection();
        this.o.setElementContainerCommonFeature(this);
        setAdapter(this.n);
        b();
        post(new Runnable() { // from class: com.dianping.picassomodule.widget.scroll.ScrollView.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f75340998be38f71a81887b3224676c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f75340998be38f71a81887b3224676c");
                } else {
                    ScrollView.c(ScrollView.this);
                }
            }
        });
    }

    @Override // com.dianping.shield.node.adapter.status.IElementContainerExpose
    public void setViewLocationProcessors(@NonNull ArrayList<ViewLocationChangeProcessor<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0edf674a7fc81e6ea33f671df33aa0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0edf674a7fc81e6ea33f671df33aa0d");
        } else if (this.o != null) {
            this.o.removeAllViewLocationProcessors();
            Iterator<ViewLocationChangeProcessor<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                this.o.addAttStatusManager(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a32055161b0a2d8a9e8bcda1ffe04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a32055161b0a2d8a9e8bcda1ffe04a");
        } else if (this.k != null) {
            this.j.removeAllViews();
            this.j.addView(this.k);
        }
    }

    public void setOnItemClickListener(com.dianping.picassomodule.widget.scroll.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75189891e702c5523f7c76e77a5f3a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75189891e702c5523f7c76e77a5f3a6b");
            return;
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "ba6291839b1cdfd6ae3f9f5f1e40535c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "ba6291839b1cdfd6ae3f9f5f1e40535c");
        } else {
            eVar.d.a(bVar);
        }
    }

    public void setOnFooterActionListener(d dVar) {
        this.p = dVar;
    }

    public void setAttachedStatusChangedListener(c cVar) {
        this.r = cVar;
    }

    public void setOnFooterVisibleLengthListener(e eVar) {
        this.q = eVar;
    }

    private boolean a(f fVar) {
        int i;
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d484b428db3a8f41cec6c7a10d809800", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d484b428db3a8f41cec6c7a10d809800")).booleanValue();
        }
        if (fVar != null) {
            i = 0;
            for (int i2 = 0; i2 < fVar.a(); i2++) {
                View a2 = fVar.a(i2);
                if (a2 != null) {
                    a2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i += a2.getMeasuredWidth();
                }
            }
        } else {
            i = 0;
        }
        return i > (aq.a(getContext()) - this.e.a().left) - this.e.a().right;
    }

    private ArrayList<Integer> getCurrentVisibleViewItemPositions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3e48c02dadd6966ddd78971095674b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3e48c02dadd6966ddd78971095674b");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.t = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
        this.u = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        if (this.t == -1 || this.u == -1) {
            return arrayList;
        }
        for (int i = this.t; i <= this.u && i >= 0; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd76998344d15a33b5aad2730e6eaed4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd76998344d15a33b5aad2730e6eaed4")).intValue();
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "d24a3b0c6fb89ba131077f37c109374e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "d24a3b0c6fb89ba131077f37c109374e")).intValue() : eVar.d.b();
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public View getElementChildView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46aa4356d50598a3b6c7d686c05c8bf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46aa4356d50598a3b6c7d686c05c8bf9");
        }
        com.dianping.picassomodule.widget.scroll.e eVar = this.e;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "4cc4e8893cc13ecdb9f87604ab8f60b9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "4cc4e8893cc13ecdb9f87604ab8f60b9") : eVar.d.d(i);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public Rect getContainerEdgeRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01f881f4a388af109ab17c8322c05d5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01f881f4a388af109ab17c8322c05d5b");
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[0] + getWidth();
        rect.bottom = iArr[1] + getHeight();
        return rect;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onAppear(@NotNull final ScrollDirection scrollDirection, @org.jetbrains.annotations.Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5835c94325e0e84b76d01b8350e6db65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5835c94325e0e84b76d01b8350e6db65");
        } else {
            post(new Runnable() { // from class: com.dianping.picassomodule.widget.scroll.ScrollView.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca823bf85a841ef8e974b9df33860388", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca823bf85a841ef8e974b9df33860388");
                    } else {
                        com.dianping.picassomodule.utils.a.b(ScrollView.this.o, scrollDirection);
                    }
                }
            });
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onDisappear(@NotNull ScrollDirection scrollDirection, @org.jetbrains.annotations.Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c2c8b5592ac25cad7d9b45425872e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c2c8b5592ac25cad7d9b45425872e74");
        } else {
            com.dianping.picassomodule.utils.a.c(this.o, scrollDirection);
        }
    }

    @Override // com.dianping.picassomodule.widget.scroll.SmartScrollRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "698ea0106c401e628327763a39580812", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "698ea0106c401e628327763a39580812")).booleanValue();
        }
        if (this.d != null) {
            if (this.d.needDragEvent()) {
                this.d.handleEndDragByTouchEvent(motionEvent);
            }
            if (this.d.needMomentumEvent()) {
                this.d.handleMomentumScrollAndDragEndByEvent(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.dianping.picassomodule.widget.scroll.SmartScrollRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaeab534f3b89c94a3eed7bed3061454", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaeab534f3b89c94a3eed7bed3061454")).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.i = true;
            this.h = false;
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            if (this.f != null) {
                this.f.onViewDidIntercept(this, motionEvent);
            }
            return true;
        }
        return false;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2629c77010bccb61a9d34ba409a941", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2629c77010bccb61a9d34ba409a941")).intValue() : getHeight();
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94fe0fab8a7080fde70bd0728082e80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94fe0fab8a7080fde70bd0728082e80")).intValue() : computeHorizontalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.a {
        public static ChangeQuickRedirect a;
        private f c;

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            return i;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.s sVar, int i) {
        }

        public a(f fVar) {
            Object[] objArr = {ScrollView.this, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c04d48f7c2ff8c66316e5f3236f497", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c04d48f7c2ff8c66316e5f3236f497");
            } else {
                this.c = fVar;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea01c144394972f5aa031629c999263", RobustBitConfig.DEFAULT_VALUE)) {
                return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea01c144394972f5aa031629c999263");
            }
            if (this.c.a() != i) {
                com.dianping.picassomodule.widget.scroll.e eVar = ScrollView.this.e;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
                return new b(PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "56bd3fc07ffe39c1e34d777fc29c70e1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "56bd3fc07ffe39c1e34d777fc29c70e1") : eVar.d.a(i));
            }
            return new b(ScrollView.this.j);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052962016f3f82eac6d1f04f1954a654", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052962016f3f82eac6d1f04f1954a654")).intValue();
            }
            if (!ScrollView.this.g) {
                com.dianping.picassomodule.widget.scroll.e eVar = ScrollView.this.e;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
                return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "84afe147d4982d42cabf2315f8334ab6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "84afe147d4982d42cabf2315f8334ab6")).intValue() : eVar.d.d();
            }
            return this.c.a() + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPositionAndOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea1737168b86ac8cd68f3d9fd375ea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea1737168b86ac8cd68f3d9fd375ea2");
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        View childAt = linearLayoutManager.getChildAt(0);
        if (childAt != null) {
            int left = childAt.getLeft();
            com.dianping.picassomodule.widget.scroll.e eVar = this.e;
            Object[] objArr2 = {childAt, this};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.e.a;
            this.w = left - (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "0e5762f3f03940f58d16b69635c3dddd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "0e5762f3f03940f58d16b69635c3dddd")).intValue() : eVar.d.a(childAt, this));
            this.x = linearLayoutManager.getPosition(childAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getContentOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa06996301957637a89bf81652df27ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa06996301957637a89bf81652df27ae")).intValue();
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
        View findViewByPosition = getLayoutManager().findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            return 0;
        }
        int left = this.z.get(findFirstVisibleItemPosition) - findViewByPosition.getLeft();
        for (int i = 0; i < findFirstVisibleItemPosition; i++) {
            left += this.y.get(i) + this.z.get(i);
        }
        return left;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b97054a760c6309605bb1b4c9a435c46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b97054a760c6309605bb1b4c9a435c46");
        } else {
            ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(this.x, this.w);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.s {
        public b(View view) {
            super(view);
        }
    }
}
