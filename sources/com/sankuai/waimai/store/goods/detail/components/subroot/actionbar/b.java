package com.sankuai.waimai.store.goods.detail.components.subroot.actionbar;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.newwidgets.SCActionbarItemView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.router.g;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends j implements c.b {
    public static ChangeQuickRedirect g;
    protected ImageView h;
    protected GetMenuResponse i;
    public c.a j;
    private SCActionbarItemView k;
    private ImageView l;
    private com.sankuai.waimai.store.expose.v2.entity.b m;
    private com.sankuai.waimai.store.expose.v2.entity.b n;
    private com.sankuai.waimai.store.im.number.c o;

    public abstract void a(float f);

    public abstract int b(int i);

    public abstract int b(int i, int i2);

    public void b(@NonNull GetMenuResponse getMenuResponse) {
    }

    public abstract SCActionbarItemView s();

    public abstract ImageView t();

    public abstract ImageView u();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1064d9f66282907b1cc73db067ea55c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1064d9f66282907b1cc73db067ea55c4");
            return;
        }
        this.o = new com.sankuai.waimai.store.im.number.c() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.number.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19501cfdfd534d061f481518142a0d64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19501cfdfd534d061f481518142a0d64");
                } else {
                    b.this.c(i);
                }
            }
        };
        this.j = new d(this);
    }

    @Override // com.meituan.android.cube.core.f
    public void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1999646b296e70020b9b092e9f10f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1999646b296e70020b9b092e9f10f4");
            return;
        }
        super.a_(view);
        this.k = s();
        if (this.k != null) {
            this.n = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_q8nfh2pn_mv", this.k);
            com.sankuai.waimai.store.expose.v2.b.a().a(l(), this.n);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1ef404d78e8557586a95d97aba67023", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1ef404d78e8557586a95d97aba67023");
                    } else {
                        b.this.j.h();
                    }
                }
            });
        }
        this.l = u();
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c55551beb1b52b0e26a9f75fa128282a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c55551beb1b52b0e26a9f75fa128282a");
                } else {
                    b.this.a(new a());
                }
            }
        });
        this.h = t();
        if (this.h != null) {
            this.m = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_duezw0z4_mv", this.h);
            com.sankuai.waimai.store.expose.v2.b.a().a(l(), this.m);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b92328f51721348867032a89a0616e7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b92328f51721348867032a89a0616e7");
                        return;
                    }
                    com.sankuai.waimai.store.manager.user.a.a(b.this.l(), new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c7bf6cefdfd8bbc90f22a42cb4e3b01", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c7bf6cefdfd8bbc90f22a42cb4e3b01");
                            } else {
                                g.a(b.this.l(), 103);
                            }
                        }
                    });
                    com.sankuai.waimai.store.manager.judas.b.a(b.this.l(), "b_waimai_sg_duezw0z4_mc").a("poi_id", Long.valueOf(b.this.j.b())).a("spu_id", Long.valueOf(b.this.j.c())).a();
                }
            });
        }
        com.sankuai.waimai.store.im.number.d.a().a(this.o);
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255c82e89ae4abdea6a0ddf01571794d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255c82e89ae4abdea6a0ddf01571794d");
        } else {
            this.j.a();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6045dc7fb9d3787478077aedbde85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6045dc7fb9d3787478077aedbde85d");
            return;
        }
        super.bE_();
        com.sankuai.waimai.store.im.number.d.a().b(this.o);
    }

    public void a(GetMenuResponse getMenuResponse) {
        boolean z = true;
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef8ded6961cad5998c08a87daecdcc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef8ded6961cad5998c08a87daecdcc1");
        } else if (getMenuResponse == null) {
        } else {
            this.i = getMenuResponse;
            b(getMenuResponse);
            com.sankuai.waimai.store.im.number.d.a().a(this.i);
            GetMenuResponse.MenuInfo menuInfo = null;
            Iterator<GetMenuResponse.MenuInfo> it = this.i.menuInfoArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GetMenuResponse.MenuInfo next = it.next();
                if (next != null && next.b == 4) {
                    menuInfo = next;
                    break;
                }
            }
            String str = "";
            if (menuInfo == null || menuInfo.g == null || menuInfo.g.b == null || TextUtils.isEmpty(menuInfo.g.b.a)) {
                z = false;
            } else {
                str = menuInfo.g.b.a;
            }
            if (this.k != null) {
                this.k.setVisibility(z ? 0 : 8);
            }
            if (!TextUtils.isEmpty(str)) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("biz_im_from", "1").build().toString();
            }
            this.j.b(str);
        }
    }

    public void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, String str, String str2, String str3) {
        Object[] objArr = {aVar, goodsSpu, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2df256246cf48f36e33a5a2650def9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2df256246cf48f36e33a5a2650def9");
            return;
        }
        this.j.a(aVar, goodsSpu, str, str2, str3);
        if (this.m != null) {
            this.m.a("poi_id", Long.valueOf(this.j.b()));
            this.m.a("spu_id", Long.valueOf(this.j.c()));
        }
        if (this.n != null) {
            this.n.a("poi_id", Long.valueOf(this.j.b()));
            this.n.a("spu_id", Long.valueOf(this.j.c()));
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8bd13ee8d6ba634a8e88a14b47018d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8bd13ee8d6ba634a8e88a14b47018d0");
        } else if (this.j != null) {
            this.j.a(str);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "064ed9258fbf609d5e4d73544981cedd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "064ed9258fbf609d5e4d73544981cedd");
        } else {
            a(c(b(i, i2), i2));
        }
    }

    private float c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8895c9887988f814895a1d8dd2b765c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8895c9887988f814895a1d8dd2b765c")).floatValue();
        }
        if (i == 0) {
            return 1.0f;
        }
        return 1.0f - Math.max(((i - i2) * 1.0f) / i, 0.0f);
    }

    public int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62fc062f49d9eb27b40e800dab4be17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62fc062f49d9eb27b40e800dab4be17")).intValue();
        }
        if (this.k == null) {
            return 0;
        }
        return this.k.b() ? 1 : 0;
    }

    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37913be0688b7b9eeb6acd2995c724fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37913be0688b7b9eeb6acd2995c724fe");
        } else if (this.k == null) {
        } else {
            if (i <= 0) {
                this.k.a();
            } else if (i <= 99) {
                this.k.a(String.valueOf(i));
            } else {
                this.k.a("99+");
            }
        }
    }
}
