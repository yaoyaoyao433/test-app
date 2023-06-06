package com.sankuai.eh.plugins.skeleton.util;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.android.common.aidata.config.DBConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Map<String, JsonElement> b;
    public boolean c;
    public boolean d;
    private Context e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.skeleton.util.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0565b {
        void a(List<ArrayList<Integer>> list);
    }

    public static /* synthetic */ List a(b bVar, String str) {
        int i = 1;
        char c = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "472c8e422a83c34e7386b4d4614ad437", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "472c8e422a83c34e7386b4d4614ad437");
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        int length = split.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            String str2 = split[i4];
            ArrayList arrayList2 = new ArrayList();
            int i5 = i2;
            int i6 = i3;
            int i7 = 0;
            while (i7 < str2.length()) {
                char charAt = str2.charAt(i7);
                Object[] objArr2 = new Object[i];
                objArr2[c] = Integer.valueOf(charAt);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                int i8 = i7;
                String[] strArr = split;
                int intValue = PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d4877d00a9c458bb6b1fe14cdaea5e24", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d4877d00a9c458bb6b1fe14cdaea5e24")).intValue() : charAt == '+' ? 62 : charAt == '/' ? 63 : (charAt < '0' || charAt > '9') ? (charAt < 'A' || charAt > 'Z') ? (charAt < 'a' || charAt > 'z') ? -1 : (charAt + 26) - 97 : (charAt + 0) - 65 : (charAt + '4') - 48;
                if (intValue == -1) {
                    return new ArrayList();
                }
                int i9 = i5 + ((intValue & 31) << i6);
                if ((intValue & 32) > 0) {
                    i6 += 5;
                    i5 = i9;
                } else {
                    int i10 = i9 >> 1;
                    if ((i9 & 1) != 0) {
                        i10 = -i10;
                    }
                    arrayList2.add(Integer.valueOf(i10));
                    i5 = 0;
                    i6 = 0;
                }
                i7 = i8 + 1;
                split = strArr;
                i = 1;
                c = 0;
            }
            arrayList.add(arrayList2);
            i4++;
            i2 = i5;
            i3 = i6;
            i = 1;
            c = 0;
        }
        return arrayList;
    }

    public b(Context context, JsonElement jsonElement) {
        Object[] objArr = {context, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412fb23328c38a74d06e272679f8d59e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412fb23328c38a74d06e272679f8d59e");
            return;
        }
        this.e = context;
        this.b = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.c(jsonElement, "data"));
        this.c = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "notitlebar"), false).booleanValue();
        this.d = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "isFadeIn"), false).booleanValue();
        d.b("准备解析骨架屏...");
    }

    public final void a(InterfaceC0565b interfaceC0565b) {
        Object[] objArr = {interfaceC0565b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21db3f26fa111a3805e982a7c2fa6fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21db3f26fa111a3805e982a7c2fa6fd5");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new com.sankuai.eh.component.service.utils.thread.a(new a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(b(), "data"), ""), interfaceC0565b)));
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61756cb4640e41c6d241a54db41c78d5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61756cb4640e41c6d241a54db41c78d5")).intValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(b(), "type"), 1);
    }

    public final JsonElement b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b79fd1c598e5ed522e4d5dca052b8919", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b79fd1c598e5ed522e4d5dca052b8919") : this.b.get("content");
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b143b49f8062f4e646847190077f4ea1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b143b49f8062f4e646847190077f4ea1")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(this.b.get("hideStatusBar"), false).booleanValue();
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e199d975916fe7e6a03ca348d2457655", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e199d975916fe7e6a03ca348d2457655")).intValue() : a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.c(b(), DBConfig.KEY_SQL_CONFIG_VER), "bg"), ""), -1);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements a.InterfaceC0552a {
        public static ChangeQuickRedirect a;
        InterfaceC0565b b;
        private int d;
        private String e;

        public a(String str, InterfaceC0565b interfaceC0565b) {
            Object[] objArr = {b.this, str, interfaceC0565b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0dade9a71ceb0f5c687619668a8f81", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0dade9a71ceb0f5c687619668a8f81");
                return;
            }
            this.e = str;
            this.b = interfaceC0565b;
            this.d = com.sankuai.eh.component.service.utils.a.a();
        }

        @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
        public final void a() {
            char c = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932d16b48bd6ff4b24582a032c9bf624", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932d16b48bd6ff4b24582a032c9bf624");
                return;
            }
            d.b("vlq解析中......");
            if (this.e == null) {
                a(new ArrayList());
                return;
            }
            List<ArrayList<Integer>> a2 = b.a(b.this, this.e);
            int i = 0;
            while (i < a2.size()) {
                ArrayList<Integer> arrayList = a2.get(i);
                if (arrayList != null) {
                    int i2 = 5;
                    if (arrayList.size() == 5) {
                        int i3 = 0;
                        while (i3 < i2) {
                            b bVar = b.this;
                            int i4 = this.d;
                            int intValue = arrayList.get(i3).intValue();
                            Object[] objArr2 = new Object[2];
                            objArr2[c] = Integer.valueOf(i4);
                            objArr2[1] = Integer.valueOf(intValue);
                            ChangeQuickRedirect changeQuickRedirect2 = b.a;
                            arrayList.set(i3, Integer.valueOf(PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "89d60bcf479837b5769d7f61eafceb15", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "89d60bcf479837b5769d7f61eafceb15")).intValue() : com.sankuai.eh.component.service.utils.a.a((float) Math.round(((Math.min(i4, 768) / 7.5d) * intValue) / 1000.0d))));
                            i3++;
                            i2 = 5;
                            c = 0;
                        }
                    }
                }
                i++;
                c = 0;
            }
            a(a2);
        }

        private void a(List<ArrayList<Integer>> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ef57b0ca6d4bfa71bbffbb8822c563", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ef57b0ca6d4bfa71bbffbb8822c563");
            } else {
                com.sankuai.eh.component.service.utils.thread.b.a().a(c.a(this, list));
            }
        }
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2deba7f5f2ae8946d204e864f2996113", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2deba7f5f2ae8946d204e864f2996113")).intValue() : com.sankuai.eh.component.service.utils.a.a((float) Math.round(((Math.min(com.sankuai.eh.component.service.utils.a.a(), 768) / 7.5d) * i) / 1000.0d));
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8375619e33c80642893ff39262fcece5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8375619e33c80642893ff39262fcece5");
        }
        if (obj instanceof Map) {
            JsonArray jsonArray = new JsonArray();
            try {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.add((String) entry.getKey(), new JsonPrimitive((Number) entry.getValue()));
                    jsonArray.add(jsonObject);
                }
            } catch (Exception e) {
                d.a(e);
            }
            return com.sankuai.eh.component.service.utils.b.a((JsonElement) jsonArray);
        }
        return null;
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "387258764bd0e4b4124b0f363b20d978", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "387258764bd0e4b4124b0f363b20d978")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder("#");
                if (str.length() == 6) {
                    sb.append(str);
                }
                if (str.length() == 8) {
                    sb.append(str.substring(str.length() - 2));
                    sb.append(str.substring(0, str.length() - 2));
                }
                if (sb.length() > 0) {
                    return Color.parseColor(sb.toString());
                }
            } catch (Exception e) {
                d.a(e);
            }
        }
        return i;
    }
}
