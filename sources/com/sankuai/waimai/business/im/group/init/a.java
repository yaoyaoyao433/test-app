package com.sankuai.waimai.business.im.group.init;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.imbase.init.model.a {
    public static ChangeQuickRedirect a;

    public a() {
        super((short) 1050, new C0741a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a0787eb8d7eb6fb4b0a5d13a6b1d0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a0787eb8d7eb6fb4b0a5d13a6b1d0c");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.init.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0741a implements com.sankuai.waimai.imbase.listener.a {
        public static ChangeQuickRedirect a;

        public C0741a() {
        }

        @Override // com.sankuai.waimai.imbase.listener.a
        public final com.sankuai.waimai.imbase.listener.model.a a(final IMMessage iMMessage, boolean z) {
            String str;
            String str2;
            JSONObject jSONObject;
            String optString;
            String string;
            Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae7bfc0be452e0a2340e336d27c1537", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae7bfc0be452e0a2340e336d27c1537");
            }
            String str3 = "";
            String str4 = "";
            if (iMMessage instanceof GeneralMessage) {
                GeneralMessage generalMessage = (GeneralMessage) iMMessage;
                if (generalMessage.getData() != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(new String(generalMessage.getData(), "utf-8"));
                        int i = jSONObject2.getInt("type");
                        if (i == 2002) {
                            string = generalMessage.getSummary();
                        } else if (i == 2003) {
                            string = jSONObject2.optJSONObject("data").getString("content");
                        }
                        str4 = string;
                    } catch (Exception unused) {
                    }
                }
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = h.a(iMMessage);
            }
            String str5 = str4;
            try {
                jSONObject = new JSONObject(iMMessage.getExtension());
                optString = jSONObject.optString(AgainManager.EXTRA_POI_NAME, "");
            } catch (Exception unused2) {
            }
            try {
                str3 = TextUtils.isEmpty(optString) ? iMMessage.getFromName() : optString;
                if (TextUtils.isEmpty(str3)) {
                    str3 = "商家";
                }
                str2 = str3;
                str = jSONObject.optString("poi_logo_url", "");
            } catch (Exception unused3) {
                str3 = optString;
                str = "";
                str2 = str3;
                if (!TextUtils.isEmpty(str2)) {
                }
                return new com.sankuai.waimai.imbase.listener.model.a(false);
            }
            if (!TextUtils.isEmpty(str2) || TextUtils.isEmpty(str5)) {
                return new com.sankuai.waimai.imbase.listener.model.a(false);
            }
            com.sankuai.waimai.imbase.listener.model.a aVar = new com.sankuai.waimai.imbase.listener.model.a(true);
            long sts = iMMessage.getSts();
            Object[] objArr2 = {aVar, str2, str5, str, new Long(sts), Byte.valueOf(z ? (byte) 1 : (byte) 0), iMMessage};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "884e4efa72419ef1e0f649340c7ca1dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "884e4efa72419ef1e0f649340c7ca1dc");
            } else if (z) {
                if (com.sankuai.waimai.foundation.utils.activity.a.a().b() != null) {
                    aVar.a(new a.C0962a(str2, str5, str, R.drawable.wm_im_poi_default_avatar, sts, null, new a.c() { // from class: com.sankuai.waimai.business.im.group.init.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.imbase.listener.model.a.c
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20336d2882918975868b504b7cafe2dd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20336d2882918975868b504b7cafe2dd");
                                return;
                            }
                            com.sankuai.waimai.imbase.log.judas.a.b("b_2fewqhua").a("messageId", IMMessage.this.getMsgId()).a("category", IMMessage.this.getCategory()).a("type", 4).a();
                            com.sankuai.waimai.imbase.log.judas.a.b("b_waimai_0db0bomi_mv").a(RemoteMessageConst.MSGTYPE, IMMessage.this.getMsgType()).a("im_group_id", IMMessage.this.getChatId()).a("channel_id", 1050).a();
                        }

                        @Override // com.sankuai.waimai.imbase.listener.model.a.c
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98a5286eec85d3bec234aa4f80122cd6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98a5286eec85d3bec234aa4f80122cd6");
                                return;
                            }
                            com.sankuai.waimai.imbase.log.judas.a.a("b_cvqfb6g1").a("messageId", IMMessage.this.getMsgId()).a("category", IMMessage.this.getCategory()).a("type", 4).a();
                            com.sankuai.waimai.imbase.log.judas.a.a("b_waimai_0db0bomi_mc").a(RemoteMessageConst.MSGTYPE, IMMessage.this.getMsgType()).a("im_group_id", IMMessage.this.getChatId()).a("channel_id", 1050).a();
                        }
                    }));
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("messageId", Long.valueOf(iMMessage.getMsgId()));
                hashMap.put("category", Integer.valueOf(iMMessage.getCategory()));
                hashMap.put("im_type", 4);
                Context context = com.meituan.android.singleton.b.a;
                aVar.a(new a.b(context, str2 + " : " + str5, (Map<String, String>) null, hashMap));
            }
            return aVar;
        }
    }
}
