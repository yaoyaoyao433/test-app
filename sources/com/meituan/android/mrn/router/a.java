package com.meituan.android.mrn.router;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.g;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    private final WeakReference<Activity> h;

    public a(Activity activity) {
        String str;
        String str2;
        g gVar;
        d p;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b848bf5abcc2d16d8d8814f9a067ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b848bf5abcc2d16d8d8814f9a067ff");
            return;
        }
        String str3 = null;
        if (activity == null) {
            this.h = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.b = false;
            return;
        }
        this.h = new WeakReference<>(activity);
        this.c = String.valueOf(activity.hashCode());
        boolean z = activity instanceof MRNBaseActivity;
        this.b = z;
        Intent intent = activity.getIntent();
        this.d = intent == null ? null : intent.getDataString();
        if (!z || (gVar = ((MRNBaseActivity) activity).e) == null || (p = gVar.p()) == null) {
            str = null;
            str2 = null;
        } else {
            str3 = p.c;
            str2 = p.d;
            str = p.e;
        }
        this.e = str3;
        this.f = str2;
        this.g = str;
    }

    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d3671b96520a5e29399e45ee25a8fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d3671b96520a5e29399e45ee25a8fb");
        }
        if (this.h == null) {
            return null;
        }
        return this.h.get();
    }

    public final JSONObject b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57373e459a79f9ef25039bc92a0f596", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57373e459a79f9ef25039bc92a0f596");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.c);
            jSONObject.put("type", this.b ? DiagnoseLog.MRN : "native");
            jSONObject.put("url", this.d);
            jSONObject.put("biz", this.e);
            jSONObject.put("entry", this.f);
            jSONObject.put("component", this.g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1269afe40e56c2232e10793f2cce8228", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1269afe40e56c2232e10793f2cce8228")).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return TextUtils.equals(this.c, ((a) obj).c);
        }
        return false;
    }
}
