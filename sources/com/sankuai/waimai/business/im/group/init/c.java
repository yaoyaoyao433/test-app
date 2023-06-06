package com.sankuai.waimai.business.im.group.init;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.manager.f;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.imbase.init.model.a {
    public static ChangeQuickRedirect a;

    public c() {
        super((short) 1036, new a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27d450011099a8a91fa9dc6fd5ccc97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27d450011099a8a91fa9dc6fd5ccc97");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a implements com.sankuai.waimai.imbase.listener.a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
        @Override // com.sankuai.waimai.imbase.listener.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.sankuai.waimai.imbase.listener.model.a a(final com.sankuai.xm.im.message.bean.IMMessage r25, boolean r26) {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.group.init.c.a.a(com.sankuai.xm.im.message.bean.IMMessage, boolean):com.sankuai.waimai.imbase.listener.model.a");
        }

        private boolean a(IMMessage iMMessage, int i) {
            int i2;
            Object[] objArr = {iMMessage, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54aa528df9d36fc84d1e3095bdb42d9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54aa528df9d36fc84d1e3095bdb42d9")).booleanValue();
            }
            if (i == 3) {
                return false;
            }
            if (iMMessage instanceof GeneralMessage) {
                GeneralMessage generalMessage = (GeneralMessage) iMMessage;
                if (generalMessage.getData() != null) {
                    try {
                        i2 = new JSONObject(new String(generalMessage.getData(), "utf-8")).getInt("type");
                    } catch (Exception unused) {
                    }
                    return f.a().b(String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()), i2);
                }
            }
            i2 = 0;
            return f.a().b(String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()), i2);
        }
    }
}
