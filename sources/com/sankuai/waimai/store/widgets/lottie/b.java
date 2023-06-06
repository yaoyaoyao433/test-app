package com.sankuai.waimai.store.widgets.lottie;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.j;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final String b;

    public b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c23f7a095fb032f846dcd0ad93fd4a80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c23f7a095fb032f846dcd0ad93fd4a80");
        } else {
            this.b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        int lastIndexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff26b3dd94e1c650810cb47049f5ff6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff26b3dd94e1c650810cb47049f5ff6");
        }
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf("/")) >= 0 && lastIndexOf < str.length()) {
            return this.b + str.substring(lastIndexOf);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026997a1b72b9d97d5f3cce0ff4751dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026997a1b72b9d97d5f3cce0ff4751dc")).booleanValue();
        }
        try {
            if (j.a(new File(str).getParent())) {
                File file = new File(str);
                if (!file.exists()) {
                    if (!file.createNewFile()) {
                        z = false;
                    }
                }
                return z;
            }
            return false;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return false;
        }
    }
}
