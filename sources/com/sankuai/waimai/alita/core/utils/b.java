package com.sankuai.waimai.alita.core.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    EnumC0714b e;
    @NonNull
    final HashMap<String, Object> f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560dadf3a9b4f6d6d1033536c6377004", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560dadf3a9b4f6d6d1033536c6377004");
            return;
        }
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = EnumC0714b.VERBOSE;
        this.f = new HashMap<>();
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68db18118dd29c384a803f0690a191d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68db18118dd29c384a803f0690a191d9");
            return;
        }
        String valueOf = String.valueOf(obj);
        Object[] objArr2 = {str, valueOf};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4522fb18c21d70601ff4249dd77dbd73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4522fb18c21d70601ff4249dd77dbd73");
        } else {
            this.f.put(str, valueOf);
        }
    }

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a41d63f51b4cc0985fdd37d4194093b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a41d63f51b4cc0985fdd37d4194093b");
        }
        if (this.f.size() > 0) {
            return new JSONObject(this.f);
        }
        return new JSONObject();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42fbc17319189eb1e89ca9df13efe81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42fbc17319189eb1e89ca9df13efe81");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biz", this.b);
            jSONObject.put(ShowLogJsHandler.PARAM_NAME_MODULE, this.c);
            jSONObject.put("type", this.d);
            jSONObject.put("level", this.e.toString());
            jSONObject.put("details", a());
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public final JSONObject b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2edf3bfd9adb6ea86ae39c52e94eee", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2edf3bfd9adb6ea86ae39c52e94eee");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biz", this.b);
            jSONObject.put(ShowLogJsHandler.PARAM_NAME_MODULE, this.c);
            jSONObject.put("type", this.d);
            jSONObject.put("level", this.e.toString());
            jSONObject.put("details", a());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public b b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ebef00aa4d6f2440983fd14df2ba97", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ebef00aa4d6f2440983fd14df2ba97");
            } else {
                this.b = new b();
            }
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9df7431bad35b343a8827450cc721c0", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9df7431bad35b343a8827450cc721c0");
            }
            if (TextUtils.isEmpty(str)) {
                this.b.c = "";
            } else {
                this.b.c = str;
            }
            return this;
        }

        public final a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86cca609a951762a1d96be8ed0b4035", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86cca609a951762a1d96be8ed0b4035");
            }
            if (TextUtils.isEmpty(str)) {
                this.b.d = "";
            } else {
                this.b.d = str;
            }
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e89b95fb163127f4d1f0684a92364c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e89b95fb163127f4d1f0684a92364c6");
            }
            this.b.f.put(str, str2);
            return this;
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9f77ffc6f4e47bcf3a7a67d7395ced8", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9f77ffc6f4e47bcf3a7a67d7395ced8");
            }
            if (map != null && !map.isEmpty()) {
                this.b.f.putAll(map);
            }
            return this;
        }

        public final a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0803ff2a0a69b4822d9cc0962641a135", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0803ff2a0a69b4822d9cc0962641a135");
            }
            if (TextUtils.isEmpty(str)) {
                this.b.b = "";
            } else {
                this.b.b = str;
            }
            return this;
        }

        public final a a(@NonNull EnumC0714b enumC0714b) {
            Object[] objArr = {enumC0714b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88fbde57030923a1304286f4a087dbd5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88fbde57030923a1304286f4a087dbd5");
            }
            this.b.e = enumC0714b;
            return this;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7fca908b19a8d790852bccc245cba2", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7fca908b19a8d790852bccc245cba2");
            }
            if (this.b == null || TextUtils.isEmpty(this.b.c)) {
                throw new IllegalArgumentException("Log module can not be null");
            }
            return this.b;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0714b {
        VERBOSE("verbose"),
        DEBUG("debug"),
        INFO("info"),
        ERROR("error");
        
        public static ChangeQuickRedirect a;
        private final String f;

        public static EnumC0714b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09eb0de14002594a38c6d78e0b799500", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0714b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09eb0de14002594a38c6d78e0b799500") : (EnumC0714b) Enum.valueOf(EnumC0714b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0714b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4833ebef2cfc37a79391e556e9754f06", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0714b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4833ebef2cfc37a79391e556e9754f06") : (EnumC0714b[]) values().clone();
        }

        EnumC0714b(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b28780714eedbc1709a08f2d85a7b82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b28780714eedbc1709a08f2d85a7b82");
            } else {
                this.f = str;
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f;
        }
    }
}
