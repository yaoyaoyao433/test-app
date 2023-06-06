package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.PoiMediaInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends c implements b {
    public static ChangeQuickRedirect c;
    public MTVideoPlayerView d;
    public e e;
    private FrameLayout f;

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad770d38f2944d1dc936c44e027e4d03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad770d38f2944d1dc936c44e027e4d03");
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a950b274f27f1a2cbb8e0b08b0a62bdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a950b274f27f1a2cbb8e0b08b0a62bdf");
            return;
        }
        this.f = (FrameLayout) view.findViewById(R.id.fl_player_container);
        this.d = (MTVideoPlayerView) view.findViewById(R.id.poi_header_video_player);
        this.e = new e(LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_header_media_video_controller, (ViewGroup) null, false), this.b, (Activity) this.b, this);
        this.d.setCoverView(this.e);
    }

    public void a(@NonNull PoiMediaInfo poiMediaInfo) {
        Object[] objArr = {poiMediaInfo};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5519d2e543d722ecec6b380a8be368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5519d2e543d722ecec6b380a8be368");
            return;
        }
        VideoPlayerParam videoPlayerParam = new VideoPlayerParam(poiMediaInfo.url);
        videoPlayerParam.a("poi-video", new d.a(this.b).a(1).a());
        this.d.setDisplayView(MTVideoPlayerView.a.TYPE_TEXTURE);
        this.d.setDataSource(videoPlayerParam);
        this.d.setDisplayMode(0);
        this.d.setCoverView(this.e);
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e2c0c894a849fb23fef507e39f606e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e2c0c894a849fb23fef507e39f606e");
        } else if (this.b == null || ((Activity) this.b).isFinishing()) {
        } else {
            if (this.d.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.d.getParent()).removeView(this.d);
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i == 0) {
                this.f.addView(this.d, layoutParams);
            } else if (i == 1) {
                ((ViewGroup) ((Activity) this.b).getWindow().getDecorView().findViewById(16908290)).addView(this.d, layoutParams);
                JudasManualManager.a a = JudasManualManager.a("b_waimai_nyfmyv4g_mc");
                a.b = AppUtil.generatePageInfoKey(this.b);
                a.a("c_CijEL").a();
            }
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c202e645e40599b4e2b07401d26955", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c202e645e40599b4e2b07401d26955");
            return;
        }
        super.a();
        if (this.e != null) {
            e eVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2bffef693d33adb61a7c0ee722459557", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2bffef693d33adb61a7c0ee722459557");
            } else {
                eVar.e();
            }
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e840cee3d14250abea044aa73008e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e840cee3d14250abea044aa73008e24");
            return;
        }
        super.b();
        if (this.e != null) {
            e eVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "832f49561b0ca5c5b62abb5a516c2c96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "832f49561b0ca5c5b62abb5a516c2c96");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "67108011721a29df6dbb15a2bbba1d01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "67108011721a29df6dbb15a2bbba1d01");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.c("PoiVideoBlock", "unRegisterReceiver()", new Object[0]);
                if (eVar.d) {
                    eVar.d = false;
                    if (eVar.h != null) {
                        eVar.h.unregisterReceiver(eVar.i);
                    }
                }
            }
            if (eVar.c == null || !eVar.c.e()) {
                return;
            }
            eVar.c.d();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d191a935b1c48405466e28727a77ef74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d191a935b1c48405466e28727a77ef74");
            return;
        }
        super.c();
        if (this.e != null) {
            e eVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "dc5cd1f1a4d890823ebbd84580e1f964", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "dc5cd1f1a4d890823ebbd84580e1f964");
            } else if (eVar.c == null || !eVar.c.e()) {
            } else {
                eVar.c.d();
            }
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.bg.c
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c332a3508c19558b3ea378f94233f829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c332a3508c19558b3ea378f94233f829");
            return;
        }
        super.d();
        if (this.e != null) {
            e eVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b9277d81ea039fe5b71f2f61f469edec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b9277d81ea039fe5b71f2f61f469edec");
                return;
            }
            eVar.d();
            if (eVar.c != null) {
                eVar.c.g();
            }
        }
    }
}
