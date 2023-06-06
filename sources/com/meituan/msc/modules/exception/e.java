package com.meituan.msc.modules.exception;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
    private static final Pattern c = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements com.meituan.msc.devsupport.interfaces.a {
        public static ChangeQuickRedirect a;
        private final String b;
        private final String c;
        private final int d;
        private final int e;
        private final String f;
        private final boolean g;

        private a(String str, String str2, int i, int i2, boolean z) {
            Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c984fb480536c095efe507d1a32ce471", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c984fb480536c095efe507d1a32ce471");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = str != null ? new File(str).getName() : "";
            this.g = z;
        }

        private a(String str, String str2, int i, int i2) {
            this(str, str2, i, i2, false);
            Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30c39180cfc8de34a522179503824d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30c39180cfc8de34a522179503824d5");
            }
        }

        private a(String str, String str2, String str3, int i, int i2) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4698fb9bcf2280eac0e716c5546287", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4698fb9bcf2280eac0e716c5546287");
                return;
            }
            this.b = str;
            this.f = str2;
            this.c = str3;
            this.d = i;
            this.e = i2;
            this.g = false;
        }

        @Override // com.meituan.msc.devsupport.interfaces.a
        public final String a() {
            return this.b;
        }

        @Override // com.meituan.msc.devsupport.interfaces.a
        public final String b() {
            return this.c;
        }

        @Override // com.meituan.msc.devsupport.interfaces.a
        public final int c() {
            return this.d;
        }

        @Override // com.meituan.msc.devsupport.interfaces.a
        public final int d() {
            return this.e;
        }

        @Override // com.meituan.msc.devsupport.interfaces.a
        public final String e() {
            return this.f;
        }

        @Override // com.meituan.msc.devsupport.interfaces.a
        public final boolean f() {
            return this.g;
        }
    }

    public static com.meituan.msc.devsupport.interfaces.a[] a(@Nullable JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2b862018bace6a41e521ec4ccc1240b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.devsupport.interfaces.a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2b862018bace6a41e521ec4ccc1240b");
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        com.meituan.msc.devsupport.interfaces.a[] aVarArr = new com.meituan.msc.devsupport.interfaces.a[length];
        for (int i = 0; i < length; i++) {
            if (jSONArray.opt(i) instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("methodName");
                aVarArr[i] = new a(optJSONObject.optString("file"), optString, (!optJSONObject.has("lineNumber") || optJSONObject.isNull("lineNumber")) ? -1 : optJSONObject.optInt("lineNumber"), (!optJSONObject.has("column") || optJSONObject.isNull("column")) ? -1 : optJSONObject.optInt("column"), optJSONObject.has("collapse") && !optJSONObject.isNull("collapse") && optJSONObject.optBoolean("collapse"));
            } else if (jSONArray.opt(i) instanceof String) {
                aVarArr[i] = new a(jSONArray.optString(i));
            }
        }
        return aVarArr;
    }

    public static com.meituan.msc.devsupport.interfaces.a[] a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4d644bc8e139f82d61e321db25807d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.devsupport.interfaces.a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4d644bc8e139f82d61e321db25807d4");
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        com.meituan.msc.devsupport.interfaces.a[] aVarArr = new com.meituan.msc.devsupport.interfaces.a[stackTrace.length];
        for (int i = 0; i < stackTrace.length; i++) {
            aVarArr[i] = new a(stackTrace[i].getClassName(), stackTrace[i].getFileName(), stackTrace[i].getMethodName(), stackTrace[i].getLineNumber());
        }
        return aVarArr;
    }

    public static String a(com.meituan.msc.devsupport.interfaces.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b45a33bec8e0bda85499b44db9082615", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b45a33bec8e0bda85499b44db9082615");
        }
        StringBuilder sb = new StringBuilder();
        String a2 = aVar.a();
        if (a2 != null) {
            String[] split = a2.split("/");
            if (split.length >= 2) {
                str = TextUtils.join("/", new String[]{split[split.length - 2], split[split.length - 1]});
            }
        }
        if (str == null) {
            str = aVar.e();
        }
        sb.append(str);
        int c2 = aVar.c();
        if (c2 > 0) {
            sb.append(CommonConstant.Symbol.COLON);
            sb.append(c2);
            int d = aVar.d();
            if (d > 0) {
                sb.append(CommonConstant.Symbol.COLON);
                sb.append(d);
            }
        }
        return sb.toString();
    }
}
