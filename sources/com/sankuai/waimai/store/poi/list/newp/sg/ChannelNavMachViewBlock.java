package com.sankuai.waimai.store.poi.list.newp.sg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.im.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.TitleMenuItemEntity;
import com.sankuai.waimai.store.util.ar;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import com.sankuai.waimai.store.viewblocks.MenuItemView;
import com.sankuai.waimai.store.viewblocks.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ChannelNavMachViewBlock extends com.sankuai.waimai.store.poi.list.newp.sg.a<BaseModuleDesc> {
    public static ChangeQuickRedirect a;
    private c.a A;
    private a B;
    public ArrayList<String> i;
    public b j;
    public boolean k;
    public c l;
    private com.sankuai.waimai.store.mach.d m;
    private SCBaseActivity n;
    private com.sankuai.waimai.mach.d o;
    private boolean p;
    private String q;
    private h r;
    private List<TitleMenuItemEntity> s;
    private int t;
    private int u;
    private boolean v;
    private com.sankuai.waimai.store.mach.medhod.a w;
    private com.sankuai.waimai.store.im.c x;
    private int y;
    private com.sankuai.waimai.store.im.number.b z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void b();

        void c();

        void d();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return -1;
    }

    public static /* synthetic */ void a(ChannelNavMachViewBlock channelNavMachViewBlock, Context context, com.sankuai.waimai.store.param.a aVar, int i) {
        String str;
        Object[] objArr = {context, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, channelNavMachViewBlock, changeQuickRedirect, false, "36d67ff4c1693d447f30c856e8f43b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, channelNavMachViewBlock, changeQuickRedirect, false, "36d67ff4c1693d447f30c856e8f43b11");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(aVar.c));
        hashMap.put("entry_type", Integer.valueOf(aVar.aS ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        boolean z = aVar.aO;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7b831ea4ef1075a4111edcd5ce6b5762", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7b831ea4ef1075a4111edcd5ce6b5762");
        } else if (i != 11) {
            switch (i) {
                case 15:
                    if (!z) {
                        str = "b_waimai_ka2ljjp4_mc";
                        break;
                    } else {
                        str = "b_waimai_el74u5ia_mc";
                        break;
                    }
                case 16:
                    if (!z) {
                        str = "b_waimai_3g7qvms6_mc";
                        break;
                    } else {
                        str = "b_waimai_b84oei0u_mc";
                        break;
                    }
                default:
                    str = "";
                    break;
            }
        } else {
            str = z ? "b_waimai_1xehriwk_mc" : "b_waimai_h6lkdgkx_mc";
        }
        hashMap2.put("bid", str);
        hashMap2.put("cat_id", Long.valueOf(aVar.c));
        com.sankuai.waimai.store.manager.judas.b.a(aVar.G, hashMap2);
        com.sankuai.waimai.store.manager.judas.b.a(context, str).b(hashMap).a();
    }

    public static /* synthetic */ boolean a(ChannelNavMachViewBlock channelNavMachViewBlock, boolean z) {
        channelNavMachViewBlock.p = true;
        return true;
    }

    public static /* synthetic */ int d(ChannelNavMachViewBlock channelNavMachViewBlock) {
        int i = channelNavMachViewBlock.y;
        channelNavMachViewBlock.y = i + 1;
        return i;
    }

    public static /* synthetic */ void f(ChannelNavMachViewBlock channelNavMachViewBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, channelNavMachViewBlock, changeQuickRedirect, false, "2191ad09dc72a2020391065215596a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, channelNavMachViewBlock, changeQuickRedirect, false, "2191ad09dc72a2020391065215596a59");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(channelNavMachViewBlock.d);
        aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7a2111dc50d06da35535e52c2fcd040", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7a2111dc50d06da35535e52c2fcd040");
                    return;
                }
                ChannelNavMachViewBlock.this.m.g();
                ChannelNavMachViewBlock.a(ChannelNavMachViewBlock.this, true);
            }
        });
        com.sankuai.waimai.store.expose.v2.b.a().a(channelNavMachViewBlock.n, aVar);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull BaseModuleDesc baseModuleDesc) {
        Map hashMap;
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8499a73449fb8c53ddd75c83626a4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8499a73449fb8c53ddd75c83626a4c6");
            return;
        }
        this.p = false;
        this.s = baseModuleDesc2.functionEntranceList;
        if (this.r != null && com.sankuai.shangou.stone.util.a.c(this.s) > 0) {
            this.r.a(this.s);
        }
        if (baseModuleDesc2.jsonData != null) {
            baseModuleDesc2.jsonData.put("msgNum", Integer.valueOf(this.t));
        }
        Object obj = baseModuleDesc2.moduleId;
        final String str = baseModuleDesc2.templateId;
        final Map<String, Object> map = baseModuleDesc2.jsonData;
        Object[] objArr2 = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04e93189557d16599f5ef183fd34afba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04e93189557d16599f5ef183fd34afba");
        } else if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            hide();
        } else {
            this.q = str;
            this.m.a(String.format("sm_home_%s", obj));
            show();
            a.C1015a c1015a = new a.C1015a();
            c1015a.c = str;
            c1015a.b = str;
            c1015a.d = String.format("sm_home_%s", obj);
            c1015a.e = "supermarket";
            com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e58fa1eccffc472e88b743073b4702a3", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e58fa1eccffc472e88b743073b4702a3");
            } else {
                hashMap = new HashMap();
                hashMap.put("cat_id", Long.valueOf(this.c.c));
                hashMap.put("sec_cat_id", this.c.f);
                hashMap.put("stid", this.c.T);
                hashMap.put("media_type", "1");
                hashMap.put("showRedTip", Boolean.valueOf(this.v));
                hashMap.put("totalUnread", Integer.valueOf(this.u));
                hashMap.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
                hashMap.put("scheme_params", this.c.aA);
            }
            map.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
            this.m.a(a2, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr4 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4be1c02447d219ac652fe4a71e2f0b2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4be1c02447d219ac652fe4a71e2f0b2b");
                        return;
                    }
                    ChannelNavMachViewBlock.this.m.a(eVar, map);
                    if (ChannelNavMachViewBlock.this.l != null) {
                        ChannelNavMachViewBlock.this.l.a();
                    }
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "331727f2958c5d8c3942e957c8bdd74c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "331727f2958c5d8c3942e957c8bdd74c");
                        return;
                    }
                    ChannelNavMachViewBlock.this.hide();
                    if (ChannelNavMachViewBlock.this.l != null) {
                        ChannelNavMachViewBlock.this.l.b();
                    }
                    SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(ChannelNavMachViewBlock.class.getSimpleName());
                    sGCommonMachReportInfo.e = str;
                    sGCommonMachReportInfo.d = 4;
                    sGCommonMachReportInfo.i = bVar.a();
                    com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                    Log.e("ChannelNavMachViewBlock", "asyncLoadBundle onFailure");
                }
            });
        }
        getContext().getApplicationContext();
    }

    public ChannelNavMachViewBlock(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920d7eed39d27f7b96310ba6757751e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920d7eed39d27f7b96310ba6757751e6");
            return;
        }
        this.p = false;
        this.q = "";
        this.w = new com.sankuai.waimai.store.mach.medhod.a();
        this.x = new com.sankuai.waimai.store.im.c();
        this.y = 0;
        this.i = new ArrayList<>();
        this.k = true;
        this.z = new com.sankuai.waimai.store.im.number.b() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.number.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "650593707bb2193aa2ef64878b4561f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "650593707bb2193aa2ef64878b4561f8");
                    return;
                }
                ChannelNavMachViewBlock.this.t = i;
                HashMap hashMap = new HashMap();
                hashMap.put(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(i));
                ChannelNavMachViewBlock.this.a("home_nav_change_msg", hashMap);
            }
        };
        this.A = new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.8
        };
        this.B = new a() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4183374488ffd2d4bebc27d3c4bbf409", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4183374488ffd2d4bebc27d3c4bbf409");
                } else if (ChannelNavMachViewBlock.this.r == null || com.sankuai.shangou.stone.util.a.c(ChannelNavMachViewBlock.this.s) <= 0) {
                } else {
                    h hVar = ChannelNavMachViewBlock.this.r;
                    ViewGroup viewGroup2 = ChannelNavMachViewBlock.this.d;
                    Object[] objArr3 = {viewGroup2};
                    ChangeQuickRedirect changeQuickRedirect3 = h.a;
                    if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "a511fdd36ce1bd0e93bbac9ddf77a9cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "a511fdd36ce1bd0e93bbac9ddf77a9cf");
                        return;
                    }
                    hVar.f.requestFocus();
                    int measuredHeight = viewGroup2.getMeasuredHeight();
                    int[] iArr = new int[2];
                    viewGroup2.getLocationOnScreen(iArr);
                    ar.a(hVar.c, viewGroup2, 53, com.sankuai.shangou.stone.util.h.a(hVar.b, 8.0f), (iArr[1] + measuredHeight) - com.sankuai.shangou.stone.util.h.a(hVar.b, 5.0f));
                    if (hVar.i != null) {
                        hVar.i.a(hVar.h, hVar.g, hVar.e);
                    }
                }
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee6ecab1e1df0467a0f3e9e066ffd7df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee6ecab1e1df0467a0f3e9e066ffd7df");
                } else if (ChannelNavMachViewBlock.this.l != null) {
                    ChannelNavMachViewBlock.this.l.d();
                }
            }
        };
        this.n = sCBaseActivity;
        this.o = new com.sankuai.waimai.store.poi.list.logreport.c(this.c.G);
        this.m = new com.sankuai.waimai.store.mach.d(sCBaseActivity, sCBaseActivity.w()) { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b3bf29136752d653bb50e9188dfb60a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b3bf29136752d653bb50e9188dfb60a") : ChannelNavMachViewBlock.this.o;
            }
        };
        this.m.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96968f1ec17730ec4890cb65e32472b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96968f1ec17730ec4890cb65e32472b6");
                    return;
                }
                super.e();
                if (ChannelNavMachViewBlock.this.l != null) {
                    ChannelNavMachViewBlock.this.l.c();
                }
                if (ChannelNavMachViewBlock.this.y == 0) {
                    ChannelNavMachViewBlock.d(ChannelNavMachViewBlock.this);
                    com.sankuai.waimai.store.im.c unused = ChannelNavMachViewBlock.this.x;
                    ChannelNavMachViewBlock.this.getContext().getApplicationContext();
                }
            }
        });
        this.m.g = this.w;
        this.w.a("jump", new OnJsEventJump());
        this.w.a("home_nav_location_click", new com.sankuai.waimai.store.poi.list.newp.methods.h(this.B));
        this.w.a("home_nav_click_more", new com.sankuai.waimai.store.poi.list.newp.methods.h(this.B));
        this.w.a("home_nav_click_share", new com.sankuai.waimai.store.poi.list.newp.methods.h(this.B));
        Object[] objArr2 = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef4e8e12d8b4fb34360498a7a553096d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef4e8e12d8b4fb34360498a7a553096d");
        } else if (this.r == null) {
            this.r = new h(sCBaseActivity, 3, this.c);
            this.r.a(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.4
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                }
            });
            this.r.i = new h.a() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a() {
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fb47abb6a770aea756737c1f88f44d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fb47abb6a770aea756737c1f88f44d0");
                    } else {
                        ChannelNavMachViewBlock.a(ChannelNavMachViewBlock.this, ChannelNavMachViewBlock.this.getContext(), ChannelNavMachViewBlock.this.c, i);
                    }
                }
            };
        }
    }

    @Subscribe
    public void onHomeBannerChangeReceive(com.sankuai.waimai.store.poi.list.refactor.card.background.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c925a39c29e9653dacc81517b702ad8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c925a39c29e9653dacc81517b702ad8e");
        } else if (aVar == null) {
        } else {
            a(aVar.a);
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e88ba8c8c3fca5aeacc6748a478232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e88ba8c8c3fca5aeacc6748a478232");
        } else if (i > this.i.size() - 1 || i < 0) {
        } else {
            b(this.i.get(i), false);
            if (this.j != null) {
                this.j.a(this.i.get(i));
            }
        }
    }

    public final void b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d55e33ac3b5b7dc3cf05fb591f7cdf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d55e33ac3b5b7dc3cf05fb591f7cdf9");
        } else if (this.k || z) {
            HashMap hashMap = new HashMap();
            hashMap.put("topBarColorValue", str);
            a("updateTopBarColor", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5250d323340d48c6b3cf3c7ee58eb24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5250d323340d48c6b3cf3c7ee58eb24");
            return;
        }
        super.onViewCreated();
        com.meituan.android.bus.a.a().a(this);
        this.m.a(this.d, "sm_home_%s", "supermarket");
        this.m.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e0588b81dc72ee546adad6230ef3301", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e0588b81dc72ee546adad6230ef3301");
                } else {
                    ChannelNavMachViewBlock.f(ChannelNavMachViewBlock.this);
                }
            }
        });
        com.sankuai.waimai.store.im.number.d.a().a(this.z);
        this.x.a = this.A;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5ce1d2bb9b81479b65816a6cea92a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5ce1d2bb9b81479b65816a6cea92a4");
            return;
        }
        super.onResume();
        if (this.x == null || this.y == 0) {
            return;
        }
        getContext().getApplicationContext();
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5e2f30f8d013b2eb4f90d0d257f903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5e2f30f8d013b2eb4f90d0d257f903");
        } else if (this.m == null) {
        } else {
            this.m.b(str, map);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ea2d285ff69edb40ee576101eabeea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ea2d285ff69edb40ee576101eabeea");
            return;
        }
        super.onDestroy();
        if (this.r != null && this.r.b()) {
            this.r.a();
        }
        com.sankuai.waimai.store.im.number.d.a().b(this.z);
        com.sankuai.waimai.store.im.c cVar = this.x;
        if (cVar.a != null) {
            cVar.a = null;
        }
        com.meituan.android.bus.a.a().b(this);
    }
}
