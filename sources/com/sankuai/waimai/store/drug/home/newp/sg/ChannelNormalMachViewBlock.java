package com.sankuai.waimai.store.drug.home.newp.sg;

import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeData;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeViewModel;
import com.sankuai.waimai.store.drug.home.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.drug.home.newp.sg.a;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.HashMap;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ChannelNormalMachViewBlock extends a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> implements com.sankuai.waimai.store.im.entrance.drug.unread.I.a {
    public static ChangeQuickRedirect h;
    private com.sankuai.waimai.store.mach.medhod.a i;
    private com.sankuai.waimai.store.im.entrance.mach.b j;
    private com.sankuai.waimai.store.mach.d k;
    private ViewGroup l;
    private View m;
    private SCBaseActivity n;
    private com.sankuai.waimai.mach.d o;
    private String p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;

    public static /* synthetic */ void e(ChannelNormalMachViewBlock channelNormalMachViewBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, channelNormalMachViewBlock, changeQuickRedirect, false, "52dec7fedc47f35e19cb55ebc2fcd4d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, channelNormalMachViewBlock, changeQuickRedirect, false, "52dec7fedc47f35e19cb55ebc2fcd4d2");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(channelNormalMachViewBlock.l);
        Object[] objArr2 = {channelNormalMachViewBlock};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        aVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "959c8796717989af61b3dcc10f3cdb92", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "959c8796717989af61b3dcc10f3cdb92") : new c(channelNormalMachViewBlock));
        com.sankuai.waimai.store.expose.v2.b.a().a(channelNormalMachViewBlock.n, aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0241, code lost:
        if (r11 < 3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
        if (r13.equals("drug-homepage-super-resource-position") != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [rx.functions.b] */
    @Override // com.sankuai.waimai.store.drug.home.newp.sg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void b(@android.support.annotation.NonNull com.sankuai.waimai.store.base.idata.b<com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse, java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.home.newp.sg.ChannelNormalMachViewBlock.b(java.lang.Object):void");
    }

    public ChannelNormalMachViewBlock(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92a8913f1da5476132c6734e8c84bfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92a8913f1da5476132c6734e8c84bfe");
            return;
        }
        this.i = new com.sankuai.waimai.store.mach.medhod.a();
        this.p = "";
        this.q = "";
        this.r = false;
        this.s = false;
        this.t = false;
        this.n = sCBaseActivity;
        this.j = new com.sankuai.waimai.drug.im.entrance.mach.a();
        this.j.a(sCBaseActivity, sCBaseActivity.b(), sCBaseActivity.w(), this);
        this.k = new com.sankuai.waimai.store.mach.d(sCBaseActivity, sCBaseActivity.w()) { // from class: com.sankuai.waimai.store.drug.home.newp.sg.ChannelNormalMachViewBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4796a72d61621c7fc19210f31548295", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4796a72d61621c7fc19210f31548295") : ChannelNormalMachViewBlock.this.o;
            }
        };
        this.o = new com.sankuai.waimai.store.drug.home.logreport.a(this.n, this.b.G, com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext));
        this.k.a(new e() { // from class: com.sankuai.waimai.store.drug.home.newp.sg.ChannelNormalMachViewBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "401fb0553ac5366bdbc7479c0f5786ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "401fb0553ac5366bdbc7479c0f5786ef");
                } else {
                    ChannelNormalMachViewBlock.this.k.h();
                }
            }
        });
        this.k.g = this.i;
        this.i.a("jump", new OnJsEventJump());
        this.i.a("click_drug_im_entrance", new com.sankuai.waimai.store.drug.home.newp.methods.a(this.j));
        this.i.a("query_drug_im_msg_number", new com.sankuai.waimai.store.drug.home.newp.methods.a(this.j));
        com.meituan.android.bus.a.a().a(this);
        this.j.c();
        ShoppingGuideRealtimeViewModel shoppingGuideRealtimeViewModel = (ShoppingGuideRealtimeViewModel) q.a((FragmentActivity) this.n).a(ShoppingGuideRealtimeViewModel.class);
        SCBaseActivity sCBaseActivity2 = this.n;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        l<ShoppingGuideRealtimeData> bVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1732a020e85ea4d97f0efd1f3ceded1f", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1732a020e85ea4d97f0efd1f3ceded1f") : new b(this);
        Object[] objArr3 = {sCBaseActivity2, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = ShoppingGuideRealtimeViewModel.a;
        if (PatchProxy.isSupport(objArr3, shoppingGuideRealtimeViewModel, changeQuickRedirect3, false, "aa8469f7f910da4dd7d589983d2d996d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, shoppingGuideRealtimeViewModel, changeQuickRedirect3, false, "aa8469f7f910da4dd7d589983d2d996d");
        } else if (sCBaseActivity2 == null || bVar == null) {
        } else {
            shoppingGuideRealtimeViewModel.b().a(sCBaseActivity2, bVar);
        }
    }

    public static /* synthetic */ void a(ChannelNormalMachViewBlock channelNormalMachViewBlock, ShoppingGuideRealtimeData shoppingGuideRealtimeData) {
        Object[] objArr = {channelNormalMachViewBlock, shoppingGuideRealtimeData};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03cc2a79ba3bf33aeb3643b6dc42c19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03cc2a79ba3bf33aeb3643b6dc42c19b");
        } else if (shoppingGuideRealtimeData == null || shoppingGuideRealtimeData.jsonData == null || !TextUtils.equals(channelNormalMachViewBlock.p, shoppingGuideRealtimeData.templateId)) {
        } else {
            channelNormalMachViewBlock.k.b("drug_homepage_mach_realtime_update", shoppingGuideRealtimeData.jsonData);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.unread.I.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe69a47ab9883371ef422c845b471c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe69a47ab9883371ef422c845b471c90");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("number", Integer.valueOf(i));
        this.k.b("show_drug_im_red_dot", hashMap);
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.sg.a
    public final void a(@NonNull a.C1157a c1157a) {
        int a;
        int a2;
        Object[] objArr = {c1157a};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c0eaab1196cdb9b029350965f6a6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c0eaab1196cdb9b029350965f6a6a8");
            return;
        }
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a.C1157a.a;
        if (PatchProxy.isSupport(objArr2, c1157a, changeQuickRedirect2, false, "3b9e467eaf339d48f6bd0367a5c15ddc", RobustBitConfig.DEFAULT_VALUE)) {
            a = ((Integer) PatchProxy.accessDispatch(objArr2, c1157a, changeQuickRedirect2, false, "3b9e467eaf339d48f6bd0367a5c15ddc")).intValue();
        } else {
            a = c1157a.b > 0 ? c1157a.a(context, c1157a.b) : c1157a.b;
        }
        int i = a;
        Context context2 = getContext();
        Object[] objArr3 = {context2};
        ChangeQuickRedirect changeQuickRedirect3 = a.C1157a.a;
        if (PatchProxy.isSupport(objArr3, c1157a, changeQuickRedirect3, false, "411cbdc379c21addb55eb095ed6924ef", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Integer) PatchProxy.accessDispatch(objArr3, c1157a, changeQuickRedirect3, false, "411cbdc379c21addb55eb095ed6924ef")).intValue();
        } else {
            a2 = c1157a.c > 0 ? c1157a.a(context2, c1157a.c) : c1157a.c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
        if (i >= 0) {
            marginLayoutParams.topMargin = i;
        }
        if (a2 >= 0) {
            marginLayoutParams.bottomMargin = a2;
        }
        this.l.setLayoutParams(marginLayoutParams);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babf1c144b85d9a94a540af07de2307a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babf1c144b85d9a94a540af07de2307a");
            return;
        }
        super.onViewCreated();
        this.l = (ViewGroup) findView(R.id.fl_tile_container);
        this.k.a(this.l, "MachDrugHomePage", DefaultHeaderService.KEY_DRUG);
        this.k.a(new e() { // from class: com.sankuai.waimai.store.drug.home.newp.sg.ChannelNormalMachViewBlock.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bdb4f7ca75efacaae0e6067f5dcd7ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bdb4f7ca75efacaae0e6067f5dcd7ad");
                } else {
                    ChannelNormalMachViewBlock.e(ChannelNormalMachViewBlock.this);
                }
            }
        });
    }

    @Subscribe
    public void onCouponStatusChanged(com.sankuai.waimai.store.poilist.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a395cb1b0de86d9dc89405285e720188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a395cb1b0de86d9dc89405285e720188");
        } else if (bVar == null || !bVar.a() || this.k == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("coupon_id", bVar.b);
            hashMap.put("coupon_status", bVar.c);
            this.k.b("couponStatusChanged", hashMap);
        }
    }

    public static /* synthetic */ void a(ChannelNormalMachViewBlock channelNormalMachViewBlock) {
        Window window;
        k<Boolean> kVar;
        Object[] objArr = {channelNormalMachViewBlock};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "891ff19aa2f1c9a9522feab4692a8786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "891ff19aa2f1c9a9522feab4692a8786");
            return;
        }
        channelNormalMachViewBlock.k.g();
        if (channelNormalMachViewBlock.m != null) {
            ((ViewGroup) channelNormalMachViewBlock.getView()).removeView(channelNormalMachViewBlock.m);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, channelNormalMachViewBlock, changeQuickRedirect2, false, "92b43a5d50f9d34ebfbeeb8090cf3a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, channelNormalMachViewBlock, changeQuickRedirect2, false, "92b43a5d50f9d34ebfbeeb8090cf3a0f");
        } else if (!com.sankuai.waimai.store.util.b.a(channelNormalMachViewBlock.n) && com.sankuai.waimai.store.drug.home.refactor.cat.a.b(channelNormalMachViewBlock.b) && channelNormalMachViewBlock.d() && com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.a.a()) {
            PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a((FragmentActivity) channelNormalMachViewBlock.n).a(PoiPageViewModel.class);
            if (!channelNormalMachViewBlock.r) {
                channelNormalMachViewBlock.r = true;
                k<Bitmap> kVar2 = poiPageViewModel.i;
                SCBaseActivity sCBaseActivity = channelNormalMachViewBlock.n;
                Object[] objArr3 = {channelNormalMachViewBlock};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                kVar2.a(sCBaseActivity, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cb00e4943366bc397841c00e49bede63", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cb00e4943366bc397841c00e49bede63") : new d(channelNormalMachViewBlock));
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = PoiPageViewModel.a;
            if (PatchProxy.isSupport(objArr4, poiPageViewModel, changeQuickRedirect4, false, "ddb83db195136e559b160a78b83d3112", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, poiPageViewModel, changeQuickRedirect4, false, "ddb83db195136e559b160a78b83d3112");
            } else {
                poiPageViewModel.k++;
            }
            if ((poiPageViewModel.k == poiPageViewModel.j) && (window = channelNormalMachViewBlock.n.getWindow()) != null) {
                try {
                    poiPageViewModel.h.b((k<Boolean>) Boolean.TRUE);
                    poiPageViewModel.i.b((k<Bitmap>) com.sankuai.shangou.stone.util.b.a(window.getDecorView(), 0));
                    kVar = poiPageViewModel.h;
                } catch (Exception unused) {
                    kVar = poiPageViewModel.h;
                } catch (Throwable th) {
                    poiPageViewModel.h.b((k<Boolean>) Boolean.FALSE);
                    throw th;
                }
                kVar.b((k<Boolean>) Boolean.FALSE);
            }
        }
        channelNormalMachViewBlock.c();
    }

    public static /* synthetic */ void a(ChannelNormalMachViewBlock channelNormalMachViewBlock, Bitmap bitmap) {
        Object[] objArr = {channelNormalMachViewBlock, bitmap};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e8637394ed020f65befce21727714c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e8637394ed020f65befce21727714c9");
        } else if (bitmap == null || !channelNormalMachViewBlock.d()) {
        } else {
            channelNormalMachViewBlock.s = true;
            View view = channelNormalMachViewBlock.getView();
            String str = channelNormalMachViewBlock.q;
            Object[] objArr2 = {view, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "290892b08030b80635d7e37b25e02718", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "290892b08030b80635d7e37b25e02718");
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            int[] iArr = {0, 0};
            view.getLocationInWindow(iArr);
            Object[] objArr3 = {iArr, Integer.valueOf(width), bitmap, Integer.valueOf(height)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.d.a;
            rx.d a = rx.d.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "27f08bdacd1493eb50214e79e6cb99d4", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "27f08bdacd1493eb50214e79e6cb99d4") : new com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.d(iArr, width, bitmap, height)).b(rx.android.schedulers.a.a()).a(rx.schedulers.a.e());
            Object[] objArr4 = {iArr, Integer.valueOf(width), Integer.valueOf(height), view, str};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.e.a;
            a.c(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4596035f2efe59e5fcf232539947ade9", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4596035f2efe59e5fcf232539947ade9") : new com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide.e(iArr, width, height, view, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b1ecea8f20bf01c124e205558af2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b1ecea8f20bf01c124e205558af2d2");
        } else if (this.t || com.sankuai.waimai.store.util.b.a(this.n)) {
        } else {
            this.t = true;
            PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a((FragmentActivity) this.n).a(PoiPageViewModel.class);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PoiPageViewModel.a;
            if (PatchProxy.isSupport(objArr2, poiPageViewModel, changeQuickRedirect2, false, "b335a51da1978bfa845d0ae6983e4a8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, poiPageViewModel, changeQuickRedirect2, false, "b335a51da1978bfa845d0ae6983e4a8b");
            } else {
                poiPageViewModel.m++;
            }
            if (poiPageViewModel.l == poiPageViewModel.m) {
                ((PageEventHandler) q.a((FragmentActivity) this.n).a(PageEventHandler.class)).a((PageEventHandler) new com.sankuai.waimai.store.drug.home.refactor.card.float_card.b());
            }
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2a0b0c6f7c9d28f63af64276ef6d99", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2a0b0c6f7c9d28f63af64276ef6d99")).booleanValue() : (this.s || getView() == null || TextUtils.isEmpty(this.q)) ? false : true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ce936363c0f7dcc4b4a8d79caeeb3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ce936363c0f7dcc4b4a8d79caeeb3c");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        if (this.j != null) {
            this.j.a();
        }
    }
}
