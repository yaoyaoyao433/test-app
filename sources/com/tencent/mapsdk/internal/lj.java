package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lj {
    private List<String> a = new ArrayList();
    private List<String> b = new ArrayList();
    private final int c = 300;

    public final synchronized boolean a(String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                return !this.b.contains(str);
            }
        }
        return false;
    }

    private static void a(List<String> list) {
        if (list != null && list.size() > 300) {
            list.remove(0);
        }
    }

    public final synchronized void b(String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                if (this.b.contains(str)) {
                    this.b.remove(str);
                    this.b.add(str);
                } else if (this.a.contains(str)) {
                    a(this.b);
                    this.b.add(str);
                    this.a.remove(str);
                } else {
                    a(this.a);
                    this.a.add(str);
                }
            }
        }
    }

    private synchronized void a() {
        this.a.clear();
        this.b.clear();
    }
}
