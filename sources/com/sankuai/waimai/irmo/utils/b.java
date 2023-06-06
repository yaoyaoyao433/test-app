package com.sankuai.waimai.irmo.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final HashMap<String, Boolean> b;
    private final ArrayList<Integer> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6441c0be06364205badce47ca4331946", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6441c0be06364205badce47ca4331946");
            return;
        }
        this.b = new HashMap<>();
        this.c = new ArrayList<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c99a7a1a4c01d6b94c3c382398327fbd", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c99a7a1a4c01d6b94c3c382398327fbd") : a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0979b implements HornCallback {
        public static ChangeQuickRedirect a;
        public String b;

        public C0979b(String str) {
            Object[] objArr = {b.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c574f9e51b6f597626b2a23038cfc0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c574f9e51b6f597626b2a23038cfc0c");
            } else {
                this.b = str;
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53513041fbfe15e717abf70739c59640", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53513041fbfe15e717abf70739c59640");
                return;
            }
            d.b("[Horn] des:" + this.b + ", enable-" + z + ", result:" + str, new Object[0]);
            if (z) {
                b.this.a(str);
            }
        }
    }

    public final synchronized boolean a(int i, String str) {
        Boolean bool;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2cd909baf0126723df9f07de200bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2cd909baf0126723df9f07de200bd7")).booleanValue();
        }
        try {
        } catch (Exception e) {
            d.e(e.getMessage(), new Object[0]);
        }
        if (a(i)) {
            d.a("[isNeedDowngrade] engineType:" + i + "，businessId:" + str + ", engine need downgrade = true", new Object[0]);
            return true;
        }
        if (this.b.containsKey(str) && (bool = this.b.get(str)) != null) {
            d.a("[isNeedDowngrade] engineType:" + i + "，businessId:" + str + ", business need downgrade = " + bool, new Object[0]);
            return bool.booleanValue();
        }
        d.a("[isNeedDowngrade] engineType:" + i + "，businessId:" + str + ", downgrade = false", new Object[0]);
        return false;
    }

    private synchronized boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e47091b8c3af4f0b50b58a77fcab430", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e47091b8c3af4f0b50b58a77fcab430")).booleanValue();
        }
        return this.c.contains(Integer.valueOf(i));
    }

    synchronized void a(String str) {
        int parseInt;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "105b617a5a9b91676743440a3b1faa13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "105b617a5a9b91676743440a3b1faa13");
            return;
        }
        this.c.clear();
        this.b.clear();
        try {
            HashMap hashMap = (HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.irmo.utils.b.1
            }.getType());
            if (hashMap != null && hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if ("infinite_engine_downgrade_switch".equals(str2) && (value instanceof ArrayList)) {
                        Iterator it = ((ArrayList) value).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if ((next instanceof String) && (parseInt = NumberUtils.parseInt((String) next, -1)) != -1) {
                                this.c.add(Integer.valueOf(parseInt));
                            }
                        }
                    } else if (value instanceof Boolean) {
                        this.b.put(str2, Boolean.valueOf(((Boolean) value).booleanValue()));
                    }
                }
            }
            d.a("sDowngradeStrategyCache:" + this.b.toString(), new Object[0]);
            d.a("sDowngradeEngineCache:" + this.c.toString(), new Object[0]);
        } catch (Exception e) {
            d.e(e.getMessage(), new Object[0]);
        }
    }
}
