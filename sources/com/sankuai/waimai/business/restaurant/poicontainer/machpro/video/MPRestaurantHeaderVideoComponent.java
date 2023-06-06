package com.sankuai.waimai.business.restaurant.poicontainer.machpro.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.b;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.d;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.e;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiMediaInfo;
import com.sankuai.waimai.platform.widget.RatioFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPRestaurantHeaderVideoComponent extends a<RatioFrameLayout> {
    public static ChangeQuickRedirect a;
    d b;
    public Handler c;
    private Poi e;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ View createView() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c18298bb4d258a7c688d5d199e6cb2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RatioFrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c18298bb4d258a7c688d5d199e6cb2e");
        }
        RatioFrameLayout ratioFrameLayout = new RatioFrameLayout(this.mMachContext.getContext());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e07b1bdf0e946691efc75d469c721a18", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e07b1bdf0e946691efc75d469c721a18")).booleanValue();
        } else {
            z = ((((float) g.b(this.mMachContext.getContext())) * 1.0f) / ((float) g.a(this.mMachContext.getContext()))) * 1.0f < 1.7777778f;
        }
        ratioFrameLayout.setHeightRatio(z ? 8 : 9);
        ratioFrameLayout.setWidthRatio(16);
        ratioFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.b = new d(this.mMachContext.getContext());
        ratioFrameLayout.removeAllViews();
        ratioFrameLayout.addView(LayoutInflater.from(this.mMachContext.getContext()).inflate(R.layout.wm_layout_video_play_view, (ViewGroup) ratioFrameLayout, false));
        this.b.a(ratioFrameLayout);
        this.e = new Poi();
        PoiMediaInfo poiMediaInfo = new PoiMediaInfo();
        this.e.mPoiMediaInfo = poiMediaInfo;
        poiMediaInfo.type = 1;
        return ratioFrameLayout;
    }

    public MPRestaurantHeaderVideoComponent(MPContext mPContext) {
        super(mPContext);
        b bVar;
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19edc69f93a322cb7900d904778082c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19edc69f93a322cb7900d904778082c3");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3d687f5f52a3865805b38b1c66a0574", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3d687f5f52a3865805b38b1c66a0574");
        } else {
            WMRestaurantActivity c = c();
            bVar = c == null ? null : c.e;
        }
        Object[] objArr3 = {bVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a10bd994f6f1e1c3c40ac8705521f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a10bd994f6f1e1c3c40ac8705521f5b");
            return;
        }
        bVar.k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr4 = {bool2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8f2fd774e11721e45ba3a921b9a43298", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8f2fd774e11721e45ba3a921b9a43298");
                } else if (bool2.booleanValue()) {
                    MPRestaurantHeaderVideoComponent mPRestaurantHeaderVideoComponent = MPRestaurantHeaderVideoComponent.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = MPRestaurantHeaderVideoComponent.a;
                    if (PatchProxy.isSupport(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "bdbaefc7ab9825c99b19a29889bf6173", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "bdbaefc7ab9825c99b19a29889bf6173");
                    } else if (mPRestaurantHeaderVideoComponent.b != null) {
                        mPRestaurantHeaderVideoComponent.b.a();
                    }
                }
            }
        }).a(a());
        bVar.j.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr4 = {bool2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0126a7e2639dee4c06c896c50e1989b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0126a7e2639dee4c06c896c50e1989b5");
                } else if (bool2.booleanValue()) {
                    MPRestaurantHeaderVideoComponent mPRestaurantHeaderVideoComponent = MPRestaurantHeaderVideoComponent.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = MPRestaurantHeaderVideoComponent.a;
                    if (PatchProxy.isSupport(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "8a15df9aa3076d570e836897d182ead3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "8a15df9aa3076d570e836897d182ead3");
                    } else if (mPRestaurantHeaderVideoComponent.b != null) {
                        mPRestaurantHeaderVideoComponent.b.b();
                    }
                }
            }
        }).a(a());
        bVar.l.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr4 = {bool2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "538018f66a173a1ffde7e0f0c5bb54c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "538018f66a173a1ffde7e0f0c5bb54c8");
                } else if (bool2.booleanValue()) {
                    MPRestaurantHeaderVideoComponent mPRestaurantHeaderVideoComponent = MPRestaurantHeaderVideoComponent.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = MPRestaurantHeaderVideoComponent.a;
                    if (PatchProxy.isSupport(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "b109091d59539da1f3a64823c95162d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "b109091d59539da1f3a64823c95162d5");
                    } else if (mPRestaurantHeaderVideoComponent.b != null) {
                        mPRestaurantHeaderVideoComponent.b.c();
                    }
                }
            }
        }).a(a());
        bVar.m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3647758c1c66a95589e81bd3b30a21c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3647758c1c66a95589e81bd3b30a21c5");
                } else {
                    MPRestaurantHeaderVideoComponent.this.onDestroy();
                }
            }
        }).a(a());
        bVar.I.j.a().b.a(c(), new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.6
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
            public final boolean b() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8801b374846f39627df50ccfb0d6beb0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8801b374846f39627df50ccfb0d6beb0")).booleanValue();
                }
                MPRestaurantHeaderVideoComponent mPRestaurantHeaderVideoComponent = MPRestaurantHeaderVideoComponent.this;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = MPRestaurantHeaderVideoComponent.a;
                if (PatchProxy.isSupport(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "07faff0bb4cf8cf94f449acdc309d986", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, mPRestaurantHeaderVideoComponent, changeQuickRedirect5, false, "07faff0bb4cf8cf94f449acdc309d986")).booleanValue();
                }
                if (mPRestaurantHeaderVideoComponent.b != null) {
                    d dVar = mPRestaurantHeaderVideoComponent.b;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = d.c;
                    if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "3951b19e3aa3613b6d25ddda67bd1a38", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "3951b19e3aa3613b6d25ddda67bd1a38")).booleanValue();
                    }
                    if (dVar.e != null) {
                        e eVar = dVar.e;
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = e.a;
                        if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "28ab0efcdd49ffa1fe7718afa8c22241", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "28ab0efcdd49ffa1fe7718afa8c22241")).booleanValue();
                        }
                        if (eVar.e == 0 || eVar.e != 1) {
                            return false;
                        }
                        eVar.b(0);
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d99b8736aee8aaa16d4f9563c7890c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d99b8736aee8aaa16d4f9563c7890c");
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        this.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67ef6b0757e7104fbf24e595475aa231", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67ef6b0757e7104fbf24e595475aa231");
                    return;
                }
                d dVar = MPRestaurantHeaderVideoComponent.this.b;
                Poi poi = MPRestaurantHeaderVideoComponent.this.e;
                Object[] objArr3 = {poi};
                ChangeQuickRedirect changeQuickRedirect3 = d.c;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "54ce16b9ac06cf7437d477a741bbc2ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "54ce16b9ac06cf7437d477a741bbc2ab");
                } else if (poi == null || poi.mPoiMediaInfo == null || poi.mPoiMediaInfo.type != 1) {
                } else {
                    if (dVar.d != null) {
                        dVar.d.g();
                    }
                    dVar.a(poi.mPoiMediaInfo);
                    final e eVar = dVar.e;
                    Object[] objArr4 = {poi};
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "3962fb606b8c9f29375020b9c88231eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "3962fb606b8c9f29375020b9c88231eb");
                    } else if (poi.mPoiMediaInfo != null) {
                        String str = poi.mPoiMediaInfo.videoCover;
                        final String picture = poi.getPicture();
                        int i = eVar.f;
                        int i2 = eVar.g;
                        Object[] objArr5 = {str, picture, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect5 = e.a;
                        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "fdda29e160903829e74958a378af0569", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "fdda29e160903829e74958a378af0569");
                        } else if (eVar.b != null && eVar.h != null) {
                            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                            c.b = eVar.h;
                            c.c = str;
                            b.C0608b a2 = c.a(i, i2);
                            a2.f = ImageQualityUtil.c();
                            a2.a(new b.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.e.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a(Bitmap bitmap) {
                                    Object[] objArr6 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "73b83df8112d6bc8665876c16b053934", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "73b83df8112d6bc8665876c16b053934");
                                    } else {
                                        eVar.b.setImageBitmap(bitmap);
                                    }
                                }

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a45ef5008d0b1072b124ebf30d850135", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a45ef5008d0b1072b124ebf30d850135");
                                    } else {
                                        e.a(eVar, picture, eVar.b);
                                    }
                                }
                            });
                        }
                        eVar.c();
                        eVar.a(true);
                    }
                    dVar.e.b();
                }
            }
        }, 100L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r14.equals("poiUrl") != false) goto L18;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c322a3b3a976420c7a78f22da68c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c322a3b3a976420c7a78f22da68c98");
        } else {
            super.onAttachToParent();
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598a4e7039a21bfa5985e388b7b1924c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598a4e7039a21bfa5985e388b7b1924c");
        } else {
            super.onDetachFromParent();
        }
    }

    @JSMethod(methodName = "play")
    @Keep
    public void play() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6b077f19cb2b6dcf7c4750e860cb68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6b077f19cb2b6dcf7c4750e860cb68");
        } else if (this.b == null || this.b.e == null || this.b.e.a()) {
        } else {
            this.b.e.b();
        }
    }

    @JSMethod(methodName = "pause")
    @Keep
    public void pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d72b87b799a3fcee23d49a969339e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d72b87b799a3fcee23d49a969339e2");
        } else if (this.b == null || this.b.e == null || !this.b.e.a()) {
        } else {
            this.b.e.b();
        }
    }

    @JSMethod(methodName = "enterFullScreen")
    @Keep
    public void enterFullScreen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b651d86abbf408e3b4fc3a8fe2c01c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b651d86abbf408e3b4fc3a8fe2c01c9");
        } else if (this.b == null || this.b.e == null) {
        } else {
            this.b.e.b(1);
        }
    }

    @JSMethod(methodName = "seekTo")
    @Keep
    public void seekTo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18bb5b83b047dbe9e6ed625a9d8d85b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18bb5b83b047dbe9e6ed625a9d8d85b2");
        } else if (this.b == null || this.b.e == null) {
        } else {
            this.b.e.b(1);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.a, com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fd356b782152e1d178b34cb746966e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fd356b782152e1d178b34cb746966e");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    private WMRestaurantActivity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb82407dc6159ecf0d19db44d7f376d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMRestaurantActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb82407dc6159ecf0d19db44d7f376d5");
        }
        Context context = this.mMachContext.getContext();
        if (context instanceof WMRestaurantActivity) {
            return (WMRestaurantActivity) context;
        }
        return null;
    }
}
