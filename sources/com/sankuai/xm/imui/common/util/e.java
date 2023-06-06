package com.sankuai.xm.imui.common.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static com.sankuai.xm.imui.session.entity.b a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c79b753cea99c1be59487ccd0e6ea4f", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c79b753cea99c1be59487ccd0e6ea4f");
        }
        com.sankuai.xm.imui.session.entity.b bVar = new com.sankuai.xm.imui.session.entity.b();
        Object[] objArr2 = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.session.entity.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "12c80ec1aad224c155176c35878453da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "12c80ec1aad224c155176c35878453da");
        } else {
            bVar.b = iMMessage;
            if (iMMessage != 0) {
                bVar.i = iMMessage.getMsgOppositeStatus() != 0 ? 0 : 1;
                bVar.j = iMMessage.getMsgOppositeStatus();
            }
        }
        bVar.e = iMMessage.getMsgStatus();
        return bVar;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c06519fdcaabd76562114a0ae6b905e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c06519fdcaabd76562114a0ae6b905e");
        }
        try {
            if (com.sankuai.xm.imui.common.processors.f.b().c != null && !TextUtils.isEmpty(str)) {
                return com.sankuai.xm.imui.common.processors.f.b().c.a((CharSequence) str).toString();
            }
            return str;
        } catch (Throwable th) {
            d.a(th);
            return str;
        }
    }

    public static boolean a(FileMessage fileMessage) {
        Object[] objArr = {fileMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b923e3fbec3193290e04c01f2f060422", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b923e3fbec3193290e04c01f2f060422")).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(fileMessage.getExtension());
            if (!TextUtils.equals(jSONObject.optString("style"), "text")) {
                if (!jSONObject.has("longText")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89721d5ff4f60c951ddc4823d9127c2b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89721d5ff4f60c951ddc4823d9127c2b")).booleanValue() : (bVar == null || bVar.b == 0 || bVar.b.getFromUid() != IMUIManager.a().e()) ? false : true;
    }
}
