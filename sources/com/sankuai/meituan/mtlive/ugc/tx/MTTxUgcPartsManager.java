package com.sankuai.meituan.mtlive.ugc.tx;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ugc.TXUGCPartsManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxUgcPartsManager implements com.sankuai.meituan.mtlive.ugc.library.interfaces.a {
    public static ChangeQuickRedirect a;
    private TXUGCPartsManager b;

    public MTTxUgcPartsManager(TXUGCPartsManager tXUGCPartsManager) {
        Object[] objArr = {tXUGCPartsManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d6dd65eed245d09ede9e3c9b4cfaf58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d6dd65eed245d09ede9e3c9b4cfaf58");
        } else {
            this.b = tXUGCPartsManager;
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9730e10d25c0faaede0a76fb77c2c91", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9730e10d25c0faaede0a76fb77c2c91")).intValue() : this.b.getDuration();
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.a
    public final List<String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c91280f7df471be959a38fd43190427", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c91280f7df471be959a38fd43190427") : this.b.getPartsPathList();
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbfc77bc2767e54d3a86d411f56c7470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbfc77bc2767e54d3a86d411f56c7470");
        } else {
            this.b.deleteLastPart();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b1425be4db5909a446e83dc48a5cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b1425be4db5909a446e83dc48a5cfc");
        } else {
            this.b.deleteAllParts();
        }
    }
}
