package com.sankuai.waimai.store.im.badcomment;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.imbase.init.model.a {
    public static ChangeQuickRedirect a;

    public b() {
        super((short) 1038, new com.sankuai.waimai.imbase.listener.a() { // from class: com.sankuai.waimai.store.im.badcomment.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.a
            public final com.sankuai.waimai.imbase.listener.model.a a(IMMessage iMMessage, boolean z) {
                String str;
                String str2;
                String str3;
                Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a6dcf3a3ff5a8e9164b408428b09de", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a6dcf3a3ff5a8e9164b408428b09de");
                }
                String fromName = iMMessage.getFromName();
                String a2 = h.a(iMMessage);
                try {
                    JSONObject jSONObject = new JSONObject(iMMessage.getExtension());
                    str = jSONObject.optString(Message.GROUP_NAME, "");
                    try {
                        str2 = jSONObject.optString("groupUrl");
                    } catch (Exception unused) {
                        str2 = "";
                        if (!TextUtils.isEmpty(str)) {
                        }
                        return new com.sankuai.waimai.imbase.listener.model.a(false);
                    }
                } catch (Exception unused2) {
                    str = fromName;
                }
                if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(a2)) {
                    return new com.sankuai.waimai.imbase.listener.model.a(false);
                }
                if (TextUtils.isEmpty(str) || c.a(str)) {
                    String groupName = iMMessage.getGroupName();
                    if (TextUtils.isEmpty(groupName)) {
                        groupName = "差评订单回访";
                    }
                    str3 = groupName;
                } else {
                    str3 = str;
                }
                com.sankuai.waimai.imbase.listener.model.a aVar = new com.sankuai.waimai.imbase.listener.model.a(true);
                long sts = iMMessage.getSts();
                Object[] objArr2 = {aVar, str3, a2, str2, new Long(sts), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ad88da538688f31a557bf565340f3085", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ad88da538688f31a557bf565340f3085");
                } else if (z) {
                    if (com.sankuai.waimai.foundation.utils.activity.a.a().b() != null) {
                        aVar.a(new a.C0962a(str3, a2, str2, R.drawable.wm_sc_common_good_img_default, sts, null, new a.c() { // from class: com.sankuai.waimai.store.im.badcomment.b.2
                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void a() {
                            }

                            @Override // com.sankuai.waimai.imbase.listener.model.a.c
                            public final void b() {
                            }
                        }));
                    }
                } else {
                    Context context = com.meituan.android.singleton.b.a;
                    aVar.a(new a.b(context, str3 + " : " + a2, (Map<String, String>) null, 1038));
                }
                return aVar;
            }
        });
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1157d58ac56e8361acc8d8b964bc469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1157d58ac56e8361acc8d8b964bc469");
        }
    }
}
