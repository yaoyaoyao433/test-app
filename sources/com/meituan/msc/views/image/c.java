package com.meituan.msc.views.image;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Pattern m = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    public Uri b;
    public double c;
    public double d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public byte[] j;
    public String k;
    public IFileModule l;
    private Context n;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5f842a944d46a58abc86135ffc4846", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5f842a944d46a58abc86135ffc4846");
        } else {
            this.n = context;
        }
    }

    public final void a(@Nullable String str) {
        String substring;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ce68f29966040bd4e6e0ed27f41e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ce68f29966040bd4e6e0ed27f41e75");
            return;
        }
        this.k = str;
        this.i = false;
        if (str == null) {
            this.b = null;
            return;
        }
        Uri e = e(str);
        String scheme = e == null ? null : e.getScheme();
        if (e == null || scheme == null) {
            this.h = true;
            this.e = d(str);
        } else if (TextUtils.equals(scheme, "data")) {
            Matcher matcher = m.matcher(str);
            if (matcher == null || !matcher.find() || TextUtils.isEmpty(matcher.group(1))) {
                return;
            }
            this.j = Base64.decode(matcher.group(1), 0);
        } else if (com.meituan.msc.utils.a.a(e)) {
            this.i = true;
            this.b = Uri.parse(str);
        } else if (this.l != null && this.l.c(scheme)) {
            this.i = true;
            substring = this.l != null ? this.l.a(e.toString()) : null;
            if (!TextUtils.isEmpty(substring)) {
                this.b = Uri.parse(substring);
                return;
            }
            g.a("[ImageSource@setSource]", "file path should not be null!" + e);
        } else if (TextUtils.equals(scheme, "file")) {
            substring = str.length() > 7 ? str.substring(7) : null;
            if (substring != null) {
                File file = new File(substring);
                if (!file.exists()) {
                    String name = file.getName();
                    int lastIndexOf = name.lastIndexOf(CommonConstant.Symbol.DOT);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    this.h = true;
                    this.e = d(name);
                    return;
                }
                this.b = e;
            }
        } else {
            this.b = e;
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda247097cf8a4accb458e43949bf26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda247097cf8a4accb458e43949bf26e");
        } else {
            this.f = d(str);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b91d72eae2302adf57a9fd45cae1b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b91d72eae2302adf57a9fd45cae1b0");
        } else {
            this.g = d(str);
        }
    }

    private Uri e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5ba0c876b36a1da1de39b0ea342bb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5ba0c876b36a1da1de39b0ea342bb2");
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e30ab07487e422388eb6bb4f7d1e62", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e30ab07487e422388eb6bb4f7d1e62")).intValue() : com.meituan.msc.views.imagehelper.b.a().a(this.n, str);
    }
}
