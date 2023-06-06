package com.meituan.android.common.aidata.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.a;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CatMonitorService extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mUnionId;

    public CatMonitorService(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d9f149cfd0709ec3ca8d5c7d8b4f9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d9f149cfd0709ec3ca8d5c7d8b4f9c");
        } else {
            this.mUnionId = "";
        }
    }

    @Override // com.dianping.monitor.impl.a
    public String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e536ed1dd8ecfdf18a4881873bca04f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e536ed1dd8ecfdf18a4881873bca04f");
        }
        if (TextUtils.isEmpty(this.mUnionId)) {
            this.mUnionId = ConfigManager.getInstance().getUnionId();
        }
        return this.mUnionId == null ? "" : this.mUnionId;
    }
}
