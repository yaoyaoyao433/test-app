package com.sankuai.waimai.store.drug.goods.list.viewblocks.video;

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
import com.sankuai.waimai.store.drug.goods.list.viewblocks.video.c;
import com.sankuai.waimai.store.drug.viewblocks.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.drug.viewblocks.a implements c.a {
    public static ChangeQuickRedirect a;
    public ViewGroup b;
    private final com.sankuai.waimai.store.drug.goods.list.delegate.c g;
    private View h;
    private c i;
    private com.sankuai.waimai.store.expose.v2.entity.b j;

    public b(@NonNull Context context, com.sankuai.waimai.store.drug.video.video.a aVar, @NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae8f91e4ae36e3b14463a97650732a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae8f91e4ae36e3b14463a97650732a8");
        } else {
            this.g = cVar;
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.a
    public final com.sankuai.waimai.store.drug.viewblocks.b a(Context context, com.sankuai.waimai.store.drug.video.video.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a051da1ba41575889b52141f661aad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.drug.viewblocks.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a051da1ba41575889b52141f661aad1");
        }
        this.i = new c(context, aVar, this);
        this.i.a(true);
        return this.i;
    }

    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d45cb053006f4f46497038c02689b7c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d45cb053006f4f46497038c02689b7c7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674493f7c5bb3bfa267e82cec03977bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674493f7c5bb3bfa267e82cec03977bb");
        } else if (restMenuResponse == null || restMenuResponse.getPoi() == null || restMenuResponse.getPoi().brandStory == null) {
        } else {
            e eVar = new e();
            eVar.c = restMenuResponse.getPoi().brandStory.url;
            a(eVar);
            c cVar = this.i;
            Poi poi = restMenuResponse.getPoi();
            Object[] objArr2 = {poi};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9eb7d276bbae007d21d4bab82cf5812d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9eb7d276bbae007d21d4bab82cf5812d");
            } else if (cVar.b != null) {
                d dVar = cVar.b;
                Object[] objArr3 = {poi};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "a107de35a9216d5ffe4d1438ff6375ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "a107de35a9216d5ffe4d1438ff6375ce");
                } else if (dVar.d != null && poi != null) {
                    if (poi.brandStory != null && !TextUtils.isEmpty(poi.brandStory.videoFirstFrameUrl)) {
                        m.b(poi.brandStory.videoFirstFrameUrl).a(dVar.d);
                    } else if (poi.isFloatWindowVideoStrategy()) {
                        dVar.a(poi);
                    } else {
                        Object[] objArr4 = {poi};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "cc23a685745b27f754677db7d2798140", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "cc23a685745b27f754677db7d2798140");
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
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2962279317fdf5f27e8c3cf3f1514a94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2962279317fdf5f27e8c3cf3f1514a94");
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = this.j;
                bVar.e = "b_waimai_sg_e8otz0ez_mv";
                bVar.a("poi_id", this.g.d().d()).a("stid", this.g.d().b.abExpInfo).a("media_type", Integer.valueOf(brandStory.type)).a("video_status", Integer.valueOf(a(this.g.d().b) ? 1 : 2));
            }
            com.sankuai.waimai.store.drug.viewblocks.b bVar2 = this.d;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.drug.viewblocks.b.c;
            if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "792b51b669e758cec22b1d78f778da05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "792b51b669e758cec22b1d78f778da05");
            } else if (bVar2.g != null) {
                bVar2.g.b();
            }
        }
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419b197c56e4924eceec0cd20da0b0f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419b197c56e4924eceec0cd20da0b0f8");
        }
        a(this.h);
        return this.h;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "016a6b387c7c5281898612d7fb349bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "016a6b387c7c5281898612d7fb349bce");
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9a99138900283b351c1a969cfc2be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9a99138900283b351c1a969cfc2be4");
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void b(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8397aef75f1196c56d05ac4eed54087c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8397aef75f1196c56d05ac4eed54087c");
        } else {
            this.i.b(i);
        }
    }

    private void b(@NonNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05005a852207218a1c676412b250e3f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05005a852207218a1c676412b250e3f4");
            return;
        }
        this.b = (ViewGroup) this.mInflater.inflate(R.layout.wm_drug_poi_float_video_layout, viewGroup, false);
        this.b.findViewById(R.id.img_player_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.video.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94e86fec8f511c43b5edcb64dda4fbc2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94e86fec8f511c43b5edcb64dda4fbc2");
                } else {
                    b.this.b.setVisibility(8);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.video.c.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae1df6067e03776f1a37e83cd3c377e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae1df6067e03776f1a37e83cd3c377e")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b693579dd702669e2156199bc58f709", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b693579dd702669e2156199bc58f709")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda6b57b70b917ea9d2512e4b0e8b843", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda6b57b70b917ea9d2512e4b0e8b843")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0aebce406e50ccc3328a48139b97bb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0aebce406e50ccc3328a48139b97bb4");
        } else {
            this.d.a();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ea0ba7e92b675a7abec773c8e11f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ea0ba7e92b675a7abec773c8e11f48");
            return;
        }
        this.d.g();
        if (z) {
            this.h.post(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.video.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07a22852c03627eb072492f852e3e0cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07a22852c03627eb072492f852e3e0cd");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41768d91935e5369ea852aec79a5116a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41768d91935e5369ea852aec79a5116a");
        } else {
            this.d.e();
        }
    }

    public final boolean a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce2b4f7fc14fb180336e260502e6a84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce2b4f7fc14fb180336e260502e6a84")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838da4b2c3845c1421356be7d488652e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838da4b2c3845c1421356be7d488652e")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d7a4d358cf19755c59095fd109f42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d7a4d358cf19755c59095fd109f42f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ab.b().a(this.mContext, "merchant_video_plays_automatically_" + str, System.currentTimeMillis());
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719937433038ca43f7e6f4b00ada671f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719937433038ca43f7e6f4b00ada671f");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.g.b(), "b_waimai_sg_e8otz0ez_mc").a("poi_id", this.g.d().d()).a("stid", this.g.d().b.abExpInfo).a("media_type", Integer.valueOf(j())).a("video_status", Integer.valueOf(a(this.g.d().b) ? 1 : 2)).a();
        }
    }
}
