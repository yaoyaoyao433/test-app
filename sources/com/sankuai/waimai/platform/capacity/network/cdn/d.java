package com.sankuai.waimai.platform.capacity.network.cdn;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    @SerializedName("enable")
    public boolean b;
    @SerializedName("host_list")
    public ArrayList<b> c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("host")
        public String a;
        @SerializedName("try_count")
        public int b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        @SerializedName("main")
        public a b;
        @SerializedName("standby")
        public a c;
        @SerializedName("source")
        public a d;

        public final int a() {
            if (this.b == null) {
                return 0;
            }
            return this.b.b;
        }

        public final int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5721ce88cbc7928dd966d294048ccf6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5721ce88cbc7928dd966d294048ccf6")).intValue();
            }
            if (this.c == null || TextUtils.isEmpty(this.c.a)) {
                return 0;
            }
            return this.c.b;
        }

        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821f76338fd544d57030d479f823fb9a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821f76338fd544d57030d479f823fb9a")).intValue();
            }
            if (this.d == null || TextUtils.isEmpty(this.d.a)) {
                return 0;
            }
            return this.d.b;
        }
    }
}
