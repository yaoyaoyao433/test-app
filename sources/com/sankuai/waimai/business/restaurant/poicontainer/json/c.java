package com.sankuai.waimai.business.restaurant.poicontainer.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends JSONObject {
    public static ChangeQuickRedirect a;
    private JsonObject b;

    public c(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2055f461e8b8e4c5a64586ccdf5693a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2055f461e8b8e4c5a64586ccdf5693a2");
        } else {
            this.b = jsonObject;
        }
    }

    @Override // org.json.JSONObject
    public final int length() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc8bdbaf1a6d333584befe59d3f3c41", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc8bdbaf1a6d333584befe59d3f3c41")).intValue() : this.b.size();
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, boolean z) throws JSONException {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26aa08c7ff587029c7ec9de72fd5cdbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26aa08c7ff587029c7ec9de72fd5cdbc");
        }
        this.b.addProperty(a(str), Boolean.valueOf(z));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, double d) throws JSONException {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6b8c06d9f4bda286f7c6ca1a670e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6b8c06d9f4bda286f7c6ca1a670e2e");
        }
        this.b.addProperty(a(str), Double.valueOf(b.a(d)));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, int i) throws JSONException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344d7fb221b5eca65479d3de2c360ff2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344d7fb221b5eca65479d3de2c360ff2");
        }
        this.b.addProperty(a(str), Integer.valueOf(i));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, long j) throws JSONException {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82080934359dcd66ff85b713eb92bd0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82080934359dcd66ff85b713eb92bd0e");
        }
        this.b.addProperty(a(str), Long.valueOf(j));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, Object obj) throws JSONException {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124ea5506bb0e2f4ac510094f9cfffde", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124ea5506bb0e2f4ac510094f9cfffde");
        }
        if (obj == null || obj == JsonNull.INSTANCE) {
            this.b.remove(str);
            return this;
        }
        if (obj instanceof JsonElement) {
            this.b.add(a(str), (JsonElement) obj);
        }
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject putOpt(String str, Object obj) throws JSONException {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23d89e59d77a78ea054b3bc8af76b61", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23d89e59d77a78ea054b3bc8af76b61") : (str == null || obj == null) ? this : put(str, obj);
    }

    private String a(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c398650a0f05a42005dc5e760e51794a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c398650a0f05a42005dc5e760e51794a");
        }
        if (str != null) {
            return str;
        }
        throw new JSONException("Names must be non-null");
    }

    @Override // org.json.JSONObject
    public final Object remove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95225e922d8694b3f221c9dee9c7b3b6", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95225e922d8694b3f221c9dee9c7b3b6") : this.b.remove(str);
    }

    @Override // org.json.JSONObject
    public final boolean isNull(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aee266d519a0ded84738b51390d887e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aee266d519a0ded84738b51390d887e")).booleanValue();
        }
        JsonElement jsonElement = this.b.get(str);
        return jsonElement == null || jsonElement == NULL;
    }

    @Override // org.json.JSONObject
    public final boolean has(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e19ec66a98591e5291cbf15d0a105a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e19ec66a98591e5291cbf15d0a105a")).booleanValue() : this.b.has(str);
    }

    @Override // org.json.JSONObject
    public final Object get(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6255a94ed8bc0fe88e9c29c7f53249b4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6255a94ed8bc0fe88e9c29c7f53249b4");
        }
        Object a2 = d.a(this.b.get(str));
        if (a2 != null) {
            return a2;
        }
        throw new JSONException("No value for " + str);
    }

    @Override // org.json.JSONObject
    public final Object opt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c4c718dd377da4d10febbd1e486aeb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c4c718dd377da4d10febbd1e486aeb") : d.a(this.b.get(str));
    }

    @Override // org.json.JSONObject
    public final boolean getBoolean(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d941934c1104d051e2be60588d5757a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d941934c1104d051e2be60588d5757a")).booleanValue();
        }
        Object obj = get(str);
        Boolean a2 = b.a(obj);
        if (a2 == null) {
            throw b.a(str, obj, Constants.BOOLEAN);
        }
        return a2.booleanValue();
    }

    @Override // org.json.JSONObject
    public final boolean optBoolean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c0f44b0c7363e09245891bf938f443", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c0f44b0c7363e09245891bf938f443")).booleanValue() : optBoolean(str, false);
    }

    @Override // org.json.JSONObject
    public final boolean optBoolean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02db725f8443b4f91d9de6d815a8831", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02db725f8443b4f91d9de6d815a8831")).booleanValue();
        }
        Boolean a2 = b.a(opt(str));
        return a2 != null ? a2.booleanValue() : z;
    }

    @Override // org.json.JSONObject
    public final double getDouble(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71790762e6d905a975c8353b406c8008", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71790762e6d905a975c8353b406c8008")).doubleValue();
        }
        Object obj = get(str);
        Double b = b.b(obj);
        if (b == null) {
            throw b.a(str, obj, Constants.DOUBLE);
        }
        return b.doubleValue();
    }

    @Override // org.json.JSONObject
    public final double optDouble(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d0d52cb76dcc385bbb1eaf14d12805", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d0d52cb76dcc385bbb1eaf14d12805")).doubleValue() : optDouble(str, 0.0d);
    }

    @Override // org.json.JSONObject
    public final double optDouble(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07fa82f66a7fa9a4fe50fb28dc0cc327", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07fa82f66a7fa9a4fe50fb28dc0cc327")).doubleValue();
        }
        Double b = b.b(opt(str));
        return b != null ? b.doubleValue() : d;
    }

    @Override // org.json.JSONObject
    public final int getInt(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ab33f04eabe7cbe298ec9d7c38bca2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ab33f04eabe7cbe298ec9d7c38bca2")).intValue();
        }
        Object obj = get(str);
        Integer c = b.c(obj);
        if (c == null) {
            throw b.a(str, obj, "int");
        }
        return c.intValue();
    }

    @Override // org.json.JSONObject
    public final int optInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fb15c14060651461e3fc360865e7f7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fb15c14060651461e3fc360865e7f7")).intValue() : optInt(str, 0);
    }

    @Override // org.json.JSONObject
    public final int optInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe6e71da10fa30b69d59874357df5a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe6e71da10fa30b69d59874357df5a4")).intValue();
        }
        Integer c = b.c(opt(str));
        return c != null ? c.intValue() : i;
    }

    @Override // org.json.JSONObject
    public final long getLong(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173dcd7a52c4ca471a99f9f736c0f410", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173dcd7a52c4ca471a99f9f736c0f410")).longValue();
        }
        Object obj = get(str);
        Long d = b.d(obj);
        if (d == null) {
            throw b.a(str, obj, Constants.LONG);
        }
        return d.longValue();
    }

    @Override // org.json.JSONObject
    public final long optLong(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea65552cc35b35ef6ecef44c14b6107", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea65552cc35b35ef6ecef44c14b6107")).longValue() : optLong(str, 0L);
    }

    @Override // org.json.JSONObject
    public final long optLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdcceba60a81926db52d5636ee05c69d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdcceba60a81926db52d5636ee05c69d")).longValue();
        }
        Long d = b.d(opt(str));
        return d != null ? d.longValue() : j;
    }

    @Override // org.json.JSONObject
    public final String getString(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf6c59f2c0bcccad239f77b0a101127", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf6c59f2c0bcccad239f77b0a101127");
        }
        Object obj = get(str);
        String e = b.e(obj);
        if (e != null) {
            return e;
        }
        throw b.a(str, obj, "String");
    }

    @Override // org.json.JSONObject
    public final String optString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62d46bc503e7771b3390d38f1803237", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62d46bc503e7771b3390d38f1803237") : optString(str, "");
    }

    @Override // org.json.JSONObject
    public final String optString(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f89822b10abbde857be201befb9919", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f89822b10abbde857be201befb9919");
        }
        String e = b.e(opt(str));
        return e != null ? e : str2;
    }

    @Override // org.json.JSONObject
    public final JSONArray getJSONArray(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43274f2d0a4bfbe5c388318a9865586b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43274f2d0a4bfbe5c388318a9865586b");
        }
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw b.a(str, obj, "JSONArray");
    }

    @Override // org.json.JSONObject
    public final JSONArray optJSONArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d411bebc31f75c8ffa405a066ddc64", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d411bebc31f75c8ffa405a066ddc64");
        }
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    @Override // org.json.JSONObject
    public final JSONObject getJSONObject(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e316f7d438feac770b20d89da7a273a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e316f7d438feac770b20d89da7a273a");
        }
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw b.a(str, obj, "JSONObject");
    }

    @Override // org.json.JSONObject
    public final JSONObject optJSONObject(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4b05a148dac3aa903220e6c53222b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4b05a148dac3aa903220e6c53222b2");
        }
        Object opt = opt(str);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    @Override // org.json.JSONObject
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f94758b176876b0612882d0633cd437", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f94758b176876b0612882d0633cd437");
        }
        if (this.b == null) {
            return super.toString();
        }
        return this.b.toString();
    }

    @Override // org.json.JSONObject
    public final Iterator<String> keys() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f02e75497966b209e14d7a8d82bdf7", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f02e75497966b209e14d7a8d82bdf7") : this.b.keySet().iterator();
    }
}
