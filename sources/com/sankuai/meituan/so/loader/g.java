package com.sankuai.meituan.so.loader;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private SharedPreferences b;

    public static g a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61030a7af73d5646330a0dcd7b07f8ac", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61030a7af73d5646330a0dcd7b07f8ac") : new g(context);
    }

    private g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b516f554fd8afb51e2bc28b40e84fab2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b516f554fd8afb51e2bc28b40e84fab2");
        } else {
            this.b = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68fe67d3cdac81e888a6c2d6f7ec5bd4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68fe67d3cdac81e888a6c2d6f7ec5bd4") : this.b == null ? str2 : this.b.getString(str, str2);
    }

    private void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa41f5e5f71e5e196acab2a73a26869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa41f5e5f71e5e196acab2a73a26869");
        } else if (this.b == null) {
        } else {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f379963993c616b6718d748094d36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f379963993c616b6718d748094d36b");
        } else {
            c("so_loader_apk_hash", str);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f8f69d6c885234222be818b383d786b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f8f69d6c885234222be818b383d786b");
        } else {
            c("so_loader_so_dir", str);
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84a1b243314b00815c11e41e984b394", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84a1b243314b00815c11e41e984b394") : a("so_loader_so_dir", "");
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42812a337afee3fc3c9ca8cde907459c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42812a337afee3fc3c9ca8cde907459c");
            return;
        }
        c("so_loader_file_md5_" + str, str2);
    }
}
