package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PingDomainStrategy extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String[] domains;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "检查主流域名是否可以访问";
    }

    public PingDomainStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12614e5e19200fae67a1daffb67280bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12614e5e19200fae67a1daffb67280bf");
        } else {
            this.domains = new String[]{"www.taobao.com", "www.baidu.com", "www.qq.com", "www.meituan.com"};
        }
    }

    public PingDomainStrategy(Context context, com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a1ae9bd44195121af6a7bfed168327c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a1ae9bd44195121af6a7bfed168327c");
        } else {
            this.domains = new String[]{"www.taobao.com", "www.baidu.com", "www.qq.com", "www.meituan.com"};
        }
    }

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public void onDiagnose() {
        String[] strArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75990c3448c1d9ca080f116e0b99abb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75990c3448c1d9ca080f116e0b99abb2");
            return;
        }
        for (String str : this.domains) {
            publishResult("ping-" + str, com.sankuai.waimai.platform.net.networkdiagnose.util.b.a(str));
        }
    }
}
