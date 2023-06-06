package com.meituan.android.yoda.data;

import android.support.constraint.R;
import android.support.v4.util.ArrayMap;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb37d0bf6b564854333ff7b0fa07dd3a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb37d0bf6b564854333ff7b0fa07dd3a")).booleanValue() : i == 1 || i == 71 || i == 103 || i == 130 || i == 163;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c84d950c532763c05373e56f72fddd95", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c84d950c532763c05373e56f72fddd95")).booleanValue() : a.a().a(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static ArrayMap<Integer, String> b = new ArrayMap<>();
        private static Map<Integer, String> c = new ArrayMap();
        private static a d = new a();

        static {
            b.put(106, x.a((int) R.string.yoda_verify_type_enum_voice_verify));
            b.put(108, x.a((int) R.string.yoda_verify_type_enum_face_verify));
            b.put(109, x.a((int) R.string.yoda_verify_type_enum_verify_liveness));
            b.put(122, x.a((int) R.string.yoda_verify_type_enum_third_party_verify));
            b.put(143, x.a((int) R.string.yoda_verify_type_enum_certification_face));
            b.put(144, x.a((int) R.string.yoda_verify_type_enum_certification_sms));
            b.put(145, x.a((int) R.string.yoda_verify_type_enum_certification_operator));
            b.put(146, x.a((int) R.string.yoda_verify_type_enum_certification_simplify));
            c.put(Integer.MAX_VALUE, "");
            c.put(2147483646, "");
            c.put(2147483645, "");
            c.put(2147483643, "");
            b.putAll(c);
        }

        public static a a() {
            return d;
        }

        public final boolean a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e2c1675e3839982a963b58549b0ee0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e2c1675e3839982a963b58549b0ee0")).booleanValue();
            }
            for (Map.Entry<Integer, String> entry : b.entrySet()) {
                if (entry.getKey().intValue() == i) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04de46692263f0a25ea3c7af5d6fe1c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04de46692263f0a25ea3c7af5d6fe1c")).booleanValue();
            }
            for (Map.Entry<Integer, String> entry : c.entrySet()) {
                if (entry.getKey().intValue() == i) {
                    return true;
                }
            }
            return false;
        }
    }
}
