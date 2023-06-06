package com.sankuai.meituan.location.collector.provider;
/* loaded from: classes4.dex */
public class e {
    public byte a;

    /* loaded from: classes4.dex */
    public static class a extends c {
    }

    /* loaded from: classes4.dex */
    public static class b extends e {
        public String b;
        public int c;
        public int d;
        public byte e;
        public byte f;
        public short g;
        public byte[] h;

        public b() {
            super(0);
            this.h = new byte[6];
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends e {
        public byte b;
        public byte[] c;

        public c() {
            super(1);
            this.c = new byte[6];
            this.b = (byte) 1;
        }
    }

    public e(int i) {
        this.a = (byte) 0;
        this.a = (byte) i;
    }
}
