package com.meituan.android.neohybrid.neo.bridge.handler;

import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.neo.bridge.presenter.b;
import com.meituan.android.neohybrid.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements NeoBridgeCustomizeInterface {
    public static ChangeQuickRedirect b;
    public static final String d = null;
    public b c;

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public void a(int i, int i2, Intent intent) {
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public void b(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    @Nullable
    public String c(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        return d;
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface
    public final void a(b bVar) {
        this.c = bVar;
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6748723795a37befe96e6684b270b84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6748723795a37befe96e6684b270b84d");
        } else if (this.c == null || jSONObject == null) {
        } else {
            this.c.a(jSONObject);
        }
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db1bfa25c7c51c8a55375dc04ded7d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db1bfa25c7c51c8a55375dc04ded7d2");
        } else if (this.c == null || jsonObject == null) {
        } else {
            this.c.a(jsonObject);
        }
    }

    public final void a(int i, String str, JsonObject jsonObject) {
        Object[] objArr = {-2, str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3269f9935707507b6f198b48c38f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3269f9935707507b6f198b48c38f2c");
        } else if (this.c != null) {
            this.c.a(-2, str, jsonObject);
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dce19ffa92c28ed8f6385b92360f793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dce19ffa92c28ed8f6385b92360f793");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorCode", i);
            jSONObject.put("errMsg", str);
            if (this.c != null) {
                this.c.a(jSONObject);
            }
        } catch (JSONException e) {
            f.a(e.toString());
        }
    }
}
