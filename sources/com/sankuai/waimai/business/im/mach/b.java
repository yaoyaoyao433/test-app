package com.sankuai.waimai.business.im.mach;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.j;
import com.sankuai.waimai.business.im.model.q;
import com.sankuai.waimai.business.im.model.r;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.xm.imui.session.SessionActivity;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b extends com.sankuai.waimai.platform.base.b implements com.sankuai.waimai.business.im.delegate.a {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.business.im.mach.a b;
    public j c;
    protected com.sankuai.waimai.business.im.common.contract.a d;
    WMCommonDataInfo.IMDynamicCard e;
    public com.sankuai.waimai.business.im.method.b f;
    public a g;
    private ViewGroup h;
    private d i;
    private String j;
    private String k;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(com.sankuai.waimai.mach.node.a aVar);
    }

    public abstract Map<String, Object> a(j jVar, int i);

    @Override // com.sankuai.waimai.business.im.delegate.a
    public final void a() {
    }

    @Override // com.sankuai.waimai.business.im.delegate.a
    public final void b() {
    }

    @Override // com.sankuai.waimai.business.im.delegate.a
    public final void c() {
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.business.im.mach.a aVar, e eVar, Map map) {
        Object[] objArr = {aVar, eVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "224d24675a02aee4528d4f9c38a50941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "224d24675a02aee4528d4f9c38a50941");
        } else if (eVar != null) {
            if (bVar.d.ak_().get(eVar.j) == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(bVar.k, new r(eVar, aVar, map));
                bVar.d.ak_().put(eVar.j, hashMap);
                return;
            }
            Map map2 = (Map) bVar.d.ak_().get(eVar.j);
            map2.put(bVar.k, new r(eVar, aVar, map));
            bVar.d.ak_().put(eVar.j, map2);
        }
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "91f0b6076eec5ceac7ba813280780fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "91f0b6076eec5ceac7ba813280780fc1");
        } else if (aVar != null) {
            if (bVar.d.h().get(bVar.b.o) == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(bVar.k, new q(aVar.t(), aVar.s()));
                bVar.d.h().put(bVar.b.o, hashMap);
                return;
            }
            Map map = (Map) bVar.d.h().get(bVar.b.o);
            map.put(bVar.k, new q(aVar.t(), aVar.s()));
            bVar.d.h().put(bVar.b.o, map);
        }
    }

    public b(@NonNull @NotNull Context context, com.sankuai.waimai.business.im.common.contract.a aVar, String str) {
        super(context);
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c28d137b0429ca039e7b9a47e5f5b4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c28d137b0429ca039e7b9a47e5f5b4f");
            return;
        }
        this.d = aVar;
        this.f = new com.sankuai.waimai.business.im.method.b(aVar, context);
        this.j = str;
    }

    public final com.sankuai.waimai.business.im.mach.a d() {
        return this.b;
    }

    public final void a(j jVar, String str, String str2, WMCommonDataInfo.IMDynamicCard iMDynamicCard) {
        Object[] objArr = {jVar, str, str2, iMDynamicCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a7c8e910b7543b5383e92d548f144c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a7c8e910b7543b5383e92d548f144c3");
        } else if (aa.a(str)) {
            j();
        } else {
            this.k = str2;
            this.e = iMDynamicCard;
            if (this.d.ak_().get(str) != null) {
                Map map = (Map) this.d.ak_().get(str);
                if (map == null) {
                    a(jVar, (r) null);
                    return;
                } else if (((r) map.get(str2)) == null) {
                    a(jVar, (r) null);
                    return;
                } else {
                    a(jVar, (r) map.get(str2));
                    return;
                }
            }
            a(jVar, (r) null);
        }
    }

    private void a(j jVar, r rVar) {
        Object[] objArr = {jVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934c48a12aa939da332f645c50e045d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934c48a12aa939da332f645c50e045d7");
        } else if (jVar == null || TextUtils.isEmpty(jVar.b) || TextUtils.isEmpty(jVar.c) || this.h == null) {
            j();
        } else {
            this.c = jVar;
            if (this.y instanceof SessionActivity) {
                this.i = new com.sankuai.waimai.business.im.method.a(this.j, AppUtil.generatePageInfoKey(f()));
                if (this.b == null) {
                    this.b = new com.sankuai.waimai.business.im.mach.a((Activity) f(), this.j, this.d);
                    if (this.e == null) {
                        this.b.f = true;
                    }
                } else if (rVar == null) {
                    this.b.af_();
                }
                this.b.a(this.h, String.format("wm_mach_im_%s", jVar.c), "waimai");
                this.b.a(this.i);
                this.b.d = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.business.im.mach.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void a(com.sankuai.waimai.mach.node.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "607b56b51ff6db5164d54caa133c7719", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "607b56b51ff6db5164d54caa133c7719");
                            return;
                        }
                        b.a(b.this, aVar);
                        if (b.this.g != null) {
                            b.this.g.a(aVar);
                        }
                    }
                };
                this.b.e = new com.sankuai.waimai.business.im.method.c() { // from class: com.sankuai.waimai.business.im.mach.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.method.c
                    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                        Object[] objArr2 = {str, map};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e51331e463a434668148a94791b24b32", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e51331e463a434668148a94791b24b32");
                        } else if (TextUtils.equals(str, "std_trigger_expose_event")) {
                            if (b.this.b != null) {
                                b.this.b.b();
                            }
                        } else {
                            b.this.f.a(str, map);
                        }
                    }
                };
            } else {
                j();
            }
            if (rVar == null) {
                a(jVar);
            } else {
                this.b.a(rVar.a, rVar.c);
            }
            i();
        }
    }

    private void a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb98c909a220ad13572a6075c404b0bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb98c909a220ad13572a6075c404b0bc");
        } else if (jVar.e == null) {
            j();
        } else {
            a.C1015a c1015a = new a.C1015a();
            c1015a.c = jVar.b;
            c1015a.b = jVar.b;
            c1015a.d = String.format("wm_mach_im_%s", jVar.c);
            c1015a.e = "waimai";
            com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
            final HashMap hashMap = new HashMap(jVar.e);
            hashMap.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, a(jVar, 0));
            this.d.l();
            this.b.a(a2, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.business.im.mach.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a63ffabaeee36fd45723a2d4fea39884", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a63ffabaeee36fd45723a2d4fea39884");
                        return;
                    }
                    b.this.b.a(eVar, hashMap);
                    b.a(b.this, b.this.b, eVar, hashMap);
                    if (b.this.d == null || b.this.e == null) {
                        return;
                    }
                    b.this.d.ah_();
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27d3b855227ea03ab0d294509598ec66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27d3b855227ea03ab0d294509598ec66");
                        return;
                    }
                    b.this.d.ai_();
                    b.this.j();
                }
            });
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66415a7d5b57c873799b48d26363eafa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66415a7d5b57c873799b48d26363eafa");
            return;
        }
        super.e();
        if (this.d != null) {
            this.d.a(this);
        }
        this.h = (ViewGroup) h().findViewById(R.id.framelayout);
    }
}
