package com.meituan.android.legwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.sankuai.waimai.imbase.listener.a {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static com.sankuai.waimai.imbase.listener.a a() {
        return b;
    }

    @Override // com.sankuai.waimai.imbase.listener.a
    public final com.sankuai.waimai.imbase.listener.model.a a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc81acb2ae6991c4286e3d6097e41079", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc81acb2ae6991c4286e3d6097e41079") : LegworkIMSdkInitImple.lambda$createReceiveConfig$96(iMMessage, z);
    }
}
