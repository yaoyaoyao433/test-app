package com.meituan.android.customerservice.callbase.csmonitor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    private Context b;

    @SuppressLint({"StaticFieldLeak"})
    public b(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c83516c4e478b32b4357c6ed1e8d64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c83516c4e478b32b4357c6ed1e8d64");
        } else {
            this.b = context;
        }
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78dc7d5b43248d555226f19e7d401e49", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78dc7d5b43248d555226f19e7d401e49");
        }
        String uuid = GetUUID.getInstance().getUUID(this.b);
        return TextUtils.isEmpty(uuid) ? "" : uuid;
    }
}
