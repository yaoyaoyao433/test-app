package com.sankuai.waimai.bussiness.order.rocks;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class n extends RocksServerModel {
    public static ChangeQuickRedirect e;
    @SerializedName("global_data")
    public Map<String, Object> f;
    public Map<String, Object> g;
    @SerializedName("page")
    public Map<String, Object> h;

    public final void a(List<RocksServerModel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd19de8a39700521c4a4100967705a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd19de8a39700521c4a4100967705a8");
        } else if (list != null && !list.isEmpty()) {
            for (RocksServerModel rocksServerModel : list) {
                if (TextUtils.isEmpty(rocksServerModel.templateId)) {
                    rocksServerModel.templateId = rocksServerModel.moduleId;
                }
                Map<String, Object> a = a(rocksServerModel);
                if (this.h != null) {
                    a.putAll(this.h);
                }
                if (this.f != null) {
                    a.putAll(this.f);
                }
                if (com.sankuai.waimai.bussiness.order.base.mach.c.b != null && !com.sankuai.waimai.bussiness.order.base.mach.c.b.isEmpty()) {
                    a.put("machState", com.sankuai.waimai.bussiness.order.base.mach.c.b);
                }
                a(rocksServerModel.moduleList);
            }
        }
    }

    private Map<String, Object> a(RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f30d1c9123d1062cbb1b8ea683e610b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f30d1c9123d1062cbb1b8ea683e610b");
        }
        if (rocksServerModel.jsonData == null) {
            rocksServerModel.jsonData = new HashMap();
        }
        return rocksServerModel.jsonData;
    }

    public final boolean e() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7e3bb325b957e12ae20b8e18ff23ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7e3bb325b957e12ae20b8e18ff23ca")).booleanValue();
        }
        try {
            if (this.h == null || (obj = this.h.get("has_next_page")) == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            return Boolean.parseBoolean(sb.toString());
        } catch (Exception unused) {
        }
        return false;
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ced52f44174687408c0891a8350fdc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ced52f44174687408c0891a8350fdc")).booleanValue() : (this.module_list_header == null || this.module_list_header.moduleList == null || this.module_list_header.moduleList.isEmpty()) ? false : true;
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf3fbd1e454c4cdf005ecf0483fcaa8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf3fbd1e454c4cdf005ecf0483fcaa8")).booleanValue() : (this.moduleHeader == null || TextUtils.isEmpty(this.moduleHeader.templateId)) ? false : true;
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabf8cead3059f2a437fa649c1a2be8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabf8cead3059f2a437fa649c1a2be8d");
            return;
        }
        RocksServerModel rocksServerModel = new RocksServerModel();
        rocksServerModel.moduleId = "order_end_area_info";
        rocksServerModel.renderMode = "native";
        rocksServerModel.dataId = "2147483647";
        rocksServerModel.dataType = 0;
        rocksServerModel.viewType = ConfigInfo.MODULE_BLOCK;
        rocksServerModel.templateId = "order_end_area_info";
        rocksServerModel.templatePhId = "order_end_area_info";
        rocksServerModel.jsonData = new HashMap();
        if (this.moduleList == null) {
            this.moduleList = new ArrayList();
        }
        this.moduleList.add(rocksServerModel);
    }
}
