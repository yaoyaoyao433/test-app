package com.sankuai.xm.group.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;

    public final <T> void a(Callback<T> callback, T t, int i, String str) {
        Object[] objArr = {callback, null, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352e2938eeb5ea7a085d20903048980d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352e2938eeb5ea7a085d20903048980d");
        } else if (callback == null) {
        } else {
            if (i == 0) {
                callback.onSuccess(null);
            } else {
                callback.onFailure(i, str);
            }
        }
    }
}
