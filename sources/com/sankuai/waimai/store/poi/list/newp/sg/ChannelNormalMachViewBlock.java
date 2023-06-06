package com.sankuai.waimai.store.poi.list.newp.sg;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.g;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventGuessYouLikeBuyButtonClicked;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.poi.list.newp.methods.i;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ChannelNormalMachViewBlock extends a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> implements com.sankuai.waimai.store.im.entrance.drug.unread.I.a, c.a {
    public static ChangeQuickRedirect a = null;
    public static boolean i = false;
    private com.sankuai.waimai.store.mach.d j;
    private ViewGroup k;
    private SCBaseActivity l;
    private com.sankuai.waimai.store.im.entrance.mach.b m;
    private com.sankuai.waimai.mach.d n;
    private boolean o;
    private String p;
    private com.sankuai.waimai.store.mach.medhod.a q;
    private int[] r;
    private String s;
    private PoiVerticalityDataResponse.Promotion t;
    private View u;
    private FrameLayout v;
    private final boolean w;
    private final boolean x;
    private boolean y;

    public static /* synthetic */ boolean a(ChannelNormalMachViewBlock channelNormalMachViewBlock, boolean z) {
        channelNormalMachViewBlock.y = true;
        return true;
    }

    public static /* synthetic */ boolean b(ChannelNormalMachViewBlock channelNormalMachViewBlock, boolean z) {
        channelNormalMachViewBlock.o = true;
        return true;
    }

    public static /* synthetic */ void f(ChannelNormalMachViewBlock channelNormalMachViewBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, channelNormalMachViewBlock, changeQuickRedirect, false, "e26872d2ead956aa3ebdb516ace5ee6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, channelNormalMachViewBlock, changeQuickRedirect, false, "e26872d2ead956aa3ebdb516ace5ee6c");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(channelNormalMachViewBlock.k);
        aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3058cee13138d2368d5a91e0b917902d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3058cee13138d2368d5a91e0b917902d");
                    return;
                }
                ChannelNormalMachViewBlock.this.j.g();
                ChannelNormalMachViewBlock.b(ChannelNormalMachViewBlock.this, true);
            }
        });
        com.sankuai.waimai.store.expose.v2.b.a().a(channelNormalMachViewBlock.l, aVar);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
        PoiVerticalityDataResponse.ButtonArea buttonArea;
        com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a507a776ba960dd62c19aa0f0b1257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a507a776ba960dd62c19aa0f0b1257");
            return;
        }
        this.o = false;
        BaseModuleDesc a2 = a(this, bVar2, this.f);
        b(this, bVar2, this.f);
        if (a2.templateId.equals("supermarket-home-scroll-kingkong-style")) {
            a(a2);
        }
        if (a2.templateId.equals("supermarket-convenient-home-kingkong")) {
            a(a2);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e67e73f17fbbb761f1ed5e93623bd2ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e67e73f17fbbb761f1ed5e93623bd2ba");
            } else {
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.a(this.l.w()));
            }
        }
        this.t = bVar2.a(this.f).getBackgroundPromotion();
        if (this.t != null && (buttonArea = this.t.buttonArea) != null && !t.a(buttonArea.endColor)) {
            this.s = buttonArea.endColor;
        }
        a(a2.moduleId, a2.templateId, a2.jsonData);
    }

    public ChannelNormalMachViewBlock(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar, String str, String str2) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0dbb506d1172a8d174d264ad7f34f05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0dbb506d1172a8d174d264ad7f34f05");
            return;
        }
        this.o = false;
        this.p = "";
        this.q = new com.sankuai.waimai.store.mach.medhod.a();
        this.l = sCBaseActivity;
        this.w = com.sankuai.waimai.store.base.abtest.a.h();
        this.x = com.sankuai.waimai.store.base.abtest.a.i();
        this.m = new com.sankuai.waimai.store.im.entrance.mach.a();
        this.m.a(sCBaseActivity, sCBaseActivity.b(), sCBaseActivity.w(), this);
        com.sankuai.waimai.store.mach.d dVar = e.a().b.get(str2);
        if (dVar != null) {
            this.j = dVar;
        } else {
            this.j = new com.sankuai.waimai.store.mach.d(sCBaseActivity, sCBaseActivity.w()) { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mach.d
                public final com.sankuai.waimai.mach.d aZ_() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fea04fd152bd0e4bd7352f1409136414", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fea04fd152bd0e4bd7352f1409136414") : ChannelNormalMachViewBlock.this.n;
                }
            };
            this.n = new com.sankuai.waimai.store.poi.list.logreport.c(this.c.G);
        }
        this.j.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17c0ef3238eaccd6a19c932c5b7c56be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17c0ef3238eaccd6a19c932c5b7c56be");
                } else {
                    ChannelNormalMachViewBlock.this.j.h();
                }
            }
        });
        this.j.g = this.q;
        this.q.a("guess_you_like_buy_button_clicked", new OnJsEventGuessYouLikeBuyButtonClicked());
        this.q.a("jump", new OnJsEventJump());
        this.q.a("click_drug_im_entrance", new com.sankuai.waimai.store.poi.list.newp.methods.e(this.m));
        this.q.a("query_drug_im_msg_number", new com.sankuai.waimai.store.poi.list.newp.methods.e(this.m));
        this.q.a("new_user_coupons_alert", new i(this.c));
        this.q.a("home_kingkong_update_bubble_data", new com.sankuai.waimai.store.poi.list.newp.methods.f(this.c));
        this.q.a("jump_to_search", new com.sankuai.waimai.store.poi.list.newp.methods.f(this.c));
        this.q.a("user_coupon_refrsh", new com.sankuai.waimai.store.poi.list.newp.methods.c());
        this.q.a("home_banner_change", new com.sankuai.waimai.store.poi.list.newp.methods.d(this.c));
        this.q.a("category_change", new com.sankuai.waimai.store.poi.list.newp.methods.a(this.c));
        com.meituan.android.bus.a.a().a(this);
        this.m.c();
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.unread.I.a
    public final void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d86564bacc308fd816427d0d599c4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d86564bacc308fd816427d0d599c4a5");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("number", Integer.valueOf(i2));
        this.j.b("show_drug_im_red_dot", hashMap);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return (this.w || this.x) ? R.layout.wm_sc_home_tile_new : R.layout.wm_sc_home_tile;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
        Object[] objArr = {c1279a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674133ef3d6c7295a1b76cab2931ce0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674133ef3d6c7295a1b76cab2931ce0b");
            return;
        }
        int a2 = c1279a.a(getContext());
        int b = c1279a.b(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        if (a2 >= 0) {
            marginLayoutParams.topMargin = a2;
        }
        if (b >= 0) {
            marginLayoutParams.bottomMargin = b;
        }
        this.k.setLayoutParams(marginLayoutParams);
        if (this.w && this.u != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
            if (a2 >= 0) {
                marginLayoutParams2.topMargin = a2;
            }
            if (b >= 0) {
                marginLayoutParams2.bottomMargin = b;
            }
            this.u.setLayoutParams(marginLayoutParams2);
        }
        if (!this.x || this.v == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        if (a2 >= 0) {
            marginLayoutParams3.topMargin = a2;
        }
        if (b >= 0) {
            marginLayoutParams3.bottomMargin = b;
        }
        this.v.setLayoutParams(marginLayoutParams3);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f28c7f65f1bb062c5d94ecafaedaf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f28c7f65f1bb062c5d94ecafaedaf9");
            return;
        }
        super.onResume();
        if (d()) {
            this.j.b("pageAppear", (Map<String, Object>) null);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043412d45c3b281c746c78e84d781517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043412d45c3b281c746c78e84d781517");
            return;
        }
        super.onPause();
        if (d()) {
            this.j.b("pageDisappear", (Map<String, Object>) null);
        }
    }

    @Subscribe
    public void onChangeTopFloatBlockVisible(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d5ea72d225353c174adb667ee673e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d5ea72d225353c174adb667ee673e5b");
        } else if (aVar == null || !d()) {
        } else {
            HashMap hashMap = new HashMap();
            if (aVar.a) {
                hashMap.put("visible", 0);
            } else {
                hashMap.put("visible", 1);
            }
            this.j.b("sg_header_visible", hashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r19, java.lang.String r20, @android.support.annotation.Nullable final java.util.Map<java.lang.String, java.lang.Object> r21) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock.a(java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92675b1c7b59bf598775ecaf7a63d57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92675b1c7b59bf598775ecaf7a63d57c");
            return;
        }
        super.onViewCreated();
        this.k = (ViewGroup) findView(R.id.fl_tile_container);
        if (this.w) {
            this.u = findView(R.id.sg_def_img);
        }
        if (this.x) {
            this.v = (FrameLayout) findView(R.id.layout_mach_def);
        }
        this.j.a(this.k, "sm_home_%s", "supermarket");
        this.j.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd122f09986da843b26aefb13137878d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd122f09986da843b26aefb13137878d");
                    return;
                }
                if (ChannelNormalMachViewBlock.this.u != null) {
                    ChannelNormalMachViewBlock.this.u.setVisibility(8);
                }
                if (ChannelNormalMachViewBlock.this.v != null) {
                    ChannelNormalMachViewBlock.this.v.setVisibility(8);
                }
                ChannelNormalMachViewBlock.f(ChannelNormalMachViewBlock.this);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "367ad6a87cdbf571f49deb524dcf7667", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "367ad6a87cdbf571f49deb524dcf7667");
                    return;
                }
                ChannelNormalMachViewBlock.a(ChannelNormalMachViewBlock.this, true);
                ChannelNormalMachViewBlock.this.c.bv++;
                if (ChannelNormalMachViewBlock.this.c == null || !"supermarket-home-scroll-kingkong-style".equals(ChannelNormalMachViewBlock.this.p)) {
                    return;
                }
                ChannelNormalMachViewBlock.this.c.bB = 3;
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0501cda7cfc758958d51e505662eaf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0501cda7cfc758958d51e505662eaf0");
                } else if (ChannelNormalMachViewBlock.this.c == null || !"supermarket-home-scroll-kingkong-style".equals(ChannelNormalMachViewBlock.this.p)) {
                } else {
                    ChannelNormalMachViewBlock.this.c.bB = 4;
                }
            }
        });
        com.sankuai.shangou.stone.util.log.a.b("ChannelNormalMachViewBlock#onViewCreated", new Object[0]);
    }

    @Subscribe
    public void onCouponStatusChanged(com.sankuai.waimai.store.poilist.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4369f36faa621e537b27f313151d4b6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4369f36faa621e537b27f313151d4b6f");
        } else if (bVar == null || !bVar.a() || this.j == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("coupon_id", bVar.b);
            hashMap.put("coupon_status", bVar.c);
            this.j.b("couponStatusChanged", hashMap);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820186d7db4024da1d0b2b6a873549b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820186d7db4024da1d0b2b6a873549b0")).booleanValue();
        }
        if (this.h == null || !this.h.containsKey("isAssociatedPageStatus") || this.h.get("isAssociatedPageStatus") == null || !(this.h.get("isAssociatedPageStatus") instanceof Boolean)) {
            return false;
        }
        return ((Boolean) this.h.get("isAssociatedPageStatus")).booleanValue();
    }

    @Subscribe
    public void onPoiListNewChanged(com.sankuai.waimai.store.poi.list.newp.block.rxevent.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03eb5c7d987d898da12c9482338bace7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03eb5c7d987d898da12c9482338bace7");
        } else if (dVar == null || dVar.b == null) {
        } else {
            if (ConfigInfo.MODULE_NEW_USER_REGION.equals(c()) && (dVar.b.get(ConfigInfo.MODULE_NEW_USER_REGION) instanceof Map)) {
                a(ConfigInfo.MODULE_NEW_USER_REGION, this.p, (Map) dVar.b.get(ConfigInfo.MODULE_NEW_USER_REGION));
            }
            if (ConfigInfo.MODULE_NEW_USER_REGION_V2.equals(c()) && (dVar.b.get(ConfigInfo.MODULE_NEW_USER_REGION_V2) instanceof Map)) {
                a(ConfigInfo.MODULE_NEW_USER_REGION_V2, this.p, (Map) dVar.b.get(ConfigInfo.MODULE_NEW_USER_REGION_V2));
            }
        }
    }

    @Subscribe
    public void onSGTopKingkongClickEventReceive(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77b03b4ff0c2a0caaac1d5746560244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77b03b4ff0c2a0caaac1d5746560244");
        } else if (gVar == null || gVar.a == 0) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Long.valueOf(gVar.a));
            this.j.b("float_kingkong_click_code", hashMap);
        }
    }

    private void a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d663004f08bd0419e5a10aeb715cc44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d663004f08bd0419e5a10aeb715cc44a");
            return;
        }
        try {
            if (baseModuleDesc.jsonData.get("primary_filter_condlist") != null) {
                i = true;
                List list = (List) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(baseModuleDesc.jsonData.get("primary_filter_condlist")), new TypeToken<List<PrimaryFilterCondList>>() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock.6
                }.getType());
                if (list != null) {
                    this.r = new int[list.size()];
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.r[i2] = 0;
                        if (com.sankuai.waimai.store.poi.list.newp.bubble.a.a(list, i2)) {
                            this.r[i2] = 1;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9059339352a682139f14c39e1a9a7330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9059339352a682139f14c39e1a9a7330");
            return;
        }
        super.onDestroy();
        a(this.p, this.y);
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        if (this.m != null) {
            this.m.a();
        }
        com.sankuai.shangou.stone.util.log.a.a("ChannelNormalMachViewBlock", "action=%s", "ChannelNormalMachViewBlock#onDestroy");
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85d8b297d2ac967acbbeafb8888f52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85d8b297d2ac967acbbeafb8888f52b");
        } else if (poiCouponItem == null || this.j == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
            hashMap.put("coupon_status", Integer.valueOf(poiCouponItem.mCouponStatus));
            this.j.b("newUsercouponStatusChanged", hashMap);
        }
    }
}
