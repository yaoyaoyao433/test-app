package com.sankuai.eh.component.web.titans;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.module.c;
import com.sankuai.eh.component.web.module.f;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a extends f {
    public static ChangeQuickRedirect a;

    public a(KNBWebCompat kNBWebCompat, c cVar) {
        super(kNBWebCompat, cVar);
        Object[] objArr = {kNBWebCompat, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2569dbb4e489deb3f81d6253f3f98cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2569dbb4e489deb3f81d6253f3f98cb");
        }
    }

    @Override // com.sankuai.eh.component.web.module.f
    public final OnAnalyzeParamsListener a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ac43dc7efb2fcd0a26911dd5e3e295", RobustBitConfig.DEFAULT_VALUE) ? (OnAnalyzeParamsListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ac43dc7efb2fcd0a26911dd5e3e295") : new C0557a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.web.titans.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0557a implements OnAnalyzeParamsListener {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener
        public final String appendAnalyzeParams(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43269e41c772081b6182d4b4286eeecc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43269e41c772081b6182d4b4286eeecc") : com.sankuai.eh.component.service.a.c().k() != null ? com.sankuai.eh.component.service.a.c().k().a(str) : str;
        }
    }
}
