package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.util.f;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CheckDnsStrategy extends a {
    private static final String HOST = f.b;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "Check DNS";
    }

    public CheckDnsStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27f14e46fbd3624f3b2a4cfb6365d928", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27f14e46fbd3624f3b2a4cfb6365d928");
        }
    }

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public void onDiagnose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a71de58e4323810d5ae36ea771ed0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a71de58e4323810d5ae36ea771ed0e6");
            return;
        }
        String[] strArr = {"v.meituan.net", HOST};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                String[] strArr2 = new String[allByName.length];
                for (int i2 = 0; i2 < allByName.length; i2++) {
                    strArr2[i2] = allByName[i2].getHostAddress();
                }
                publishResult("dns-" + str, Arrays.toString(strArr2));
            } catch (UnknownHostException unused) {
                publishResult("dns-" + str, "failed");
            }
        }
    }
}
