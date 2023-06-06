package com.meituan.android.mrn.update;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    String a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Map<String, h> b;

        public a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4961bdfe6cb44404dee471041d32d7f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4961bdfe6cb44404dee471041d32d7f");
                return;
            }
            str = str == null ? "" : str;
            Map<String, h> map = this.b;
            q a2 = com.meituan.android.mrn.common.b.a(context);
            this.b = new com.meituan.android.mrn.utils.collection.c(map, context, a2, str + "MRNBundleUpdateInfo", com.meituan.android.mrn.utils.collection.b.c, new com.meituan.android.mrn.utils.collection.b<h>() { // from class: com.meituan.android.mrn.update.h.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.collection.b
                public final /* synthetic */ h a(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd96ab1d81404fbd516f1e7d1684422d", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd96ab1d81404fbd516f1e7d1684422d") : (h) com.meituan.android.mrn.utils.g.a(str2, h.class);
                }

                @Override // com.meituan.android.mrn.utils.collection.b
                public final /* synthetic */ String a(h hVar) {
                    h hVar2 = hVar;
                    Object[] objArr2 = {hVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0748895f368c90cf6374332644455164", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0748895f368c90cf6374332644455164") : com.meituan.android.mrn.utils.g.a(hVar2);
                }
            });
        }

        public static String a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "829adc1dc34da4fdcb8fc8f75cb6cebb", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "829adc1dc34da4fdcb8fc8f75cb6cebb");
            }
            return str + CommonConstant.Symbol.UNDERLINE + str2;
        }

        public final h b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a83e3ba79bde50f6a007f0ff55cab6", RobustBitConfig.DEFAULT_VALUE)) {
                return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a83e3ba79bde50f6a007f0ff55cab6");
            }
            h hVar = this.b.get(a(str, str2));
            return hVar == null ? new h() : hVar;
        }

        public final void a(String str, String str2, h hVar) {
            Object[] objArr = {str, str2, hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5ad8eb6be17264b20dec0a59a85db5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5ad8eb6be17264b20dec0a59a85db5");
            } else {
                this.b.put(a(str, str2), hVar);
            }
        }
    }
}
