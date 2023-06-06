package com.dianping.dataservice.mapi.impl;

import android.util.SparseArray;
import com.dianping.model.SimpleMsg;
import com.meituan.ai.speech.sdk.knb.JsErrorCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.smtt.sdk.TbsListener;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.dianping.dataservice.http.impl.a implements com.dianping.dataservice.mapi.f {
    public static ChangeQuickRedirect c;
    public static final Object d = "server status error";
    public static final Object g = "malformed content";
    public static SparseArray<String> h;
    protected boolean i;
    protected long j;
    protected byte[] k;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        h = sparseArray;
        sparseArray.put(-103, "点小评去吃糖醋排骨了");
        h.put(-100, "点小评去吃香辣五花肉了");
        h.put(-104, "点小评去吃烧子鹅了");
        h.put(-102, "点小评去吃烧花鸭了");
        h.put(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "点小评去吃松花小肚了");
        h.put(-106, "点小评去吃烩鸭条了");
        h.put(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE, "点小评去吃香酥鸡了");
        h.put(-109, "点小评去吃熘蟹肉了");
        h.put(DynamicActivityDialog.ACTIVITY_DIALOG_ANIM_DURATION, "点小评去吃炒腰花儿了");
        h.put(JsErrorCode.AUDIO_RECORD_STOP_FAILED, "点小评去吃锅烧白菜了");
        h.put(403, "点小评去吃水晶肘子了");
        h.put(JsErrorCode.AUDIO_RECORD_START_FAILED, "点小评去吃焖黄鳝了");
        h.put(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_FAILED, "点小评去吃什锦豆腐了");
        h.put(500, "点小评去吃清蒸鸡了");
        h.put(404, "点小评去吃小肚儿了");
        h.put(-111, "点小评去吃烩蟹肉了");
        h.put(TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, "点小评去吃蜜蜡肘子了");
        h.put(401, "点小评去吃炸子蟹了");
        h.put(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_SUCCESS, "点小评去吃软炸里脊了");
    }

    public a(int i, Object obj, List<com.dianping.apache.http.a> list, byte[] bArr, Object obj2) {
        this(-100, null, null, null, obj2, false, 0L);
        Object[] objArr = {-100, null, null, null, obj2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b263627c948031e4d01fd5706af60642", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b263627c948031e4d01fd5706af60642");
        }
    }

    public a(int i, Object obj, List<com.dianping.apache.http.a> list, byte[] bArr, Object obj2, boolean z, long j) {
        super(i, obj, list, obj2);
        Object[] objArr = {Integer.valueOf(i), obj, list, bArr, obj2, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a71ea82ff5a18f93f244341353e068", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a71ea82ff5a18f93f244341353e068");
            return;
        }
        this.k = bArr;
        this.i = z;
        this.j = j;
    }

    public static SimpleMsg a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa0caa064624080ad9201f582bf91bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (SimpleMsg) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa0caa064624080ad9201f582bf91bc5");
        }
        if (obj instanceof SimpleMsg) {
            return (SimpleMsg) obj;
        }
        if (obj == g) {
            return new SimpleMsg("点小评醉了", a(i), i);
        }
        if (obj == d) {
            return new SimpleMsg("出错了", a(i), i);
        }
        if (obj instanceof Exception) {
            if ((obj instanceof UnknownHostException) || (obj instanceof ConnectException)) {
                return new SimpleMsg("错误", "网络不给力哦", i);
            }
            return new SimpleMsg("点小评晕了", a(i), i);
        }
        return new SimpleMsg("错误", a(i), i);
    }

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3942414fbe662bdbe347bdc98f961b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3942414fbe662bdbe347bdc98f961b5") : h.get(i, "点小评去吃满汉全席了");
    }

    @Override // com.dianping.dataservice.mapi.f
    public final SimpleMsg c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8dfe94fe8c5b17f2b6bf8779af70e45", RobustBitConfig.DEFAULT_VALUE)) {
            return (SimpleMsg) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8dfe94fe8c5b17f2b6bf8779af70e45");
        }
        return a(this.b, this.f);
    }
}
