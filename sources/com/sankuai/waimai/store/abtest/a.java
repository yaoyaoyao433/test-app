package com.sankuai.waimai.store.abtest;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SerializedName("scene_name")
    public String b;
    @SerializedName("model_name")
    public String c;
    @SerializedName("exp_group_name")
    public String d;
    @SerializedName("exp_name")
    public String e;
    @SerializedName("exp_config_name")
    public String f;
    @SerializedName("exp_config_info")
    public String g;
    @SerializedName("is_last")
    public boolean h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54c75fd57db79f06e5211150fb38b51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54c75fd57db79f06e5211150fb38b51");
        } else {
            this.h = false;
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, boolean z) {
        this(str, str2, str3, str4, str5);
        Object[] objArr = {str, str2, str3, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c2e2453d9bdb3b6377de8bc378fdbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c2e2453d9bdb3b6377de8bc378fdbf");
        } else {
            this.h = z;
        }
    }

    private a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d121d8d326182899d99c62ab417033e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d121d8d326182899d99c62ab417033e7");
            return;
        }
        this.h = false;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public a(String str, String str2) {
        this("FRONT", "AB", str, str2, "X");
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b065f541c7f3ba2f76ae864310735973", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b065f541c7f3ba2f76ae864310735973");
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5dc980a10a720a485185cbf31b81e41", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5dc980a10a720a485185cbf31b81e41") : i.a(this);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db6f7f5550cd3b1a5230cadf11d2275", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db6f7f5550cd3b1a5230cadf11d2275")).booleanValue() : "A".equals(this.e);
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c822f58ca7dc50bba43791d95e057a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c822f58ca7dc50bba43791d95e057a2")).booleanValue() : "C".equals(this.e);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d82e95cd7c2a746fd92abfd9bfd9ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d82e95cd7c2a746fd92abfd9bfd9ff")).booleanValue() : ErrorCode.ERROR_TYPE_B.equals(this.e);
    }
}
