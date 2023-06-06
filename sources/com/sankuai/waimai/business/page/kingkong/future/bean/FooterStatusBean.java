package com.sankuai.waimai.business.page.kingkong.future.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FooterStatusBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int status;
    public String text;

    public FooterStatusBean(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d051c997eaf0717890317759c6ba6443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d051c997eaf0717890317759c6ba6443");
            return;
        }
        this.status = i;
        this.text = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faf241d86d2729e10e3be7cd5a0fe4da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faf241d86d2729e10e3be7cd5a0fe4da");
        }
        return "FooterStatusBean{status=" + this.status + ", text='" + this.text + "'}";
    }
}
