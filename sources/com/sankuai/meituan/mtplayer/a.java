package com.sankuai.meituan.mtplayer;

import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.g;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.meituan.mtlive.player.library.e;
import com.sankuai.meituan.mtlive.player.library.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9f2fbe23f73b6a9288035852de3a3bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9f2fbe23f73b6a9288035852de3a3bf");
        }
        l lVar = l.TYPE_ANDROID;
        int i = g.b;
        Object[] objArr2 = {0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4c3a96030b348404b5835135856ceda3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4c3a96030b348404b5835135856ceda3")).booleanValue() : e.e().a(0, i)) {
            return l.TYPE_XPLAYER;
        }
        int i2 = g.b;
        Object[] objArr3 = {0, Integer.valueOf(i2), null};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5d917522096497ac7171c5cfa99ff98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5d917522096497ac7171c5cfa99ff98b");
            return lVar;
        }
        e.e().a(0, i2, (k.a) null);
        return lVar;
    }
}
