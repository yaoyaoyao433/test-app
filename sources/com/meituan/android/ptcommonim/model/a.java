package com.meituan.android.ptcommonim.model;

import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<Integer, MachInfo> b = new HashMap();

    static {
        MachInfo machInfo = new MachInfo();
        machInfo.biz = "platform";
        machInfo.moduleId = "mmbb";
        machInfo.machId = "pt-im-order-card";
        b.put(Integer.valueOf(c.f), machInfo);
        MachInfo machInfo2 = new MachInfo();
        machInfo2.biz = "platform";
        machInfo2.moduleId = "mmbb";
        machInfo2.machId = "pt-im-product-card";
        b.put(Integer.valueOf(c.d), machInfo2);
        b.put(Integer.valueOf(c.a), machInfo2);
        MachInfo machInfo3 = new MachInfo();
        machInfo3.biz = "platform";
        machInfo3.moduleId = "mmbb";
        machInfo3.machId = "pt-smart-kf-card";
        b.put(Integer.valueOf(c.g), machInfo3);
        b.put(Integer.valueOf(c.h), machInfo3);
        MachInfo machInfo4 = new MachInfo();
        machInfo4.biz = "platform";
        machInfo4.moduleId = "mmbb";
        machInfo4.machId = "pt-im-coupon-card";
        b.put(Integer.valueOf(c.e), machInfo4);
        MachInfo machInfo5 = new MachInfo();
        machInfo5.biz = "platform";
        machInfo5.moduleId = "mmbb";
        machInfo5.machId = "pt-im-check-order-card";
        b.put(Integer.valueOf(c.c), machInfo5);
        MachInfo machInfo6 = new MachInfo();
        machInfo6.biz = "platform";
        machInfo6.moduleId = "mmbb";
        machInfo6.machId = "pt-im-modify-address-card";
        b.put(Integer.valueOf(c.b), machInfo6);
        MachInfo machInfo7 = new MachInfo();
        machInfo7.biz = "platform";
        machInfo7.moduleId = "mmbb";
        machInfo7.machId = "pt-im-enter-group-card";
        b.put(Integer.valueOf(c.i), machInfo7);
        MachInfo machInfo8 = new MachInfo();
        machInfo8.biz = "mtmall";
        machInfo8.moduleId = "im-general-card";
        machInfo8.machId = "thh-user-center-im-general-card";
        b.put(Integer.valueOf(c.j), machInfo8);
    }

    public static MachInfo a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cc9bba65e8d6f74a546e77e2f81cd46", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cc9bba65e8d6f74a546e77e2f81cd46");
        }
        if (generalMessage != null) {
            return b.get(Integer.valueOf(generalMessage.getType()));
        }
        return null;
    }
}
