package com.sankuai.waimai.business.ugc.machpro.waterfall;

import android.graphics.Rect;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.aq;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.d;
import com.sankuai.waimai.machpro.component.list.MPRecycleView;
import com.sankuai.waimai.machpro.component.list.b;
import com.sankuai.waimai.machpro.component.list.c;
import com.sankuai.waimai.machpro.component.list.e;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPWaterfallComponent extends MPComponent<FrameLayout> implements b {
    public static ChangeQuickRedirect a;
    RecyclerView b;
    public a c;
    public RecyclerView.f d;
    private int e;
    private int f;
    private int g;
    private MPStaggeredGridLayoutManager h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private RecyclerView.k q;
    private RecyclerView.h r;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519de885ceceb1ce2c603dacaf341abe", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519de885ceceb1ce2c603dacaf341abe");
        }
        this.b = new MPRecycleView(this.mMachContext.getContext());
        this.h = new MPStaggeredGridLayoutManager(2, 1, this);
        this.h.setGapStrategy(0);
        this.b.setLayoutManager(this.h);
        ((aq) this.b.getItemAnimator()).setSupportsChangeAnimations(false);
        this.b.setItemAnimator(null);
        this.c = new a();
        this.b.setAdapter(this.c);
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        frameLayout.setClipChildren(true);
        frameLayout.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static /* synthetic */ void a(MPWaterfallComponent mPWaterfallComponent, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPWaterfallComponent, changeQuickRedirect, false, "58a335d1013e296dc853965dde32bcff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPWaterfallComponent, changeQuickRedirect, false, "58a335d1013e296dc853965dde32bcff");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MachMap machMap = new MachMap();
            machMap.put(Constants.GestureMoveEvent.KEY_X, 0);
            machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(mPWaterfallComponent.mMachContext.getContext(), mPWaterfallComponent.b.computeVerticalScrollOffset())));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            mPWaterfallComponent.dispatchEvent(str, machArray);
        }
    }

    public MPWaterfallComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be043c13941abb598a99bc3945fb5bb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be043c13941abb598a99bc3945fb5bb2");
            return;
        }
        this.e = 0;
        this.q = new RecyclerView.k() { // from class: com.sankuai.waimai.business.ugc.machpro.waterfall.MPWaterfallComponent.2
            public static ChangeQuickRedirect a;
            private int c = 0;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f801ebcc7110c9a75f5e320728d1e51a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f801ebcc7110c9a75f5e320728d1e51a");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != this.c) {
                    if (i == 1 && MPWaterfallComponent.this.k) {
                        MPWaterfallComponent.a(MPWaterfallComponent.this, "scrollStart");
                    } else if (i != 2) {
                        if (i == 0 && MPWaterfallComponent.this.l) {
                            MPWaterfallComponent.a(MPWaterfallComponent.this, "scrollEnd");
                        }
                    } else if (this.c == 1 && MPWaterfallComponent.this.j) {
                        MPWaterfallComponent.a(MPWaterfallComponent.this, "dragEnd");
                    } else if (this.c == 0 && MPWaterfallComponent.this.k) {
                        MPWaterfallComponent.a(MPWaterfallComponent.this, "scrollStart");
                    }
                    this.c = i;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d3810e73b8fc1a6fa8c1c0e00082584", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d3810e73b8fc1a6fa8c1c0e00082584");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (!MPWaterfallComponent.this.i || this.c == 0) {
                    return;
                }
                MPWaterfallComponent.a(MPWaterfallComponent.this, com.meituan.metrics.common.Constants.FPS_TYPE_SCROLL);
            }
        };
        this.r = new RecyclerView.h() { // from class: com.sankuai.waimai.business.ugc.machpro.waterfall.MPWaterfallComponent.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.h
            public final void onChildViewAttachedToWindow(View view) {
                int childAdapterPosition;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c90df47ee001697e708b78f99b49d5d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c90df47ee001697e708b78f99b49d5d1");
                } else if (!MPWaterfallComponent.this.m || (childAdapterPosition = MPWaterfallComponent.this.b.getChildAdapterPosition(view)) < 0 || MPWaterfallComponent.this.c.getItemViewType(childAdapterPosition) == 102) {
                } else {
                    if (childAdapterPosition == 0 && MPWaterfallComponent.this.c.b()) {
                        return;
                    }
                    int b = MPWaterfallComponent.this.c.b(childAdapterPosition);
                    MachArray machArray = new MachArray();
                    machArray.add(Integer.valueOf(b));
                    MPWaterfallComponent.this.dispatchEvent("cellAppear", machArray);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.h
            public final void onChildViewDetachedFromWindow(View view) {
                int childAdapterPosition;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28a13e71254f29a86652c46b0b2d755c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28a13e71254f29a86652c46b0b2d755c");
                } else if (!MPWaterfallComponent.this.n || (childAdapterPosition = MPWaterfallComponent.this.b.getChildAdapterPosition(view)) < 0 || MPWaterfallComponent.this.c.getItemViewType(childAdapterPosition) == 102) {
                } else {
                    if (childAdapterPosition == 0 && MPWaterfallComponent.this.c.b()) {
                        return;
                    }
                    int b = MPWaterfallComponent.this.c.b(childAdapterPosition);
                    MachArray machArray = new MachArray();
                    machArray.add(Integer.valueOf(b));
                    MPWaterfallComponent.this.dispatchEvent("cellDisappear", machArray);
                }
            }
        };
        this.d = new RecyclerView.f() { // from class: com.sankuai.waimai.business.ugc.machpro.waterfall.MPWaterfallComponent.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20907282b4a35f0594d39d27454a0e30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20907282b4a35f0594d39d27454a0e30");
                    return;
                }
                int b = ((StaggeredGridLayoutManager.b) view.getLayoutParams()).b();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == 0 && MPWaterfallComponent.this.c.b()) {
                    rect.top = 0;
                    return;
                }
                if (MPWaterfallComponent.this.c != null) {
                    childAdapterPosition = MPWaterfallComponent.this.c.b(childAdapterPosition);
                }
                if (childAdapterPosition != 0 && childAdapterPosition != 1) {
                    rect.top = MPWaterfallComponent.this.g;
                } else {
                    rect.top = 0;
                }
                if (b % 2 == 0) {
                    rect.left = MPWaterfallComponent.this.e;
                    rect.right = MPWaterfallComponent.this.f / 2;
                    return;
                }
                rect.left = MPWaterfallComponent.this.f / 2;
                rect.right = MPWaterfallComponent.this.e;
            }
        };
        this.b.addItemDecoration(this.d);
        this.b.addOnScrollListener(this.q);
        this.b.addOnChildAttachStateChangeListener(this.r);
    }

    @Override // com.sankuai.waimai.machpro.component.list.b
    public final RecyclerView a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int[] iArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1bbc17aed3164f692fc8b80c7fcaa3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1bbc17aed3164f692fc8b80c7fcaa3f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4175d305108daaa279fafc97b7723eb6", RobustBitConfig.DEFAULT_VALUE)) {
            iArr = (int[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4175d305108daaa279fafc97b7723eb6");
        } else {
            int[] iArr2 = {-1, -1};
            if (this.h != null) {
                int[] findFirstVisibleItemPositions = this.h.findFirstVisibleItemPositions(null);
                int[] findLastVisibleItemPositions = this.h.findLastVisibleItemPositions(null);
                if (findFirstVisibleItemPositions != null && findFirstVisibleItemPositions.length == 2 && findLastVisibleItemPositions != null && findLastVisibleItemPositions.length == 2) {
                    iArr2[0] = Math.min(findFirstVisibleItemPositions[0], findFirstVisibleItemPositions[1]);
                    iArr2[1] = Math.max(findLastVisibleItemPositions[0], findLastVisibleItemPositions[1]);
                }
            }
            iArr = iArr2;
        }
        if (iArr[0] != -1 && iArr[1] != -1) {
            this.c.notifyItemRangeChanged(iArr[0], (iArr[1] - iArr[0]) + 1);
        } else {
            this.c.notifyItemRangeChanged(0, this.c.getItemCount());
        }
    }

    @JSMethod(methodName = "reloadData")
    @Keep
    public void reloadData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8225ab4867a1540aa548356a79c2c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8225ab4867a1540aa548356a79c2c4e");
        } else if (this.c != null) {
            if (this.b.isComputingLayout()) {
                this.b.post(new Runnable() { // from class: com.sankuai.waimai.business.ugc.machpro.waterfall.MPWaterfallComponent.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbea04cd5a04c4af853935857b20242d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbea04cd5a04c4af853935857b20242d");
                            return;
                        }
                        MPWaterfallComponent.this.b();
                        MPWaterfallComponent.this.c.a();
                    }
                });
                return;
            }
            b();
            this.c.a();
        }
    }

    @JSMethod(methodName = "reloadHeader")
    @Keep
    public void reloadHeader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94329fe5ac8c35ca49893f623fd25f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94329fe5ac8c35ca49893f623fd25f48");
        } else if (this.h != null && this.c != null) {
            int[] iArr = new int[2];
            this.h.findFirstVisibleItemPositions(iArr);
            for (int i = 0; i <= 1; i++) {
                if (this.c.getItemViewType(iArr[i]) == 101) {
                    b();
                    return;
                }
            }
        }
    }

    @JSMethod(methodName = "scrollToItem")
    @Keep
    public void scrollToItem(Integer num, Boolean bool) {
        Object[] objArr = {num, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67fc9c40f391cb78a793524b3378d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67fc9c40f391cb78a793524b3378d3f");
        } else if (this.b == null) {
        } else {
            if (bool != null ? bool.booleanValue() : true) {
                int intValue = num.intValue();
                Object[] objArr2 = {Integer.valueOf(intValue)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f42daf3f5c9bf54efa9d649976caeec3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f42daf3f5c9bf54efa9d649976caeec3");
                    return;
                } else if (this.b == null || this.c == null) {
                    return;
                } else {
                    if (this.c.b()) {
                        intValue++;
                    }
                    int childLayoutPosition = this.b.getChildLayoutPosition(this.b.getChildAt(0));
                    int childLayoutPosition2 = this.b.getChildLayoutPosition(this.b.getChildAt(this.b.getChildCount() - 1));
                    if (intValue >= childLayoutPosition && intValue <= childLayoutPosition2) {
                        int i = intValue - childLayoutPosition;
                        if (i < 0 || i >= this.b.getChildCount()) {
                            return;
                        }
                        this.b.smoothScrollBy(0, this.b.getChildAt(i).getTop());
                        return;
                    }
                    this.b.smoothScrollToPosition(intValue);
                    return;
                }
            }
            this.b.scrollToPosition(num.intValue());
        }
    }

    @JSMethod(methodName = "visibleItems")
    @Keep
    public MachArray visibleItems() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3752b7b1013a7e8758543b64a47ddd02", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3752b7b1013a7e8758543b64a47ddd02");
        }
        MachArray machArray = new MachArray();
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0 && childAt.getBottom() > 0) {
                int childAdapterPosition = this.b.getChildAdapterPosition(childAt);
                int b = this.c.b(childAdapterPosition);
                int itemViewType = this.c.getItemViewType(childAdapterPosition);
                if (itemViewType != 101 && itemViewType != 102) {
                    machArray.add(Integer.valueOf(b));
                }
            }
        }
        return machArray;
    }

    @JSMethod(methodName = "scrollToOffset")
    @Keep
    public void scrollToOffset(MachMap machMap, Boolean bool) {
        Object[] objArr = {machMap, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f15390e03a91ee1c7c1431d9fab3d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f15390e03a91ee1c7c1431d9fab3d30");
        } else if (machMap == null) {
        } else {
            int a2 = (int) (com.sankuai.waimai.machpro.util.b.a(machMap.get(Constants.GestureMoveEvent.KEY_X)) - this.b.computeHorizontalScrollOffset());
            int a3 = (int) (com.sankuai.waimai.machpro.util.b.a(machMap.get(Constants.GestureMoveEvent.KEY_Y)) - this.b.computeVerticalScrollOffset());
            if (bool != null ? bool.booleanValue() : true) {
                this.b.smoothScrollBy(a2, a3);
            } else {
                this.b.scrollBy(a2, a3);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r14.equals("columnSpace") != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.machpro.waterfall.MPWaterfallComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd6e85215fff2dee2fbd8eaebc11888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd6e85215fff2dee2fbd8eaebc11888");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            if (str.hashCode() == 1977582290 && str.equals("headerView")) {
                c = 0;
            }
            if (c == 0) {
                this.p = str;
            } else {
                super.addEventListener(str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.a<d> implements c {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;
        private ArrayMap<String, Integer> e;
        private SparseArray<Integer> f;
        private com.sankuai.waimai.machpro.component.list.a g;
        private int h;
        private int i;
        private boolean j;

        public a() {
            Object[] objArr = {MPWaterfallComponent.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a141b4a1c858921cf5319435684bc860", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a141b4a1c858921cf5319435684bc860");
                return;
            }
            this.e = new ArrayMap<>();
            this.f = new SparseArray<>();
            this.j = true;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(d dVar, int i) {
            d dVar2 = dVar;
            Object[] objArr = {dVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e274713b92e2a5b722710c05c2c9452", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e274713b92e2a5b722710c05c2c9452");
                return;
            }
            int itemViewType = getItemViewType(i);
            if (itemViewType != 101) {
                if (itemViewType == 102) {
                    if (dVar2 instanceof e) {
                        ((e) dVar2).a(this.h);
                        return;
                    }
                    return;
                }
                MachMap machMap = new MachMap();
                machMap.put("uniqueID", Integer.valueOf(dVar2.a));
                machMap.put("index", Integer.valueOf(b(i)));
                MachArray machArray = new MachArray();
                machArray.add(machMap);
                MPWaterfallComponent.this.dispatchEvent("updateCell", machArray);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i) {
            com.sankuai.waimai.machpro.component.view.c frameLayout;
            d dVar;
            com.sankuai.waimai.machpro.component.view.c frameLayout2;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2680b61424f78bb266f81832dff20976", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2680b61424f78bb266f81832dff20976");
            }
            if (i == 101) {
                String str = MPWaterfallComponent.this.p;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "283103b92492bd654b47735d11615104", RobustBitConfig.DEFAULT_VALUE)) {
                    return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "283103b92492bd654b47735d11615104");
                }
                MPWaterfallComponent.this.dispatchEvent(str, null);
                this.c++;
                com.sankuai.waimai.machpro.component.cellcontainer.a b = com.sankuai.waimai.machpro.component.cellcontainer.a.b();
                if (b == null) {
                    frameLayout2 = new FrameLayout(MPWaterfallComponent.this.mMachContext.getContext());
                } else {
                    frameLayout2 = b.getView();
                }
                dVar = new d(frameLayout2);
                dVar.a = this.c;
                StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(-2, -2);
                bVar.b = true;
                dVar.itemView.setLayoutParams(bVar);
            } else if (i == 102) {
                e a2 = this.g.a();
                if (a2 != null) {
                    StaggeredGridLayoutManager.b bVar2 = new StaggeredGridLayoutManager.b(-2, -2);
                    bVar2.b = true;
                    a2.itemView.setLayoutParams(bVar2);
                    return a2;
                }
                return a2;
            } else {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc623a4918c59d8be5a0f7dd6ddef7a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc623a4918c59d8be5a0f7dd6ddef7a0");
                }
                this.c++;
                MachMap machMap = new MachMap();
                machMap.put("type", c(i));
                machMap.put("uniqueID", Integer.valueOf(this.c));
                MachArray machArray = new MachArray();
                machArray.add(machMap);
                MPWaterfallComponent.this.dispatchEvent("createCell", machArray);
                com.sankuai.waimai.machpro.component.cellcontainer.a b2 = com.sankuai.waimai.machpro.component.cellcontainer.a.b();
                if (b2 == null) {
                    frameLayout = new FrameLayout(MPWaterfallComponent.this.mMachContext.getContext());
                } else {
                    frameLayout = b2.getView();
                }
                dVar = new d(frameLayout);
                dVar.a = this.c;
            }
            return dVar;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9882b311cfc9bcea648efae131425b8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9882b311cfc9bcea648efae131425b8")).intValue();
            }
            if (i == 0 && b()) {
                return 101;
            }
            if (i == getItemCount() - 1 && c()) {
                return 102;
            }
            int b = b(i);
            Integer num = this.f.get(b);
            if (num == null) {
                MachArray machArray = new MachArray();
                machArray.add(Integer.valueOf(b));
                String a2 = com.sankuai.waimai.machpro.util.b.a(MPWaterfallComponent.this.dispatchEvent("cellType", machArray), "");
                if (TextUtils.isEmpty(a2)) {
                    return 0;
                }
                Integer num2 = this.e.get(a2);
                if (num2 == null) {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    num2 = Integer.valueOf(i2);
                    this.e.put(a2, num2);
                }
                num = num2;
                this.f.put(b, num);
            }
            return num.intValue();
        }

        private String c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b3c93f3d10fc323fcb3f6af7217bed", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b3c93f3d10fc323fcb3f6af7217bed");
            }
            for (String str : this.e.keySet()) {
                if (i == this.e.get(str).intValue()) {
                    return str;
                }
            }
            return "";
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3df544cd3146731383ac90913e3255c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3df544cd3146731383ac90913e3255c");
                return;
            }
            this.f.clear();
            this.j = true;
        }

        @Override // com.sankuai.waimai.machpro.component.list.c
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638dfc3998c3bbeb07764761822b7e59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638dfc3998c3bbeb07764761822b7e59");
            } else if (this.h != i) {
                this.h = i;
                if (c()) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a4550db99d65f1be90f2042465fb19f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a4550db99d65f1be90f2042465fb19f");
                    } else if (MPWaterfallComponent.this.b.isComputingLayout()) {
                        MPWaterfallComponent.this.b.post(new Runnable() { // from class: com.sankuai.waimai.business.ugc.machpro.waterfall.MPWaterfallComponent.a.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8611bccc25f47fd6530b3e38abd1c309", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8611bccc25f47fd6530b3e38abd1c309");
                                } else {
                                    a.this.notifyItemRangeChanged(a.this.getItemCount() - 1, 1);
                                }
                            }
                        });
                    } else {
                        notifyItemRangeChanged(getItemCount() - 1, 1);
                    }
                }
            }
        }

        @Override // com.sankuai.waimai.machpro.component.list.c
        public final void a(com.sankuai.waimai.machpro.component.list.a aVar) {
            this.g = aVar;
        }

        private boolean c() {
            return this.g != null;
        }

        public final int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1348d48a1b981260d246ab31640e51e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1348d48a1b981260d246ab31640e51e")).intValue() : (i == 0 || !b()) ? i : i - 1;
        }

        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0fb25ce64c9737c0b946975469bdd3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0fb25ce64c9737c0b946975469bdd3")).booleanValue() : MPWaterfallComponent.this.o;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8c4a7536c5a5b163a49771615e5b50", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8c4a7536c5a5b163a49771615e5b50")).intValue();
            }
            if (this.j) {
                this.j = false;
                this.i = com.sankuai.waimai.machpro.util.b.c(MPWaterfallComponent.this.dispatchEvent("numberOfItems", null));
            }
            int i = this.i;
            if (b()) {
                i++;
            }
            return c() ? i + 1 : i;
        }
    }
}
