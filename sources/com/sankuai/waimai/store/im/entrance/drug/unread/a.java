package com.sankuai.waimai.store.im.entrance.drug.unread;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d.a, d.InterfaceC0965d {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.im.entrance.drug.unread.I.a b;

    public a(com.sankuai.waimai.store.im.entrance.drug.unread.I.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e9dfcd626499786d5296d1b98f9282", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e9dfcd626499786d5296d1b98f9282");
            return;
        }
        this.b = aVar;
        a();
    }

    @Override // com.sankuai.waimai.imbase.manager.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e9c168ed78c9bfc5cadfed8729b328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e9c168ed78c9bfc5cadfed8729b328");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b97a45fe90a2f70524cf4ab8c64c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b97a45fe90a2f70524cf4ab8c64c04");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d8a9ce27cb6d002e34bee831914b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d8a9ce27cb6d002e34bee831914b4c");
        } else {
            a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ed319d6037effa63603eb81950313a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ed319d6037effa63603eb81950313a");
        } else {
            b.a().a((short) 1024, new d.c() { // from class: com.sankuai.waimai.store.im.entrance.drug.unread.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.c
                public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                    IMMessage iMMessage;
                    int i = 0;
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1755a20c7b17d0d2a10c41ccffbc3cfa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1755a20c7b17d0d2a10c41ccffbc3cfa");
                        return;
                    }
                    if (com.sankuai.shangou.stone.util.a.a((List) list) > 0) {
                        for (com.sankuai.xm.im.session.entry.a aVar : list) {
                            if (aVar != null && (iMMessage = aVar.b) != null) {
                                String extension = iMMessage.getExtension();
                                if (!TextUtils.isEmpty(extension)) {
                                    try {
                                        if (TextUtils.isEmpty(new JSONObject(extension).optString("inquiryId"))) {
                                            i += aVar.d;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    a.this.b.a(i);
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287446d94580b300486fe17527c63ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287446d94580b300486fe17527c63ce6");
        } else {
            b.a().b((short) 1024, this);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b15616358a2c11c5001915c7ed1762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b15616358a2c11c5001915c7ed1762");
        } else {
            b.a().a((short) 1024, (d.InterfaceC0965d) this);
        }
    }
}
