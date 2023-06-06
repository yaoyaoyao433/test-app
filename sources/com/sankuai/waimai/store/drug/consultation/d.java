package com.sankuai.waimai.store.drug.consultation;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements d.a, d.InterfaceC0965d {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.im.entrance.drug.unread.I.a b;
    int c;
    int d;

    public d(com.sankuai.waimai.store.im.entrance.drug.unread.I.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93b339286834a45c3fec47e7653ade2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93b339286834a45c3fec47e7653ade2");
            return;
        }
        this.b = aVar;
        a();
    }

    @Override // com.sankuai.waimai.imbase.manager.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce85095473d29e267d47c02487801d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce85095473d29e267d47c02487801d5e");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2253b2e692b41ed443198f2b1ee70f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2253b2e692b41ed443198f2b1ee70f69");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b9af28dc5bd4f63ebaea6b9b625d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b9af28dc5bd4f63ebaea6b9b625d7d");
        } else {
            a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25bd6f21820738e25d70144a8a0e275e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25bd6f21820738e25d70144a8a0e275e");
            return;
        }
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, new d.c() { // from class: com.sankuai.waimai.store.drug.consultation.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.c
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ede953c6b000b7978076736abe417ae1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ede953c6b000b7978076736abe417ae1");
                    return;
                }
                d.this.c = d.this.a(list, true);
                d.this.b.a(d.a(d.this));
            }
        });
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1052, new d.c() { // from class: com.sankuai.waimai.store.drug.consultation.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.c
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed372ec7027efe0a8692e127bfa6174a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed372ec7027efe0a8692e127bfa6174a");
                    return;
                }
                d.this.d = d.this.a(list, false);
                d.this.b.a(d.a(d.this));
            }
        });
    }

    int a(List<com.sankuai.xm.im.session.entry.a> list, boolean z) {
        IMMessage iMMessage;
        int i = 0;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9176bab0e4bf6d217401c9bc03c1cb73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9176bab0e4bf6d217401c9bc03c1cb73")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((List) list) > 0) {
            for (com.sankuai.xm.im.session.entry.a aVar : list) {
                if (aVar != null && (iMMessage = aVar.b) != null) {
                    String extension = iMMessage.getExtension();
                    if (!TextUtils.isEmpty(extension)) {
                        try {
                            String optString = new JSONObject(extension).optString("inquiryId");
                            if (z && TextUtils.isEmpty(optString)) {
                                i += aVar.d;
                            } else if (!z) {
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

    public static /* synthetic */ int a(d dVar) {
        return dVar.c + dVar.d;
    }
}
