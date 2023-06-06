package com.sankuai.waimai.business.im.delegate;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    private List<a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "212477ee51d082523a068f246922f965", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "212477ee51d082523a068f246922f965");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.business.im.delegate.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8596280ef12e872d2c090e95368b056c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8596280ef12e872d2c090e95368b056c");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.delegate.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f07ed26b011684f77b18773de759cec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f07ed26b011684f77b18773de759cec");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.delegate.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f4eeb0af637daf20615d4890b99507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f4eeb0af637daf20615d4890b99507");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.c();
                }
            }
        }
    }

    public final void a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97bf4c85a57fa9a598f99464f246b1c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97bf4c85a57fa9a598f99464f246b1c6");
        } else if (this.b == null || this.b.contains(aVar)) {
        } else {
            this.b.add(aVar);
        }
    }
}
