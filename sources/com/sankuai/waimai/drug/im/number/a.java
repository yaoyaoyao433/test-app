package com.sankuai.waimai.drug.im.number;

import android.support.annotation.NonNull;
import com.meituan.msi.api.extension.medicine.ChatMessageChangeResponse;
import com.meituan.msi.api.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.base.d;
import com.sankuai.waimai.store.im.number.c;
import com.sankuai.waimai.store.im.number.e;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static final String d = "a";
    private static volatile a e;
    public final List<com.sankuai.waimai.store.im.number.a> b;
    public j<ChatMessageChangeResponse> c;
    private e f;
    private int g;
    private int h;
    private int i;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e089c405a601629f991dd4ed1d74cda", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e089c405a601629f991dd4ed1d74cda");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    a aVar = new a();
                    e = aVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d4e9bd93ea09c9500d360511ab920c41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d4e9bd93ea09c9500d360511ab920c41");
                    } else {
                        aVar.f = new e(d);
                        aVar.f.a(new d<Integer>() { // from class: com.sankuai.waimai.drug.im.number.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.base.d
                            public final /* synthetic */ void a(Integer num) {
                                Integer num2 = num;
                                Object[] objArr3 = {num2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63287c0439e485be90c9425286421019", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63287c0439e485be90c9425286421019");
                                } else if (num2 != null) {
                                    a.this.g = num2.intValue();
                                    a.this.c();
                                    if (a.this.c != null) {
                                        ChatMessageChangeResponse chatMessageChangeResponse = new ChatMessageChangeResponse();
                                        chatMessageChangeResponse.im_chat_unRead_message_count = a.this.g;
                                        chatMessageChangeResponse.business_type = 1;
                                        a.this.c.a(chatMessageChangeResponse);
                                        b.a().a((short) 1024, new d.a() { // from class: com.sankuai.waimai.drug.im.number.a.1.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.imbase.manager.d.a
                                            public final void a(int i) {
                                                Object[] objArr4 = {Integer.valueOf(i)};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2aa6816104c29078810fe0f4460cb747", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2aa6816104c29078810fe0f4460cb747");
                                                    return;
                                                }
                                                ChatMessageChangeResponse chatMessageChangeResponse2 = new ChatMessageChangeResponse();
                                                chatMessageChangeResponse2.im_chat_unRead_message_count = i;
                                                chatMessageChangeResponse2.business_type = 2;
                                                a.this.c.a(chatMessageChangeResponse2);
                                            }
                                        });
                                    }
                                }
                            }
                        });
                        al.a(new Runnable() { // from class: com.sankuai.waimai.drug.im.number.a.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aaf7409faf55ebd267b12ad341c63b42", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aaf7409faf55ebd267b12ad341c63b42");
                                } else {
                                    a.this.b();
                                }
                            }
                        }, 100, d);
                    }
                }
            }
        }
        return e;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86b27797d938addc74f2539eeefa72c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86b27797d938addc74f2539eeefa72c");
            return;
        }
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.b = new LinkedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070249595e868c2565b9bbd4d33eec48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070249595e868c2565b9bbd4d33eec48");
            return;
        }
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            com.sankuai.waimai.store.im.number.a aVar = (com.sankuai.waimai.store.im.number.a) it.next();
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    public void a(@NonNull com.sankuai.waimai.store.im.number.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1a1179d65747b10cddcbcbae1482de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1a1179d65747b10cddcbcbae1482de");
            return;
        }
        int i = this.g;
        if (aVar instanceof com.sankuai.waimai.store.im.number.b) {
            i += this.h;
        } else if (aVar instanceof c) {
            i += this.i;
        }
        try {
            aVar.a(i);
        } catch (Exception e2) {
            com.sankuai.waimai.store.base.log.a.a(e2);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62081c2fbddb8353a02e7220e560a07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62081c2fbddb8353a02e7220e560a07c");
        } else if (this.f != null) {
            this.f.a();
        }
    }

    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d0ca32420210f324856fbf0724b154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d0ca32420210f324856fbf0724b154");
        } else if (getMenuResponse != null) {
            this.i = getMenuResponse.getMsgCenterUnreadCount();
            c();
        }
    }
}
