package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.os.AsyncTask;
import java.io.Closeable;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d extends AsyncTask<Context, Integer, Boolean> {
    private static final String a = "d";

    private static Boolean a(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = a.a(contextArr[0]);
        } catch (Exception e) {
            String str = a;
            f.a(str, "doInBackground: exception : " + e.getMessage());
            inputStream = null;
        }
        StringBuilder sb = new StringBuilder("doInBackground: get bks from hms tss cost : ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
        if (inputStream == null) {
            return Boolean.FALSE;
        }
        e.a((Closeable) inputStream);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ Boolean doInBackground(Context[] contextArr) {
        return a(contextArr);
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(Boolean bool) {
        if (!bool.booleanValue()) {
            f.a(a, "onPostExecute: upate failed");
        } else {
            f.a(a);
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        f.a(a);
    }
}
