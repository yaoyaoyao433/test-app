package com.sankuai.waimai.machpro.component.list;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aq;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSContext;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.list.MPLinearLayoutManager;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPListComponent extends MPComponent<g> implements b {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private h q;
    private MPLinearLayoutManager r;
    private int s;
    private int t;
    private boolean u;
    private PriorityQueue<Integer> v;
    private PriorityQueue<Integer> w;
    private MPComponent x;
    private MPComponent y;
    private RecyclerView.k z;

    public static /* synthetic */ int A(MPListComponent mPListComponent) {
        int i = mPListComponent.g;
        mPListComponent.g = i + 1;
        return i;
    }

    public static /* synthetic */ boolean a(MPListComponent mPListComponent, boolean z) {
        mPListComponent.u = false;
        return false;
    }

    public static /* synthetic */ int b(MPListComponent mPListComponent, int i) {
        mPListComponent.s = -1;
        return -1;
    }

    public static /* synthetic */ void c(MPListComponent mPListComponent, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPListComponent, changeQuickRedirect, false, "b4e1d36d158794f37e4767fc0419f6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPListComponent, changeQuickRedirect, false, "b4e1d36d158794f37e4767fc0419f6d7");
        } else if (i <= 0) {
            if (i < 0) {
                int findLastVisibleItemPosition = mPListComponent.r.findLastVisibleItemPosition();
                LinkedList linkedList = new LinkedList();
                Iterator<Integer> it = mPListComponent.w.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    if (next.intValue() > findLastVisibleItemPosition) {
                        mPListComponent.c(next.intValue());
                        linkedList.add(next);
                    }
                }
                if (linkedList.size() > 0) {
                    mPListComponent.w.removeAll(linkedList);
                }
                int findFirstVisibleItemPosition = mPListComponent.r.findFirstVisibleItemPosition();
                while (findLastVisibleItemPosition >= findFirstVisibleItemPosition) {
                    if (!mPListComponent.w.contains(Integer.valueOf(findLastVisibleItemPosition))) {
                        mPListComponent.w.add(Integer.valueOf(findLastVisibleItemPosition));
                        mPListComponent.b(findLastVisibleItemPosition);
                    }
                    findLastVisibleItemPosition--;
                }
            }
        } else {
            int findFirstVisibleItemPosition2 = mPListComponent.r.findFirstVisibleItemPosition();
            LinkedList linkedList2 = null;
            Iterator<Integer> it2 = mPListComponent.w.iterator();
            while (it2.hasNext()) {
                Integer next2 = it2.next();
                if (next2.intValue() < findFirstVisibleItemPosition2) {
                    mPListComponent.c(next2.intValue());
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList();
                    }
                    linkedList2.add(next2);
                }
            }
            if (linkedList2 != null && linkedList2.size() > 0) {
                mPListComponent.w.removeAll(linkedList2);
            }
            int findLastVisibleItemPosition2 = mPListComponent.r.findLastVisibleItemPosition();
            while (findFirstVisibleItemPosition2 <= findLastVisibleItemPosition2) {
                if (!mPListComponent.w.contains(Integer.valueOf(findFirstVisibleItemPosition2))) {
                    mPListComponent.w.add(Integer.valueOf(findFirstVisibleItemPosition2));
                    mPListComponent.b(findFirstVisibleItemPosition2);
                }
                findFirstVisibleItemPosition2++;
            }
        }
    }

    public static /* synthetic */ int d(MPListComponent mPListComponent, int i) {
        mPListComponent.t = -1;
        return -1;
    }

    public static /* synthetic */ boolean i(MPListComponent mPListComponent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, mPListComponent, changeQuickRedirect, false, "ed924a0731e8803cb7a13b3b7ea17543", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, mPListComponent, changeQuickRedirect, false, "ed924a0731e8803cb7a13b3b7ea17543")).booleanValue() : mPListComponent.getParentComponent() != null && TextUtils.equals(mPListComponent.getParentComponent().getNativeId(), "food_list_tag");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ g createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5c25322bb92eecdfe7175db2c45258", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5c25322bb92eecdfe7175db2c45258");
        }
        if (this.mMachContext.getInstance().w != null) {
            this.b = this.mMachContext.getInstance().w.a(this.mMachContext.getContext());
        }
        if (this.b == null) {
            this.b = new MPRecycleView(this.mMachContext.getContext());
        }
        this.r = new MPLinearLayoutManager(this.mMachContext.getContext(), 1, false, this);
        this.r.b = new MPLinearLayoutManager.b() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.component.list.MPLinearLayoutManager.b
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69f50db0a90dfcb2bd0496581097dc7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69f50db0a90dfcb2bd0496581097dc7f");
                } else if (((g) MPListComponent.this.mView).d) {
                    if (MPListComponent.this.s >= 0) {
                        int e = MPListComponent.this.h.e(MPListComponent.this.s);
                        MPListComponent.b(MPListComponent.this, -1);
                        int a2 = MPListComponent.this.r.a(e);
                        if (a2 > 0) {
                            MPListComponent.this.b.scrollBy(0, -a2);
                        }
                    }
                    ((g) MPListComponent.this.mView).post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7dc1e1a39bcb81d63f188bd65aa8c79b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7dc1e1a39bcb81d63f188bd65aa8c79b");
                                return;
                            }
                            g gVar = (g) MPListComponent.this.mView;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = g.a;
                            if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "87f9c86df53cf8a4b617c0f555296a60", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "87f9c86df53cf8a4b617c0f555296a60");
                            } else if (!gVar.d || gVar.c == null || gVar.b == null) {
                            } else {
                                gVar.c.setVisibility(0);
                                gVar.a(true);
                            }
                        }
                    });
                }
            }
        };
        this.b.setLayoutManager(this.r);
        this.h = new a();
        this.b.setAdapter(this.h);
        ((aq) this.b.getItemAnimator()).setSupportsChangeAnimations(false);
        this.b.setItemAnimator(null);
        final g gVar = new g(this.mMachContext.getContext());
        gVar.setClipChildren(true);
        gVar.addView(this.b, 0, new ViewGroup.LayoutParams(-1, -1));
        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6018561dd570cf703f1264308e38ed2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6018561dd570cf703f1264308e38ed2c");
                } else {
                    gVar.setFoodList(MPListComponent.i(MPListComponent.this));
                }
            }
        });
        return gVar;
    }

    public MPListComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26cf7bb6f654338116c237b493808f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26cf7bb6f654338116c237b493808f6");
            return;
        }
        this.q = new h();
        this.s = -1;
        this.t = 0;
        this.u = false;
        this.v = new PriorityQueue<>();
        this.w = new PriorityQueue<>();
        this.z = new RecyclerView.k() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.4
            public static ChangeQuickRedirect a;
            private int c = 0;
            private boolean d = false;
            private boolean e;
            private boolean f;

            /* JADX WARN: Type inference failed for: r14v17 */
            /* JADX WARN: Type inference failed for: r14v8 */
            /* JADX WARN: Type inference failed for: r14v9, types: [boolean, byte] */
            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbf6d5d4119d6bcd7e69650e3605c03a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbf6d5d4119d6bcd7e69650e3605c03a");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (this.e && i == 2) {
                    this.f = true;
                }
                this.e = i == 1;
                if (i != this.c) {
                    if (i == 1 && MPListComponent.this.e) {
                        a("scrollStart");
                    } else if (i != 2) {
                        if (i == 0 && MPListComponent.this.f) {
                            a("scrollEnd");
                        }
                    } else if (this.c == 1 && MPListComponent.this.d) {
                        a("dragEnd");
                    } else if (this.c == 0 && MPListComponent.this.e) {
                        a("scrollStart");
                    }
                    this.c = i;
                }
                if (com.sankuai.waimai.machpro.g.a() && MPListComponent.i(MPListComponent.this)) {
                    ?? r14 = i != 0 ? 1 : 0;
                    Object[] objArr3 = {Byte.valueOf((byte) r14)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69f03e2e9a0eed12d29cef13a7295310", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69f03e2e9a0eed12d29cef13a7295310");
                    } else if (this.d != r14) {
                        this.d = r14;
                        MPJSContext jSContext = MPListComponent.this.mMachContext.getJSContext();
                        boolean z = this.d;
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = MPJSContext.a;
                        if (PatchProxy.isSupport(objArr4, jSContext, changeQuickRedirect4, false, "6bbd299fa7ec256911919382c6957462", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, jSContext, changeQuickRedirect4, false, "6bbd299fa7ec256911919382c6957462");
                        } else {
                            jSContext.a();
                            if (!jSContext.c) {
                                jSContext._setDisableGc(jSContext.b, z ? 1 : 0);
                            }
                        }
                        if (!this.d) {
                            MPJSContext jSContext2 = MPListComponent.this.mMachContext.getJSContext();
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = MPJSContext.a;
                            if (PatchProxy.isSupport(objArr5, jSContext2, changeQuickRedirect5, false, "cf5bb47b7b7e994b18a8ca566690fdac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, jSContext2, changeQuickRedirect5, false, "cf5bb47b7b7e994b18a8ca566690fdac");
                            } else {
                                jSContext2.a();
                                if (!jSContext2.c) {
                                    jSContext2._triggerGC(jSContext2.b);
                                }
                            }
                        }
                    }
                }
                if (i == 0) {
                    this.e = false;
                    this.f = false;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b5072c03aec6dbf4e62ffaa6dea453a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b5072c03aec6dbf4e62ffaa6dea453a");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (MPListComponent.this.c) {
                    a(Constants.FPS_TYPE_SCROLL);
                }
                if (!MPListComponent.this.u) {
                    MPListComponent.c(MPListComponent.this, i2);
                } else {
                    MPListComponent.a(MPListComponent.this, false);
                }
            }

            private void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "566705dcf4ec90aa52be2611e03d6d98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "566705dcf4ec90aa52be2611e03d6d98");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    MachMap machMap = new MachMap();
                    machMap.put(Constants.GestureMoveEvent.KEY_X, 0);
                    machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPListComponent.this.mMachContext.getContext(), MPListComponent.this.b.computeVerticalScrollOffset())));
                    machMap.put("scrollLeft", 0);
                    machMap.put("scrollTop", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPListComponent.this.mMachContext.getContext(), MPListComponent.this.b.computeVerticalScrollOffset())));
                    machMap.put("isDragging", Boolean.valueOf(this.e));
                    machMap.put("isDecelerating", Boolean.valueOf(this.f));
                    MachArray machArray = new MachArray();
                    machArray.add(machMap);
                    MPListComponent.this.dispatchEvent(str, machArray);
                }
            }
        };
        this.b.addOnScrollListener(this.z);
        if (mPContext.getInstance().u != null) {
            this.b.addOnScrollListener(mPContext.getInstance().u);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
        if (r14.equals("listendragend") != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.list.MPListComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r13.equals("numberOfItemsInSection") != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.component.list.MPListComponent.a
            java.lang.String r11 = "8d176c77b4302af123758e9b6fb0f628"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L22
            return
        L22:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -2134705842: goto Lb2;
                case -2081626473: goto La6;
                case -2034035831: goto L9b;
                case -917566532: goto L91;
                case -406869692: goto L86;
                case -359279050: goto L7c;
                case -296441397: goto L71;
                case 924948800: goto L67;
                case 1119630394: goto L5b;
                case 1368703102: goto L51;
                case 1420631776: goto L45;
                case 1676580908: goto L39;
                case 1977582290: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto Lbd
        L2c:
            java.lang.String r0 = "headerView"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 11
            goto Lbe
        L39:
            java.lang.String r0 = "sectionHeaderType"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 2
            goto Lbe
        L45:
            java.lang.String r0 = "footerView"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 12
            goto Lbe
        L51:
            java.lang.String r0 = "createCell"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 4
            goto Lbe
        L5b:
            java.lang.String r0 = "sectionFooterType"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 8
            goto Lbe
        L67:
            java.lang.String r2 = "numberOfItemsInSection"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto Lbd
            goto Lbe
        L71:
            java.lang.String r0 = "updateCell"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 5
            goto Lbe
        L7c:
            java.lang.String r0 = "createSectionHeader"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 6
            goto Lbe
        L86:
            java.lang.String r0 = "createSectionFooter"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 9
            goto Lbe
        L91:
            java.lang.String r0 = "cellType"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 3
            goto Lbe
        L9b:
            java.lang.String r0 = "updateSectionHeader"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 7
            goto Lbe
        La6:
            java.lang.String r0 = "updateSectionFooter"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 10
            goto Lbe
        Lb2:
            java.lang.String r0 = "numberOfSections"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lbd
            r0 = 0
            goto Lbe
        Lbd:
            r0 = -1
        Lbe:
            switch(r0) {
                case 0: goto Lc5;
                case 1: goto Lc5;
                case 2: goto Lc5;
                case 3: goto Lc5;
                case 4: goto Lc5;
                case 5: goto Lc5;
                case 6: goto Lc5;
                case 7: goto Lc5;
                case 8: goto Lc5;
                case 9: goto Lc5;
                case 10: goto Lc5;
                case 11: goto Lc5;
                case 12: goto Lc5;
                default: goto Lc1;
            }
        Lc1:
            super.addEventListener(r13)
            return
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.list.MPListComponent.addEventListener(java.lang.String):void");
    }

    @JSMethod(methodName = "contentSize")
    @Keep
    public MachMap contentSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595145bcaea3028a94b34278578d16ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595145bcaea3028a94b34278578d16ce");
        }
        MachMap machMap = new MachMap();
        if (this.h != null && this.b != null && this.r != null) {
            machMap.put("width", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.b.getWidth())));
            int itemCount = this.h.getItemCount();
            int i = 0;
            for (int i2 = 0; i2 < itemCount; i2++) {
                i += this.r.a(i2);
            }
            machMap.put("height", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(i)));
        }
        return machMap;
    }

    @JSMethod(methodName = "reloadSectionHeader")
    @Keep
    public void reloadSectionHeader(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1122842fcf5ee30b01ed6892aaa3dc67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1122842fcf5ee30b01ed6892aaa3dc67");
            return;
        }
        int e = this.h.e(num.intValue());
        if (e != -1) {
            if (!((g) this.mView).d) {
                this.h.notifyItemChanged(e);
            } else if (((g) this.mView).getCurrentStickySection() != num.intValue() || ((g) this.mView).getCurHolder() == null) {
            } else {
                a aVar = this.h;
                com.sankuai.waimai.machpro.component.d curHolder = ((g) this.mView).getCurHolder();
                int intValue = num.intValue();
                Object[] objArr2 = {curHolder, Integer.valueOf(intValue)};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0569039ac8caa3e1144212c2812ef628", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0569039ac8caa3e1144212c2812ef628");
                } else {
                    aVar.a("updateSectionHeader", curHolder, intValue);
                }
            }
        }
    }

    @JSMethod(methodName = "reloadSectionFooter")
    @Keep
    public void reloadSectionFooter(Integer num) {
        int i;
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35ce310f828f39a425b3c1345845a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35ce310f828f39a425b3c1345845a96");
            return;
        }
        a aVar = this.h;
        int intValue = num.intValue();
        Object[] objArr2 = {Integer.valueOf(intValue)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cd7c68004bc0beafdedf1be2137fd7b7", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cd7c68004bc0beafdedf1be2137fd7b7")).intValue();
        } else if (intValue < 0 || intValue >= aVar.b.size()) {
            i = -1;
        } else {
            int c = aVar.c(0, intValue);
            if (aVar.b()) {
                c++;
            }
            f fVar = aVar.b.get(intValue);
            int i2 = c + fVar.d;
            if (fVar.b) {
                i2++;
            }
            i = i2;
        }
        if (i != -1) {
            this.h.notifyItemChanged(i);
        }
    }

    @JSMethod(methodName = "reloadItem")
    @Keep
    public void reloadItem(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cea1f405806dfaed328fb1ea0c4d729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cea1f405806dfaed328fb1ea0c4d729");
        } else if (machMap != null && machMap.containsKey("section") && machMap.containsKey("item")) {
            int c = com.sankuai.waimai.machpro.util.b.c(machMap.get("section"));
            int c2 = com.sankuai.waimai.machpro.util.b.c(machMap.get("item"));
            if (c < 0 || c2 < 0) {
                return;
            }
            this.h.notifyItemChanged(this.h.a(c, c2));
            this.t = 3;
        }
    }

    @JSMethod(methodName = "reloadFooter")
    @Keep
    public void reloadFooter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a8a69c7b6d809b02d0fa2b0b18d7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a8a69c7b6d809b02d0fa2b0b18d7b6");
        } else if (this.r != null && this.h != null) {
            int findFirstVisibleItemPosition = this.r.findFirstVisibleItemPosition();
            for (int findLastVisibleItemPosition = this.r.findLastVisibleItemPosition(); findLastVisibleItemPosition >= findFirstVisibleItemPosition; findLastVisibleItemPosition--) {
                if (this.h.getItemViewType(findLastVisibleItemPosition) == 10002) {
                    this.h.notifyItemChanged(findLastVisibleItemPosition);
                    return;
                }
            }
        }
    }

    @JSMethod(methodName = "reloadHeader")
    @Keep
    public void reloadHeader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccfb70b54f352ead35874c9f249d27a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccfb70b54f352ead35874c9f249d27a1");
        } else if (this.r != null && this.h != null) {
            int findFirstVisibleItemPosition = this.r.findFirstVisibleItemPosition();
            for (int findLastVisibleItemPosition = this.r.findLastVisibleItemPosition(); findLastVisibleItemPosition >= findFirstVisibleItemPosition; findLastVisibleItemPosition--) {
                if (this.h.getItemViewType(findLastVisibleItemPosition) == 10001) {
                    this.h.notifyItemChanged(findLastVisibleItemPosition);
                    return;
                }
            }
        }
    }

    @JSMethod(methodName = "reloadData")
    @Keep
    public void reloadData() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093fe5e4cf96ef0a2e3dd9a1dbe64078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093fe5e4cf96ef0a2e3dd9a1dbe64078");
        } else if (this.h != null) {
            this.r.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76257a40c0cdda2bf18d190ab9b73b45", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76257a40c0cdda2bf18d190ab9b73b45")).booleanValue();
            } else {
                z = getParentComponent() != null && TextUtils.equals(getParentComponent().getNativeId(), "shop_cart_list_tag");
            }
            if (!z) {
                this.h.notifyItemRangeChanged(0, this.h.getItemCount());
                this.h.c = true;
            } else {
                this.h.c = true;
                this.h.a();
            }
            this.t = 1;
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb42f6c8708543468de99a24130c808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb42f6c8708543468de99a24130c808");
            return;
        }
        this.v.clear();
        if (c()) {
            if (this.w.size() > 0) {
                com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ae3d97c327ef447c17a3a5da855d86d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ae3d97c327ef447c17a3a5da855d86d");
                            return;
                        }
                        if (MPListComponent.this.w.size() > 0) {
                            Object[] array = MPListComponent.this.w.toArray();
                            for (int length = array.length - 1; length >= 0; length--) {
                                if (array[length] instanceof Integer) {
                                    MPListComponent.this.c(((Integer) array[length]).intValue());
                                }
                            }
                        }
                        MPListComponent.this.w.clear();
                    }
                });
                return;
            }
            return;
        }
        this.w.clear();
    }

    @JSMethod(methodName = "scrollToItem")
    @Keep
    public void scrollToItem(MachMap machMap, MachMap machMap2) {
        int i;
        int i2;
        int a2;
        Object[] objArr = {machMap, machMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0b98c6bc4c804e55408b7967efd9ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0b98c6bc4c804e55408b7967efd9ca");
        } else if (machMap == null || this.b == null) {
        } else {
            int c = com.sankuai.waimai.machpro.util.b.c(machMap.get("section"));
            this.s = c;
            if (this.h != null) {
                int c2 = com.sankuai.waimai.machpro.util.b.c(machMap.get("item"));
                if (c2 == 0 && !((g) this.mView).d) {
                    a2 = this.h.e(c);
                } else {
                    a2 = this.h.a(c, c2);
                }
                i = a2;
            } else {
                i = -1;
            }
            if (i < 0) {
                return;
            }
            if (machMap2 != null && machMap2.containsKey("toTop")) {
                this.b.scrollToPosition(0);
                this.t = 4;
                this.u = true;
            } else if (machMap2 != null && machMap2.containsKey("viewOffset")) {
                this.r.scrollToPositionWithOffset(i, (int) com.sankuai.waimai.machpro.util.b.a(machMap2.get("viewOffset")));
            } else if (machMap2 != null && com.sankuai.waimai.machpro.util.b.c(machMap2.get("position")) == 1) {
                MPLinearLayoutManager mPLinearLayoutManager = this.r;
                Context context = this.mMachContext.getContext();
                Object[] objArr2 = {context, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = MPLinearLayoutManager.a;
                if (PatchProxy.isSupport(objArr2, mPLinearLayoutManager, changeQuickRedirect2, false, "e00206c1016f40e6c7d812a9c7dbe79f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mPLinearLayoutManager, changeQuickRedirect2, false, "e00206c1016f40e6c7d812a9c7dbe79f");
                    return;
                }
                MPLinearLayoutManager.a aVar = new MPLinearLayoutManager.a(context);
                aVar.b = true;
                aVar.setTargetPosition(i);
                mPLinearLayoutManager.startSmoothScroll(aVar);
            } else {
                if (!((machMap2 == null || machMap2.get(DMKeys.KEY_SHARE_INFO_ANIMATED) == null) ? true : com.sankuai.waimai.machpro.util.b.d(machMap2.get(DMKeys.KEY_SHARE_INFO_ANIMATED)))) {
                    this.b.scrollToPosition(i);
                    this.t = 4;
                    this.u = true;
                    return;
                }
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9558f743fa62d934d978fc4c515a6a33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9558f743fa62d934d978fc4c515a6a33");
                } else if (this.b != null) {
                    int childLayoutPosition = this.b.getChildLayoutPosition(this.b.getChildAt(0));
                    int childLayoutPosition2 = this.b.getChildLayoutPosition(this.b.getChildAt(this.b.getChildCount() - 1));
                    if (i >= childLayoutPosition && i <= childLayoutPosition2) {
                        int i3 = i - childLayoutPosition;
                        if (i3 < 0 || i3 >= this.b.getChildCount()) {
                            return;
                        }
                        int top = this.b.getChildAt(i3).getTop();
                        if (!((g) this.mView).d || this.s < 0) {
                            i2 = 0;
                        } else {
                            int e = this.h.e(this.s);
                            this.s = -1;
                            i2 = this.r.a(e);
                        }
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        this.b.smoothScrollBy(0, top - i2);
                        return;
                    }
                    this.b.smoothScrollToPosition(i);
                }
            }
        }
    }

    @JSMethod(methodName = "scrollToOffset")
    @Keep
    public void scrollToOffset(MachMap machMap, Boolean bool) {
        Object[] objArr = {machMap, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053d3479de193d071d436128756e9755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053d3479de193d071d436128756e9755");
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

    @JSMethod(methodName = "itemTopOffset")
    @Keep
    public MachMap itemTopOffset(MachMap machMap) {
        int i;
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd59e906e7b1a47d8e49c0375eac5e40", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd59e906e7b1a47d8e49c0375eac5e40");
        }
        if (machMap == null || this.h == null || this.r == null) {
            i = 0;
        } else {
            int a2 = this.h.a(com.sankuai.waimai.machpro.util.b.c(machMap.get("section")), com.sankuai.waimai.machpro.util.b.c(machMap.get("item")));
            i = 0;
            for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
                View childAt = this.b.getChildAt(i2);
                if (a2 == this.r.getPosition(childAt)) {
                    i = childAt.getTop();
                }
            }
        }
        MachMap machMap2 = new MachMap();
        machMap2.put(Constants.GestureMoveEvent.KEY_X, 0);
        machMap2.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i)));
        return machMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    @com.sankuai.waimai.machpro.base.JSMethod(methodName = "strictVisibleItems")
    @android.support.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.sankuai.waimai.machpro.base.MachArray strictVisibleItems() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.machpro.component.list.MPListComponent.a
            java.lang.String r10 = "c2466b9bcf56163a6b38e9fd2117e520"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.sankuai.waimai.machpro.base.MachArray r0 = (com.sankuai.waimai.machpro.base.MachArray) r0
            return r0
        L1b:
            T extends android.view.View r1 = r11.mView
            com.sankuai.waimai.machpro.component.list.g r1 = (com.sankuai.waimai.machpro.component.list.g) r1
            boolean r1 = r1.d
            if (r1 == 0) goto L44
            com.sankuai.waimai.machpro.component.list.MPLinearLayoutManager r1 = r11.r
            int r1 = r1.findFirstVisibleItemPosition()
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r2 = r11.h
            int r1 = r2.b(r1)
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r2 = r11.h
            int r1 = r2.d(r1)
            if (r1 < 0) goto L44
            com.sankuai.waimai.machpro.component.list.MPLinearLayoutManager r2 = r11.r
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r3 = r11.h
            int r1 = r3.e(r1)
            int r1 = r2.a(r1)
            goto L45
        L44:
            r1 = 0
        L45:
            com.sankuai.waimai.machpro.base.MachArray r2 = new com.sankuai.waimai.machpro.base.MachArray
            r2.<init>()
        L4a:
            android.support.v7.widget.RecyclerView r3 = r11.b
            int r3 = r3.getChildCount()
            if (r0 >= r3) goto La9
            android.support.v7.widget.RecyclerView r3 = r11.b
            android.view.View r3 = r3.getChildAt(r0)
            if (r3 == 0) goto La6
            int r4 = r3.getVisibility()
            if (r4 != 0) goto La6
            int r4 = r3.getBottom()
            int r5 = r1 + 1
            if (r4 <= r5) goto La6
            android.support.v7.widget.RecyclerView r4 = r11.b
            int r3 = r4.getChildAdapterPosition(r3)
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r4 = r11.h
            int r3 = r4.b(r3)
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r4 = r11.h
            int r4 = r4.f(r3)
            r5 = 20002(0x4e22, float:2.8029E-41)
            if (r4 != r5) goto La6
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r4 = r11.h
            int r4 = r4.d(r3)
            com.sankuai.waimai.machpro.component.list.MPListComponent$a r5 = r11.h
            int r3 = r5.b(r4, r3)
            com.sankuai.waimai.machpro.base.MachMap r5 = new com.sankuai.waimai.machpro.base.MachMap
            r5.<init>()
            java.lang.String r6 = "section"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.put(r6, r4)
            java.lang.String r4 = "item"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.put(r4, r3)
            r2.add(r5)
        La6:
            int r0 = r0 + 1
            goto L4a
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.list.MPListComponent.strictVisibleItems():com.sankuai.waimai.machpro.base.MachArray");
    }

    @JSMethod(methodName = "visibleItems")
    @Keep
    public MachArray visibleItems() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad97ccd96f830de5013efd0cf4ea115e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad97ccd96f830de5013efd0cf4ea115e");
        }
        MachArray machArray = new MachArray();
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0 && childAt.getBottom() > 0) {
                int b = this.h.b(this.b.getChildAdapterPosition(childAt));
                if (this.h.f(b) == 20002) {
                    int d = this.h.d(b);
                    int b2 = this.h.b(d, b);
                    MachMap machMap = new MachMap();
                    machMap.put("section", Integer.valueOf(d));
                    machMap.put("item", Integer.valueOf(b2));
                    machArray.add(machMap);
                }
            }
        }
        return machArray;
    }

    @JSMethod(methodName = "insertSections")
    @Keep
    public void insertSections(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8dc28c7ff0dd7dadb91292b3699705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8dc28c7ff0dd7dadb91292b3699705");
        } else if (machMap == null || this.r == null || this.h == null || !machMap.containsKey("section")) {
        } else {
            int c = com.sankuai.waimai.machpro.util.b.c(machMap.get("section"));
            int c2 = com.sankuai.waimai.machpro.util.b.c(machMap.get("length"));
            if (c2 <= 0) {
                c2 = 1;
            }
            this.r.a();
            this.h.c = true;
            this.h.c();
            int c3 = this.h.c(c, c2);
            int e = this.h.e(c);
            if (e >= 0) {
                this.h.notifyItemRangeInserted(e, c3);
                this.t = 2;
                b();
            }
        }
    }

    @JSMethod(methodName = "insertItems")
    @Keep
    public void insertItems(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504d2cfd82c12c62bcb6a965d5385227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504d2cfd82c12c62bcb6a965d5385227");
        } else if (machMap == null || this.r == null || this.h == null || !(machMap.get("indexPath") instanceof MachMap)) {
        } else {
            MachMap machMap2 = (MachMap) machMap.get("indexPath");
            int c = com.sankuai.waimai.machpro.util.b.c(machMap2.get("section"));
            int c2 = com.sankuai.waimai.machpro.util.b.c(machMap2.get("item"));
            int c3 = com.sankuai.waimai.machpro.util.b.c(machMap.get("length"));
            if (c3 <= 0) {
                c3 = 1;
            }
            this.r.a();
            this.h.c = true;
            this.h.c();
            this.h.notifyItemRangeInserted(this.h.a(c, c2), c3);
            this.t = 2;
            b();
        }
    }

    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685950648370c7d4e3663b40280a661a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685950648370c7d4e3663b40280a661a");
        }
        int b = this.h.b(i);
        if (this.h.f(b) == 20002) {
            int d = this.h.d(b);
            int b2 = this.h.b(d, b);
            MachMap machMap = new MachMap();
            machMap.put("section", Integer.valueOf(d));
            machMap.put("item", Integer.valueOf(b2));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            Object dispatchEvent = dispatchEvent("cellHeightCacheKey", machArray);
            if (dispatchEvent == null) {
                return null;
            }
            return dispatchEvent.toString();
        }
        return String.valueOf(i);
    }

    private boolean c() {
        return this.j || this.l || this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        int itemViewType;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a3ea3727a56d1c6c3dfd75362ae9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a3ea3727a56d1c6c3dfd75362ae9e1");
        } else if (!c() || this.h == null || (itemViewType = this.h.getItemViewType(i)) == 10001 || itemViewType == 10002 || itemViewType == 10003) {
        } else {
            int b = this.h.b(i);
            int f = this.h.f(b);
            int d = this.h.d(b);
            MachArray machArray = new MachArray();
            if (f == 20002) {
                if (this.j) {
                    int b2 = this.h.b(d, b);
                    MachMap machMap = new MachMap();
                    machMap.put("section", Integer.valueOf(d));
                    machMap.put("item", Integer.valueOf(b2));
                    machArray.add(machMap);
                    dispatchEvent("cellDisappear", machArray);
                }
            } else if (f == 20001) {
                if (this.l) {
                    machArray.add(Integer.valueOf(d));
                    dispatchEvent("sectionHeaderDisappear", machArray);
                }
            } else if (f == 20003 && this.n) {
                machArray.add(Integer.valueOf(d));
                dispatchEvent("sectionFooterDisappear", machArray);
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.list.b
    public final RecyclerView a() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.a<com.sankuai.waimai.machpro.component.d> implements c {
        public static ChangeQuickRedirect a;
        LinkedList<f> b;
        boolean c;
        private int e;
        private com.sankuai.waimai.machpro.component.list.a f;
        private int g;

        public a() {
            Object[] objArr = {MPListComponent.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5c8048328cf959a503de37fc88527a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5c8048328cf959a503de37fc88527a");
                return;
            }
            this.b = new LinkedList<>();
            this.c = true;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        /* renamed from: a */
        public final com.sankuai.waimai.machpro.component.d onCreateViewHolder(ViewGroup viewGroup, int i) {
            com.sankuai.waimai.machpro.component.d a2;
            com.sankuai.waimai.machpro.component.d dVar;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df0a53e319e45b3acc0cfc2e85314853", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.machpro.component.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df0a53e319e45b3acc0cfc2e85314853");
            }
            try {
                if (i == 10001) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "429a47465a1a3bd36cd2698464873237", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (com.sankuai.waimai.machpro.component.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "429a47465a1a3bd36cd2698464873237");
                        return a2;
                    }
                    if (MPListComponent.this.y == null) {
                        MPListComponent.this.dispatchEvent("headerView", null);
                        MPListComponent.this.y = com.sankuai.waimai.machpro.component.cellcontainer.a.b();
                    }
                    if (MPListComponent.this.y.getView().getParent() instanceof ViewGroup) {
                        ((ViewGroup) MPListComponent.this.y.getView().getParent()).removeView(MPListComponent.this.y.getView());
                    }
                    FrameLayout frameLayout = new FrameLayout(MPListComponent.this.mMachContext.getContext());
                    if (MPListComponent.this.y != null && MPListComponent.this.y.getView() != null) {
                        frameLayout.addView(MPListComponent.this.y.getView());
                    }
                    MPListComponent.A(MPListComponent.this);
                    dVar = new com.sankuai.waimai.machpro.component.d(frameLayout);
                    dVar.a = MPListComponent.this.g;
                    return dVar;
                }
                if (i == 10002) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2876f9d71f58649aad64c9e02257e8dd", RobustBitConfig.DEFAULT_VALUE)) {
                        if (MPListComponent.this.x == null) {
                            MPListComponent.this.dispatchEvent("footerView", null);
                            MPListComponent.this.x = com.sankuai.waimai.machpro.component.cellcontainer.a.b();
                        }
                        if (MPListComponent.this.x.getView().getParent() instanceof ViewGroup) {
                            ((ViewGroup) MPListComponent.this.x.getView().getParent()).removeView(MPListComponent.this.x.getView());
                        }
                        FrameLayout frameLayout2 = new FrameLayout(MPListComponent.this.mMachContext.getContext());
                        if (MPListComponent.this.x != null && MPListComponent.this.x.getView() != null) {
                            frameLayout2.addView(MPListComponent.this.x.getView());
                        }
                        MPListComponent.A(MPListComponent.this);
                        dVar = new com.sankuai.waimai.machpro.component.d(frameLayout2);
                        dVar.a = MPListComponent.this.g;
                        return dVar;
                    }
                    a2 = (com.sankuai.waimai.machpro.component.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2876f9d71f58649aad64c9e02257e8dd");
                } else if (i == 10003) {
                    a2 = this.f.a();
                } else {
                    int f = f(b(this.e));
                    if (f == 20002) {
                        a2 = a("createCell", i);
                    } else if (f == 20001) {
                        a2 = a("createSectionHeader", i);
                    } else if (f != 20003) {
                        return null;
                    } else {
                        a2 = a("createSectionFooter", i);
                    }
                }
                return a2;
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a("MPListComponent | " + e.getMessage());
                return null;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        /* renamed from: a */
        public final void onBindViewHolder(com.sankuai.waimai.machpro.component.d dVar, int i) {
            Object[] objArr = {dVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c69fcdab3ddff16b2d4284f3c755e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c69fcdab3ddff16b2d4284f3c755e0");
                return;
            }
            try {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 10001) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f0733c693530c646840b62dbdb44d27", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f0733c693530c646840b62dbdb44d27");
                    } else if (dVar != null) {
                        if ((dVar.itemView instanceof FrameLayout) && ((FrameLayout) dVar.itemView).getChildCount() <= 0) {
                            FrameLayout frameLayout = (FrameLayout) dVar.itemView;
                            if (MPListComponent.this.y != null) {
                                if (MPListComponent.this.y.getView().getParent() instanceof ViewGroup) {
                                    ((ViewGroup) MPListComponent.this.y.getView().getParent()).removeView(MPListComponent.this.y.getView());
                                }
                                frameLayout.addView(MPListComponent.this.y.getView());
                            }
                        }
                        MPListComponent.this.dispatchEvent("headerView", null);
                    }
                } else if (itemViewType == 10002) {
                    Object[] objArr3 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec00b254f8e99157591754992a04b52f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec00b254f8e99157591754992a04b52f");
                    } else if (dVar != null) {
                        if ((dVar.itemView instanceof FrameLayout) && ((FrameLayout) dVar.itemView).getChildCount() <= 0) {
                            FrameLayout frameLayout2 = (FrameLayout) dVar.itemView;
                            if (MPListComponent.this.x != null) {
                                if (MPListComponent.this.x.getView().getParent() instanceof ViewGroup) {
                                    ((ViewGroup) MPListComponent.this.x.getView().getParent()).removeView(MPListComponent.this.x.getView());
                                }
                                frameLayout2.addView(MPListComponent.this.x.getView());
                            }
                        }
                        MPListComponent.this.dispatchEvent("footerView", null);
                    }
                } else if (itemViewType == 10003) {
                    if (dVar instanceof e) {
                        ((e) dVar).a(this.g);
                    }
                } else {
                    int b = b(i);
                    int f = f(b);
                    int d = d(b);
                    if (f == 20002) {
                        int b2 = b(d, b);
                        Object[] objArr4 = {dVar, Integer.valueOf(d), Integer.valueOf(b2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c954c2afe74f1de549a7941777b08bea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c954c2afe74f1de549a7941777b08bea");
                        } else {
                            MachMap machMap = new MachMap();
                            machMap.put("section", Integer.valueOf(d));
                            machMap.put("item", Integer.valueOf(b2));
                            MachMap machMap2 = new MachMap();
                            machMap2.put("uniqueID", Integer.valueOf(dVar.a));
                            machMap2.put("indexPath", machMap);
                            MachArray machArray = new MachArray();
                            machArray.add(machMap2);
                            MPListComponent.this.dispatchEvent("updateCell", machArray);
                        }
                    } else if (f == 20001) {
                        a("updateSectionHeader", dVar, d);
                    } else if (f == 20003) {
                        a("updateSectionFooter", dVar, d);
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "517c487f043ae7aa5b8fe43ca280861e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "517c487f043ae7aa5b8fe43ca280861e");
                    } else if (MPListComponent.this.mMachContext.getBundle() != null && "mach_pro_waimai_restaurant_recommend_helper".equals(MPListComponent.this.mMachContext.getBundle().d)) {
                        MPListComponent.this.mMachContext.getJSContext().c();
                    }
                    Object[] objArr6 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "770c0cf225cf1ddd42d58fc958f440e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "770c0cf225cf1ddd42d58fc958f440e2");
                        return;
                    }
                    if (!MPListComponent.this.v.contains(Integer.valueOf(i))) {
                        MPListComponent.this.v.add(Integer.valueOf(i));
                    }
                    if (MPListComponent.this.t != 1 && MPListComponent.this.t != 0) {
                        if (MPListComponent.this.t != 2) {
                            if (MPListComponent.this.t == 3 || MPListComponent.this.t == 4) {
                                MPListComponent.d(MPListComponent.this, -1);
                                com.sankuai.waimai.machpro.util.b.b().postDelayed(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.a.3
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr7 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "40e7b7a04e971f44328273db4c5d2da5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "40e7b7a04e971f44328273db4c5d2da5");
                                            return;
                                        }
                                        int findFirstVisibleItemPosition = MPListComponent.this.r.findFirstVisibleItemPosition();
                                        int findLastVisibleItemPosition = MPListComponent.this.r.findLastVisibleItemPosition();
                                        LinkedList linkedList = null;
                                        Iterator it = MPListComponent.this.w.iterator();
                                        while (it.hasNext()) {
                                            Integer num = (Integer) it.next();
                                            if (num.intValue() < findFirstVisibleItemPosition || num.intValue() > findLastVisibleItemPosition) {
                                                if (linkedList == null) {
                                                    linkedList = new LinkedList();
                                                }
                                                linkedList.add(num);
                                                MPListComponent.this.c(num.intValue());
                                            }
                                        }
                                        if (linkedList != null && linkedList.size() > 0) {
                                            MPListComponent.this.w.removeAll(linkedList);
                                        }
                                        while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                                            if (!MPListComponent.this.w.contains(Integer.valueOf(findFirstVisibleItemPosition))) {
                                                MPListComponent.this.w.add(Integer.valueOf(findFirstVisibleItemPosition));
                                                MPListComponent.this.b(findFirstVisibleItemPosition);
                                            }
                                            findFirstVisibleItemPosition++;
                                        }
                                        MPListComponent.this.v.clear();
                                    }
                                }, 20L);
                                return;
                            }
                            return;
                        }
                        MPListComponent.d(MPListComponent.this, -1);
                        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.a.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b5a0a1a3aee6eae1c73f54e3eb41d25e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b5a0a1a3aee6eae1c73f54e3eb41d25e");
                                    return;
                                }
                                int findLastVisibleItemPosition = MPListComponent.this.r.findLastVisibleItemPosition();
                                for (int findFirstVisibleItemPosition = MPListComponent.this.r.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                                    MPListComponent.this.w.add(Integer.valueOf(findFirstVisibleItemPosition));
                                    MPListComponent.this.b(findFirstVisibleItemPosition);
                                }
                                MPListComponent.this.v.clear();
                            }
                        });
                        return;
                    }
                    MPListComponent.d(MPListComponent.this, -1);
                    com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7a694580377b07236cb0135859d98f54", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7a694580377b07236cb0135859d98f54");
                                return;
                            }
                            Iterator it = MPListComponent.this.v.iterator();
                            while (it.hasNext()) {
                                Integer num = (Integer) it.next();
                                if (!MPListComponent.this.w.contains(num)) {
                                    MPListComponent.this.w.add(num);
                                    MPListComponent.this.b(num.intValue());
                                }
                            }
                            MPListComponent.this.v.clear();
                        }
                    });
                }
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a("MPListComponent | " + e.getMessage());
            }
        }

        void a(String str, com.sankuai.waimai.machpro.component.d dVar, int i) {
            Object[] objArr = {str, dVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e79d7dacfc9f2844e89232e641bf1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e79d7dacfc9f2844e89232e641bf1c");
                return;
            }
            MachMap machMap = new MachMap();
            machMap.put("uniqueID", Integer.valueOf(dVar.a));
            machMap.put("section", Integer.valueOf(i));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            MPListComponent.this.dispatchEvent(str, machArray);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dece92751bfcbb1311e50564d333bee", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dece92751bfcbb1311e50564d333bee")).intValue();
            }
            if (this.c) {
                c();
            }
            int i = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                i += g(i2);
            }
            if (b()) {
                i++;
            }
            if (e()) {
                i++;
            }
            return d() ? i + 1 : i;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            boolean z;
            String str;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71b248b1f8e3925156c53893063e99b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71b248b1f8e3925156c53893063e99b")).intValue();
            }
            this.e = i;
            if (i == 0 && b()) {
                return 10001;
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed95a71d40f2f1f2f04db26d10f660fc", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed95a71d40f2f1f2f04db26d10f660fc")).booleanValue();
            } else {
                z = e() && (!d() ? i != getItemCount() - 1 : i != getItemCount() - 2);
            }
            if (z) {
                return 10002;
            }
            if (i == getItemCount() - 1 && d()) {
                return 10003;
            }
            int b = b(i);
            int d = d(b);
            int f = f(b);
            if (f == 20001) {
                Object[] objArr3 = {Integer.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2448611529996fdd8d3740b113b32696", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2448611529996fdd8d3740b113b32696")).intValue();
                }
                String i2 = i(d);
                if (TextUtils.isEmpty(i2)) {
                    return 0;
                }
                return MPListComponent.this.q.a(i2);
            } else if (f != 20002) {
                if (f == 20003) {
                    Object[] objArr4 = {Integer.valueOf(d)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "10ddec8fa7a72640e18269d9ad8b4814", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "10ddec8fa7a72640e18269d9ad8b4814")).intValue();
                    }
                    String j = j(d);
                    if (TextUtils.isEmpty(j)) {
                        return 0;
                    }
                    return MPListComponent.this.q.a(j);
                }
                return super.getItemViewType(i);
            } else {
                int b2 = b(d, b);
                Object[] objArr5 = {Integer.valueOf(d), Integer.valueOf(b2)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f8c227fa894871f5d45722c7ee35292b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f8c227fa894871f5d45722c7ee35292b")).intValue();
                }
                h hVar = MPListComponent.this.q;
                Object[] objArr6 = {Integer.valueOf(d), Integer.valueOf(b2)};
                ChangeQuickRedirect changeQuickRedirect6 = h.a;
                if (PatchProxy.isSupport(objArr6, hVar, changeQuickRedirect6, false, "03c926e88539de010f42335a39d01857", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr6, hVar, changeQuickRedirect6, false, "03c926e88539de010f42335a39d01857");
                } else {
                    str = hVar.b.get(String.valueOf(d) + b2);
                }
                if (str == null) {
                    MachMap machMap = new MachMap();
                    machMap.put("section", Integer.valueOf(d));
                    machMap.put("item", Integer.valueOf(b2));
                    MachArray machArray = new MachArray();
                    machArray.add(machMap);
                    str = com.sankuai.waimai.machpro.util.b.a(MPListComponent.this.dispatchEvent("cellType", machArray), "");
                    if (TextUtils.isEmpty(str)) {
                        MPListComponent.this.b.setVisibility(4);
                    }
                    h hVar2 = MPListComponent.this.q;
                    Object[] objArr7 = {Integer.valueOf(d), Integer.valueOf(b2), str};
                    ChangeQuickRedirect changeQuickRedirect7 = h.a;
                    if (PatchProxy.isSupport(objArr7, hVar2, changeQuickRedirect7, false, "9251fffdf5b29eb96d8232b2fb40713d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, hVar2, changeQuickRedirect7, false, "9251fffdf5b29eb96d8232b2fb40713d");
                    } else {
                        hVar2.b.put(String.valueOf(d) + b2, str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return 0;
                }
                int a2 = MPListComponent.this.q.a(str);
                if (a2 > 20 && MPListComponent.this.mMachContext != null) {
                    MPListComponent.this.mMachContext.getInstance().a("告警！！！<list> 的 cellType 数目大于 20，请检查 cell 复用逻辑!");
                }
                return a2;
            }
        }

        private boolean d() {
            return this.f != null;
        }

        @Override // com.sankuai.waimai.machpro.component.list.c
        public final void a(com.sankuai.waimai.machpro.component.list.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d667276dd756672ec70c5e379f3ec6a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d667276dd756672ec70c5e379f3ec6a8");
                return;
            }
            this.f = aVar;
            a();
        }

        @Override // com.sankuai.waimai.machpro.component.list.c
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68de3ea94b936f717bc98052abdf0c67", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68de3ea94b936f717bc98052abdf0c67");
            } else if (this.g != i) {
                this.g = i;
                if (d()) {
                    a();
                }
            }
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8487088dce5ae89403e35b145ed7962", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8487088dce5ae89403e35b145ed7962");
            } else if (MPListComponent.this.b.isComputingLayout()) {
                MPListComponent.this.b.post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.MPListComponent.a.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5193b018d3cc46b41f301293b41ed01a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5193b018d3cc46b41f301293b41ed01a");
                        } else {
                            a.this.notifyDataSetChanged();
                        }
                    }
                });
            } else {
                notifyDataSetChanged();
            }
        }

        public final int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36a2f29b86a7687b65dd526e97449d3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36a2f29b86a7687b65dd526e97449d3")).intValue() : (i <= 0 || !b()) ? i : i - 1;
        }

        public final int a(int i, int i2) {
            f fVar;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cc45ba8f514e1004a7e22b550ed36a5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cc45ba8f514e1004a7e22b550ed36a5")).intValue();
            }
            if (i < 0 || i2 < 0) {
                return -1;
            }
            int c = (b() ? 1 : 0) + c(0, i);
            if (i < this.b.size() && (fVar = this.b.get(i)) != null && fVar.b) {
                c++;
            }
            return c + i2;
        }

        public final int[] c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c5e30da7f524f276e608091076d6b5", RobustBitConfig.DEFAULT_VALUE)) {
                return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c5e30da7f524f276e608091076d6b5");
            }
            int[] iArr = {-1, -1};
            if (i < 0 || i >= getItemCount()) {
                return iArr;
            }
            int b = b(i);
            iArr[0] = d(b);
            iArr[1] = b(iArr[0], b);
            return iArr;
        }

        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "315fa8b0703b43a1d915c267b3af38d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "315fa8b0703b43a1d915c267b3af38d9")).booleanValue() : MPListComponent.this.o;
        }

        private boolean e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d15bc9788487836312b1d896ff692e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d15bc9788487836312b1d896ff692e")).booleanValue() : MPListComponent.this.p;
        }

        private com.sankuai.waimai.machpro.component.d a(String str, int i) {
            View frameLayout;
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e264fefcd0e9138b75887ef498bd7346", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.machpro.component.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e264fefcd0e9138b75887ef498bd7346");
            }
            MPListComponent.A(MPListComponent.this);
            MachMap machMap = new MachMap();
            machMap.put("type", MPListComponent.this.q.a(i));
            machMap.put("uniqueID", Integer.valueOf(MPListComponent.this.g));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            MPListComponent.this.dispatchEvent(str, machArray);
            com.sankuai.waimai.machpro.component.cellcontainer.a b = com.sankuai.waimai.machpro.component.cellcontainer.a.b();
            if (b == null) {
                frameLayout = new FrameLayout(MPListComponent.this.mMachContext.getContext());
            } else {
                frameLayout = b.getView();
            }
            com.sankuai.waimai.machpro.component.d dVar = new com.sankuai.waimai.machpro.component.d(frameLayout);
            dVar.a = MPListComponent.this.g;
            return dVar;
        }

        public final int d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f1ec7aa9b2ccd267160d53cb3f359a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f1ec7aa9b2ccd267160d53cb3f359a")).intValue();
            }
            int size = this.b.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += g(i3);
                if (i < i2) {
                    return i3;
                }
            }
            return -1;
        }

        public final int e(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3c6d8a175f6bd4793c384d3531f868", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3c6d8a175f6bd4793c384d3531f868")).intValue();
            }
            if (i < 0 || i >= this.b.size() || !this.b.get(i).b) {
                return -1;
            }
            int c = c(0, i);
            return b() ? c + 1 : c;
        }

        public final int b(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3331ecd83b0096da23f74f19a55a37f1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3331ecd83b0096da23f74f19a55a37f1")).intValue();
            }
            if (i < 0 || i >= this.b.size()) {
                return -1;
            }
            int c = c(0, i + 1);
            f fVar = this.b.get(i);
            int i3 = (fVar.d - (c - i2)) + (fVar.c ? 1 : 0);
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }

        public final int c(int i, int i2) {
            int i3 = 0;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3c62f99d0cebc10ab76e6d8ebed1bff", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3c62f99d0cebc10ab76e6d8ebed1bff")).intValue();
            }
            int size = this.b.size();
            for (int i4 = i; i4 < size && i4 < i + i2; i4++) {
                i3 += g(i4);
            }
            return i3;
        }

        private int g(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c370a088c5d64f0d6c28e5d033a756cd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c370a088c5d64f0d6c28e5d033a756cd")).intValue();
            }
            if (i < 0 || i >= this.b.size()) {
                return 0;
            }
            f fVar = this.b.get(i);
            int i2 = (fVar.b ? 1 : 0) + fVar.d;
            return fVar.c ? i2 + 1 : i2;
        }

        private int f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a490c8adf78f7eec5c4abc0fbab00030", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a490c8adf78f7eec5c4abc0fbab00030")).intValue() : Math.max(com.sankuai.waimai.machpro.util.b.c(MPListComponent.this.dispatchEvent("numberOfSections", null)), 0);
        }

        private int h(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42d38aaa17a029a8e4d5a783b985239", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42d38aaa17a029a8e4d5a783b985239")).intValue();
            }
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(i));
            return com.sankuai.waimai.machpro.util.b.c(MPListComponent.this.dispatchEvent("numberOfItemsInSection", machArray));
        }

        private String i(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1726a3eb3e39a23c1938d0e27543d269", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1726a3eb3e39a23c1938d0e27543d269");
            }
            String b = MPListComponent.this.q.b(i);
            if (b != null) {
                return b;
            }
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(i));
            String a2 = com.sankuai.waimai.machpro.util.b.a(MPListComponent.this.dispatchEvent("sectionHeaderType", machArray), "");
            if (!TextUtils.isEmpty(a2)) {
                MPListComponent.this.q.a(i, a2);
            }
            return a2;
        }

        private String j(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cdc7af8d9714acc5b8964c67ee197a3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cdc7af8d9714acc5b8964c67ee197a3");
            }
            String c = MPListComponent.this.q.c(i);
            if (c != null) {
                return c;
            }
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(i));
            String a2 = com.sankuai.waimai.machpro.util.b.a(MPListComponent.this.dispatchEvent("sectionFooterType", machArray), "");
            if (!TextUtils.isEmpty(a2)) {
                MPListComponent.this.q.b(i, a2);
            }
            return a2;
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97968bb8a7c028918e1cb4152714c33f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97968bb8a7c028918e1cb4152714c33f");
                return;
            }
            this.b.clear();
            MPListComponent.this.q.a();
            int f = f();
            for (int i = 0; i < f; i++) {
                this.b.add(new f(!TextUtils.isEmpty(i(i)), !TextUtils.isEmpty(j(i)), h(i)));
            }
            this.c = false;
        }

        public final int f(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a438a392b74eb8760766094f77dde371", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a438a392b74eb8760766094f77dde371")).intValue();
            }
            int size = this.b.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.b.get(i3);
                if (fVar.b && i < (i2 = i2 + 1)) {
                    return IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM;
                }
                i2 += fVar.d;
                if (i < i2) {
                    return IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM;
                }
                if (fVar.c && i < (i2 = i2 + 1)) {
                    return 20003;
                }
            }
            return IjkMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int itemViewType;
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac24f8fc9d4b9cb9e2db50c97160381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac24f8fc9d4b9cb9e2db50c97160381");
            return;
        }
        if (!this.i && !this.k && !this.m) {
            z = false;
        }
        if (!z || this.h == null || (itemViewType = this.h.getItemViewType(i)) == 10001 || itemViewType == 10002 || itemViewType == 10003) {
            return;
        }
        int b = this.h.b(i);
        int f = this.h.f(b);
        int d = this.h.d(b);
        MachArray machArray = new MachArray();
        if (f == 20002) {
            if (this.i) {
                int b2 = this.h.b(d, b);
                MachMap machMap = new MachMap();
                machMap.put("section", Integer.valueOf(d));
                machMap.put("item", Integer.valueOf(b2));
                machArray.add(machMap);
                dispatchEvent("cellAppear", machArray);
            }
        } else if (f == 20001) {
            if (this.k) {
                machArray.add(Integer.valueOf(d));
                dispatchEvent("sectionHeaderAppear", machArray);
            }
        } else if (f == 20003 && this.m) {
            machArray.add(Integer.valueOf(d));
            dispatchEvent("sectionFooterAppear", machArray);
        }
    }
}
