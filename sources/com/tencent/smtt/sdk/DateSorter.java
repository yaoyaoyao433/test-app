package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;
/* loaded from: classes6.dex */
public class DateSorter {
    public static int DAY_COUNT;
    private android.webkit.DateSorter a;
    private IX5DateSorter b;

    static {
        a();
        DAY_COUNT = 5;
    }

    public DateSorter(Context context) {
        x a = x.a();
        if (a == null || !a.b()) {
            this.a = new android.webkit.DateSorter(context);
        } else {
            this.b = a.c().h(context);
        }
    }

    private static boolean a() {
        x a = x.a();
        return a != null && a.b();
    }

    public long getBoundary(int i) {
        x a = x.a();
        return (a == null || !a.b()) ? this.a.getBoundary(i) : this.b.getBoundary(i);
    }

    public int getIndex(long j) {
        x a = x.a();
        return (a == null || !a.b()) ? this.a.getIndex(j) : this.b.getIndex(j);
    }

    public String getLabel(int i) {
        x a = x.a();
        return (a == null || !a.b()) ? this.a.getLabel(i) : this.b.getLabel(i);
    }
}
