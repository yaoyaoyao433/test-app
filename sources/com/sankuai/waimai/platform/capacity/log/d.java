package com.sankuai.waimai.platform.capacity.log;

import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    public static final String b = com.sankuai.waimai.platform.net.c.b + com.sankuai.waimai.platform.net.util.f.a;
    public static final String c = com.sankuai.waimai.platform.net.c.b + com.sankuai.waimai.platform.net.util.f.a;
    private static volatile d h;
    final String d;
    List<String> e;
    private final int f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("enable")
        public boolean a;
        @SerializedName("api_list")
        public ArrayList<String> b;
        @SerializedName("toast_show_error_code")
        public boolean c;
    }

    public static /* synthetic */ void a(d dVar, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "447821d7678271e9e5c8a4edf950e6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "447821d7678271e9e5c8a4edf950e6ed");
            return;
        }
        if (aVar.a && aVar.b != null) {
            dVar.e = aVar.b;
        }
        if (aVar.a) {
            dVar.g = aVar.c;
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e28a0ce6a87a895bf5b60664102472b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e28a0ce6a87a895bf5b60664102472b4");
        }
        if (h == null) {
            synchronized (d.class) {
                if (h == null) {
                    h = new d();
                }
            }
        }
        return h;
    }

    public d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596dfc2957d34c684ed6521046f2e2cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596dfc2957d34c684ed6521046f2e2cb");
            return;
        }
        try {
            z = com.meituan.android.singleton.b.a.getResources().getBoolean(R.bool.wm_is_mt_flavor);
        } catch (Exception unused) {
        }
        if (z) {
            this.d = c;
        } else {
            this.d = b;
        }
        this.f = this.d.length();
        this.e = new ArrayList();
    }

    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7388440af674a15b92aef4b5dd10801", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7388440af674a15b92aef4b5dd10801")).booleanValue();
        }
        if (this.e.isEmpty() || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.e.contains(str);
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a870d9a9b8076fb40e0e6058a1ff5f0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a870d9a9b8076fb40e0e6058a1ff5f0a");
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(this.d)) {
            return "";
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        String substring = str.substring(this.f, indexOf);
        Matcher matcher = Pattern.compile("^v\\d+", 2).matcher(substring);
        return matcher.lookingAt() ? matcher.replaceFirst("") : substring;
    }
}
