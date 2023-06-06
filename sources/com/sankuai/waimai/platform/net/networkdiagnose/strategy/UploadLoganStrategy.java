package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UploadLoganStrategy extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "Logan";
    }

    public UploadLoganStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b64a9a8f8217066a99d0d9c5628b6dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b64a9a8f8217066a99d0d9c5628b6dd");
        }
    }

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public void onDiagnose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a240b835ae25f3212fceb7a32e7ae40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a240b835ae25f3212fceb7a32e7ae40");
        } else if (p.d(this.context)) {
            c.a(new String[]{new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date())}, com.sankuai.waimai.platform.b.A().c(), "waimai");
            publishResult("logan-log-upload", "ok");
        } else {
            publishResult("logan-log-upload", "no-wifi");
        }
    }
}
