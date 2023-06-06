package com.sankuai.waimai.business.restaurant.poicontainer.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends JSONArray {
    public static ChangeQuickRedirect a;
    public JsonArray b;

    public a(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d158c2324cc5faf2a6dcba52c92c99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d158c2324cc5faf2a6dcba52c92c99");
        } else {
            this.b = jsonArray;
        }
    }

    @Override // org.json.JSONArray
    public final int length() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcf2101c481145df5ec5e1ce22d770e4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcf2101c481145df5ec5e1ce22d770e4")).intValue() : this.b.size();
    }

    @Override // org.json.JSONArray
    public final JSONArray put(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3069d7ec7f3529078d5c1a49ba0710", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3069d7ec7f3529078d5c1a49ba0710");
        }
        this.b.add(Boolean.valueOf(z));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(double d) throws JSONException {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829afb76008e8c0f481926523c879a9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829afb76008e8c0f481926523c879a9d");
        }
        this.b.add(Double.valueOf(b.a(d)));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434b601ac9bd030339068209180a5bce", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434b601ac9bd030339068209180a5bce");
        }
        this.b.add(Integer.valueOf(i));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32a240930a08d3a17d96fbfefb338bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32a240930a08d3a17d96fbfefb338bb");
        }
        this.b.add(Long.valueOf(j));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217ee3defc7d38963ddd01ce8deed4a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217ee3defc7d38963ddd01ce8deed4a5");
        }
        if (obj instanceof JsonElement) {
            this.b.add((JsonElement) obj);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.e("JSONArrayDelegate", "JSONArray put", new Object[0]);
        }
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, boolean z) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3971938c015980ab914bd9b55a9981a", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3971938c015980ab914bd9b55a9981a") : put(i, Boolean.valueOf(z));
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, double d) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54200000e9e0aaadf8fbbad1df0a5889", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54200000e9e0aaadf8fbbad1df0a5889") : put(i, Double.valueOf(d));
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, int i2) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf08b55f208066eabd0c4b018396403", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf08b55f208066eabd0c4b018396403") : put(i, Integer.valueOf(i2));
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, long j) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4487fbdef76504990a22ca4e28cc8d90", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4487fbdef76504990a22ca4e28cc8d90") : put(i, Long.valueOf(j));
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, Object obj) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ab563bde7003f15ccc5cbad32a3f36", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ab563bde7003f15ccc5cbad32a3f36");
        }
        while (this.b.size() <= i) {
            this.b.add(JsonNull.INSTANCE);
        }
        if (obj instanceof JsonElement) {
            this.b.set(i, (JsonElement) obj);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.e("JSONArrayDelegate", "JSONArray put(int index, Object value)", new Object[0]);
        }
        return this;
    }

    @Override // org.json.JSONArray
    public final boolean isNull(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e11b14cb3739f05a0ae8902e9bb5b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e11b14cb3739f05a0ae8902e9bb5b0b")).booleanValue();
        }
        Object opt = opt(i);
        return opt == null || opt == JsonNull.INSTANCE;
    }

    @Override // org.json.JSONArray
    public final Object get(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8d84d666af9151bd9a01e3099a31e4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8d84d666af9151bd9a01e3099a31e4");
        }
        try {
            Object a2 = d.a(this.b.get(i));
            if (a2 != null) {
                return a2;
            }
            throw new JSONException("Value at " + i + " is null.");
        } catch (IndexOutOfBoundsException unused) {
            throw new JSONException("Index " + i + " out of range [0.." + this.b.size() + CommonConstant.Symbol.BRACKET_RIGHT);
        }
    }

    @Override // org.json.JSONArray
    public final Object opt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2be17aa289b4dc39cc604c754913dd", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2be17aa289b4dc39cc604c754913dd");
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return d.a(this.b.get(i));
    }

    @Override // org.json.JSONArray
    public final Object remove(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "284bf8da7df070ee78699e038dace871", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "284bf8da7df070ee78699e038dace871");
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.remove(i);
    }

    @Override // org.json.JSONArray
    public final boolean getBoolean(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1155a67dcd096c2ece7a23c79e75b8c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1155a67dcd096c2ece7a23c79e75b8c0")).booleanValue();
        }
        Object obj = get(i);
        Boolean a2 = b.a(obj);
        if (a2 == null) {
            throw b.a(Integer.valueOf(i), obj, Constants.BOOLEAN);
        }
        return a2.booleanValue();
    }

    @Override // org.json.JSONArray
    public final boolean optBoolean(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4990e4c8ce1106b329a2444e158166", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4990e4c8ce1106b329a2444e158166")).booleanValue() : optBoolean(i, false);
    }

    @Override // org.json.JSONArray
    public final boolean optBoolean(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a568b1895b391b644c3a2de772b4718d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a568b1895b391b644c3a2de772b4718d")).booleanValue();
        }
        Boolean a2 = b.a(opt(i));
        return a2 != null ? a2.booleanValue() : z;
    }

    @Override // org.json.JSONArray
    public final double getDouble(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c0dba54e9b8a2b84e58fa386bd848f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c0dba54e9b8a2b84e58fa386bd848f")).doubleValue();
        }
        Object obj = get(i);
        Double b = b.b(obj);
        if (b == null) {
            throw b.a(Integer.valueOf(i), obj, Constants.DOUBLE);
        }
        return b.doubleValue();
    }

    @Override // org.json.JSONArray
    public final double optDouble(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82aded78e73e57f29162b16f4dce1a24", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82aded78e73e57f29162b16f4dce1a24")).doubleValue() : optDouble(i, 0.0d);
    }

    @Override // org.json.JSONArray
    public final double optDouble(int i, double d) {
        Object[] objArr = {Integer.valueOf(i), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c53c7f1b8579418a5be83d7edd28b07", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c53c7f1b8579418a5be83d7edd28b07")).doubleValue();
        }
        Double b = b.b(opt(i));
        return b != null ? b.doubleValue() : d;
    }

    @Override // org.json.JSONArray
    public final int getInt(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1159b4979dcf142e7c497095b421908", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1159b4979dcf142e7c497095b421908")).intValue();
        }
        Object obj = get(i);
        Integer c = b.c(obj);
        if (c == null) {
            throw b.a(Integer.valueOf(i), obj, "int");
        }
        return c.intValue();
    }

    @Override // org.json.JSONArray
    public final int optInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a01f13e108e006bca3b48b383c1b1d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a01f13e108e006bca3b48b383c1b1d")).intValue() : optInt(i, 0);
    }

    @Override // org.json.JSONArray
    public final int optInt(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ae571e7c649c102335a230fc75bacc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ae571e7c649c102335a230fc75bacc")).intValue();
        }
        Integer c = b.c(opt(i));
        return c != null ? c.intValue() : i2;
    }

    @Override // org.json.JSONArray
    public final long getLong(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8092a3021fdd800295a33db3ca24be7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8092a3021fdd800295a33db3ca24be7")).longValue();
        }
        Object obj = get(i);
        Long d = b.d(obj);
        if (d == null) {
            throw b.a(Integer.valueOf(i), obj, Constants.LONG);
        }
        return d.longValue();
    }

    @Override // org.json.JSONArray
    public final long optLong(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a38027a8c8400030a7fafd231bdcfc3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a38027a8c8400030a7fafd231bdcfc3")).longValue() : optLong(i, 0L);
    }

    @Override // org.json.JSONArray
    public final long optLong(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d803052a9cb3d3278b2ade6e594d3364", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d803052a9cb3d3278b2ade6e594d3364")).longValue();
        }
        Long d = b.d(opt(i));
        return d != null ? d.longValue() : j;
    }

    @Override // org.json.JSONArray
    public final String getString(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76769387071cfc0dd4011c04a48437ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76769387071cfc0dd4011c04a48437ed");
        }
        Object obj = get(i);
        String e = b.e(obj);
        if (e != null) {
            return e;
        }
        throw b.a(Integer.valueOf(i), obj, "String");
    }

    @Override // org.json.JSONArray
    public final String optString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b127c709da7f316a8ac060fc27c6fa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b127c709da7f316a8ac060fc27c6fa") : optString(i, "");
    }

    @Override // org.json.JSONArray
    public final String optString(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f362ca678afab4bc591ec7f3880414d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f362ca678afab4bc591ec7f3880414d1");
        }
        String e = b.e(opt(i));
        return e != null ? e : str;
    }

    @Override // org.json.JSONArray
    public final JSONArray getJSONArray(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b810a36963b34c891eeb8bed45b522", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b810a36963b34c891eeb8bed45b522");
        }
        Object obj = get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw b.a(Integer.valueOf(i), obj, "JSONArray");
    }

    @Override // org.json.JSONArray
    public final JSONArray optJSONArray(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934e9524a4fc722e3c3907db889e4a70", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934e9524a4fc722e3c3907db889e4a70");
        }
        Object opt = opt(i);
        if (opt instanceof JSONArray) {
            return (a) opt;
        }
        return null;
    }

    @Override // org.json.JSONArray
    public final JSONObject getJSONObject(int i) throws JSONException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b691d3c982b09570fc6c9e707f9c5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b691d3c982b09570fc6c9e707f9c5b");
        }
        Object obj = get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw b.a(Integer.valueOf(i), obj, "JSONObject");
    }

    @Override // org.json.JSONArray
    public final JSONObject optJSONObject(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c680de34bd66dd126b6404b40038fe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c680de34bd66dd126b6404b40038fe3");
        }
        Object opt = opt(i);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    @Override // org.json.JSONArray
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede75cecd5f669805c6b5bd64b0de197", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede75cecd5f669805c6b5bd64b0de197");
        }
        if (this.b == null) {
            return super.toString();
        }
        return this.b.toString();
    }
}
