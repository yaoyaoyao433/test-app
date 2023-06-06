package com.sankuai.waimai.business.page.home.list.future.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.model.d;
import com.sankuai.waimai.business.page.home.list.future.modulelistheader.PersonalizedBean;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.FilterConditionBean;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    public RocksServerModel b;
    @SerializedName("page")
    public b c;
    public com.sankuai.waimai.rocks.model.a d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public boolean k;
    public c l;
    public boolean m;
    private com.sankuai.waimai.platform.widget.filterbar.implement.converter.a n;
    private List<b.a.C1086a> o;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b96ae5567d7b715f3e2a38fdc5c1ec95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b96ae5567d7b715f3e2a38fdc5c1ec95");
        } else {
            this.n = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
        }
    }

    public static a a(RocksServerModel rocksServerModel) {
        a aVar;
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54f5971630e315101f8a744a7959dcfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54f5971630e315101f8a744a7959dcfe");
        }
        if (rocksServerModel == null) {
            return null;
        }
        String str = "";
        if (rocksServerModel.dataType == 0) {
            Map<String, Object> map = rocksServerModel.jsonData;
            if (map != null) {
                str = k.a().toJson(map);
            }
        } else {
            str = rocksServerModel.stringData;
        }
        if (TextUtils.isEmpty(str)) {
            aVar = new a();
        } else {
            try {
                aVar = (a) k.a().fromJson(str, (Class<Object>) a.class);
            } catch (Exception unused) {
                aVar = new a();
            }
        }
        if (aVar.c != null) {
            aVar.i = aVar.c.b;
            aVar.j = aVar.c.c;
            aVar.l = a(aVar.c.d);
        }
        aVar.b = rocksServerModel;
        aVar.k = true ^ com.sankuai.waimai.modular.utils.a.a(rocksServerModel.moduleList);
        aVar.e = rocksServerModel.moduleId;
        aVar.f = rocksServerModel.layoutType;
        aVar.g = rocksServerModel.viewType;
        aVar.h = rocksServerModel.renderMode;
        aVar.m = rocksServerModel.isCache;
        if (!TextUtils.isEmpty(rocksServerModel.layoutInfo)) {
            aVar.d = new com.sankuai.waimai.rocks.model.a(rocksServerModel.layoutInfo);
        }
        return aVar;
    }

    private static c a(List<d> list) {
        d.a aVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a19d87776778d5e796f921f20494ca37", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a19d87776778d5e796f921f20494ca37");
        }
        c cVar = new c();
        if (list != null && list.size() > 0) {
            for (d dVar : list) {
                if (dVar != null && TextUtils.equals(dVar.d, "waimai_mainpage_spfeeds_group1") && (aVar = dVar.f) != null) {
                    try {
                        cVar.b = Integer.valueOf(aVar.a).intValue();
                        cVar.a = TextUtils.equals(aVar.b, "1");
                        cVar.c = Boolean.parseBoolean(aVar.c);
                        return cVar;
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        cVar.b = -1;
        cVar.a = false;
        cVar.c = false;
        return cVar;
    }

    public final PersonalizedBean a() {
        RocksServerModel rocksServerModel;
        List<RocksServerModel> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5c838bc8469905a91a68db2164861a", RobustBitConfig.DEFAULT_VALUE)) {
            return (PersonalizedBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5c838bc8469905a91a68db2164861a");
        }
        try {
            if (this.b != null && (rocksServerModel = this.b.module_list_header) != null && (list = rocksServerModel.moduleList) != null && list.size() > 0) {
                for (RocksServerModel rocksServerModel2 : list) {
                    if (rocksServerModel2 != null && TextUtils.equals(rocksServerModel2.templateId, "waimai_native_homepage_personalized_tips") && !TextUtils.isEmpty(rocksServerModel2.stringData)) {
                        return (PersonalizedBean) new Gson().fromJson(rocksServerModel2.stringData, (Class<Object>) PersonalizedBean.class);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final List<b.a.C1086a> b() {
        JSONObject jSONObject;
        FilterConditionBean.FilterGroup fromJson;
        List<RocksServerModel> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efedca4d1655ebb4d497733004e39e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efedca4d1655ebb4d497733004e39e0");
        }
        try {
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
        }
        if (this.o != null) {
            return this.o;
        }
        if (this.b == null) {
            return null;
        }
        RocksServerModel rocksServerModel = this.b.module_list_header;
        if (rocksServerModel == null || (list = rocksServerModel.moduleList) == null || list.size() <= 0) {
            jSONObject = null;
        } else {
            jSONObject = null;
            for (RocksServerModel rocksServerModel2 : list) {
                if (rocksServerModel2 != null && TextUtils.equals(rocksServerModel2.templateId, "dsl_key_fast_activity_filter_groups") && !TextUtils.isEmpty(rocksServerModel2.stringData)) {
                    jSONObject = new JSONObject(rocksServerModel2.stringData);
                }
            }
        }
        if (jSONObject == null || (fromJson = FilterConditionBean.FilterGroup.fromJson(jSONObject.optJSONObject("fast_activity_filter_groups"))) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b.a a2 = this.n.a(fromJson);
        if (a2 != null && a2.c != null && !a2.c.isEmpty()) {
            for (b.a.C1086a c1086a : a2.c) {
                if (!TextUtils.isEmpty(c1086a.b) && !TextUtils.isEmpty(c1086a.a)) {
                    arrayList.add(c1086a);
                }
            }
            if (arrayList.size() > 3) {
                this.o = arrayList;
            }
            return this.o;
        }
        return null;
    }
}
