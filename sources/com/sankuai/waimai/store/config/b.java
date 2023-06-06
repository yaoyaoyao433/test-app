package com.sankuai.waimai.store.config;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends a<JsonObject> {
    public static ChangeQuickRedirect b;
    private final g c;
    private JsonObject d;
    private final List<h> e;

    @Override // com.sankuai.waimai.store.config.a
    public final /* synthetic */ void a(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        Object[] objArr = {jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d2317baecc04b5215aca7d5976d84b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d2317baecc04b5215aca7d5976d84b");
            return;
        }
        this.d = jsonObject2;
        for (h hVar : this.e) {
            hVar.onLoadHornFinish();
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39eac66289cf343310cde9bb88ff3afd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39eac66289cf343310cde9bb88ff3afd");
            return;
        }
        this.c = new c();
        this.d = null;
        this.e = new ArrayList();
        e();
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8345de191fe5de4e13e09bca0b833f23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8345de191fe5de4e13e09bca0b833f23");
            return;
        }
        a();
        b();
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601fe4da163c29156288c381502b8f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601fe4da163c29156288c381502b8f4f");
        } else {
            b();
        }
    }

    public <T> T a(String str, Type type, T t) {
        Object[] objArr = {str, type, t};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dbc9ce85b475fe9baf71d9180f5d09e", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dbc9ce85b475fe9baf71d9180f5d09e") : (T) this.c.a(str, type, this.d, t);
    }

    public String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5194ac274acd42b925a498d30daed4c0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5194ac274acd42b925a498d30daed4c0") : (String) this.c.a(str, String.class, this.d, str2);
    }

    public int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ca13d0577296e590234e8c26332557", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ca13d0577296e590234e8c26332557")).intValue() : ((Integer) this.c.a(str, Integer.TYPE, this.d, Integer.valueOf(i))).intValue();
    }

    public long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4ecf7b2f20fbdf3245a8c1a87ec6ab", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4ecf7b2f20fbdf3245a8c1a87ec6ab")).longValue() : ((Long) this.c.a(str, Long.TYPE, this.d, Long.valueOf(j))).longValue();
    }

    public float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a6159dd4e8929c83a1f11f6d3c5f5d2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a6159dd4e8929c83a1f11f6d3c5f5d2")).floatValue() : ((Float) this.c.a(str, Float.TYPE, this.d, Float.valueOf(f))).floatValue();
    }

    public boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3ada6835d7ec74554c1074c5fca4de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3ada6835d7ec74554c1074c5fca4de")).booleanValue() : ((Boolean) this.c.a(str, Boolean.TYPE, this.d, Boolean.valueOf(z))).booleanValue();
    }

    public <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c917d31e752520b278d0184f0615dd", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c917d31e752520b278d0184f0615dd") : (T) this.c.a(str, type, this.d, null);
    }

    public String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37a1a02396a436d11858035ba1b7a51f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37a1a02396a436d11858035ba1b7a51f") : (String) this.c.a(str, String.class, this.d, "");
    }

    public int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a8712d999b836f70a8f6519839abfe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a8712d999b836f70a8f6519839abfe")).intValue() : ((Integer) this.c.a(str, Integer.TYPE, this.d, -1)).intValue();
    }

    public boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6008a4125fff92419d6495f6b145563", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6008a4125fff92419d6495f6b145563")).booleanValue() : ((Boolean) this.c.a(str, Boolean.TYPE, this.d, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    public List<String> e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cbe4a7453428ac339b8b486ff9e537", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cbe4a7453428ac339b8b486ff9e537") : (List) this.c.a(str, List.class, this.d, null);
    }

    public JsonObject g() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.store.config.a
    /* renamed from: f */
    public JsonObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a645dede86c2be0e983870b4f41976", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a645dede86c2be0e983870b4f41976");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new JsonParser().parse(str).getAsJsonObject();
        } catch (Exception unused) {
            com.sankuai.waimai.store.base.log.a.a(str, false);
            return null;
        }
    }

    public void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c801bf21936295036baf1d248ee1e4e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c801bf21936295036baf1d248ee1e4e9");
        } else if (hVar == null || this.e.contains(hVar)) {
        } else {
            this.e.add(hVar);
        }
    }
}
