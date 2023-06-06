package com.tencent.mapsdk.internal;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends f {
    private static final long k = 1;

    public d() {
        this.g.a = (short) 2;
        this.g.b = (byte) 0;
        this.g.c = 0;
        this.g.h = 0;
        this.g.g = new byte[0];
        this.g.i = new HashMap();
        this.g.j = new HashMap();
    }

    private void a(short s) {
        this.g.a = s;
        if (s == 3) {
            g();
        }
    }

    private void a(byte b) {
        this.g.b = b;
    }

    private void a(int i) {
        this.g.c = i;
    }

    private void b(int i) {
        this.g.h = i;
    }

    private void d(byte[] bArr) {
        this.g.g = bArr;
    }

    private void a(Map<String, String> map) {
        this.g.i = map;
    }

    private void b(Map<String, String> map) {
        this.g.j = map;
    }

    private short h() {
        return this.g.a;
    }

    private byte i() {
        return this.g.b;
    }

    private int j() {
        return this.g.c;
    }

    private int k() {
        return this.g.h;
    }

    private byte[] l() {
        return this.g.g;
    }

    private Map<String, String> m() {
        return this.g.i;
    }

    private Map<String, String> n() {
        return this.g.j;
    }

    private int o() {
        String str = this.g.j.get("STATUS_RESULT_CODE");
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    private String p() {
        String str = this.g.j.get("STATUS_RESULT_DESC");
        return str != null ? str : "";
    }
}
