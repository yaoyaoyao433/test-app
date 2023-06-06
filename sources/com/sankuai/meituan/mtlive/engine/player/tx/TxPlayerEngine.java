package com.sankuai.meituan.mtlive.engine.player.tx;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.a;
import com.sankuai.meituan.mtlive.core.i;
import com.tencent.rtmp.TXLiveBase;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TxPlayerEngine extends a {
    public static ChangeQuickRedirect f;
    private Context g;
    private i h;
    private String[] i;

    public TxPlayerEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fee79796a3896c4ceb7043b9132a891", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fee79796a3896c4ceb7043b9132a891");
        } else {
            this.i = new String[]{"traeimp-rtmp", "txffmpeg", "txsdl", "txplayer", "liteavsdk"};
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a, com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public final void a(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a7df5e47b97096ac9366c1dda5f08f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a7df5e47b97096ac9366c1dda5f08f2");
            return;
        }
        super.a(context, iVar);
        this.g = context.getApplicationContext();
        this.h = iVar;
    }

    @Override // com.sankuai.meituan.mtlive.core.a, com.sankuai.meituan.mtlive.core.h
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71e573167f4065130d2f45867a67818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71e573167f4065130d2f45867a67818");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "980622487421d52dc9947f7f0651a460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "980622487421d52dc9947f7f0651a460");
        } else if (this.h != null && i.a(this.h.a()) && TextUtils.isEmpty(TXLiveBase.getInstance().getLicenceInfo(this.g))) {
            TXLiveBase.getInstance().setLicence(this.g, this.h.a().a(), this.h.a().b());
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a
    public final String[] c() {
        return this.i;
    }
}
