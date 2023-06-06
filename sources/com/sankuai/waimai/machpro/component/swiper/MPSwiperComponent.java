package com.sankuai.waimai.machpro.component.swiper;

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
import com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager;
import com.sankuai.waimai.machpro.component.view.c;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPSwiperComponent extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    private MPSwiperRecyclerView b;
    private MPSwiperLayoutManager c;
    private a d;
    private boolean e;
    private boolean f;
    private boolean g;
    private MPSwiperLayoutManager.a h;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccf72372e3ee56d5a9403c1a51750e48", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccf72372e3ee56d5a9403c1a51750e48");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        this.b = new MPSwiperRecyclerView(this.mMachContext.getContext(), null);
        this.c = new MPSwiperLayoutManager(this.b);
        this.c.e = true;
        this.b.setLayoutManager(this.c);
        this.b.setNestedScrollingEnabled(false);
        this.d = new a();
        this.b.setAdapter(this.d);
        frameLayout.addView(this.b);
        return frameLayout;
    }

    public MPSwiperComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78c0ce63f5e7f9bbe811edecc9ab9f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78c0ce63f5e7f9bbe811edecc9ab9f8");
        } else {
            this.h = new MPSwiperLayoutManager.a() { // from class: com.sankuai.waimai.machpro.component.swiper.MPSwiperComponent.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee82cd3c82cf3ebc3b377d913acbc0a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee82cd3c82cf3ebc3b377d913acbc0a9");
                    } else if (MPSwiperComponent.this.f) {
                        MachArray machArray = new MachArray();
                        machArray.add(Integer.valueOf(MPSwiperComponent.this.d.a(i)));
                        MPSwiperComponent.this.dispatchEvent("willScrollToItem", machArray);
                    }
                }

                @Override // com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager.a
                public final void b(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6c6248d3d1b41b6246ab0cbdec52fc3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6c6248d3d1b41b6246ab0cbdec52fc3");
                    } else if (MPSwiperComponent.this.g) {
                        MachArray machArray = new MachArray();
                        machArray.add(Integer.valueOf(MPSwiperComponent.this.d.a(i)));
                        MPSwiperComponent.this.dispatchEvent("didScrollToItem", machArray);
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f06940e0adcb6feecdca21fe1175888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f06940e0adcb6feecdca21fe1175888");
            return;
        }
        super.onAttachToParent();
        this.c.g = this.h;
        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.swiper.MPSwiperComponent.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                int i = 0;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea4b0b615a3b6d551117f3c7e248afdf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea4b0b615a3b6d551117f3c7e248afdf");
                    return;
                }
                if (MPSwiperComponent.this.e && MPSwiperComponent.this.d != null && MPSwiperComponent.this.c != null && MPSwiperComponent.this.d.b > 1) {
                    i = MPSwiperComponent.this.d.b * 30;
                    MPSwiperComponent.this.c.scrollToPosition(i);
                }
                if (MPSwiperComponent.this.h != null) {
                    MPSwiperComponent.this.h.a(i);
                    MPSwiperComponent.this.h.b(i);
                }
            }
        });
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
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.swiper.MPSwiperComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    @JSMethod(methodName = "reloadData")
    @Keep
    public void reloadData() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b453ae4ce2a5b0d791c8d161f4d7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b453ae4ce2a5b0d791c8d161f4d7dc");
        } else if (this.d == null || this.c == null) {
        } else {
            if (this.e) {
                this.d.getItemCount();
                if (this.d.b != 1) {
                    i = this.d.b * 30;
                }
            }
            this.d.notifyDataSetChanged();
            this.c.scrollToPosition(i);
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
            Object[] objArr = {MPSwiperComponent.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d58d8c5e0a29788393740c9784ca2ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d58d8c5e0a29788393740c9784ca2ab");
            } else {
                this.e = new ArrayMap<>();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6bbcbe8164a5bff8d7f243c65cc560", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6bbcbe8164a5bff8d7f243c65cc560");
                return;
            }
            MachMap machMap = new MachMap();
            machMap.put("uniqueID", Integer.valueOf(bVar2.a));
            machMap.put("index", Integer.valueOf(a(i)));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            MPSwiperComponent.this.dispatchEvent("updateCell", machArray);
            MPSwiperComponent.this.mMachContext.getJSContext().c();
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
            c frameLayout;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964c5671f94d570b61210eb161d51342", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964c5671f94d570b61210eb161d51342");
            }
            this.f++;
            MachMap machMap = new MachMap();
            machMap.put("type", b(i));
            machMap.put("uniqueID", Integer.valueOf(this.f));
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            MPSwiperComponent.this.dispatchEvent("createCell", machArray);
            com.sankuai.waimai.machpro.component.swiper.a b = com.sankuai.waimai.machpro.component.swiper.a.b();
            b.b = MPSwiperComponent.this.b;
            if (b == null) {
                frameLayout = new FrameLayout(MPSwiperComponent.this.mMachContext.getContext());
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af3f803c9dc37c958041f6a4efbb995a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af3f803c9dc37c958041f6a4efbb995a")).intValue();
            }
            this.b = com.sankuai.waimai.machpro.util.b.c(MPSwiperComponent.this.dispatchEvent("itemCount", null));
            int i = this.b;
            return (!MPSwiperComponent.this.e || i <= 1) ? i : i * 400;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ff655517734622fcf29242fd496855", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ff655517734622fcf29242fd496855")).intValue();
            }
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(a(i)));
            String a2 = com.sankuai.waimai.machpro.util.b.a(MPSwiperComponent.this.dispatchEvent("cellType", machArray), "");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b0d0f6c83a0fc76a101c52f7e95b48", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b0d0f6c83a0fc76a101c52f7e95b48");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8dcbd65d632ba86cec39a36ead9db58", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8dcbd65d632ba86cec39a36ead9db58")).intValue();
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
