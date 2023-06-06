package com.sankuai.waimai.foundation.core.service.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements IGoodDetailPlayerService {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fb3efc426fb4597293dfac4f4076f8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fb3efc426fb4597293dfac4f4076f8b");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService
    public void setPlayerMuting(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d02606a8b80d05bc79e10b256be5d8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d02606a8b80d05bc79e10b256be5d8f");
            return;
        }
        IGoodDetailPlayerService iGoodDetailPlayerService = (IGoodDetailPlayerService) com.sankuai.waimai.router.a.a(IGoodDetailPlayerService.class, IGoodDetailPlayerService.KEY);
        if (iGoodDetailPlayerService != null) {
            iGoodDetailPlayerService.setPlayerMuting(z);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService
    public boolean isPlayerMuting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201d128d423282ec02aa7d58fb85d859", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201d128d423282ec02aa7d58fb85d859")).booleanValue();
        }
        IGoodDetailPlayerService iGoodDetailPlayerService = (IGoodDetailPlayerService) com.sankuai.waimai.router.a.a(IGoodDetailPlayerService.class, IGoodDetailPlayerService.KEY);
        return iGoodDetailPlayerService == null || iGoodDetailPlayerService.isPlayerMuting();
    }
}
