package com.meituan.android.common.aidata.feature.persona;

import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UserProxy extends User {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long id;
    public final String token;
    public final String username;

    public UserProxy(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3272e0264a70104a86583a066177703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3272e0264a70104a86583a066177703");
            return;
        }
        if (user == null) {
            user = new User();
            user.id = -1L;
            user.token = "";
            user.username = "";
        }
        this.id = user.id;
        this.username = user.username;
        this.token = user.token;
    }

    @Override // com.meituan.passport.pojo.User
    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8e98111461440cc178ea6f31f5b4e23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8e98111461440cc178ea6f31f5b4e23")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            UserProxy userProxy = (UserProxy) obj;
            return this.id == userProxy.id && Objects.equals(this.token, userProxy.token);
        }
        return false;
    }

    @Override // com.meituan.passport.pojo.User
    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75516175574668b4683bb812f1f5acde", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75516175574668b4683bb812f1f5acde")).intValue() : Objects.hash(Long.valueOf(this.id), this.token);
    }

    @Override // com.meituan.passport.pojo.User
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d4a1d8c8bc97627ee266e487f1e5c90", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d4a1d8c8bc97627ee266e487f1e5c90");
        }
        return this.username;
    }
}
