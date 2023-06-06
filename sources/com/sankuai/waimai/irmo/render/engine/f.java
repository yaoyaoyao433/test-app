package com.sankuai.waimai.irmo.render.engine;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends c {
    public static ChangeQuickRedirect a;
    public String b;
    private com.sankuai.waimai.irmo.render.engine.vap.b c;
    private com.sankuai.waimai.irmo.mach.vap.e d;

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void a() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c, com.sankuai.waimai.irmo.render.engine.a
    public final boolean f() {
        return true;
    }

    public f(com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        super(aVar, iVar, fVar);
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5616cd83d13970fcaf2d314a9ebb4b8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5616cd83d13970fcaf2d314a9ebb4b8c");
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833d9fe2250d83d3fee6160e8262762b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833d9fe2250d83d3fee6160e8262762b");
            return;
        }
        com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo stop() " + this, new Object[0]);
        if (this.c != null) {
            com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fc5da73df7a6c380d959589b60097d34", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fc5da73df7a6c380d959589b60097d34");
                return;
            }
            bVar.b.setStarting(false);
            bVar.b.a();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5986a9d2c47ceedaf859cb69add1fb2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5986a9d2c47ceedaf859cb69add1fb2c");
            return;
        }
        com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo start() " + this, new Object[0]);
        if (this.d == null || this.c == null) {
            gVar.a(this.n, false);
        } else if (this.d.a == 0) {
        } else {
            this.c.setPlaySuccessBlock(gVar);
            com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1edd1322d89519ecca5369902847e92e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1edd1322d89519ecca5369902847e92e");
                return;
            }
            com.sankuai.waimai.irmo.render.engine.vap.a aVar = bVar.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.render.engine.vap.a.b;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "00594fcb84e567c153955452ca6c66bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "00594fcb84e567c153955452ca6c66bc");
                return;
            }
            if (aVar.c == null) {
                aVar.e.a(aVar.c != null ? aVar.c.j : null, false);
            }
            if (!TextUtils.isEmpty(aVar.c.p) && new File(aVar.c.p).exists()) {
                aVar.d = true;
                aVar.h();
                com.sankuai.waimai.irmo.utils.d.b("IrmoVapVideoView_Irmo startPlay() 使用预加载资源播放", new Object[0]);
                aVar.e();
            } else if (!TextUtils.isEmpty(aVar.c.m)) {
                aVar.d = false;
                aVar.h();
                String str = aVar.c.m;
                if (aVar.h == null) {
                    aVar.h = new VapAnimLoadManager(str);
                }
                aVar.h.a(aVar);
                aVar.h.a(str);
            } else {
                aVar.g();
                aVar.e.a(aVar.c != null ? aVar.c.j : null, false);
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91ebff8e29e08c6a83a8d9708bfcccf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91ebff8e29e08c6a83a8d9708bfcccf1");
            return;
        }
        com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo pause() " + this, new Object[0]);
        if (this.c != null) {
            com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b2955f4742dc20bf8509e5236c651df0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b2955f4742dc20bf8509e5236c651df0");
                return;
            }
            bVar.b.setStarting(false);
            bVar.b.c();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a205b17612fa3e6fbd017f2ceff0ad48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a205b17612fa3e6fbd017f2ceff0ad48");
            return;
        }
        com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo resume() " + this, new Object[0]);
        if (this.d == null || this.c == null) {
            return;
        }
        com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "aedb5aa56f84628a3398fb3b644c766a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "aedb5aa56f84628a3398fb3b644c766a");
            return;
        }
        bVar.b.setStarting(true);
        bVar.b.d();
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @NonNull
    public final List<? extends View> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe789bd3ca0643627f237de61baf846", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe789bd3ca0643627f237de61baf846");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c);
        return arrayList;
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33bc211e58cb297a953800b38cdb4a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33bc211e58cb297a953800b38cdb4a0");
        } else if (this.c != null) {
            com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d405f3386fcfd21cb56e41addbe0b352", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d405f3386fcfd21cb56e41addbe0b352");
            } else if (bVar.b != null) {
                com.sankuai.waimai.irmo.render.engine.vap.a aVar = bVar.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.render.engine.vap.a.b;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "702f2ed484744f28874021c8afd7d145", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "702f2ed484744f28874021c8afd7d145");
                    return;
                }
                com.sankuai.waimai.irmo.utils.d.b("IrmoVapVideoView_Irmo onActivityResumed   mIsStarting: " + aVar.g + "  this: " + aVar, new Object[0]);
                if (aVar.g) {
                    aVar.d();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85992890a8f2f7afcfe6541007242cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85992890a8f2f7afcfe6541007242cac");
        } else if (this.c != null) {
            com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "674bc12d47c01743bd7ef79c71f6ae0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "674bc12d47c01743bd7ef79c71f6ae0c");
            } else if (bVar.b != null) {
                com.sankuai.waimai.irmo.render.engine.vap.a aVar = bVar.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.render.engine.vap.a.b;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "72a3314240a2b570ea7260bda75a40f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "72a3314240a2b570ea7260bda75a40f6");
                    return;
                }
                com.sankuai.waimai.irmo.utils.d.b("IrmoVapVideoView_Irmo onActivityPaused   mIsStarting: " + aVar.g + "  this: " + aVar, new Object[0]);
                aVar.c();
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ba927fa8be3e69d00d01c079c4c176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ba927fa8be3e69d00d01c079c4c176");
            return;
        }
        com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo release() " + this, new Object[0]);
        if (this.c != null) {
            com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2deb65ac01554981b6d55763a62ed38b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2deb65ac01554981b6d55763a62ed38b");
                return;
            }
            bVar.b.setStarting(false);
            bVar.b.b();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c, com.sankuai.waimai.irmo.render.engine.a
    public final void a(@NonNull IrmoLayerInfo irmoLayerInfo, View view) {
        Object[] objArr = {irmoLayerInfo, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8570bee12ba8448c6641d1a20f337947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8570bee12ba8448c6641d1a20f337947");
            return;
        }
        super.a(irmoLayerInfo, view);
        com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo attachLayer() " + this, new Object[0]);
        if (this.c == null) {
            this.c = new com.sankuai.waimai.irmo.render.engine.vap.b(com.meituan.android.singleton.b.a, "mrn".equals(this.b));
            com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo attachLayer() 创建新的IrmoVapVideoViewGroup 及IrmoVapVideoView " + this, new Object[0]);
        }
        this.d = new com.sankuai.waimai.irmo.mach.vap.e(irmoLayerInfo);
        if (this.l != null && this.l.d != null) {
            Object obj = this.l.d.get("vap-play-count");
            if (obj instanceof String) {
                try {
                    this.d.a = Integer.parseInt((String) obj);
                    com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo attachLayer() 使用Mach 扩展参数更新播放次数 : " + this.d.a + StringUtil.SPACE + this, new Object[0]);
                } catch (NumberFormatException unused) {
                }
            }
            if (this.l.d.containsKey("vap-keep-last-frame")) {
                try {
                    this.d.f = !((Boolean) this.l.d.get("vap-keep-last-frame")).booleanValue();
                    StringBuilder sb = new StringBuilder("IrmoVideoEngine_Irmo attachLayer() 使用Mach 扩展参数更新展示最后一帧 : ");
                    sb.append(!this.d.f);
                    sb.append(StringUtil.SPACE);
                    sb.append(this);
                    com.sankuai.waimai.irmo.utils.d.b(sb.toString(), new Object[0]);
                } catch (Exception unused2) {
                }
            }
            if (this.l.d.containsKey("vap-volume-control-visible")) {
                try {
                    boolean booleanValue = ((Boolean) this.l.d.get("vap-volume-control-visible")).booleanValue();
                    this.d.g = booleanValue ? 1 : 0;
                    com.sankuai.waimai.irmo.utils.d.b("IrmoVideoEngine_Irmo attachLayer() 使用Mach 扩展参数更新展示音量 : " + booleanValue + StringUtil.SPACE + this, new Object[0]);
                } catch (Exception unused3) {
                }
            }
        }
        com.sankuai.waimai.irmo.render.engine.vap.b bVar = this.c;
        com.sankuai.waimai.irmo.render.a aVar = this.j;
        com.sankuai.waimai.irmo.mach.vap.e eVar = this.d;
        Object[] objArr2 = {aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.render.engine.vap.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ad0b46f732fa99a23448682c4f99fa0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ad0b46f732fa99a23448682c4f99fa0e");
            return;
        }
        com.sankuai.waimai.irmo.render.engine.vap.a aVar2 = bVar.b;
        Object[] objArr3 = {aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.render.engine.vap.a.b;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "0772abe65fee60629f83950ef82ce579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "0772abe65fee60629f83950ef82ce579");
            return;
        }
        aVar2.f = aVar;
        aVar2.c = eVar;
        aVar2.setStarting(false);
    }
}
