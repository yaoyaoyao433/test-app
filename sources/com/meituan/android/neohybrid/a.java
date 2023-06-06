package com.meituan.android.neohybrid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98c1ffeb930352b67205ed76f4ab5cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98c1ffeb930352b67205ed76f4ab5cf5");
        } else {
            a(intent, str, str2, EnumC0301a.JSON);
        }
    }

    @SuppressLint({"IntentExtraKey"})
    public static void a(Intent intent, String str, Object obj, EnumC0301a enumC0301a) {
        Object[] objArr = {intent, str, obj, enumC0301a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e30a5e1bc36a7d012f980fa61820d932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e30a5e1bc36a7d012f980fa61820d932");
        } else if (intent == null || obj == null || TextUtils.isEmpty(str)) {
        } else {
            Bundle bundleExtra = intent.getBundleExtra("_neo_data");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            a(bundleExtra, str, obj, enumC0301a);
            intent.putExtra("_neo_data", bundleExtra);
        }
    }

    private static void a(Bundle bundle, String str, Object obj, EnumC0301a enumC0301a) {
        Object[] objArr = {bundle, str, obj, enumC0301a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2144cda10ae7a8e32de3aa67a3699fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2144cda10ae7a8e32de3aa67a3699fb2");
        } else if (bundle == null || obj == null || enumC0301a == null || TextUtils.isEmpty(str)) {
        } else {
            Bundle bundle2 = bundle.getBundle(enumC0301a.e);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("neo_json_data".equals(enumC0301a.e) || "neo_string_data".equals(enumC0301a.e)) {
                a(bundle2, str, obj);
            } else if ("neo_obj_data".equals(enumC0301a.e)) {
                b(bundle2, str, obj);
            }
            bundle.putBundle(enumC0301a.e, bundle2);
        }
    }

    private static void a(Bundle bundle, String str, Object obj) {
        String obj2;
        Object[] objArr = {bundle, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "370892a226f8ab7a441b939b2b047a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "370892a226f8ab7a441b939b2b047a2c");
            return;
        }
        if ((obj instanceof String) || (obj instanceof JSONObject)) {
            obj2 = obj.toString();
        } else {
            obj2 = com.meituan.android.neohybrid.util.gson.b.a().toJson(obj);
        }
        bundle.putString(str, obj2);
    }

    private static void b(Bundle bundle, String str, Object obj) {
        Object[] objArr = {bundle, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "186150dc1c8078add464eab48b6d818a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "186150dc1c8078add464eab48b6d818a");
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        }
    }

    public static Bundle a(Intent intent, EnumC0301a enumC0301a) {
        Bundle bundleExtra;
        Object[] objArr = {intent, enumC0301a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b91ad7bf901754f9806fc02acf195113", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b91ad7bf901754f9806fc02acf195113");
        }
        if (intent == null || enumC0301a == null || (bundleExtra = intent.getBundleExtra("_neo_data")) == null) {
            return null;
        }
        return bundleExtra.getBundle(enumC0301a.e);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0301a {
        JSON("neo_json_data"),
        STRING("neo_string_data"),
        OBJ("neo_obj_data");
        
        public static ChangeQuickRedirect a;
        String e;

        public static EnumC0301a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f86204e01b19be8b243639fb397b33fd", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0301a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f86204e01b19be8b243639fb397b33fd") : (EnumC0301a) Enum.valueOf(EnumC0301a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0301a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f82741652977aecfd02ab9343663dea8", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0301a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f82741652977aecfd02ab9343663dea8") : (EnumC0301a[]) values().clone();
        }

        EnumC0301a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a38264f3696d69b31b5eb950aaae423", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a38264f3696d69b31b5eb950aaae423");
            } else {
                this.e = str;
            }
        }
    }
}
