package com.meituan.passport.pojo;

import android.text.TextUtils;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LogoutPath {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public String path;
    public long receiveTime;

    public LogoutPath(long j, String str, int i) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "128ca0de7be9c7a00618365d10a36cde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "128ca0de7be9c7a00618365d10a36cde");
            return;
        }
        this.receiveTime = j;
        this.path = str;
        this.code = i;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c412fcc48a3af32b015eea0acfe75bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c412fcc48a3af32b015eea0acfe75bd")).booleanValue();
        }
        if (obj instanceof LogoutPath) {
            LogoutPath logoutPath = (LogoutPath) obj;
            return TextUtils.equals(this.path, logoutPath.path) && this.code == logoutPath.code;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "917d4a484982ec08f08dc7dd8703f55b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "917d4a484982ec08f08dc7dd8703f55b")).intValue();
        }
        int i = 1;
        Object[] objArr2 = {this.path, Integer.valueOf(this.code)};
        Object[] objArr3 = {objArr2};
        ChangeQuickRedirect changeQuickRedirect3 = Utils.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8139f87d42eca46e8042d4261cb26b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8139f87d42eca46e8042d4261cb26b1e")).intValue();
        }
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr2[i2];
            i = (i * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }
}
