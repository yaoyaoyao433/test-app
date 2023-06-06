package com.sankuai.waimai.store.poi.list.newp.block.optimization;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.h;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.d;
import com.sankuai.waimai.store.poi.list.newp.sg.ChannelMachAdViewBlock;
import com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock;
import com.sankuai.waimai.store.poi.list.newp.sg.PorcelainBlock;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.poi.list.newp.sg.c;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.view.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final com.sankuai.waimai.store.param.a b;
    protected final com.sankuai.waimai.store.poi.list.newp.presenter.a c;
    public final SCBaseActivity d;
    @NonNull
    public final List<com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>>> e;
    @NonNull
    public final a<T>.b f;
    @NonNull
    public SparseArray<String> g;
    public LinearLayout h;

    public abstract void d();

    public a(@NonNull com.sankuai.waimai.store.param.a aVar, SCBaseActivity sCBaseActivity) {
        Object[] objArr = {aVar, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fe5d52aa2835ecd2711b0cf5c52c8ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fe5d52aa2835ecd2711b0cf5c52c8ab");
            return;
        }
        this.e = new ArrayList();
        this.f = new b();
        this.g = new SparseArray<>();
        this.b = aVar;
        this.c = new com.sankuai.waimai.store.poi.list.newp.presenter.a();
        this.d = sCBaseActivity;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f86ca84cc1792f60e6fa323aa7aa86e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f86ca84cc1792f60e6fa323aa7aa86e");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.e)) {
            for (com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar : this.e) {
                if (aVar != null) {
                    aVar.onResume();
                }
            }
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0ab5c1df5e8d6be9058c23a0464e44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0ab5c1df5e8d6be9058c23a0464e44");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.e)) {
            for (com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar : this.e) {
                if (aVar != null) {
                    aVar.onPause();
                }
            }
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f8457b41d0e16e857cbd2437bf4d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f8457b41d0e16e857cbd2437bf4d7b");
        } else {
            this.c.a("", this.b.c, new k<Map<String, Object>>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.optimization.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Map map = (Map) obj;
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6052639901a5039c9704935c8d6ff1b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6052639901a5039c9704935c8d6ff1b5");
                    } else if (!com.sankuai.waimai.store.util.b.a(a.this.d)) {
                        a aVar = a.this;
                        Object[] objArr3 = {map};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e69fa2570cf9165b7ea15a3660b34455", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e69fa2570cf9165b7ea15a3660b34455");
                            return;
                        }
                        for (com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar2 : aVar.e) {
                            if (ConfigInfo.MODULE_NEW_USER_REGION_V2.equals(aVar2.c())) {
                                com.meituan.android.bus.a.a().c(new d(ConfigInfo.MODULE_NEW_USER_REGION_V2, map));
                            }
                        }
                    }
                }
            });
        }
    }

    @NonNull
    public final com.sankuai.waimai.store.poi.list.newp.sg.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cbdfeb749a781b25d287e956563e0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.poi.list.newp.sg.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cbdfeb749a781b25d287e956563e0c");
        }
        com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> a2 = this.f.a(i);
        a2.f = this.e.size();
        this.e.add(a2);
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends h<com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>>> {
        public static ChangeQuickRedirect b;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6adaab9bdcb998e6571cd49501d2170e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6adaab9bdcb998e6571cd49501d2170e");
            }
        }

        @Override // com.sankuai.waimai.store.base.h
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> b(int i) {
            com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> channelMachAdViewBlock;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac88b45f2b56c4c3fc6ffe35d4532dd0", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.poi.list.newp.sg.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac88b45f2b56c4c3fc6ffe35d4532dd0");
            }
            if (i == 8) {
                channelMachAdViewBlock = new ChannelMachAdViewBlock(a.this.d, a.this.h, a.this.b);
            } else if (i != 13) {
                switch (i) {
                    case 19:
                        channelMachAdViewBlock = new com.sankuai.waimai.store.poi.list.newp.sg.d(a.this.h, a.this.b);
                        break;
                    case 20:
                        channelMachAdViewBlock = new c(a.this.d, a.this.h, a.this.b);
                        break;
                    case 21:
                        channelMachAdViewBlock = new PorcelainBlock(a.this.d, a.this.h, a.this.b);
                        break;
                    case 22:
                        channelMachAdViewBlock = new com.sankuai.waimai.store.poi.list.newp.sg.b(a.this.d, a.this.h, a.this.b);
                        break;
                    default:
                        channelMachAdViewBlock = new com.sankuai.waimai.store.poi.list.newp.sg.a(a.this.h, a.this.b) { // from class: com.sankuai.waimai.store.poi.list.newp.block.optimization.a.b.1
                            @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
                            public final void a(@NonNull a.C1279a c1279a) {
                            }

                            @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
                            public final void a(@NonNull Object obj) {
                            }

                            @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
                            public final int b() {
                                return -1;
                            }
                        };
                        break;
                }
            } else {
                channelMachAdViewBlock = new C1275a(a.this.h, a.this.b);
            }
            channelMachAdViewBlock.e = i;
            return channelMachAdViewBlock;
        }

        @Override // com.sankuai.waimai.store.base.h
        @NonNull
        @NotNull
        public final /* synthetic */ com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> b(int i, String str, String str2) {
            com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> channelNormalMachViewBlock;
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6f458244b10e99dc7f615d7ec188a6", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.poi.list.newp.sg.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6f458244b10e99dc7f615d7ec188a6");
            }
            if (i == 9) {
                channelNormalMachViewBlock = new ChannelNormalMachViewBlock(a.this.d, a.this.h, a.this.b, str, str2);
            } else {
                channelNormalMachViewBlock = new com.sankuai.waimai.store.poi.list.newp.sg.a(a.this.h, a.this.b) { // from class: com.sankuai.waimai.store.poi.list.newp.block.optimization.a.b.2
                    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
                    public final void a(@NonNull a.C1279a c1279a) {
                    }

                    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
                    public final void a(@NonNull Object obj) {
                    }

                    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
                    public final int b() {
                        return -1;
                    }
                };
            }
            channelNormalMachViewBlock.e = i;
            return channelNormalMachViewBlock;
        }

        @Override // com.sankuai.waimai.store.base.h
        public final /* synthetic */ void b(int i, com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar) {
            com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> aVar2 = aVar;
            Object[] objArr = {Integer.valueOf(i), aVar2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61b0567b703aa698625b318efe70f16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61b0567b703aa698625b318efe70f16");
            } else if (aVar2 != null) {
                aVar2.onDestroy();
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.block.optimization.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1275a extends com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> implements com.sankuai.waimai.store.i.locate.b {
        public static ChangeQuickRedirect a;
        private FrameLayout i;
        private TextView j;
        private TextView k;
        private ImageView l;
        private ImageView m;

        @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
        public final int b() {
            return R.layout.wm_sc_channel_flower_location_view;
        }

        public static /* synthetic */ void a(C1275a c1275a) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, c1275a, changeQuickRedirect, false, "3c43aa24e61cdcf0f9c5c19c40c9e51e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, c1275a, changeQuickRedirect, false, "3c43aa24e61cdcf0f9c5c19c40c9e51e");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, c1275a, changeQuickRedirect2, false, "e2f3d8bc0ff3abd3f6df3850bb73528a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1275a, changeQuickRedirect2, false, "e2f3d8bc0ff3abd3f6df3850bb73528a");
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(c1275a.c.G, "b_waimai_a90lzwad_mc").a("cat_id", Long.valueOf(c1275a.c.c)).a("media_type", "3").a();
            }
            com.sankuai.waimai.store.router.d.a(c1275a.getContext(), com.sankuai.waimai.store.router.c.j);
        }

        @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
        public final /* synthetic */ void a(@NonNull com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
            PoiVerticalityDataResponse.ButtonArea buttonArea;
            com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e373c46ce447d7d936adcc80793886", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e373c46ce447d7d936adcc80793886");
                return;
            }
            b(com.sankuai.waimai.store.locate.a.d(), false);
            PoiVerticalityDataResponse.Promotion backgroundPromotion = bVar2.a(this.f).getBackgroundPromotion();
            if (backgroundPromotion != null && (buttonArea = backgroundPromotion.buttonArea) != null && !t.a(buttonArea.endColor)) {
                int a2 = com.sankuai.shangou.stone.util.d.a(buttonArea.endColor, -1430688);
                this.k.setTextColor(a2);
                this.m.setImageDrawable(e.a(getContext().getResources().getDrawable(R.drawable.wm_sc_action_flower_channel_waist_location), a2));
                return;
            }
            if (com.sankuai.shangou.stone.util.a.c(bVar2.a(this.f).getBannerBlocks()) > 0) {
                Iterator<BaseTileNew<BaseModuleDesc, Object>> it = bVar2.a(this.f).getBannerBlocks().iterator();
                while (it.hasNext()) {
                    BaseTileNew<BaseModuleDesc, Object> next = it.next();
                    if (next != null && "sm_type_home_native_flower_location".equals(next.sType) && next.propsData != null) {
                        PoiChannelBackgroundConfig poiChannelBackgroundConfig = (PoiChannelBackgroundConfig) i.a(i.a(next.propsData), new TypeToken<PoiChannelBackgroundConfig>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a.2
                        }.getType());
                        if (!TextUtils.isEmpty(poiChannelBackgroundConfig.tipsColor)) {
                            int a3 = com.sankuai.shangou.stone.util.d.a(poiChannelBackgroundConfig.tipsColor, -1430688);
                            this.k.setTextColor(a3);
                            this.m.setImageDrawable(e.a(getContext().getResources().getDrawable(R.drawable.wm_sc_action_flower_channel_waist_location), a3));
                            return;
                        }
                    }
                }
            }
            this.k.setTextColor(-1430688);
            this.m.setImageDrawable(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_sc_action_flower_channel_waist_location));
        }

        public C1275a(@NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
            super(viewGroup, aVar);
            Object[] objArr = {viewGroup, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31dfb3f9a25206f93f1438878323f686", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31dfb3f9a25206f93f1438878323f686");
            }
        }

        @Override // com.sankuai.waimai.store.base.b
        public final void onViewCreated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19fab2bafcb3fbd0e8b4420827519f20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19fab2bafcb3fbd0e8b4420827519f20");
                return;
            }
            super.onViewCreated();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70accb709206d14ca308dfbfb86b8ddf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70accb709206d14ca308dfbfb86b8ddf");
            } else {
                this.i = (FrameLayout) this.mView.findViewById(R.id.flower_location_background);
                this.j = (TextView) this.mView.findViewById(R.id.tv_delivery_address);
                this.k = (TextView) this.mView.findViewById(R.id.tv_delivery_tips);
                this.l = (ImageView) this.mView.findViewById(R.id.iv_right_arrow);
                this.i.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f), 0.0f, 0.0f, com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FF93A1), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFD3E1), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFFFFE)}).a());
                this.l.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.l.getContext(), (int) R.dimen.wm_sc_common_dimen_5, (int) R.dimen.wm_sc_common_dimen_9, (int) R.color.wm_sg_color_858687, a.EnumC1338a.RIGHT));
                this.m = (ImageView) this.mView.findViewById(R.id.iv_location);
                this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "106a2277b0673a463762e91a9b7ef8f7", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "106a2277b0673a463762e91a9b7ef8f7");
                        } else {
                            C1275a.a(C1275a.this);
                        }
                    }
                });
            }
            com.sankuai.waimai.store.locate.a.a(this);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00adb71e634e953d39603064461912ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00adb71e634e953d39603064461912ce");
            } else if (getContext() instanceof SCBaseActivity) {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(this.c.G, "b_waimai_a90lzwad_mv", getView());
                bVar.a("cat_id", Long.valueOf(this.c.c));
                bVar.a("media_type", "3");
                com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) getContext(), bVar);
                com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) getContext(), bVar);
            }
        }

        @Override // com.sankuai.waimai.store.i.locate.b
        public final void a(WMLocation wMLocation, String str, boolean z) {
            Object[] objArr = {wMLocation, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c426ae76f8286000287f0449191cb0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c426ae76f8286000287f0449191cb0f");
            } else {
                b(str, true);
            }
        }

        @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
        public final void a(@NonNull a.C1279a c1279a) {
            Object[] objArr = {c1279a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bcac7ee3d4a5921ffbb53dd60aa44d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bcac7ee3d4a5921ffbb53dd60aa44d8");
                return;
            }
            int a2 = c1279a.a(this.mContext);
            int b = c1279a.b(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mView.getLayoutParams();
            if (a2 > 0) {
                marginLayoutParams.topMargin = a2;
            }
            if (b > 0) {
                marginLayoutParams.bottomMargin = b;
            }
            this.mView.setLayoutParams(marginLayoutParams);
        }

        private void b(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d79536463c4b706c5aa2faad73cb3f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d79536463c4b706c5aa2faad73cb3f9");
                return;
            }
            if (TextUtils.isEmpty(str) && !z) {
                str = this.c.aT;
            }
            if (TextUtils.isEmpty(str)) {
                str = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_address_default);
            }
            this.j.setText(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_flower_tips_to, str));
        }

        @Override // com.sankuai.waimai.store.base.b
        public final void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76039f869acfc3c78bfa3a7120fa3324", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76039f869acfc3c78bfa3a7120fa3324");
                return;
            }
            com.sankuai.waimai.store.locate.a.b(this);
            super.onDestroy();
        }
    }
}
