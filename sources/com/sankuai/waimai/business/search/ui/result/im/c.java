package com.sankuai.waimai.business.search.ui.result.im;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements d.a, d.InterfaceC0965d {
    public static ChangeQuickRedirect a;
    d b;
    int c;
    int d;

    public c(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ea7e6fddd399033461cc8fdfa6a58c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ea7e6fddd399033461cc8fdfa6a58c");
            return;
        }
        this.b = dVar;
        a();
    }

    @Override // com.sankuai.waimai.imbase.manager.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98c5effa9b466fdc6eb8be0aba43dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98c5effa9b466fdc6eb8be0aba43dd9");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afad9928f436536a07ce6bed2068b96e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afad9928f436536a07ce6bed2068b96e");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8863b5f9ba4d77536753773ddf060d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8863b5f9ba4d77536753773ddf060d9");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89563900cb9dc7f6655b382be6de2510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89563900cb9dc7f6655b382be6de2510");
            return;
        }
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, new d.c() { // from class: com.sankuai.waimai.business.search.ui.result.im.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.c
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e027979ccc871ecb0aa8149afffe443d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e027979ccc871ecb0aa8149afffe443d");
                    return;
                }
                c.this.c = c.this.a(list, true);
                c.this.b.a(c.a(c.this));
            }
        });
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1052, new d.c() { // from class: com.sankuai.waimai.business.search.ui.result.im.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.c
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86a30644612d7d1d3f9d13a70f5ff9ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86a30644612d7d1d3f9d13a70f5ff9ac");
                    return;
                }
                c.this.d = c.this.a(list, false);
                c.this.b.a(c.a(c.this));
            }
        });
    }

    int a(List<com.sankuai.xm.im.session.entry.a> list, boolean z) {
        IMMessage iMMessage;
        int i = 0;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5714143223d220adc062d0f4ab8f79b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5714143223d220adc062d0f4ab8f79b5")).intValue();
        }
        if (list != null && list.size() > 0) {
            for (com.sankuai.xm.im.session.entry.a aVar : list) {
                if (aVar != null && (iMMessage = aVar.b) != null) {
                    String extension = iMMessage.getExtension();
                    if (!TextUtils.isEmpty(extension)) {
                        try {
                            String optString = new JSONObject(extension).optString("inquiryId");
                            if ((z && TextUtils.isEmpty(optString)) || !z) {
                                i += aVar.d;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int a(c cVar) {
        return cVar.c + cVar.d;
    }
}
