package com.sankuai.meituan.takeoutnew.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c h;
    public e<b> b;
    public a c;
    private ViewGroup d;
    private ViewGroup e;
    private boolean f;
    private HashMap<String, b> g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.takeoutnew.util.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0653c {
        public static ChangeQuickRedirect a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        ACCESS_FINE_LOCATION,
        ACCESS_COARSE_LOCATION,
        ACCESS_BACKGROUND_LOCATION,
        READ_PHONE_STATE,
        READ_CONTACTS,
        READ_EXTERNAL_STORAGE,
        WRITE_EXTERNAL_STORAGE,
        RECORD_AUDIO,
        CAMERA;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83fe95a3ebf787267c7e6985bfc1afd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83fe95a3ebf787267c7e6985bfc1afd");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2383f858e8193cd633115d8105a5f25", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2383f858e8193cd633115d8105a5f25") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1987bc61c7f85e59b01cf1c872b78339", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1987bc61c7f85e59b01cf1c872b78339") : (b[]) values().clone();
        }
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8d4e90c7d2f25a1b300b4e27535ad0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8d4e90c7d2f25a1b300b4e27535ad0");
            return;
        }
        this.f = false;
        this.b = new e<>("wm_permission");
        this.c = new a(Looper.getMainLooper());
        this.g = new HashMap<>();
        this.g.put("android.permission.ACCESS_FINE_LOCATION", b.ACCESS_FINE_LOCATION);
        this.g.put("android.permission.ACCESS_COARSE_LOCATION", b.ACCESS_COARSE_LOCATION);
        this.g.put("android.permission.ACCESS_BACKGROUND_LOCATION", b.ACCESS_BACKGROUND_LOCATION);
        this.g.put("android.permission.READ_PHONE_STATE", b.READ_PHONE_STATE);
        this.g.put("android.permission.READ_CONTACTS", b.READ_CONTACTS);
        this.g.put("android.permission.READ_EXTERNAL_STORAGE", b.READ_EXTERNAL_STORAGE);
        this.g.put("android.permission.WRITE_EXTERNAL_STORAGE", b.WRITE_EXTERNAL_STORAGE);
        this.g.put("android.permission.RECORD_AUDIO", b.RECORD_AUDIO);
        this.g.put("android.permission.CAMERA", b.CAMERA);
    }

    static {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C0653c.a;
        h = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bce270ee604e2007264ff464285ad88", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bce270ee604e2007264ff464285ad88") : new c();
    }

    public static c a() {
        return h;
    }

    public final void a(final Activity activity, final String[] strArr, final int i) {
        Object[] objArr = {activity, strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680bcd8b860d398ef92e14b5d91c6879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680bcd8b860d398ef92e14b5d91c6879");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                h.a(activity, strArr);
                this.c.postDelayed(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ccf73eec850fe7ef83b6d951d70f0bb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ccf73eec850fe7ef83b6d951d70f0bb");
                            return;
                        }
                        try {
                            activity.requestPermissions(strArr, i);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e);
                        }
                    }
                }, 500L);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ccde83737cd533a35f4708cf0bcf09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ccde83737cd533a35f4708cf0bcf09");
            return;
        }
        for (String str : strArr) {
            if (this.g.containsKey(str)) {
                this.b.a((e<b>) this.g.get(str), true);
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7d8b6116d8e860b382200449649defc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7d8b6116d8e860b382200449649defc");
        } else if (this.f && this.d != null && this.e != null) {
            this.d.removeView(this.e);
            this.e = null;
            this.f = false;
        }
    }

    public final void a(Activity activity, String[] strArr) {
        Object[] objArr = {activity, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85cdd7b2c0089b0d2dffe74c2b52996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85cdd7b2c0089b0d2dffe74c2b52996");
        } else if (!this.f) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                for (String str : strArr) {
                    if (this.g.containsKey(str) && (!this.b.b((e<b>) this.g.get(str), false) || ActivityCompat.shouldShowRequestPermissionRationale(activity, str))) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
                String a2 = a(arrayList);
                String b2 = b(arrayList);
                if (TextUtils.isEmpty(b2) && TextUtils.isEmpty(a2)) {
                    return;
                }
                this.d = (ViewGroup) activity.findViewById(16908290);
                Object[] objArr2 = {activity, a2, b2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef20cc3dfe16fb14d864418be8ef395d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef20cc3dfe16fb14d864418be8ef395d");
                } else if (this.d != null) {
                    if (this.e == null) {
                        this.e = (LinearLayout) LayoutInflater.from(com.meituan.android.singleton.b.a).inflate(R.layout.wm_permission_desc_layout, this.d, false);
                    }
                    if (this.e != null) {
                        if (com.sankuai.waimai.platform.capacity.immersed.a.a(activity)) {
                            int e = g.e(activity);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + e, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            this.e.setLayoutParams(marginLayoutParams);
                        }
                        ((TextView) this.e.findViewById(R.id.permission_title_txt)).setText(a2);
                        ((TextView) this.e.findViewById(R.id.permission_desc_txt)).setText(b2);
                        this.d.addView(this.e);
                        this.f = true;
                    }
                }
            } catch (Exception e2) {
                com.sankuai.waimai.foundation.utils.log.a.b(e2);
            }
        }
    }

    private String a(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158e7c82fdf78b204ca924c682aa378d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158e7c82fdf78b204ca924c682aa378d");
        }
        StringBuilder sb = new StringBuilder();
        String string = com.meituan.android.singleton.b.a.getString(R.string.wm_permission_common_title);
        String string2 = com.meituan.android.singleton.b.a.getString(R.string.wm_permission_connect_title);
        ArrayList arrayList2 = new ArrayList();
        boolean z = arrayList.contains("android.permission.ACCESS_FINE_LOCATION") || arrayList.contains("android.permission.ACCESS_COARSE_LOCATION") || arrayList.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
        boolean z2 = arrayList.contains("android.permission.READ_EXTERNAL_STORAGE") || arrayList.contains("android.permission.WRITE_EXTERNAL_STORAGE");
        if (arrayList.contains("android.permission.READ_PHONE_STATE")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_phone_title));
        }
        if (z) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_location_title));
        }
        if (arrayList.contains("android.permission.READ_CONTACTS")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_contacts_title));
        }
        if (z2) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_external_storage_title));
        }
        if (arrayList.contains("android.permission.RECORD_AUDIO")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_record_audio_title));
        }
        if (arrayList.contains("android.permission.CAMERA")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_camera_title));
        }
        int size = arrayList2.size();
        if (size > 0) {
            if (size == 1) {
                sb.append((String) arrayList2.get(0));
            } else if (size == 2) {
                sb.append((String) arrayList2.get(0));
                sb.append(string2);
                sb.append((String) arrayList2.get(1));
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        sb.append((String) arrayList2.get(i));
                    } else if (i == size - 1) {
                        sb.append(string2);
                        sb.append((String) arrayList2.get(i));
                    } else {
                        sb.append("、");
                        sb.append((String) arrayList2.get(i));
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append(string);
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }
    }

    private String b(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e5f0c98a2a4191ccecaa6999bddbde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e5f0c98a2a4191ccecaa6999bddbde");
        }
        String string = com.meituan.android.singleton.b.a.getString(R.string.wm_permission_permission_title);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z = arrayList.contains("android.permission.ACCESS_FINE_LOCATION") || arrayList.contains("android.permission.ACCESS_COARSE_LOCATION") || arrayList.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
        boolean z2 = arrayList.contains("android.permission.READ_EXTERNAL_STORAGE") || arrayList.contains("android.permission.WRITE_EXTERNAL_STORAGE");
        if (arrayList.contains("android.permission.READ_PHONE_STATE")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_phone_title));
            arrayList3.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_phone_state));
        }
        if (arrayList.contains("android.permission.READ_CONTACTS")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_contacts_title));
            arrayList3.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_contacts));
        }
        if (z2) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_external_storage_title));
            arrayList3.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_external_storage));
        }
        if (arrayList.contains("android.permission.RECORD_AUDIO")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_record_audio_title));
            arrayList3.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_record_audio));
        }
        if (arrayList.contains("android.permission.CAMERA")) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_camera_title));
            arrayList3.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_camera));
        }
        if (z) {
            arrayList2.add(com.meituan.android.singleton.b.a.getString(R.string.wm_permission_location_title));
            arrayList3.add(com.meituan.android.singleton.b.a.getString(arrayList3.size() > 0 ? R.string.wm_permission_location_more : R.string.wm_permission_location));
        }
        int size = arrayList3.size();
        if (size > 0) {
            if (size == 1) {
                sb.append((String) arrayList3.get(0));
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        sb.append(((String) arrayList2.get(i)) + string + ((String) arrayList3.get(i)));
                    } else {
                        sb.append("，");
                        sb.append(((String) arrayList2.get(i)) + string + ((String) arrayList3.get(i)));
                    }
                }
            }
        }
        return sb.toString();
    }
}
