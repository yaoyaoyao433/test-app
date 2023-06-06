package com.sankuai.waimai.business.page.kingkong.future.root;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.cube.pga.action.d;
import com.meituan.android.cube.pga.common.j;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.ai.SilentRefreshHelper;
import com.sankuai.waimai.business.page.common.list.ai.f;
import com.sankuai.waimai.business.page.common.list.ai.g;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.factory.FuTiaoMatrixView;
import com.sankuai.waimai.business.page.kingkong.future.ai.b;
import com.sankuai.waimai.business.page.kingkong.future.network.e;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.rocks.page.RocksPageFragment;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FKKFragment extends RocksPageFragment<a, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.business.page.kingkong.a b;
    public KingkongInfo c;
    public MetricsSpeedMeterTask d;
    private a g;
    private e h;
    private long i;
    private com.sankuai.waimai.business.page.home.factory.a j;
    private int k;

    public FKKFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b918bf0863447dc8ca155e25b366173c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b918bf0863447dc8ca155e25b366173c");
            return;
        }
        this.i = Long.MAX_VALUE;
        this.k = -1;
    }

    @Override // com.sankuai.waimai.rocks.page.RocksPageFragment
    public final /* synthetic */ a a(com.sankuai.waimai.business.page.kingkong.a aVar) {
        com.sankuai.waimai.business.page.kingkong.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0525d6f46e4db6c9bb68bd0c84643c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0525d6f46e4db6c9bb68bd0c84643c");
        }
        if (this.g == null) {
            this.g = new a(aVar2, this);
        }
        return this.g;
    }

    @Override // com.sankuai.waimai.rocks.page.RocksPageFragment
    public final /* synthetic */ com.sankuai.waimai.business.page.kingkong.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b5108ab45c72a30ebe40d5fffbebf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.kingkong.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b5108ab45c72a30ebe40d5fffbebf9");
        }
        this.b.v.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d35aa38c845642f0530c05c1fb98100", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d35aa38c845642f0530c05c1fb98100") : new com.sankuai.waimai.business.page.kingkong.future.network.b(FKKFragment.this.b);
            }
        };
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.i = arguments.getLong("poi_list_refresh_duration", Long.MAX_VALUE);
        }
        a2(this.b);
        this.b.ao.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b8ceb86830f2ea513cca61c6851129d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b8ceb86830f2ea513cca61c6851129d") : FKKFragment.this.d;
            }
        };
        this.b.al.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ed857c3e17e15e193752d4166899d58", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ed857c3e17e15e193752d4166899d58");
                } else {
                    FKKFragment.this.a2(FKKFragment.this.b);
                }
            }
        });
        return this.b;
    }

    public static FKKFragment a(boolean z, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a4eeb9be833c49b01b2c7e3239d74de", RobustBitConfig.DEFAULT_VALUE)) {
            return (FKKFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a4eeb9be833c49b01b2c7e3239d74de");
        }
        FKKFragment fKKFragment = new FKKFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_food_page", z);
        bundle.putLong("poi_list_refresh_duration", j);
        bundle.putBoolean("is_food_page", z);
        fKKFragment.setArguments(bundle);
        return fKKFragment;
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebc967856a2820dac1fcd2a060f07b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebc967856a2820dac1fcd2a060f07b5");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration.screenWidthDp != this.k && this.b != null) {
            this.b.ak.a((com.meituan.android.cube.pga.common.b<Void>) null);
        }
        this.k = configuration.screenWidthDp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(com.sankuai.waimai.business.page.kingkong.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5dab903d212133c410d80cc67b032f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5dab903d212133c410d80cc67b032f");
            return;
        }
        this.h = new e(aVar);
        aVar.u.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90eeb0838585fc2c1d6f0df9383bef3c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90eeb0838585fc2c1d6f0df9383bef3c") : FKKFragment.this.h;
            }
        };
    }

    @Override // com.sankuai.waimai.rocks.page.RocksPageFragment, android.support.v4.app.Fragment
    public void onStart() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d2167b4268c36486d8c02d7b86a2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d2167b4268c36486d8c02d7b86a2e9");
            return;
        }
        super.onStart();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fba582dff5fdda97e7921bf5a2427fd3", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fba582dff5fdda97e7921bf5a2427fd3")).booleanValue();
        } else if (this.h != null && SystemClock.elapsedRealtime() - this.h.f > this.i) {
            z = true;
        }
        if (!z || this.b == null) {
            return;
        }
        this.b.ak.a((com.meituan.android.cube.pga.common.b<Void>) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2afa04e2f1f08dcf0b5b15b39b1738ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2afa04e2f1f08dcf0b5b15b39b1738ad");
            return;
        }
        super.onViewCreated(view, bundle);
        FuTiaoMatrixView fuTiaoMatrixView = (FuTiaoMatrixView) view.findViewById(R.id.matrix_mach_container);
        fuTiaoMatrixView.setIsHomePage(false);
        this.j = new com.sankuai.waimai.business.page.home.factory.a(fuTiaoMatrixView);
    }

    @Override // com.sankuai.waimai.rocks.page.RocksPageFragment, android.support.v4.app.Fragment
    public void onResume() {
        com.sankuai.waimai.alita.persona.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb536d78f1c9ad1f055043f9b23c02d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb536d78f1c9ad1f055043f9b23c02d8");
            return;
        }
        super.onResume();
        if (this.g != null) {
            a aVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e48a0fa2d0435c3214db4508b24464b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e48a0fa2d0435c3214db4508b24464b8");
            } else {
                if (aVar.s != null && !com.sankuai.waimai.platform.privacy.a.a().b() && com.sankuai.waimai.business.page.kingkong.b.a(aVar.s) == com.sankuai.waimai.business.page.kingkong.b.FOOD) {
                    final com.sankuai.waimai.business.page.kingkong.future.ai.b a3 = com.sankuai.waimai.business.page.kingkong.future.ai.b.a();
                    final b.a aVar2 = aVar.w;
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.future.ai.b.a;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "36f4213850a9b4ea31b6e888aede5a44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "36f4213850a9b4ea31b6e888aede5a44");
                    } else if (f.a().c && (a2 = com.sankuai.waimai.alita.persona.c.a().a("waimai")) != null) {
                        com.sankuai.waimai.business.page.common.list.ai.e eVar = a3.d;
                        String jSONObject = f.a().d.toString();
                        Object[] objArr4 = {jSONObject, SilentRefreshHelper.PageSource.KING_KONG_POI_LIST};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.common.list.ai.e.a;
                        if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "99ead33621434e5d0889357ac408e034", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "99ead33621434e5d0889357ac408e034");
                        } else {
                            a.AbstractC1040a c = new com.sankuai.waimai.business.page.common.list.ai.d().a(com.sankuai.waimai.business.page.common.list.ai.e.b).b(com.sankuai.waimai.business.page.common.list.ai.e.c).c("update persona");
                            i.c(c.d("page : " + SilentRefreshHelper.PageSource.KING_KONG_POI_LIST + ",ABStrategy info : " + jSONObject).a(true).b());
                        }
                        a2.c("persona_dynamic_poi_list", new com.sankuai.waimai.alita.persona.e() { // from class: com.sankuai.waimai.business.page.kingkong.future.ai.b.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.persona.e
                            public final void a(JSONObject jSONObject2) {
                                Object[] objArr5 = {jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "be7123d659e3e41bf789af2d66196e92", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "be7123d659e3e41bf789af2d66196e92");
                                    return;
                                }
                                b.a(a3);
                                if ((aVar2 != null) && b.a(a3, jSONObject2)) {
                                    C0799b c0799b = a3.c;
                                    if (c0799b != null) {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = C0799b.a;
                                        if (PatchProxy.isSupport(objArr6, c0799b, changeQuickRedirect6, false, "5ef733364d406afc07a04946bca789e5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, c0799b, changeQuickRedirect6, false, "5ef733364d406afc07a04946bca789e5");
                                        } else if (g.a().b()) {
                                            c0799b.g = c0799b.f + g.a().b;
                                        } else {
                                            c0799b.g = c0799b.f + f.a().b;
                                        }
                                        c0799b.i = jSONObject2;
                                    }
                                    aVar2.a();
                                    com.sankuai.waimai.ai.uat.b a4 = com.sankuai.waimai.ai.uat.b.a();
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.ai.uat.b.a;
                                    if (PatchProxy.isSupport(objArr7, a4, changeQuickRedirect7, false, "3d7282612969551420b2ef6e1620ee6f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, a4, changeQuickRedirect7, false, "3d7282612969551420b2ef6e1620ee6f");
                                    } else {
                                        com.sankuai.waimai.ai.uat.feature.b.b().b = null;
                                    }
                                }
                            }

                            @Override // com.sankuai.waimai.alita.persona.e
                            public final void a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ded578091aeb297ec4f30b8f45af52cb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ded578091aeb297ec4f30b8f45af52cb");
                                    return;
                                }
                                b.a(a3);
                                com.sankuai.waimai.business.page.common.list.ai.e eVar2 = a3.d;
                                String jSONObject2 = f.a().d.toString();
                                Object[] objArr6 = {jSONObject2, SilentRefreshHelper.PageSource.KING_KONG_POI_LIST};
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.common.list.ai.e.a;
                                if (PatchProxy.isSupport(objArr6, eVar2, changeQuickRedirect6, false, "6a9a845f89afc51f01b1c1b389044f0d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, eVar2, changeQuickRedirect6, false, "6a9a845f89afc51f01b1c1b389044f0d");
                                    return;
                                }
                                a.AbstractC1040a c2 = new com.sankuai.waimai.business.page.common.list.ai.d().a(com.sankuai.waimai.business.page.common.list.ai.e.b).b(com.sankuai.waimai.business.page.common.list.ai.e.d).c("persona onError");
                                i.d(c2.d("page : " + SilentRefreshHelper.PageSource.KING_KONG_POI_LIST + ",ABStrategy info : " + jSONObject2).a(true).b());
                            }
                        });
                    }
                }
                if (!aVar.x) {
                    com.sankuai.waimai.business.page.kingkong.future.mach.c.b.clear();
                    aVar.R();
                }
                aVar.F().k.a((j<Boolean>) Boolean.TRUE);
                aVar.x = false;
            }
        }
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.message.b.a().a(this.j);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6f1a3e2b3cfb2a28112963dfcc4436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6f1a3e2b3cfb2a28112963dfcc4436");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.g != null) {
            a aVar = this.g;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = a.r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0d333b38207bbd218d592484963089a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0d333b38207bbd218d592484963089a8");
            } else if (i == 1203) {
                if (!com.sankuai.waimai.foundation.location.utils.c.a(aVar.F().a()).equals(c.a.OPEN)) {
                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("2").b());
                } else {
                    aVar.t.b = true;
                    aVar.t.a(aVar.F().r);
                    i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("1").b());
                }
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.sankuai.waimai.rocks.page.RocksPageFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bf4e122dc28872f31520f9340087cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bf4e122dc28872f31520f9340087cb");
            return;
        }
        super.onPause();
        if (this.g != null) {
            a aVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f6830ffdecfcb185df366e71a93a7f2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f6830ffdecfcb185df366e71a93a7f2d");
            } else {
                aVar.O();
            }
        }
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            return;
        }
        if (this.j != null && this.j.b != null) {
            this.j.b.dismiss();
        }
        com.sankuai.waimai.touchmatrix.rebuild.message.b.a().a((com.sankuai.waimai.touchmatrix.show.f) null);
    }

    @Override // com.sankuai.waimai.rocks.page.RocksPageFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c6314ba3022f709c577327c59ad1d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c6314ba3022f709c577327c59ad1d0");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.business.page.kingkong.future.ai.b.a().b();
        if (this.g != null) {
            a aVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1677411379753cc4ff41721926d1f480", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1677411379753cc4ff41721926d1f480");
                return;
            }
            com.sankuai.waimai.business.page.kingkong.utils.b bVar = aVar.t;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.utils.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "b69613940b08e56b1f967b598c751555", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "b69613940b08e56b1f967b598c751555");
            } else {
                com.sankuai.waimai.foundation.location.v2.g.a().b((com.sankuai.waimai.foundation.location.v2.listener.a) bVar, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
                com.sankuai.waimai.foundation.location.v2.g.a().b((com.sankuai.waimai.foundation.location.v2.listener.c) bVar, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
                bVar.c = false;
            }
            aVar.P();
            aVar.N();
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690f8556cf2d02b30a81d798efdd94ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690f8556cf2d02b30a81d798efdd94ba");
        }
        if (this.b != null) {
            return this.b.R.a().b;
        }
        return null;
    }
}
