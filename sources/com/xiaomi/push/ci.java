package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public final class ci {
    static String b = "/MiPushLog";
    String c;
    String d;
    private boolean f;
    private int g;
    @SuppressLint({"SimpleDateFormat"})
    final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    int e = 2097152;
    private ArrayList<File> h = new ArrayList<>();

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.c.length() + start);
                if (this.f) {
                    if (substring.compareTo(this.d) > 0) {
                        read = start;
                        z = true;
                        break;
                    }
                } else if (substring.compareTo(this.c) >= 0) {
                    this.f = true;
                    i2 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.c.length();
                }
                i = start + indexOf;
            }
            if (this.f) {
                int i3 = read - i2;
                this.g += i3;
                if (z) {
                    bufferedWriter.write(cArr, i2, i3);
                    return;
                }
                bufferedWriter.write(cArr, i2, i3);
                if (this.g > this.e) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ci a(File file) {
        if (file.exists()) {
            this.h.add(file);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(File file) {
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        Pattern compile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            } catch (Throwable th) {
                th = th;
                bufferedWriter = null;
            }
        } catch (FileNotFoundException e) {
            e = e;
            bufferedReader = null;
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = null;
        }
        try {
            bufferedWriter.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + com.xiaomi.push.service.av.e() + "; lng :" + Locale.getDefault().toString() + "; sdk :47; andver :" + Build.VERSION.SDK_INT + "\n");
            this.g = 0;
            Iterator<File> it = this.h.iterator();
            while (it.hasNext()) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                try {
                    a(bufferedReader, bufferedWriter, compile);
                    bufferedReader.close();
                    bufferedReader2 = bufferedReader;
                } catch (FileNotFoundException e3) {
                    e = e3;
                    bufferedReader2 = bufferedWriter;
                    com.xiaomi.channel.commonutils.logger.c.c("LOG: filter error = " + e.getMessage());
                    b.a(bufferedReader2);
                    b.a(bufferedReader);
                    return;
                } catch (IOException e4) {
                    e = e4;
                    bufferedReader2 = bufferedWriter;
                    com.xiaomi.channel.commonutils.logger.c.c("LOG: filter error = " + e.getMessage());
                    b.a(bufferedReader2);
                    b.a(bufferedReader);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    b.a(bufferedWriter);
                    b.a(bufferedReader2);
                    throw th;
                }
            }
            bufferedWriter.write(by.a().d());
            b.a(bufferedWriter);
            b.a(bufferedReader2);
        } catch (FileNotFoundException e5) {
            e = e5;
            bufferedReader = bufferedReader2;
        } catch (IOException e6) {
            e = e6;
            bufferedReader = bufferedReader2;
        } catch (Throwable th4) {
            th = th4;
            b.a(bufferedWriter);
            b.a(bufferedReader2);
            throw th;
        }
    }
}
