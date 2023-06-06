package com.sankuai.waimai.business.page.home.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("entranceId")
    public int b;
    @SerializedName("entranceCode")
    public String c;
    @SerializedName("positions")
    public List<b> d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("pic_url")
        public String a;
        @SerializedName("activity_type")
        public int b;
        @SerializedName("common_url")
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        @SerializedName("positionId")
        public int a;
        @SerializedName("positionCode")
        public String b;
        @SerializedName("resources")
        public List<c> c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        @SerializedName("config")
        public a a;
        @SerializedName("resourceId")
        public int b;
        @SerializedName("view_id")
        public String c;
    }

    public final a a() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea556ad476c0ae1f0f7069d9b8db15a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea556ad476c0ae1f0f7069d9b8db15a5");
        }
        if (this.d == null || this.d.size() <= 0 || (bVar = this.d.get(0)) == null || bVar.c == null || bVar.c.size() <= 0) {
            return null;
        }
        return bVar.c.get(0).a;
    }

    public final int b() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6680b409b50e230108c4bbbecc5a401a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6680b409b50e230108c4bbbecc5a401a")).intValue();
        }
        if (this.d == null || this.d.size() <= 0 || (bVar = this.d.get(0)) == null || bVar.c == null || bVar.c.size() <= 0) {
            return -1;
        }
        return bVar.c.get(0).b;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e28a3e126d6b29733d88479b3275d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e28a3e126d6b29733d88479b3275d9")).booleanValue() : (a() == null || TextUtils.isEmpty(a().a) || TextUtils.isEmpty(a().c)) ? false : true;
    }
}
