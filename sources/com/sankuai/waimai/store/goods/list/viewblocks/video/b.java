package com.sankuai.waimai.store.goods.list.viewblocks.video;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.viewblocks.video.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.viewblocks.a implements c.a {
    public static ChangeQuickRedirect a;
    public ViewGroup b;
    private final d g;
    private View h;
    private c i;
    private com.sankuai.waimai.store.expose.v2.entity.b j;

    public b(@NonNull Context context, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a aVar, @NonNull d dVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6511f523489b7679d6648c910b0ea9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6511f523489b7679d6648c910b0ea9f");
        } else {
            this.g = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.a
    public final com.sankuai.waimai.store.viewblocks.b a(Context context, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a490e45c356da63737a0b7401f911dfa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.viewblocks.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a490e45c356da63737a0b7401f911dfa");
        }
        this.i = new c(context, aVar, this);
        this.i.a(true);
        return this.i;
    }

    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff677d6e7d20360e60f01369def3f63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff677d6e7d20360e60f01369def3f63");
            return;
        }
        this.h = createView(viewGroup);
        this.j = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_e8otz0ez_mv", this.h);
        if (this.h.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.h.getContext(), this.j);
        }
        b(viewGroup);
        hide();
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22dec765256a8522667f58b8ec1560dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22dec765256a8522667f58b8ec1560dc");
        } else if (restMenuResponse == null || restMenuResponse.getPoi() == null || restMenuResponse.getPoi().brandStory == null) {
        } else {
            e eVar = new e();
            eVar.c = restMenuResponse.getPoi().brandStory.url;
            a(eVar);
            c cVar = this.i;
            Poi poi = restMenuResponse.getPoi();
            Object[] objArr2 = {poi};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "feef835a6f2bf963c269185a2d5dd2b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "feef835a6f2bf963c269185a2d5dd2b6");
            } else if (cVar.b != null) {
                com.sankuai.waimai.store.viewblocks.d dVar = cVar.b;
                Object[] objArr3 = {poi};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.viewblocks.d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3e97329c0ade205080b26bb7f3101b50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3e97329c0ade205080b26bb7f3101b50");
                } else if (dVar.d != null && poi != null) {
                    if (poi.brandStory != null && !TextUtils.isEmpty(poi.brandStory.videoFirstFrameUrl)) {
                        m.b(poi.brandStory.videoFirstFrameUrl).a(dVar.d);
                    } else if (poi.isFloatWindowVideoStrategy()) {
                        dVar.a(poi);
                    } else {
                        Object[] objArr4 = {poi};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.viewblocks.d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "761f547d92195d0461ba84e26315dec1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "761f547d92195d0461ba84e26315dec1");
                        } else {
                            String promotionHeadPicUrl = poi.getPromotionHeadPicUrl();
                            if (TextUtils.isEmpty(promotionHeadPicUrl)) {
                                promotionHeadPicUrl = poi.getHeadPicUrl();
                            }
                            if (!TextUtils.isEmpty(promotionHeadPicUrl)) {
                                m.b(promotionHeadPicUrl, ImageQualityUtil.b()).a(dVar.d);
                            } else {
                                dVar.a(poi);
                            }
                        }
                    }
                }
            }
            Poi.BrandStory brandStory = restMenuResponse.getPoi().brandStory;
            Object[] objArr5 = {brandStory};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f3fc4d0c98ec8c5ff4df1046309848a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f3fc4d0c98ec8c5ff4df1046309848a4");
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = this.j;
                bVar.e = "b_waimai_sg_e8otz0ez_mv";
                bVar.a("poi_id", this.g.d().d()).a("stid", this.g.d().b.abExpInfo).a("media_type", Integer.valueOf(brandStory.type)).a("video_status", Integer.valueOf(a(this.g.d().b) ? 1 : 2));
            }
            com.sankuai.waimai.store.viewblocks.b bVar2 = this.d;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.viewblocks.b.c;
            if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "d80ff4fb37e9ff9b1f7e08e2a0550308", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "d80ff4fb37e9ff9b1f7e08e2a0550308");
            } else if (bVar2.g != null) {
                bVar2.g.b();
            }
        }
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68a0656e4c378df7e42fb5e88149f8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68a0656e4c378df7e42fb5e88149f8b");
        }
        a(this.h);
        return this.h;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e45b4a1c4daab57efe67230fa4ff62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e45b4a1c4daab57efe67230fa4ff62");
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf31b738ebd7c7d53bd8c1e3bba5e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf31b738ebd7c7d53bd8c1e3bba5e00");
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void b(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2684b90b9de3ad94eb98be36f01e3ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2684b90b9de3ad94eb98be36f01e3ff");
        } else {
            this.i.b(i);
        }
    }

    private void b(@NonNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4b604bc9c40f51d26ddcc0ffe9ebf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4b604bc9c40f51d26ddcc0ffe9ebf2");
            return;
        }
        this.b = (ViewGroup) this.mInflater.inflate(R.layout.wm_sc_poi_float_video_layout, viewGroup, false);
        this.b.findViewById(R.id.img_player_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.video.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f49aee857c951dd67444cd4b4a075b3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f49aee857c951dd67444cd4b4a075b3");
                } else {
                    b.this.b.setVisibility(8);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.video.c.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffab9d16bce5c5a1c2ca0e9316028f87", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffab9d16bce5c5a1c2ca0e9316028f87")).booleanValue();
        }
        if (i()) {
            return false;
        }
        f();
        h();
        return true;
    }

    private int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c668d2e7f7ffdecfe67be5a86e249c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c668d2e7f7ffdecfe67be5a86e249c")).intValue();
        }
        Poi poi = this.g.d().b;
        if (poi.brandStory != null) {
            return poi.brandStory.type;
        }
        return 1;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30477774121fa22e5f3e3f2f4be66280", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30477774121fa22e5f3e3f2f4be66280")).booleanValue();
        }
        if (i()) {
            g();
            if (this.d.f()) {
                this.d.e();
                return true;
            }
            return true;
        }
        return false;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58730bcf4653ac787b64efaa1bd88e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58730bcf4653ac787b64efaa1bd88e84");
        } else {
            this.d.a();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85c5c578707154a9f25574393359580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85c5c578707154a9f25574393359580");
            return;
        }
        this.d.g();
        if (z) {
            this.h.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.video.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca4094c4b8a9e419bfb0733f10241827", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca4094c4b8a9e419bfb0733f10241827");
                    } else {
                        b.this.d.e();
                    }
                }
            });
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "481949f9d7122046cf17fe4528478f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "481949f9d7122046cf17fe4528478f4b");
        } else {
            this.d.e();
        }
    }

    public final boolean a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0af654cf38f347c2d47afd28dadad7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0af654cf38f347c2d47afd28dadad7")).booleanValue();
        }
        LiveInfo liveInfo = poi.getLiveInfo();
        return (liveInfo == null || !liveInfo.isLive()) && b(poi) && this.d.c() && b(poi.brandId);
    }

    private static boolean b(Poi poi) {
        if (poi.brandStory != null) {
            return poi.brandStory.play;
        }
        return false;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae01eaa039ce5cbeea766d7a48542ecc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae01eaa039ce5cbeea766d7a48542ecc")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long b = ab.b().b(this.mContext, "merchant_video_plays_automatically_" + str, 0L);
        return b <= 0 || System.currentTimeMillis() - b >= 86400000;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8d8cbbdf2992e7ef1a5eab733e5aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8d8cbbdf2992e7ef1a5eab733e5aa1");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ab.b().a(this.mContext, "merchant_video_plays_automatically_" + str, System.currentTimeMillis());
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e1705ced710bbe84d5b1059e1ca169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e1705ced710bbe84d5b1059e1ca169");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.g.b(), "b_waimai_sg_e8otz0ez_mc").a("poi_id", this.g.d().d()).a("stid", this.g.d().b.abExpInfo).a("media_type", Integer.valueOf(j())).a("video_status", Integer.valueOf(a(this.g.d().b) ? 1 : 2)).a();
        }
    }
}
