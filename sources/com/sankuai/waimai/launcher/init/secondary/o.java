package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.os.Build;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class o extends AbsInit {
    public static ChangeQuickRedirect a = null;
    private static final String b = "o";
    private HornCallback c;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "LottieConfigInit";
    }

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ad7525555b06de35d5734ad65739b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ad7525555b06de35d5734ad65739b3");
        } else {
            this.c = new HornCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.o.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ff17124e9fd111de00c49542d5aab9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ff17124e9fd111de00c49542d5aab9");
                    } else {
                        com.sankuai.waimai.lottie.d.a().a(str, "horn-lottie");
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12ac476a79910068484677c3cc4b315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12ac476a79910068484677c3cc4b315");
        } else {
            super.init(application);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253e4c46a93feb45dbab9b09867b595a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253e4c46a93feb45dbab9b09867b595a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uid", com.sankuai.waimai.platform.b.A().B());
        hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
        hashMap.put("debug", Integer.valueOf(com.sankuai.meituan.takeoutnew.a.a ? 1 : 0));
        hashMap.put("appVersion", com.sankuai.meituan.takeoutnew.a.d);
        try {
            hashMap.put("cityId", com.sankuai.waimai.foundation.location.v2.g.a().m().getCityCode());
        } catch (Exception unused) {
        }
        try {
            hashMap.put("abi", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS[0] : Build.CPU_ABI);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        Horn.register("lottie_file_config", this.c, hashMap);
    }
}
