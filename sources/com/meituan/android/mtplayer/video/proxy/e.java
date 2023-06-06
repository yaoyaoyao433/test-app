package com.meituan.android.mtplayer.video.proxy;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Pattern f = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    private static final Pattern g = Pattern.compile("GET /(.*) HTTP");
    private static final Pattern h = Pattern.compile("[^=]*=(.*)");
    public final String b;
    public final long c;
    public final boolean d;
    public final String e;

    private e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2b6987075f22d54ef17d91c410f4f76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2b6987075f22d54ef17d91c410f4f76");
            return;
        }
        n.a(str);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        long j = -1;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4d87b7f9eda43493c662a69009eec95", RobustBitConfig.DEFAULT_VALUE)) {
            j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4d87b7f9eda43493c662a69009eec95")).longValue();
        } else {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                j = NumberUtils.parseLong(matcher.group(1), -1L);
            }
        }
        this.c = Math.max(0L, j);
        this.d = j >= 0;
        Matcher matcher2 = g.matcher(str);
        if (matcher2.find()) {
            String group = matcher2.group(1);
            String[] split = group.split("&");
            if (split.length > 1) {
                String str2 = split[split.length - 1];
                if (str2 != null && str2.contains("cachepath")) {
                    this.b = a(group.substring(0, group.lastIndexOf("&")));
                    this.e = a(str2);
                    return;
                }
                this.b = a(group);
                this.e = "";
                return;
            }
            this.b = a(split[0]);
            this.e = "";
            return;
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public static e a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "461ca0087604ee85c6ae2c1452d3358b", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "461ca0087604ee85c6ae2c1452d3358b");
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                sb.append(readLine);
                sb.append('\n');
            } else {
                return new e(sb.toString());
            }
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2f6125fe7e80e5b0accd9e78c24465", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2f6125fe7e80e5b0accd9e78c24465");
        }
        Matcher matcher = h.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3326a6947bd073d3ad2ad7101aa20562", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3326a6947bd073d3ad2ad7101aa20562");
        }
        return "GetRequest{rangeOffset=" + this.c + ", partial=" + this.d + ", uri='" + this.b + "'}";
    }
}
