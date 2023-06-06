package com.dianping.nvnetwork.shark.monitor;

import android.text.TextUtils;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public static ChangeQuickRedirect a;
    static final List<Integer> b = Arrays.asList(80, 443);
    private static volatile d i;
    public JSONObject c;
    public volatile boolean d;
    public volatile int e;
    public volatile String f;
    public volatile int g;
    public volatile int h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc132bed4b3bd09f9e9185c19c2ecab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc132bed4b3bd09f9e9185c19c2ecab");
            return;
        }
        this.c = new JSONObject();
        this.f = "shark.dianping.com";
        this.g = 2;
        this.h = 8000;
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9aa839399cc0071521c38a9e6e34aaed", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9aa839399cc0071521c38a9e6e34aaed");
        }
        if (i == null) {
            synchronized (d.class) {
                if (i == null) {
                    i = new d();
                }
            }
        }
        return i;
    }

    public final double b() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b55579fdd52af746df8596c475a8a0", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b55579fdd52af746df8596c475a8a0")).doubleValue();
        }
        String optString = this.c.optString("NetMonitor.PingTP", null);
        if (optString == null || (split = optString.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)) == null || split.length < 2 || TextUtils.isEmpty(split[0])) {
            return 750.0d;
        }
        try {
            return Double.parseDouble(split[0]);
        } catch (Exception unused) {
            return 750.0d;
        }
    }

    public final double c() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4dfa83fb81ab1547e29b59a196891e0", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4dfa83fb81ab1547e29b59a196891e0")).doubleValue();
        }
        String optString = this.c.optString("NetMonitor.PingTP", null);
        if (optString == null || (split = optString.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)) == null || split.length < 2 || TextUtils.isEmpty(split[1])) {
            return 200.0d;
        }
        try {
            return Double.parseDouble(split[1]);
        } catch (Exception unused) {
            return 200.0d;
        }
    }

    public final int d() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda11dd5297210d3e5eea35fb2830530", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda11dd5297210d3e5eea35fb2830530")).intValue();
        }
        String optString = this.c.optString("NetMonitor.ThresholdTime", null);
        if (optString == null || (split = optString.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)) == null || split.length < 2 || TextUtils.isEmpty(split[1])) {
            return TXLiveConstants.RENDER_ROTATION_180;
        }
        try {
            return Integer.parseInt(split[1]);
        } catch (Exception unused) {
            return TXLiveConstants.RENDER_ROTATION_180;
        }
    }

    public final int e() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ecd1fd50a04c3a9ef0cbb0ff47efea6", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ecd1fd50a04c3a9ef0cbb0ff47efea6")).intValue();
        }
        String optString = this.c.optString("NetMonitor.ThresholdTime", null);
        if (optString == null || (split = optString.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)) == null || split.length < 2 || TextUtils.isEmpty(split[1])) {
            return 400;
        }
        try {
            return Integer.parseInt(split[0]);
        } catch (Exception unused) {
            return 400;
        }
    }
}
