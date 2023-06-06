package com.sankuai.xm.ui.entity;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.lifecycle.d;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.processors.f;
import com.sankuai.xm.imui.common.view.c;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final com.sankuai.xm.imui.common.processors.a c = new com.sankuai.xm.imui.common.processors.a();
    public SessionId b;
    private CharSequence d;
    private long e;

    public final CharSequence a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d42d8b134be2036af968e54856e7182", 6917529027641081856L) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d42d8b134be2036af968e54856e7182") : c.a(this.d);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9696946763026d1f05487c87786df1e3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9696946763026d1f05487c87786df1e3");
        }
        if (this.d != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", this.e);
                jSONObject.put("content", this.d.toString());
                jSONObject.put(Message.SID, this.b.f());
                return jSONObject.toString();
            } catch (JSONException e) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "IInputEditorPlugin::Draft::getDraft", e);
                com.sankuai.xm.im.utils.a.a(e);
                return "";
            }
        }
        return "";
    }

    public static a a(Editable editable, SessionId sessionId) {
        CharSequence charSequence;
        Object[] objArr = {editable, sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b50e36d726bd54ce273c68139b8efc43", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b50e36d726bd54ce273c68139b8efc43");
        }
        a aVar = new a();
        aVar.e = System.currentTimeMillis();
        com.sankuai.xm.imui.common.processors.a aVar2 = c;
        Object[] objArr2 = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.common.processors.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "a032fbee4467b7d28a656b4b676b4646", 6917529027641081856L)) {
            charSequence = (CharSequence) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "a032fbee4467b7d28a656b4b676b4646");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
            c[] cVarArr = (c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class);
            if (cVarArr != null) {
                for (c cVar : cVarArr) {
                    if (cVar != null) {
                        int spanStart = spannableStringBuilder.getSpanStart(cVar);
                        int spanEnd = spannableStringBuilder.getSpanEnd(cVar);
                        if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd) {
                            spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) ("@[" + cVar.a("uid") + '|' + cVar.b.substring(1, cVar.b.length() - 1) + "] "));
                        }
                    }
                }
            }
            charSequence = spannableStringBuilder;
        }
        aVar.d = charSequence;
        aVar.b = sessionId;
        return aVar;
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8de96b75b392a5f43f512d00f73ff1a8", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8de96b75b392a5f43f512d00f73ff1a8");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            a aVar = new a();
            JSONObject jSONObject = new JSONObject(str);
            aVar.e = jSONObject.optLong("time");
            aVar.d = f.b().a(d.d().a()).a(c.a(jSONObject.getString("content")));
            String optString = jSONObject.optString(Message.SID);
            if (!TextUtils.isEmpty(optString)) {
                aVar.b = SessionId.a(optString);
            }
            return aVar;
        } catch (JSONException e) {
            com.sankuai.xm.monitor.statistics.a.a("imui", "IInputEditorPlugin::Draft::getDraft", e);
            com.sankuai.xm.im.utils.a.a(e);
            return null;
        }
    }
}
