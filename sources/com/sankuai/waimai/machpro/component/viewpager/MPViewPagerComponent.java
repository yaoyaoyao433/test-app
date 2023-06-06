package com.sankuai.waimai.machpro.component.viewpager;

import android.support.annotation.Keep;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.viewpager.MPViewPagerAdapter;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPViewPagerComponent extends MPComponent<MPViewPager> {
    public static ChangeQuickRedirect a;
    private final MPContext b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private MPViewPagerAdapter n;
    private b o;
    private a p;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ MPViewPager createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2280c599987c13eae135669a9175d5d0", RobustBitConfig.DEFAULT_VALUE) ? (MPViewPager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2280c599987c13eae135669a9175d5d0") : new MPViewPager(this.mMachContext.getContext());
    }

    public MPViewPagerComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d744f1c876ac747cdafd216d05e20612", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d744f1c876ac747cdafd216d05e20612");
            return;
        }
        this.f = 1;
        this.g = 0;
        this.i = true;
        this.b = mPContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7cf32d21b36bdb6d21137f01de85e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7cf32d21b36bdb6d21137f01de85e2");
            return;
        }
        this.c = com.sankuai.waimai.machpro.util.b.c(dispatchEvent("pageCount", null));
        this.n = new MPViewPagerAdapter(this.c);
        this.p = new a();
        this.n.b = this.p;
        getView().setScrollEnable(this.i);
        ((ViewGroup) getView().getParent()).setClipChildren(true);
        getView().setAdapter(this.n);
        this.o = new b();
        getView().addOnPageChangeListener(this.o);
        preCachePage(this.e);
        this.d = getView().getWidth();
        getView().setOffscreenPageLimit(2);
        if (this.h && this.c > 1) {
            if (this.e == 0) {
                preCachePage(Math.min(this.e + 1, this.c - 1));
            } else if (this.e == this.c - 1) {
                preCachePage(Math.max(this.e - 1, 0));
            } else {
                preCachePage(this.e - 1);
                preCachePage(this.e + 1);
            }
        }
        getView().setCurrentItem(this.e);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757979851fed6c6c210afad609fc0880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757979851fed6c6c210afad609fc0880");
            return;
        }
        if (this.n != null) {
            MPViewPagerAdapter mPViewPagerAdapter = this.n;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MPViewPagerAdapter.a;
            if (PatchProxy.isSupport(objArr2, mPViewPagerAdapter, changeQuickRedirect2, false, "e18d6620bd83fb1ec14b120392d4b73d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mPViewPagerAdapter, changeQuickRedirect2, false, "e18d6620bd83fb1ec14b120392d4b73d");
            } else {
                if (mPViewPagerAdapter.c != null) {
                    mPViewPagerAdapter.c.removeAllViews();
                }
                int size = mPViewPagerAdapter.d.size();
                for (int i = 0; i < size; i++) {
                    mPViewPagerAdapter.d.valueAt(i).removeAllViews();
                }
                mPViewPagerAdapter.d.clear();
            }
            this.n = null;
        }
        this.p = null;
        if (getView() != null) {
            getView().removeOnPageChangeListener(this.o);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d744cd01f9215ffe55f5fea6b235150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d744cd01f9215ffe55f5fea6b235150");
            return;
        }
        super.onAttachToParent();
        if (getView() != null) {
            getView().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.viewpager.MPViewPagerComponent.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9881970a7a7ac2ea9c520eaf853b5c11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9881970a7a7ac2ea9c520eaf853b5c11");
                    } else {
                        MPViewPagerComponent.this.a();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd190d2da2d3d6e579d7b7805be4cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd190d2da2d3d6e579d7b7805be4cd6");
            return;
        }
        super.onDetachFromParent();
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r1.equals("scrollenabled") != false) goto L10;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.machpro.component.viewpager.MPViewPagerComponent.a
            java.lang.String r12 = "d601dee56fbb0c2a286f2c4806ab52f9"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            java.lang.String r1 = r14.toLowerCase()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1267415681: goto L6c;
                case -1117174956: goto L61;
                case -57436921: goto L56;
                case 650802574: goto L4b;
                case 1161771825: goto L40;
                case 1234204627: goto L35;
                case 1479267284: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L76
        L2b:
            java.lang.String r3 = "scrollenabled"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
            goto L77
        L35:
            java.lang.String r0 = "initialpage"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L76
            r0 = 0
            goto L77
        L40:
            java.lang.String r0 = "maxcachecount"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L76
            r0 = 1
            goto L77
        L4b:
            java.lang.String r0 = "listenscrollstart"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L76
            r0 = 3
            goto L77
        L56:
            java.lang.String r0 = "listenscrollend"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L76
            r0 = 5
            goto L77
        L61:
            java.lang.String r0 = "listenscroll"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L76
            r0 = 4
            goto L77
        L6c:
            java.lang.String r0 = "cacheenabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L76
            r0 = 6
            goto L77
        L76:
            r0 = -1
        L77:
            switch(r0) {
                case 0: goto La8;
                case 1: goto La1;
                case 2: goto L9a;
                case 3: goto L93;
                case 4: goto L8c;
                case 5: goto L85;
                case 6: goto L7e;
                default: goto L7a;
            }
        L7a:
            super.updateAttribute(r14, r15)
            return
        L7e:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.h = r14
            return
        L85:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.l = r14
            return
        L8c:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.k = r14
            return
        L93:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.j = r14
            return
        L9a:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.i = r14
            return
        La1:
            int r14 = com.sankuai.waimai.machpro.util.b.c(r15)
            r13.f = r14
            return
        La8:
            int r14 = com.sankuai.waimai.machpro.util.b.c(r15)
            r13.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.viewpager.MPViewPagerComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements MPViewPagerAdapter.a {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {MPViewPagerComponent.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95f9606213baa4f1bc96b152d8e3f9a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95f9606213baa4f1bc96b152d8e3f9a");
            }
        }

        @Override // com.sankuai.waimai.machpro.component.viewpager.MPViewPagerAdapter.a
        public final void a(String str, MachArray machArray) {
            Object[] objArr = {str, machArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78c4cd727e26764e2be47c68aa63de2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78c4cd727e26764e2be47c68aa63de2");
            } else {
                MPViewPagerComponent.this.dispatchEvent(str, machArray);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements ViewPager.OnPageChangeListener {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {MPViewPagerComponent.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070443963e6a5c499d39f8b32ea47f8d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070443963e6a5c499d39f8b32ea47f8d");
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3fadec1623ee5142ebba6f3f54d7178", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3fadec1623ee5142ebba6f3f54d7178");
            } else if (MPViewPagerComponent.this.k && MPViewPagerComponent.this.m) {
                float f2 = (MPViewPagerComponent.this.d * i) + i2;
                float f3 = (i2 + (MPViewPagerComponent.this.d * i)) - MPViewPagerComponent.this.g;
                float f4 = f3 / MPViewPagerComponent.this.d;
                MachArray machArray = new MachArray();
                MachMap machMap = new MachMap();
                if (f3 > 0.0f) {
                    if (f4 != 1.0f) {
                        i = Math.min(i + 1, MPViewPagerComponent.this.c);
                    }
                    machMap.put("index", Integer.valueOf(i));
                } else {
                    machMap.put("index", Integer.valueOf(i));
                }
                machMap.put("offset", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPViewPagerComponent.this.b.getContext(), f2)));
                machArray.add(machMap);
                MPViewPagerComponent.this.dispatchEvent(Constants.FPS_TYPE_SCROLL, machArray);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c2b16068043255cf69c772df82af63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c2b16068043255cf69c772df82af63");
            } else {
                MPViewPagerComponent.this.getView().setCurrentItem(i);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9da17aadf63b0a7e855fee9c4ce992e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9da17aadf63b0a7e855fee9c4ce992e");
                return;
            }
            if (MPViewPagerComponent.this.j && i == 1) {
                MPViewPagerComponent.this.m = true;
                MachArray machArray = new MachArray();
                machArray.add(Integer.valueOf(MPViewPagerComponent.this.getView().getCurrentItem()));
                MPViewPagerComponent.this.dispatchEvent("scrollStart", machArray);
            }
            if (MPViewPagerComponent.this.l && i == 0) {
                MPViewPagerComponent.this.m = false;
                MachArray machArray2 = new MachArray();
                machArray2.add(Integer.valueOf(MPViewPagerComponent.this.getView().getCurrentItem()));
                MPViewPagerComponent.this.dispatchEvent("scrollEnd", machArray2);
            }
            if (i == 1) {
                MPViewPagerComponent.this.g = MPViewPagerComponent.this.getView().getCurrentItem() * MPViewPagerComponent.this.d;
            }
        }
    }

    @JSMethod(methodName = "reloadData")
    @Keep
    public void reloadData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8c0233283c32f920f56ced1c015af4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8c0233283c32f920f56ced1c015af4");
            return;
        }
        b();
        a();
    }

    @JSMethod(methodName = "scrollToIndex")
    @Keep
    public void scrollToIndex(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3684e6db4f7843ab2c7ef5ee55659714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3684e6db4f7843ab2c7ef5ee55659714");
            return;
        }
        int currentItem = getView().getCurrentItem();
        if (getView() == null || i >= this.c) {
            return;
        }
        getView().setCurrentItem(i, z);
        if (z || i == currentItem) {
            return;
        }
        MachArray machArray = new MachArray();
        machArray.add(Integer.valueOf(i));
        dispatchEvent("scrollEnd", machArray);
    }

    @JSMethod(methodName = "preCachePage")
    @Keep
    public void preCachePage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632ebfa59a7f18f3bdde36663ede539d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632ebfa59a7f18f3bdde36663ede539d");
        } else if (getView() == null || i >= this.c || this.n == null) {
        } else {
            this.n.instantiateItem((ViewGroup) getView(), i);
            this.n.a(this.n.d.get(i), i);
        }
    }
}
