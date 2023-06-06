package com.sankuai.xm.imui.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static g c;
    public Map<String, List<ImageMessage>> b;

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426b8b8f411de2b8d5c61059f824e7cb", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426b8b8f411de2b8d5c61059f824e7cb");
        }
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    c = new g();
                }
            }
        }
        return c;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4bff3cd14997520b38ddbbb915a1c93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4bff3cd14997520b38ddbbb915a1c93");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(String str, List<IMMessage> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603645ca9dd526fc1b2011d14e1ad5fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603645ca9dd526fc1b2011d14e1ad5fd");
        } else if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                if (iMMessage.getMsgType() == 4 && (iMMessage instanceof ImageMessage)) {
                    arrayList.add((ImageMessage) iMMessage);
                }
            }
            this.b.put(str, arrayList);
        }
    }
}
