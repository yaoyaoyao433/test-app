package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.j;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiRequestError;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.MemberInfoEntity;
import com.sankuai.waimai.store.repository.model.TopNavigationEntity;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.viewblocks.e;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiActionBarCard4 extends BaseCard implements l<PoiResult>, com.sankuai.waimai.store.assembler.component.a, com.sankuai.waimai.store.poi.list.callback.a {
    public static ChangeQuickRedirect h;
    public boolean i;
    private ImageView j;
    private FrameLayout k;
    private com.sankuai.waimai.store.param.a l;
    private a m;
    private View n;
    private e o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private String t;
    private String u;
    private int v;
    private int w;

    /* JADX WARN: Removed duplicated region for block: B:65:0x0158 A[Catch: Exception -> 0x0228, TryCatch #0 {Exception -> 0x0228, blocks: (B:9:0x0023, B:11:0x0027, B:12:0x0036, B:14:0x003c, B:16:0x0044, B:18:0x004a, B:23:0x005a, B:25:0x0060, B:26:0x006d, B:28:0x0075, B:29:0x0077, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:46:0x00bb, B:48:0x00d6, B:59:0x013f, B:61:0x0143, B:63:0x0154, B:65:0x0158, B:66:0x0166, B:68:0x016c, B:69:0x0175, B:71:0x0192, B:72:0x019c, B:76:0x01ac, B:78:0x01d7, B:95:0x0224, B:79:0x01e2, B:81:0x01e8, B:83:0x01ee, B:85:0x01f2, B:87:0x01fa, B:89:0x0209, B:91:0x021a, B:51:0x00e8, B:52:0x00f4, B:55:0x00ff, B:57:0x0107, B:58:0x0129, B:62:0x0149), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c A[Catch: Exception -> 0x0228, TryCatch #0 {Exception -> 0x0228, blocks: (B:9:0x0023, B:11:0x0027, B:12:0x0036, B:14:0x003c, B:16:0x0044, B:18:0x004a, B:23:0x005a, B:25:0x0060, B:26:0x006d, B:28:0x0075, B:29:0x0077, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:46:0x00bb, B:48:0x00d6, B:59:0x013f, B:61:0x0143, B:63:0x0154, B:65:0x0158, B:66:0x0166, B:68:0x016c, B:69:0x0175, B:71:0x0192, B:72:0x019c, B:76:0x01ac, B:78:0x01d7, B:95:0x0224, B:79:0x01e2, B:81:0x01e8, B:83:0x01ee, B:85:0x01f2, B:87:0x01fa, B:89:0x0209, B:91:0x021a, B:51:0x00e8, B:52:0x00f4, B:55:0x00ff, B:57:0x0107, B:58:0x0129, B:62:0x0149), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192 A[Catch: Exception -> 0x0228, TryCatch #0 {Exception -> 0x0228, blocks: (B:9:0x0023, B:11:0x0027, B:12:0x0036, B:14:0x003c, B:16:0x0044, B:18:0x004a, B:23:0x005a, B:25:0x0060, B:26:0x006d, B:28:0x0075, B:29:0x0077, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:46:0x00bb, B:48:0x00d6, B:59:0x013f, B:61:0x0143, B:63:0x0154, B:65:0x0158, B:66:0x0166, B:68:0x016c, B:69:0x0175, B:71:0x0192, B:72:0x019c, B:76:0x01ac, B:78:0x01d7, B:95:0x0224, B:79:0x01e2, B:81:0x01e8, B:83:0x01ee, B:85:0x01f2, B:87:0x01fa, B:89:0x0209, B:91:0x021a, B:51:0x00e8, B:52:0x00f4, B:55:0x00ff, B:57:0x0107, B:58:0x0129, B:62:0x0149), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7 A[Catch: Exception -> 0x0228, TryCatch #0 {Exception -> 0x0228, blocks: (B:9:0x0023, B:11:0x0027, B:12:0x0036, B:14:0x003c, B:16:0x0044, B:18:0x004a, B:23:0x005a, B:25:0x0060, B:26:0x006d, B:28:0x0075, B:29:0x0077, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:46:0x00bb, B:48:0x00d6, B:59:0x013f, B:61:0x0143, B:63:0x0154, B:65:0x0158, B:66:0x0166, B:68:0x016c, B:69:0x0175, B:71:0x0192, B:72:0x019c, B:76:0x01ac, B:78:0x01d7, B:95:0x0224, B:79:0x01e2, B:81:0x01e8, B:83:0x01ee, B:85:0x01f2, B:87:0x01fa, B:89:0x0209, B:91:0x021a, B:51:0x00e8, B:52:0x00f4, B:55:0x00ff, B:57:0x0107, B:58:0x0129, B:62:0x0149), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2 A[Catch: Exception -> 0x0228, TryCatch #0 {Exception -> 0x0228, blocks: (B:9:0x0023, B:11:0x0027, B:12:0x0036, B:14:0x003c, B:16:0x0044, B:18:0x004a, B:23:0x005a, B:25:0x0060, B:26:0x006d, B:28:0x0075, B:29:0x0077, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:46:0x00bb, B:48:0x00d6, B:59:0x013f, B:61:0x0143, B:63:0x0154, B:65:0x0158, B:66:0x0166, B:68:0x016c, B:69:0x0175, B:71:0x0192, B:72:0x019c, B:76:0x01ac, B:78:0x01d7, B:95:0x0224, B:79:0x01e2, B:81:0x01e8, B:83:0x01ee, B:85:0x01f2, B:87:0x01fa, B:89:0x0209, B:91:0x021a, B:51:0x00e8, B:52:0x00f4, B:55:0x00ff, B:57:0x0107, B:58:0x0129, B:62:0x0149), top: B:100:0x0023 }] */
    @Override // android.arch.lifecycle.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(@android.support.annotation.Nullable com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult r14) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.a(java.lang.Object):void");
    }

    public PoiActionBarCard4(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3121126a77f07fb3b34bc9cb9ca7d551", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3121126a77f07fb3b34bc9cb9ca7d551");
            return;
        }
        this.p = true;
        this.r = -1;
        this.t = "";
        this.u = "";
        this.v = -999;
        this.w = 0;
        this.i = true;
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a676bdf59938beccda60535ca63e0b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a676bdf59938beccda60535ca63e0b") : LayoutInflater.from(this.e).inflate(R.layout.wm_sc_home_channel_refator_action_bar_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8425ef0786e4701089620e593c92bd07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8425ef0786e4701089620e593c92bd07");
            return;
        }
        super.a(view);
        this.j = (ImageView) a(R.id.iv_top_background);
        this.j.setTag(Integer.valueOf(h.a(this.e, 105.0f)));
        this.k = (FrameLayout) a(R.id.fl_action_bar_container);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.l = poiPageViewModel.d.a();
        this.m = d();
        this.m.createAndReplaceView(this.k);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "894c81be2c450dfbf34a1ca45cc8691f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "894c81be2c450dfbf34a1ca45cc8691f");
                }
            }
        });
        poiPageViewModel.e.a(this.d, new l<Boolean>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2fb4436bb351f687fc446d7303a46bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2fb4436bb351f687fc446d7303a46bf");
                } else {
                    PoiActionBarCard4.this.m.d(String.valueOf(PoiActionBarCard4.this.l.c));
                }
            }
        });
        poiPageViewModel.g.a(this.d, new l<PoiRequestError>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PoiRequestError poiRequestError) {
                Object[] objArr2 = {poiRequestError};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9287a0b9280f0c87faaf576b003f6e23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9287a0b9280f0c87faaf576b003f6e23");
                } else {
                    PoiActionBarCard4.this.m.a((MemberInfoEntity) null);
                }
            }
        });
        poiPageViewModel.h.a(this.d, new l<PoiLocationAddress>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PoiLocationAddress poiLocationAddress) {
                PoiLocationAddress poiLocationAddress2 = poiLocationAddress;
                Object[] objArr2 = {poiLocationAddress2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb38ec2babba7517d01549c690e1635b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb38ec2babba7517d01549c690e1635b");
                } else if (poiLocationAddress2 != null) {
                    PoiActionBarCard4.this.m.e(poiLocationAddress2.address);
                }
            }
        });
        poiPageViewModel.b.a(this.d, this);
        a(j.class, new l<j>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable j jVar) {
                j jVar2 = jVar;
                Object[] objArr2 = {jVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "946b447c9d2f8d2f95dbf3aee0067bb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "946b447c9d2f8d2f95dbf3aee0067bb1");
                } else if (!PoiActionBarCard4.this.i || jVar2 == null || jVar2.a) {
                } else {
                    PoiActionBarCard4.this.i = false;
                    PoiActionBarCard4.this.m.getView().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiActionBarCard4.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acae036380fa97feba7785dc6bb8e9ac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acae036380fa97feba7785dc6bb8e9ac");
                            } else {
                                PoiActionBarCard4.this.m.l();
                            }
                        }
                    }, 100L);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38082c6811a9e7736750ff3a9fc123d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38082c6811a9e7736750ff3a9fc123d1");
        } else if (this.r > 0) {
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            layoutParams.height = this.r;
            this.j.setLayoutParams(layoutParams);
            this.j.setTag(Integer.valueOf(this.r));
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb112731fe4b94c2f3c2996f0a3ae53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb112731fe4b94c2f3c2996f0a3ae53");
            return;
        }
        super.onResume();
        if (!TextUtils.isEmpty(this.l.T)) {
            this.m.d(String.valueOf(this.l.c));
        } else {
            this.s = true;
        }
        if (this.m != null) {
            this.m.onResume();
        }
    }

    private a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb8e49791511f32d8fd5e6a95a0db60", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb8e49791511f32d8fd5e6a95a0db60");
        }
        if (this.m != null) {
            this.m.onDestroy();
        }
        if (this.l.y) {
            return new b(this.e, this.l, this, this.l.e());
        }
        if (this.l.f()) {
            return new PoiFlowerActionBar2(this.e, this.l, this);
        }
        if (this.l.e()) {
            return new d(this.e, this.l, this, this.l.e());
        }
        return new PoiChannelActionBar2(this.e, this.l, this);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b39247fcee39b1ad95677c65f0a341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b39247fcee39b1ad95677c65f0a341");
            return;
        }
        super.onDestroy();
        if (this.m != null) {
            this.m.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.callback.a
    public final void bF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd2ca6397f5b0fcbcd5aecb491ab116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd2ca6397f5b0fcbcd5aecb491ab116");
        } else {
            b((PoiActionBarCard4) new com.sankuai.waimai.store.poi.list.refactor.event.a());
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.callback.a
    public final void a(SearchCarouselText searchCarouselText) {
        Object[] objArr = {searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947476582eda5a12e3e15dd0be65ed86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947476582eda5a12e3e15dd0be65ed86");
            return;
        }
        c(searchCarouselText);
        HashMap hashMap = new HashMap();
        hashMap.put("bid", "b_aZbuD");
        hashMap.put("cat_id", Long.valueOf(this.l.c));
        com.sankuai.waimai.store.manager.judas.b.a(this.l.G, hashMap);
        com.sankuai.waimai.store.manager.judas.b.a(this.l.G, "b_aZbuD").a("cat_id", Long.valueOf(this.l.c)).a("cate_id", Long.valueOf(this.l.c)).a("stid", this.l.T).a("keyword", this.t).a("label_word", this.u).a("word_type", Integer.valueOf(this.v)).a("index", Integer.valueOf(this.w)).a("has_word", Integer.valueOf(this.l.U)).a("entry_type", Integer.valueOf(this.l.aS ? 1 : 0)).a();
        g.a(this.e, this.l, (String) null, searchCarouselText);
    }

    @Override // com.sankuai.waimai.store.poi.list.callback.a
    public final void b(SearchCarouselText searchCarouselText) {
        Object[] objArr = {searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddc291857e903aa13b43cbb453e3832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddc291857e903aa13b43cbb453e3832");
            return;
        }
        c(searchCarouselText);
        com.sankuai.waimai.store.manager.judas.b.b(this.l.G, "b_waimai_sg_agg2smzp_mv").a("cat_id", Long.valueOf(this.l.c)).a("cate_id", Long.valueOf(this.l.c)).a("stid", this.l.T).a("keyword", this.t).a("label_word", this.u).a("word_type", Integer.valueOf(this.v)).a("index", Integer.valueOf(this.w)).a();
    }

    private void c(SearchCarouselText searchCarouselText) {
        Object[] objArr = {searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84233db1cf82606d5c3466d130a612c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84233db1cf82606d5c3466d130a612c0");
        } else if (searchCarouselText != null) {
            this.t = !t.a(searchCarouselText.query) ? searchCarouselText.query : null;
            this.u = t.a(searchCarouselText.text) ? null : searchCarouselText.text;
            if (!TextUtils.isEmpty(this.t)) {
                this.v = searchCarouselText.type;
            } else {
                this.v = -999;
            }
            this.w = searchCarouselText.index;
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.callback.a
    public final void bG_() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eca35445520d573bce2a93ca936ab85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eca35445520d573bce2a93ca936ab85");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eacffa1cae50c1c7d6d4918eb455e655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eacffa1cae50c1c7d6d4918eb455e655");
        } else {
            com.sankuai.waimai.store.callback.a a = com.sankuai.waimai.store.manager.judas.b.a(this.l.G, "b_waimai_a90lzwad_mc").a("cat_id", Long.valueOf(this.l.c));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6cbb76b1ad9ff6657846d8dd673ea4a2", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6cbb76b1ad9ff6657846d8dd673ea4a2");
            } else {
                str = this.l.f() ? "2" : "0";
            }
            a.a("media_type", str).a();
        }
        com.sankuai.waimai.store.router.d.a(this.e, com.sankuai.waimai.store.router.c.j);
    }

    @Override // com.sankuai.waimai.store.poi.list.callback.a
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f4421a7ea705017d866d46d8263cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f4421a7ea705017d866d46d8263cb2");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.l.G, "b_PKwLc").a("new_message_badge", 0).a();
        if (this.o == null) {
            return;
        }
        if (this.o.b()) {
            this.o.a();
        } else {
            this.o.b(view);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.callback.a
    public final void a(@NonNull TopNavigationEntity.NavigationActivity navigationActivity) {
        Object[] objArr = {navigationActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb451750850ca8d15b23e25d8df5f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb451750850ca8d15b23e25d8df5f28");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.l.G, com.sankuai.waimai.store.manager.judas.b.a((Object) this.e), "b_waimai_aekmcwqp_mc").a("cat_id", Long.valueOf(this.l.c)).a("stid", this.l.T).a("activity_id", navigationActivity.activityId).a();
        com.sankuai.waimai.store.router.d.a(this.e, navigationActivity.h5Url);
    }

    @Override // com.sankuai.waimai.store.assembler.component.a
    public final void a(int i, int i2, boolean z, boolean z2) {
        ViewGroup a;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ae6bf7f34f29d598877d647e7b051d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ae6bf7f34f29d598877d647e7b051d");
            return;
        }
        if (this.f != null && this.q && (a = this.f.a("native_flower_location")) != null) {
            this.q = false;
            if (a != this.n && (a.getTag() == null || !(a.getTag() instanceof Integer))) {
                a.setTag(Integer.valueOf(a.getTop()));
            }
            this.n = a;
        }
        if (!this.l.aS) {
            this.m.a(i, this.j, this.n);
        } else {
            this.m.b(i, this.j, this.n);
        }
    }
}
