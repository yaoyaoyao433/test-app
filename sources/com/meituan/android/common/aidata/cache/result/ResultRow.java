package com.meituan.android.common.aidata.cache.result;

import android.database.CursorIndexOutOfBoundsException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResultRow {
    public static final int FIELD_TYPE_BLOB = 31;
    public static final int FIELD_TYPE_DOUBLE = 11;
    public static final int FIELD_TYPE_FLOAT = 10;
    public static final int FIELD_TYPE_INT = 1;
    public static final int FIELD_TYPE_LONG = 2;
    public static final int FIELD_TYPE_NULL = 0;
    public static final int FIELD_TYPE_STRING = 21;
    private static final String TAG = "ResultRow";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int columnCount;
    private String[] columnNames;
    private Object[] data;

    public ResultRow(String[] strArr, Object[] objArr, int i) {
        Object[] objArr2 = {strArr, objArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e09994261bd7b06a7e6865a8c88b213", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e09994261bd7b06a7e6865a8c88b213");
            return;
        }
        this.columnCount = i;
        this.columnNames = strArr;
        this.data = objArr;
    }

    @NonNull
    public ResultColumnValue getValueAtIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0282d63400e22e768ce74173a62a5e0d", RobustBitConfig.DEFAULT_VALUE) ? (ResultColumnValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0282d63400e22e768ce74173a62a5e0d") : new ResultColumnValue(get(i));
    }

    @NonNull
    public ResultColumnValue getValueByName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e8428b8c30a4d7aca14f7a095aa6d8", RobustBitConfig.DEFAULT_VALUE) ? (ResultColumnValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e8428b8c30a4d7aca14f7a095aa6d8") : new ResultColumnValue(get(getColumnIndex(str)));
    }

    public int getType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc9b59dd3105f0a78164cb63787e53cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc9b59dd3105f0a78164cb63787e53cf")).intValue();
        }
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Float) {
            return 10;
        }
        if (obj instanceof Double) {
            return 11;
        }
        if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return 1;
        }
        return obj instanceof Long ? 2 : 21;
    }

    public int getType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f7c35e7b0764b08d7324207c53b88a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f7c35e7b0764b08d7324207c53b88a0")).intValue() : getType(getColumnIndex(str));
    }

    public int getColumnIndex(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e76871c762b7ed28d345a5c10480f43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e76871c762b7ed28d345a5c10480f43")).intValue();
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.e(TAG, "requesting column name with table name -- " + str, exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int i = this.columnCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (columnNames[i2].equalsIgnoreCase(str)) {
                return i2;
            }
        }
        return -1;
    }

    private Object get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07af13eca573742033a944c8f9bf3731", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07af13eca573742033a944c8f9bf3731");
        }
        if (i < 0 || i >= this.columnCount) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + i + ", # of columns: " + this.columnCount);
        }
        return this.data[i];
    }

    public String getColumnName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "181a5d13d775460e2ecc13c276a2b98e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "181a5d13d775460e2ecc13c276a2b98e") : getColumnNames()[i];
    }

    private String[] getColumnNames() {
        return this.columnNames;
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    private byte[] getBlob(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaa185de5fa6f6f82e1030ed80e12262", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaa185de5fa6f6f82e1030ed80e12262") : (byte[]) get(i);
    }

    private String getString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6fc47a0495cfb8087ceaefa0a94953d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6fc47a0495cfb8087ceaefa0a94953d");
        }
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private short getShort(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9d00b4393cfd73c06651b897d63ab1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9d00b4393cfd73c06651b897d63ab1")).shortValue();
        }
        Object obj = get(i);
        if (obj == null) {
            return (short) 0;
        }
        return obj instanceof Number ? ((Number) obj).shortValue() : Short.parseShort(obj.toString());
    }

    private int getInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8648a4471249df188cabe9bb6a93798a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8648a4471249df188cabe9bb6a93798a")).intValue();
        }
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt(obj.toString());
    }

    private long getLong(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d190d2d46c4c282c3569a270b3d6e1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d190d2d46c4c282c3569a270b3d6e1d")).longValue();
        }
        Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong(obj.toString());
    }

    private float getFloat(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6e341fb8e40e79c0e20d2bf417e9ae8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6e341fb8e40e79c0e20d2bf417e9ae8")).floatValue();
        }
        Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    private double getDouble(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bb0937c046bd672495b367c654fa025", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bb0937c046bd672495b367c654fa025")).doubleValue();
        }
        Object obj = get(i);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(obj.toString());
    }

    private boolean isNull(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7da16bb1ae652a8c46ab3a919308e1d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7da16bb1ae652a8c46ab3a919308e1d")).booleanValue() : get(i) == null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class RowBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int colCount;
        private String[] columnNames;
        private Object[] data;
        private int initialCapacity;
        private int row;

        public RowBuilder(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cbf60d9fd290fd6707f68f56e10f2db", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cbf60d9fd290fd6707f68f56e10f2db");
                return;
            }
            this.initialCapacity = 16;
            this.colCount = 0;
            this.row = i;
            this.columnNames = new String[this.initialCapacity];
            this.data = new Object[this.initialCapacity];
        }

        public RowBuilder add(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0993efdeb5512c36a4bbcaac1ee4ba44", RobustBitConfig.DEFAULT_VALUE)) {
                return (RowBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0993efdeb5512c36a4bbcaac1ee4ba44");
            }
            ensureCapacity(this.colCount + 1);
            this.columnNames[this.colCount] = str;
            this.data[this.colCount] = obj;
            this.colCount++;
            return this;
        }

        public ResultRow build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82465885e6031c5e7b4154167723e1ac", RobustBitConfig.DEFAULT_VALUE) ? (ResultRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82465885e6031c5e7b4154167723e1ac") : new ResultRow(this.columnNames, this.data, this.colCount);
        }

        private void ensureCapacity(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7416e9b039f1003b099a05dd0901a45a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7416e9b039f1003b099a05dd0901a45a");
            } else if (i > this.data.length) {
                int length = this.data.length * 2;
                if (length >= i) {
                    i = length;
                }
                String[] strArr = this.columnNames;
                this.columnNames = new String[i];
                System.arraycopy(strArr, 0, this.columnNames, 0, strArr.length);
                Object[] objArr2 = this.data;
                this.data = new Object[i];
                System.arraycopy(objArr2, 0, this.data, 0, objArr2.length);
            }
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1317de205859fb754b04f79de87df9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1317de205859fb754b04f79de87df9e");
        }
        StringBuilder sb = new StringBuilder();
        if (this.columnCount > 0) {
            for (int i = 0; i < sb.length(); i++) {
                sb.append(" colName:" + this.columnNames[i] + "colvalue:" + this.data[i]);
            }
            return sb.toString();
        }
        return "";
    }

    public JSONObject toJSONObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00e8f197f8584ea7294b8b3689002b35", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00e8f197f8584ea7294b8b3689002b35");
        }
        JSONObject jSONObject = null;
        if (this.columnNames != null && this.columnNames.length > 0 && this.data != null && this.data.length > 0) {
            jSONObject = new JSONObject();
            for (int i = 0; i < this.columnNames.length && i < this.data.length; i++) {
                Object obj = this.data[i];
                try {
                    if (obj instanceof String) {
                        String trim = ((String) obj).trim();
                        if (!TextUtils.isEmpty(trim)) {
                            Object nextValue = new JSONTokener(trim).nextValue();
                            if ((nextValue instanceof JSONObject) || (nextValue instanceof JSONArray)) {
                                obj = nextValue;
                            }
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    jSONObject.put(this.columnNames[i], obj);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public Map<String, Object> toMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a05a1ceb9836f777b56c295ec0ba15f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a05a1ceb9836f777b56c295ec0ba15f");
        }
        HashMap hashMap = null;
        if (this.columnNames != null && this.columnNames.length > 0 && this.data != null && this.data.length > 0) {
            hashMap = new HashMap();
            for (int i = 0; i < this.columnNames.length && i < this.data.length; i++) {
                String str = this.columnNames[i];
                Object obj = this.data[i];
                if (str != null && obj != null) {
                    if (obj instanceof String) {
                        String trim = ((String) obj).trim();
                        if (!TextUtils.isEmpty(trim)) {
                            try {
                                Object nextValue = new JSONTokener(trim).nextValue();
                                if ((nextValue instanceof JSONObject) || (nextValue instanceof JSONArray)) {
                                    obj = nextValue;
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    hashMap.put(str, obj);
                }
            }
        }
        return hashMap;
    }
}
