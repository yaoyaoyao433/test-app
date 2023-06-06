package com.sankuai.waimai.rocks.node;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public List<a> k;

    public a(RocksServerModel rocksServerModel) {
        super(rocksServerModel);
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666086da54bf9cde0c8d56f01241b1e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666086da54bf9cde0c8d56f01241b1e4");
            return;
        }
        this.b = rocksServerModel.layoutSlot;
        this.c = rocksServerModel.templateId;
        this.d = rocksServerModel.templatePhId;
        this.e = rocksServerModel.dataId;
        this.f = rocksServerModel.lxViewInfo;
        this.g = rocksServerModel.lxClickInfo;
        this.h = rocksServerModel.adViewInfo;
        this.i = rocksServerModel.adClickInfo;
        this.j = rocksServerModel.action;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65bcec4211b59bb5b9d0d7b540416ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65bcec4211b59bb5b9d0d7b540416ba");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.n) ? "" : this.n);
        sb.append(TextUtils.isEmpty(this.e) ? "" : this.e);
        return sb.toString();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f761003b2d7e4d4e88a7e471bfd2e44c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f761003b2d7e4d4e88a7e471bfd2e44c")).booleanValue() : (this.k == null || this.k.isEmpty()) ? false : true;
    }
}
