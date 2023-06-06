package com.sankuai.xm.im.message.history;

import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.history.e;
import com.sankuai.xm.im.utils.MessageUtils;
import com.tencent.smtt.sdk.TbsListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends e {
    public static ChangeQuickRedirect b;

    public d(String str, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str, null);
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad6de295719f42c64cb2e60056af626", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad6de295719f42c64cb2e60056af626");
        }
    }

    @Override // com.sankuai.xm.im.message.history.e
    public final void a(e.a aVar) throws JSONException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d21945a5d9b054b41df933069e10a74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d21945a5d9b054b41df933069e10a74");
            return;
        }
        this.d = aVar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("u", com.sankuai.xm.login.a.a().e());
        jSONObject.put("ai", com.sankuai.xm.login.a.a().m());
        jSONObject.put("pl", aVar.g);
        jSONObject.put("lm", aVar.d);
        jSONObject.put("od", 0);
        if (aVar.j == null || (!ac.a(aVar.i, "st-et") && !ac.a(aVar.i, "st-msgidB"))) {
            a(jSONObject);
            return;
        }
        String[] split = aVar.i.split(CommonConstant.Symbol.MINUS);
        long[] jArr = (long[]) aVar.j.get(aVar.i);
        if (jArr == null || jArr.length < 2) {
            a(jSONObject);
            return;
        }
        if (MessageUtils.isPubService(aVar.c.e)) {
            jSONObject.put("svid", TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("u", aVar.c.b);
            jSONObject2.put(split[0], jArr[0]);
            jSONObject2.put(split[1], jArr[1]);
            jSONObject2.put(MessageStatisticsEntry.PARAM_CHANNEL, (int) aVar.c.g);
            if (aVar.c.c > 0) {
                jSONObject2.put("pu", aVar.c.c);
            }
            if (!ac.a(aVar.c.g())) {
                jSONObject2.put(Message.SID, aVar.c.g());
            }
            jSONArray.put(jSONObject2);
            jSONObject.put("ps", jSONArray);
        } else {
            jSONObject.put("svid", 401);
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("b", aVar.c.b);
            jSONObject3.put(split[0], jArr[0]);
            jSONObject3.put(split[1], jArr[1]);
            jSONObject3.put(MessageStatisticsEntry.PARAM_CHANNEL, (int) aVar.c.g);
            if (aVar.c.e == 2) {
                jSONObject3.put(g.n, 1);
                jSONObject3.put("ai", (int) com.sankuai.xm.login.a.a().m());
            } else {
                jSONObject3.put(g.n, 0);
                jSONObject3.put("ai", (int) aVar.c.d);
            }
            if (!ac.a(aVar.c.g())) {
                jSONObject3.put(Message.SID, aVar.c.g());
            }
            jSONArray2.put(jSONObject3);
            jSONObject.put("bs", jSONArray2);
        }
        this.e = this.d.i;
        a(jSONObject, aVar);
        a(jSONObject);
    }

    @Override // com.sankuai.xm.im.message.history.e
    public final boolean a(IMMessage iMMessage) {
        JSONObject F;
        long[] jArr;
        JSONArray jSONArray;
        JSONObject jSONObject;
        String[] split;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065095eb92d4500aab0699369904e983", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065095eb92d4500aab0699369904e983")).booleanValue();
        }
        if (iMMessage != null) {
            try {
                if (this.d != null && this.d.j != null && (F = F()) != null && (jArr = (long[]) this.d.j.get(this.e)) != null && jArr.length >= 2) {
                    long j = jArr[0];
                    long j2 = jArr[1];
                    if ("st-msgidB".equals(this.e)) {
                        if (iMMessage.getMsgId() <= j || iMMessage.getMsgId() >= j2) {
                            return false;
                        }
                    } else if ("st-et".equals(this.e)) {
                        if (iMMessage.getSts() > j) {
                            if (iMMessage.getSts() >= j2) {
                            }
                        }
                        return false;
                    } else {
                        return false;
                    }
                    if (MessageUtils.isPubService(this.d.c.e)) {
                        jSONArray = F.getJSONArray("ps");
                    } else {
                        jSONArray = F.getJSONArray("bs");
                    }
                    if (jSONArray != null && jSONArray.length() > 0 && (jSONObject = jSONArray.getJSONObject(0)) != null && (split = this.d.i.split(CommonConstant.Symbol.MINUS)) != null && split.length >= 2) {
                        if ("st-msgidB".equals(this.e)) {
                            jSONObject.put(split[1], iMMessage.getMsgId());
                            jArr[1] = iMMessage.getMsgId();
                        } else if ("st-et".equals(this.e)) {
                            jSONObject.put(split[1], iMMessage.getSts());
                            jArr[1] = iMMessage.getSts();
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "HistoryRangeRequest::fillContinueRequestParam", new Object[0]);
                return false;
            }
        }
        return false;
    }

    @Override // com.sankuai.xm.im.message.history.e
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193ce3e0e4b4fe9b5252a515996c4ddc", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193ce3e0e4b4fe9b5252a515996c4ddc")).longValue();
        }
        if (ac.a(this.d.i, "st-msgidB")) {
            long[] jArr = (long[]) this.d.j.get(this.e);
            if (jArr == null || jArr.length < 2) {
                return 0L;
            }
            return jArr[1];
        }
        return super.c();
    }
}
