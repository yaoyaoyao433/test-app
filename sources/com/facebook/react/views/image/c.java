package com.facebook.react.views.image;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    private static final Pattern l = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    public Uri a;
    public double b;
    public double c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public byte[] i;
    public String j;
    String k;
    private Context m;

    public c(Context context) {
        this.m = context;
    }

    public final void a(String str) {
        this.j = str;
        this.h = false;
        Uri d = d(str);
        if (d == null || d.getScheme() == null) {
            this.g = true;
            this.d = e(str);
        } else if (TextUtils.equals(d.getScheme(), "data")) {
            Matcher matcher = l.matcher(str);
            if (matcher == null || !matcher.find() || TextUtils.isEmpty(matcher.group(1))) {
                return;
            }
            this.i = Base64.decode(matcher.group(1), 0);
        } else if (LocalIdUtils.isValid(str)) {
            if (TextUtils.isEmpty(this.k)) {
                try {
                    Uri parse = Uri.parse(str);
                    if (parse != null) {
                        this.k = parse.getQueryParameter("sceneToken");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.a = a(str, this.k);
        } else if (com.meituan.android.mrn.util.b.a(d)) {
            this.h = true;
            this.a = Uri.parse(str);
        } else if (TextUtils.equals(d.getScheme(), "file")) {
            File file = new File(str.length() > 7 ? str.substring(7) : null);
            if (!file.exists()) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(CommonConstant.Symbol.DOT);
                if (lastIndexOf != -1) {
                    name = name.substring(0, lastIndexOf);
                }
                this.g = true;
                this.d = e(name);
                return;
            }
            this.a = d;
        } else {
            this.a = d;
        }
    }

    public final void b(String str) {
        this.e = e(str);
    }

    public final void c(String str) {
        this.f = e(str);
    }

    public final void a() {
        this.a = null;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 0;
        this.g = false;
        this.i = null;
        this.j = null;
    }

    private static Uri d(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private int e(String str) {
        return com.facebook.react.views.imagehelper.a.a().a(this.m, str);
    }

    private static Uri a(String str, String str2) {
        File file = LocalIdUtils.getFile(str, str2);
        if (file != null && file.exists() && file.isFile()) {
            return Uri.fromFile(file);
        }
        return null;
    }
}
