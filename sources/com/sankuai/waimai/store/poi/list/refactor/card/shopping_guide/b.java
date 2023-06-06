package com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.d;
import com.sankuai.waimai.store.poi.list.newp.sg.ChannelNormalMachViewBlock;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.monitor.monitor.SGParseSuccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.poi.list.newp.block.optimization.a<BaseModuleDesc.a> {
    public static ChangeQuickRedirect i;
    private final com.sankuai.waimai.store.poi.list.newp.block.optimization.module.a<BaseModuleDesc> j;
    private a k;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r1.equals("channel_kingkong") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@android.support.annotation.NonNull com.sankuai.waimai.store.param.a r13, @android.support.annotation.NonNull com.sankuai.waimai.store.base.SCBaseActivity r14, @android.support.annotation.NonNull com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide.a r15) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide.b.<init>(com.sankuai.waimai.store.param.a, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide.a):void");
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.optimization.a
    public final void c() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119eba937454741cd587e570e5b2357b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119eba937454741cd587e570e5b2357b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.block.optimization.a.a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "318ae048d856373096a1920fe610845a", RobustBitConfig.DEFAULT_VALUE)) {
            Iterator<com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>>> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> next = it.next();
                if ((next instanceof ChannelNormalMachViewBlock) && ConfigInfo.MODULE_NEW_USER_REGION_V2.equals(next.c())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "318ae048d856373096a1920fe610845a")).booleanValue();
        }
        if (z) {
            this.c.a("", this.b.c, new k<Map<String, Object>>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Map map = (Map) obj;
                    Object[] objArr3 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66ef9e8349a57c26623677f156403ade", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66ef9e8349a57c26623677f156403ade");
                    } else if (com.sankuai.waimai.store.util.b.a(b.this.d)) {
                    } else {
                        com.meituan.android.bus.a.a().c(new d(ConfigInfo.MODULE_NEW_USER_REGION_V2, map));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.optimization.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec16d34b20d94fd96190b181f04e76f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec16d34b20d94fd96190b181f04e76f");
        } else if (TextUtils.equals(this.k.c, "3")) {
            this.j.a("mach", (String) this.k.e);
        } else {
            this.j.a(this.k.a, (String) this.k.e);
        }
    }

    a.C1279a a(BaseModuleDesc.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e56a099755b81e67deb50d6819b2050", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C1279a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e56a099755b81e67deb50d6819b2050");
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.C1279a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e6b290b86dd4bbd64643a7d600ca21d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C1279a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e6b290b86dd4bbd64643a7d600ca21d4");
        }
        if (aVar != null) {
            a.C1279a c1279a = new a.C1279a();
            c1279a.b = aVar.a;
            c1279a.c = aVar.b;
            return c1279a;
        }
        return new a.C1279a();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.optimization.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ba3b615825b678245c3488e03f6c71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ba3b615825b678245c3488e03f6c71");
        } else {
            super.a();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.block.optimization.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada54beda528b1f56c99228277a04fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada54beda528b1f56c99228277a04fce");
        } else {
            super.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb61592cc76660120e831acf683eddda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb61592cc76660120e831acf683eddda");
        } else if (o.j() && !t.a(str) && this.b != null) {
            ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.EXPOSE_TARGET_MODULE, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.shopping_guide.b.3
            }.getType(), new ArrayList());
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Map map = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i2);
                if (map.get("templateID") != null && ((String) map.get("templateID")).equals(str)) {
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGParseSuccess.SGParseSuccess).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.b.c)).a("module_name", str).a("interface_name", this.b.y ? "v1/vision/page/sc-native-home2" : "v1/vision/page/sc-native-channel").a();
                }
            }
        }
    }

    void a(com.sankuai.waimai.store.poi.list.newp.sg.a aVar, BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {aVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e718a70d1c265a10fd1e6fc14f058cd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e718a70d1c265a10fd1e6fc14f058cd4");
        } else if (aVar == null) {
        } else {
            aVar.g = baseModuleDesc;
        }
    }
}
