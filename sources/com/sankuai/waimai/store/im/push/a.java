package com.sankuai.waimai.store.im.push;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.listener.model.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.imbase.init.model.a {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(com.sankuai.waimai.imbase.listener.model.a aVar, String str, String str2, String str3, long j, boolean z) {
        Object[] objArr = {aVar, str, str2, str3, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e414c4c2857b5db388d2c6744adc275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e414c4c2857b5db388d2c6744adc275");
        } else if (z) {
            if (com.sankuai.waimai.foundation.utils.activity.a.a().b() != null) {
                aVar.a(new a.C0962a(str, str2, str3, R.drawable.wm_sc_common_good_img_default, j, null, new a.c() { // from class: com.sankuai.waimai.store.im.push.a.2
                    @Override // com.sankuai.waimai.imbase.listener.model.a.c
                    public final void a() {
                    }

                    @Override // com.sankuai.waimai.imbase.listener.model.a.c
                    public final void b() {
                    }
                }));
            }
        } else {
            Context context = b.a;
            aVar.a(new a.b(context, str + " : " + str2, (Map<String, String>) null, 1001));
        }
    }

    public a() {
        super((short) 1029, new com.sankuai.waimai.imbase.listener.a() { // from class: com.sankuai.waimai.store.im.push.a.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
            @Override // com.sankuai.waimai.imbase.listener.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.sankuai.waimai.imbase.listener.model.a a(com.sankuai.xm.im.message.bean.IMMessage r22, boolean r23) {
                /*
                    Method dump skipped, instructions count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.push.a.AnonymousClass1.a(com.sankuai.xm.im.message.bean.IMMessage, boolean):com.sankuai.waimai.imbase.listener.model.a");
            }
        });
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d5cc20e42b0b0c25a1f60623d0c09f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d5cc20e42b0b0c25a1f60623d0c09f");
        }
    }
}
