package com.meituan.android.paycommon.lib.abtest;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class CommonABTestManager {
    public static ChangeQuickRedirect a = null;
    private static String b = "default";
    private static String c;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2f3f0124d0f7c074f9fee49aee95ab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2f3f0124d0f7c074f9fee49aee95ab4");
            return;
        }
        AbTestGroup abTestGroup = (AbTestGroup) n.a().fromJson(str, (Class<Object>) AbTestGroup.class);
        if (abTestGroup != null && !TextUtils.isEmpty(abTestGroup.getRetainWindowType())) {
            b = abTestGroup.getRetainWindowType();
        } else {
            b = "default";
        }
        if (abTestGroup != null) {
            c = abTestGroup.getMtrectAbtestGrp();
        } else {
            c = "1";
        }
    }

    public static String a() {
        return b;
    }

    /* compiled from: ProGuard */
    @JsonBean
    /* loaded from: classes.dex */
    static class AbTestGroup implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -6862050234917279705L;
        @SerializedName("mtrect_abtest_grp")
        private String mtrectAbtestGrp;
        @SerializedName("retain_abtest_grp")
        private String retainWindowType;

        public String getMtrectAbtestGrp() {
            return this.mtrectAbtestGrp;
        }

        public void setMtrectAbtestGrp(String str) {
            this.mtrectAbtestGrp = str;
        }

        public String getRetainWindowType() {
            return this.retainWindowType;
        }

        public void setRetainWindowType(String str) {
            this.retainWindowType = str;
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7613e2191716b8e3d75009d4be45fc07", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7613e2191716b8e3d75009d4be45fc07")).booleanValue() : TextUtils.equals("7", c);
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e02525fa4ef57c08a5df44890e93727f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e02525fa4ef57c08a5df44890e93727f")).booleanValue() : TextUtils.equals("6", c) || TextUtils.equals("7", c);
    }
}
