package com.meituan.android.mrn.config.handler;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements com.meituan.android.mrn.utils.config.c<g> {
    public static ChangeQuickRedirect a;
    final String b;
    JsonObject c;
    protected Map<String, g> d;
    private boolean e;
    private final Map<String, Object> f;

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eba0367c1ca382c889838733aa6d76e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eba0367c1ca382c889838733aa6d76e");
            return;
        }
        this.e = false;
        this.c = null;
        this.f = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.b = str;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    void c2(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cadcd69d132ae00f6e549ebf19e0e62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cadcd69d132ae00f6e549ebf19e0e62f");
        } else if (this.c == null) {
        } else {
            String str = gVar.c;
            try {
                JsonElement jsonElement = this.c.get(str);
                if (jsonElement != null) {
                    this.f.put(str, com.meituan.android.mrn.utils.g.a().fromJson(jsonElement, gVar.f()));
                }
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("HornJsonConfig", String.format("Failed to parse value with key %s", str), th);
            }
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public final boolean b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4ce807ac474e60e938ede74d4daeea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4ce807ac474e60e938ede74d4daeea")).booleanValue() : this.f.containsKey(gVar.c);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    /* renamed from: e */
    public final Object a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39bbde4b24b14320ff2e78651e870b26", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39bbde4b24b14320ff2e78651e870b26") : this.f.get(gVar.c);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041ceb8f2d40459d6b995d16421af6c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041ceb8f2d40459d6b995d16421af6c9")).booleanValue() : this.d.isEmpty();
    }

    @Override // com.meituan.android.mrn.utils.config.c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void d(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f1bd0a13d96251afadce32cb675f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f1bd0a13d96251afadce32cb675f5f");
            return;
        }
        this.d.put(gVar.c, gVar);
        if (this.e) {
            c2(gVar);
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0bb5e34b785212f49d6b268449f400c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0bb5e34b785212f49d6b268449f400c");
            } else {
                HornCallback hornCallback = new HornCallback() { // from class: com.meituan.android.mrn.config.handler.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e11a5a094a9acdfa4851eb764f63ac0b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e11a5a094a9acdfa4851eb764f63ac0b");
                        } else if (z && !TextUtils.isEmpty(str)) {
                            try {
                                JsonElement parse = new JsonParser().parse(str);
                                if (parse.isJsonNull()) {
                                    return;
                                }
                                f.this.c = parse.getAsJsonObject();
                                for (g gVar2 : f.this.d.values()) {
                                    f.this.c2(gVar2);
                                }
                            } catch (Throwable th) {
                                com.facebook.common.logging.a.d("HornJsonConfig", String.format("Failed to parse horn data with key %s", f.this.b), th);
                            }
                        }
                    }
                };
                Horn.register(this.b, hornCallback);
                String accessCache = Horn.accessCache(this.b);
                if (!TextUtils.isEmpty(accessCache)) {
                    com.facebook.common.logging.a.b("HornJsonConfig", String.format("Load horn data from local: %s", accessCache));
                    hornCallback.onChanged(true, accessCache);
                }
            }
            this.e = true;
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public final void c(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e117f3a6a3959d4686f1e049f8c36f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e117f3a6a3959d4686f1e049f8c36f43");
        } else {
            this.d.remove(gVar.c);
        }
    }
}
