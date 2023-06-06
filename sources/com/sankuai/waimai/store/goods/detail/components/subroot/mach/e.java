package com.sankuai.waimai.store.goods.detail.components.subroot.mach;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.mach.videoextend.VideoTagProcessor;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends a<BaseModuleDesc> implements com.sankuai.waimai.store.mach.event.a, a.InterfaceC1221a {
    public static ChangeQuickRedirect g;
    com.sankuai.waimai.store.mach.event.b h;
    com.sankuai.waimai.mach.recycler.c i;
    private final List<com.sankuai.waimai.store.mach.clickhandler.b> j;
    private d.b k;
    private final com.sankuai.waimai.store.expose.v2.a l;
    private com.sankuai.waimai.platform.mach.videoextend.d m;
    private com.sankuai.waimai.mach.container.d n;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.a
    public final /* bridge */ /* synthetic */ String a(BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        return baseModuleDesc2 == null ? "" : baseModuleDesc2.templateId;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.a
    public final /* synthetic */ void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.c cVar) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {baseModuleDesc2, cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33b8f3f2f697f734b8dc7d6e26d86fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33b8f3f2f697f734b8dc7d6e26d86fc");
            return;
        }
        e.class.getSimpleName();
        new StringBuilder("onSuccessLoadFinish --- templateId == ").append(baseModuleDesc2 == null ? "" : baseModuleDesc2.templateId);
        this.i = cVar;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.a
    public final /* bridge */ /* synthetic */ Map b(BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        if (baseModuleDesc2 == null) {
            return null;
        }
        return baseModuleDesc2.jsonData;
    }

    public e(@NonNull @NotNull com.sankuai.waimai.store.expose.v2.a aVar, String str, String str2, String str3, Map<String, Object> map, com.sankuai.waimai.mach.recycler.b bVar) {
        super((BaseActivity) aVar.bB_(), str, str2, str3, map, bVar);
        Object[] objArr = {aVar, str, str2, str3, map, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe7f4ff333eb584f0aef1a9c74378ecc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe7f4ff333eb584f0aef1a9c74378ecc");
            return;
        }
        this.j = new LinkedList();
        this.k = new d.b();
        this.n = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63a71ffff6d0945e6809052a86a0df06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63a71ffff6d0945e6809052a86a0df06");
                } else {
                    super.f();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "136ccf185f9061eed21bb88d21d20269", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "136ccf185f9061eed21bb88d21d20269");
                } else {
                    super.b();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1f1f2a4d889e8e008356a70a405fafe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1f1f2a4d889e8e008356a70a405fafe");
                } else {
                    super.a();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0823645c2b8cc821d9b1f48e8bea16ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0823645c2b8cc821d9b1f48e8bea16ba");
                } else {
                    super.d();
                }
            }
        };
        this.l = aVar;
        this.m = new com.sankuai.waimai.platform.mach.videoextend.d();
        a(this.n);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.a
    public final void a(@NonNull @NotNull String str, @Nullable @org.jetbrains.annotations.Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cde554a7bb63931d27aeb25181d85c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cde554a7bb63931d27aeb25181d85c2");
            return;
        }
        com.sankuai.waimai.store.mach.event.b a = com.sankuai.waimai.store.mach.event.c.a(str);
        if (a != null) {
            a.a(this, str, map);
        }
        if (this.h != null) {
            this.h.a(this, str, map);
        }
        if ("std_trigger_expose_event".equals(str)) {
            com.sankuai.shangou.stone.util.log.a.a("MachLogicList", "===== 滑动触发曝光。 onExpose", new Object[0]);
            e();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.a
    @NonNull
    @NotNull
    public final Mach.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277088e40aacbbfc4120b394398f1cd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277088e40aacbbfc4120b394398f1cd9");
        }
        com.sankuai.waimai.store.mach.c cVar = new com.sankuai.waimai.store.mach.c(this.c, this.c.w());
        cVar.a(this.j);
        Mach.a a = cVar.a(new com.sankuai.waimai.store.mach.logger.a(this.c, com.sankuai.waimai.store.manager.judas.b.a((Context) this.c)));
        a.a(new VideoTagProcessor(this.m));
        return a;
    }

    public final void a(com.sankuai.waimai.store.mach.clickhandler.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c11d81c51259a8b2f82233a01717b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c11d81c51259a8b2f82233a01717b7");
        } else {
            this.j.add(bVar);
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.a
    public final Activity a() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.mach.event.a
    public final void b(@NonNull @NotNull String str, @Nullable @org.jetbrains.annotations.Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1ccc0bd3771bf6e5473d0339174aa81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1ccc0bd3771bf6e5473d0339174aa81");
        } else if (this.d == null) {
        } else {
            this.d.sendJsEvent(str, map);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370d6db186059addbfe866e3fb589aa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370d6db186059addbfe866e3fb589aa3");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.a("MachLogicList", "onExpose()", new Object[0]);
        if (!f() || this.d == null) {
            return;
        }
        com.sankuai.waimai.mach.node.a rootNode = this.d.getRootNode();
        a(rootNode);
        if (this.k.b != null) {
            this.k.a();
            return;
        }
        if (!com.sankuai.shangou.stone.util.a.b(this.k.d)) {
            for (com.sankuai.waimai.mach.node.a aVar : this.k.d) {
                c(aVar);
                if (aVar.h instanceof com.sankuai.waimai.mach.component.swiper.b) {
                    a(aVar, ((com.sankuai.waimai.mach.component.swiper.b) aVar.h).b);
                }
                if ((aVar.h instanceof com.sankuai.waimai.store.mach.swiper.a) && ((com.sankuai.waimai.store.mach.swiper.a) aVar.h).d == null) {
                    ((com.sankuai.waimai.store.mach.swiper.a) aVar.h).d = this;
                }
            }
        }
        if (!com.sankuai.shangou.stone.util.a.b(this.k.c)) {
            for (com.sankuai.waimai.mach.node.a aVar2 : this.k.c) {
                d(aVar2);
            }
        }
        if (!com.sankuai.shangou.stone.util.a.b(this.k.d) || !com.sankuai.shangou.stone.util.a.b(this.k.c)) {
            this.k.a();
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.b(rootNode, arrayList);
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                if (aVar3 != null) {
                    e(aVar3);
                }
            }
            return;
        }
        this.k.a();
        List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.d.searchNodeWithViewReport();
        if (com.sankuai.waimai.foundation.utils.d.a(searchNodeWithViewReport)) {
            return;
        }
        com.sankuai.shangou.stone.util.log.a.a("MachLogicList", "===== exposeNodes", new Object[0]);
        for (com.sankuai.waimai.mach.node.a aVar4 : searchNodeWithViewReport) {
            if (aVar4 != null) {
                e(aVar4);
            }
        }
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "325d067932b8f7d44a1c60f5603d1a56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "325d067932b8f7d44a1c60f5603d1a56")).booleanValue() : (this.d == null || this.d.getContainer() == null || this.d.getContainer().getVisibility() != 0) ? false : true;
    }

    private void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ceed2f395491da4c0d68f5c5030844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ceed2f395491da4c0d68f5c5030844");
        } else if (aVar != null) {
            b(aVar);
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                if (aVar2 != null) {
                    b(aVar2);
                }
                a(aVar2);
            }
        }
    }

    private void b(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a4f407a617f17880162627f02bb805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a4f407a617f17880162627f02bb805");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.k.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.k.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.k.c.add(aVar);
        }
    }

    private void c(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd229c469b28c39f1ac388dd220ed04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd229c469b28c39f1ac388dd220ed04");
            return;
        }
        if (com.sankuai.waimai.store.mach.a.a(aVar)) {
            e(aVar);
        }
        com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), 0);
        if (aVar2 != null) {
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                e(aVar3);
            }
        }
    }

    private void e(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d321ab4764b27437573ad7987fe537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d321ab4764b27437573ad7987fe537");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            com.sankuai.shangou.stone.util.log.a.a("MachLogicList", "===== triggerExpose", new Object[0]);
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-key")) {
                str = String.valueOf(aVar.h().get("expose-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1acd60c50de4d5380376abc2230e2932", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1acd60c50de4d5380376abc2230e2932");
                        return;
                    }
                    com.sankuai.shangou.stone.util.log.a.a("MachLogicList", "===== setOnExposeListener onExpose", new Object[0]);
                    e.this.d.triggerViewReport(aVar);
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a(this.l, aVar2);
        }
    }

    @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
    public final void d_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260d013d5ac9f576558e2f5e7f0aeb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260d013d5ac9f576558e2f5e7f0aeb5d");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.b("#MachOnChange,curIndex=%d", Integer.valueOf(i));
        if (!f() || this.d == null) {
            return;
        }
        a(b(this.d.getRootNode(), 1), i);
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53805fe7edc1a8905e1e92595345e4ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53805fe7edc1a8905e1e92595345e4ec");
        } else if (aVar != null && i >= 0) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                e(aVar);
            }
            com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), i);
            if (aVar2 == null || aVar2.g() == null || com.sankuai.waimai.store.mach.a.d(aVar2)) {
                return;
            }
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                    e(aVar3);
                }
            }
            com.sankuai.waimai.store.expose.v2.b.a().d(this.l);
        }
    }

    private com.sankuai.waimai.mach.node.a b(com.sankuai.waimai.mach.node.a aVar, int i) {
        boolean b;
        boolean z;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfade85dca909b4d1ea0674b83231f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfade85dca909b4d1ea0674b83231f0");
        }
        if (aVar != null) {
            Object[] objArr2 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55fe27b433c9574bdbf8f7a2b6115c6b", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i) {
                    case 0:
                        b = com.sankuai.waimai.store.mach.a.b(aVar);
                        z = b;
                        break;
                    case 1:
                        b = com.sankuai.waimai.store.mach.a.c(aVar);
                        z = b;
                        break;
                    case 2:
                        b = com.sankuai.waimai.store.mach.a.d(aVar);
                        z = b;
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55fe27b433c9574bdbf8f7a2b6115c6b")).booleanValue();
            }
            if (!z) {
                List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
                com.sankuai.waimai.mach.node.a aVar2 = null;
                if (com.sankuai.shangou.stone.util.a.b(b2)) {
                    return null;
                }
                Iterator<com.sankuai.waimai.mach.node.a> it = b2.iterator();
                while (it.hasNext() && (aVar2 = b(it.next(), i)) == null) {
                }
                return aVar2;
            }
        }
        return aVar;
    }

    private void d(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19599bb5d931beb1c76a7fed23da0b72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19599bb5d931beb1c76a7fed23da0b72");
        } else if (aVar != null && (aVar.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                e(aVar);
            }
            List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) aVar.h).e();
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(e) || com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (Integer num : e) {
                com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b, num.intValue());
                if (aVar2 != null && aVar2.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar2)) {
                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                    com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                            e(aVar3);
                        }
                    }
                }
            }
        }
    }
}
