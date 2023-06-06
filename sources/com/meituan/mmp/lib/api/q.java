package com.meituan.mmp.lib.api;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private static b b;
    private static final String[] c = {"addPhoneContact", "chooseContact", "getAllContacts", "chooseImage", "chooseVideo", "chooseMedia", "previewMedia", "saveImageToPhotosAlbum", "saveVideoToPhotosAlbum", "compressImage"};

    public static /* synthetic */ void a(String str) {
        b bVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f68116fac6a1aa55e1015867333659b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f68116fac6a1aa55e1015867333659b0");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                bVar = (b) com.meituan.mmp.lib.utils.j.b.fromJson(str, (Class<Object>) b.class);
            } catch (Exception e) {
                e.printStackTrace();
                bVar = null;
            }
            if (bVar != null) {
                synchronized (b.class) {
                    b = bVar;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        @SerializedName("permissionApi")
        a b;
        @SerializedName("additionalRestrictedApis")
        List<String> c;
        @SerializedName("backgroundPermissionApi")
        a d;
        @SerializedName("enable")
        private boolean e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("apps")
        private Map<String, List<String>> b;
        @SerializedName("supportDefault")
        private List<String> c;

        public final boolean a(String str, String str2) {
            List<String> list;
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2847b08713ddd79618d1d81b154d014b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2847b08713ddd79618d1d81b154d014b")).booleanValue();
            }
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            if (this.c == null || !this.c.contains(str2)) {
                return (TextUtils.isEmpty(str) || this.b == null || this.b.size() <= 0 || (list = this.b.get(str)) == null || !list.contains(str2)) ? false : true;
            }
            return true;
        }
    }

    private static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "014e1934349390f67f171576fc2e05c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "014e1934349390f67f171576fc2e05c3");
        }
        try {
            return (b) com.meituan.mmp.lib.utils.j.b.fromJson("{\n\t\"permissionApi\": {\n\t\t\"apps\": {\n\t\t\t\"gh_84b9766b95bc\": [\"chooseImage\", \"saveImageToPhotosAlbum\"],\n\t\t\t\"mmp_87dffc23944d\": [\"chooseVideo\", \"chooseImage\"],\n\t\t\t\"a8720b841a3d4b1d\": [\"chooseImage\"],\n\t\t\t\"04cc18db1ee046b9\": [\"chooseImage\"],\n\t\t\t\"gh_2f6dc0344214\": [\"chooseImage\"]\n\t\t},\n\t\t\"supportDefault\": []\n\t},\n\t\"additionalRestrictedApis\": [],\n\t\"backgroundPermissionApi\": {\n\t\t\"apps\": {},\n\t\t\"supportDefault\": []\n\t}\n}", (Class<Object>) b.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "080e2949132af29b244af2f18cb83941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "080e2949132af29b244af2f18cb83941");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPPrivacy", "registerHorn mmp_privacy_config");
        HashMap hashMap = new HashMap();
        if (MMPEnvHelper.getEnvInfo() != null) {
            hashMap.put("mmpAppId", MMPEnvHelper.getEnvInfo().getAppID());
        }
        Horn.register("mmp_privacy_config", new HornCallback() { // from class: com.meituan.mmp.lib.api.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d909710bb586ba4e8b0909000a549660", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d909710bb586ba4e8b0909000a549660");
                    return;
                }
                if (z) {
                    q.a(str);
                }
                if (str != null) {
                    com.meituan.mmp.lib.trace.b.b("MMPPrivacy", "mmp_privacy_config " + str);
                }
            }
        }, hashMap);
    }

    private static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f07b8e75f53a01fa0632b666a37e7e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f07b8e75f53a01fa0632b666a37e7e6");
        }
        if (b == null) {
            b b2 = b();
            synchronized (b.class) {
                if (b == null) {
                    b = b2;
                }
            }
        }
        return b;
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0470f6266e4bf84b481be730a6277ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0470f6266e4bf84b481be730a6277ce")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : c) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61d75c3f9ca4f4e5b45d13f585e41d78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61d75c3f9ca4f4e5b45d13f585e41d78")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        boolean b2 = b(str2);
        b c2 = c();
        if (c2 == null || !c2.e) {
            return true;
        }
        if (!b2) {
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "b9c044cd7f3af4c7ec6d9cbc60132e16", RobustBitConfig.DEFAULT_VALUE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "b9c044cd7f3af4c7ec6d9cbc60132e16")).booleanValue();
            } else {
                z4 = (TextUtils.isEmpty(str2) || c2.c == null || !c2.c.contains(str2)) ? false : true;
            }
            if (z4) {
                b2 = true;
            }
        }
        if (b2) {
            if (z) {
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, c2, changeQuickRedirect3, false, "65916571f6f9f6f6f80700bdff4facb6", RobustBitConfig.DEFAULT_VALUE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, c2, changeQuickRedirect3, false, "65916571f6f9f6f6f80700bdff4facb6")).booleanValue();
                } else {
                    z3 = (TextUtils.isEmpty(str2) || c2.d == null || !c2.d.a(str, str2)) ? false : true;
                }
                if (z3) {
                    return true;
                }
            } else {
                Object[] objArr4 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, c2, changeQuickRedirect4, false, "cb49e51977b447f8b948dc116f608672", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, c2, changeQuickRedirect4, false, "cb49e51977b447f8b948dc116f608672")).booleanValue();
                } else {
                    z2 = (TextUtils.isEmpty(str2) || c2.b == null || !c2.b.a(str, str2)) ? false : true;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
