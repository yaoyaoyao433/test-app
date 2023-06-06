package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class YodaResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Object> data;
    public YodaError error;
    public int status;

    public <T> T getValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75ff8af91fba3fdf0914e9802695c233", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75ff8af91fba3fdf0914e9802695c233");
        }
        if (this.data != null) {
            return (T) this.data.get(str);
        }
        return null;
    }
}
