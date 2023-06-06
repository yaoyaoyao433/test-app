package com.sankuai.xm.login.manager.lvs;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.trtc.TRTCCloudDef;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    int b;
    public short c;
    String d;
    String e;
    int f;
    public boolean g;
    long h;
    int i;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8ee9cb4aa0d186b477a7dd7de8ea867", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8ee9cb4aa0d186b477a7dd7de8ea867");
        }
        a aVar = new a();
        aVar.b = 0;
        aVar.c = (short) 0;
        aVar.d = a(0);
        aVar.e = "";
        aVar.f = 0;
        aVar.g = false;
        aVar.i = 0;
        return aVar;
    }

    public static a a(int i, short s, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), Short.valueOf(s), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0c4ba2456b8e22a98493851de99d1a1", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0c4ba2456b8e22a98493851de99d1a1");
        }
        a aVar = new a();
        aVar.b = i;
        aVar.c = s;
        aVar.d = a(i);
        if (ac.a(str)) {
            str = "";
        }
        aVar.e = str;
        aVar.f = 0;
        aVar.g = false;
        aVar.i = i2;
        return aVar;
    }

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c51c4dfea9a2e2d6dbac5fb48d604ef2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c51c4dfea9a2e2d6dbac5fb48d604ef2");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i & 255);
        sb.append(CommonConstant.Symbol.DOT_CHAR);
        sb.append((i >> 8) & 255);
        sb.append(CommonConstant.Symbol.DOT_CHAR);
        sb.append((i >> 16) & 255);
        sb.append(CommonConstant.Symbol.DOT_CHAR);
        sb.append((i >> 24) & 255);
        return sb.toString();
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77619e08c012017aa5d29baf2c864f43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77619e08c012017aa5d29baf2c864f43");
            return;
        }
        try {
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.b);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, (int) this.c);
            jSONObject.put("rank", this.f);
            jSONObject.put("fallback", this.g);
            jSONObject.put("ipv6", this.e == null ? "" : this.e);
            jSONObject.put(KnbConstants.PARAMS_SCENE, this.i);
        } catch (Exception unused) {
        }
    }

    public final void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5bec6d9bcdea81f250dc79b0e4e032f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5bec6d9bcdea81f250dc79b0e4e032f");
            return;
        }
        try {
            this.b = jSONObject.optInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, 0);
            this.c = (short) jSONObject.optInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, 0);
            this.f = jSONObject.optInt("rank", 0);
            this.g = jSONObject.optBoolean("fallback", false);
            this.d = a(this.b);
            this.e = jSONObject.optString("ipv6");
            this.i = jSONObject.optInt(KnbConstants.PARAMS_SCENE, 0);
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b765e3f3b79cf17c8313dbf8f4414343", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b765e3f3b79cf17c8313dbf8f4414343");
        }
        try {
            return "\n{ip='" + this.d + "，ipv6='" + this.e + "', port=" + ((int) this.c) + ", rank=" + this.f + ", fallback=" + this.g + ", scene=" + this.i + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8058b24431f85fc8ca3e3d2e820286a2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8058b24431f85fc8ca3e3d2e820286a2")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.b == aVar.b && ac.a(this.e, aVar.e) && this.c == aVar.c;
        }
        return false;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6bc474f3b9d475d4c0d6eb5fa9de2e1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6bc474f3b9d475d4c0d6eb5fa9de2e1")).booleanValue();
        }
        if ((this.b == 0 || ac.a(a(this.b), TRTCCloudDef.TRTC_SDK_VERSION)) && (ac.a(this.e) || ac.a(this.e, "0:0:0:0:0:0:0:0"))) {
            com.sankuai.xm.login.d.b("Address is invalid ,%s", this);
            return false;
        }
        return true;
    }
}
