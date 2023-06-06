package com.meituan.android.common.statistics.cat;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.a;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class CatMonitorService extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mUnionId;

    public CatMonitorService(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af0eeafefb409e0f7a50e21a39bdb27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af0eeafefb409e0f7a50e21a39bdb27");
        } else {
            this.mUnionId = "";
        }
    }

    @Override // com.dianping.monitor.impl.a
    public String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a8503795c24ab1a154009bd42337f1c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a8503795c24ab1a154009bd42337f1c");
        }
        if (TextUtils.isEmpty(this.mUnionId)) {
            this.mUnionId = Statistics.getUnionId();
        }
        return this.mUnionId == null ? "" : this.mUnionId;
    }
}
