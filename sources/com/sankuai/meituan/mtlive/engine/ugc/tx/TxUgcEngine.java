package com.sankuai.meituan.mtlive.engine.ugc.tx;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.a;
import com.sankuai.meituan.mtlive.core.i;
import com.tencent.ugc.TXUGCBase;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TxUgcEngine extends a {
    public static ChangeQuickRedirect f;
    private Context g;
    private i h;
    private String[] i;

    public TxUgcEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73e9bdfc2d9875e342d9873576aba325", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73e9bdfc2d9875e342d9873576aba325");
        } else {
            this.i = new String[]{"traeimp-rtmp", "txffmpeg", "txsdl", "txplayer", "liteavsdk"};
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a, com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public final void a(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8274a53f9cc34a6b871d21264ee5e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8274a53f9cc34a6b871d21264ee5e38");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c17884cd1e7aed8501107183651c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c17884cd1e7aed8501107183651c18");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6ba6236d2ea07c7b2214c9db5fce486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6ba6236d2ea07c7b2214c9db5fce486");
        } else if (this.h != null && i.a(this.h.b()) && TextUtils.isEmpty(TXUGCBase.getInstance().getLicenceInfo(this.g))) {
            TXUGCBase.getInstance().setLicence(this.g, this.h.b().a(), this.h.b().b());
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.a
    public final String[] c() {
        return this.i;
    }
}
