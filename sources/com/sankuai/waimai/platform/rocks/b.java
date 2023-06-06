package com.sankuai.waimai.platform.rocks;

import android.os.SystemClock;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.c;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.rocks.log.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.rocks.log.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e58a6469af00133d9f2ddd9452bc96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e58a6469af00133d9f2ddd9452bc96d");
            return;
        }
        a((int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, str);
        b(new a().a(b(str)).b("template_id_empty").b());
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442eb40d2e178b4fec7c03a16e1d455a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442eb40d2e178b4fec7c03a16e1d455a");
            return;
        }
        a((int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str2);
            b(new a().a(b(str)).b("string_data_empty").d(jSONObject.toString()).b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692a5f1e8f7f59f74367dd94cc3a99a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692a5f1e8f7f59f74367dd94cc3a99a9");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str2);
            a(new a().a(b(str)).b("bundle_load_success").d(jSONObject.toString()).b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b3d57c1a0f4a42510047845448fd399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b3d57c1a0f4a42510047845448fd399");
            return;
        }
        a((int) IjkMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str2);
            b(new a().a(b(str)).b("bundle_load_fail").d(jSONObject.toString()).b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b653433524813a9f21838169e1e8ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b653433524813a9f21838169e1e8ccf");
            return;
        }
        a(20005, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str2);
            a(new a().a(b(str)).b("bundle_pre_render_success").d(jSONObject.toString()).b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370761eca2f9d5a6988813ceb336724a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370761eca2f9d5a6988813ceb336724a");
            return;
        }
        a(20006, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str2);
            jSONObject.put("data", str3);
            jSONObject.put("render_fail_reason", str4);
            b(new a().a(b(str)).b("bundle_pre_render_fail").d(jSONObject.toString()).b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db1c6e74c4dce283e7267a42a129996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db1c6e74c4dce283e7267a42a129996");
            return;
        }
        a(20007, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str2);
            b(new a().a(b(str)).b("bundle_activity_destroy").d(jSONObject.toString()).b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "968ad0e83df1ee655135beed219bce63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "968ad0e83df1ee655135beed219bce63");
            return;
        }
        c.a().a(i, "rocks/mach/prerender", SystemClock.elapsedRealtime());
        c a2 = c.a();
        a2.a(i, "rocks/mach/prerender/" + str, SystemClock.elapsedRealtime());
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void a(String str, Throwable th) {
        String stringBuffer;
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9ac80fcd3a0e1ba87336b9e940d316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9ac80fcd3a0e1ba87336b9e940d316");
            return;
        }
        a.AbstractC1040a b = new a().a(b(str)).b(LogMonitor.EXCEPTION_TAG);
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f609e20bc5003e98768af8716ec95fb3", RobustBitConfig.DEFAULT_VALUE)) {
            stringBuffer = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f609e20bc5003e98768af8716ec95fb3");
        } else if (th == null) {
            stringBuffer = "";
        } else {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            stringBuffer = stringWriter.getBuffer().toString();
        }
        b(b.d(stringBuffer).b());
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d496b39e4d039bd60b015e5104a7a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d496b39e4d039bd60b015e5104a7a59");
        }
        return "rocks_" + str;
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void f(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4124f3ef426f11a1c59e64a647d723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4124f3ef426f11a1c59e64a647d723");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMode", str2);
            b(new a().a(b(str)).b("render_mode_mistake").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    @Override // com.sankuai.waimai.rocks.log.b
    public final void g(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095c0156cafa2318879d81986f1c8393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095c0156cafa2318879d81986f1c8393");
        } else {
            b(new a().a(b(str)).b(str2).b());
        }
    }

    private static void a(com.sankuai.waimai.platform.capacity.log.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3cd8fa9723f6bce644422def3d21b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3cd8fa9723f6bce644422def3d21b98");
        } else {
            com.sankuai.waimai.platform.capacity.log.b.a(aVar);
        }
    }

    private static void b(com.sankuai.waimai.platform.capacity.log.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa190885fe179c29860e5ea76bf4ecda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa190885fe179c29860e5ea76bf4ecda");
        } else {
            com.sankuai.waimai.platform.capacity.log.b.b(aVar);
        }
    }
}
