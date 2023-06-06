package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b, a {
    public static ChangeQuickRedirect a;
    public d b;
    public b.a c;
    public LiveInfo d;
    private View e;
    private ImageView f;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final View a(ViewGroup viewGroup, com.sankuai.waimai.platform.domain.core.goods.e eVar, int i) {
        Object[] objArr = {viewGroup, eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "996208c111e23d81dfeb987f344e9913", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "996208c111e23d81dfeb987f344e9913");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_view_product_detail_video, viewGroup, false);
        this.e = inflate.findViewById(R.id.v_drug_super_tag);
        this.f = (ImageView) inflate.findViewById(R.id.iv_drug_super_tag_content);
        MTVideoPlayerView mTVideoPlayerView = (MTVideoPlayerView) inflate.findViewById(R.id.video_product);
        mTVideoPlayerView.setDisplayMode(0);
        if (eVar != null) {
            b bVar = new b();
            bVar.b = true;
            this.b = new d(viewGroup.getContext(), eVar, bVar, this);
            this.b.createView(mTVideoPlayerView);
            mTVideoPlayerView.setCoverView(this.b);
        }
        return inflate;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final void a(View view, com.sankuai.waimai.platform.domain.core.goods.e eVar, int i, @NonNull b.a aVar, GoodDetailResponse.PoiExtendAttr poiExtendAttr, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.c cVar) {
        boolean z;
        int i2;
        byte b;
        Object[] objArr = {view, eVar, Integer.valueOf(i), aVar, poiExtendAttr, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0b541b4fbce199748d41b8b166ef3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0b541b4fbce199748d41b8b166ef3a");
        } else if (eVar == null) {
        } else {
            this.c = aVar;
            MTVideoPlayerView mTVideoPlayerView = (MTVideoPlayerView) view.findViewById(R.id.video_product);
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(eVar.c);
            videoPlayerParam.a("default", new d.a(com.meituan.android.singleton.b.a).a(1).a());
            mTVideoPlayerView.setDataSource(videoPlayerParam);
            if (this.b != null) {
                this.b.d = this.d;
                z = this.b.a();
            } else {
                z = false;
            }
            aVar.a(mTVideoPlayerView, eVar, i, z);
            if (poiExtendAttr != null) {
                String str = poiExtendAttr.superDrugStorePicFrameImg;
                if (poiExtendAttr.isSuperDrugStore() && i == 0 && !TextUtils.isEmpty(str)) {
                    i2 = 2;
                    b = 1;
                } else {
                    i2 = 2;
                    b = 0;
                }
                Object[] objArr2 = new Object[i2];
                objArr2[0] = Byte.valueOf(b);
                objArr2[1] = str;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9fb9fca85f7a3ea7881bc2b82f10375", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9fb9fca85f7a3ea7881bc2b82f10375");
                } else if (this.e == null || this.f == null) {
                } else {
                    this.e.setVisibility(b == 0 ? 4 : 0);
                    m.a(str, ImageQualityUtil.a()).a(this.f);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa1b459040c260811436c2ef9dc3b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa1b459040c260811436c2ef9dc3b33");
        } else if (this.b == null) {
        } else {
            if (this.c != null && z) {
                this.c.a(true ^ this.b.b);
            }
            if (z) {
                this.b.a();
            } else {
                this.b.b();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd9d5cc90455623f3fee8ee99d4d772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd9d5cc90455623f3fee8ee99d4d772");
        } else if (this.c != null) {
            this.c.a(!z ? 1 : 0);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a6f437d75cbd63dd91a3276b5e9eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a6f437d75cbd63dd91a3276b5e9eb8");
        } else if (this.c != null) {
            this.c.a(z, z2);
        }
    }
}
