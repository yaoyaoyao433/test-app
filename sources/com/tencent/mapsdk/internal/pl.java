package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.json.JsonEncoder;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.bn;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pl {
    private static final int e = 256;
    private static final String f = "custom-layer";
    private static final String g = "layer-infos";
    public qh a;
    public SharedPreferences c;
    private Context h;
    public List<pm> b = new ArrayList();
    public Set<a> d = new HashSet();

    public pl(Context context, qh qhVar, bn.b bVar) {
        this.h = context;
        this.a = qhVar;
        Context context2 = this.h;
        this.c = ke.a(context2, "custom-layer." + bVar.c());
        a();
    }

    private CustomLayer a(CustomLayerOptions customLayerOptions) {
        if (this.a != null) {
            StringBuilder sb = new StringBuilder("添加个性化图层[");
            sb.append(customLayerOptions.getLayerId());
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            kn.c(ki.a);
            qh qhVar = this.a;
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            String str = "custom_layer_" + kt.a(customLayerOptions.getLayerId());
            tileOverlayOptions.diskCacheDir(str);
            pm a2 = a(customLayerOptions.getLayerId());
            kn.a(ki.a, "cache_dir", (Object) str);
            if (a2 != null) {
                kn.a(ki.a, "version", (Object) a2.b);
                kn.a(ki.a, "minZoom", Integer.valueOf(a2.d));
                kn.a(ki.a, "maxZoom", Integer.valueOf(a2.c));
                kn.a(ki.a, "layerId", (Object) a2.a);
                tileOverlayOptions.tileProvider(new AnonymousClass1(a2));
                tileOverlayOptions.versionInfo(a2.b);
            }
            qc a3 = qhVar.a(tileOverlayOptions);
            pm a4 = a(customLayerOptions.getLayerId());
            if (a3 != null && a4 != null) {
                if (a4.e) {
                    a3.e();
                    a4.e = false;
                }
                a3.a(a4.d, a4.c);
            }
            this.a.h.d.c().a++;
            kn.e(ki.a);
            return new au(a3);
        }
        return null;
    }

    public final pm a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (pm pmVar : this.b) {
            if (pmVar != null && str.equals(pmVar.a)) {
                return pmVar;
            }
        }
        return null;
    }

    private void a() {
        if (this.c != null) {
            String string = this.c.getString(g, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        this.d.add((a) JsonUtils.parseToModel(jSONArray.getJSONObject(i), a.class, this));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    private void b() {
        boolean z;
        boolean z2;
        if (this.d.isEmpty() && !this.b.isEmpty()) {
            z = false;
            for (pm pmVar : this.b) {
                a aVar = new a(this, (byte) 0);
                aVar.d = pmVar.a;
                aVar.e = pmVar.b;
                this.d.add(aVar);
                z = true;
            }
        } else {
            z = false;
            for (pm pmVar2 : this.b) {
                Iterator<a> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    a next = it.next();
                    if (next.d.equals(pmVar2.a)) {
                        if (!next.e.equalsIgnoreCase(pmVar2.b)) {
                            pmVar2.e = true;
                            next.e = pmVar2.b;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    a aVar2 = new a(this, (byte) 0);
                    aVar2.d = pmVar2.a;
                    aVar2.e = pmVar2.b;
                    this.d.add(aVar2);
                    z = true;
                }
            }
        }
        if (z) {
            ke.a(this.c).a(g, JsonUtils.collectionToJson(this.d));
        }
    }

    private TileOverlayOptions b(CustomLayerOptions customLayerOptions) {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        String str = "custom_layer_" + kt.a(customLayerOptions.getLayerId());
        tileOverlayOptions.diskCacheDir(str);
        pm a2 = a(customLayerOptions.getLayerId());
        kn.a(ki.a, "cache_dir", (Object) str);
        if (a2 != null) {
            kn.a(ki.a, "version", (Object) a2.b);
            kn.a(ki.a, "minZoom", Integer.valueOf(a2.d));
            kn.a(ki.a, "maxZoom", Integer.valueOf(a2.c));
            kn.a(ki.a, "layerId", (Object) a2.a);
            tileOverlayOptions.tileProvider(new AnonymousClass1(a2));
            tileOverlayOptions.versionInfo(a2.b);
        }
        return tileOverlayOptions;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.pl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends UrlTileProvider {
        final /* synthetic */ pm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pm pmVar) {
            super(256, 256);
            this.a = pmVar;
        }

        @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
        public final URL getTileUrl(int i, int i2, int i3) {
            if (i3 > this.a.c || i3 < this.a.d) {
                return null;
            }
            try {
                return new URL(this.a.a(i, i2, i3));
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements JsonEncoder, JsonParser {
        private static final String b = "id";
        private static final String c = "version";
        private String d;
        private String e;

        private a() {
        }

        public /* synthetic */ a(pl plVar, byte b2) {
            this();
        }

        @Override // com.tencent.map.tools.json.JsonEncoder
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.d);
                jSONObject.put("version", this.e);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        @Override // com.tencent.map.tools.json.JsonParser
        public void parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.d = jSONObject.optString("id");
                this.e = jSONObject.optString("version");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.d == null ? aVar.d == null : this.d.equals(aVar.d)) {
                    return this.e != null ? this.e.equals(aVar.e) : aVar.e == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((this.d != null ? this.d.hashCode() : 0) * 31) + (this.e != null ? this.e.hashCode() : 0);
        }
    }

    private void a(pk pkVar) {
        boolean z;
        boolean z2;
        if (pkVar == null || !pkVar.a) {
            return;
        }
        this.b.clear();
        this.b.addAll(pkVar.b);
        if (this.d.isEmpty() && !this.b.isEmpty()) {
            z = false;
            for (pm pmVar : this.b) {
                a aVar = new a(this, (byte) 0);
                aVar.d = pmVar.a;
                aVar.e = pmVar.b;
                this.d.add(aVar);
                z = true;
            }
        } else {
            z = false;
            for (pm pmVar2 : this.b) {
                Iterator<a> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    a next = it.next();
                    if (next.d.equals(pmVar2.a)) {
                        if (!next.e.equalsIgnoreCase(pmVar2.b)) {
                            pmVar2.e = true;
                            next.e = pmVar2.b;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    a aVar2 = new a(this, (byte) 0);
                    aVar2.d = pmVar2.a;
                    aVar2.e = pmVar2.b;
                    this.d.add(aVar2);
                    z = true;
                }
            }
        }
        if (z) {
            ke.a(this.c).a(g, JsonUtils.collectionToJson(this.d));
        }
    }
}
