package com.sankuai.waimai.platform.widget.dial.domain.repository;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.dial.domain.model.PrivacyInfo;
import com.sankuai.waimai.platform.widget.dial.domain.repository.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements b {
    public static ChangeQuickRedirect a;
    private Map<String, String> b;

    public abstract void b(String str, List<String> list, String str2, int i, b.a<PrivacyInfo> aVar);

    public abstract void c(String str, List<String> list, String str2, int i, b.a<PrivacyInfo> aVar);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb17aa4c647af7a8a57f0c0af5a13425", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb17aa4c647af7a8a57f0c0af5a13425");
        } else {
            this.b = new HashMap();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b
    public final void a(String str, List<String> list, String str2, int i, final b.a<PrivacyInfo> aVar) {
        Object[] objArr = {str, list, str2, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a70a0fc955ddf909262cfdfa111f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a70a0fc955ddf909262cfdfa111f55");
            return;
        }
        String str3 = this.b.get(str);
        final String str4 = (str3 == null || "".equals(str3)) ? str2 : str3;
        b(str, list, str4, i, new b.a<PrivacyInfo>() { // from class: com.sankuai.waimai.platform.widget.dial.domain.repository.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b.a
            public final /* synthetic */ void a(PrivacyInfo privacyInfo) {
                PrivacyInfo privacyInfo2 = privacyInfo;
                Object[] objArr2 = {privacyInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9129f120808895e022d63e8bee693a56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9129f120808895e022d63e8bee693a56");
                    return;
                }
                if (privacyInfo2 != null && privacyInfo2.data != null && privacyInfo2.data.c == 1 && !TextUtils.isEmpty(str4)) {
                    privacyInfo2.data.b = str4;
                }
                aVar.a((b.a) privacyInfo2);
            }

            @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b.a
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "080135ff6f94db7bd2d88c0793871069", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "080135ff6f94db7bd2d88c0793871069");
                } else {
                    aVar.a(exc);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b
    public final void a(String str, List<String> list, String str2, int i, boolean z, b.a<PrivacyInfo> aVar) {
        Object[] objArr = {str, list, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc17d39de781b2e8b9aeda7262cfdbe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc17d39de781b2e8b9aeda7262cfdbe5");
            return;
        }
        if (str != null && !"".equals(str)) {
            this.b.put(str, str2);
        }
        c(str, list, str2, i, aVar);
    }
}
