package com.unionpay.mobile.android.pboctransaction.sdapdu;

import com.meituan.robust.common.StringUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class b {
    public static String[] a;
    public static int b;
    private static ArrayList<String> c = new ArrayList<>();

    public static void a() {
        HashSet<String> b2 = b();
        a = new String[b2.size()];
        b2.toArray(a);
    }

    private static HashSet<String> b() {
        String[] split;
        String[] split2;
        byte[] bArr;
        HashSet<String> hashSet = new HashSet<>();
        String str = "";
        try {
            Process start = new ProcessBuilder(new String[0]).command("mount").redirectErrorStream(true).start();
            start.waitFor();
            InputStream inputStream = start.getInputStream();
            while (inputStream.read(new byte[1024]) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str2 : str.split("\n")) {
            if (!str2.toLowerCase(Locale.US).contains("asec") && str2.matches("(?i).*vold.*(vfat|ntfs|exfat|fat32|ext3|ext4).*rw.*")) {
                for (String str3 : str2.split(StringUtil.SPACE)) {
                    if (str3.startsWith("/") && !str3.toLowerCase(Locale.US).contains("vold")) {
                        hashSet.add(str3);
                    }
                }
            }
        }
        return hashSet;
    }
}
