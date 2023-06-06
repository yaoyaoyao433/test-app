package com.meituan.android.clipboard;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.clipboard.config.a;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.privacy.interfaces.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static Context b = null;
    private static volatile boolean c = false;
    private static volatile boolean d = false;
    private static s e;
    private static com.meituan.android.clipboard.reporter.a f;
    private static volatile com.meituan.android.clipboard.config.a g;
    private static final ArrayList<InterfaceC0192a> h = new ArrayList<>();

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.clipboard.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0192a {
        void a();
    }

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be3c84fba239fb5a3e50485514be09d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be3c84fba239fb5a3e50485514be09d5");
            return;
        }
        String accessCache = Horn.accessCache("clipboard_base_component_config_v2");
        Horn.register("clipboard_base_component_config_v2", new HornCallback() { // from class: com.meituan.android.clipboard.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2cc21991659d47cf3bf08c3fcb0e9e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2cc21991659d47cf3bf08c3fcb0e9e8");
                    return;
                }
                if (z && !TextUtils.isEmpty(str)) {
                    a.a(a.d(str));
                } else {
                    a.a((com.meituan.android.clipboard.config.a) null);
                }
                if (a.c) {
                    return;
                }
                a.e();
            }
        });
        if (TextUtils.isEmpty(accessCache)) {
            return;
        }
        g = d(accessCache);
        e();
    }

    @MainThread
    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d264c0fd9b7365b703f532bafdb854c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d264c0fd9b7365b703f532bafdb854c8");
        } else {
            a(context, (InterfaceC0192a) null);
        }
    }

    @MainThread
    public static void a(Context context, InterfaceC0192a interfaceC0192a) {
        Object[] objArr = {context, interfaceC0192a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c8f8402fd475068b1b193b09c0a37ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c8f8402fd475068b1b193b09c0a37ef");
        } else if (c) {
            if (interfaceC0192a != null) {
                interfaceC0192a.a();
            }
        } else if (context == null) {
        } else {
            if (interfaceC0192a != null) {
                synchronized (h) {
                    if (!c) {
                        h.add(interfaceC0192a);
                    } else {
                        interfaceC0192a.a();
                    }
                }
            }
            if (d) {
                return;
            }
            d = true;
            b = context.getApplicationContext();
            h();
            com.sankuai.android.jarvis.c.a("clipboard-horn", new Runnable() { // from class: com.meituan.android.clipboard.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fafaabdec8afb2f852d0fccae83116d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fafaabdec8afb2f852d0fccae83116d3");
                    } else {
                        a.a();
                    }
                }
            }).start();
        }
    }

    public static void a(InterfaceC0192a interfaceC0192a) {
        Object[] objArr = {interfaceC0192a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d4905da08fd7d7b670faf705e2921a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d4905da08fd7d7b670faf705e2921a4");
            return;
        }
        synchronized (h) {
            h.remove(interfaceC0192a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "588a21ac6f28b57a02c5f8af50eace65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "588a21ac6f28b57a02c5f8af50eace65");
            return;
        }
        synchronized (h) {
            if (c) {
                return;
            }
            int size = h.size();
            Handler handler = new Handler(Looper.getMainLooper());
            for (int i = 0; i < size; i++) {
                InterfaceC0192a interfaceC0192a = h.get(i);
                if (interfaceC0192a != null) {
                    a(handler, interfaceC0192a);
                }
            }
            h.clear();
            c = true;
        }
    }

    private static void a(Handler handler, final InterfaceC0192a interfaceC0192a) {
        Object[] objArr = {handler, interfaceC0192a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19ee7f193cfd8c412ebe90dfd63f37a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19ee7f193cfd8c412ebe90dfd63f37a0");
        } else {
            handler.post(new Runnable() { // from class: com.meituan.android.clipboard.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78c1206d2d8218b06526dc67acec0fa9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78c1206d2d8218b06526dc67acec0fa9");
                    } else if (InterfaceC0192a.this != null) {
                        InterfaceC0192a.this.a();
                    }
                }
            });
        }
    }

    public static void a(com.meituan.android.clipboard.config.a aVar) {
        g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.meituan.android.clipboard.config.a d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a21e5b69d0b71e760db0069d2320db4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.clipboard.config.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a21e5b69d0b71e760db0069d2320db4f");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("read_switch", true);
            boolean optBoolean2 = jSONObject.optBoolean("write_switch", true);
            JSONArray optJSONArray = jSONObject.optJSONArray("read_black_list");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i);
                a.C0193a c0193a = new a.C0193a();
                c0193a.a = jSONObject2.optString("model");
                c0193a.b = jSONObject2.optString("version");
                if (a(c0193a)) {
                    arrayList.add(c0193a);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("write_black_list");
            ArrayList arrayList2 = new ArrayList();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject3 = (JSONObject) optJSONArray2.get(i2);
                a.C0193a c0193a2 = new a.C0193a();
                c0193a2.a = jSONObject3.optString("model");
                c0193a2.b = jSONObject3.optString("version");
                if (a(c0193a2)) {
                    arrayList2.add(c0193a2);
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("clipboard_regex_list");
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                String optString = optJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList3.add(optString);
                }
            }
            com.meituan.android.clipboard.config.a aVar = new com.meituan.android.clipboard.config.a();
            aVar.a = arrayList3;
            aVar.b = optBoolean;
            aVar.d = optBoolean2;
            aVar.c = arrayList;
            aVar.e = arrayList2;
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean a(a.C0193a c0193a) {
        Object[] objArr = {c0193a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09e0d2166afb608bbdf96c7eac2dc3bc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09e0d2166afb608bbdf96c7eac2dc3bc")).booleanValue() : (TextUtils.isEmpty(c0193a.a) || TextUtils.isEmpty(c0193a.b)) ? false : true;
    }

    private static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07629402272f68af6c3afa8034835b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07629402272f68af6c3afa8034835b2c")).booleanValue();
        }
        com.meituan.android.clipboard.config.a aVar = g;
        if (aVar == null || aVar.b || c.a) {
            if (aVar == null || aVar.c == null || aVar.c.isEmpty()) {
                return false;
            }
            for (int i = 0; i < aVar.c.size(); i++) {
                a.C0193a c0193a = aVar.c.get(i);
                if (Build.MANUFACTURER != null && Build.MANUFACTURER.equalsIgnoreCase(c0193a.a)) {
                    return d.a(c0193a.a, c0193a.b);
                }
            }
            return false;
        }
        return true;
    }

    private static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d0a6103b662a606d65adccee840ec06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d0a6103b662a606d65adccee840ec06")).booleanValue();
        }
        com.meituan.android.clipboard.config.a aVar = g;
        if (aVar == null || aVar.d || c.a) {
            if (aVar == null || aVar.e == null || aVar.e.isEmpty()) {
                return false;
            }
            for (int i = 0; i < aVar.e.size(); i++) {
                a.C0193a c0193a = aVar.e.get(i);
                if (Build.MANUFACTURER != null && Build.MANUFACTURER.equalsIgnoreCase(c0193a.a)) {
                    return d.a(c0193a.a, c0193a.b);
                }
            }
            return false;
        }
        return true;
    }

    public static void a(CharSequence charSequence, @NonNull String str, @NonNull String str2) {
        Object[] objArr = {charSequence, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "966457514cb4552ca5b9656026baee7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "966457514cb4552ca5b9656026baee7c");
            return;
        }
        Object[] objArr2 = {str2, null, charSequence, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1abbb682cfa30e3f23ec79172a147254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1abbb682cfa30e3f23ec79172a147254");
        } else {
            a(str2, null, charSequence, str, null);
        }
    }

    public static void a(String str, CharSequence charSequence, @NonNull String str2, b bVar) {
        Object[] objArr = {str, charSequence, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd1741440adf0e54b89afb571c305b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd1741440adf0e54b89afb571c305b89");
        } else {
            a(str2, str, charSequence, str2, false, bVar);
        }
    }

    public static void a(@NonNull String str, String str2, CharSequence charSequence, @NonNull String str3, b bVar) {
        Object[] objArr = {str, str2, charSequence, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "392733b606e1812e01f2cf9706b447c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "392733b606e1812e01f2cf9706b447c7");
        } else {
            a(str, str2, charSequence, str3, false, bVar);
        }
    }

    private static void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39fe828d9c44991702b6312a9c57bb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39fe828d9c44991702b6312a9c57bb7b");
        } else if (e == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e = Privacy.createPrivateClipboardManager(b);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.clipboard.a.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "506330024d33dcb1dd5b295ea3539fc3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "506330024d33dcb1dd5b295ea3539fc3");
                        } else {
                            s unused = a.e = Privacy.createPrivateClipboardManager(a.b);
                        }
                    }
                });
            }
        }
    }

    private static void a(String str, String str2, CharSequence charSequence, @NonNull String str3, boolean z, b bVar) {
        Object[] objArr = {str, str2, charSequence, str3, (byte) 0, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1ebe2c0531fd52ecc967bf14001909c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1ebe2c0531fd52ecc967bf14001909c");
        } else if (!e(str)) {
            if (bVar != null) {
                bVar.onFail(5, null);
            }
        } else if (g()) {
            if (bVar != null) {
                bVar.onFail(3, null);
            }
        } else if (TextUtils.isEmpty(charSequence)) {
            if (bVar != null) {
                bVar.onFail(4, null);
            }
        } else if (e == null) {
            if (bVar != null) {
                bVar.onFail(0, null);
            }
        } else {
            e.a(str, ClipData.newPlainText(str2, charSequence));
            if (bVar != null) {
                bVar.onSuccess();
            }
            a(1, str3);
        }
    }

    private static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea3d0e5bc7d0bbf4ef5a64e4326f7cc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea3d0e5bc7d0bbf4ef5a64e4326f7cc4")).booleanValue();
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        return createPermissionGuard != null && createPermissionGuard.a(b, PermissionGuard.PERMISSION_CLIPBOARD, str) > 0;
    }

    public static CharSequence a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9ff6dcd676c28b6b0ac3d496f6c7bfe", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9ff6dcd676c28b6b0ac3d496f6c7bfe") : a(str, str2, (b) null);
    }

    public static CharSequence a(@NonNull String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d10f14f04a0c0b770ee6c0135b405985", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d10f14f04a0c0b770ee6c0135b405985") : a(str, str, false, bVar);
    }

    public static CharSequence a(@NonNull String str, @NonNull String str2, b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2de0160e9da8ee0c9f6d073a9bcf8328", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2de0160e9da8ee0c9f6d073a9bcf8328") : a(str, str2, false, bVar);
    }

    private static CharSequence a(@NonNull String str, @NonNull String str2, boolean z, b bVar) {
        ClipData.Item itemAt;
        Object[] objArr = {str, str2, (byte) 0, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "928737b00912471c54d622d6d096d8b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "928737b00912471c54d622d6d096d8b5");
        }
        if (!e(str)) {
            if (bVar != null) {
                bVar.onFail(5, null);
                return "";
            }
            return "";
        } else if (f()) {
            if (bVar != null) {
                bVar.onFail(2, null);
                return "";
            }
            return "";
        } else {
            try {
                if (e == null) {
                    if (bVar != null) {
                        bVar.onFail(0, null);
                        return "";
                    }
                    return "";
                }
                com.meituan.android.clipboard.config.a aVar = g;
                ClipData b2 = e.b(str);
                if (b2 == null || b2.getItemCount() <= 0 || (itemAt = b2.getItemAt(0)) == null || TextUtils.isEmpty(itemAt.getText())) {
                    return "";
                }
                if (bVar != null) {
                    bVar.onSuccess();
                }
                a(2, str2);
                CharSequence coerceToText = itemAt.coerceToText(b);
                if (aVar != null && aVar.a != null && aVar.a.size() > 0) {
                    aVar.a.get(0);
                }
                return coerceToText;
            } catch (Exception e2) {
                if (bVar != null) {
                    bVar.onFail(1, e2);
                    return "";
                }
                return "";
            }
        }
    }

    public static String a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "304838216aa2ab10ef1c28ec31c66ac8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "304838216aa2ab10ef1c28ec31c66ac8") : b(str, str, null);
    }

    private static String b(@NonNull String str, @NonNull String str2, b bVar) {
        ClipDescription c2;
        Object[] objArr = {str, str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc57bed640497cb8e05f4b2b9187c731", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc57bed640497cb8e05f4b2b9187c731");
        }
        if (e(str) && !f()) {
            try {
                if (e == null || (c2 = e.c(str)) == null || TextUtils.isEmpty(c2.getLabel())) {
                    return "";
                }
                a(3, str2);
                return c2.getLabel().toString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static void b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a1743440c930ce4a53c8a7c5bc146b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a1743440c930ce4a53c8a7c5bc146b2");
            return;
        }
        Object[] objArr2 = {str, null, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "21c3ce48a0288bc91928c1ccb49c54a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "21c3ce48a0288bc91928c1ccb49c54a6");
        } else {
            a(str, (String) null, str, (b) null);
        }
    }

    private static void a(@NonNull String str, String str2, @NonNull String str3, b bVar) {
        Object[] objArr = {str, str2, str3, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba2d7ba8757f868bbdd2b0da97993940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba2d7ba8757f868bbdd2b0da97993940");
        } else if (e(str) && !g()) {
            try {
                if (e == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    e.a(str);
                } else {
                    e.a(str, ClipData.newPlainText(str2, ""));
                }
                a(5, str3);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32fc25606a24b0ac829f8aaf76fcdba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32fc25606a24b0ac829f8aaf76fcdba4");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(i));
            hashMap.put(KnbConstants.PARAMS_SCENE, str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("manufacturer", Build.MANUFACTURER);
            hashMap2.put("inner_ver", d.a());
            hashMap2.put("user_agent", Objects.requireNonNull(System.getProperty("http.agent")));
            hashMap.put("extra", new Gson().toJson(hashMap2));
            if (f != null) {
                com.meituan.android.clipboard.reporter.b bVar = new com.meituan.android.clipboard.reporter.b();
                bVar.a = "met_clipboard";
                bVar.b = str;
                bVar.c = hashMap;
            }
        } catch (Exception unused) {
        }
    }
}
