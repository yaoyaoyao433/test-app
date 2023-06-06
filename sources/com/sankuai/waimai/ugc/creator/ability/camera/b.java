package com.sankuai.waimai.ugc.creator.ability.camera;

import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.media.WmMediaActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.ugc.creator.component.e;
import com.sankuai.waimai.ugc.creator.component.h;
import com.sankuai.waimai.ugc.creator.component.i;
import com.sankuai.waimai.ugc.creator.entity.inner.MediaData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.handler.f;
import com.sankuai.waimai.ugc.creator.manager.c;
import com.sankuai.waimai.ugc.creator.manager.g;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.ugc.creator.base.a implements c {
    public static ChangeQuickRedirect a;
    private h b;
    private i c;
    private e d;
    private FrameLayout z;

    public b(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2de754407c0bfb08a4a07f4609e597", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2de754407c0bfb08a4a07f4609e597");
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ed5ab298130f932817015387401a6d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ed5ab298130f932817015387401a6d") : layoutInflater.inflate(R.layout.wm_ugc_media_ability_camera_video_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.g;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ac44f961367b775dc9fbf92b5ca43b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ac44f961367b775dc9fbf92b5ca43b") : B().getString(R.string.wm_ugc_media_permission_request_rationale_for_video_record, new Object[]{str});
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b136215f421e64209d94d807546ac765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b136215f421e64209d94d807546ac765");
            return;
        }
        g.a().a(A(), this.l);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c76848e19bfe6b47d534c6ff2da0702e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c76848e19bfe6b47d534c6ff2da0702e");
            return;
        }
        n.a("initChildBlocks");
        this.b = new h();
        a(R.id.camera_actionbar_container, (int) this.b);
        this.z = (FrameLayout) b(R.id.camera_viewfinder_container);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba255a00de3e37e110ae85b639a95f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba255a00de3e37e110ae85b639a95f4c");
        } else if (this.o.b == 2 && this.o.c == 2) {
            ah.a(this.z, Integer.MIN_VALUE, com.sankuai.waimai.foundation.utils.g.a(A(), 44.0f), Integer.MIN_VALUE, com.sankuai.waimai.foundation.utils.g.a(A(), 45.5f));
        }
        this.c = new i();
        a((ViewGroup) this.z, (FrameLayout) this.c);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c6360612e4e72eb5c75c040276381d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c6360612e4e72eb5c75c040276381d");
            return;
        }
        this.d = new e();
        a(R.id.camera_video_control_container, (int) this.d);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void bL_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15aa0423fc02ca310d69a4db5838f9da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15aa0423fc02ca310d69a4db5838f9da");
        } else {
            a(-1, "权限校验失败");
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2d60fd7d59b859c39fd090a089269b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2d60fd7d59b859c39fd090a089269b");
            return;
        }
        h hVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "454a3fa32893e47aee6e3705581759be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "454a3fa32893e47aee6e3705581759be");
        } else {
            if (hVar.b != null) {
                hVar.b.setVisibility(8);
            }
            if (hVar.c != null) {
                hVar.c.setVisibility(8);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "964664242ec19b45372fd395b9a8fd0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "964664242ec19b45372fd395b9a8fd0e");
        } else {
            ((WmMediaActivity) B()).a(4);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e52f9f3470c3b1cd2eb89c2a95d8c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e52f9f3470c3b1cd2eb89c2a95d8c3");
            return;
        }
        this.b.d();
        F();
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff7da58183937a7a16561fd2acca7ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff7da58183937a7a16561fd2acca7ea");
            return;
        }
        this.b.d();
        F();
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0314e27f29416d7451af39f1817948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0314e27f29416d7451af39f1817948");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76959966cfe2e6e7fea8bd1ef232f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76959966cfe2e6e7fea8bd1ef232f5e");
        } else {
            v();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void a(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2972f99e01079d79655dfc6915dc295a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2972f99e01079d79655dfc6915dc295a");
        } else {
            b(f.class).a(new com.sankuai.waimai.ugc.creator.framework.event.c<f>() { // from class: com.sankuai.waimai.ugc.creator.ability.camera.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.framework.event.c
                public final /* synthetic */ void a(f fVar) {
                    f fVar2 = fVar;
                    Object[] objArr2 = {fVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9efb067c3edbe0d7390c827f10d6d4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9efb067c3edbe0d7390c827f10d6d4a");
                    } else {
                        fVar2.a(j);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void a(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf06f1cfe13fdad9ba44965a758f8bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf06f1cfe13fdad9ba44965a758f8bd");
            return;
        }
        Object[] objArr2 = {videoData};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28224f0a605b54d056b97a184cb1d72f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28224f0a605b54d056b97a184cb1d72f");
        } else if (this.o.e) {
            d(videoData);
        } else if (this.o.f) {
            a(videoData, 0L, videoData.b);
        } else {
            a((MediaData) videoData);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.manager.c
    public final void a(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f4a86d8681128e09647b9a2d36d5f23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f4a86d8681128e09647b9a2d36d5f23");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b80a6a55d8042846908ccbdbca4651b7", RobustBitConfig.DEFAULT_VALUE)) {
            switch (i) {
                case -5:
                    i2 = R.string.wm_ugc_video_record_licence_verification_failed;
                    break;
                case -4:
                    i2 = R.string.wm_ugc_video_record_err_not_init;
                    break;
                case -3:
                    i2 = R.string.wm_ugc_video_record_err_os_low_than_18;
                    break;
                case -2:
                    i2 = R.string.wm_ugc_video_record_err_video_path_is_empty;
                    break;
                case -1:
                    i2 = R.string.wm_ugc_video_record_err_is_in_recording;
                    break;
                default:
                    i2 = R.string.wm_ugc_video_record_err_default;
                    break;
            }
        } else {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b80a6a55d8042846908ccbdbca4651b7")).intValue();
        }
        Object[] objArr3 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.base.b.n;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "332885d2f60b9674a786ae2c3633922b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "332885d2f60b9674a786ae2c3633922b");
        } else if (o.a(B())) {
            ae.a(B(), i2);
        }
    }

    private void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5795cece566d3051ff080ede74f5932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5795cece566d3051ff080ede74f5932");
        } else {
            ((WmMediaActivity) B()).a(0);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e838ee36a764c37eef80220283282825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e838ee36a764c37eef80220283282825");
        } else if (g.a().e) {
        } else {
            a(0, "用户中断流程");
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void bM_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e711d54fa2a7ef77e3788e8812d83bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e711d54fa2a7ef77e3788e8812d83bd3");
            return;
        }
        super.bM_();
        g.a().c = this;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f098b977bd3962dbae061c91758547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f098b977bd3962dbae061c91758547");
            return;
        }
        super.a();
        n.a("onResume");
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e22bf070f3e2a8913269a3514093505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e22bf070f3e2a8913269a3514093505");
            return;
        }
        super.o();
        n.a("onPause");
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5937c584cf15a1901d691c1333c58f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5937c584cf15a1901d691c1333c58f");
            return;
        }
        super.b();
        n.a("onDestroy");
        g.a().a(this.l);
    }
}
