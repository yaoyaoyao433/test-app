package com.huawei.agconnect.config.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class g implements c {
    private final Context a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // com.huawei.agconnect.config.a.c
    public String a(String str, String str2) {
        int identifier;
        String a = a(str);
        if (TextUtils.isEmpty(a) || (identifier = this.a.getResources().getIdentifier(a, "string", this.b)) == 0) {
            return str2;
        }
        try {
            return this.a.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return str2;
        }
    }

    private static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("agc_");
            sb.append(d.a(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"))));
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            return "";
        }
    }
}
