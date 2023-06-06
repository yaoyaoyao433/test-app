package com.sankuai.meituan.mtlive.engine.pusher.tx;

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
public class TxPusherEngine extends a {
    public static ChangeQuickRedirect f;
    private Context g;
    private i h;
    private String[] i;

    public TxPusherEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a318f240dac24aa23144a4db081261", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a318f240dac24aa23144a4db081261");
        } else {
            this.i = new String[]{"traeimp-rtmp", "txffmpeg", "txsdl", "txplayer", "liteavsdk"};
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a, com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public final void a(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de431b02a17f3c4a9f31b62e911e8ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de431b02a17f3c4a9f31b62e911e8ee");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba47b4c7f4da9dd960ef2f98921f0ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba47b4c7f4da9dd960ef2f98921f0ff0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67d68010a11656046b0c36b8d198ccfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67d68010a11656046b0c36b8d198ccfa");
        } else if (this.h != null && i.a(this.h.b) && TextUtils.isEmpty(TXLiveBase.getInstance().getLicenceInfo(this.g))) {
            TXLiveBase.getInstance().setLicence(this.g, this.h.b.a(), this.h.b.b());
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a
    public final String[] c() {
        return this.i;
    }
}
