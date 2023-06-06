package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.swiper.MPSwiperRecyclerView;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPSwiperComponentV2 extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    private a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private MPViewPager f;
    private int g;
    private com.sankuai.waimai.machpro.component.swiper_v2.b h;

    public static /* synthetic */ void a(MPSwiperComponentV2 mPSwiperComponentV2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPSwiperComponentV2, changeQuickRedirect, false, "a06662c597deb1dba753b762760263f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPSwiperComponentV2, changeQuickRedirect, false, "a06662c597deb1dba753b762760263f0");
            return;
        }
        int a2 = mPSwiperComponentV2.a();
        if (!mPSwiperComponentV2.e || a2 == -1 || mPSwiperComponentV2.g == a2 || mPSwiperComponentV2.b == null) {
            return;
        }
        mPSwiperComponentV2.g = a2;
        MachArray machArray = new MachArray();
        machArray.add(Integer.valueOf(mPSwiperComponentV2.b.a(a2)));
        mPSwiperComponentV2.dispatchEvent("didScrollToItem", machArray);
    }

    public static /* synthetic */ void a(MPSwiperComponentV2 mPSwiperComponentV2, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPSwiperComponentV2, changeQuickRedirect, false, "206aa0826084eb7d6ad310c8b6eb8fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPSwiperComponentV2, changeQuickRedirect, false, "206aa0826084eb7d6ad310c8b6eb8fae");
        } else if (!mPSwiperComponentV2.d || mPSwiperComponentV2.b == null) {
        } else {
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(mPSwiperComponentV2.b.a(i)));
            mPSwiperComponentV2.dispatchEvent("willScrollToItem", machArray);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d27c5c9a0fbaa52de711e6e30b05f86e", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d27c5c9a0fbaa52de711e6e30b05f86e");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        this.b = new a();
        this.f = new MPViewPager(this.mMachContext.getContext());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52786c291138b3d217f56feee4a00a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52786c291138b3d217f56feee4a00a88");
        } else {
            this.f.getRecyclerView().addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2e22db119406cb5302a30088f263e69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2e22db119406cb5302a30088f263e69");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        MPSwiperComponentV2.a(MPSwiperComponentV2.this);
                    }
                }
            });
            this.f.getRecyclerView().setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.2
                public static ChangeQuickRedirect a;
                public int b = 0;
                public int c = -1;
                public int d = -1;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
                    if (r13 < r11.c) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
                    if (r0 < r11.d) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
                    r12 = 0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
                @Override // android.view.View.OnTouchListener
                @android.annotation.SuppressLint({"ClickableViewAccessibility"})
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                    /*
                        r11 = this;
                        r0 = 2
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        r8 = 0
                        r0[r8] = r12
                        r12 = 1
                        r0[r12] = r13
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.AnonymousClass2.a
                        java.lang.String r10 = "b6aab0fd50b1b5e9aeadfb85475f4df2"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r0
                        r2 = r11
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L25
                        java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
                        java.lang.Boolean r12 = (java.lang.Boolean) r12
                        boolean r12 = r12.booleanValue()
                        return r12
                    L25:
                        int r0 = r13.getActionMasked()
                        r1 = -1
                        switch(r0) {
                            case 0: goto L95;
                            case 1: goto L8e;
                            case 2: goto L2f;
                            default: goto L2d;
                        }
                    L2d:
                        goto La5
                    L2f:
                        float r0 = r13.getRawY()
                        int r0 = (int) r0
                        float r13 = r13.getRawX()
                        int r13 = (int) r13
                        int r2 = r11.d
                        if (r2 == r1) goto L41
                        int r2 = r11.c
                        if (r2 != r1) goto L45
                    L41:
                        r11.c = r13
                        r11.d = r0
                    L45:
                        com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2 r2 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.this
                        com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager r2 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.b(r2)
                        int r2 = r2.getOrientation()
                        if (r2 != 0) goto L5c
                        int r0 = r11.c
                        if (r13 <= r0) goto L57
                    L55:
                        r12 = -1
                        goto L67
                    L57:
                        int r0 = r11.c
                        if (r13 >= r0) goto L66
                        goto L67
                    L5c:
                        int r13 = r11.d
                        if (r0 <= r13) goto L61
                        goto L55
                    L61:
                        int r13 = r11.d
                        if (r0 >= r13) goto L66
                        goto L67
                    L66:
                        r12 = 0
                    L67:
                        int r13 = r11.b
                        if (r12 == r13) goto La5
                        r11.b = r12
                        com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2 r12 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.this
                        int r12 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.c(r12)
                        int r13 = r11.b
                        int r12 = r12 + r13
                        if (r12 < 0) goto La5
                        com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2 r13 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.this
                        com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager r13 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.b(r13)
                        android.support.v7.widget.RecyclerView$a r13 = r13.getAdapter()
                        int r13 = r13.getItemCount()
                        if (r12 >= r13) goto La5
                        com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2 r13 = com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.this
                        com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.a(r13, r12)
                        goto La5
                    L8e:
                        r11.b = r8
                        r11.c = r1
                        r11.d = r1
                        goto La5
                    L95:
                        r11.b = r8
                        float r12 = r13.getRawX()
                        int r12 = (int) r12
                        r11.c = r12
                        float r12 = r13.getRawY()
                        int r12 = (int) r12
                        r11.d = r12
                    La5:
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }
        this.f.setAdapter(this.b);
        this.f.setAlignmentType(1);
        this.f.setOrientation(0);
        this.h = new com.sankuai.waimai.machpro.component.swiper_v2.b();
        this.f.setPageTransformer(this.h);
        frameLayout.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public MPSwiperComponentV2(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c92854313bde90b99700d0e946c723c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c92854313bde90b99700d0e946c723c3");
        } else {
            this.g = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        int height;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34c8b0614f72f44895a6141e6e73465", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34c8b0614f72f44895a6141e6e73465")).intValue();
        }
        if (this.f == null || this.f.getRecyclerView() == null) {
            return -1;
        }
        MPSwiperRecyclerView recyclerView = this.f.getRecyclerView();
        int[] iArr = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        if (this.f.getOrientation() == 0) {
            height = iArr[0] + (recyclerView.getWidth() / 2);
        } else {
            height = iArr[1] + (recyclerView.getHeight() / 2);
        }
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if (this.f.getOrientation() == 0) {
                    if (iArr2[0] <= height && iArr2[0] + childAt.getWidth() >= height) {
                        return recyclerView.getChildAdapterPosition(childAt);
                    }
                } else if (iArr2[1] < height && iArr2[1] + childAt.getHeight() >= height) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return -1;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605039d1d1fbe449b019c04327fd5872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605039d1d1fbe449b019c04327fd5872");
            return;
        }
        super.onAttachToParent();
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r14.equals("itemSpace") != false) goto L13;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4dd560597c4086c38f15f815097810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4dd560597c4086c38f15f815097810");
        } else {
            com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPSwiperComponentV2.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f66071f3d2ff98d553e3fa96ffee63ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f66071f3d2ff98d553e3fa96ffee63ef");
                        return;
                    }
                    if (MPSwiperComponentV2.this.c && MPSwiperComponentV2.this.b != null && MPSwiperComponentV2.this.f != null && MPSwiperComponentV2.this.b.b > 1) {
                        MPSwiperComponentV2.this.f.a(MPSwiperComponentV2.this.b.b * 30, false);
                    }
                    MPSwiperComponentV2.a(MPSwiperComponentV2.this);
                }
            });
        }
    }

    @JSMethod(methodName = "reloadData")
    @Keep
    public void reloadData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75dcebb74432d21954aa02915632890f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75dcebb74432d21954aa02915632890f");
        } else if (this.b != null) {
            this.b.notifyDataSetChanged();
            b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.a<b> {
        public static ChangeQuickRedirect a;
        int b;
        private int d;
        private ArrayMap<String, Integer> e;
        private int f;

        public a() {
            Object[] objArr = {MPSwiperComponentV2.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a44e90a7f7456d6192c37109b0f277", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a44e90a7f7456d6192c37109b0f277");
            } else {
                this.e = new ArrayMap<>();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04db0c0d5e4a517863f1c0d1160b8024", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04db0c0d5e4a517863f1c0d1160b8024");
                return;
            }
            MachMap machMap = new MachMap();
            machMap.put("uniqueID", Integer.valueOf(bVar2.a));
            machMap.put("index", Integer.valueOf(a(i)));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            MPSwiperComponentV2.this.dispatchEvent("updateCell", machArray);
            MPSwiperComponentV2.this.mMachContext.getJSContext().c();
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
            com.sankuai.waimai.machpro.component.view.c frameLayout;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6b4a00a85f0d35b8811f4fe90189ab", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6b4a00a85f0d35b8811f4fe90189ab");
            }
            this.f++;
            MachMap machMap = new MachMap();
            machMap.put("type", b(i));
            machMap.put("uniqueID", Integer.valueOf(this.f));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            MPSwiperComponentV2.this.dispatchEvent("createCell", machArray);
            com.sankuai.waimai.machpro.component.swiper.a b = com.sankuai.waimai.machpro.component.swiper.a.b();
            b.c = MPSwiperComponentV2.this.f;
            if (b == null) {
                frameLayout = new FrameLayout(MPSwiperComponentV2.this.mMachContext.getContext());
            } else {
                frameLayout = b.getView();
            }
            b bVar = new b(frameLayout);
            bVar.a = this.f;
            return bVar;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd9727861de64c840b3bf9f0263aa1c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd9727861de64c840b3bf9f0263aa1c")).intValue();
            }
            this.b = com.sankuai.waimai.machpro.util.b.c(MPSwiperComponentV2.this.dispatchEvent("itemCount", null));
            int i = this.b;
            return (!MPSwiperComponentV2.this.c || i <= 1) ? i : i * 400;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e271acd8a0038ab65262d5a461471e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e271acd8a0038ab65262d5a461471e")).intValue();
            }
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(a(i)));
            String a2 = com.sankuai.waimai.machpro.util.b.a(MPSwiperComponentV2.this.dispatchEvent("cellType", machArray), "");
            if (TextUtils.isEmpty(a2)) {
                return 0;
            }
            Integer num = this.e.get(a2);
            if (num == null) {
                int i2 = this.d;
                this.d = i2 + 1;
                num = Integer.valueOf(i2);
                this.e.put(a2, num);
            }
            return num.intValue();
        }

        private String b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a59860c5e8468ab4c56905d38fc1a74", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a59860c5e8468ab4c56905d38fc1a74");
            }
            for (String str : this.e.keySet()) {
                if (i == this.e.get(str).intValue()) {
                    return str;
                }
            }
            return "";
        }

        int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ae0179baa18c4b27a9608927086e34", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ae0179baa18c4b27a9608927086e34")).intValue();
            }
            if (this.b == 0) {
                getItemCount();
            }
            if (this.b == 0) {
                return 0;
            }
            return i % this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.s {
        public int a;

        public b(View view) {
            super(view);
            this.a = -1;
        }
    }
}
