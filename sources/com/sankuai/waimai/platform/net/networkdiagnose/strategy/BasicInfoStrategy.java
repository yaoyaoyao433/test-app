package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BasicInfoStrategy extends a {
    private static final String APP_INFO = "app_info";
    private static final String OS_INFO = "OS_info";
    private static final String PUBLIC_DOMAIN_IP = "public-domain-ip";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "获取基本信息";
    }

    public BasicInfoStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e713758130076898b57501e42311bd20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e713758130076898b57501e42311bd20");
        }
    }

    public BasicInfoStrategy(Context context, com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34e33593a6582c9da2310e265aa4bafa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34e33593a6582c9da2310e265aa4bafa");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0161, code lost:
        if (r1.equals("Unavailable") != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDiagnose() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.networkdiagnose.strategy.BasicInfoStrategy.onDiagnose():void");
    }
}
