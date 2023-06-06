package com.huawei.agconnect.config.a;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements c {
    private final JSONObject a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(InputStream inputStream) {
        this.a = a(inputStream);
    }

    @Override // com.huawei.agconnect.config.a.c
    public final String a(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] split = str.split("/");
        try {
            JSONObject jSONObject = this.a;
            for (int i = 1; i < split.length; i++) {
                if (i == split.length - 1) {
                    return jSONObject.get(split[i]).toString();
                }
                jSONObject = jSONObject.getJSONObject(split[i]);
            }
        } catch (JSONException unused) {
            new StringBuilder("JSONException when reading 'path': ").append(str);
        }
        return str2;
    }

    private static JSONObject a(InputStream inputStream) {
        String str;
        String str2;
        if (inputStream != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                i.a(new InputStreamReader(inputStream, "UTF-8"), stringWriter, new char[4096]);
                return new JSONObject(stringWriter.toString());
            } catch (IOException unused) {
                str = "InputStreamReader";
                str2 = "IOException when reading the 'Config' from InputStream.";
                Log.e(str, str2);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "InputStreamReader";
                str2 = "JSONException when reading the 'Config' from InputStream.";
                Log.e(str, str2);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }
}
