package com.sankuai.waimai.rocks.node;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c {
    public static ChangeQuickRedirect l;
    public String m;
    public String n;
    public String o;
    public String p;
    public com.sankuai.waimai.rocks.model.a q;
    public String r;
    public Map<String, Object> s;

    public c(RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45828c3343e676e1032aeb8d9c0a8aac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45828c3343e676e1032aeb8d9c0a8aac");
            return;
        }
        this.m = rocksServerModel.renderMode;
        this.n = rocksServerModel.moduleId;
        this.o = rocksServerModel.url;
        this.p = rocksServerModel.params;
        if (TextUtils.isEmpty(rocksServerModel.layoutInfo)) {
            this.q = new com.sankuai.waimai.rocks.model.a();
        } else {
            this.q = new com.sankuai.waimai.rocks.model.a(rocksServerModel.layoutInfo);
        }
        if (rocksServerModel.dataType == 0) {
            this.s = rocksServerModel.jsonData;
        } else if (rocksServerModel.dataType == 1) {
            this.r = rocksServerModel.stringData;
        } else {
            this.r = "";
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757ae343d6bacc816c6cb5a87a50ea70", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757ae343d6bacc816c6cb5a87a50ea70")).booleanValue() : ((this.s == null || this.s.isEmpty()) && TextUtils.isEmpty(this.r)) ? false : true;
    }

    public final Map<String, Object> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93be8dc26cd39edc8c5a45279d02e3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93be8dc26cd39edc8c5a45279d02e3f");
        }
        if (this.s != null && !this.s.isEmpty()) {
            return this.s;
        }
        return com.sankuai.waimai.mach.utils.b.a(this.r);
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab8c45b21fb832057fc5787de39a6dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab8c45b21fb832057fc5787de39a6dd");
        }
        if (this.s != null && !this.s.isEmpty()) {
            return com.sankuai.waimai.mach.utils.b.a().toJson(this.s);
        }
        return this.r;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c {
        public String a;
        public List<c> b;

        public a(RocksServerModel rocksServerModel) {
            super(rocksServerModel);
            this.a = rocksServerModel.layoutType;
            this.b = new ArrayList();
        }
    }
}
