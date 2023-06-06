package com.sankuai.waimai.store.im.poi.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.xm.imui.session.SessionActivity;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.im.delegate.a {
    public static ChangeQuickRedirect a;
    protected a b;
    protected com.sankuai.waimai.store.mach.d c;
    ViewGroup d;
    com.sankuai.waimai.mach.d e;
    protected com.sankuai.waimai.store.im.poi.contract.a f;
    public BaseModuleDesc g;
    SGCommonDataInfo.IMDynamicCard h;
    com.sankuai.waimai.store.expose.v2.a i;
    private com.sankuai.waimai.store.mach.medhod.a j;
    private String k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(com.sankuai.waimai.mach.node.a aVar);

        void a(Map<String, Object> map);

        void a(Map<String, Object> map, com.sankuai.waimai.store.mach.event.a aVar);
    }

    public abstract Map<String, Object> a(BaseModuleDesc baseModuleDesc, int i);

    public abstract Map<String, com.sankuai.waimai.store.mach.event.b> d();

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1a7f0a4dfcd90463b740f0174f05d7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1a7f0a4dfcd90463b740f0174f05d7b6");
        } else if (aVar != null) {
            if (bVar.f.h().get(bVar.c.o) == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(bVar.k, new com.sankuai.waimai.store.im.poi.model.a(aVar.t(), aVar.s()));
                bVar.f.h().put(bVar.c.o, hashMap);
                return;
            }
            Map map = (Map) bVar.f.h().get(bVar.c.o);
            map.put(bVar.k, new com.sankuai.waimai.store.im.poi.model.a(aVar.t(), aVar.s()));
            bVar.f.h().put(bVar.c.o, map);
        }
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.store.mach.d dVar, com.sankuai.waimai.mach.manager.cache.e eVar, Map map) {
        Object[] objArr = {dVar, eVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ee7685e5eb46646ab3ce279e9c0b61e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ee7685e5eb46646ab3ce279e9c0b61e7");
        } else if (eVar != null) {
            if (bVar.f.ak_().get(eVar.j) == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(bVar.k, new com.sankuai.waimai.store.im.poi.model.b(eVar, dVar, map));
                bVar.f.ak_().put(eVar.j, hashMap);
                return;
            }
            Map map2 = (Map) bVar.f.ak_().get(eVar.j);
            map2.put(bVar.k, new com.sankuai.waimai.store.im.poi.model.b(eVar, dVar, map));
            bVar.f.ak_().put(eVar.j, map2);
        }
    }

    public b(@NonNull Context context, String str, com.sankuai.waimai.store.expose.v2.a aVar, com.sankuai.waimai.store.im.poi.contract.a aVar2) {
        super(context);
        Object[] objArr = {context, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644951ebaaf8efff8ac29dd7fddd5d81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644951ebaaf8efff8ac29dd7fddd5d81");
            return;
        }
        this.i = aVar;
        this.f = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89007769dcf85112841be22cb0192d94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89007769dcf85112841be22cb0192d94");
            return;
        }
        super.onViewCreated();
        if (this.f != null) {
            this.f.a(this);
        }
        this.d = (ViewGroup) this.mView.findViewById(R.id.framelayout);
    }

    public final void a(BaseModuleDesc baseModuleDesc, String str, String str2, SGCommonDataInfo.IMDynamicCard iMDynamicCard) {
        Object[] objArr = {baseModuleDesc, str, str2, iMDynamicCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e14686fa3cbf871753fc2a30d9b4140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e14686fa3cbf871753fc2a30d9b4140");
        } else if (t.a(str)) {
            hide();
        } else {
            this.k = str2;
            this.h = iMDynamicCard;
            if (this.f.ak_().get(str) != null) {
                Map map = (Map) this.f.ak_().get(str);
                if (map == null) {
                    a(baseModuleDesc, (com.sankuai.waimai.store.im.poi.model.b) null);
                    return;
                } else if (((com.sankuai.waimai.store.im.poi.model.b) map.get(str2)) == null) {
                    a(baseModuleDesc, (com.sankuai.waimai.store.im.poi.model.b) null);
                    return;
                } else {
                    a(baseModuleDesc, (com.sankuai.waimai.store.im.poi.model.b) map.get(str2));
                    return;
                }
            }
            a(baseModuleDesc, (com.sankuai.waimai.store.im.poi.model.b) null);
        }
    }

    private void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.store.im.poi.model.b bVar) {
        Object[] objArr = {baseModuleDesc, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab8daeef26223c68ce87a65eb7c9b16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab8daeef26223c68ce87a65eb7c9b16");
        } else if (p.a(baseModuleDesc) || TextUtils.isEmpty(baseModuleDesc.templateId) || TextUtils.isEmpty(baseModuleDesc.moduleId) || p.a(this.d)) {
            hide();
        } else {
            this.g = baseModuleDesc;
            if (this.mContext instanceof SessionActivity) {
                String bt_ = this.f.bt_();
                this.e = new com.sankuai.waimai.store.im.base.mach.a(this.f.by_());
                if (this.c == null) {
                    this.c = new com.sankuai.waimai.store.mach.d(this.i, bt_) { // from class: com.sankuai.waimai.store.im.poi.block.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.mach.d
                        public final com.sankuai.waimai.mach.d aZ_() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1040d7ac239378534d0177bab83e7fef", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1040d7ac239378534d0177bab83e7fef") : b.this.e;
                        }
                    };
                }
                this.j = new com.sankuai.waimai.store.mach.medhod.a();
                this.j.a(d());
                this.c.g = this.j;
                this.c.a(this.d, String.format("sm_mach_im_%s", baseModuleDesc.moduleId), "supermarket");
                this.c.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.im.poi.block.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a6ca0d493dbd2905a160c4606f78cd6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a6ca0d493dbd2905a160c4606f78cd6");
                            return;
                        }
                        final b bVar2 = b.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "f340f1ad49af43021911589b9671554a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "f340f1ad49af43021911589b9671554a");
                            return;
                        }
                        try {
                            com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(bVar2.d);
                            aVar.e = String.valueOf(System.currentTimeMillis());
                            aVar.a(new c.a() { // from class: com.sankuai.waimai.store.im.poi.block.b.4
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01c6965cef8bcada355f1fef2b64787b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01c6965cef8bcada355f1fef2b64787b");
                                        return;
                                    }
                                    try {
                                        if (b.this.c != null) {
                                            b.this.c.g();
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                            com.sankuai.waimai.store.expose.v2.b.a().a(bVar2.i, aVar);
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void a(com.sankuai.waimai.mach.node.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e09a368b462f0eb37ed4441858b19d1b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e09a368b462f0eb37ed4441858b19d1b");
                            return;
                        }
                        super.a(aVar);
                        try {
                            b.a(b.this, aVar);
                        } catch (Throwable unused) {
                        }
                        if (b.this.b != null) {
                            b.this.b.a(aVar);
                        }
                    }
                });
                if (bVar == null) {
                    try {
                        a(baseModuleDesc);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.c.a(bVar.a, bVar.c);
                }
                show();
                return;
            }
            hide();
        }
    }

    private void a(@NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d2e34df6cb19ce2fa5e335ddb88107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d2e34df6cb19ce2fa5e335ddb88107");
        } else if (p.a(baseModuleDesc.jsonData)) {
            hide();
        } else {
            a.C1015a c1015a = new a.C1015a();
            c1015a.c = baseModuleDesc.templateId;
            c1015a.b = baseModuleDesc.templateId;
            c1015a.d = String.format("sm_mach_im_%s", baseModuleDesc.moduleId);
            c1015a.e = "supermarket";
            com.sankuai.waimai.mach.manager.load.a a2 = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
            final HashMap hashMap = new HashMap(baseModuleDesc.jsonData);
            hashMap.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, a(baseModuleDesc, 0));
            this.c.a(a2, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.im.poi.block.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4f6448da4f574a0f0895eb9a2203a15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4f6448da4f574a0f0895eb9a2203a15");
                        return;
                    }
                    b.this.c.a(eVar, hashMap);
                    b.a(b.this, b.this.c, eVar, hashMap);
                    if (b.this.f == null || b.this.h.isShowAvatar) {
                        return;
                    }
                    b.this.f.ah_();
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "148b48f6affbc14ec64aeef3d3fee100", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "148b48f6affbc14ec64aeef3d3fee100");
                    } else {
                        b.this.hide();
                    }
                }
            });
        }
    }
}
