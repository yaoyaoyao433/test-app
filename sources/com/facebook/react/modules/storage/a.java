package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, CommonConstant.Symbol.QUESTION_MARK);
        return "key IN (" + TextUtils.join(", ", strArr) + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] a(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    @Nullable
    public static String a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                return query.getString(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject != null && optJSONObject2 != null) {
                a(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            } else {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
    }
}
