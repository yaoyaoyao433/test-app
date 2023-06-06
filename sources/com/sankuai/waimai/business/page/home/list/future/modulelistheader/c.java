package com.sankuai.waimai.business.page.home.list.future.modulelistheader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.future.tabfeed.FkkTabItem;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bc691b4e58162294ffcf07044a3a217", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bc691b4e58162294ffcf07044a3a217") : super.c();
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3709ece8eee22aff8953c37783f49f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3709ece8eee22aff8953c37783f49f9e");
        } else if (obj instanceof RocksServerModel) {
            RocksServerModel rocksServerModel = (RocksServerModel) obj;
            if (rocksServerModel.module_tab != null) {
                Gson gson = new Gson();
                Type type = new TypeToken<com.sankuai.waimai.business.page.kingkong.future.tabfeed.a>() { // from class: com.sankuai.waimai.business.page.home.list.future.modulelistheader.c.1
                }.getType();
                a aVar = new a();
                com.sankuai.waimai.business.page.kingkong.future.tabfeed.a aVar2 = (com.sankuai.waimai.business.page.kingkong.future.tabfeed.a) gson.fromJson(rocksServerModel.module_tab.stringData, type);
                if (aVar2 != null) {
                    aVar.a = aVar2.b;
                    aVar.b = rocksServerModel;
                }
                super.a((c) aVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public List<FkkTabItem> a;
        public RocksServerModel b;

        public a() {
        }
    }
}
