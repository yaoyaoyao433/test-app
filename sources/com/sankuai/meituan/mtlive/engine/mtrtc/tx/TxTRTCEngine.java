package com.sankuai.meituan.mtlive.engine.mtrtc.tx;

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
public class TxTRTCEngine extends a {
    public static ChangeQuickRedirect f;
    private Context g;
    private i h;
    private String[] i;

    public TxTRTCEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f135dc6f82b939ea535455eb26fe80b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f135dc6f82b939ea535455eb26fe80b");
        } else {
            this.i = new String[]{"traeimp-rtmp", "txffmpeg", "txsdl", "txplayer", "liteavsdk"};
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a, com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public final void a(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58d6fe7258fe0a75dfa3bd3682870ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58d6fe7258fe0a75dfa3bd3682870ed");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620f533b82c232af33c0e4a9c714ac7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620f533b82c232af33c0e4a9c714ac7f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58ac27b64b4ae3af099bb701057687b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58ac27b64b4ae3af099bb701057687b6");
        } else if (this.h != null && i.a(this.h.b) && TextUtils.isEmpty(TXLiveBase.getInstance().getLicenceInfo(this.g))) {
            TXLiveBase.getInstance().setLicence(this.g, this.h.b.a(), this.h.b.b());
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a
    public final String[] c() {
        return this.i;
    }
}
